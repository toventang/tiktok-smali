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

public final class GetConfigsResponseBody extends Message<GetConfigsResponseBody, Builder> {
    public static final ProtoAdapter<GetConfigsResponseBody> ADAPTER = new ProtoAdapter_GetConfigsResponseBody();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    @c(a = "configs")
    public final List<Config> configs;
    @c(a = "version")
    public final Integer version;

    static final class ProtoAdapter_GetConfigsResponseBody extends ProtoAdapter<GetConfigsResponseBody> {
        static {
            Covode.recordClassIndex(23411);
        }

        public ProtoAdapter_GetConfigsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigsResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConfigsResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConfigsResponseBody redact(com.bytedance.im.core.proto.GetConfigsResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConfigsResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.Config> r1 = r2.configs
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Config> r0 = com.bytedance.im.core.proto.Config.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConfigsResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConfigsResponseBody.ProtoAdapter_GetConfigsResponseBody.redact(com.bytedance.im.core.proto.GetConfigsResponseBody):com.bytedance.im.core.proto.GetConfigsResponseBody");
        }

        public final int encodedSize(GetConfigsResponseBody getConfigsResponseBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getConfigsResponseBody.version) + Config.ADAPTER.asRepeated().encodedSizeWithTag(2, getConfigsResponseBody.configs) + getConfigsResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConfigsResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.version(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.configs.add(Config.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConfigsResponseBody getConfigsResponseBody) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getConfigsResponseBody.version);
            Config.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getConfigsResponseBody.configs);
            protoWriter.writeBytes(getConfigsResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConfigsResponseBody, Builder> {
        public List<Config> configs = Internal.newMutableList();
        public Integer version;

        static {
            Covode.recordClassIndex(23410);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConfigsResponseBody build() {
            return new GetConfigsResponseBody(this.version, this.configs, super.buildUnknownFields());
        }

        public final Builder version(Integer num) {
            this.version = num;
            return this;
        }

        public final Builder configs(List<Config> list) {
            Internal.checkElementsNotNull(list);
            this.configs = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23409);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConfigsResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConfigsResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.configs = Internal.copyOf("configs", this.configs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConfigsResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConfigsResponseBody(Integer num, List<Config> list) {
        this(num, list, i.EMPTY);
    }

    public GetConfigsResponseBody(Integer num, List<Config> list, i iVar) {
        super(ADAPTER, iVar);
        this.version = num;
        this.configs = Internal.immutableCopyOf("configs", list);
    }
}
