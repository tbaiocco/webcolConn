package com.nuovonet.ws.client;

import java.util.List;

public class XMLUtil {
	
	public static String retornaXML(List<String> interno) {
		
		String xml = "";
		xml += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
		xml += "<notasfiscais>";
		for(String in : interno) {
			xml += in;
		}
		xml += "</notasfiscais>";
		return xml;
	}
	
	public static String montaInteriorXML(String dthratualizacao, String codigoocorrencia, String longitude,
			String latitude, String localizacao, String dataentrega, String dataprevisaoentrega, String numerofiscal,
			String cnpjremetente, String cnpjtransportador) {
		
		String xml = "<notafiscal ";
		xml += "dthratualizacao=\"" + dthratualizacao.trim() + "\" ";
		xml += "codigoocorrencia=\"" + codigoocorrencia.trim() + "\" ";
		xml += "longitude=\"" + longitude + "\" ";
		xml += "latitude=\"" + latitude + "\" ";
		xml += "localizacao=\"" + localizacao + "\" ";
		xml += "dataentrega=\"" + dataentrega.trim() + "\" ";
		xml += "dataprevisaoentrega=\"" + dataprevisaoentrega.trim() + "\" ";
		xml += "numerofiscal=\"" + numerofiscal.trim() + "\" ";
		xml += "cnpjremetente=\"" + cnpjremetente.trim() + "\" ";
		xml += "cnpjtransportador=\"" + cnpjtransportador.trim() + "\"/>";
		return xml;
	}
	
	

}
