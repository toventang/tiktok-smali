package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class CreateConversationV2ResponseBody extends Message<CreateConversationV2ResponseBody, Builder> {
    public static final ProtoAdapter<CreateConversationV2ResponseBody> ADAPTER = new ProtoAdapter_CreateConversationV2ResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "conversation")
    public final ConversationInfoV2 conversation;
    @c(a = "extra_info")
    public final String extra_info;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_CreateConversationV2ResponseBody extends ProtoAdapter<CreateConversationV2ResponseBody> {
        static {
            Covode.recordClassIndex(23362);
        }

        public ProtoAdapter_CreateConversationV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2ResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.CreateConversationV2ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.CreateConversationV2ResponseBody redact(com.bytedance.im.core.proto.CreateConversationV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.CreateConversationV2ResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r1 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = (com.bytedance.im.core.proto.ConversationInfoV2) r0
                r2.conversation = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.CreateConversationV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.CreateConversationV2ResponseBody.ProtoAdapter_CreateConversationV2ResponseBody.redact(com.bytedance.im.core.proto.CreateConversationV2ResponseBody):com.bytedance.im.core.proto.CreateConversationV2ResponseBody");
        }

        public final int encodedSize(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, createConversationV2ResponseBody.conversation) + ProtoAdapter.INT64.encodedSizeWithTag(2, createConversationV2ResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(3, createConversationV2ResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, createConversationV2ResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(5, createConversationV2ResponseBody.status) + createConversationV2ResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreateConversationV2ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation(ConversationInfoV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, createConversationV2ResponseBody.conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, createConversationV2ResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createConversationV2ResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createConversationV2ResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, createConversationV2ResponseBody.status);
            protoWriter.writeBytes(createConversationV2ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CreateConversationV2ResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationInfoV2 conversation;
        public String extra_info;
        public Integer status;

        static {
            Covode.recordClassIndex(23361);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CreateConversationV2ResponseBody build() {
            return new CreateConversationV2ResponseBody(this.conversation, this.check_code, this.check_message, this.extra_info, this.status, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder conversation(ConversationInfoV2 conversationInfoV2) {
            this.conversation = conversationInfoV2;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23360);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "CreateConversationV2ResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.CreateConversationV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CreateConversationV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation = this.conversation;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l2, String str, String str2, Integer num) {
        this(conversationInfoV2, l2, str, str2, num, i.EMPTY);
    }

    public CreateConversationV2ResponseBody(ConversationInfoV2 conversationInfoV2, Long l2, String str, String str2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.conversation = conversationInfoV2;
        this.check_code = l2;
        this.check_message = str;
        this.extra_info = str2;
        this.status = num;
    }
}
