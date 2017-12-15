/**
 * AvailableCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class AvailableCodesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.AvailableCode[] availableCodes;

    public AvailableCodesResponse() {
    }

    public AvailableCodesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.AvailableCode[] availableCodes) {
        super(
            success,
            faultCode,
            faultDescription);
        this.availableCodes = availableCodes;
    }


    /**
     * Gets the availableCodes value for this AvailableCodesResponse.
     * 
     * @return availableCodes
     */
    public com.amdocs.ch.api.mobile.AvailableCode[] getAvailableCodes() {
        return availableCodes;
    }


    /**
     * Sets the availableCodes value for this AvailableCodesResponse.
     * 
     * @param availableCodes
     */
    public void setAvailableCodes(com.amdocs.ch.api.mobile.AvailableCode[] availableCodes) {
        this.availableCodes = availableCodes;
    }

    public com.amdocs.ch.api.mobile.AvailableCode getAvailableCodes(int i) {
        return this.availableCodes[i];
    }

    public void setAvailableCodes(int i, com.amdocs.ch.api.mobile.AvailableCode _value) {
        this.availableCodes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailableCodesResponse)) return false;
        AvailableCodesResponse other = (AvailableCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableCodes==null && other.getAvailableCodes()==null) || 
             (this.availableCodes!=null &&
              java.util.Arrays.equals(this.availableCodes, other.getAvailableCodes())));
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
        if (getAvailableCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableCodes(), i);
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
        new org.apache.axis.description.TypeDesc(AvailableCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCode"));
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
