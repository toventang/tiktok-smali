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

public final class GetStrangerConversationListResponseBody extends Message<GetStrangerConversationListResponseBody, Builder> {
    public static final ProtoAdapter<GetStrangerConversationListResponseBody> ADAPTER = new ProtoAdapter_GetStrangerConversationListResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Integer DEFAULT_TOTAL_UNREAD = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_list")
    public final List<StrangerConversation> conversation_list;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "next_cursor")
    public final Long next_cursor;
    @c(a = "total_unread")
    public final Integer total_unread;

    static final class ProtoAdapter_GetStrangerConversationListResponseBody extends ProtoAdapter<GetStrangerConversationListResponseBody> {
        static {
            Covode.recordClassIndex(23504);
        }

        public ProtoAdapter_GetStrangerConversationListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetStrangerConversationListResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetStrangerConversationListResponseBody redact(com.bytedance.im.core.proto.GetStrangerConversationListResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetStrangerConversationListResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.StrangerConversation> r1 = r2.conversation_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.StrangerConversation> r0 = com.bytedance.im.core.proto.StrangerConversation.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetStrangerConversationListResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetStrangerConversationListResponseBody.ProtoAdapter_GetStrangerConversationListResponseBody.redact(com.bytedance.im.core.proto.GetStrangerConversationListResponseBody):com.bytedance.im.core.proto.GetStrangerConversationListResponseBody");
        }

        public final int encodedSize(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerConversationListResponseBody.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(3, getStrangerConversationListResponseBody.total_unread) + StrangerConversation.ADAPTER.asRepeated().encodedSizeWithTag(4, getStrangerConversationListResponseBody.conversation_list) + getStrangerConversationListResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerConversationListResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.total_unread(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_list.add(StrangerConversation.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerConversationListResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerConversationListResponseBody.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getStrangerConversationListResponseBody.total_unread);
            StrangerConversation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getStrangerConversationListResponseBody.conversation_list);
            protoWriter.writeBytes(getStrangerConversationListResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetStrangerConversationListResponseBody, Builder> {
        public List<StrangerConversation> conversation_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;
        public Integer total_unread;

        static {
            Covode.recordClassIndex(23503);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetStrangerConversationListResponseBody build() {
            return new GetStrangerConversationListResponseBody(this.next_cursor, this.has_more, this.total_unread, this.conversation_list, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder total_unread(Integer num) {
            this.total_unread = num;
            return this;
        }

        public final Builder conversation_list(List<StrangerConversation> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_list = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetStrangerConversationListResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23502);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetStrangerConversationListResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetStrangerConversationListResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.total_unread = this.total_unread;
        builder.conversation_list = Internal.copyOf("conversation_list", this.conversation_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetStrangerConversationListResponseBody(Long l2, Boolean bool, Integer num, List<StrangerConversation> list) {
        this(l2, bool, num, list, i.EMPTY);
    }

    public GetStrangerConversationListResponseBody(Long l2, Boolean bool, Integer num, List<StrangerConversation> list, i iVar) {
        super(ADAPTER, iVar);
        this.next_cursor = l2;
        this.has_more = bool;
        this.total_unread = num;
        this.conversation_list = Internal.immutableCopyOf("conversation_list", list);
    }
}
