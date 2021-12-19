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

public final class MarkStrangerConversationReadRequestBody extends Message<MarkStrangerConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<MarkStrangerConversationReadRequestBody> ADAPTER = new ProtoAdapter_MarkStrangerConversationReadRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;

    static final class ProtoAdapter_MarkStrangerConversationReadRequestBody extends ProtoAdapter<MarkStrangerConversationReadRequestBody> {
        static {
            Covode.recordClassIndex(23576);
        }

        public ProtoAdapter_MarkStrangerConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerConversationReadRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody redact(com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody.ProtoAdapter_MarkStrangerConversationReadRequestBody.redact(com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody):com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody");
        }

        public final int encodedSize(MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, markStrangerConversationReadRequestBody.conversation_short_id) + markStrangerConversationReadRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkStrangerConversationReadRequestBody decode(ProtoReader protoReader) {
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
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markStrangerConversationReadRequestBody.conversation_short_id);
            protoWriter.writeBytes(markStrangerConversationReadRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MarkStrangerConversationReadRequestBody, Builder> {
        public Long conversation_short_id;

        static {
            Covode.recordClassIndex(23575);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkStrangerConversationReadRequestBody build() {
            return new MarkStrangerConversationReadRequestBody(this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23574);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkStrangerConversationReadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkStrangerConversationReadRequestBody" + h.f38770a.b(this).toString();
    }

    public MarkStrangerConversationReadRequestBody(Long l2) {
        this(l2, i.EMPTY);
    }

    public MarkStrangerConversationReadRequestBody(Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
    }
}
