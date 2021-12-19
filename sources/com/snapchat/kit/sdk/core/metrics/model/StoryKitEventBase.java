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

public final class StoryKitEventBase extends Message<StoryKitEventBase, Builder> {
    public static final ProtoAdapter<StoryKitEventBase> ADAPTER = new ProtoAdapter_StoryKitEventBase();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;

    static final class ProtoAdapter_StoryKitEventBase extends ProtoAdapter<StoryKitEventBase> {
        static {
            Covode.recordClassIndex(35750);
        }

        public ProtoAdapter_StoryKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, StoryKitEventBase.class);
        }

        public final int encodedSize(StoryKitEventBase storyKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, storyKitEventBase.kit_event_base) + storyKitEventBase.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.KitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.KitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.KitEventBase) r0
                r2.kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase.ProtoAdapter_StoryKitEventBase.redact(com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase):com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StoryKitEventBase decode(ProtoReader protoReader) {
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
                    builder.kit_event_base(KitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StoryKitEventBase storyKitEventBase) {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, storyKitEventBase.kit_event_base);
            protoWriter.writeBytes(storyKitEventBase.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<StoryKitEventBase, Builder> {
        public KitEventBase kit_event_base;

        static {
            Covode.recordClassIndex(35749);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StoryKitEventBase build() {
            return new StoryKitEventBase(this.kit_event_base, super.buildUnknownFields());
        }

        public final Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35748);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        KitEventBase kitEventBase = this.kit_event_base;
        if (kitEventBase != null) {
            i2 = kitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.StoryKitEventBase$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StoryKitEventBase, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=").append(this.kit_event_base);
        }
        return sb.replace(0, 2, "StoryKitEventBase{").append('}').toString();
    }

    public StoryKitEventBase(KitEventBase kitEventBase) {
        this(kitEventBase, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoryKitEventBase)) {
            return false;
        }
        StoryKitEventBase storyKitEventBase = (StoryKitEventBase) obj;
        if (!unknownFields().equals(storyKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, storyKitEventBase.kit_event_base)) {
            return false;
        }
        return true;
    }

    public StoryKitEventBase(KitEventBase kitEventBase, i iVar) {
        super(ADAPTER, iVar);
        this.kit_event_base = kitEventBase;
    }
}
