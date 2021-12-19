package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.ResponseBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class BatchGetConversationAuditUnreadResponseBody extends Message<BatchGetConversationAuditUnreadResponseBody, Builder> {
    public static final ProtoAdapter<BatchGetConversationAuditUnreadResponseBody> ADAPTER;
    private static final long serialVersionUID = 0;
    @c(a = "unread_count")
    public final Map<Long, Long> unread_count;

    public static final class Builder extends Message.Builder<BatchGetConversationAuditUnreadResponseBody, Builder> {
        public Map<Long, Long> unread_count = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(23201);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchGetConversationAuditUnreadResponseBody build() {
            return new BatchGetConversationAuditUnreadResponseBody(this.unread_count, super.buildUnknownFields());
        }

        public final Builder unread_count(Map<Long, Long> map) {
            Internal.checkElementsNotNull(map);
            this.unread_count = map;
            return this;
        }
    }

    static final class ProtoAdapter_BatchGetConversationAuditUnreadResponseBody extends ProtoAdapter<BatchGetConversationAuditUnreadResponseBody> {
        private final ProtoAdapter<Map<Long, Long>> unread_count;

        static {
            Covode.recordClassIndex(23202);
        }

        public ProtoAdapter_BatchGetConversationAuditUnreadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchGetConversationAuditUnreadResponseBody.class);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.unread_count = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody redact(com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody.ProtoAdapter_BatchGetConversationAuditUnreadResponseBody.redact(com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody):com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody");
        }

        public final int encodedSize(BatchGetConversationAuditUnreadResponseBody batchGetConversationAuditUnreadResponseBody) {
            return this.unread_count.encodedSizeWithTag(1, batchGetConversationAuditUnreadResponseBody.unread_count) + batchGetConversationAuditUnreadResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationAuditUnreadResponseBody decode(ProtoReader protoReader) {
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
                    builder.unread_count.putAll(this.unread_count.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchGetConversationAuditUnreadResponseBody batchGetConversationAuditUnreadResponseBody) {
            this.unread_count.encodeWithTag(protoWriter, 1, batchGetConversationAuditUnreadResponseBody.unread_count);
            protoWriter.writeBytes(batchGetConversationAuditUnreadResponseBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2042, ADAPTER);
    }

    static {
        Covode.recordClassIndex(23200);
        ProtoAdapter_BatchGetConversationAuditUnreadResponseBody protoAdapter_BatchGetConversationAuditUnreadResponseBody = new ProtoAdapter_BatchGetConversationAuditUnreadResponseBody();
        ADAPTER = protoAdapter_BatchGetConversationAuditUnreadResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2042, protoAdapter_BatchGetConversationAuditUnreadResponseBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchGetConversationAuditUnreadResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.unread_count = Internal.copyOf("unread_count", this.unread_count);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchGetConversationAuditUnreadResponseBody" + h.f38770a.b(this).toString();
    }

    public BatchGetConversationAuditUnreadResponseBody(Map<Long, Long> map) {
        this(map, i.EMPTY);
    }

    public BatchGetConversationAuditUnreadResponseBody(Map<Long, Long> map, i iVar) {
        super(ADAPTER, iVar);
        this.unread_count = Internal.immutableCopyOf("unread_count", map);
    }
}
