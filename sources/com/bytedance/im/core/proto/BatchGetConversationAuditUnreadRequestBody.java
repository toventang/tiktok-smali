package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.RequestBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class BatchGetConversationAuditUnreadRequestBody extends Message<BatchGetConversationAuditUnreadRequestBody, Builder> {
    public static final ProtoAdapter<BatchGetConversationAuditUnreadRequestBody> ADAPTER;
    private static final long serialVersionUID = 0;
    @c(a = "conv_short_id")
    public final List<Long> conv_short_id;

    static final class ProtoAdapter_BatchGetConversationAuditUnreadRequestBody extends ProtoAdapter<BatchGetConversationAuditUnreadRequestBody> {
        static {
            Covode.recordClassIndex(23199);
        }

        public ProtoAdapter_BatchGetConversationAuditUnreadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationAuditUnreadRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody redact(com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody.ProtoAdapter_BatchGetConversationAuditUnreadRequestBody.redact(com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody):com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody");
        }

        public final int encodedSize(BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, batchGetConversationAuditUnreadRequestBody.conv_short_id) + batchGetConversationAuditUnreadRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationAuditUnreadRequestBody decode(ProtoReader protoReader) {
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
                    builder.conv_short_id.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchGetConversationAuditUnreadRequestBody batchGetConversationAuditUnreadRequestBody) {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationAuditUnreadRequestBody.conv_short_id);
            protoWriter.writeBytes(batchGetConversationAuditUnreadRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BatchGetConversationAuditUnreadRequestBody, Builder> {
        public List<Long> conv_short_id = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23198);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchGetConversationAuditUnreadRequestBody build() {
            return new BatchGetConversationAuditUnreadRequestBody(this.conv_short_id, super.buildUnknownFields());
        }

        public final Builder conv_short_id(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.conv_short_id = list;
            return this;
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2042, ADAPTER);
    }

    static {
        Covode.recordClassIndex(23197);
        ProtoAdapter_BatchGetConversationAuditUnreadRequestBody protoAdapter_BatchGetConversationAuditUnreadRequestBody = new ProtoAdapter_BatchGetConversationAuditUnreadRequestBody();
        ADAPTER = protoAdapter_BatchGetConversationAuditUnreadRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2042, protoAdapter_BatchGetConversationAuditUnreadRequestBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchGetConversationAuditUnreadRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = Internal.copyOf("conv_short_id", this.conv_short_id);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchGetConversationAuditUnreadRequestBody" + h.f38770a.b(this).toString();
    }

    public BatchGetConversationAuditUnreadRequestBody(List<Long> list) {
        this(list, i.EMPTY);
    }

    public BatchGetConversationAuditUnreadRequestBody(List<Long> list, i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = Internal.immutableCopyOf("conv_short_id", list);
    }
}
