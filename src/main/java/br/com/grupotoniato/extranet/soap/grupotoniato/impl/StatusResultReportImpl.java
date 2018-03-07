/*
 * XML Type:  StatusResultReport
 * Namespace: http://extranet.grupotoniato.com.br/soap/GrupoToniato
 * Java type: br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReport
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.soap.grupotoniato.impl;
/**
 * An XML StatusResultReport(@http://extranet.grupotoniato.com.br/soap/GrupoToniato).
 *
 * This is a complex type.
 */
public class StatusResultReportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReport
{
    private static final long serialVersionUID = 1L;
    
    public StatusResultReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTA$0 = 
        new javax.xml.namespace.QName("", "nota");
    private static final javax.xml.namespace.QName MSG$2 = 
        new javax.xml.namespace.QName("", "msg");
    
    
    /**
     * Gets the "nota" element
     */
    public int getNota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "nota" element
     */
    public org.apache.xmlbeans.XmlInt xgetNota()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nota" element
     */
    public void setNota(int nota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTA$0);
            }
            target.setIntValue(nota);
        }
    }
    
    /**
     * Sets (as xml) the "nota" element
     */
    public void xsetNota(org.apache.xmlbeans.XmlInt nota)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NOTA$0);
            }
            target.set(nota);
        }
    }
    
    /**
     * Gets the "msg" element
     */
    public java.lang.String getMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "msg" element
     */
    public org.apache.xmlbeans.XmlString xgetMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSG$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "msg" element
     */
    public void setMsg(java.lang.String msg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSG$2);
            }
            target.setStringValue(msg);
        }
    }
    
    /**
     * Sets (as xml) the "msg" element
     */
    public void xsetMsg(org.apache.xmlbeans.XmlString msg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSG$2);
            }
            target.set(msg);
        }
    }
}
