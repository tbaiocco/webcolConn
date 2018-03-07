/*
 * XML Type:  StatusResult
 * Namespace: http://extranet.grupotoniato.com.br/soap/GrupoToniato
 * Java type: br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult
 *
 * Automatically generated - do not modify.
 */
package br.com.grupotoniato.extranet.soap.grupotoniato.impl;
/**
 * An XML StatusResult(@http://extranet.grupotoniato.com.br/soap/GrupoToniato).
 *
 * This is a complex type.
 */
public class StatusResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.com.grupotoniato.extranet.soap.grupotoniato.StatusResult
{
    private static final long serialVersionUID = 1L;
    
    public StatusResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADICIONASTATUSRESULT$0 = 
        new javax.xml.namespace.QName("", "AdicionaStatusResult");
    private static final javax.xml.namespace.QName ADICIONASTATUSERROR$2 = 
        new javax.xml.namespace.QName("", "AdicionaStatusError");
    private static final javax.xml.namespace.QName ADICIONASTATUSREPORT$4 = 
        new javax.xml.namespace.QName("", "AdicionaStatusReport");
    
    
    /**
     * Gets the "AdicionaStatusResult" element
     */
    public int getAdicionaStatusResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADICIONASTATUSRESULT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdicionaStatusResult" element
     */
    public org.apache.xmlbeans.XmlInt xgetAdicionaStatusResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADICIONASTATUSRESULT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatusResult" element
     */
    public void setAdicionaStatusResult(int adicionaStatusResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADICIONASTATUSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADICIONASTATUSRESULT$0);
            }
            target.setIntValue(adicionaStatusResult);
        }
    }
    
    /**
     * Sets (as xml) the "AdicionaStatusResult" element
     */
    public void xsetAdicionaStatusResult(org.apache.xmlbeans.XmlInt adicionaStatusResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADICIONASTATUSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ADICIONASTATUSRESULT$0);
            }
            target.set(adicionaStatusResult);
        }
    }
    
    /**
     * Gets the "AdicionaStatusError" element
     */
    public java.lang.String getAdicionaStatusError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADICIONASTATUSERROR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdicionaStatusError" element
     */
    public org.apache.xmlbeans.XmlString xgetAdicionaStatusError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADICIONASTATUSERROR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatusError" element
     */
    public void setAdicionaStatusError(java.lang.String adicionaStatusError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADICIONASTATUSERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADICIONASTATUSERROR$2);
            }
            target.setStringValue(adicionaStatusError);
        }
    }
    
    /**
     * Sets (as xml) the "AdicionaStatusError" element
     */
    public void xsetAdicionaStatusError(org.apache.xmlbeans.XmlString adicionaStatusError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADICIONASTATUSERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADICIONASTATUSERROR$2);
            }
            target.set(adicionaStatusError);
        }
    }
    
    /**
     * Gets the "AdicionaStatusReport" element
     */
    public br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray getAdicionaStatusReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray target = null;
            target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray)get_store().find_element_user(ADICIONASTATUSREPORT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdicionaStatusReport" element
     */
    public void setAdicionaStatusReport(br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray adicionaStatusReport)
    {
        generatedSetterHelperImpl(adicionaStatusReport, ADICIONASTATUSREPORT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdicionaStatusReport" element
     */
    public br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray addNewAdicionaStatusReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray target = null;
            target = (br.com.grupotoniato.extranet.soap.grupotoniato.StatusResultReportArray)get_store().add_element_user(ADICIONASTATUSREPORT$4);
            return target;
        }
    }
}
