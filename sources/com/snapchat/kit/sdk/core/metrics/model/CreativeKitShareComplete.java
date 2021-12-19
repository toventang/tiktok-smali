package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class CreativeKitShareComplete extends Message<CreativeKitShareComplete, Builder> {
    public static final ProtoAdapter<CreativeKitShareComplete> ADAPTER = new ProtoAdapter_CreativeKitShareComplete();
    public static final Boolean DEFAULT_IS_SUCCESS = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase#ADAPTER", tag = 1)
    public final CreativeKitEventBase creative_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_success;

    static final class ProtoAdapter_CreativeKitShareComplete extends ProtoAdapter<CreativeKitShareComplete> {
        static {
            Covode.recordClassIndex(35696);
        }

        public ProtoAdapter_CreativeKitShareComplete() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitShareComplete.class);
        }

        public final int encodedSize(CreativeKitShareComplete creativeKitShareComplete) {
            return CreativeKitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitShareComplete.creative_kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, creativeKitShareComplete.is_success) + creativeKitShareComplete.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = r2.creative_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = r2.creative_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase) r0
                r2.creative_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete.ProtoAdapter_CreativeKitShareComplete.redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete):com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreativeKitShareComplete decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.creative_kit_event_base(CreativeKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_success(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreativeKitShareComplete creativeKitShareComplete) {
            CreativeKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitShareComplete.creative_kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, creativeKitShareComplete.is_success);
            protoWriter.writeBytes(creativeKitShareComplete.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CreativeKitShareComplete, Builder> {
        public CreativeKitEventBase creative_kit_event_base;
        public Boolean is_success;

        static {
            Covode.recordClassIndex(35695);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CreativeKitShareComplete build() {
            return new CreativeKitShareComplete(this.creative_kit_event_base, this.is_success, super.buildUnknownFields());
        }

        public final Builder creative_kit_event_base(CreativeKitEventBase creativeKitEventBase) {
            this.creative_kit_event_base = creativeKitEventBase;
            return this;
        }

        public final Builder is_success(Boolean bool) {
            this.is_success = bool;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35694);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CreativeKitShareComplete, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_event_base = this.creative_kit_event_base;
        builder.is_success = this.is_success;
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
        CreativeKitEventBase creativeKitEventBase = this.creative_kit_event_base;
        int i4 = 0;
        if (creativeKitEventBase != null) {
            i2 = creativeKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Boolean bool = this.is_success;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_event_base != null) {
            sb.append(", creative_kit_event_base=").append(this.creative_kit_event_base);
        }
        if (this.is_success != null) {
            sb.append(", is_success=").append(this.is_success);
        }
        return sb.replace(0, 2, "CreativeKitShareComplete{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitShareComplete)) {
            return false;
        }
        CreativeKitShareComplete creativeKitShareComplete = (CreativeKitShareComplete) obj;
        if (!unknownFields().equals(creativeKitShareComplete.unknownFields()) || !Internal.equals(this.creative_kit_event_base, creativeKitShareComplete.creative_kit_event_base) || !Internal.equals(this.is_success, creativeKitShareComplete.is_success)) {
            return false;
        }
        return true;
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool) {
        this(creativeKitEventBase, bool, i.EMPTY);
    }

    public CreativeKitShareComplete(CreativeKitEventBase creativeKitEventBase, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.creative_kit_event_base = creativeKitEventBase;
        this.is_success = bool;
    }
}
