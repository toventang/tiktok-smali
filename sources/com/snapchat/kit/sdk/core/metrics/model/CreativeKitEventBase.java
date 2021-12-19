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

public final class CreativeKitEventBase extends Message<CreativeKitEventBase, Builder> {
    public static final ProtoAdapter<CreativeKitEventBase> ADAPTER = new ProtoAdapter_CreativeKitEventBase();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String attachment_url;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String source_url;

    static final class ProtoAdapter_CreativeKitEventBase extends ProtoAdapter<CreativeKitEventBase> {
        static {
            Covode.recordClassIndex(35693);
        }

        public ProtoAdapter_CreativeKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitEventBase.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.KitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.KitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.KitEventBase) r0
                r2.kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.ProtoAdapter_CreativeKitEventBase.redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase):com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase");
        }

        public final int encodedSize(CreativeKitEventBase creativeKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitEventBase.kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, creativeKitEventBase.source_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, creativeKitEventBase.attachment_url) + creativeKitEventBase.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreativeKitEventBase decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.kit_event_base(KitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.source_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.attachment_url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreativeKitEventBase creativeKitEventBase) {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitEventBase.kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, creativeKitEventBase.source_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, creativeKitEventBase.attachment_url);
            protoWriter.writeBytes(creativeKitEventBase.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CreativeKitEventBase, Builder> {
        public String attachment_url;
        public KitEventBase kit_event_base;
        public String source_url;

        static {
            Covode.recordClassIndex(35692);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CreativeKitEventBase build() {
            return new CreativeKitEventBase(this.kit_event_base, this.source_url, this.attachment_url, super.buildUnknownFields());
        }

        public final Builder attachment_url(String str) {
            this.attachment_url = str;
            return this;
        }

        public final Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }

        public final Builder source_url(String str) {
            this.source_url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35691);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CreativeKitEventBase, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.source_url = this.source_url;
        builder.attachment_url = this.attachment_url;
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
        KitEventBase kitEventBase = this.kit_event_base;
        int i5 = 0;
        if (kitEventBase != null) {
            i2 = kitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.source_url;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str2 = this.attachment_url;
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
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=").append(this.kit_event_base);
        }
        if (this.source_url != null) {
            sb.append(", source_url=").append(this.source_url);
        }
        if (this.attachment_url != null) {
            sb.append(", attachment_url=").append(this.attachment_url);
        }
        return sb.replace(0, 2, "CreativeKitEventBase{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitEventBase)) {
            return false;
        }
        CreativeKitEventBase creativeKitEventBase = (CreativeKitEventBase) obj;
        if (!unknownFields().equals(creativeKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, creativeKitEventBase.kit_event_base) || !Internal.equals(this.source_url, creativeKitEventBase.source_url) || !Internal.equals(this.attachment_url, creativeKitEventBase.attachment_url)) {
            return false;
        }
        return true;
    }

    public CreativeKitEventBase(KitEventBase kitEventBase, String str, String str2) {
        this(kitEventBase, str, str2, i.EMPTY);
    }

    public CreativeKitEventBase(KitEventBase kitEventBase, String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.kit_event_base = kitEventBase;
        this.source_url = str;
        this.attachment_url = str2;
    }
}
