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

public final class TrendingBarStructV2 extends Message<TrendingBarStructV2, Builder> {
    public static final ProtoAdapter<TrendingBarStructV2> ADAPTER = new ProtoAdapter_TrendingBarStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 button_icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String display;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String event_keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long event_keyword_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String event_tracking_param;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String schema;

    public TrendingBarStructV2() {
    }

    static final class ProtoAdapter_TrendingBarStructV2 extends ProtoAdapter<TrendingBarStructV2> {
        static {
            Covode.recordClassIndex(102241);
        }

        public ProtoAdapter_TrendingBarStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, TrendingBarStructV2.class);
        }

        public final int encodedSize(TrendingBarStructV2 trendingBarStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, trendingBarStructV2.icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, trendingBarStructV2.display) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, trendingBarStructV2.button_icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, trendingBarStructV2.schema) + ProtoAdapter.INT64.encodedSizeWithTag(5, trendingBarStructV2.event_keyword_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, trendingBarStructV2.event_keyword) + ProtoAdapter.STRING.encodedSizeWithTag(7, trendingBarStructV2.event_tracking_param) + trendingBarStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TrendingBarStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.display(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.button_icon_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.event_keyword_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.event_keyword(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.event_tracking_param(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, TrendingBarStructV2 trendingBarStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, trendingBarStructV2.icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, trendingBarStructV2.display);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, trendingBarStructV2.button_icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, trendingBarStructV2.schema);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, trendingBarStructV2.event_keyword_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, trendingBarStructV2.event_keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, trendingBarStructV2.event_tracking_param);
            protoWriter.writeBytes(trendingBarStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102239);
    }

    public static final class Builder extends Message.Builder<TrendingBarStructV2, Builder> {
        public UrlStructV2 button_icon_url;
        public String display;
        public String event_keyword;
        public Long event_keyword_id;
        public String event_tracking_param;
        public UrlStructV2 icon_url;
        public String schema;

        static {
            Covode.recordClassIndex(102240);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TrendingBarStructV2 build() {
            return new TrendingBarStructV2(this.icon_url, this.display, this.button_icon_url, this.schema, this.event_keyword_id, this.event_keyword, this.event_tracking_param, super.buildUnknownFields());
        }

        public final Builder button_icon_url(UrlStructV2 urlStructV2) {
            this.button_icon_url = urlStructV2;
            return this;
        }

        public final Builder display(String str) {
            this.display = str;
            return this;
        }

        public final Builder event_keyword(String str) {
            this.event_keyword = str;
            return this;
        }

        public final Builder event_keyword_id(Long l2) {
            this.event_keyword_id = l2;
            return this;
        }

        public final Builder event_tracking_param(String str) {
            this.event_tracking_param = str;
            return this;
        }

        public final Builder icon_url(UrlStructV2 urlStructV2) {
            this.icon_url = urlStructV2;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.TrendingBarStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TrendingBarStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.icon_url = this.icon_url;
        builder.display = this.display;
        builder.button_icon_url = this.button_icon_url;
        builder.schema = this.schema;
        builder.event_keyword_id = this.event_keyword_id;
        builder.event_keyword = this.event_keyword;
        builder.event_tracking_param = this.event_tracking_param;
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UrlStructV2 urlStructV2 = this.icon_url;
        int i9 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        String str = this.display;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        UrlStructV2 urlStructV22 = this.button_icon_url;
        if (urlStructV22 != null) {
            i4 = urlStructV22.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        String str2 = this.schema;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        Long l2 = this.event_keyword_id;
        if (l2 != null) {
            i6 = l2.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        String str3 = this.event_keyword;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 37;
        String str4 = this.event_tracking_param;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        int i16 = i15 + i9;
        this.hashCode = i16;
        return i16;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.icon_url != null) {
            sb.append(", icon_url=").append(this.icon_url);
        }
        if (this.display != null) {
            sb.append(", display=").append(this.display);
        }
        if (this.button_icon_url != null) {
            sb.append(", button_icon_url=").append(this.button_icon_url);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.event_keyword_id != null) {
            sb.append(", event_keyword_id=").append(this.event_keyword_id);
        }
        if (this.event_keyword != null) {
            sb.append(", event_keyword=").append(this.event_keyword);
        }
        if (this.event_tracking_param != null) {
            sb.append(", event_tracking_param=").append(this.event_tracking_param);
        }
        return sb.replace(0, 2, "TrendingBarStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrendingBarStructV2)) {
            return false;
        }
        TrendingBarStructV2 trendingBarStructV2 = (TrendingBarStructV2) obj;
        if (!unknownFields().equals(trendingBarStructV2.unknownFields()) || !Internal.equals(this.icon_url, trendingBarStructV2.icon_url) || !Internal.equals(this.display, trendingBarStructV2.display) || !Internal.equals(this.button_icon_url, trendingBarStructV2.button_icon_url) || !Internal.equals(this.schema, trendingBarStructV2.schema) || !Internal.equals(this.event_keyword_id, trendingBarStructV2.event_keyword_id) || !Internal.equals(this.event_keyword, trendingBarStructV2.event_keyword) || !Internal.equals(this.event_tracking_param, trendingBarStructV2.event_tracking_param)) {
            return false;
        }
        return true;
    }

    public TrendingBarStructV2(UrlStructV2 urlStructV2, String str, UrlStructV2 urlStructV22, String str2, Long l2, String str3, String str4) {
        this(urlStructV2, str, urlStructV22, str2, l2, str3, str4, i.EMPTY);
    }

    public TrendingBarStructV2(UrlStructV2 urlStructV2, String str, UrlStructV2 urlStructV22, String str2, Long l2, String str3, String str4, i iVar) {
        super(ADAPTER, iVar);
        this.icon_url = urlStructV2;
        this.display = str;
        this.button_icon_url = urlStructV22;
        this.schema = str2;
        this.event_keyword_id = l2;
        this.event_keyword = str3;
        this.event_tracking_param = str4;
    }
}
