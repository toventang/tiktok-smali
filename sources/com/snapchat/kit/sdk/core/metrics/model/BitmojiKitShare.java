package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class BitmojiKitShare extends Message<BitmojiKitShare, Builder> {
    public static final ProtoAdapter<BitmojiKitShare> ADAPTER = new ProtoAdapter_BitmojiKitShare();
    public static final BitmojiKitSearchCategory DEFAULT_SEARCH_CATEGORY = BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
    public static final BitmojiKitShareCategory DEFAULT_SHARE_CATEGORY = BitmojiKitShareCategory.UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final BitmojiKitSearchCategory search_category;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory#ADAPTER", tag = 4)
    public final BitmojiKitShareCategory share_category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String sticker_id;

    static final class ProtoAdapter_BitmojiKitShare extends ProtoAdapter<BitmojiKitShare> {
        static {
            Covode.recordClassIndex(35666);
        }

        public ProtoAdapter_BitmojiKitShare() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitShare.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare.ProtoAdapter_BitmojiKitShare.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare");
        }

        public final int encodedSize(BitmojiKitShare bitmojiKitShare) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitShare.bitmoji_kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(3, bitmojiKitShare.sticker_id) + BitmojiKitShareCategory.ADAPTER.encodedSizeWithTag(4, bitmojiKitShare.share_category) + BitmojiKitSearchCategory.ADAPTER.encodedSizeWithTag(5, bitmojiKitShare.search_category) + bitmojiKitShare.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitShare decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base(BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.sticker_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    try {
                        builder.share_category(BitmojiKitShareCategory.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.search_category(BitmojiKitSearchCategory.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitShare bitmojiKitShare) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitShare.bitmoji_kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bitmojiKitShare.sticker_id);
            BitmojiKitShareCategory.ADAPTER.encodeWithTag(protoWriter, 4, bitmojiKitShare.share_category);
            BitmojiKitSearchCategory.ADAPTER.encodeWithTag(protoWriter, 5, bitmojiKitShare.search_category);
            protoWriter.writeBytes(bitmojiKitShare.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitShare, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitSearchCategory search_category;
        public BitmojiKitShareCategory share_category;
        public String sticker_id;

        static {
            Covode.recordClassIndex(35665);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitShare build() {
            return new BitmojiKitShare(this.bitmoji_kit_event_base, this.sticker_id, this.share_category, this.search_category, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder search_category(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            this.search_category = bitmojiKitSearchCategory;
            return this;
        }

        public final Builder share_category(BitmojiKitShareCategory bitmojiKitShareCategory) {
            this.share_category = bitmojiKitShareCategory;
            return this;
        }

        public final Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35664);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitShare, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.sticker_id = this.sticker_id;
        builder.share_category = this.share_category;
        builder.search_category = this.search_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        int i6 = 0;
        if (bitmojiKitEventBase != null) {
            i2 = bitmojiKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str = this.sticker_id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        BitmojiKitShareCategory bitmojiKitShareCategory = this.share_category;
        if (bitmojiKitShareCategory != null) {
            i4 = bitmojiKitShareCategory.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        BitmojiKitSearchCategory bitmojiKitSearchCategory = this.search_category;
        if (bitmojiKitSearchCategory != null) {
            i6 = bitmojiKitSearchCategory.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=").append(this.bitmoji_kit_event_base);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=").append(this.sticker_id);
        }
        if (this.share_category != null) {
            sb.append(", share_category=").append(this.share_category);
        }
        if (this.search_category != null) {
            sb.append(", search_category=").append(this.search_category);
        }
        return sb.replace(0, 2, "BitmojiKitShare{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitShare)) {
            return false;
        }
        BitmojiKitShare bitmojiKitShare = (BitmojiKitShare) obj;
        if (!unknownFields().equals(bitmojiKitShare.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitShare.bitmoji_kit_event_base) || !Internal.equals(this.sticker_id, bitmojiKitShare.sticker_id) || !Internal.equals(this.share_category, bitmojiKitShare.share_category) || !Internal.equals(this.search_category, bitmojiKitShare.search_category)) {
            return false;
        }
        return true;
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory) {
        this(bitmojiKitEventBase, str, bitmojiKitShareCategory, bitmojiKitSearchCategory, i.EMPTY);
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.sticker_id = str;
        this.share_category = bitmojiKitShareCategory;
        this.search_category = bitmojiKitSearchCategory;
    }
}
