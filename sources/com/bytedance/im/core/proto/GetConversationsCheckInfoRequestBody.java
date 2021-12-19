package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConversationsCheckInfoRequestBody extends Message<GetConversationsCheckInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationsCheckInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationsCheckInfoRequestBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_GetConversationsCheckInfoRequestBody extends ProtoAdapter<GetConversationsCheckInfoRequestBody> {
        static {
            Covode.recordClassIndex(23465);
        }

        public ProtoAdapter_GetConversationsCheckInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationsCheckInfoRequestBody.class);
        }

        public final int encodedSize(GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            return getConversationsCheckInfoRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody redact(com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody.ProtoAdapter_GetConversationsCheckInfoRequestBody.redact(com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody):com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationsCheckInfoRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoRequestBody getConversationsCheckInfoRequestBody) {
            protoWriter.writeBytes(getConversationsCheckInfoRequestBody.unknownFields());
        }
    }

    public GetConversationsCheckInfoRequestBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<GetConversationsCheckInfoRequestBody, Builder> {
        static {
            Covode.recordClassIndex(23464);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationsCheckInfoRequestBody build() {
            return new GetConversationsCheckInfoRequestBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23463);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationsCheckInfoRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationsCheckInfoRequestBody" + h.f38770a.b(this).toString();
    }

    public GetConversationsCheckInfoRequestBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
