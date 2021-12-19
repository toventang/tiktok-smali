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

public final class BatchMarkConversationReadRequestBody extends Message<BatchMarkConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<BatchMarkConversationReadRequestBody> ADAPTER = new ProtoAdapter_BatchMarkConversationReadRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "mark_read_requests")
    public final List<MarkConversationReadRequestBody> mark_read_requests;

    static final class ProtoAdapter_BatchMarkConversationReadRequestBody extends ProtoAdapter<BatchMarkConversationReadRequestBody> {
        static {
            Covode.recordClassIndex(23211);
        }

        public ProtoAdapter_BatchMarkConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchMarkConversationReadRequestBody.class);
        }

        public final int encodedSize(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            return MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadRequestBody.mark_read_requests) + batchMarkConversationReadRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody redact(com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MarkConversationReadRequestBody> r1 = r2.mark_read_requests
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MarkConversationReadRequestBody> r0 = com.bytedance.im.core.proto.MarkConversationReadRequestBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody.ProtoAdapter_BatchMarkConversationReadRequestBody.redact(com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody):com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchMarkConversationReadRequestBody decode(ProtoReader protoReader) {
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
                    builder.mark_read_requests.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadRequestBody.mark_read_requests);
            protoWriter.writeBytes(batchMarkConversationReadRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchMarkConversationReadRequestBody, Builder> {
        public List<MarkConversationReadRequestBody> mark_read_requests = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23210);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchMarkConversationReadRequestBody build() {
            return new BatchMarkConversationReadRequestBody(this.mark_read_requests, super.buildUnknownFields());
        }

        public final Builder mark_read_requests(List<MarkConversationReadRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.mark_read_requests = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23209);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchMarkConversationReadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.mark_read_requests = Internal.copyOf("mark_read_requests", this.mark_read_requests);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchMarkConversationReadRequestBody" + h.f38770a.b(this).toString();
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list) {
        this(list, i.EMPTY);
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list, i iVar) {
        super(ADAPTER, iVar);
        this.mark_read_requests = Internal.immutableCopyOf("mark_read_requests", list);
    }
}
