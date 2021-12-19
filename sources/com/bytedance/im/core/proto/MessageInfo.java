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

public final class MessageInfo extends Message<MessageInfo, Builder> {
    public static final ProtoAdapter<MessageInfo> ADAPTER = new ProtoAdapter_MessageInfo();
    public static final MessageStatus DEFAULT_STATUS = MessageStatus.AVAILABLE;
    private static final long serialVersionUID = 0;
    @c(a = "body")
    public final MessageBody body;
    @c(a = "status")
    public final MessageStatus status;

    static final class ProtoAdapter_MessageInfo extends ProtoAdapter<MessageInfo> {
        static {
            Covode.recordClassIndex(23597);
        }

        public ProtoAdapter_MessageInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageInfo.class);
        }

        public final int encodedSize(MessageInfo messageInfo) {
            return MessageStatus.ADAPTER.encodedSizeWithTag(1, messageInfo.status) + MessageBody.ADAPTER.encodedSizeWithTag(2, messageInfo.body) + messageInfo.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessageInfo$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessageInfo redact(com.bytedance.im.core.proto.MessageInfo r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessageInfo$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageBody r0 = r2.body
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r1 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.bytedance.im.core.proto.MessageBody r0 = r2.body
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageBody r0 = (com.bytedance.im.core.proto.MessageBody) r0
                r2.body = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessageInfo r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessageInfo.ProtoAdapter_MessageInfo.redact(com.bytedance.im.core.proto.MessageInfo):com.bytedance.im.core.proto.MessageInfo");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.status(MessageStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.body(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessageInfo messageInfo) {
            MessageStatus.ADAPTER.encodeWithTag(protoWriter, 1, messageInfo.status);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, messageInfo.body);
            protoWriter.writeBytes(messageInfo.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MessageInfo, Builder> {
        public MessageBody body;
        public MessageStatus status;

        static {
            Covode.recordClassIndex(23596);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageInfo build() {
            return new MessageInfo(this.status, this.body, super.buildUnknownFields());
        }

        public final Builder body(MessageBody messageBody) {
            this.body = messageBody;
            return this;
        }

        public final Builder status(MessageStatus messageStatus) {
            this.status = messageStatus;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23595);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.body = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageInfo" + h.f38770a.b(this).toString();
    }

    public MessageInfo(MessageStatus messageStatus, MessageBody messageBody) {
        this(messageStatus, messageBody, i.EMPTY);
    }

    public MessageInfo(MessageStatus messageStatus, MessageBody messageBody, i iVar) {
        super(ADAPTER, iVar);
        this.status = messageStatus;
        this.body = messageBody;
    }
}
