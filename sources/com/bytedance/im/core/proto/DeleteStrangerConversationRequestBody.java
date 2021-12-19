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

public final class DeleteStrangerConversationRequestBody extends Message<DeleteStrangerConversationRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerConversationRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerConversationRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;

    static final class ProtoAdapter_DeleteStrangerConversationRequestBody extends ProtoAdapter<DeleteStrangerConversationRequestBody> {
        static {
            Covode.recordClassIndex(23377);
        }

        public ProtoAdapter_DeleteStrangerConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerConversationRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody redact(com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody.ProtoAdapter_DeleteStrangerConversationRequestBody.redact(com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody):com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody");
        }

        public final int encodedSize(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerConversationRequestBody.conversation_short_id) + deleteStrangerConversationRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerConversationRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerConversationRequestBody.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerConversationRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DeleteStrangerConversationRequestBody, Builder> {
        public Long conversation_short_id;

        static {
            Covode.recordClassIndex(23376);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerConversationRequestBody build() {
            return new DeleteStrangerConversationRequestBody(this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23375);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerConversationRequestBody" + h.f38770a.b(this).toString();
    }

    public DeleteStrangerConversationRequestBody(Long l2) {
        this(l2, i.EMPTY);
    }

    public DeleteStrangerConversationRequestBody(Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
    }
}
