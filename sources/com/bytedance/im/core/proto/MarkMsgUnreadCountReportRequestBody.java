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
import java.util.Map;
import k.i;

public final class MarkMsgUnreadCountReportRequestBody extends Message<MarkMsgUnreadCountReportRequestBody, Builder> {
    public static final ProtoAdapter<MarkMsgUnreadCountReportRequestBody> ADAPTER = new ProtoAdapter_MarkMsgUnreadCountReportRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "tag_unread_count")
    public final Map<Long, Long> tag_unread_count;
    @c(a = "total_unread_count")
    public final Long total_unread_count;

    static final class ProtoAdapter_MarkMsgUnreadCountReportRequestBody extends ProtoAdapter<MarkMsgUnreadCountReportRequestBody> {
        private final ProtoAdapter<Map<Long, Long>> tag_unread_count;

        static {
            Covode.recordClassIndex(23564);
        }

        public ProtoAdapter_MarkMsgUnreadCountReportRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMsgUnreadCountReportRequestBody.class);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.tag_unread_count = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody redact(com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody.ProtoAdapter_MarkMsgUnreadCountReportRequestBody.redact(com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody):com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody");
        }

        public final int encodedSize(MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgUnreadCountReportRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgUnreadCountReportRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, markMsgUnreadCountReportRequestBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, markMsgUnreadCountReportRequestBody.total_unread_count) + this.tag_unread_count.encodedSizeWithTag(5, markMsgUnreadCountReportRequestBody.tag_unread_count) + markMsgUnreadCountReportRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgUnreadCountReportRequestBody decode(ProtoReader protoReader) {
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
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.total_unread_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.tag_unread_count.putAll(this.tag_unread_count.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgUnreadCountReportRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgUnreadCountReportRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, markMsgUnreadCountReportRequestBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, markMsgUnreadCountReportRequestBody.total_unread_count);
            this.tag_unread_count.encodeWithTag(protoWriter, 5, markMsgUnreadCountReportRequestBody.tag_unread_count);
            protoWriter.writeBytes(markMsgUnreadCountReportRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MarkMsgUnreadCountReportRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<Long, Long> tag_unread_count = Internal.newMutableMap();
        public Long total_unread_count;

        static {
            Covode.recordClassIndex(23563);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMsgUnreadCountReportRequestBody build() {
            return new MarkMsgUnreadCountReportRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.total_unread_count, this.tag_unread_count, super.buildUnknownFields());
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

        public final Builder total_unread_count(Long l2) {
            this.total_unread_count = l2;
            return this;
        }

        public final Builder tag_unread_count(Map<Long, Long> map) {
            Internal.checkElementsNotNull(map);
            this.tag_unread_count = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23562);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMsgUnreadCountReportRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMsgUnreadCountReportRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.total_unread_count = this.total_unread_count;
        builder.tag_unread_count = Internal.copyOf("tag_unread_count", this.tag_unread_count);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l2, Long l3, Map<Long, Long> map) {
        this(str, num, l2, l3, map, i.EMPTY);
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l2, Long l3, Map<Long, Long> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.total_unread_count = l3;
        this.tag_unread_count = Internal.immutableCopyOf("tag_unread_count", map);
    }
}
