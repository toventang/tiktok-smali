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

public final class PreviewerGetConversationInfoListRequestBody extends Message<PreviewerGetConversationInfoListRequestBody, Builder> {
    public static final ProtoAdapter<PreviewerGetConversationInfoListRequestBody> ADAPTER = new ProtoAdapter_PreviewerGetConversationInfoListRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    static final class ProtoAdapter_PreviewerGetConversationInfoListRequestBody extends ProtoAdapter<PreviewerGetConversationInfoListRequestBody> {
        static {
            Covode.recordClassIndex(23679);
        }

        public ProtoAdapter_PreviewerGetConversationInfoListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerGetConversationInfoListRequestBody.class);
        }

        public final int encodedSize(PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListRequestBody.conversation_info_list) + previewerGetConversationInfoListRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody redact(com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.GetConversationInfoV2RequestBody> r0 = com.bytedance.im.core.proto.GetConversationInfoV2RequestBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody.ProtoAdapter_PreviewerGetConversationInfoListRequestBody.redact(com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody):com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerGetConversationInfoListRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListRequestBody.conversation_info_list);
            protoWriter.writeBytes(previewerGetConversationInfoListRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PreviewerGetConversationInfoListRequestBody, Builder> {
        public List<GetConversationInfoV2RequestBody> conversation_info_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23678);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerGetConversationInfoListRequestBody build() {
            return new PreviewerGetConversationInfoListRequestBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<GetConversationInfoV2RequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23677);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerGetConversationInfoListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PreviewerGetConversationInfoListRequestBody" + h.f38770a.b(this).toString();
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, i.EMPTY);
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
