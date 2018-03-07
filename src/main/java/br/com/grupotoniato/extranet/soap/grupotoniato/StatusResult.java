/*
 * XML Type:  StatusResult
 * Namespace: http://extranet.grupotoniato.com.br/soap/GrupoToniato
 * Java type: br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.soap.grupotoniato;


/**
 * An XML StatusResult(@http://extranet.grupotoniato.com.br/soap/GrupoToniato).
 *
 * This is a complex type.
 */
public interface StatusResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD191999DE5B384C61C9E1406BA2C2B12").resolveHandle("statusresult4589type");
    
    /**
     * Gets the "AdicionaStatusResult" element
     */
    int getAdicionaStatusResult();
    
    /**
     * Gets (as xml) the "AdicionaStatusResult" element
     */
    org.apache.xmlbeans.XmlInt xgetAdicionaStatusResult();
    
    /**
     * Sets the "AdicionaStatusResult" element
     */
    void setAdicionaStatusResult(int adicionaStatusResult);
    
    /**
     * Sets (as xml) the "AdicionaStatusResult" element
     */
    void xsetAdicionaStatusResult(org.apache.xmlbeans.XmlInt adicionaStatusResult);
    
    /**
     * Gets the "AdicionaStatusError" element
     */
    java.lang.String getAdicionaStatusError();
    
    /**
     * Gets (as xml) the "AdicionaStatusError" element
     */
    org.apache.xmlbeans.XmlString xgetAdicionaStatusError();
    
    /**
     * Sets the "AdicionaStatusError" element
     */
    void setAdicionaStatusError(java.lang.String adicionaStatusError);
    
    /**
     * Sets (as xml) the "AdicionaStatusError" element
     */
    void xsetAdicionaStatusError(org.apache.xmlbeans.XmlString adicionaStatusError);
    
    /**
     * Gets the "AdicionaStatusReport" element
     */
    br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray getAdicionaStatusReport();
    
    /**
     * Sets the "AdicionaStatusReport" element
     */
    void setAdicionaStatusReport(br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray adicionaStatusReport);
    
    /**
     * Appends and returns a new empty "AdicionaStatusReport" element
     */
    br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray addNewAdicionaStatusReport();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult newInstance() {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
