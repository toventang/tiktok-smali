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
import java.util.Map;
import k.i;

public final class GetMessageInfoByIndexV2ResponseBody extends Message<GetMessageInfoByIndexV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2ResponseBody> ADAPTER = new ProtoAdapter_GetMessageInfoByIndexV2ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "infos")
    public final Map<Long, MessageInfo> infos;

    public static final class Builder extends Message.Builder<GetMessageInfoByIndexV2ResponseBody, Builder> {
        public Map<Long, MessageInfo> infos = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(23485);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageInfoByIndexV2ResponseBody build() {
            return new GetMessageInfoByIndexV2ResponseBody(this.infos, super.buildUnknownFields());
        }

        public final Builder infos(Map<Long, MessageInfo> map) {
            Internal.checkElementsNotNull(map);
            this.infos = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23484);
    }

    static final class ProtoAdapter_GetMessageInfoByIndexV2ResponseBody extends ProtoAdapter<GetMessageInfoByIndexV2ResponseBody> {
        private final ProtoAdapter<Map<Long, MessageInfo>> infos = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, MessageInfo.ADAPTER);

        static {
            Covode.recordClassIndex(23486);
        }

        public ProtoAdapter_GetMessageInfoByIndexV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2ResponseBody.class);
        }

        public final int encodedSize(GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
            return this.infos.encodedSizeWithTag(1, getMessageInfoByIndexV2ResponseBody.infos) + getMessageInfoByIndexV2ResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody$Builder r2 = r4.newBuilder()
                java.util.Map<java.lang.Long, com.bytedance.im.core.proto.MessageInfo> r1 = r2.infos
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageInfo> r0 = com.bytedance.im.core.proto.MessageInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody.ProtoAdapter_GetMessageInfoByIndexV2ResponseBody.redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody):com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2ResponseBody decode(ProtoReader protoReader) {
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
                    builder.infos.putAll(this.infos.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
            this.infos.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2ResponseBody.infos);
            protoWriter.writeBytes(getMessageInfoByIndexV2ResponseBody.unknownFields());
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageInfoByIndexV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.infos = Internal.copyOf("infos", this.infos);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageInfoByIndexV2ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map) {
        this(map, i.EMPTY);
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map, i iVar) {
        super(ADAPTER, iVar);
        this.infos = Internal.immutableCopyOf("infos", map);
    }
}
