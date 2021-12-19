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

public final class BatchUpdateConversationParticipantResponseBody extends Message<BatchUpdateConversationParticipantResponseBody, Builder> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantResponseBody> ADAPTER = new ProtoAdapter_BatchUpdateConversationParticipantResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "callback_failed_participants")
    public final List<UpdateConversationParticipantResult> callback_failed_participants;
    @c(a = "failed_participants")
    public final List<Long> failed_participants;
    @c(a = "success_participants")
    public final List<UpdateConversationParticipantResult> success_participants;

    static final class ProtoAdapter_BatchUpdateConversationParticipantResponseBody extends ProtoAdapter<BatchUpdateConversationParticipantResponseBody> {
        static {
            Covode.recordClassIndex(23223);
        }

        public ProtoAdapter_BatchUpdateConversationParticipantResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchUpdateConversationParticipantResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody redact(com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.UpdateConversationParticipantResult> r1 = r2.success_participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.UpdateConversationParticipantResult> r0 = com.bytedance.im.core.proto.UpdateConversationParticipantResult.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.bytedance.im.core.proto.UpdateConversationParticipantResult> r1 = r2.callback_failed_participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.UpdateConversationParticipantResult> r0 = com.bytedance.im.core.proto.UpdateConversationParticipantResult.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody.ProtoAdapter_BatchUpdateConversationParticipantResponseBody.redact(com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody):com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody");
        }

        public final int encodedSize(BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
            return UpdateConversationParticipantResult.ADAPTER.asRepeated().encodedSizeWithTag(1, batchUpdateConversationParticipantResponseBody.success_participants) + UpdateConversationParticipantResult.ADAPTER.asRepeated().encodedSizeWithTag(2, batchUpdateConversationParticipantResponseBody.callback_failed_participants) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, batchUpdateConversationParticipantResponseBody.failed_participants) + batchUpdateConversationParticipantResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.success_participants.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.callback_failed_participants.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
            UpdateConversationParticipantResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchUpdateConversationParticipantResponseBody.success_participants);
            UpdateConversationParticipantResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, batchUpdateConversationParticipantResponseBody.callback_failed_participants);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, batchUpdateConversationParticipantResponseBody.failed_participants);
            protoWriter.writeBytes(batchUpdateConversationParticipantResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchUpdateConversationParticipantResponseBody, Builder> {
        public List<UpdateConversationParticipantResult> callback_failed_participants = Internal.newMutableList();
        public List<Long> failed_participants = Internal.newMutableList();
        public List<UpdateConversationParticipantResult> success_participants = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23222);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchUpdateConversationParticipantResponseBody build() {
            return new BatchUpdateConversationParticipantResponseBody(this.success_participants, this.callback_failed_participants, this.failed_participants, super.buildUnknownFields());
        }

        public final Builder callback_failed_participants(List<UpdateConversationParticipantResult> list) {
            Internal.checkElementsNotNull(list);
            this.callback_failed_participants = list;
            return this;
        }

        public final Builder failed_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_participants = list;
            return this;
        }

        public final Builder success_participants(List<UpdateConversationParticipantResult> list) {
            Internal.checkElementsNotNull(list);
            this.success_participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23221);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchUpdateConversationParticipantResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchUpdateConversationParticipantResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.success_participants = Internal.copyOf("success_participants", this.success_participants);
        builder.callback_failed_participants = Internal.copyOf("callback_failed_participants", this.callback_failed_participants);
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3) {
        this(list, list2, list3, i.EMPTY);
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3, i iVar) {
        super(ADAPTER, iVar);
        this.success_participants = Internal.immutableCopyOf("success_participants", list);
        this.callback_failed_participants = Internal.immutableCopyOf("callback_failed_participants", list2);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list3);
    }
}
