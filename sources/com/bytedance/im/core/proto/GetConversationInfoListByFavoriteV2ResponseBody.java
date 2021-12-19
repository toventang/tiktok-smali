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

public final class GetConversationInfoListByFavoriteV2ResponseBody extends Message<GetConversationInfoListByFavoriteV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListByFavoriteV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListByFavoriteV2ResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "next_cursor")
    public final Long next_cursor;

    static final class ProtoAdapter_GetConversationInfoListByFavoriteV2ResponseBody extends ProtoAdapter<GetConversationInfoListByFavoriteV2ResponseBody> {
        static {
            Covode.recordClassIndex(23435);
        }

        public ProtoAdapter_GetConversationInfoListByFavoriteV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListByFavoriteV2ResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody redact(com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody.ProtoAdapter_GetConversationInfoListByFavoriteV2ResponseBody.redact(com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody):com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody");
        }

        public final int encodedSize(GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByFavoriteV2ResponseBody.conversation_info_list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByFavoriteV2ResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByFavoriteV2ResponseBody.next_cursor) + getConversationInfoListByFavoriteV2ResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListByFavoriteV2ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_info_list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListByFavoriteV2ResponseBody.conversation_info_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getConversationInfoListByFavoriteV2ResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getConversationInfoListByFavoriteV2ResponseBody.next_cursor);
            protoWriter.writeBytes(getConversationInfoListByFavoriteV2ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationInfoListByFavoriteV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23434);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoListByFavoriteV2ResponseBody build() {
            return new GetConversationInfoListByFavoriteV2ResponseBody(this.conversation_info_list, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23433);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoListByFavoriteV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.has_more = this.has_more;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoListByFavoriteV2ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationInfoListByFavoriteV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l2) {
        this(list, bool, l2, i.EMPTY);
    }

    public GetConversationInfoListByFavoriteV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
        this.has_more = bool;
        this.next_cursor = l2;
    }
}
