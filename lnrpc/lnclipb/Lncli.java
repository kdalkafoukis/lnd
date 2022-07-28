// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lnclipb/lncli.proto

package lnclipb;

public final class Lncli {
  private Lncli() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VersionResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:lnclipb.VersionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    boolean hasLncli();
    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    verrpc.Verrpc.Version getLncli();
    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    verrpc.Verrpc.VersionOrBuilder getLncliOrBuilder();

    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    boolean hasLnd();
    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    verrpc.Verrpc.Version getLnd();
    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    verrpc.Verrpc.VersionOrBuilder getLndOrBuilder();
  }
  /**
   * Protobuf type {@code lnclipb.VersionResponse}
   */
  public  static final class VersionResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:lnclipb.VersionResponse)
      VersionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VersionResponse.newBuilder() to construct.
    private VersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VersionResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VersionResponse(
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
            case 10: {
              verrpc.Verrpc.Version.Builder subBuilder = null;
              if (lncli_ != null) {
                subBuilder = lncli_.toBuilder();
              }
              lncli_ = input.readMessage(verrpc.Verrpc.Version.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lncli_);
                lncli_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              verrpc.Verrpc.Version.Builder subBuilder = null;
              if (lnd_ != null) {
                subBuilder = lnd_.toBuilder();
              }
              lnd_ = input.readMessage(verrpc.Verrpc.Version.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lnd_);
                lnd_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return lnclipb.Lncli.internal_static_lnclipb_VersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lnclipb.Lncli.internal_static_lnclipb_VersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lnclipb.Lncli.VersionResponse.class, lnclipb.Lncli.VersionResponse.Builder.class);
    }

    public static final int LNCLI_FIELD_NUMBER = 1;
    private verrpc.Verrpc.Version lncli_;
    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    public boolean hasLncli() {
      return lncli_ != null;
    }
    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    public verrpc.Verrpc.Version getLncli() {
      return lncli_ == null ? verrpc.Verrpc.Version.getDefaultInstance() : lncli_;
    }
    /**
     * <pre>
     * The version information for lncli.
     * </pre>
     *
     * <code>.verrpc.Version lncli = 1;</code>
     */
    public verrpc.Verrpc.VersionOrBuilder getLncliOrBuilder() {
      return getLncli();
    }

    public static final int LND_FIELD_NUMBER = 2;
    private verrpc.Verrpc.Version lnd_;
    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    public boolean hasLnd() {
      return lnd_ != null;
    }
    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    public verrpc.Verrpc.Version getLnd() {
      return lnd_ == null ? verrpc.Verrpc.Version.getDefaultInstance() : lnd_;
    }
    /**
     * <pre>
     * The version information for lnd.
     * </pre>
     *
     * <code>.verrpc.Version lnd = 2;</code>
     */
    public verrpc.Verrpc.VersionOrBuilder getLndOrBuilder() {
      return getLnd();
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
      if (lncli_ != null) {
        output.writeMessage(1, getLncli());
      }
      if (lnd_ != null) {
        output.writeMessage(2, getLnd());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lncli_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLncli());
      }
      if (lnd_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLnd());
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
      if (!(obj instanceof lnclipb.Lncli.VersionResponse)) {
        return super.equals(obj);
      }
      lnclipb.Lncli.VersionResponse other = (lnclipb.Lncli.VersionResponse) obj;

      boolean result = true;
      result = result && (hasLncli() == other.hasLncli());
      if (hasLncli()) {
        result = result && getLncli()
            .equals(other.getLncli());
      }
      result = result && (hasLnd() == other.hasLnd());
      if (hasLnd()) {
        result = result && getLnd()
            .equals(other.getLnd());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasLncli()) {
        hash = (37 * hash) + LNCLI_FIELD_NUMBER;
        hash = (53 * hash) + getLncli().hashCode();
      }
      if (hasLnd()) {
        hash = (37 * hash) + LND_FIELD_NUMBER;
        hash = (53 * hash) + getLnd().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static lnclipb.Lncli.VersionResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static lnclipb.Lncli.VersionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static lnclipb.Lncli.VersionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static lnclipb.Lncli.VersionResponse parseFrom(
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
    public static Builder newBuilder(lnclipb.Lncli.VersionResponse prototype) {
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
     * Protobuf type {@code lnclipb.VersionResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:lnclipb.VersionResponse)
        lnclipb.Lncli.VersionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return lnclipb.Lncli.internal_static_lnclipb_VersionResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return lnclipb.Lncli.internal_static_lnclipb_VersionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                lnclipb.Lncli.VersionResponse.class, lnclipb.Lncli.VersionResponse.Builder.class);
      }

      // Construct using lnclipb.Lncli.VersionResponse.newBuilder()
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
        if (lncliBuilder_ == null) {
          lncli_ = null;
        } else {
          lncli_ = null;
          lncliBuilder_ = null;
        }
        if (lndBuilder_ == null) {
          lnd_ = null;
        } else {
          lnd_ = null;
          lndBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return lnclipb.Lncli.internal_static_lnclipb_VersionResponse_descriptor;
      }

      @java.lang.Override
      public lnclipb.Lncli.VersionResponse getDefaultInstanceForType() {
        return lnclipb.Lncli.VersionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public lnclipb.Lncli.VersionResponse build() {
        lnclipb.Lncli.VersionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public lnclipb.Lncli.VersionResponse buildPartial() {
        lnclipb.Lncli.VersionResponse result = new lnclipb.Lncli.VersionResponse(this);
        if (lncliBuilder_ == null) {
          result.lncli_ = lncli_;
        } else {
          result.lncli_ = lncliBuilder_.build();
        }
        if (lndBuilder_ == null) {
          result.lnd_ = lnd_;
        } else {
          result.lnd_ = lndBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof lnclipb.Lncli.VersionResponse) {
          return mergeFrom((lnclipb.Lncli.VersionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(lnclipb.Lncli.VersionResponse other) {
        if (other == lnclipb.Lncli.VersionResponse.getDefaultInstance()) return this;
        if (other.hasLncli()) {
          mergeLncli(other.getLncli());
        }
        if (other.hasLnd()) {
          mergeLnd(other.getLnd());
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
        lnclipb.Lncli.VersionResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (lnclipb.Lncli.VersionResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private verrpc.Verrpc.Version lncli_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder> lncliBuilder_;
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public boolean hasLncli() {
        return lncliBuilder_ != null || lncli_ != null;
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public verrpc.Verrpc.Version getLncli() {
        if (lncliBuilder_ == null) {
          return lncli_ == null ? verrpc.Verrpc.Version.getDefaultInstance() : lncli_;
        } else {
          return lncliBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public Builder setLncli(verrpc.Verrpc.Version value) {
        if (lncliBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lncli_ = value;
          onChanged();
        } else {
          lncliBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public Builder setLncli(
          verrpc.Verrpc.Version.Builder builderForValue) {
        if (lncliBuilder_ == null) {
          lncli_ = builderForValue.build();
          onChanged();
        } else {
          lncliBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public Builder mergeLncli(verrpc.Verrpc.Version value) {
        if (lncliBuilder_ == null) {
          if (lncli_ != null) {
            lncli_ =
              verrpc.Verrpc.Version.newBuilder(lncli_).mergeFrom(value).buildPartial();
          } else {
            lncli_ = value;
          }
          onChanged();
        } else {
          lncliBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public Builder clearLncli() {
        if (lncliBuilder_ == null) {
          lncli_ = null;
          onChanged();
        } else {
          lncli_ = null;
          lncliBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public verrpc.Verrpc.Version.Builder getLncliBuilder() {
        
        onChanged();
        return getLncliFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      public verrpc.Verrpc.VersionOrBuilder getLncliOrBuilder() {
        if (lncliBuilder_ != null) {
          return lncliBuilder_.getMessageOrBuilder();
        } else {
          return lncli_ == null ?
              verrpc.Verrpc.Version.getDefaultInstance() : lncli_;
        }
      }
      /**
       * <pre>
       * The version information for lncli.
       * </pre>
       *
       * <code>.verrpc.Version lncli = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder> 
          getLncliFieldBuilder() {
        if (lncliBuilder_ == null) {
          lncliBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder>(
                  getLncli(),
                  getParentForChildren(),
                  isClean());
          lncli_ = null;
        }
        return lncliBuilder_;
      }

      private verrpc.Verrpc.Version lnd_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder> lndBuilder_;
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public boolean hasLnd() {
        return lndBuilder_ != null || lnd_ != null;
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public verrpc.Verrpc.Version getLnd() {
        if (lndBuilder_ == null) {
          return lnd_ == null ? verrpc.Verrpc.Version.getDefaultInstance() : lnd_;
        } else {
          return lndBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public Builder setLnd(verrpc.Verrpc.Version value) {
        if (lndBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lnd_ = value;
          onChanged();
        } else {
          lndBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public Builder setLnd(
          verrpc.Verrpc.Version.Builder builderForValue) {
        if (lndBuilder_ == null) {
          lnd_ = builderForValue.build();
          onChanged();
        } else {
          lndBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public Builder mergeLnd(verrpc.Verrpc.Version value) {
        if (lndBuilder_ == null) {
          if (lnd_ != null) {
            lnd_ =
              verrpc.Verrpc.Version.newBuilder(lnd_).mergeFrom(value).buildPartial();
          } else {
            lnd_ = value;
          }
          onChanged();
        } else {
          lndBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public Builder clearLnd() {
        if (lndBuilder_ == null) {
          lnd_ = null;
          onChanged();
        } else {
          lnd_ = null;
          lndBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public verrpc.Verrpc.Version.Builder getLndBuilder() {
        
        onChanged();
        return getLndFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      public verrpc.Verrpc.VersionOrBuilder getLndOrBuilder() {
        if (lndBuilder_ != null) {
          return lndBuilder_.getMessageOrBuilder();
        } else {
          return lnd_ == null ?
              verrpc.Verrpc.Version.getDefaultInstance() : lnd_;
        }
      }
      /**
       * <pre>
       * The version information for lnd.
       * </pre>
       *
       * <code>.verrpc.Version lnd = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder> 
          getLndFieldBuilder() {
        if (lndBuilder_ == null) {
          lndBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              verrpc.Verrpc.Version, verrpc.Verrpc.Version.Builder, verrpc.Verrpc.VersionOrBuilder>(
                  getLnd(),
                  getParentForChildren(),
                  isClean());
          lnd_ = null;
        }
        return lndBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:lnclipb.VersionResponse)
    }

    // @@protoc_insertion_point(class_scope:lnclipb.VersionResponse)
    private static final lnclipb.Lncli.VersionResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new lnclipb.Lncli.VersionResponse();
    }

    public static lnclipb.Lncli.VersionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VersionResponse>
        PARSER = new com.google.protobuf.AbstractParser<VersionResponse>() {
      @java.lang.Override
      public VersionResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VersionResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VersionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VersionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public lnclipb.Lncli.VersionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lnclipb_VersionResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lnclipb_VersionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023lnclipb/lncli.proto\022\007lnclipb\032\023verrpc/v" +
      "errpc.proto\"O\n\017VersionResponse\022\036\n\005lncli\030" +
      "\001 \001(\0132\017.verrpc.Version\022\034\n\003lnd\030\002 \001(\0132\017.ve" +
      "rrpc.VersionB/Z-github.com/lightningnetw" +
      "ork/lnd/lnrpc/lnclipbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          verrpc.Verrpc.getDescriptor(),
        }, assigner);
    internal_static_lnclipb_VersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lnclipb_VersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lnclipb_VersionResponse_descriptor,
        new java.lang.String[] { "Lncli", "Lnd", });
    verrpc.Verrpc.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
