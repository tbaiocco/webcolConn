/*
 * An XML document type.
 * Localname: AdicionaStatusCDResponse
 * Namespace: http://extranet.grupotoniato.com.br/server.php
 * Java type: br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.server_php.impl;
/**
 * A document containing one AdicionaStatusCDResponse(@http://extranet.grupotoniato.com.br/server.php) element.
 *
 * This is a complex type.
 */
public class AdicionaStatusCDResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdicionaStatusCDResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADICIONASTATUSCDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://extranet.grupotoniato.com.br/server.php", "AdicionaStatusCDResponse");
    
    
    /**
     * Gets the "AdicionaStatusCDResponse" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse getAdicionaStatusCDResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse)get_store().find_element_user(ADICIONASTATUSCDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatusCDResponse" element
     */
    public void setAdicionaStatusCDResponse(br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse adicionaStatusCDResponse)
    {
        generatedSetterHelperImpl(adicionaStatusCDResponse, ADICIONASTATUSCDRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdicionaStatusCDResponse" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse addNewAdicionaStatusCDResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse)get_store().add_element_user(ADICIONASTATUSCDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AdicionaStatusCDResponse(@http://extranet.grupotoniato.com.br/server.php).
     *
     * This is a complex type.
     */
    public static class AdicionaStatusCDResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusCDResponseDocument.AdicionaStatusCDResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AdicionaStatusCDResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
