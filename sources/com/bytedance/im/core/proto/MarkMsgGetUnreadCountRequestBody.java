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

public final class MarkMsgGetUnreadCountRequestBody extends Message<MarkMsgGetUnreadCountRequestBody, Builder> {
    public static final ProtoAdapter<MarkMsgGetUnreadCountRequestBody> ADAPTER = new ProtoAdapter_MarkMsgGetUnreadCountRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_GET_TOTAL = false;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "get_total")
    public final Boolean get_total;
    @c(a = "tags")
    public final List<Long> tags;

    static final class ProtoAdapter_MarkMsgGetUnreadCountRequestBody extends ProtoAdapter<MarkMsgGetUnreadCountRequestBody> {
        static {
            Covode.recordClassIndex(23558);
        }

        public ProtoAdapter_MarkMsgGetUnreadCountRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMsgGetUnreadCountRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody redact(com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody.ProtoAdapter_MarkMsgGetUnreadCountRequestBody.redact(com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody):com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody");
        }

        public final int encodedSize(MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgGetUnreadCountRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgGetUnreadCountRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, markMsgGetUnreadCountRequestBody.conversation_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(4, markMsgGetUnreadCountRequestBody.get_total) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(5, markMsgGetUnreadCountRequestBody.tags) + markMsgGetUnreadCountRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgGetUnreadCountRequestBody decode(ProtoReader protoReader) {
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
                    builder.get_total(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.tags.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgGetUnreadCountRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgGetUnreadCountRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, markMsgGetUnreadCountRequestBody.conversation_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, markMsgGetUnreadCountRequestBody.get_total);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 5, markMsgGetUnreadCountRequestBody.tags);
            protoWriter.writeBytes(markMsgGetUnreadCountRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MarkMsgGetUnreadCountRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean get_total;
        public List<Long> tags = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23557);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMsgGetUnreadCountRequestBody build() {
            return new MarkMsgGetUnreadCountRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.get_total, this.tags, super.buildUnknownFields());
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

        public final Builder get_total(Boolean bool) {
            this.get_total = bool;
            return this;
        }

        public final Builder tags(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.tags = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMsgGetUnreadCountRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23556);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMsgGetUnreadCountRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.get_total = this.get_total;
        builder.tags = Internal.copyOf("tags", this.tags);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l2, Boolean bool, List<Long> list) {
        this(str, num, l2, bool, list, i.EMPTY);
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l2, Boolean bool, List<Long> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.get_total = bool;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
