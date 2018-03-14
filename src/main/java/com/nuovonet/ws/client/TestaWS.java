package com.nuovonet.ws.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map.Entry;

import br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument;

public class TestaWS {

	public static void main(String[] args) {

		try {
		Date dtPos = new Date();
		dtPos = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse("2018-03-13T09:52:07.000-03:00");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		String url = "https://extranet.grupotoniato.com.br/desenvolvimento/public/server.php";
//		String token = "17b301e70b90549a4bb21dda88efe629d11eb205";
//
//		WebColService service = null;
//
//		try {
//			service = new WebColService(url, token);
//			
//			String xml = "";
//			xml += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
//			xml += "<notasfiscais>";
//			xml += "<notafiscal dthratualizacao=\"03/03/2018 08:21\" codigoocorrencia=\"00\" longitude=\"-46.84210\" latitude=\"-23.32610\" localizacao=\"0.97 km de FRIGORÍFICO PRIETO LTDA - CAJAMAR/SP\" dataentrega=\"\" dataprevisaoentrega=\"06/03/2018\" numerofiscal=\"63469\" cnpjremetente=\"61064929007696\" cnpjtransportador=\"87283164000232\"/>";
//			xml += "<notafiscal dthratualizacao=\"03/03/2018 08:21\" codigoocorrencia=\"00\" longitude=\"-46.84210\" latitude=\"-23.32610\" localizacao=\"0.97 km de FRIGORÍFICO PRIETO LTDA - CAJAMAR/SP\" dataentrega=\"\" dataprevisaoentrega=\"06/03/2018\" numerofiscal=\"63470\" cnpjremetente=\"61064929007696\" cnpjtransportador=\"87283164000232\"/>";
//			xml += "<notafiscal dthratualizacao=\"03/03/2018 08:21\" codigoocorrencia=\"00\" longitude=\"-46.84210\" latitude=\"-23.32610\" localizacao=\"0.97 km de FRIGORÍFICO PRIETO LTDA - CAJAMAR/SP\" dataentrega=\"\" dataprevisaoentrega=\"06/03/2018\" numerofiscal=\"63471\" cnpjremetente=\"61064929007696\" cnpjtransportador=\"87283164000232\"/>";
//			xml += "<notafiscal dthratualizacao=\"03/03/2018 08:21\" codigoocorrencia=\"00\" longitude=\"-46.84210\" latitude=\"-23.32610\" localizacao=\"0.97 km de FRIGORÍFICO PRIETO LTDA - CAJAMAR/SP\" dataentrega=\"\" dataprevisaoentrega=\"06/03/2018\" numerofiscal=\"63468\" cnpjremetente=\"61064929007696\" cnpjtransportador=\"87283164000232\"/>";
//			xml += "</notasfiscais>";
//			
//			AdicionaStatusResponseDocument response = service.adicionaStatus(service.montaDados(xml));
//			
//			RetornoTratado retorno = service.trataRetorno(response);
//			
//			System.out.println("retorno> " + retorno.getResult() + ":" + retorno.getError());
//			for(Entry<Integer, String> entry : retorno.getReport().entrySet())
//				System.out.println("detalhes: " + entry.getKey() + ": " + entry.getValue());
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
