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
import k.i;

public final class BatchGetConversationParticipantsReadIndexRequestBody extends Message<BatchGetConversationParticipantsReadIndexRequestBody, Builder> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody> ADAPTER = new ProtoAdapter_BatchGetConversationParticipantsReadIndexRequestBody();
    public static final Boolean DEFAULT_MIN_INDEX_REQUIRED = false;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final List<String> conversation_id;
    @c(a = "conversation_short_id")
    public final List<Long> conversation_short_id;
    @c(a = "min_index_required")
    public final Boolean min_index_required;
    @c(a = "request_from")
    public final String request_from;

    static final class ProtoAdapter_BatchGetConversationParticipantsReadIndexRequestBody extends ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody> {
        static {
            Covode.recordClassIndex(23205);
        }

        public ProtoAdapter_BatchGetConversationParticipantsReadIndexRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationParticipantsReadIndexRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody redact(com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody.ProtoAdapter_BatchGetConversationParticipantsReadIndexRequestBody.redact(com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody):com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody");
        }

        public final int encodedSize(BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexRequestBody.conversation_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, batchGetConversationParticipantsReadIndexRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, batchGetConversationParticipantsReadIndexRequestBody.request_from) + ProtoAdapter.BOOL.encodedSizeWithTag(4, batchGetConversationParticipantsReadIndexRequestBody.min_index_required) + batchGetConversationParticipantsReadIndexRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationParticipantsReadIndexRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_id.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_short_id.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.request_from(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.min_index_required(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationParticipantsReadIndexRequestBody.conversation_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, batchGetConversationParticipantsReadIndexRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, batchGetConversationParticipantsReadIndexRequestBody.request_from);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, batchGetConversationParticipantsReadIndexRequestBody.min_index_required);
            protoWriter.writeBytes(batchGetConversationParticipantsReadIndexRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchGetConversationParticipantsReadIndexRequestBody, Builder> {
        public List<String> conversation_id = Internal.newMutableList();
        public List<Long> conversation_short_id = Internal.newMutableList();
        public Boolean min_index_required;
        public String request_from;

        static {
            Covode.recordClassIndex(23204);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchGetConversationParticipantsReadIndexRequestBody build() {
            return new BatchGetConversationParticipantsReadIndexRequestBody(this.conversation_id, this.conversation_short_id, this.request_from, this.min_index_required, super.buildUnknownFields());
        }

        public final Builder min_index_required(Boolean bool) {
            this.min_index_required = bool;
            return this;
        }

        public final Builder request_from(String str) {
            this.request_from = str;
            return this;
        }

        public final Builder conversation_id(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_id = list;
            return this;
        }

        public final Builder conversation_short_id(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_short_id = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23203);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchGetConversationParticipantsReadIndexRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchGetConversationParticipantsReadIndexRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = Internal.copyOf("conversation_id", this.conversation_id);
        builder.conversation_short_id = Internal.copyOf("conversation_short_id", this.conversation_short_id);
        builder.request_from = this.request_from;
        builder.min_index_required = this.min_index_required;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool) {
        this(list, list2, str, bool, i.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = Internal.immutableCopyOf("conversation_id", list);
        this.conversation_short_id = Internal.immutableCopyOf("conversation_short_id", list2);
        this.request_from = str;
        this.min_index_required = bool;
    }
}
