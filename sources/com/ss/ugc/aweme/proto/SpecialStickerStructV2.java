package com.ss.ugc.aweme.proto;

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

public final class SpecialStickerStructV2 extends Message<SpecialStickerStructV2, Builder> {
    public static final ProtoAdapter<SpecialStickerStructV2> ADAPTER = new ProtoAdapter_SpecialStickerStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String sticker_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer sticker_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;

    public SpecialStickerStructV2() {
    }

    static final class ProtoAdapter_SpecialStickerStructV2 extends ProtoAdapter<SpecialStickerStructV2> {
        static {
            Covode.recordClassIndex(102214);
        }

        public ProtoAdapter_SpecialStickerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, SpecialStickerStructV2.class);
        }

        public final int encodedSize(SpecialStickerStructV2 specialStickerStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, specialStickerStructV2.sticker_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, specialStickerStructV2.link) + ProtoAdapter.STRING.encodedSizeWithTag(3, specialStickerStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, specialStickerStructV2.sticker_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, specialStickerStructV2.icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, specialStickerStructV2.open_url) + specialStickerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SpecialStickerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sticker_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.link(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.sticker_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.open_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SpecialStickerStructV2 specialStickerStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, specialStickerStructV2.sticker_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, specialStickerStructV2.link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, specialStickerStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, specialStickerStructV2.sticker_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, specialStickerStructV2.icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, specialStickerStructV2.open_url);
            protoWriter.writeBytes(specialStickerStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102212);
    }

    public static final class Builder extends Message.Builder<SpecialStickerStructV2, Builder> {
        public UrlStructV2 icon_url;
        public String link;
        public String open_url;
        public String sticker_id;
        public Integer sticker_type;
        public String title;

        static {
            Covode.recordClassIndex(102213);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SpecialStickerStructV2 build() {
            return new SpecialStickerStructV2(this.sticker_type, this.link, this.title, this.sticker_id, this.icon_url, this.open_url, super.buildUnknownFields());
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }

        public final Builder sticker_type(Integer num) {
            this.sticker_type = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.SpecialStickerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SpecialStickerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sticker_type = this.sticker_type;
        builder.link = this.link;
        builder.title = this.title;
        builder.sticker_id = this.sticker_id;
        builder.icon_url = this.icon_url;
        builder.open_url = this.open_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.sticker_type;
        int i8 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        String str = this.link;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        String str3 = this.sticker_id;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        UrlStructV2 urlStructV2 = this.icon_url;
        if (urlStructV2 != null) {
            i6 = urlStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        String str4 = this.open_url;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sticker_type != null) {
            sb.append(", sticker_type=").append(this.sticker_type);
        }
        if (this.link != null) {
            sb.append(", link=").append(this.link);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=").append(this.sticker_id);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=").append(this.icon_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=").append(this.open_url);
        }
        return sb.replace(0, 2, "SpecialStickerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialStickerStructV2)) {
            return false;
        }
        SpecialStickerStructV2 specialStickerStructV2 = (SpecialStickerStructV2) obj;
        if (!unknownFields().equals(specialStickerStructV2.unknownFields()) || !Internal.equals(this.sticker_type, specialStickerStructV2.sticker_type) || !Internal.equals(this.link, specialStickerStructV2.link) || !Internal.equals(this.title, specialStickerStructV2.title) || !Internal.equals(this.sticker_id, specialStickerStructV2.sticker_id) || !Internal.equals(this.icon_url, specialStickerStructV2.icon_url) || !Internal.equals(this.open_url, specialStickerStructV2.open_url)) {
            return false;
        }
        return true;
    }

    public SpecialStickerStructV2(Integer num, String str, String str2, String str3, UrlStructV2 urlStructV2, String str4) {
        this(num, str, str2, str3, urlStructV2, str4, i.EMPTY);
    }

    public SpecialStickerStructV2(Integer num, String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.sticker_type = num;
        this.link = str;
        this.title = str2;
        this.sticker_id = str3;
        this.icon_url = urlStructV2;
        this.open_url = str4;
    }
}
