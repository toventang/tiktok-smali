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

public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyResponseBody();
    public static final ModifyMessagePropertyStatus DEFAULT_STATUS = ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "status")
    public final ModifyMessagePropertyStatus status;
    @c(a = "version")
    public final Long version;

    static final class ProtoAdapter_ModifyMessagePropertyResponseBody extends ProtoAdapter<ModifyMessagePropertyResponseBody> {
        static {
            Covode.recordClassIndex(23628);
        }

        public ProtoAdapter_ModifyMessagePropertyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody redact(com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody.ProtoAdapter_ModifyMessagePropertyResponseBody.redact(com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody):com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody");
        }

        public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            return ModifyMessagePropertyStatus.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, modifyMessagePropertyResponseBody.version) + modifyMessagePropertyResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.status(ModifyMessagePropertyStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.version(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            ModifyMessagePropertyStatus.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, modifyMessagePropertyResponseBody.version);
            protoWriter.writeBytes(modifyMessagePropertyResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ModifyMessagePropertyResponseBody, Builder> {
        public ModifyMessagePropertyStatus status;
        public Long version;

        static {
            Covode.recordClassIndex(23627);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ModifyMessagePropertyResponseBody build() {
            return new ModifyMessagePropertyResponseBody(this.status, this.version, super.buildUnknownFields());
        }

        public final Builder status(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
            this.status = modifyMessagePropertyStatus;
            return this;
        }

        public final Builder version(Long l2) {
            this.version = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23626);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ModifyMessagePropertyResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ModifyMessagePropertyResponseBody" + h.f38770a.b(this).toString();
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l2) {
        this(modifyMessagePropertyStatus, l2, i.EMPTY);
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.status = modifyMessagePropertyStatus;
        this.version = l2;
    }
}
