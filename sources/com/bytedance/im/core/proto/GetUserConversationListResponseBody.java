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

public final class GetUserConversationListResponseBody extends Message<GetUserConversationListResponseBody, Builder> {
    public static final ProtoAdapter<GetUserConversationListResponseBody> ADAPTER = new ProtoAdapter_GetUserConversationListResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "list")
    public final List<ConversationInfoV2> list;
    @c(a = "next_cursor")
    public final Long next_cursor;

    static final class ProtoAdapter_GetUserConversationListResponseBody extends ProtoAdapter<GetUserConversationListResponseBody> {
        static {
            Covode.recordClassIndex(23528);
        }

        public ProtoAdapter_GetUserConversationListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetUserConversationListResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetUserConversationListResponseBody redact(com.bytedance.im.core.proto.GetUserConversationListResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetUserConversationListResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetUserConversationListResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetUserConversationListResponseBody.ProtoAdapter_GetUserConversationListResponseBody.redact(com.bytedance.im.core.proto.GetUserConversationListResponseBody):com.bytedance.im.core.proto.GetUserConversationListResponseBody");
        }

        public final int encodedSize(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserConversationListResponseBody.list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserConversationListResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getUserConversationListResponseBody.next_cursor) + getUserConversationListResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetUserConversationListResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetUserConversationListResponseBody getUserConversationListResponseBody) {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserConversationListResponseBody.list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserConversationListResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getUserConversationListResponseBody.next_cursor);
            protoWriter.writeBytes(getUserConversationListResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetUserConversationListResponseBody, Builder> {
        public Boolean has_more;
        public List<ConversationInfoV2> list = Internal.newMutableList();
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23527);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetUserConversationListResponseBody build() {
            return new GetUserConversationListResponseBody(this.list, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder list(List<ConversationInfoV2> list2) {
            Internal.checkElementsNotNull(list2);
            this.list = list2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23526);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetUserConversationListResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetUserConversationListResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.list = Internal.copyOf("list", this.list);
        builder.has_more = this.has_more;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetUserConversationListResponseBody" + h.f38770a.b(this).toString();
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list2, Boolean bool, Long l2) {
        this(list2, bool, l2, i.EMPTY);
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list2, Boolean bool, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.list = Internal.immutableCopyOf("list", list2);
        this.has_more = bool;
        this.next_cursor = l2;
    }
}
