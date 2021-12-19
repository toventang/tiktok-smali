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

public final class ModifyMessagePropertyRequestBody extends Message<ModifyMessagePropertyRequestBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyRequestBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "property_list")
    public final ModifyPropertyBody property_list;
    @c(a = "ticket")
    public final String ticket;

    static final class ProtoAdapter_ModifyMessagePropertyRequestBody extends ProtoAdapter<ModifyMessagePropertyRequestBody> {
        static {
            Covode.recordClassIndex(23625);
        }

        public ProtoAdapter_ModifyMessagePropertyRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyRequestBody.class);
        }

        public final int encodedSize(ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            return ModifyPropertyBody.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyRequestBody.property_list) + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyMessagePropertyRequestBody.ticket) + modifyMessagePropertyRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody redact(com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ModifyPropertyBody r0 = r2.property_list
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ModifyPropertyBody> r1 = com.bytedance.im.core.proto.ModifyPropertyBody.ADAPTER
                com.bytedance.im.core.proto.ModifyPropertyBody r0 = r2.property_list
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ModifyPropertyBody r0 = (com.bytedance.im.core.proto.ModifyPropertyBody) r0
                r2.property_list = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody.ProtoAdapter_ModifyMessagePropertyRequestBody.redact(com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody):com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyMessagePropertyRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.property_list(ModifyPropertyBody.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ticket(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody) {
            ModifyPropertyBody.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyRequestBody.property_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyMessagePropertyRequestBody.ticket);
            protoWriter.writeBytes(modifyMessagePropertyRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ModifyMessagePropertyRequestBody, Builder> {
        public ModifyPropertyBody property_list;
        public String ticket;

        static {
            Covode.recordClassIndex(23624);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ModifyMessagePropertyRequestBody build() {
            return new ModifyMessagePropertyRequestBody(this.property_list, this.ticket, super.buildUnknownFields());
        }

        public final Builder property_list(ModifyPropertyBody modifyPropertyBody) {
            this.property_list = modifyPropertyBody;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23623);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ModifyMessagePropertyRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.property_list = this.property_list;
        builder.ticket = this.ticket;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ModifyMessagePropertyRequestBody" + h.f38770a.b(this).toString();
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str) {
        this(modifyPropertyBody, str, i.EMPTY);
    }

    public ModifyMessagePropertyRequestBody(ModifyPropertyBody modifyPropertyBody, String str, i iVar) {
        super(ADAPTER, iVar);
        this.property_list = modifyPropertyBody;
        this.ticket = str;
    }
}
