/*
 * An XML document type.
 * Localname: AdicionaStatusCD
 * Namespace: http://extranet.grupotoniato.com.br/server.php
 * Java type: br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.server_php;


/**
 * A document containing one AdicionaStatusCD(@http://extranet.grupotoniato.com.br/server.php) element.
 *
 * This is a complex type.
 */
public interface AdicionaStatusCDDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdicionaStatusCDDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD191999DE5B384C61C9E1406BA2C2B12").resolveHandle("adicionastatuscddf3bdoctype");
    
    /**
     * Gets the "AdicionaStatusCD" element
     */
    br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD getAdicionaStatusCD();
    
    /**
     * Sets the "AdicionaStatusCD" element
     */
    void setAdicionaStatusCD(br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD adicionaStatusCD);
    
    /**
     * Appends and returns a new empty "AdicionaStatusCD" element
     */
    br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD addNewAdicionaStatusCD();
    
    /**
     * An XML AdicionaStatusCD(@http://extranet.grupotoniato.com.br/server.php).
     *
     * This is a complex type.
     */
    public interface AdicionaStatusCD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdicionaStatusCD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD191999DE5B384C61C9E1406BA2C2B12").resolveHandle("adicionastatuscdb800elemtype");
        
        /**
         * Gets the "xml" element
         */
        java.lang.String getXml();
        
        /**
         * Gets (as xml) the "xml" element
         */
        org.apache.xmlbeans.XmlString xgetXml();
        
        /**
         * Tests for nil "xml" element
         */
        boolean isNilXml();
        
        /**
         * Sets the "xml" element
         */
        void setXml(java.lang.String xml);
        
        /**
         * Sets (as xml) the "xml" element
         */
        void xsetXml(org.apache.xmlbeans.XmlString xml);
        
        /**
         * Nils the "xml" element
         */
        void setNilXml();
        
        /**
         * Gets the "hash" element
         */
        java.lang.String getHash();
        
        /**
         * Gets (as xml) the "hash" element
         */
        org.apache.xmlbeans.XmlString xgetHash();
        
        /**
         * Tests for nil "hash" element
         */
        boolean isNilHash();
        
        /**
         * Sets the "hash" element
         */
        void setHash(java.lang.String hash);
        
        /**
         * Sets (as xml) the "hash" element
         */
        void xsetHash(org.apache.xmlbeans.XmlString hash);
        
        /**
         * Nils the "hash" element
         */
        void setNilHash();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD newInstance() {
              return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument.AdicionaStatusCD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument newInstance() {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
