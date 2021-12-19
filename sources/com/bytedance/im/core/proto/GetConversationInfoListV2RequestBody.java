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

public final class GetConversationInfoListV2RequestBody extends Message<GetConversationInfoListV2RequestBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListV2RequestBody> ADAPTER = new ProtoAdapter_GetConversationInfoListV2RequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    static final class ProtoAdapter_GetConversationInfoListV2RequestBody extends ProtoAdapter<GetConversationInfoListV2RequestBody> {
        static {
            Covode.recordClassIndex(23441);
        }

        public ProtoAdapter_GetConversationInfoListV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2RequestBody.class);
        }

        public final int encodedSize(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2RequestBody.conversation_info_list) + getConversationInfoListV2RequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody redact(com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r0 = com.bytedance.im.core.proto.GetConversationInfoV2RequestBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody.ProtoAdapter_GetConversationInfoListV2RequestBody.redact(com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody):com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListV2RequestBody decode(ProtoReader protoReader) {
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
                    builder.conversation_info_list.add(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2RequestBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationInfoListV2RequestBody, Builder> {
        public List<GetConversationInfoV2RequestBody> conversation_info_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23440);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoListV2RequestBody build() {
            return new GetConversationInfoListV2RequestBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<GetConversationInfoV2RequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23439);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoListV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoListV2RequestBody" + h.f38770a.b(this).toString();
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, i.EMPTY);
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
