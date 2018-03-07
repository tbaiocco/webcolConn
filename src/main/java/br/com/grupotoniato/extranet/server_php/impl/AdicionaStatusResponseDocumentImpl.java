/*
 * An XML document type.
 * Localname: AdicionaStatusResponse
 * Namespace: http://extranet.grupotoniato.com.br/server.php
 * Java type: br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.server_php.impl;
/**
 * A document containing one AdicionaStatusResponse(@http://extranet.grupotoniato.com.br/server.php) element.
 *
 * This is a complex type.
 */
public class AdicionaStatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdicionaStatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADICIONASTATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://extranet.grupotoniato.com.br/server.php", "AdicionaStatusResponse");
    
    
    /**
     * Gets the "AdicionaStatusResponse" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse getAdicionaStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse)get_store().find_element_user(ADICIONASTATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatusResponse" element
     */
    public void setAdicionaStatusResponse(br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse adicionaStatusResponse)
    {
        generatedSetterHelperImpl(adicionaStatusResponse, ADICIONASTATUSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdicionaStatusResponse" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse addNewAdicionaStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse)get_store().add_element_user(ADICIONASTATUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AdicionaStatusResponse(@http://extranet.grupotoniato.com.br/server.php).
     *
     * This is a complex type.
     */
    public static class AdicionaStatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusResponseDocument.AdicionaStatusResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AdicionaStatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult target = null;
                target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult target = null;
                target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult target = null;
                target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult target = null;
                target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
