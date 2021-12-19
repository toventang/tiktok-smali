package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConfigsRequestBody extends Message<GetConfigsRequestBody, Builder> {
    public static final ProtoAdapter<GetConfigsRequestBody> ADAPTER = new ProtoAdapter_GetConfigsRequestBody();
    private static final long serialVersionUID = 0;

    static final class ProtoAdapter_GetConfigsRequestBody extends ProtoAdapter<GetConfigsRequestBody> {
        static {
            Covode.recordClassIndex(23408);
        }

        public ProtoAdapter_GetConfigsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigsRequestBody.class);
        }

        public final int encodedSize(GetConfigsRequestBody getConfigsRequestBody) {
            return getConfigsRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConfigsRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConfigsRequestBody redact(com.bytedance.im.core.proto.GetConfigsRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConfigsRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConfigsRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConfigsRequestBody.ProtoAdapter_GetConfigsRequestBody.redact(com.bytedance.im.core.proto.GetConfigsRequestBody):com.bytedance.im.core.proto.GetConfigsRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConfigsRequestBody decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, GetConfigsRequestBody getConfigsRequestBody) {
            protoWriter.writeBytes(getConfigsRequestBody.unknownFields());
        }
    }

    public GetConfigsRequestBody() {
        this(i.EMPTY);
    }

    public static final class Builder extends Message.Builder<GetConfigsRequestBody, Builder> {
        static {
            Covode.recordClassIndex(23407);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConfigsRequestBody build() {
            return new GetConfigsRequestBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23406);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConfigsRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConfigsRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConfigsRequestBody" + h.f38770a.b(this).toString();
    }

    public GetConfigsRequestBody(i iVar) {
        super(ADAPTER, iVar);
    }
}
