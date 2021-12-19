package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class MarkStrangerConversationReadResponseBody extends Message<MarkStrangerConversationReadResponseBody, Builder> {
    public static final ProtoAdapter<MarkStrangerConversationReadResponseBody> ADAPTER = new ProtoAdapter_MarkStrangerConversationReadResponseBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_MarkStrangerConversationReadResponseBody extends ProtoAdapter<MarkStrangerConversationReadResponseBody> {
        static {
            Covode.recordClassIndex(23579);
        }

        public ProtoAdapter_MarkStrangerConversationReadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerConversationReadResponseBody.class);
        }

        public final int encodedSize(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            return markStrangerConversationReadResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody redact(com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody.ProtoAdapter_MarkStrangerConversationReadResponseBody.redact(com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody):com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkStrangerConversationReadResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            protoWriter.writeBytes(markStrangerConversationReadResponseBody.unknownFields());
        }
    }

    public MarkStrangerConversationReadResponseBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<MarkStrangerConversationReadResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23578);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkStrangerConversationReadResponseBody build() {
            return new MarkStrangerConversationReadResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23577);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkStrangerConversationReadResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkStrangerConversationReadResponseBody" + h.f38770a.b(this).toString();
    }

    public MarkStrangerConversationReadResponseBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
