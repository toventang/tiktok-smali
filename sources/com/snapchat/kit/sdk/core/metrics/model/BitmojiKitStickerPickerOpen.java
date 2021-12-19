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

public final class BitmojiKitStickerPickerOpen extends Message<BitmojiKitStickerPickerOpen, Builder> {
    public static final ProtoAdapter<BitmojiKitStickerPickerOpen> ADAPTER = new ProtoAdapter_BitmojiKitStickerPickerOpen();
    public static final BitmojiKitSearchBarConfiguration DEFAULT_SEARCH_BAR_CONFIGURATION = BitmojiKitSearchBarConfiguration.SEARCH_BAR_VISIBLE;
    public static final BitmojiKitStickerPickerView DEFAULT_STICKER_PICKER_VIEW = BitmojiKitStickerPickerView.UNKNOWN_BITMOJI_KIT_PICKER_VIEW;
    public static final BitmojiKitTagSelectorConfiguration DEFAULT_TAG_SELECTOR_CONFIGURATION = BitmojiKitTagSelectorConfiguration.TAG_SELECTOR_VISIBLE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String preview_icon_sticker_id;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchBarConfiguration#ADAPTER", tag = 3)
    public final BitmojiKitSearchBarConfiguration search_bar_configuration;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView#ADAPTER", tag = 2)
    public final BitmojiKitStickerPickerView sticker_picker_view;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitTagSelectorConfiguration#ADAPTER", tag = 4)
    public final BitmojiKitTagSelectorConfiguration tag_selector_configuration;

    static final class ProtoAdapter_BitmojiKitStickerPickerOpen extends ProtoAdapter<BitmojiKitStickerPickerOpen> {
        static {
            Covode.recordClassIndex(35683);
        }

        public ProtoAdapter_BitmojiKitStickerPickerOpen() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitStickerPickerOpen.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen.ProtoAdapter_BitmojiKitStickerPickerOpen.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen");
        }

