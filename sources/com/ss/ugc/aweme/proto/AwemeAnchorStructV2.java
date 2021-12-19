package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.c.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class AwemeAnchorStructV2 extends Message<AwemeAnchorStructV2, Builder> {
    public static final ProtoAdapter<AwemeAnchorStructV2> ADAPTER = new ProtoAdapter_AwemeAnchorStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 99)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = a.f41622a)
    public String log_extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String mp_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String title_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String web_url;

    public AwemeAnchorStructV2() {
    }

    static final class ProtoAdapter_AwemeAnchorStructV2 extends ProtoAdapter<AwemeAnchorStructV2> {
        static {
            Covode.recordClassIndex(101884);
        }

        public ProtoAdapter_AwemeAnchorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeAnchorStructV2.class);
        }

        public final int encodedSize(AwemeAnchorStructV2 awemeAnchorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeAnchorStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeAnchorStructV2.id) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, awemeAnchorStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(4, awemeAnchorStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeAnchorStructV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, awemeAnchorStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(7, awemeAnchorStructV2.mp_url) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeAnchorStructV2.title_tag) + ProtoAdapter.STRING.encodedSizeWithTag(99, awemeAnchorStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(100, awemeAnchorStructV2.log_extra) + awemeAnchorStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeAnchorStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 99) {
                    builder.extra(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            continue;
                        case 2:
                            builder.id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 3:
                            builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                            continue;
                        case 4:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.open_url(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.web_url(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.mp_url(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.title_tag(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.log_extra(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeAnchorStructV2 awemeAnchorStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeAnchorStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeAnchorStructV2.id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, awemeAnchorStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, awemeAnchorStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeAnchorStructV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, awemeAnchorStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, awemeAnchorStructV2.mp_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeAnchorStructV2.title_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 99, awemeAnchorStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, awemeAnchorStructV2.log_extra);
            protoWriter.writeBytes(awemeAnchorStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101882);
    }

    public static final class Builder extends Message.Builder<AwemeAnchorStructV2, Builder> {
        public String extra;
        public UrlStructV2 icon;
        public String id;
        public String log_extra;
        public String mp_url;
        public String open_url;
        public String title;
        public String title_tag;
        public Integer type;
        public String web_url;

        static {
            Covode.recordClassIndex(101883);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeAnchorStructV2 build() {
            return new AwemeAnchorStructV2(this.type, this.id, this.icon, this.title, this.open_url, this.web_url, this.mp_url, this.title_tag, this.extra, this.log_extra, super.buildUnknownFields());
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder log_extra(String str) {
            this.log_extra = str;
            return this;
        }

        public final Builder mp_url(String str) {
            this.mp_url = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder title_tag(String str) {
            this.title_tag = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeAnchorStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeAnchorStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.id = this.id;
        builder.icon = this.icon;
        builder.title = this.title;
        builder.open_url = this.open_url;
        builder.web_url = this.web_url;
        builder.mp_url = this.mp_url;
        builder.title_tag = this.title_tag;
        builder.extra = this.extra;
        builder.log_extra = this.log_extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.type;
        int i12 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        String str = this.id;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i4 = urlStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        String str3 = this.open_url;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        String str4 = this.web_url;
        if (str4 != null) {
            i7 = str4.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        String str5 = this.mp_url;
        if (str5 != null) {
            i8 = str5.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        String str6 = this.title_tag;
        if (str6 != null) {
            i9 = str6.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        String str7 = this.extra;
        if (str7 != null) {
            i10 = str7.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        String str8 = this.log_extra;
        if (str8 != null) {
            i12 = str8.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.open_url != null) {
            sb.append(", open_url=").append(this.open_url);
        }
        if (this.web_url != null) {
            sb.append(", web_url=").append(this.web_url);
        }
        if (this.mp_url != null) {
            sb.append(", mp_url=").append(this.mp_url);
        }
        if (this.title_tag != null) {
            sb.append(", title_tag=").append(this.title_tag);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.log_extra != null) {
            sb.append(", log_extra=").append(this.log_extra);
        }
        return sb.replace(0, 2, "AwemeAnchorStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeAnchorStructV2)) {
            return false;
        }
        AwemeAnchorStructV2 awemeAnchorStructV2 = (AwemeAnchorStructV2) obj;
        if (!unknownFields().equals(awemeAnchorStructV2.unknownFields()) || !Internal.equals(this.type, awemeAnchorStructV2.type) || !Internal.equals(this.id, awemeAnchorStructV2.id) || !Internal.equals(this.icon, awemeAnchorStructV2.icon) || !Internal.equals(this.title, awemeAnchorStructV2.title) || !Internal.equals(this.open_url, awemeAnchorStructV2.open_url) || !Internal.equals(this.web_url, awemeAnchorStructV2.web_url) || !Internal.equals(this.mp_url, awemeAnchorStructV2.mp_url) || !Internal.equals(this.title_tag, awemeAnchorStructV2.title_tag) || !Internal.equals(this.extra, awemeAnchorStructV2.extra) || !Internal.equals(this.log_extra, awemeAnchorStructV2.log_extra)) {
            return false;
        }
        return true;
    }

    public AwemeAnchorStructV2(Integer num, String str, UrlStructV2 urlStructV2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(num, str, urlStructV2, str2, str3, str4, str5, str6, str7, str8, i.EMPTY);
    }

    public AwemeAnchorStructV2(Integer num, String str, UrlStructV2 urlStructV2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, i iVar) {
        super(ADAPTER, iVar);
        this.type = num;
        this.id = str;
        this.icon = urlStructV2;
        this.title = str2;
        this.open_url = str3;
        this.web_url = str4;
        this.mp_url = str5;
        this.title_tag = str6;
        this.extra = str7;
        this.log_extra = str8;
    }
}
