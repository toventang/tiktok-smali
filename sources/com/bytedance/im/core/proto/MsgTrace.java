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

public final class MsgTrace extends Message<MsgTrace, Builder> {
    public static final ProtoAdapter<MsgTrace> ADAPTER = new ProtoAdapter_MsgTrace();
    public static final MsgTracePath DEFAULT_PATH = MsgTracePath.FROM_UNKNOWN;
    private static final long serialVersionUID = 0;
    @c(a = "metrics")
    public final Map<Integer, Long> metrics;
    @c(a = "path")
    public final MsgTracePath path;

    public static final class Builder extends Message.Builder<MsgTrace, Builder> {
        public Map<Integer, Long> metrics = Internal.newMutableMap();
        public MsgTracePath path;

        static {
            Covode.recordClassIndex(23640);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MsgTrace build() {
            return new MsgTrace(this.metrics, this.path, super.buildUnknownFields());
        }

        public final Builder path(MsgTracePath msgTracePath) {
            this.path = msgTracePath;
            return this;
        }

        public final Builder metrics(Map<Integer, Long> map) {
            Internal.checkElementsNotNull(map);
            this.metrics = map;
            return this;
        }
    }

    static final class ProtoAdapter_MsgTrace extends ProtoAdapter<MsgTrace> {
        private final ProtoAdapter<Map<Integer, Long>> metrics = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.INT64);

        static {
            Covode.recordClassIndex(23641);
        }

        public ProtoAdapter_MsgTrace() {
            super(FieldEncoding.LENGTH_DELIMITED, MsgTrace.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MsgTrace$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MsgTrace redact(com.bytedance.im.core.proto.MsgTrace r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MsgTrace$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MsgTrace r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MsgTrace.ProtoAdapter_MsgTrace.redact(com.bytedance.im.core.proto.MsgTrace):com.bytedance.im.core.proto.MsgTrace");
        }

        public final int encodedSize(MsgTrace msgTrace) {
            return this.metrics.encodedSizeWithTag(1, msgTrace.metrics) + MsgTracePath.ADAPTER.encodedSizeWithTag(2, msgTrace.path) + msgTrace.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MsgTrace decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.metrics.putAll(this.metrics.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.path(MsgTracePath.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MsgTrace msgTrace) {
            this.metrics.encodeWithTag(protoWriter, 1, msgTrace.metrics);
            MsgTracePath.ADAPTER.encodeWithTag(protoWriter, 2, msgTrace.path);
            protoWriter.writeBytes(msgTrace.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23639);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MsgTrace$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MsgTrace, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.metrics = Internal.copyOf("metrics", this.metrics);
        builder.path = this.path;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MsgTrace" + h.f38770a.b(this).toString();
    }

    public MsgTrace(Map<Integer, Long> map, MsgTracePath msgTracePath) {
        this(map, msgTracePath, i.EMPTY);
    }

    public MsgTrace(Map<Integer, Long> map, MsgTracePath msgTracePath, i iVar) {
        super(ADAPTER, iVar);
        this.metrics = Internal.immutableCopyOf("metrics", map);
        this.path = msgTracePath;
    }
}
