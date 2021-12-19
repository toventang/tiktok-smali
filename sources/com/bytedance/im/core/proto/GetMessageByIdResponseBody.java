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

public final class GetMessageByIdResponseBody extends Message<GetMessageByIdResponseBody, Builder> {
    public static final ProtoAdapter<GetMessageByIdResponseBody> ADAPTER = new ProtoAdapter_GetMessageByIdResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "msg_info")
    public final MessageInfo msg_info;

    static final class ProtoAdapter_GetMessageByIdResponseBody extends ProtoAdapter<GetMessageByIdResponseBody> {
        static {
            Covode.recordClassIndex(23474);
        }

        public ProtoAdapter_GetMessageByIdResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageByIdResponseBody.class);
        }

        public final int encodedSize(GetMessageByIdResponseBody getMessageByIdResponseBody) {
            return MessageInfo.ADAPTER.encodedSizeWithTag(1, getMessageByIdResponseBody.msg_info) + getMessageByIdResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetMessageByIdResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetMessageByIdResponseBody redact(com.bytedance.im.core.proto.GetMessageByIdResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetMessageByIdResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageInfo r0 = r2.msg_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageInfo> r1 = com.bytedance.im.core.proto.MessageInfo.ADAPTER
                com.bytedance.im.core.proto.MessageInfo r0 = r2.msg_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageInfo r0 = (com.bytedance.im.core.proto.MessageInfo) r0
                r2.msg_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageByIdResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetMessageByIdResponseBody.ProtoAdapter_GetMessageByIdResponseBody.redact(com.bytedance.im.core.proto.GetMessageByIdResponseBody):com.bytedance.im.core.proto.GetMessageByIdResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageByIdResponseBody decode(ProtoReader protoReader) {
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
                    builder.msg_info(MessageInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessageByIdResponseBody getMessageByIdResponseBody) {
            MessageInfo.ADAPTER.encodeWithTag(protoWriter, 1, getMessageByIdResponseBody.msg_info);
            protoWriter.writeBytes(getMessageByIdResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetMessageByIdResponseBody, Builder> {
        public MessageInfo msg_info;

        static {
            Covode.recordClassIndex(23473);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageByIdResponseBody build() {
            return new GetMessageByIdResponseBody(this.msg_info, super.buildUnknownFields());
        }

        public final Builder msg_info(MessageInfo messageInfo) {
            this.msg_info = messageInfo;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23472);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageByIdResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageByIdResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.msg_info = this.msg_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageByIdResponseBody" + h.f38770a.b(this).toString();
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo) {
        this(messageInfo, i.EMPTY);
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo, i iVar) {
        super(ADAPTER, iVar);
        this.msg_info = messageInfo;
    }
}
