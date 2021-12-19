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

public final class StrangerNewMessageNotify extends Message<StrangerNewMessageNotify, Builder> {
    public static final ProtoAdapter<StrangerNewMessageNotify> ADAPTER = new ProtoAdapter_StrangerNewMessageNotify();
    private static final long serialVersionUID = 0;
    @c(a = "message")
    public final MessageBody message;

    static final class ProtoAdapter_StrangerNewMessageNotify extends ProtoAdapter<StrangerNewMessageNotify> {
        static {
            Covode.recordClassIndex(23784);
        }

        public ProtoAdapter_StrangerNewMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, StrangerNewMessageNotify.class);
        }

        public final int encodedSize(StrangerNewMessageNotify strangerNewMessageNotify) {
            return MessageBody.ADAPTER.encodedSizeWithTag(2, strangerNewMessageNotify.message) + strangerNewMessageNotify.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.StrangerNewMessageNotify$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.StrangerNewMessageNotify redact(com.bytedance.im.core.proto.StrangerNewMessageNotify r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.StrangerNewMessageNotify$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageBody r0 = r2.message
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r1 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.bytedance.im.core.proto.MessageBody r0 = r2.message
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageBody r0 = (com.bytedance.im.core.proto.MessageBody) r0
                r2.message = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.StrangerNewMessageNotify r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.StrangerNewMessageNotify.ProtoAdapter_StrangerNewMessageNotify.redact(com.bytedance.im.core.proto.StrangerNewMessageNotify):com.bytedance.im.core.proto.StrangerNewMessageNotify");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StrangerNewMessageNotify decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.message(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StrangerNewMessageNotify strangerNewMessageNotify) {
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, strangerNewMessageNotify.message);
            protoWriter.writeBytes(strangerNewMessageNotify.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<StrangerNewMessageNotify, Builder> {
        public MessageBody message;

        static {
            Covode.recordClassIndex(23783);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StrangerNewMessageNotify build() {
            return new StrangerNewMessageNotify(this.message, super.buildUnknownFields());
        }

        public final Builder message(MessageBody messageBody) {
            this.message = messageBody;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23782);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.StrangerNewMessageNotify$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StrangerNewMessageNotify, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.message = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "StrangerNewMessageNotify" + h.f38770a.b(this).toString();
    }

    public StrangerNewMessageNotify(MessageBody messageBody) {
        this(messageBody, i.EMPTY);
    }

    public StrangerNewMessageNotify(MessageBody messageBody, i iVar) {
        super(ADAPTER, iVar);
        this.message = messageBody;
    }
}
