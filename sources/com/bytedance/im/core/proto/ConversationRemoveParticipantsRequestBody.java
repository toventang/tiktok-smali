package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import java.util.Map;
import k.i;

public final class ConversationRemoveParticipantsRequestBody extends Message<ConversationRemoveParticipantsRequestBody, Builder> {
    public static final ProtoAdapter<ConversationRemoveParticipantsRequestBody> ADAPTER = new ProtoAdapter_ConversationRemoveParticipantsRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "biz_ext")
    public final Map<String, String> biz_ext;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "participants")
    public final List<Long> participants;

    static final class ProtoAdapter_ConversationRemoveParticipantsRequestBody extends ProtoAdapter<ConversationRemoveParticipantsRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        static {
            Covode.recordClassIndex(23339);
        }

        public ProtoAdapter_ConversationRemoveParticipantsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody redact(com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody.ProtoAdapter_ConversationRemoveParticipantsRequestBody.redact(com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody):com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody");
        }

        public final int encodedSize(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationRemoveParticipantsRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationRemoveParticipantsRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationRemoveParticipantsRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, conversationRemoveParticipantsRequestBody.participants) + this.biz_ext.encodedSizeWithTag(5, conversationRemoveParticipantsRequestBody.biz_ext) + conversationRemoveParticipantsRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRemoveParticipantsRequestBody decode(ProtoReader protoReader) {
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
                } else if (nextTag == 4) {
                    builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationRemoveParticipantsRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, conversationRemoveParticipantsRequestBody.participants);
            this.biz_ext.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsRequestBody.biz_ext);
            protoWriter.writeBytes(conversationRemoveParticipantsRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationRemoveParticipantsRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23338);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationRemoveParticipantsRequestBody build() {
            return new ConversationRemoveParticipantsRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, this.biz_ext, super.buildUnknownFields());
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

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23337);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationRemoveParticipantsRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationRemoveParticipantsRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l2, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l2, num, list, map, i.EMPTY);
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l2, Integer num, List<Long> list, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
