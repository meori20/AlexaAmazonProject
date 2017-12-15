/**
 * UserPersonalDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPersonalDetailsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.UserPersonalDetails personalDetails;

    private com.amdocs.ch.api.mobile.NotificationTarget[] targets;

    public UserPersonalDetailsResponse() {
    }

    public UserPersonalDetailsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.UserPersonalDetails personalDetails,
           com.amdocs.ch.api.mobile.NotificationTarget[] targets) {
        super(
            success,
            faultCode,
            faultDescription);
        this.personalDetails = personalDetails;
        this.targets = targets;
    }


    /**
     * Gets the personalDetails value for this UserPersonalDetailsResponse.
     * 
     * @return personalDetails
     */
    public com.amdocs.ch.api.mobile.UserPersonalDetails getPersonalDetails() {
        return personalDetails;
    }


    /**
     * Sets the personalDetails value for this UserPersonalDetailsResponse.
     * 
     * @param personalDetails
     */
    public void setPersonalDetails(com.amdocs.ch.api.mobile.UserPersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }


    /**
     * Gets the targets value for this UserPersonalDetailsResponse.
     * 
     * @return targets
     */
    public com.amdocs.ch.api.mobile.NotificationTarget[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this UserPersonalDetailsResponse.
     * 
     * @param targets
     */
    public void setTargets(com.amdocs.ch.api.mobile.NotificationTarget[] targets) {
        this.targets = targets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPersonalDetailsResponse)) return false;
        UserPersonalDetailsResponse other = (UserPersonalDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.personalDetails==null && other.getPersonalDetails()==null) || 
             (this.personalDetails!=null &&
              this.personalDetails.equals(other.getPersonalDetails()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getPersonalDetails() != null) {
            _hashCode += getPersonalDetails().hashCode();
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(UserPersonalDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "target"));
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
