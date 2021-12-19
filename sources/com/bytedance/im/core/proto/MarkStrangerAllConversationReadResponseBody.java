package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class MarkStrangerAllConversationReadResponseBody extends Message<MarkStrangerAllConversationReadResponseBody, Builder> {
    public static final ProtoAdapter<MarkStrangerAllConversationReadResponseBody> ADAPTER = new ProtoAdapter_MarkStrangerAllConversationReadResponseBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_MarkStrangerAllConversationReadResponseBody extends ProtoAdapter<MarkStrangerAllConversationReadResponseBody> {
        static {
            Covode.recordClassIndex(23573);
        }

        public ProtoAdapter_MarkStrangerAllConversationReadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerAllConversationReadResponseBody.class);
        }

        public final int encodedSize(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            return markStrangerAllConversationReadResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody redact(com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody.ProtoAdapter_MarkStrangerAllConversationReadResponseBody.redact(com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody):com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkStrangerAllConversationReadResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            protoWriter.writeBytes(markStrangerAllConversationReadResponseBody.unknownFields());
        }
    }

    public MarkStrangerAllConversationReadResponseBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<MarkStrangerAllConversationReadResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23572);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkStrangerAllConversationReadResponseBody build() {
            return new MarkStrangerAllConversationReadResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23571);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkStrangerAllConversationReadResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkStrangerAllConversationReadResponseBody" + h.f38770a.b(this).toString();
    }

    public MarkStrangerAllConversationReadResponseBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
