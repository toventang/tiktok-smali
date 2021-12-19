package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class MessageByInitRequestBody extends Message<MessageByInitRequestBody, Builder> {
    public static final ProtoAdapter<MessageByInitRequestBody> ADAPTER = new ProtoAdapter_MessageByInitRequestBody();
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "version")
    public final Long version;

    static final class ProtoAdapter_MessageByInitRequestBody extends ProtoAdapter<MessageByInitRequestBody> {
        static {
            Covode.recordClassIndex(23589);
        }

        public ProtoAdapter_MessageByInitRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageByInitRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessageByInitRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessageByInitRequestBody redact(com.bytedance.im.core.proto.MessageByInitRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MessageByInitRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MessageByInitRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessageByInitRequestBody.ProtoAdapter_MessageByInitRequestBody.redact(com.bytedance.im.core.proto.MessageByInitRequestBody):com.bytedance.im.core.proto.MessageByInitRequestBody");
        }

        public final int encodedSize(MessageByInitRequestBody messageByInitRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messageByInitRequestBody.version) + messageByInitRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageByInitRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.version(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessageByInitRequestBody messageByInitRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messageByInitRequestBody.version);
            protoWriter.writeBytes(messageByInitRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MessageByInitRequestBody, Builder> {
        public Long version;

        static {
            Covode.recordClassIndex(23588);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageByInitRequestBody build() {
            return new MessageByInitRequestBody(this.version, super.buildUnknownFields());
        }

        public final Builder version(Long l2) {
            this.version = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23587);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageByInitRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageByInitRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageByInitRequestBody" + h.f38770a.b(this).toString();
    }

    public MessageByInitRequestBody(Long l2) {
        this(l2, i.EMPTY);
    }

    public MessageByInitRequestBody(Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.version = l2;
    }
}
