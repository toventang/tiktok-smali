package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.RequestBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class AckConversationApplyRequestBody extends Message<AckConversationApplyRequestBody, Builder> {
    public static final ProtoAdapter<AckConversationApplyRequestBody> ADAPTER;
    public static final Long DEFAULT_APPLY_ID = 0L;
    public static final ApplyStatusCode DEFAULT_APPLY_STATUS = ApplyStatusCode.APPLYING;
    private static final long serialVersionUID = 0;
    @c(a = "apply_id")
    public final Long apply_id;
    @c(a = "apply_status")
    public final ApplyStatusCode apply_status;
    @c(a = "bizExt")
    public final Map<String, String> bizExt;

    public static final class Builder extends Message.Builder<AckConversationApplyRequestBody, Builder> {
        public Long apply_id;
        public ApplyStatusCode apply_status;
        public Map<String, String> bizExt = Internal.newMutableMap();

        static {
            Covode.recordClassIndex(23178);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AckConversationApplyRequestBody build() {
            return new AckConversationApplyRequestBody(this.apply_id, this.apply_status, this.bizExt, super.buildUnknownFields());
        }

        public final Builder apply_id(Long l2) {
            this.apply_id = l2;
            return this;
        }

        public final Builder apply_status(ApplyStatusCode applyStatusCode) {
            this.apply_status = applyStatusCode;
            return this;
        }

        public final Builder bizExt(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.bizExt = map;
            return this;
        }
    }

    static final class ProtoAdapter_AckConversationApplyRequestBody extends ProtoAdapter<AckConversationApplyRequestBody> {
        private final ProtoAdapter<Map<String, String>> bizExt;

        static {
            Covode.recordClassIndex(23179);
        }

        public ProtoAdapter_AckConversationApplyRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, AckConversationApplyRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.bizExt = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.AckConversationApplyRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.AckConversationApplyRequestBody redact(com.bytedance.im.core.proto.AckConversationApplyRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.AckConversationApplyRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.AckConversationApplyRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.AckConversationApplyRequestBody.ProtoAdapter_AckConversationApplyRequestBody.redact(com.bytedance.im.core.proto.AckConversationApplyRequestBody):com.bytedance.im.core.proto.AckConversationApplyRequestBody");
        }

        public final int encodedSize(AckConversationApplyRequestBody ackConversationApplyRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, ackConversationApplyRequestBody.apply_id) + ApplyStatusCode.ADAPTER.encodedSizeWithTag(2, ackConversationApplyRequestBody.apply_status) + this.bizExt.encodedSizeWithTag(3, ackConversationApplyRequestBody.bizExt) + ackConversationApplyRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckConversationApplyRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.apply_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.apply_status(ApplyStatusCode.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.bizExt.putAll(this.bizExt.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AckConversationApplyRequestBody ackConversationApplyRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ackConversationApplyRequestBody.apply_id);
            ApplyStatusCode.ADAPTER.encodeWithTag(protoWriter, 2, ackConversationApplyRequestBody.apply_status);
            this.bizExt.encodeWithTag(protoWriter, 3, ackConversationApplyRequestBody.bizExt);
            protoWriter.writeBytes(ackConversationApplyRequestBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2025, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.AckConversationApplyRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AckConversationApplyRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.apply_id = this.apply_id;
        builder.apply_status = this.apply_status;
        builder.bizExt = Internal.copyOf("bizExt", this.bizExt);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "AckConversationApplyRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23177);
        ProtoAdapter_AckConversationApplyRequestBody protoAdapter_AckConversationApplyRequestBody = new ProtoAdapter_AckConversationApplyRequestBody();
        ADAPTER = protoAdapter_AckConversationApplyRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2025, protoAdapter_AckConversationApplyRequestBody);
    }

    public AckConversationApplyRequestBody(Long l2, ApplyStatusCode applyStatusCode, Map<String, String> map) {
        this(l2, applyStatusCode, map, i.EMPTY);
    }

    public AckConversationApplyRequestBody(Long l2, ApplyStatusCode applyStatusCode, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.apply_id = l2;
        this.apply_status = applyStatusCode;
        this.bizExt = Internal.immutableCopyOf("bizExt", map);
    }
}
