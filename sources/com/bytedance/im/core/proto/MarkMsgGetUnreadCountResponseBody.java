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

public final class MarkMsgGetUnreadCountResponseBody extends Message<MarkMsgGetUnreadCountResponseBody, Builder> {
    public static final ProtoAdapter<MarkMsgGetUnreadCountResponseBody> ADAPTER = new ProtoAdapter_MarkMsgGetUnreadCountResponseBody();
    public static final Long DEFAULT_TOTAL_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "failed_tag_list")
    public final List<Long> failed_tag_list;
    @c(a = "tag_unread_count")
    public final Map<Long, Long> tag_unread_count;
    @c(a = "total_count")
    public final Long total_count;

    public static final class Builder extends Message.Builder<MarkMsgGetUnreadCountResponseBody, Builder> {
        public List<Long> failed_tag_list = Internal.newMutableList();
        public Map<Long, Long> tag_unread_count = Internal.newMutableMap();
        public Long total_count;

        static {
            Covode.recordClassIndex(23560);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMsgGetUnreadCountResponseBody build() {
            return new MarkMsgGetUnreadCountResponseBody(this.total_count, this.tag_unread_count, this.failed_tag_list, super.buildUnknownFields());
        }

        public final Builder total_count(Long l2) {
            this.total_count = l2;
            return this;
        }

        public final Builder failed_tag_list(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_tag_list = list;
            return this;
        }

        public final Builder tag_unread_count(Map<Long, Long> map) {
            Internal.checkElementsNotNull(map);
            this.tag_unread_count = map;
            return this;
        }
    }

    static final class ProtoAdapter_MarkMsgGetUnreadCountResponseBody extends ProtoAdapter<MarkMsgGetUnreadCountResponseBody> {
        private final ProtoAdapter<Map<Long, Long>> tag_unread_count;

        static {
            Covode.recordClassIndex(23561);
        }

        public ProtoAdapter_MarkMsgGetUnreadCountResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMsgGetUnreadCountResponseBody.class);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.tag_unread_count = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody redact(com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody.ProtoAdapter_MarkMsgGetUnreadCountResponseBody.redact(com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody):com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody");
        }

        public final int encodedSize(MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, markMsgGetUnreadCountResponseBody.total_count) + this.tag_unread_count.encodedSizeWithTag(2, markMsgGetUnreadCountResponseBody.tag_unread_count) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, markMsgGetUnreadCountResponseBody.failed_tag_list) + markMsgGetUnreadCountResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgGetUnreadCountResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.total_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.tag_unread_count.putAll(this.tag_unread_count.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.failed_tag_list.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markMsgGetUnreadCountResponseBody.total_count);
            this.tag_unread_count.encodeWithTag(protoWriter, 2, markMsgGetUnreadCountResponseBody.tag_unread_count);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, markMsgGetUnreadCountResponseBody.failed_tag_list);
            protoWriter.writeBytes(markMsgGetUnreadCountResponseBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23559);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMsgGetUnreadCountResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMsgGetUnreadCountResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.total_count = this.total_count;
        builder.tag_unread_count = Internal.copyOf("tag_unread_count", this.tag_unread_count);
        builder.failed_tag_list = Internal.copyOf("failed_tag_list", this.failed_tag_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MarkMsgGetUnreadCountResponseBody(Long l2, Map<Long, Long> map, List<Long> list) {
        this(l2, map, list, i.EMPTY);
    }

    public MarkMsgGetUnreadCountResponseBody(Long l2, Map<Long, Long> map, List<Long> list, i iVar) {
        super(ADAPTER, iVar);
        this.total_count = l2;
        this.tag_unread_count = Internal.immutableCopyOf("tag_unread_count", map);
        this.failed_tag_list = Internal.immutableCopyOf("failed_tag_list", list);
    }
}
