package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class DeleteStrangerMessageResponseBody extends Message<DeleteStrangerMessageResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerMessageResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerMessageResponseBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_DeleteStrangerMessageResponseBody extends ProtoAdapter<DeleteStrangerMessageResponseBody> {
        static {
            Covode.recordClassIndex(23386);
        }

        public ProtoAdapter_DeleteStrangerMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerMessageResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            return deleteStrangerMessageResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody redact(com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody.ProtoAdapter_DeleteStrangerMessageResponseBody.redact(com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody):com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerMessageResponseBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            protoWriter.writeBytes(deleteStrangerMessageResponseBody.unknownFields());
        }
    }

    public DeleteStrangerMessageResponseBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<DeleteStrangerMessageResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23385);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeleteStrangerMessageResponseBody build() {
            return new DeleteStrangerMessageResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23384);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeleteStrangerMessageResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "DeleteStrangerMessageResponseBody" + h.f38770a.b(this).toString();
    }

    public DeleteStrangerMessageResponseBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
