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

public final class OriginalMusicianStructV2 extends Message<OriginalMusicianStructV2, Builder> {
    public static final ProtoAdapter<OriginalMusicianStructV2> ADAPTER = new ProtoAdapter_OriginalMusicianStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer music_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 music_cover_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 music_qrcode_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer music_used_count;

    public OriginalMusicianStructV2() {
    }

    static final class ProtoAdapter_OriginalMusicianStructV2 extends ProtoAdapter<OriginalMusicianStructV2> {
        static {
            Covode.recordClassIndex(102154);
        }

        public ProtoAdapter_OriginalMusicianStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OriginalMusicianStructV2.class);
        }

        public final int encodedSize(OriginalMusicianStructV2 originalMusicianStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, originalMusicianStructV2.music_count) + ProtoAdapter.INT32.encodedSizeWithTag(2, originalMusicianStructV2.music_used_count) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, originalMusicianStructV2.music_qrcode_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, originalMusicianStructV2.music_cover_url) + ProtoAdapter.INT32.encodedSizeWithTag(5, originalMusicianStructV2.digg_count) + originalMusicianStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final OriginalMusicianStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.music_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.music_used_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.music_qrcode_url(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.music_cover_url(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.digg_count(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, OriginalMusicianStructV2 originalMusicianStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, originalMusicianStructV2.music_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, originalMusicianStructV2.music_used_count);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, originalMusicianStructV2.music_qrcode_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, originalMusicianStructV2.music_cover_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, originalMusicianStructV2.digg_count);
            protoWriter.writeBytes(originalMusicianStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102152);
    }

    public static final class Builder extends Message.Builder<OriginalMusicianStructV2, Builder> {
        public Integer digg_count;
        public Integer music_count;
        public UrlStructV2 music_cover_url;
        public UrlStructV2 music_qrcode_url;
        public Integer music_used_count;

        static {
            Covode.recordClassIndex(102153);
        }

        @Override // com.squareup.wire.Message.Builder
        public final OriginalMusicianStructV2 build() {
            return new OriginalMusicianStructV2(this.music_count, this.music_used_count, this.music_qrcode_url, this.music_cover_url, this.digg_count, super.buildUnknownFields());
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder music_count(Integer num) {
            this.music_count = num;
            return this;
        }

        public final Builder music_cover_url(UrlStructV2 urlStructV2) {
            this.music_cover_url = urlStructV2;
            return this;
        }

        public final Builder music_qrcode_url(UrlStructV2 urlStructV2) {
            this.music_qrcode_url = urlStructV2;
            return this;
        }

        public final Builder music_used_count(Integer num) {
            this.music_used_count = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.OriginalMusicianStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<OriginalMusicianStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.music_count = this.music_count;
        builder.music_used_count = this.music_used_count;
        builder.music_qrcode_url = this.music_qrcode_url;
        builder.music_cover_url = this.music_cover_url;
        builder.digg_count = this.digg_count;
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
        Integer num = this.music_count;
        int i7 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        Integer num2 = this.music_used_count;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        UrlStructV2 urlStructV2 = this.music_qrcode_url;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        UrlStructV2 urlStructV22 = this.music_cover_url;
        if (urlStructV22 != null) {
            i5 = urlStructV22.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        Integer num3 = this.digg_count;
        if (num3 != null) {
            i7 = num3.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.music_count != null) {
            sb.append(", music_count=").append(this.music_count);
        }
        if (this.music_used_count != null) {
            sb.append(", music_used_count=").append(this.music_used_count);
        }
        if (this.music_qrcode_url != null) {
            sb.append(", music_qrcode_url=").append(this.music_qrcode_url);
        }
        if (this.music_cover_url != null) {
            sb.append(", music_cover_url=").append(this.music_cover_url);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=").append(this.digg_count);
        }
        return sb.replace(0, 2, "OriginalMusicianStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OriginalMusicianStructV2)) {
            return false;
        }
        OriginalMusicianStructV2 originalMusicianStructV2 = (OriginalMusicianStructV2) obj;
        if (!unknownFields().equals(originalMusicianStructV2.unknownFields()) || !Internal.equals(this.music_count, originalMusicianStructV2.music_count) || !Internal.equals(this.music_used_count, originalMusicianStructV2.music_used_count) || !Internal.equals(this.music_qrcode_url, originalMusicianStructV2.music_qrcode_url) || !Internal.equals(this.music_cover_url, originalMusicianStructV2.music_cover_url) || !Internal.equals(this.digg_count, originalMusicianStructV2.digg_count)) {
            return false;
        }
        return true;
    }

    public OriginalMusicianStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3) {
        this(num, num2, urlStructV2, urlStructV22, num3, i.EMPTY);
    }

    public OriginalMusicianStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, i iVar) {
        super(ADAPTER, iVar);
        this.music_count = num;
        this.music_used_count = num2;
        this.music_qrcode_url = urlStructV2;
        this.music_cover_url = urlStructV22;
        this.digg_count = num3;
    }
}
