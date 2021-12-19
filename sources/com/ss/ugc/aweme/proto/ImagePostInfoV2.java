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
public final class ImagePostInfoV2 extends Message<ImagePostInfoV2, Builder> {
    public static final ProtoAdapter<ImagePostInfoV2> ADAPTER = new ProtoAdapter_ImagePostInfoV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 display_image;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 owner_watermark_image;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 thumbnail;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 user_watermark_image;

    static final class ProtoAdapter_ImagePostInfoV2 extends ProtoAdapter<ImagePostInfoV2> {
        static {
            Covode.recordClassIndex(102049);
        }

        public ProtoAdapter_ImagePostInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ImagePostInfoV2.class);
        }

        public final int encodedSize(ImagePostInfoV2 imagePostInfoV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, imagePostInfoV2.display_image) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, imagePostInfoV2.owner_watermark_image) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, imagePostInfoV2.user_watermark_image) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, imagePostInfoV2.thumbnail) + imagePostInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ImagePostInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.display_image(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.owner_watermark_image(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.user_watermark_image(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.thumbnail(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ImagePostInfoV2 imagePostInfoV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, imagePostInfoV2.display_image);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, imagePostInfoV2.owner_watermark_image);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, imagePostInfoV2.user_watermark_image);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, imagePostInfoV2.thumbnail);
            protoWriter.writeBytes(imagePostInfoV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102047);
    }

    public static final class Builder extends Message.Builder<ImagePostInfoV2, Builder> {
        public UrlStructV2 display_image;
        public UrlStructV2 owner_watermark_image;
        public UrlStructV2 thumbnail;
        public UrlStructV2 user_watermark_image;

        static {
            Covode.recordClassIndex(102048);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ImagePostInfoV2 build() {
            return new ImagePostInfoV2(this.display_image, this.owner_watermark_image, this.user_watermark_image, this.thumbnail, super.buildUnknownFields());
        }

        public final Builder display_image(UrlStructV2 urlStructV2) {
            this.display_image = urlStructV2;
            return this;
        }

        public final Builder owner_watermark_image(UrlStructV2 urlStructV2) {
            this.owner_watermark_image = urlStructV2;
            return this;
        }

        public final Builder thumbnail(UrlStructV2 urlStructV2) {
            this.thumbnail = urlStructV2;
            return this;
        }

        public final Builder user_watermark_image(UrlStructV2 urlStructV2) {
            this.user_watermark_image = urlStructV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ImagePostInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ImagePostInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.display_image = this.display_image;
        builder.owner_watermark_image = this.owner_watermark_image;
        builder.user_watermark_image = this.user_watermark_image;
        builder.thumbnail = this.thumbnail;
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
        UrlStructV2 urlStructV2 = this.display_image;
        int i6 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV22 = this.owner_watermark_image;
        if (urlStructV22 != null) {
            i3 = urlStructV22.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        UrlStructV2 urlStructV23 = this.user_watermark_image;
        if (urlStructV23 != null) {
            i4 = urlStructV23.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        UrlStructV2 urlStructV24 = this.thumbnail;
        if (urlStructV24 != null) {
            i6 = urlStructV24.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.display_image != null) {
            sb.append(", display_image=").append(this.display_image);
        }
        if (this.owner_watermark_image != null) {
            sb.append(", owner_watermark_image=").append(this.owner_watermark_image);
        }
        if (this.user_watermark_image != null) {
            sb.append(", user_watermark_image=").append(this.user_watermark_image);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=").append(this.thumbnail);
        }
        return sb.replace(0, 2, "ImagePostInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImagePostInfoV2)) {
            return false;
        }
        ImagePostInfoV2 imagePostInfoV2 = (ImagePostInfoV2) obj;
        if (!unknownFields().equals(imagePostInfoV2.unknownFields()) || !Internal.equals(this.display_image, imagePostInfoV2.display_image) || !Internal.equals(this.owner_watermark_image, imagePostInfoV2.owner_watermark_image) || !Internal.equals(this.user_watermark_image, imagePostInfoV2.user_watermark_image) || !Internal.equals(this.thumbnail, imagePostInfoV2.thumbnail)) {
            return false;
        }
        return true;
    }

    public ImagePostInfoV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24) {
        this(urlStructV2, urlStructV22, urlStructV23, urlStructV24, i.EMPTY);
    }

    public ImagePostInfoV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, i iVar) {
        super(ADAPTER, iVar);
        this.display_image = urlStructV2;
        this.owner_watermark_image = urlStructV22;
        this.user_watermark_image = urlStructV23;
        this.thumbnail = urlStructV24;
    }
}
