package com.bytedance.im.core.proto;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ReferenceInfo extends AndroidMessage<ReferenceInfo, Builder> {
    public static final ProtoAdapter<ReferenceInfo> ADAPTER;
    public static final Parcelable.Creator<ReferenceInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID = 0L;
    public static final MessageStatus DEFAULT_REFERENCED_MESSAGE_STATUS = MessageStatus.AVAILABLE;
    public static final Long DEFAULT_REF_MESSAGE_TYPE = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "hint")
    public final String hint;
    @c(a = "ref_message_type")
    public final Long ref_message_type;
    @c(a = "referenced_message_id")
    public final Long referenced_message_id;
    @c(a = "referenced_message_status")
    public final MessageStatus referenced_message_status;
    @c(a = "root_message_conv_index")
    public final Long root_message_conv_index;
    @c(a = "root_message_id")
    public final Long root_message_id;

    static final class ProtoAdapter_ReferenceInfo extends ProtoAdapter<ReferenceInfo> {
        static {
            Covode.recordClassIndex(23713);
        }

        public ProtoAdapter_ReferenceInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ReferenceInfo.class);
        }

        public final ReferenceInfo redact(ReferenceInfo referenceInfo) {
            Builder newBuilder = referenceInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReferenceInfo referenceInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, referenceInfo.referenced_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referenceInfo.hint) + ProtoAdapter.INT64.encodedSizeWithTag(3, referenceInfo.ref_message_type) + MessageStatus.ADAPTER.encodedSizeWithTag(4, referenceInfo.referenced_message_status) + ProtoAdapter.INT64.encodedSizeWithTag(5, referenceInfo.root_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(6, referenceInfo.root_message_conv_index) + referenceInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReferenceInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.referenced_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.hint(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.ref_message_type(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.referenced_message_status(MessageStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.root_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.root_message_conv_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReferenceInfo referenceInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, referenceInfo.referenced_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referenceInfo.hint);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, referenceInfo.ref_message_type);
            MessageStatus.ADAPTER.encodeWithTag(protoWriter, 4, referenceInfo.referenced_message_status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, referenceInfo.root_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, referenceInfo.root_message_conv_index);
            protoWriter.writeBytes(referenceInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReferenceInfo" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23711);
        ProtoAdapter_ReferenceInfo protoAdapter_ReferenceInfo = new ProtoAdapter_ReferenceInfo();
        ADAPTER = protoAdapter_ReferenceInfo;
        CREATOR = AndroidMessage.newCreator(protoAdapter_ReferenceInfo);
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.referenced_message_id = this.referenced_message_id;
        builder.hint = this.hint;
        builder.ref_message_type = this.ref_message_type;
        builder.referenced_message_status = this.referenced_message_status;
        builder.root_message_id = this.root_message_id;
        builder.root_message_conv_index = this.root_message_conv_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<ReferenceInfo, Builder> {
        public String hint;
        public Long ref_message_type;
        public Long referenced_message_id;
        public MessageStatus referenced_message_status;
        public Long root_message_conv_index;
        public Long root_message_id;

        static {
            Covode.recordClassIndex(23712);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReferenceInfo build() {
            Long l2 = this.referenced_message_id;
            if (l2 != null && this.hint != null && this.ref_message_type != null && this.referenced_message_status != null) {
                return new ReferenceInfo(this.referenced_message_id, this.hint, this.ref_message_type, this.referenced_message_status, this.root_message_id, this.root_message_conv_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "referenced_message_id", this.hint, "hint", this.ref_message_type, "ref_message_type", this.referenced_message_status, "referenced_message_status");
        }

        public final Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public final Builder ref_message_type(Long l2) {
            this.ref_message_type = l2;
            return this;
        }

        public final Builder referenced_message_id(Long l2) {
            this.referenced_message_id = l2;
            return this;
        }

        public final Builder referenced_message_status(MessageStatus messageStatus) {
            this.referenced_message_status = messageStatus;
            return this;
        }

        public final Builder root_message_conv_index(Long l2) {
            this.root_message_conv_index = l2;
            return this;
        }

        public final Builder root_message_id(Long l2) {
            this.root_message_id = l2;
            return this;
        }
    }

    public ReferenceInfo(Long l2, String str, Long l3, MessageStatus messageStatus, Long l4, Long l5) {
        this(l2, str, l3, messageStatus, l4, l5, i.EMPTY);
    }

    public ReferenceInfo(Long l2, String str, Long l3, MessageStatus messageStatus, Long l4, Long l5, i iVar) {
        super(ADAPTER, iVar);
        this.referenced_message_id = l2;
        this.hint = str;
        this.ref_message_type = l3;
        this.referenced_message_status = messageStatus;
        this.root_message_id = l4;
        this.root_message_conv_index = l5;
    }
}
