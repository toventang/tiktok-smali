package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

/* access modifiers changed from: package-private */
public final class CategoryCoverStructV2 extends Message<CategoryCoverStructV2, Builder> {
    public static final ProtoAdapter<CategoryCoverStructV2> ADAPTER = new ProtoAdapter_CategoryCoverStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 dynamic_cover;

    static final class ProtoAdapter_CategoryCoverStructV2 extends ProtoAdapter<CategoryCoverStructV2> {
        static {
            Covode.recordClassIndex(101953);
        }

        public ProtoAdapter_CategoryCoverStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryCoverStructV2.class);
        }

        public final int encodedSize(CategoryCoverStructV2 categoryCoverStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryCoverStructV2.aweme_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, categoryCoverStructV2.cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, categoryCoverStructV2.dynamic_cover) + categoryCoverStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CategoryCoverStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.cover(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.dynamic_cover(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CategoryCoverStructV2 categoryCoverStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, categoryCoverStructV2.aweme_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, categoryCoverStructV2.cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, categoryCoverStructV2.dynamic_cover);
            protoWriter.writeBytes(categoryCoverStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CategoryCoverStructV2, Builder> {
        public String aweme_id;
        public UrlStructV2 cover;
        public UrlStructV2 dynamic_cover;

        static {
            Covode.recordClassIndex(101952);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CategoryCoverStructV2 build() {
            return new CategoryCoverStructV2(this.aweme_id, this.cover, this.dynamic_cover, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder cover(UrlStructV2 urlStructV2) {
            this.cover = urlStructV2;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101951);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CategoryCoverStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CategoryCoverStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.cover = this.cover;
        builder.dynamic_cover = this.dynamic_cover;
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
        String str = this.aweme_id;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV2 = this.cover;
        if (urlStructV2 != null) {
            i3 = urlStructV2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        UrlStructV2 urlStructV22 = this.dynamic_cover;
        if (urlStructV22 != null) {
            i5 = urlStructV22.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.cover != null) {
            sb.append(", cover=").append(this.cover);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=").append(this.dynamic_cover);
        }
        return sb.replace(0, 2, "CategoryCoverStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryCoverStructV2)) {
            return false;
        }
        CategoryCoverStructV2 categoryCoverStructV2 = (CategoryCoverStructV2) obj;
        if (!unknownFields().equals(categoryCoverStructV2.unknownFields()) || !Internal.equals(this.aweme_id, categoryCoverStructV2.aweme_id) || !Internal.equals(this.cover, categoryCoverStructV2.cover) || !Internal.equals(this.dynamic_cover, categoryCoverStructV2.dynamic_cover)) {
            return false;
        }
        return true;
    }

    public CategoryCoverStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(str, urlStructV2, urlStructV22, i.EMPTY);
    }

    public CategoryCoverStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.cover = urlStructV2;
        this.dynamic_cover = urlStructV22;
    }
}
