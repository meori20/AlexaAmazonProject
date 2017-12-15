/**
 * MeasurementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MeasurementType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MeasurementType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SMART_PLUG_ENERGY_MEASUREMENT = "SMART_PLUG_ENERGY_MEASUREMENT";
    public static final java.lang.String _BLOOD_PRESSURE_SYSTOLICPRESSURE = "BLOOD_PRESSURE_SYSTOLICPRESSURE";
    public static final java.lang.String _BLOOD_PRESSURE_HEARTRATE = "BLOOD_PRESSURE_HEARTRATE";
    public static final java.lang.String _BLOOD_PRESSURE_DIASTOLICPRESSURE = "BLOOD_PRESSURE_DIASTOLICPRESSURE";
    public static final java.lang.String _MEAN_ARTERIAL_PRESSURE = "MEAN_ARTERIAL_PRESSURE";
    public static final java.lang.String _GLUCOSE_SUGAR_LEVEL = "GLUCOSE_SUGAR_LEVEL";
    public static final java.lang.String _SPO2_SPO2MIN = "SPO2_SPO2MIN";
    public static final java.lang.String _SPO2_SPO2MAX = "SPO2_SPO2MAX";
    public static final java.lang.String _SPO2_SPO2AVERAGE = "SPO2_SPO2AVERAGE";
    public static final java.lang.String _SPO2_HRMIN = "SPO2_HRMIN";
    public static final java.lang.String _SPO2_HRMAX = "SPO2_HRMAX";
    public static final java.lang.String _SPO2_HRAVERAGE = "SPO2_HRAVERAGE";
    public static final java.lang.String _WEIGHT = "WEIGHT";
    public static final java.lang.String _ECG_DIAGRAM = "ECG_DIAGRAM";
    public static final java.lang.String _SPIRO_DIAGRAM = "SPIRO_DIAGRAM";
    public static final MeasurementType SMART_PLUG_ENERGY_MEASUREMENT = new MeasurementType(_SMART_PLUG_ENERGY_MEASUREMENT);
    public static final MeasurementType BLOOD_PRESSURE_SYSTOLICPRESSURE = new MeasurementType(_BLOOD_PRESSURE_SYSTOLICPRESSURE);
    public static final MeasurementType BLOOD_PRESSURE_HEARTRATE = new MeasurementType(_BLOOD_PRESSURE_HEARTRATE);
    public static final MeasurementType BLOOD_PRESSURE_DIASTOLICPRESSURE = new MeasurementType(_BLOOD_PRESSURE_DIASTOLICPRESSURE);
    public static final MeasurementType MEAN_ARTERIAL_PRESSURE = new MeasurementType(_MEAN_ARTERIAL_PRESSURE);
    public static final MeasurementType GLUCOSE_SUGAR_LEVEL = new MeasurementType(_GLUCOSE_SUGAR_LEVEL);
    public static final MeasurementType SPO2_SPO2MIN = new MeasurementType(_SPO2_SPO2MIN);
    public static final MeasurementType SPO2_SPO2MAX = new MeasurementType(_SPO2_SPO2MAX);
    public static final MeasurementType SPO2_SPO2AVERAGE = new MeasurementType(_SPO2_SPO2AVERAGE);
    public static final MeasurementType SPO2_HRMIN = new MeasurementType(_SPO2_HRMIN);
    public static final MeasurementType SPO2_HRMAX = new MeasurementType(_SPO2_HRMAX);
    public static final MeasurementType SPO2_HRAVERAGE = new MeasurementType(_SPO2_HRAVERAGE);
    public static final MeasurementType WEIGHT = new MeasurementType(_WEIGHT);
    public static final MeasurementType ECG_DIAGRAM = new MeasurementType(_ECG_DIAGRAM);
    public static final MeasurementType SPIRO_DIAGRAM = new MeasurementType(_SPIRO_DIAGRAM);
    public java.lang.String getValue() { return _value_;}
    public static MeasurementType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MeasurementType enumeration = (MeasurementType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MeasurementType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeasurementType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
