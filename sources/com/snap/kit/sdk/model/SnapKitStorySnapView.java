package com.snap.kit.sdk.model;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class SnapKitStorySnapView extends Message<SnapKitStorySnapView, Builder> {
    public static final ProtoAdapter<SnapKitStorySnapView> ADAPTER = new ProtoAdapter_SnapKitStorySnapView();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.google.protobuf.Timestamp#ADAPTER", tag = 1)
    public final Timestamp client_timestamp;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String owner_external_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String snap_id;

    static final class ProtoAdapter_SnapKitStorySnapView extends ProtoAdapter<SnapKitStorySnapView> {
        static {
            Covode.recordClassIndex(35538);
        }

        public ProtoAdapter_SnapKitStorySnapView() {
            super(FieldEncoding.LENGTH_DELIMITED, SnapKitStorySnapView.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snap.kit.sdk.model.SnapKitStorySnapView$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.sdk.model.SnapKitStorySnapView redact(com.snap.kit.sdk.model.SnapKitStorySnapView r4) {
            /*
                r3 = this;
                com.snap.kit.sdk.model.SnapKitStorySnapView$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.client_timestamp
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.Timestamp> r1 = com.snapchat.kit.sdk.core.metrics.model.Timestamp.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.client_timestamp
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = (com.snapchat.kit.sdk.core.metrics.model.Timestamp) r0
                r2.client_timestamp = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snap.kit.sdk.model.SnapKitStorySnapView r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.sdk.model.SnapKitStorySnapView.ProtoAdapter_SnapKitStorySnapView.redact(com.snap.kit.sdk.model.SnapKitStorySnapView):com.snap.kit.sdk.model.SnapKitStorySnapView");
        }

        public final int encodedSize(SnapKitStorySnapView snapKitStorySnapView) {
            return Timestamp.ADAPTER.encodedSizeWithTag(1, snapKitStorySnapView.client_timestamp) + ProtoAdapter.STRING.encodedSizeWithTag(2, snapKitStorySnapView.snap_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, snapKitStorySnapView.owner_external_id) + snapKitStorySnapView.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SnapKitStorySnapView decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.client_timestamp(Timestamp.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.snap_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.owner_external_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SnapKitStorySnapView snapKitStorySnapView) {
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 1, snapKitStorySnapView.client_timestamp);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, snapKitStorySnapView.snap_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, snapKitStorySnapView.owner_external_id);
            protoWriter.writeBytes(snapKitStorySnapView.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SnapKitStorySnapView, Builder> {
        public Timestamp client_timestamp;
        public String owner_external_id;
        public String snap_id;

        static {
            Covode.recordClassIndex(35537);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SnapKitStorySnapView build() {
            return new SnapKitStorySnapView(this.client_timestamp, this.snap_id, this.owner_external_id, super.buildUnknownFields());
        }

        public final Builder client_timestamp(Timestamp timestamp) {
            this.client_timestamp = timestamp;
            return this;
        }

        public final Builder owner_external_id(String str) {
            this.owner_external_id = str;
            return this;
        }

        public final Builder snap_id(String str) {
            this.snap_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35536);
    }

    /* Return type fixed from 'com.snap.kit.sdk.model.SnapKitStorySnapView$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SnapKitStorySnapView, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.client_timestamp = this.client_timestamp;
        builder.snap_id = this.snap_id;
        builder.owner_external_id = this.owner_external_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timestamp timestamp = this.client_timestamp;
        int i5 = 0;
        if (timestamp != null) {
            i2 = timestamp.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.snap_id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str2 = this.owner_external_id;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.client_timestamp != null) {
            sb.append(", client_timestamp=").append(this.client_timestamp);
        }
        if (this.snap_id != null) {
            sb.append(", snap_id=").append(this.snap_id);
        }
        if (this.owner_external_id != null) {
            sb.append(", owner_external_id=").append(this.owner_external_id);
        }
        return sb.replace(0, 2, "SnapKitStorySnapView{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SnapKitStorySnapView)) {
            return false;
        }
        SnapKitStorySnapView snapKitStorySnapView = (SnapKitStorySnapView) obj;
        if (!unknownFields().equals(snapKitStorySnapView.unknownFields()) || !Internal.equals(this.client_timestamp, snapKitStorySnapView.client_timestamp) || !Internal.equals(this.snap_id, snapKitStorySnapView.snap_id) || !Internal.equals(this.owner_external_id, snapKitStorySnapView.owner_external_id)) {
            return false;
        }
        return true;
    }

    public SnapKitStorySnapView(Timestamp timestamp, String str, String str2) {
        this(timestamp, str, str2, i.EMPTY);
    }

    public SnapKitStorySnapView(Timestamp timestamp, String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.client_timestamp = timestamp;
        this.snap_id = str;
        this.owner_external_id = str2;
    }
}
