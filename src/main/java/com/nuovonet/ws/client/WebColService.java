package com.nuovonet.ws.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.axis2.client.ServiceClient;
import org.w3c.dom.NodeList;

import com.nuovonet.ws.GrupoToniatoSkeleton;
import com.nuovonet.ws.GrupoToniatoStub;

import br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument;
import br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument;
import br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument;
import br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus;
import br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument;
import br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse;
import br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult;
import br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReport;
import br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray;

public class WebColService extends GrupoToniatoSkeleton {

	private String url;
	private String token;

	public WebColService(String url, String token) {
		super();
		this.url = url;
		this.token = token;
	}

	public WebColService() {
		super();
		this.url = "";
		this.token = "";
	}

	public AdicionaStatusDocument montaDados(String xml) {

		AdicionaStatusDocument request = AdicionaStatusDocument.Factory.newInstance();
		AdicionaStatus status = request.addNewAdicionaStatus();

		status.setXml(xml);
		status.setHash(token);

		return request;
	}

	public RetornoTratado trataRetorno(AdicionaStatusResponseDocument response) {

		RetornoTratado toReturn = new RetornoTratado();
		AdicionaStatusResponse retorno = response.getAdicionaStatusResponse();
		StatusResult result = retorno.getReturn();
		toReturn.setResult(String.valueOf(result.getAdicionaStatusResult()));
		toReturn.setError(result.getAdicionaStatusError());

//		System.out.println("retorno> " + toReturn.getResult() + ":" + toReturn.getError());
//		System.out.println(result.xmlText());

		StatusResultReportArray reports = result.getAdicionaStatusReport();
		
		try {
			Map<Integer, String> report = new HashMap<Integer, String>();
			org.w3c.dom.Node node = reports.getDomNode();
			NodeList listNodes = node.getChildNodes();
			for(int i=0;i<listNodes.getLength();i++) {
				org.w3c.dom.Node inner = listNodes.item(i);
				
//				System.out.println("item: " + i + ": " + inner.getLocalName());
				
				if(inner.getNodeName().equals("item")) {
					NodeList listNodesj = inner.getChildNodes();
					
					if(listNodesj.getLength() > 1) {
						org.w3c.dom.Node nota = listNodesj.item(0);
						org.w3c.dom.Node msg = listNodesj.item(1);

						StatusResultReport notaRes = StatusResultReport.Factory.parse(nota);
						StatusResultReport msgRes = StatusResultReport.Factory.parse(msg);
						if(notaRes != null && msgRes != null) {
//							System.out.println("nota: " + notaRes.getNota());
//							System.out.println("msg: " + msgRes.getMsg());
							report.put(notaRes.getNota(), msgRes.getMsg());
						}
					}
				}
				
			}
			
			toReturn.setReport(report);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro: " + e.getMessage());
		}
		System.out.println(" ---------------------------------------------------------- ");
		return toReturn;
	}

	@Override
	public AdicionaStatusResponseDocument adicionaStatus(AdicionaStatusDocument adicionaStatus) throws Exception {

		GrupoToniatoStub stub = new GrupoToniatoStub(url);

		ServiceClient client = stub._getServiceClient();
		// Se precisar de proxy
		// if (getProxyHost() != null) {
		// Options options = montarProxy(client.getOptions());
		// client.setOptions(options);
		// }
		AdicionaStatusResponseDocument response = stub.adicionaStatus(adicionaStatus);

		return response;
	}

	@Override
	public AdicionaStatusCDResponseDocument adicionaStatusCD(AdicionaStatusCDDocument adicionaStatusCD)
			throws Exception {

		GrupoToniatoStub stub = new GrupoToniatoStub(url);

		ServiceClient client = stub._getServiceClient();
		// Se precisar de proxy
		// if (getProxyHost() != null) {
		// Options options = montarProxy(client.getOptions());
		// client.setOptions(options);
		// }
		AdicionaStatusCDResponseDocument response = stub.adicionaStatusCD(adicionaStatusCD);

		return response;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
