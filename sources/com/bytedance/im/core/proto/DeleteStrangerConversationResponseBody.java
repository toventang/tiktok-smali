package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class DeleteStrangerConversationResponseBody extends Message<DeleteStrangerConversationResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerConversationResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerConversationResponseBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_DeleteStrangerConversationResponseBody extends ProtoAdapter<DeleteStrangerConversationResponseBody> {
        static {
            Covode.recordClassIndex(23380);
        }

        public ProtoAdapter_DeleteStrangerConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerConversationResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            return deleteStrangerConversationResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody redact(com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody.ProtoAdapter_DeleteStrangerConversationResponseBody.redact(com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody):com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerConversationResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            protoWriter.writeBytes(deleteStrangerConversationResponseBody.unknownFields());
        }
    }

    public DeleteStrangerConversationResponseBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<DeleteStrangerConversationResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23379);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerConversationResponseBody build() {
            return new DeleteStrangerConversationResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23378);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerConversationResponseBody" + h.f38770a.b(this).toString();
    }

    public DeleteStrangerConversationResponseBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
