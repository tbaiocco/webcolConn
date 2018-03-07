package com.nuovonet.ws.client;

public class XMLUtil {
	
	public static String retornaXML(String... interno) {
		
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
		xml += "dthratualizacao=\"" + dthratualizacao + "\" ";
		xml += "codigoocorrencia=\"" + codigoocorrencia + "\" ";
		xml += "longitude=\"" + longitude + "\" ";
		xml += "latitude=\"" + latitude + "\" ";
		xml += "localizacao=\"" + localizacao + "\" ";
		xml += "dataentrega=\"" + dataentrega + "\" ";
		xml += "dataprevisaoentrega=\"" + dataprevisaoentrega + "\" ";
		xml += "numerofiscal=\"" + numerofiscal + "\" ";
		xml += "cnpjremetente=\"" + cnpjremetente + "\" ";
		xml += "cnpjtransportador=\"" + cnpjtransportador + "\"/>";
		xml += "/>";
		return xml;
	}
	
	

}