        public final int encodedSize(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base) + BitmojiKitStickerPickerView.ADAPTER.encodedSizeWithTag(2, bitmojiKitStickerPickerOpen.sticker_picker_view) + BitmojiKitSearchBarConfiguration.ADAPTER.encodedSizeWithTag(3, bitmojiKitStickerPickerOpen.search_bar_configuration) + BitmojiKitTagSelectorConfiguration.ADAPTER.encodedSizeWithTag(4, bitmojiKitStickerPickerOpen.tag_selector_configuration) + ProtoAdapter.STRING.encodedSizeWithTag(5, bitmojiKitStickerPickerOpen.preview_icon_sticker_id) + bitmojiKitStickerPickerOpen.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitStickerPickerOpen decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base(BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.sticker_picker_view(BitmojiKitStickerPickerView.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    try {
                        builder.search_bar_configuration(BitmojiKitSearchBarConfiguration.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                    }
                } else if (nextTag == 4) {
                    try {
                        builder.tag_selector_configuration(BitmojiKitTagSelectorConfiguration.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.preview_icon_sticker_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base);
            BitmojiKitStickerPickerView.ADAPTER.encodeWithTag(protoWriter, 2, bitmojiKitStickerPickerOpen.sticker_picker_view);
            BitmojiKitSearchBarConfiguration.ADAPTER.encodeWithTag(protoWriter, 3, bitmojiKitStickerPickerOpen.search_bar_configuration);
            BitmojiKitTagSelectorConfiguration.ADAPTER.encodeWithTag(protoWriter, 4, bitmojiKitStickerPickerOpen.tag_selector_configuration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bitmojiKitStickerPickerOpen.preview_icon_sticker_id);
            protoWriter.writeBytes(bitmojiKitStickerPickerOpen.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitStickerPickerOpen, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public String preview_icon_sticker_id;
        public BitmojiKitSearchBarConfiguration search_bar_configuration;
        public BitmojiKitStickerPickerView sticker_picker_view;
        public BitmojiKitTagSelectorConfiguration tag_selector_configuration;

        static {
            Covode.recordClassIndex(35682);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitStickerPickerOpen build() {
            return new BitmojiKitStickerPickerOpen(this.bitmoji_kit_event_base, this.sticker_picker_view, this.search_bar_configuration, this.tag_selector_configuration, this.preview_icon_sticker_id, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder preview_icon_sticker_id(String str) {
            this.preview_icon_sticker_id = str;
            return this;
        }

        public final Builder search_bar_configuration(BitmojiKitSearchBarConfiguration bitmojiKitSearchBarConfiguration) {
            this.search_bar_configuration = bitmojiKitSearchBarConfiguration;
            return this;
        }

        public final Builder sticker_picker_view(BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
            this.sticker_picker_view = bitmojiKitStickerPickerView;
            return this;
        }

        public final Builder tag_selector_configuration(BitmojiKitTagSelectorConfiguration bitmojiKitTagSelectorConfiguration) {
            this.tag_selector_configuration = bitmojiKitTagSelectorConfiguration;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35681);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitStickerPickerOpen, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.sticker_picker_view = this.sticker_picker_view;
        builder.search_bar_configuration = this.search_bar_configuration;
        builder.tag_selector_configuration = this.tag_selector_configuration;
        builder.preview_icon_sticker_id = this.preview_icon_sticker_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        int i7 = 0;
        if (bitmojiKitEventBase != null) {
            i2 = bitmojiKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        BitmojiKitStickerPickerView bitmojiKitStickerPickerView = this.sticker_picker_view;
        if (bitmojiKitStickerPickerView != null) {
            i3 = bitmojiKitStickerPickerView.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        BitmojiKitSearchBarConfiguration bitmojiKitSearchBarConfiguration = this.search_bar_configuration;
        if (bitmojiKitSearchBarConfiguration != null) {
            i4 = bitmojiKitSearchBarConfiguration.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        BitmojiKitTagSelectorConfiguration bitmojiKitTagSelectorConfiguration = this.tag_selector_configuration;
        if (bitmojiKitTagSelectorConfiguration != null) {
            i5 = bitmojiKitTagSelectorConfiguration.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        String str = this.preview_icon_sticker_id;
        if (str != null) {
            i7 = str.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=").append(this.bitmoji_kit_event_base);
        }
        if (this.sticker_picker_view != null) {
            sb.append(", sticker_picker_view=").append(this.sticker_picker_view);
        }
        if (this.search_bar_configuration != null) {
            sb.append(", search_bar_configuration=").append(this.search_bar_configuration);
        }
        if (this.tag_selector_configuration != null) {
            sb.append(", tag_selector_configuration=").append(this.tag_selector_configuration);
        }
        if (this.preview_icon_sticker_id != null) {
            sb.append(", preview_icon_sticker_id=").append(this.preview_icon_sticker_id);
        }
        return sb.replace(0, 2, "BitmojiKitStickerPickerOpen{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitStickerPickerOpen)) {
            return false;
        }
        BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = (BitmojiKitStickerPickerOpen) obj;
        if (!unknownFields().equals(bitmojiKitStickerPickerOpen.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base) || !Internal.equals(this.sticker_picker_view, bitmojiKitStickerPickerOpen.sticker_picker_view) || !Internal.equals(this.search_bar_configuration, bitmojiKitStickerPickerOpen.search_bar_configuration) || !Internal.equals(this.tag_selector_configuration, bitmojiKitStickerPickerOpen.tag_selector_configuration) || !Internal.equals(this.preview_icon_sticker_id, bitmojiKitStickerPickerOpen.preview_icon_sticker_id)) {
            return false;
        }
        return true;
    }

    public BitmojiKitStickerPickerOpen(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitStickerPickerView bitmojiKitStickerPickerView, BitmojiKitSearchBarConfiguration bitmojiKitSearchBarConfiguration, BitmojiKitTagSelectorConfiguration bitmojiKitTagSelectorConfiguration, String str) {
        this(bitmojiKitEventBase, bitmojiKitStickerPickerView, bitmojiKitSearchBarConfiguration, bitmojiKitTagSelectorConfiguration, str, i.EMPTY);
    }

    public BitmojiKitStickerPickerOpen(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitStickerPickerView bitmojiKitStickerPickerView, BitmojiKitSearchBarConfiguration bitmojiKitSearchBarConfiguration, BitmojiKitTagSelectorConfiguration bitmojiKitTagSelectorConfiguration, String str, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.sticker_picker_view = bitmojiKitStickerPickerView;
        this.search_bar_configuration = bitmojiKitSearchBarConfiguration;
        this.tag_selector_configuration = bitmojiKitTagSelectorConfiguration;
        this.preview_icon_sticker_id = str;
    }
}
