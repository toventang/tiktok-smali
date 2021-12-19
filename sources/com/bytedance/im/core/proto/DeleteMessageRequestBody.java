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

public final class DeleteMessageRequestBody extends Message<DeleteMessageRequestBody, Builder> {
    public static final ProtoAdapter<DeleteMessageRequestBody> ADAPTER = new ProtoAdapter_DeleteMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "message_id")
    public final Long message_id;

    static final class ProtoAdapter_DeleteMessageRequestBody extends ProtoAdapter<DeleteMessageRequestBody> {
        static {
            Covode.recordClassIndex(23368);
        }

        public ProtoAdapter_DeleteMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteMessageRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteMessageRequestBody redact(com.bytedance.im.core.proto.DeleteMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteMessageRequestBody.ProtoAdapter_DeleteMessageRequestBody.redact(com.bytedance.im.core.proto.DeleteMessageRequestBody):com.bytedance.im.core.proto.DeleteMessageRequestBody");
        }

        public final int encodedSize(DeleteMessageRequestBody deleteMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteMessageRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, deleteMessageRequestBody.message_id) + deleteMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.message_id(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DeleteMessageRequestBody deleteMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, deleteMessageRequestBody.message_id);
            protoWriter.writeBytes(deleteMessageRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DeleteMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long message_id;

        static {
            Covode.recordClassIndex(23367);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteMessageRequestBody build() {
            return new DeleteMessageRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.message_id, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder message_id(Long l2) {
            this.message_id = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23366);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.message_id = this.message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteMessageRequestBody" + h.f38770a.b(this).toString();
    }

    public DeleteMessageRequestBody(String str, Long l2, Integer num, Long l3) {
        this(str, l2, num, l3, i.EMPTY);
    }

    public DeleteMessageRequestBody(String str, Long l2, Integer num, Long l3, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.message_id = l3;
    }
}
