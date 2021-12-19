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

public final class BannerTipV2 extends Message<BannerTipV2, Builder> {
    public static final ProtoAdapter<BannerTipV2> ADAPTER = new ProtoAdapter_BannerTipV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String banner_txt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer banner_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String link_txt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String link_url;

    public BannerTipV2() {
    }

    static final class ProtoAdapter_BannerTipV2 extends ProtoAdapter<BannerTipV2> {
        static {
            Covode.recordClassIndex(101920);
        }

        public ProtoAdapter_BannerTipV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BannerTipV2.class);
        }

        public final int encodedSize(BannerTipV2 bannerTipV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, bannerTipV2.banner_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, bannerTipV2.banner_txt) + ProtoAdapter.INT32.encodedSizeWithTag(3, bannerTipV2.link_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, bannerTipV2.link_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, bannerTipV2.link_txt) + bannerTipV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BannerTipV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.banner_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.banner_txt(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.link_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.link_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.link_txt(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BannerTipV2 bannerTipV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, bannerTipV2.banner_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bannerTipV2.banner_txt);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bannerTipV2.link_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, bannerTipV2.link_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, bannerTipV2.link_txt);
            protoWriter.writeBytes(bannerTipV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101918);
    }

    public static final class Builder extends Message.Builder<BannerTipV2, Builder> {
        public String banner_txt;
        public Integer banner_type;
        public String link_txt;
        public Integer link_type;
        public String link_url;

        static {
            Covode.recordClassIndex(101919);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BannerTipV2 build() {
            return new BannerTipV2(this.banner_type, this.banner_txt, this.link_type, this.link_url, this.link_txt, super.buildUnknownFields());
        }

        public final Builder banner_txt(String str) {
            this.banner_txt = str;
            return this;
        }

        public final Builder banner_type(Integer num) {
            this.banner_type = num;
            return this;
        }

        public final Builder link_txt(String str) {
            this.link_txt = str;
            return this;
        }

        public final Builder link_type(Integer num) {
            this.link_type = num;
            return this;
        }

        public final Builder link_url(String str) {
            this.link_url = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.BannerTipV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BannerTipV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.banner_type = this.banner_type;
        builder.banner_txt = this.banner_txt;
        builder.link_type = this.link_type;
        builder.link_url = this.link_url;
        builder.link_txt = this.link_txt;
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
        Integer num = this.banner_type;
        int i7 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 37;
        String str = this.banner_txt;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        Integer num2 = this.link_type;
        if (num2 != null) {
            i4 = num2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        String str2 = this.link_url;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        String str3 = this.link_txt;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.banner_type != null) {
            sb.append(", banner_type=").append(this.banner_type);
        }
        if (this.banner_txt != null) {
            sb.append(", banner_txt=").append(this.banner_txt);
        }
        if (this.link_type != null) {
            sb.append(", link_type=").append(this.link_type);
        }
        if (this.link_url != null) {
            sb.append(", link_url=").append(this.link_url);
        }
        if (this.link_txt != null) {
            sb.append(", link_txt=").append(this.link_txt);
        }
        return sb.replace(0, 2, "BannerTipV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerTipV2)) {
            return false;
        }
        BannerTipV2 bannerTipV2 = (BannerTipV2) obj;
        if (!unknownFields().equals(bannerTipV2.unknownFields()) || !Internal.equals(this.banner_type, bannerTipV2.banner_type) || !Internal.equals(this.banner_txt, bannerTipV2.banner_txt) || !Internal.equals(this.link_type, bannerTipV2.link_type) || !Internal.equals(this.link_url, bannerTipV2.link_url) || !Internal.equals(this.link_txt, bannerTipV2.link_txt)) {
            return false;
        }
        return true;
    }

    public BannerTipV2(Integer num, String str, Integer num2, String str2, String str3) {
        this(num, str, num2, str2, str3, i.EMPTY);
    }

    public BannerTipV2(Integer num, String str, Integer num2, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.banner_type = num;
        this.banner_txt = str;
        this.link_type = num2;
        this.link_url = str2;
        this.link_txt = str3;
    }
}
