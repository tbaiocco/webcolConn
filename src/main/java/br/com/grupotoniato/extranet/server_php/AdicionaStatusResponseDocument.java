/*
 * An XML document type.
 * Localname: AdicionaStatusResponse
 * Namespace: http://extranet.grupotoniato.com.br/server.php
 * Java type: br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.server_php;


/**
 * A document containing one AdicionaStatusResponse(@http://extranet.grupotoniato.com.br/server.php) element.
 *
 * This is a complex type.
 */
public interface AdicionaStatusResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdicionaStatusResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD191999DE5B384C61C9E1406BA2C2B12").resolveHandle("adicionastatusresponseebfbdoctype");
    
    /**
     * Gets the "AdicionaStatusResponse" element
     */
    br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse getAdicionaStatusResponse();
    
    /**
     * Sets the "AdicionaStatusResponse" element
     */
    void setAdicionaStatusResponse(br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse adicionaStatusResponse);
    
    /**
     * Appends and returns a new empty "AdicionaStatusResponse" element
     */
    br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse addNewAdicionaStatusResponse();
    
    /**
     * An XML AdicionaStatusResponse(@http://extranet.grupotoniato.com.br/server.php).
     *
     * This is a complex type.
     */
    public interface AdicionaStatusResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdicionaStatusResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD191999DE5B384C61C9E1406BA2C2B12").resolveHandle("adicionastatusresponse1500elemtype");
        
        /**
         * Gets the "return" element
         */
        br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse newInstance() {
              return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument newInstance() {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
