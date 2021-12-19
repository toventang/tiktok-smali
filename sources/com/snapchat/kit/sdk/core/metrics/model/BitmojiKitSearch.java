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

public final class BitmojiKitSearch extends Message<BitmojiKitSearch, Builder> {
    public static final ProtoAdapter<BitmojiKitSearch> ADAPTER = new ProtoAdapter_BitmojiKitSearch();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<BitmojiKitSearchTerm> search_terms;

    static final class ProtoAdapter_BitmojiKitSearch extends ProtoAdapter<BitmojiKitSearch> {
        static {
            Covode.recordClassIndex(35656);
        }

        public ProtoAdapter_BitmojiKitSearch() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSearch.class);
        }

        public final int encodedSize(BitmojiKitSearch bitmojiKitSearch) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitSearch.bitmoji_kit_event_base) + BitmojiKitSearchTerm.ADAPTER.asRepeated().encodedSizeWithTag(2, bitmojiKitSearch.search_terms) + bitmojiKitSearch.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                java.util.List<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm> r1 = r2.search_terms
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm> r0 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchTerm.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch.ProtoAdapter_BitmojiKitSearch.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitSearch decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base(BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.search_terms.add(BitmojiKitSearchTerm.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitSearch bitmojiKitSearch) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSearch.bitmoji_kit_event_base);
            BitmojiKitSearchTerm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, bitmojiKitSearch.search_terms);
            protoWriter.writeBytes(bitmojiKitSearch.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitSearch, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public List<BitmojiKitSearchTerm> search_terms = Internal.newMutableList();

        static {
            Covode.recordClassIndex(35655);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitSearch build() {
            return new BitmojiKitSearch(this.bitmoji_kit_event_base, this.search_terms, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder search_terms(List<BitmojiKitSearchTerm> list) {
            Internal.checkElementsNotNull(list);
            this.search_terms = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35654);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitSearch, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.search_terms = Internal.copyOf("search_terms", this.search_terms);
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
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        if (bitmojiKitEventBase != null) {
            i2 = bitmojiKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = ((hashCode + i2) * 37) + this.search_terms.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=").append(this.bitmoji_kit_event_base);
        }
        if (!this.search_terms.isEmpty()) {
            sb.append(", search_terms=").append(this.search_terms);
        }
        return sb.replace(0, 2, "BitmojiKitSearch{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSearch)) {
            return false;
        }
        BitmojiKitSearch bitmojiKitSearch = (BitmojiKitSearch) obj;
        if (!unknownFields().equals(bitmojiKitSearch.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitSearch.bitmoji_kit_event_base) || !this.search_terms.equals(bitmojiKitSearch.search_terms)) {
            return false;
        }
        return true;
    }

    public BitmojiKitSearch(BitmojiKitEventBase bitmojiKitEventBase, List<BitmojiKitSearchTerm> list) {
        this(bitmojiKitEventBase, list, i.EMPTY);
    }

    public BitmojiKitSearch(BitmojiKitEventBase bitmojiKitEventBase, List<BitmojiKitSearchTerm> list, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.search_terms = Internal.immutableCopyOf("search_terms", list);
    }
}
