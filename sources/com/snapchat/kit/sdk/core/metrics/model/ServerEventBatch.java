package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class ServerEventBatch extends Message<ServerEventBatch, Builder> {
    public static final ProtoAdapter<ServerEventBatch> ADAPTER = new ProtoAdapter_ServerEventBatch();
    public static final Long DEFAULT_MAX_SEQUENCE_ID_ON_INSTANCE = 0L;
    public static final Double DEFAULT_SERVER_UPLOAD_TS = Double.valueOf(0.0d);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 3)
    public final Long max_sequence_id_on_instance;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.ServerEvent#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<ServerEvent> server_events;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public final Double server_upload_ts;

    static final class ProtoAdapter_ServerEventBatch extends ProtoAdapter<ServerEventBatch> {
        static {
            Covode.recordClassIndex(35737);
        }

        public ProtoAdapter_ServerEventBatch() {
            super(FieldEncoding.LENGTH_DELIMITED, ServerEventBatch.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch redact(com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch$Builder r2 = r4.newBuilder()
                java.util.List<com.snapchat.kit.sdk.core.metrics.model.ServerEvent> r1 = r2.server_events
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.ServerEvent> r0 = com.snapchat.kit.sdk.core.metrics.model.ServerEvent.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch.ProtoAdapter_ServerEventBatch.redact(com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch):com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch");
        }

        public final int encodedSize(ServerEventBatch serverEventBatch) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, serverEventBatch.server_upload_ts) + ProtoAdapter.UINT64.encodedSizeWithTag(3, serverEventBatch.max_sequence_id_on_instance) + ServerEvent.ADAPTER.asRepeated().encodedSizeWithTag(4, serverEventBatch.server_events) + serverEventBatch.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ServerEventBatch decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.server_upload_ts(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.max_sequence_id_on_instance(ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.server_events.add(ServerEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ServerEventBatch serverEventBatch) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, serverEventBatch.server_upload_ts);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 3, serverEventBatch.max_sequence_id_on_instance);
            ServerEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, serverEventBatch.server_events);
            protoWriter.writeBytes(serverEventBatch.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ServerEventBatch, Builder> {
        public Long max_sequence_id_on_instance;
        public List<ServerEvent> server_events = Internal.newMutableList();
        public Double server_upload_ts;

        static {
            Covode.recordClassIndex(35736);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ServerEventBatch build() {
            return new ServerEventBatch(this.server_upload_ts, this.max_sequence_id_on_instance, this.server_events, super.buildUnknownFields());
        }

        public final Builder max_sequence_id_on_instance(Long l2) {
            this.max_sequence_id_on_instance = l2;
            return this;
        }

        public final Builder server_upload_ts(Double d2) {
            this.server_upload_ts = d2;
            return this;
        }

        public final Builder server_events(List<ServerEvent> list) {
            Internal.checkElementsNotNull(list);
            this.server_events = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35735);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ServerEventBatch, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.server_upload_ts = this.server_upload_ts;
        builder.max_sequence_id_on_instance = this.max_sequence_id_on_instance;
        builder.server_events = Internal.copyOf("server_events", this.server_events);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d2 = this.server_upload_ts;
        int i4 = 0;
        if (d2 != null) {
            i2 = d2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Long l2 = this.max_sequence_id_on_instance;
        if (l2 != null) {
            i4 = l2.hashCode();
        }
        int hashCode2 = ((i5 + i4) * 37) + this.server_events.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_upload_ts != null) {
            sb.append(", server_upload_ts=").append(this.server_upload_ts);
        }
        if (this.max_sequence_id_on_instance != null) {
            sb.append(", max_sequence_id_on_instance=").append(this.max_sequence_id_on_instance);
        }
        if (!this.server_events.isEmpty()) {
            sb.append(", server_events=").append(this.server_events);
        }
        return sb.replace(0, 2, "ServerEventBatch{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEventBatch)) {
            return false;
        }
        ServerEventBatch serverEventBatch = (ServerEventBatch) obj;
        if (!unknownFields().equals(serverEventBatch.unknownFields()) || !Internal.equals(this.server_upload_ts, serverEventBatch.server_upload_ts) || !Internal.equals(this.max_sequence_id_on_instance, serverEventBatch.max_sequence_id_on_instance) || !this.server_events.equals(serverEventBatch.server_events)) {
            return false;
        }
        return true;
    }

    public ServerEventBatch(Double d2, Long l2, List<ServerEvent> list) {
        this(d2, l2, list, i.EMPTY);
    }

    public ServerEventBatch(Double d2, Long l2, List<ServerEvent> list, i iVar) {
        super(ADAPTER, iVar);
        this.server_upload_ts = d2;
        this.max_sequence_id_on_instance = l2;
        this.server_events = Internal.immutableCopyOf("server_events", list);
    }
}
