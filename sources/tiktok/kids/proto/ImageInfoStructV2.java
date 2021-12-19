package tiktok.kids.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ImageInfoStructV2 extends Message<ImageInfoStructV2, Builder> {
    public static final ProtoAdapter<ImageInfoStructV2> ADAPTER = new ProtoAdapter_ImageInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer height;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 label_large;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 label_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer width;

    public ImageInfoStructV2() {
    }

    static final class ProtoAdapter_ImageInfoStructV2 extends ProtoAdapter<ImageInfoStructV2> {
        static {
            Covode.recordClassIndex(106746);
        }

        public ProtoAdapter_ImageInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageInfoStructV2.class);
        }

        public final int encodedSize(ImageInfoStructV2 imageInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, imageInfoStructV2.height) + ProtoAdapter.INT32.encodedSizeWithTag(2, imageInfoStructV2.width) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, imageInfoStructV2.label_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, imageInfoStructV2.label_thumb) + imageInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ImageInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.height(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.width(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.label_large(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.label_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ImageInfoStructV2 imageInfoStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, imageInfoStructV2.height);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, imageInfoStructV2.width);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, imageInfoStructV2.label_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, imageInfoStructV2.label_thumb);
            protoWriter.writeBytes(imageInfoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106744);
    }

    public static final class Builder extends Message.Builder<ImageInfoStructV2, Builder> {
        public Integer height;
        public UrlStructV2 label_large;
        public UrlStructV2 label_thumb;
        public Integer width;

        static {
            Covode.recordClassIndex(106745);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ImageInfoStructV2 build() {
            return new ImageInfoStructV2(this.height, this.width, this.label_large, this.label_thumb, super.buildUnknownFields());
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder label_large(UrlStructV2 urlStructV2) {
            this.label_large = urlStructV2;
            return this;
        }

        public final Builder label_thumb(UrlStructV2 urlStructV2) {
            this.label_thumb = urlStructV2;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.ImageInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ImageInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.height = this.height;
        builder.width = this.width;
        builder.label_large = this.label_large;
        builder.label_thumb = this.label_thumb;
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
        Integer num = this.height;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Integer num2 = this.width;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        UrlStructV2 urlStructV2 = this.label_large;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        UrlStructV2 urlStructV22 = this.label_thumb;
        if (urlStructV22 != null) {
            i6 = urlStructV22.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.height != null) {
            sb.append(", height=").append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=").append(this.width);
        }
        if (this.label_large != null) {
            sb.append(", label_large=").append(this.label_large);
        }
        if (this.label_thumb != null) {
            sb.append(", label_thumb=").append(this.label_thumb);
        }
        return sb.replace(0, 2, "ImageInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageInfoStructV2)) {
            return false;
        }
        ImageInfoStructV2 imageInfoStructV2 = (ImageInfoStructV2) obj;
        if (!unknownFields().equals(imageInfoStructV2.unknownFields()) || !Internal.equals(this.height, imageInfoStructV2.height) || !Internal.equals(this.width, imageInfoStructV2.width) || !Internal.equals(this.label_large, imageInfoStructV2.label_large) || !Internal.equals(this.label_thumb, imageInfoStructV2.label_thumb)) {
            return false;
        }
        return true;
    }

    public ImageInfoStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(num, num2, urlStructV2, urlStructV22, i.EMPTY);
    }

    public ImageInfoStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, i iVar) {
        super(ADAPTER, iVar);
        this.height = num;
        this.width = num2;
        this.label_large = urlStructV2;
        this.label_thumb = urlStructV22;
    }
}
