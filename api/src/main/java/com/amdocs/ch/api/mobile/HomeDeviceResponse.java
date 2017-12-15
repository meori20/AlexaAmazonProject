/**
 * HomeDeviceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class HomeDeviceResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.HomeDevice device;

    public HomeDeviceResponse() {
    }

    public HomeDeviceResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.HomeDevice device) {
        super(
            success,
            faultCode,
            faultDescription);
        this.device = device;
    }


    /**
     * Gets the device value for this HomeDeviceResponse.
     * 
     * @return device
     */
    public com.amdocs.ch.api.mobile.HomeDevice getDevice() {
        return device;
    }


    /**
     * Sets the device value for this HomeDeviceResponse.
     * 
     * @param device
     */
    public void setDevice(com.amdocs.ch.api.mobile.HomeDevice device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeDeviceResponse)) return false;
        HomeDeviceResponse other = (HomeDeviceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDeviceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDeviceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
