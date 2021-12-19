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

public final class GetTicketResponseBody extends Message<GetTicketResponseBody, Builder> {
    public static final ProtoAdapter<GetTicketResponseBody> ADAPTER = new ProtoAdapter_GetTicketResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "ticket")
    public final String ticket;

    static final class ProtoAdapter_GetTicketResponseBody extends ProtoAdapter<GetTicketResponseBody> {
        static {
            Covode.recordClassIndex(23522);
        }

        public ProtoAdapter_GetTicketResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTicketResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetTicketResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetTicketResponseBody redact(com.bytedance.im.core.proto.GetTicketResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetTicketResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetTicketResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetTicketResponseBody.ProtoAdapter_GetTicketResponseBody.redact(com.bytedance.im.core.proto.GetTicketResponseBody):com.bytedance.im.core.proto.GetTicketResponseBody");
        }

        public final int encodedSize(GetTicketResponseBody getTicketResponseBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getTicketResponseBody.ticket) + getTicketResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetTicketResponseBody decode(ProtoReader protoReader) {
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
                    builder.ticket(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetTicketResponseBody getTicketResponseBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTicketResponseBody.ticket);
            protoWriter.writeBytes(getTicketResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetTicketResponseBody, Builder> {
        public String ticket;

        static {
            Covode.recordClassIndex(23521);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetTicketResponseBody build() {
            return new GetTicketResponseBody(this.ticket, super.buildUnknownFields());
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23520);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetTicketResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetTicketResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.ticket = this.ticket;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetTicketResponseBody" + h.f38770a.b(this).toString();
    }

    public GetTicketResponseBody(String str) {
        this(str, i.EMPTY);
    }

    public GetTicketResponseBody(String str, i iVar) {
        super(ADAPTER, iVar);
        this.ticket = str;
    }
}
