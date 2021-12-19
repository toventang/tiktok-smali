package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class DeleteConversationRequestBody extends Message<DeleteConversationRequestBody, Builder> {
    public static final ProtoAdapter<DeleteConversationRequestBody> ADAPTER = new ProtoAdapter_DeleteConversationRequestBody();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX_V2 = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "badge_count")
    public final Integer badge_count;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "last_message_index")
    public final Long last_message_index;
    @c(a = "last_message_index_v2")
    public final Long last_message_index_v2;

    static final class ProtoAdapter_DeleteConversationRequestBody extends ProtoAdapter<DeleteConversationRequestBody> {
        static {
            Covode.recordClassIndex(23365);
        }

        public ProtoAdapter_DeleteConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteConversationRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteConversationRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteConversationRequestBody redact(com.bytedance.im.core.proto.DeleteConversationRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteConversationRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteConversationRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteConversationRequestBody.ProtoAdapter_DeleteConversationRequestBody.redact(com.bytedance.im.core.proto.DeleteConversationRequestBody):com.bytedance.im.core.proto.DeleteConversationRequestBody");
        }

        public final int encodedSize(DeleteConversationRequestBody deleteConversationRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteConversationRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteConversationRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteConversationRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, deleteConversationRequestBody.last_message_index) + ProtoAdapter.INT64.encodedSizeWithTag(5, deleteConversationRequestBody.last_message_index_v2) + ProtoAdapter.INT32.encodedSizeWithTag(6, deleteConversationRequestBody.badge_count) + deleteConversationRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.last_message_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.last_message_index_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteConversationRequestBody deleteConversationRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteConversationRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteConversationRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteConversationRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, deleteConversationRequestBody.last_message_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, deleteConversationRequestBody.last_message_index_v2);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, deleteConversationRequestBody.badge_count);
            protoWriter.writeBytes(deleteConversationRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DeleteConversationRequestBody, Builder> {
        public Integer badge_count;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long last_message_index;
        public Long last_message_index_v2;

        static {
            Covode.recordClassIndex(23364);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteConversationRequestBody build() {
            return new DeleteConversationRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.last_message_index, this.last_message_index_v2, this.badge_count, super.buildUnknownFields());
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
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

        public final Builder last_message_index(Long l2) {
            this.last_message_index = l2;
            return this;
        }

        public final Builder last_message_index_v2(Long l2) {
            this.last_message_index_v2 = l2;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteConversationRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23363);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteConversationRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteConversationRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.last_message_index = this.last_message_index;
        builder.last_message_index_v2 = this.last_message_index_v2;
        builder.badge_count = this.badge_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public DeleteConversationRequestBody(String str, Long l2, Integer num, Long l3, Long l4, Integer num2) {
        this(str, l2, num, l3, l4, num2, i.EMPTY);
    }

    public DeleteConversationRequestBody(String str, Long l2, Integer num, Long l3, Long l4, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.last_message_index = l3;
        this.last_message_index_v2 = l4;
        this.badge_count = num2;
    }
}
