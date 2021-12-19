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

public final class PreviewerGetConversationInfoListResponseBody extends Message<PreviewerGetConversationInfoListResponseBody, Builder> {
    public static final ProtoAdapter<PreviewerGetConversationInfoListResponseBody> ADAPTER = new ProtoAdapter_PreviewerGetConversationInfoListResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_PreviewerGetConversationInfoListResponseBody extends ProtoAdapter<PreviewerGetConversationInfoListResponseBody> {
        static {
            Covode.recordClassIndex(23682);
        }

        public ProtoAdapter_PreviewerGetConversationInfoListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewerGetConversationInfoListResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody redact(com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationInfoV2> r1 = r2.conversation_info_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r0 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody.ProtoAdapter_PreviewerGetConversationInfoListResponseBody.redact(com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody):com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody");
        }

        public final int encodedSize(PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListResponseBody.conversation_info_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, previewerGetConversationInfoListResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, previewerGetConversationInfoListResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, previewerGetConversationInfoListResponseBody.check_message) + previewerGetConversationInfoListResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerGetConversationInfoListResponseBody decode(ProtoReader protoReader) {
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
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody) {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListResponseBody.conversation_info_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, previewerGetConversationInfoListResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, previewerGetConversationInfoListResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, previewerGetConversationInfoListResponseBody.check_message);
            protoWriter.writeBytes(previewerGetConversationInfoListResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PreviewerGetConversationInfoListResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();
        public Integer status;

        static {
            Covode.recordClassIndex(23681);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreviewerGetConversationInfoListResponseBody build() {
            return new PreviewerGetConversationInfoListResponseBody(this.conversation_info_list, this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23680);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PreviewerGetConversationInfoListResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PreviewerGetConversationInfoListResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreviewerGetConversationInfoListResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l2, String str) {
        this(list, num, l2, str, i.EMPTY);
    }

    public PreviewerGetConversationInfoListResponseBody(List<ConversationInfoV2> list, Integer num, Long l2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
