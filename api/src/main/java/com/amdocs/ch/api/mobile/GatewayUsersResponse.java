/**
 * GatewayUsersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class GatewayUsersResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.UserInfo[] usersInfo;

    public GatewayUsersResponse() {
    }

    public GatewayUsersResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.UserInfo[] usersInfo) {
        super(
            success,
            faultCode,
            faultDescription);
        this.usersInfo = usersInfo;
    }


    /**
     * Gets the usersInfo value for this GatewayUsersResponse.
     * 
     * @return usersInfo
     */
    public com.amdocs.ch.api.mobile.UserInfo[] getUsersInfo() {
        return usersInfo;
    }


    /**
     * Sets the usersInfo value for this GatewayUsersResponse.
     * 
     * @param usersInfo
     */
    public void setUsersInfo(com.amdocs.ch.api.mobile.UserInfo[] usersInfo) {
        this.usersInfo = usersInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GatewayUsersResponse)) return false;
        GatewayUsersResponse other = (GatewayUsersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.usersInfo==null && other.getUsersInfo()==null) || 
             (this.usersInfo!=null &&
              java.util.Arrays.equals(this.usersInfo, other.getUsersInfo())));
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
        if (getUsersInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsersInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsersInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GatewayUsersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayUsersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usersInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userInfo"));
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
