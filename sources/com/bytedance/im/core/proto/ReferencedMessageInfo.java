package com.bytedance.im.core.proto;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ReferencedMessageInfo extends AndroidMessage<ReferencedMessageInfo, Builder> {
    public static final ProtoAdapter<ReferencedMessageInfo> ADAPTER;
    public static final Parcelable.Creator<ReferencedMessageInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "hint")
    public final String hint;
    @c(a = "referenced_message_id")
    public final Long referenced_message_id;
    @c(a = "root_message_conv_index")
    public final Long root_message_conv_index;
    @c(a = "root_message_id")
    public final Long root_message_id;

    static final class ProtoAdapter_ReferencedMessageInfo extends ProtoAdapter<ReferencedMessageInfo> {
        static {
            Covode.recordClassIndex(23716);
        }

        public ProtoAdapter_ReferencedMessageInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ReferencedMessageInfo.class);
        }

        public final ReferencedMessageInfo redact(ReferencedMessageInfo referencedMessageInfo) {
            Builder newBuilder = referencedMessageInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReferencedMessageInfo referencedMessageInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, referencedMessageInfo.referenced_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referencedMessageInfo.hint) + ProtoAdapter.INT64.encodedSizeWithTag(3, referencedMessageInfo.root_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, referencedMessageInfo.root_message_conv_index) + referencedMessageInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReferencedMessageInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.referenced_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.hint(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.root_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.root_message_conv_index(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReferencedMessageInfo referencedMessageInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, referencedMessageInfo.referenced_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referencedMessageInfo.hint);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, referencedMessageInfo.root_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, referencedMessageInfo.root_message_conv_index);
            protoWriter.writeBytes(referencedMessageInfo.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23714);
        ProtoAdapter_ReferencedMessageInfo protoAdapter_ReferencedMessageInfo = new ProtoAdapter_ReferencedMessageInfo();
        ADAPTER = protoAdapter_ReferencedMessageInfo;
        CREATOR = AndroidMessage.newCreator(protoAdapter_ReferencedMessageInfo);
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.referenced_message_id = this.referenced_message_id;
        builder.hint = this.hint;
        builder.root_message_id = this.root_message_id;
        builder.root_message_conv_index = this.root_message_conv_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReferencedMessageInfo" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ReferencedMessageInfo, Builder> {
        public String hint;
        public Long referenced_message_id;
        public Long root_message_conv_index;
        public Long root_message_id;

        static {
            Covode.recordClassIndex(23715);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReferencedMessageInfo build() {
            Long l2 = this.referenced_message_id;
            if (l2 != null && this.hint != null) {
                return new ReferencedMessageInfo(this.referenced_message_id, this.hint, this.root_message_id, this.root_message_conv_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "referenced_message_id", this.hint, "hint");
        }

        public final Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public final Builder referenced_message_id(Long l2) {
            this.referenced_message_id = l2;
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

    public ReferencedMessageInfo(Long l2, String str, Long l3, Long l4) {
        this(l2, str, l3, l4, i.EMPTY);
    }

    public ReferencedMessageInfo(Long l2, String str, Long l3, Long l4, i iVar) {
        super(ADAPTER, iVar);
        this.referenced_message_id = l2;
        this.hint = str;
        this.root_message_id = l3;
        this.root_message_conv_index = l4;
    }
}
