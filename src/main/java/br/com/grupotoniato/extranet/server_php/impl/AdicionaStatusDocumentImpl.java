/*
 * An XML document type.
 * Localname: AdicionaStatus
 * Namespace: http://extranet.grupotoniato.com.br/server.php
 * Java type: br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.server_php.impl;
/**
 * A document containing one AdicionaStatus(@http://extranet.grupotoniato.com.br/server.php) element.
 *
 * This is a complex type.
 */
public class AdicionaStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdicionaStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADICIONASTATUS$0 = 
        new javax.xml.namespace.QName("http://extranet.grupotoniato.com.br/server.php", "AdicionaStatus");
    
    
    /**
     * Gets the "AdicionaStatus" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus getAdicionaStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus)get_store().find_element_user(ADICIONASTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatus" element
     */
    public void setAdicionaStatus(br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus adicionaStatus)
    {
        generatedSetterHelperImpl(adicionaStatus, ADICIONASTATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdicionaStatus" element
     */
    public br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus addNewAdicionaStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus target = null;
            target = (br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus)get_store().add_element_user(ADICIONASTATUS$0);
            return target;
        }
    }
    /**
     * An XML AdicionaStatus(@http://extranet.grupotoniato.com.br/server.php).
     *
     * This is a complex type.
     */
    public static class AdicionaStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.server_php.AdicionaStatusDocument.AdicionaStatus
    {
        private static final long serialVersionUID = 1L;
        
        public AdicionaStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName XML$0 = 
            new javax.xml.namespace.QName("", "xml");
        private static final javax.xml.namespace.QName HASH$2 = 
            new javax.xml.namespace.QName("", "hash");
        
        
        /**
         * Gets the "xml" element
         */
        public java.lang.String getXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XML$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "xml" element
         */
        public org.apache.xmlbeans.XmlString xgetXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "xml" element
         */
        public boolean isNilXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "xml" element
         */
        public void setXml(java.lang.String xml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XML$0);
                }
                target.setStringValue(xml);
            }
        }
        
        /**
         * Sets (as xml) the "xml" element
         */
        public void xsetXml(org.apache.xmlbeans.XmlString xml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XML$0);
                }
                target.set(xml);
            }
        }
        
        /**
         * Nils the "xml" element
         */
        public void setNilXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XML$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XML$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "hash" element
         */
        public java.lang.String getHash()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hash" element
         */
        public org.apache.xmlbeans.XmlString xgetHash()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASH$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "hash" element
         */
        public boolean isNilHash()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASH$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "hash" element
         */
        public void setHash(java.lang.String hash)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASH$2);
                }
                target.setStringValue(hash);
            }
        }
        
        /**
         * Sets (as xml) the "hash" element
         */
        public void xsetHash(org.apache.xmlbeans.XmlString hash)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASH$2);
                }
                target.set(hash);
            }
        }
        
        /**
         * Nils the "hash" element
         */
        public void setNilHash()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASH$2);
                }
                target.setNil();
            }
        }
    }
}
