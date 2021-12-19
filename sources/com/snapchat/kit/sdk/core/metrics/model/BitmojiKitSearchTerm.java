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

public final class BitmojiKitSearchTerm extends Message<BitmojiKitSearchTerm, Builder> {
    public static final ProtoAdapter<BitmojiKitSearchTerm> ADAPTER = new ProtoAdapter_BitmojiKitSearchTerm();
    public static final BitmojiKitSearchCategory DEFAULT_CATEGORY = BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory#ADAPTER", tag = 1)
    public final BitmojiKitSearchCategory category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String value;

    static final class ProtoAdapter_BitmojiKitSearchTerm extends ProtoAdapter<BitmojiKitSearchTerm> {
        static {
            Covode.recordClassIndex(35663);
        }

        public ProtoAdapter_BitmojiKitSearchTerm() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSearchTerm.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm r2) {
            /*
                r1 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.ProtoAdapter_BitmojiKitSearchTerm.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm");
        }

        public final int encodedSize(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            return BitmojiKitSearchCategory.ADAPTER.encodedSizeWithTag(1, bitmojiKitSearchTerm.category) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitSearchTerm.value) + bitmojiKitSearchTerm.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitSearchTerm decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.category(BitmojiKitSearchCategory.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.value(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            BitmojiKitSearchCategory.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSearchTerm.category);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitSearchTerm.value);
            protoWriter.writeBytes(bitmojiKitSearchTerm.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitSearchTerm, Builder> {
        public BitmojiKitSearchCategory category;
        public String value;

        static {
            Covode.recordClassIndex(35662);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitSearchTerm build() {
            return new BitmojiKitSearchTerm(this.category, this.value, super.buildUnknownFields());
        }

        public final Builder category(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            this.category = bitmojiKitSearchCategory;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35661);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitSearchTerm, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.category = this.category;
        builder.value = this.value;
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
        BitmojiKitSearchCategory bitmojiKitSearchCategory = this.category;
        int i4 = 0;
        if (bitmojiKitSearchCategory != null) {
            i2 = bitmojiKitSearchCategory.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.value;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category != null) {
            sb.append(", category=").append(this.category);
        }
        if (this.value != null) {
            sb.append(", value=").append(this.value);
        }
        return sb.replace(0, 2, "BitmojiKitSearchTerm{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSearchTerm)) {
            return false;
        }
        BitmojiKitSearchTerm bitmojiKitSearchTerm = (BitmojiKitSearchTerm) obj;
        if (!unknownFields().equals(bitmojiKitSearchTerm.unknownFields()) || !Internal.equals(this.category, bitmojiKitSearchTerm.category) || !Internal.equals(this.value, bitmojiKitSearchTerm.value)) {
            return false;
        }
        return true;
    }

    public BitmojiKitSearchTerm(BitmojiKitSearchCategory bitmojiKitSearchCategory, String str) {
        this(bitmojiKitSearchCategory, str, i.EMPTY);
    }

    public BitmojiKitSearchTerm(BitmojiKitSearchCategory bitmojiKitSearchCategory, String str, i iVar) {
        super(ADAPTER, iVar);
        this.category = bitmojiKitSearchCategory;
        this.value = str;
    }
}
