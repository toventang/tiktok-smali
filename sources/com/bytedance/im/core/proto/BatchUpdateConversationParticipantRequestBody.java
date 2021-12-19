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
import com.squareup.wire.internal.Internal;
import java.util.List;
import java.util.Map;
import k.i;

public final class BatchUpdateConversationParticipantRequestBody extends Message<BatchUpdateConversationParticipantRequestBody, Builder> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantRequestBody> ADAPTER = new ProtoAdapter_BatchUpdateConversationParticipantRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_ROLE = 0;
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
    @c(a = "role")
    public final Integer role;

    static final class ProtoAdapter_BatchUpdateConversationParticipantRequestBody extends ProtoAdapter<BatchUpdateConversationParticipantRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        static {
            Covode.recordClassIndex(23220);
        }

        public ProtoAdapter_BatchUpdateConversationParticipantRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchUpdateConversationParticipantRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody redact(com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody.ProtoAdapter_BatchUpdateConversationParticipantRequestBody.redact(com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody):com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody");
        }

        public final int encodedSize(BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, batchUpdateConversationParticipantRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, batchUpdateConversationParticipantRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, batchUpdateConversationParticipantRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, batchUpdateConversationParticipantRequestBody.participants) + ProtoAdapter.INT32.encodedSizeWithTag(5, batchUpdateConversationParticipantRequestBody.role) + this.biz_ext.encodedSizeWithTag(6, batchUpdateConversationParticipantRequestBody.biz_ext) + batchUpdateConversationParticipantRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
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
                            builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.role(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUpdateConversationParticipantRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, batchUpdateConversationParticipantRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, batchUpdateConversationParticipantRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, batchUpdateConversationParticipantRequestBody.participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, batchUpdateConversationParticipantRequestBody.role);
            this.biz_ext.encodeWithTag(protoWriter, 6, batchUpdateConversationParticipantRequestBody.biz_ext);
            protoWriter.writeBytes(batchUpdateConversationParticipantRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchUpdateConversationParticipantRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();
        public Integer role;

        static {
            Covode.recordClassIndex(23219);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchUpdateConversationParticipantRequestBody build() {
            return new BatchUpdateConversationParticipantRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, this.role, this.biz_ext, super.buildUnknownFields());
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

        public final Builder role(Integer num) {
            this.role = num;
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
        Covode.recordClassIndex(23218);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchUpdateConversationParticipantRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchUpdateConversationParticipantRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.role = this.role;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l2, Integer num, List<Long> list, Integer num2, Map<String, String> map) {
        this(str, l2, num, list, num2, map, i.EMPTY);
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l2, Integer num, List<Long> list, Integer num2, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.role = num2;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
