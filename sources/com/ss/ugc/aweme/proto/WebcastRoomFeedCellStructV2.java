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

public final class WebcastRoomFeedCellStructV2 extends Message<WebcastRoomFeedCellStructV2, Builder> {
    public static final ProtoAdapter<WebcastRoomFeedCellStructV2> ADAPTER = new ProtoAdapter_WebcastRoomFeedCellStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String distance;
    @WireField(adapter = "com.ss.ugc.aweme.proto.FansStructV2#ADAPTER", tag = 3)
    public FansStructV2 fans_struct;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String rawdata;
    @WireField(adapter = "com.ss.ugc.aweme.proto.WebcastRoomStructV2#ADAPTER", tag = 1)
    public WebcastRoomStructV2 room;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long tag_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer type;

    public WebcastRoomFeedCellStructV2() {
    }

    static final class ProtoAdapter_WebcastRoomFeedCellStructV2 extends ProtoAdapter<WebcastRoomFeedCellStructV2> {
        static {
            Covode.recordClassIndex(102295);
        }

        public ProtoAdapter_WebcastRoomFeedCellStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, WebcastRoomFeedCellStructV2.class);
        }

        public final int encodedSize(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
            return WebcastRoomStructV2.ADAPTER.encodedSizeWithTag(1, webcastRoomFeedCellStructV2.room) + ProtoAdapter.INT32.encodedSizeWithTag(2, webcastRoomFeedCellStructV2.type) + FansStructV2.ADAPTER.encodedSizeWithTag(3, webcastRoomFeedCellStructV2.fans_struct) + ProtoAdapter.STRING.encodedSizeWithTag(4, webcastRoomFeedCellStructV2.tag) + ProtoAdapter.INT64.encodedSizeWithTag(5, webcastRoomFeedCellStructV2.tag_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, webcastRoomFeedCellStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(7, webcastRoomFeedCellStructV2.distance) + ProtoAdapter.STRING.encodedSizeWithTag(8, webcastRoomFeedCellStructV2.rawdata) + webcastRoomFeedCellStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final WebcastRoomFeedCellStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.room(WebcastRoomStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.fans_struct(FansStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.tag_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.distance(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.rawdata(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
            WebcastRoomStructV2.ADAPTER.encodeWithTag(protoWriter, 1, webcastRoomFeedCellStructV2.room);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, webcastRoomFeedCellStructV2.type);
            FansStructV2.ADAPTER.encodeWithTag(protoWriter, 3, webcastRoomFeedCellStructV2.fans_struct);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, webcastRoomFeedCellStructV2.tag);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, webcastRoomFeedCellStructV2.tag_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, webcastRoomFeedCellStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, webcastRoomFeedCellStructV2.distance);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, webcastRoomFeedCellStructV2.rawdata);
            protoWriter.writeBytes(webcastRoomFeedCellStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102293);
    }

    public static final class Builder extends Message.Builder<WebcastRoomFeedCellStructV2, Builder> {
        public String distance;
        public FansStructV2 fans_struct;
        public UrlStructV2 icon;
        public String rawdata;
        public WebcastRoomStructV2 room;
        public String tag;
        public Long tag_id;
        public Integer type;

        static {
            Covode.recordClassIndex(102294);
        }

        @Override // com.squareup.wire.Message.Builder
        public final WebcastRoomFeedCellStructV2 build() {
            return new WebcastRoomFeedCellStructV2(this.room, this.type, this.fans_struct, this.tag, this.tag_id, this.icon, this.distance, this.rawdata, super.buildUnknownFields());
        }

        public final Builder distance(String str) {
            this.distance = str;
            return this;
        }

        public final Builder fans_struct(FansStructV2 fansStructV2) {
            this.fans_struct = fansStructV2;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder rawdata(String str) {
            this.rawdata = str;
            return this;
        }

        public final Builder room(WebcastRoomStructV2 webcastRoomStructV2) {
            this.room = webcastRoomStructV2;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder tag_id(Long l2) {
            this.tag_id = l2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<WebcastRoomFeedCellStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.room = this.room;
        builder.type = this.type;
        builder.fans_struct = this.fans_struct;
        builder.tag = this.tag;
        builder.tag_id = this.tag_id;
        builder.icon = this.icon;
        builder.distance = this.distance;
        builder.rawdata = this.rawdata;
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
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        WebcastRoomStructV2 webcastRoomStructV2 = this.room;
        int i10 = 0;
        if (webcastRoomStructV2 != null) {
            i2 = webcastRoomStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 37;
        Integer num = this.type;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        FansStructV2 fansStructV2 = this.fans_struct;
        if (fansStructV2 != null) {
            i4 = fansStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        String str = this.tag;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        Long l2 = this.tag_id;
        if (l2 != null) {
            i6 = l2.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        UrlStructV2 urlStructV2 = this.icon;
        if (urlStructV2 != null) {
            i7 = urlStructV2.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        String str2 = this.distance;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        String str3 = this.rawdata;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.room != null) {
            sb.append(", room=").append(this.room);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.fans_struct != null) {
            sb.append(", fans_struct=").append(this.fans_struct);
        }
        if (this.tag != null) {
            sb.append(", tag=").append(this.tag);
        }
        if (this.tag_id != null) {
            sb.append(", tag_id=").append(this.tag_id);
        }
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.distance != null) {
            sb.append(", distance=").append(this.distance);
        }
        if (this.rawdata != null) {
            sb.append(", rawdata=").append(this.rawdata);
        }
        return sb.replace(0, 2, "WebcastRoomFeedCellStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebcastRoomFeedCellStructV2)) {
            return false;
        }
        WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2 = (WebcastRoomFeedCellStructV2) obj;
        if (!unknownFields().equals(webcastRoomFeedCellStructV2.unknownFields()) || !Internal.equals(this.room, webcastRoomFeedCellStructV2.room) || !Internal.equals(this.type, webcastRoomFeedCellStructV2.type) || !Internal.equals(this.fans_struct, webcastRoomFeedCellStructV2.fans_struct) || !Internal.equals(this.tag, webcastRoomFeedCellStructV2.tag) || !Internal.equals(this.tag_id, webcastRoomFeedCellStructV2.tag_id) || !Internal.equals(this.icon, webcastRoomFeedCellStructV2.icon) || !Internal.equals(this.distance, webcastRoomFeedCellStructV2.distance) || !Internal.equals(this.rawdata, webcastRoomFeedCellStructV2.rawdata)) {
            return false;
        }
        return true;
    }

    public WebcastRoomFeedCellStructV2(WebcastRoomStructV2 webcastRoomStructV2, Integer num, FansStructV2 fansStructV2, String str, Long l2, UrlStructV2 urlStructV2, String str2, String str3) {
        this(webcastRoomStructV2, num, fansStructV2, str, l2, urlStructV2, str2, str3, i.EMPTY);
    }

    public WebcastRoomFeedCellStructV2(WebcastRoomStructV2 webcastRoomStructV2, Integer num, FansStructV2 fansStructV2, String str, Long l2, UrlStructV2 urlStructV2, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.room = webcastRoomStructV2;
        this.type = num;
        this.fans_struct = fansStructV2;
        this.tag = str;
        this.tag_id = l2;
        this.icon = urlStructV2;
        this.distance = str2;
        this.rawdata = str3;
    }
}
