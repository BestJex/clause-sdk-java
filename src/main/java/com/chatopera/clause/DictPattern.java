/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.chatopera.clause;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 正则词典的定义
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-16")
public class DictPattern implements org.apache.thrift.TBase<DictPattern, DictPattern._Fields>, java.io.Serializable, Cloneable, Comparable<DictPattern> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DictPattern");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DICT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dict_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PATTERNS_FIELD_DESC = new org.apache.thrift.protocol.TField("patterns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField STANDARD_FIELD_DESC = new org.apache.thrift.protocol.TField("standard", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATEDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("createdate", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField UPDATEDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedate", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DictPatternStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DictPatternTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String dict_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> patterns; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String standard; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String createdate; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String updatedate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    DICT_ID((short)2, "dict_id"),
    PATTERNS((short)3, "patterns"),
    STANDARD((short)4, "standard"),
    CREATEDATE((short)5, "createdate"),
    UPDATEDATE((short)6, "updatedate");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // DICT_ID
          return DICT_ID;
        case 3: // PATTERNS
          return PATTERNS;
        case 4: // STANDARD
          return STANDARD;
        case 5: // CREATEDATE
          return CREATEDATE;
        case 6: // UPDATEDATE
          return UPDATEDATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ID,_Fields.DICT_ID,_Fields.PATTERNS,_Fields.STANDARD,_Fields.CREATEDATE,_Fields.UPDATEDATE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DICT_ID, new org.apache.thrift.meta_data.FieldMetaData("dict_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PATTERNS, new org.apache.thrift.meta_data.FieldMetaData("patterns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.STANDARD, new org.apache.thrift.meta_data.FieldMetaData("standard", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATEDATE, new org.apache.thrift.meta_data.FieldMetaData("createdate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.UPDATEDATE, new org.apache.thrift.meta_data.FieldMetaData("updatedate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DictPattern.class, metaDataMap);
  }

  public DictPattern() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DictPattern(DictPattern other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetDict_id()) {
      this.dict_id = other.dict_id;
    }
    if (other.isSetPatterns()) {
      java.util.List<java.lang.String> __this__patterns = new java.util.ArrayList<java.lang.String>(other.patterns);
      this.patterns = __this__patterns;
    }
    if (other.isSetStandard()) {
      this.standard = other.standard;
    }
    if (other.isSetCreatedate()) {
      this.createdate = other.createdate;
    }
    if (other.isSetUpdatedate()) {
      this.updatedate = other.updatedate;
    }
  }

  public DictPattern deepCopy() {
    return new DictPattern(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.dict_id = null;
    this.patterns = null;
    this.standard = null;
    this.createdate = null;
    this.updatedate = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public DictPattern setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDict_id() {
    return this.dict_id;
  }

  public DictPattern setDict_id(@org.apache.thrift.annotation.Nullable java.lang.String dict_id) {
    this.dict_id = dict_id;
    return this;
  }

  public void unsetDict_id() {
    this.dict_id = null;
  }

  /** Returns true if field dict_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDict_id() {
    return this.dict_id != null;
  }

  public void setDict_idIsSet(boolean value) {
    if (!value) {
      this.dict_id = null;
    }
  }

  public int getPatternsSize() {
    return (this.patterns == null) ? 0 : this.patterns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPatternsIterator() {
    return (this.patterns == null) ? null : this.patterns.iterator();
  }

  public void addToPatterns(java.lang.String elem) {
    if (this.patterns == null) {
      this.patterns = new java.util.ArrayList<java.lang.String>();
    }
    this.patterns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPatterns() {
    return this.patterns;
  }

  public DictPattern setPatterns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> patterns) {
    this.patterns = patterns;
    return this;
  }

  public void unsetPatterns() {
    this.patterns = null;
  }

  /** Returns true if field patterns is set (has been assigned a value) and false otherwise */
  public boolean isSetPatterns() {
    return this.patterns != null;
  }

  public void setPatternsIsSet(boolean value) {
    if (!value) {
      this.patterns = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStandard() {
    return this.standard;
  }

  public DictPattern setStandard(@org.apache.thrift.annotation.Nullable java.lang.String standard) {
    this.standard = standard;
    return this;
  }

  public void unsetStandard() {
    this.standard = null;
  }

  /** Returns true if field standard is set (has been assigned a value) and false otherwise */
  public boolean isSetStandard() {
    return this.standard != null;
  }

  public void setStandardIsSet(boolean value) {
    if (!value) {
      this.standard = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCreatedate() {
    return this.createdate;
  }

  public DictPattern setCreatedate(@org.apache.thrift.annotation.Nullable java.lang.String createdate) {
    this.createdate = createdate;
    return this;
  }

  public void unsetCreatedate() {
    this.createdate = null;
  }

  /** Returns true if field createdate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedate() {
    return this.createdate != null;
  }

  public void setCreatedateIsSet(boolean value) {
    if (!value) {
      this.createdate = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUpdatedate() {
    return this.updatedate;
  }

  public DictPattern setUpdatedate(@org.apache.thrift.annotation.Nullable java.lang.String updatedate) {
    this.updatedate = updatedate;
    return this;
  }

  public void unsetUpdatedate() {
    this.updatedate = null;
  }

  /** Returns true if field updatedate is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedate() {
    return this.updatedate != null;
  }

  public void setUpdatedateIsSet(boolean value) {
    if (!value) {
      this.updatedate = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case DICT_ID:
      if (value == null) {
        unsetDict_id();
      } else {
        setDict_id((java.lang.String)value);
      }
      break;

    case PATTERNS:
      if (value == null) {
        unsetPatterns();
      } else {
        setPatterns((java.util.List<java.lang.String>)value);
      }
      break;

    case STANDARD:
      if (value == null) {
        unsetStandard();
      } else {
        setStandard((java.lang.String)value);
      }
      break;

    case CREATEDATE:
      if (value == null) {
        unsetCreatedate();
      } else {
        setCreatedate((java.lang.String)value);
      }
      break;

    case UPDATEDATE:
      if (value == null) {
        unsetUpdatedate();
      } else {
        setUpdatedate((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case DICT_ID:
      return getDict_id();

    case PATTERNS:
      return getPatterns();

    case STANDARD:
      return getStandard();

    case CREATEDATE:
      return getCreatedate();

    case UPDATEDATE:
      return getUpdatedate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case DICT_ID:
      return isSetDict_id();
    case PATTERNS:
      return isSetPatterns();
    case STANDARD:
      return isSetStandard();
    case CREATEDATE:
      return isSetCreatedate();
    case UPDATEDATE:
      return isSetUpdatedate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DictPattern)
      return this.equals((DictPattern)that);
    return false;
  }

  public boolean equals(DictPattern that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_dict_id = true && this.isSetDict_id();
    boolean that_present_dict_id = true && that.isSetDict_id();
    if (this_present_dict_id || that_present_dict_id) {
      if (!(this_present_dict_id && that_present_dict_id))
        return false;
      if (!this.dict_id.equals(that.dict_id))
        return false;
    }

    boolean this_present_patterns = true && this.isSetPatterns();
    boolean that_present_patterns = true && that.isSetPatterns();
    if (this_present_patterns || that_present_patterns) {
      if (!(this_present_patterns && that_present_patterns))
        return false;
      if (!this.patterns.equals(that.patterns))
        return false;
    }

    boolean this_present_standard = true && this.isSetStandard();
    boolean that_present_standard = true && that.isSetStandard();
    if (this_present_standard || that_present_standard) {
      if (!(this_present_standard && that_present_standard))
        return false;
      if (!this.standard.equals(that.standard))
        return false;
    }

    boolean this_present_createdate = true && this.isSetCreatedate();
    boolean that_present_createdate = true && that.isSetCreatedate();
    if (this_present_createdate || that_present_createdate) {
      if (!(this_present_createdate && that_present_createdate))
        return false;
      if (!this.createdate.equals(that.createdate))
        return false;
    }

    boolean this_present_updatedate = true && this.isSetUpdatedate();
    boolean that_present_updatedate = true && that.isSetUpdatedate();
    if (this_present_updatedate || that_present_updatedate) {
      if (!(this_present_updatedate && that_present_updatedate))
        return false;
      if (!this.updatedate.equals(that.updatedate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetDict_id()) ? 131071 : 524287);
    if (isSetDict_id())
      hashCode = hashCode * 8191 + dict_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetPatterns()) ? 131071 : 524287);
    if (isSetPatterns())
      hashCode = hashCode * 8191 + patterns.hashCode();

    hashCode = hashCode * 8191 + ((isSetStandard()) ? 131071 : 524287);
    if (isSetStandard())
      hashCode = hashCode * 8191 + standard.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreatedate()) ? 131071 : 524287);
    if (isSetCreatedate())
      hashCode = hashCode * 8191 + createdate.hashCode();

    hashCode = hashCode * 8191 + ((isSetUpdatedate()) ? 131071 : 524287);
    if (isSetUpdatedate())
      hashCode = hashCode * 8191 + updatedate.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DictPattern other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDict_id()).compareTo(other.isSetDict_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDict_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dict_id, other.dict_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPatterns()).compareTo(other.isSetPatterns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPatterns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.patterns, other.patterns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStandard()).compareTo(other.isSetStandard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStandard()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.standard, other.standard);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedate()).compareTo(other.isSetCreatedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdate, other.createdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedate()).compareTo(other.isSetUpdatedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedate, other.updatedate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DictPattern(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetDict_id()) {
      if (!first) sb.append(", ");
      sb.append("dict_id:");
      if (this.dict_id == null) {
        sb.append("null");
      } else {
        sb.append(this.dict_id);
      }
      first = false;
    }
    if (isSetPatterns()) {
      if (!first) sb.append(", ");
      sb.append("patterns:");
      if (this.patterns == null) {
        sb.append("null");
      } else {
        sb.append(this.patterns);
      }
      first = false;
    }
    if (isSetStandard()) {
      if (!first) sb.append(", ");
      sb.append("standard:");
      if (this.standard == null) {
        sb.append("null");
      } else {
        sb.append(this.standard);
      }
      first = false;
    }
    if (isSetCreatedate()) {
      if (!first) sb.append(", ");
      sb.append("createdate:");
      if (this.createdate == null) {
        sb.append("null");
      } else {
        sb.append(this.createdate);
      }
      first = false;
    }
    if (isSetUpdatedate()) {
      if (!first) sb.append(", ");
      sb.append("updatedate:");
      if (this.updatedate == null) {
        sb.append("null");
      } else {
        sb.append(this.updatedate);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DictPatternStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictPatternStandardScheme getScheme() {
      return new DictPatternStandardScheme();
    }
  }

  private static class DictPatternStandardScheme extends org.apache.thrift.scheme.StandardScheme<DictPattern> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DictPattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DICT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dict_id = iprot.readString();
              struct.setDict_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PATTERNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.patterns = new java.util.ArrayList<java.lang.String>(_list24.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readString();
                  struct.patterns.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setPatternsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STANDARD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.standard = iprot.readString();
              struct.setStandardIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATEDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createdate = iprot.readString();
              struct.setCreatedateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UPDATEDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updatedate = iprot.readString();
              struct.setUpdatedateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DictPattern struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dict_id != null) {
        if (struct.isSetDict_id()) {
          oprot.writeFieldBegin(DICT_ID_FIELD_DESC);
          oprot.writeString(struct.dict_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.patterns != null) {
        if (struct.isSetPatterns()) {
          oprot.writeFieldBegin(PATTERNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.patterns.size()));
            for (java.lang.String _iter27 : struct.patterns)
            {
              oprot.writeString(_iter27);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.standard != null) {
        if (struct.isSetStandard()) {
          oprot.writeFieldBegin(STANDARD_FIELD_DESC);
          oprot.writeString(struct.standard);
          oprot.writeFieldEnd();
        }
      }
      if (struct.createdate != null) {
        if (struct.isSetCreatedate()) {
          oprot.writeFieldBegin(CREATEDATE_FIELD_DESC);
          oprot.writeString(struct.createdate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.updatedate != null) {
        if (struct.isSetUpdatedate()) {
          oprot.writeFieldBegin(UPDATEDATE_FIELD_DESC);
          oprot.writeString(struct.updatedate);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DictPatternTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DictPatternTupleScheme getScheme() {
      return new DictPatternTupleScheme();
    }
  }

  private static class DictPatternTupleScheme extends org.apache.thrift.scheme.TupleScheme<DictPattern> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DictPattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetDict_id()) {
        optionals.set(1);
      }
      if (struct.isSetPatterns()) {
        optionals.set(2);
      }
      if (struct.isSetStandard()) {
        optionals.set(3);
      }
      if (struct.isSetCreatedate()) {
        optionals.set(4);
      }
      if (struct.isSetUpdatedate()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetDict_id()) {
        oprot.writeString(struct.dict_id);
      }
      if (struct.isSetPatterns()) {
        {
          oprot.writeI32(struct.patterns.size());
          for (java.lang.String _iter28 : struct.patterns)
          {
            oprot.writeString(_iter28);
          }
        }
      }
      if (struct.isSetStandard()) {
        oprot.writeString(struct.standard);
      }
      if (struct.isSetCreatedate()) {
        oprot.writeString(struct.createdate);
      }
      if (struct.isSetUpdatedate()) {
        oprot.writeString(struct.updatedate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DictPattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dict_id = iprot.readString();
        struct.setDict_idIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.patterns = new java.util.ArrayList<java.lang.String>(_list29.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readString();
            struct.patterns.add(_elem30);
          }
        }
        struct.setPatternsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.standard = iprot.readString();
        struct.setStandardIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createdate = iprot.readString();
        struct.setCreatedateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.updatedate = iprot.readString();
        struct.setUpdatedateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

