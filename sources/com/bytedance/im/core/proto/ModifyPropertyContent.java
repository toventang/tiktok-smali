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

public final class ModifyPropertyContent extends Message<ModifyPropertyContent, Builder> {
    public static final ProtoAdapter<ModifyPropertyContent> ADAPTER = new ProtoAdapter_ModifyPropertyContent();
    public static final OPERATION_TYPE DEFAULT_OPERATION = OPERATION_TYPE.ADD_PROPERTY_ITEM;
    private static final long serialVersionUID = 0;
    @c(a = "idempotent_id")
    public final String idempotent_id;
    @c(a = "key")
    public final String key;
    @c(a = "operation")
    public final OPERATION_TYPE operation;
    @c(a = "value")
    public final String value;

    static final class ProtoAdapter_ModifyPropertyContent extends ProtoAdapter<ModifyPropertyContent> {
        static {
            Covode.recordClassIndex(23636);
        }

        public ProtoAdapter_ModifyPropertyContent() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyContent.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ModifyPropertyContent$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ModifyPropertyContent redact(com.bytedance.im.core.proto.ModifyPropertyContent r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ModifyPropertyContent$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ModifyPropertyContent r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ModifyPropertyContent.ProtoAdapter_ModifyPropertyContent.redact(com.bytedance.im.core.proto.ModifyPropertyContent):com.bytedance.im.core.proto.ModifyPropertyContent");
        }

        public final int encodedSize(ModifyPropertyContent modifyPropertyContent) {
            return OPERATION_TYPE.ADAPTER.encodedSizeWithTag(1, modifyPropertyContent.operation) + ProtoAdapter.STRING.encodedSizeWithTag(2, modifyPropertyContent.key) + ProtoAdapter.STRING.encodedSizeWithTag(3, modifyPropertyContent.value) + ProtoAdapter.STRING.encodedSizeWithTag(4, modifyPropertyContent.idempotent_id) + modifyPropertyContent.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyPropertyContent decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.operation(OPERATION_TYPE.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 2) {
                    builder.key(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.value(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.idempotent_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyPropertyContent modifyPropertyContent) {
            OPERATION_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, modifyPropertyContent.operation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, modifyPropertyContent.key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, modifyPropertyContent.value);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, modifyPropertyContent.idempotent_id);
            protoWriter.writeBytes(modifyPropertyContent.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ModifyPropertyContent, Builder> {
        public String idempotent_id;
        public String key;
        public OPERATION_TYPE operation;
        public String value;

        static {
            Covode.recordClassIndex(23635);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ModifyPropertyContent build() {
            return new ModifyPropertyContent(this.operation, this.key, this.value, this.idempotent_id, super.buildUnknownFields());
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder key(String str) {
            this.key = str;
            return this;
        }

        public final Builder operation(OPERATION_TYPE operation_type) {
            this.operation = operation_type;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23634);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ModifyPropertyContent$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ModifyPropertyContent, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.operation = this.operation;
        builder.key = this.key;
        builder.value = this.value;
        builder.idempotent_id = this.idempotent_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ModifyPropertyContent" + h.f38770a.b(this).toString();
    }

    public ModifyPropertyContent(OPERATION_TYPE operation_type, String str, String str2, String str3) {
        this(operation_type, str, str2, str3, i.EMPTY);
    }

    public ModifyPropertyContent(OPERATION_TYPE operation_type, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.operation = operation_type;
        this.key = str;
        this.value = str2;
        this.idempotent_id = str3;
    }
}
