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

public final class GetConversationInfoListV2ResponseBody extends Message<GetConversationInfoListV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListV2ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    static final class ProtoAdapter_GetConversationInfoListV2ResponseBody extends ProtoAdapter<GetConversationInfoListV2ResponseBody> {
        static {
            Covode.recordClassIndex(23444);
        }

        public ProtoAdapter_GetConversationInfoListV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2ResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2ResponseBody.conversation_info_list) + getConversationInfoListV2ResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody redact(com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody.ProtoAdapter_GetConversationInfoListV2ResponseBody.redact(com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody):com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListV2ResponseBody decode(ProtoReader protoReader) {
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
                    builder.conversation_info_list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2ResponseBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationInfoListV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23443);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoListV2ResponseBody build() {
            return new GetConversationInfoListV2ResponseBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23442);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoListV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoListV2ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list) {
        this(list, i.EMPTY);
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
