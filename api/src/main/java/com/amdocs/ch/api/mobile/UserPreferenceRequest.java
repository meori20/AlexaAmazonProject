/**
 * UserPreferenceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPreferenceRequest  implements java.io.Serializable {
    private java.lang.String username;

    private com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry[] userPreferences;

    public UserPreferenceRequest() {
    }

    public UserPreferenceRequest(
           java.lang.String username,
           com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry[] userPreferences) {
           this.username = username;
           this.userPreferences = userPreferences;
    }


    /**
     * Gets the username value for this UserPreferenceRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserPreferenceRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the userPreferences value for this UserPreferenceRequest.
     * 
     * @return userPreferences
     */
    public com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry[] getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this UserPreferenceRequest.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry[] userPreferences) {
        this.userPreferences = userPreferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPreferenceRequest)) return false;
        UserPreferenceRequest other = (UserPreferenceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              java.util.Arrays.equals(this.userPreferences, other.getUserPreferences())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getUserPreferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPreferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPreferences(), i);
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
        new org.apache.axis.description.TypeDesc(UserPreferenceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceRequest>userPreferences>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
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
