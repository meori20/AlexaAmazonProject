/**
 * NfcInfoListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NfcInfoListResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NfcInfo[] nfcInfoList;

    public NfcInfoListResponse() {
    }

    public NfcInfoListResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.NfcInfo[] nfcInfoList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.nfcInfoList = nfcInfoList;
    }


    /**
     * Gets the nfcInfoList value for this NfcInfoListResponse.
     * 
     * @return nfcInfoList
     */
    public com.amdocs.ch.api.mobile.NfcInfo[] getNfcInfoList() {
        return nfcInfoList;
    }


    /**
     * Sets the nfcInfoList value for this NfcInfoListResponse.
     * 
     * @param nfcInfoList
     */
    public void setNfcInfoList(com.amdocs.ch.api.mobile.NfcInfo[] nfcInfoList) {
        this.nfcInfoList = nfcInfoList;
    }

    public com.amdocs.ch.api.mobile.NfcInfo getNfcInfoList(int i) {
        return this.nfcInfoList[i];
    }

    public void setNfcInfoList(int i, com.amdocs.ch.api.mobile.NfcInfo _value) {
        this.nfcInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfcInfoListResponse)) return false;
        NfcInfoListResponse other = (NfcInfoListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nfcInfoList==null && other.getNfcInfoList()==null) || 
             (this.nfcInfoList!=null &&
              java.util.Arrays.equals(this.nfcInfoList, other.getNfcInfoList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNfcInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfcInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfcInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfcInfoListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfcInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfcInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
