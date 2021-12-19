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

public final class Config extends Message<Config, Builder> {
    public static final ProtoAdapter<Config> ADAPTER = new ProtoAdapter_Config();
    private static final long serialVersionUID = 0;
    @c(a = "conf_name")
    public final String conf_name;
    @c(a = "conf_value")
    public final String conf_value;

    static final class ProtoAdapter_Config extends ProtoAdapter<Config> {
        static {
            Covode.recordClassIndex(23280);
        }

        public ProtoAdapter_Config() {
            super(FieldEncoding.LENGTH_DELIMITED, Config.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.Config$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.Config redact(com.bytedance.im.core.proto.Config r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.Config$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.Config r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.Config.ProtoAdapter_Config.redact(com.bytedance.im.core.proto.Config):com.bytedance.im.core.proto.Config");
        }

        public final int encodedSize(Config config) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, config.conf_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, config.conf_value) + config.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Config decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conf_name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conf_value(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Config config) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, config.conf_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, config.conf_value);
            protoWriter.writeBytes(config.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Config, Builder> {
        public String conf_name;
        public String conf_value;

        static {
            Covode.recordClassIndex(23279);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Config build() {
            return new Config(this.conf_name, this.conf_value, super.buildUnknownFields());
        }

        public final Builder conf_name(String str) {
            this.conf_name = str;
            return this;
        }

        public final Builder conf_value(String str) {
            this.conf_value = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23278);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.Config$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Config, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conf_name = this.conf_name;
        builder.conf_value = this.conf_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "Config" + h.f38770a.b(this).toString();
    }

    public Config(String str, String str2) {
        this(str, str2, i.EMPTY);
    }

    public Config(String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.conf_name = str;
        this.conf_value = str2;
    }
}
