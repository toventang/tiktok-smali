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

public final class BatchGetConversationParticipantsReadIndexResponseBody extends Message<BatchGetConversationParticipantsReadIndexResponseBody, Builder> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody> ADAPTER = new ProtoAdapter_BatchGetConversationParticipantsReadIndexResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "conversationParticipantsReadIndex")
    public final List<ConversationParticipantReadIndex> conversationParticipantsReadIndex;

    static final class ProtoAdapter_BatchGetConversationParticipantsReadIndexResponseBody extends ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody> {
        static {
            Covode.recordClassIndex(23208);
        }

        public ProtoAdapter_BatchGetConversationParticipantsReadIndexResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationParticipantsReadIndexResponseBody.class);
        }

        public final int encodedSize(BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
            return ConversationParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex) + batchGetConversationParticipantsReadIndexResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody redact(com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationParticipantReadIndex> r1 = r2.conversationParticipantsReadIndex
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationParticipantReadIndex> r0 = com.bytedance.im.core.proto.ConversationParticipantReadIndex.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody.ProtoAdapter_BatchGetConversationParticipantsReadIndexResponseBody.redact(com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody):com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationParticipantsReadIndexResponseBody decode(ProtoReader protoReader) {
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
                    builder.conversationParticipantsReadIndex.add(ConversationParticipantReadIndex.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
            ConversationParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationParticipantsReadIndexResponseBody.conversationParticipantsReadIndex);
            protoWriter.writeBytes(batchGetConversationParticipantsReadIndexResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchGetConversationParticipantsReadIndexResponseBody, Builder> {
        public List<ConversationParticipantReadIndex> conversationParticipantsReadIndex = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23207);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchGetConversationParticipantsReadIndexResponseBody build() {
            return new BatchGetConversationParticipantsReadIndexResponseBody(this.conversationParticipantsReadIndex, super.buildUnknownFields());
        }

        public final Builder conversationParticipantsReadIndex(List<ConversationParticipantReadIndex> list) {
            Internal.checkElementsNotNull(list);
            this.conversationParticipantsReadIndex = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23206);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchGetConversationParticipantsReadIndexResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversationParticipantsReadIndex = Internal.copyOf("conversationParticipantsReadIndex", this.conversationParticipantsReadIndex);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchGetConversationParticipantsReadIndexResponseBody" + h.f38770a.b(this).toString();
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list) {
        this(list, i.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversationParticipantsReadIndex = Internal.immutableCopyOf("conversationParticipantsReadIndex", list);
    }
}
