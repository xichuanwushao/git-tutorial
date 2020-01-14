// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: surface.proto

package com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc;

/**
 * Protobuf type {@code surfaceDataSelect.GetSurfEleByTimeResponse}
 */
public  final class GetSurfEleByTimeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:surfaceDataSelect.GetSurfEleByTimeResponse)
    GetSurfEleByTimeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSurfEleByTimeResponse.newBuilder() to construct.
  private GetSurfEleByTimeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSurfEleByTimeResponse() {
    msg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSurfEleByTimeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            status_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 26: {
            com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.internal_static_surfaceDataSelect_GetSurfEleByTimeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.internal_static_surfaceDataSelect_GetSurfEleByTimeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int MSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 2;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D data_;
  /**
   * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
   */
  public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D getData() {
    return data_ == null ? com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.getDefaultInstance() : data_;
  }
  /**
   * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
   */
  public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2DOrBuilder getDataOrBuilder() {
    return getData();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msg_);
    }
    if (data_ != null) {
      output.writeMessage(3, getData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msg_);
    }
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse)) {
      return super.equals(obj);
    }
    com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse other = (com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code surfaceDataSelect.GetSurfEleByTimeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:surfaceDataSelect.GetSurfEleByTimeResponse)
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.internal_static_surfaceDataSelect_GetSurfEleByTimeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.internal_static_surfaceDataSelect_GetSurfEleByTimeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.class, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.Builder.class);
    }

    // Construct using com.rihang.surface.grpc.surfaceSelect.GetSurfEleByTimeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      msg_ = "";

      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.SelectProto.internal_static_surfaceDataSelect_GetSurfEleByTimeResponse_descriptor;
    }

    @java.lang.Override
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getDefaultInstanceForType() {
      return com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse build() {
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse buildPartial() {
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse result = new com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse(this);
      result.status_ = status_;
      result.msg_ = msg_;
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse) {
        return mergeFrom((com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse other) {
      if (other == com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (other.hasData()) {
        mergeData(other.getData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 2;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }

    private com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D data_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2DOrBuilder> dataBuilder_;
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public Builder setData(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public Builder setData(
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public Builder mergeData(com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2DOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.getDefaultInstance() : data_;
      }
    }
    /**
     * <code>.surfaceDataSelect.RetArr2D data = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2DOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2D.Builder, com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.RetArr2DOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:surfaceDataSelect.GetSurfEleByTimeResponse)
  }

  // @@protoc_insertion_point(class_scope:surfaceDataSelect.GetSurfEleByTimeResponse)
  private static final com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse();
  }

  public static com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSurfEleByTimeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSurfEleByTimeResponse>() {
    @java.lang.Override
    public GetSurfEleByTimeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSurfEleByTimeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSurfEleByTimeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSurfEleByTimeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hw.hwcdp3.dc.project.beijing.sourcedataget.sueface.grpc.GetSurfEleByTimeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
