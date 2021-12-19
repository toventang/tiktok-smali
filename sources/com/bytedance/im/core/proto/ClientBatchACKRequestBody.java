package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class ClientBatchACKRequestBody extends Message<ClientBatchACKRequestBody, Builder> {
    public static final ProtoAdapter<ClientBatchACKRequestBody> ADAPTER = new ProtoAdapter_ClientBatchACKRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "ack_list")
    public final List<ClientACKRequestBody> ack_list;

    static final class ProtoAdapter_ClientBatchACKRequestBody extends ProtoAdapter<ClientBatchACKRequestBody> {
        static {
            Covode.recordClassIndex(23269);
        }

        public ProtoAdapter_ClientBatchACKRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientBatchACKRequestBody.class);
        }

        public final int encodedSize(ClientBatchACKRequestBody clientBatchACKRequestBody) {
            return ClientACKRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, clientBatchACKRequestBody.ack_list) + clientBatchACKRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ClientBatchACKRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ClientBatchACKRequestBody redact(com.bytedance.im.core.proto.ClientBatchACKRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ClientBatchACKRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ClientACKRequestBody> r1 = r2.ack_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ClientACKRequestBody> r0 = com.bytedance.im.core.proto.ClientACKRequestBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ClientBatchACKRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ClientBatchACKRequestBody.ProtoAdapter_ClientBatchACKRequestBody.redact(com.bytedance.im.core.proto.ClientBatchACKRequestBody):com.bytedance.im.core.proto.ClientBatchACKRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientBatchACKRequestBody decode(ProtoReader protoReader) {
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
                    builder.ack_list.add(ClientACKRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ClientBatchACKRequestBody clientBatchACKRequestBody) {
            ClientACKRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientBatchACKRequestBody.ack_list);
            protoWriter.writeBytes(clientBatchACKRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ClientBatchACKRequestBody, Builder> {
        public List<ClientACKRequestBody> ack_list = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23268);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClientBatchACKRequestBody build() {
            return new ClientBatchACKRequestBody(this.ack_list, super.buildUnknownFields());
        }

        public final Builder ack_list(List<ClientACKRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.ack_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23267);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClientBatchACKRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClientBatchACKRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.ack_list = Internal.copyOf("ack_list", this.ack_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClientBatchACKRequestBody" + h.f38770a.b(this).toString();
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list) {
        this(list, i.EMPTY);
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list, i iVar) {
        super(ADAPTER, iVar);
        this.ack_list = Internal.immutableCopyOf("ack_list", list);
    }
}
