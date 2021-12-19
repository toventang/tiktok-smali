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

public final class DeleteStrangerMessageRequestBody extends Message<DeleteStrangerMessageRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerMessageRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "server_message_id")
    public final Long server_message_id;

    static final class ProtoAdapter_DeleteStrangerMessageRequestBody extends ProtoAdapter<DeleteStrangerMessageRequestBody> {
        static {
            Covode.recordClassIndex(23383);
        }

        public ProtoAdapter_DeleteStrangerMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody redact(com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody.ProtoAdapter_DeleteStrangerMessageRequestBody.redact(com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody):com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody");
        }

        public final int encodedSize(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerMessageRequestBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteStrangerMessageRequestBody.conversation_short_id) + deleteStrangerMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerMessageRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerMessageRequestBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteStrangerMessageRequestBody.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerMessageRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DeleteStrangerMessageRequestBody, Builder> {
        public Long conversation_short_id;
        public Long server_message_id;

        static {
            Covode.recordClassIndex(23382);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerMessageRequestBody build() {
            return new DeleteStrangerMessageRequestBody(this.server_message_id, this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder server_message_id(Long l2) {
            this.server_message_id = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23381);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerMessageRequestBody" + h.f38770a.b(this).toString();
    }

    public DeleteStrangerMessageRequestBody(Long l2, Long l3) {
        this(l2, l3, i.EMPTY);
    }

    public DeleteStrangerMessageRequestBody(Long l2, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.server_message_id = l2;
        this.conversation_short_id = l3;
    }
}
