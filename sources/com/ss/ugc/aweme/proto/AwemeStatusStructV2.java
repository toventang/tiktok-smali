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

public final class AwemeStatusStructV2 extends Message<AwemeStatusStructV2, Builder> {
    public static final ProtoAdapter<AwemeStatusStructV2> ADAPTER = new ProtoAdapter_AwemeStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean allow_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean allow_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SELECT_SCENE)
    public Integer dont_share_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer download_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Boolean in_reviewing;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean is_delete;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Boolean is_private;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Boolean is_prohibited;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer private_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Integer reviewed;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Boolean self_see;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer video_hide_search;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoMuteStructV2#ADAPTER", tag = 16)
    public VideoMuteStructV2 video_mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean with_goods;

    public AwemeStatusStructV2() {
    }

    static final class ProtoAdapter_AwemeStatusStructV2 extends ProtoAdapter<AwemeStatusStructV2> {
        static {
            Covode.recordClassIndex(101914);
        }

        public ProtoAdapter_AwemeStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatusStructV2.class);
        }

        public final int encodedSize(AwemeStatusStructV2 awemeStatusStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatusStructV2.aweme_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeStatusStructV2.is_delete) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeStatusStructV2.allow_share) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeStatusStructV2.allow_comment) + ProtoAdapter.BOOL.encodedSizeWithTag(5, awemeStatusStructV2.is_private) + ProtoAdapter.BOOL.encodedSizeWithTag(6, awemeStatusStructV2.with_goods) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeStatusStructV2.private_status) + ProtoAdapter.BOOL.encodedSizeWithTag(9, awemeStatusStructV2.in_reviewing) + ProtoAdapter.INT32.encodedSizeWithTag(10, awemeStatusStructV2.reviewed) + ProtoAdapter.BOOL.encodedSizeWithTag(11, awemeStatusStructV2.self_see) + ProtoAdapter.BOOL.encodedSizeWithTag(12, awemeStatusStructV2.is_prohibited) + ProtoAdapter.INT32.encodedSizeWithTag(13, awemeStatusStructV2.download_status) + ProtoAdapter.INT32.encodedSizeWithTag(14, awemeStatusStructV2.dont_share_status) + ProtoAdapter.INT32.encodedSizeWithTag(15, awemeStatusStructV2.video_hide_search) + VideoMuteStructV2.ADAPTER.encodedSizeWithTag(16, awemeStatusStructV2.video_mute) + awemeStatusStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStatusStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.is_delete(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.allow_share(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.allow_comment(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.is_private(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.with_goods(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.private_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.in_reviewing(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.reviewed(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.self_see(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.is_prohibited(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.download_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.dont_share_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.video_hide_search(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.video_mute(VideoMuteStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeStatusStructV2 awemeStatusStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatusStructV2.aweme_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeStatusStructV2.is_delete);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeStatusStructV2.allow_share);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeStatusStructV2.allow_comment);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, awemeStatusStructV2.is_private);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, awemeStatusStructV2.with_goods);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeStatusStructV2.private_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, awemeStatusStructV2.in_reviewing);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, awemeStatusStructV2.reviewed);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, awemeStatusStructV2.self_see);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, awemeStatusStructV2.is_prohibited);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, awemeStatusStructV2.download_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, awemeStatusStructV2.dont_share_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, awemeStatusStructV2.video_hide_search);
            VideoMuteStructV2.ADAPTER.encodeWithTag(protoWriter, 16, awemeStatusStructV2.video_mute);
            protoWriter.writeBytes(awemeStatusStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101912);
    }

    public static final class Builder extends Message.Builder<AwemeStatusStructV2, Builder> {
        public Boolean allow_comment;
        public Boolean allow_share;
        public String aweme_id;
        public Integer dont_share_status;
        public Integer download_status;
        public Boolean in_reviewing;
        public Boolean is_delete;
        public Boolean is_private;
        public Boolean is_prohibited;
        public Integer private_status;
        public Integer reviewed;
        public Boolean self_see;
        public Integer video_hide_search;
        public VideoMuteStructV2 video_mute;
        public Boolean with_goods;

        static {
            Covode.recordClassIndex(101913);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStatusStructV2 build() {
            return new AwemeStatusStructV2(this.aweme_id, this.is_delete, this.allow_share, this.allow_comment, this.is_private, this.with_goods, this.private_status, this.in_reviewing, this.reviewed, this.self_see, this.is_prohibited, this.download_status, this.dont_share_status, this.video_hide_search, this.video_mute, super.buildUnknownFields());
        }

        public final Builder allow_comment(Boolean bool) {
            this.allow_comment = bool;
            return this;
        }

        public final Builder allow_share(Boolean bool) {
            this.allow_share = bool;
            return this;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder dont_share_status(Integer num) {
            this.dont_share_status = num;
            return this;
        }

        public final Builder download_status(Integer num) {
            this.download_status = num;
            return this;
        }

        public final Builder in_reviewing(Boolean bool) {
            this.in_reviewing = bool;
            return this;
        }

        public final Builder is_delete(Boolean bool) {
            this.is_delete = bool;
            return this;
        }

        public final Builder is_private(Boolean bool) {
            this.is_private = bool;
            return this;
        }

        public final Builder is_prohibited(Boolean bool) {
            this.is_prohibited = bool;
            return this;
        }

        public final Builder private_status(Integer num) {
            this.private_status = num;
            return this;
        }

        public final Builder reviewed(Integer num) {
            this.reviewed = num;
            return this;
        }

        public final Builder self_see(Boolean bool) {
            this.self_see = bool;
            return this;
        }

        public final Builder video_hide_search(Integer num) {
            this.video_hide_search = num;
            return this;
        }

        public final Builder video_mute(VideoMuteStructV2 videoMuteStructV2) {
            this.video_mute = videoMuteStructV2;
            return this;
        }

        public final Builder with_goods(Boolean bool) {
            this.with_goods = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeStatusStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStatusStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.is_delete = this.is_delete;
        builder.allow_share = this.allow_share;
        builder.allow_comment = this.allow_comment;
        builder.is_private = this.is_private;
        builder.with_goods = this.with_goods;
        builder.private_status = this.private_status;
        builder.in_reviewing = this.in_reviewing;
        builder.reviewed = this.reviewed;
        builder.self_see = this.self_see;
        builder.is_prohibited = this.is_prohibited;
        builder.download_status = this.download_status;
        builder.dont_share_status = this.dont_share_status;
        builder.video_hide_search = this.video_hide_search;
        builder.video_mute = this.video_mute;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.hashCode;
        if (i16 != 0) {
            return i16;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.aweme_id;
        int i17 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i18 = (hashCode + i2) * 37;
        Boolean bool = this.is_delete;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i19 = (i18 + i3) * 37;
        Boolean bool2 = this.allow_share;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        } else {
            i4 = 0;
        }
        int i20 = (i19 + i4) * 37;
        Boolean bool3 = this.allow_comment;
        if (bool3 != null) {
            i5 = bool3.hashCode();
        } else {
            i5 = 0;
        }
        int i21 = (i20 + i5) * 37;
        Boolean bool4 = this.is_private;
        if (bool4 != null) {
            i6 = bool4.hashCode();
        } else {
            i6 = 0;
        }
        int i22 = (i21 + i6) * 37;
        Boolean bool5 = this.with_goods;
        if (bool5 != null) {
            i7 = bool5.hashCode();
        } else {
            i7 = 0;
        }
        int i23 = (i22 + i7) * 37;
        Integer num = this.private_status;
        if (num != null) {
            i8 = num.hashCode();
        } else {
            i8 = 0;
        }
        int i24 = (i23 + i8) * 37;
        Boolean bool6 = this.in_reviewing;
        if (bool6 != null) {
            i9 = bool6.hashCode();
        } else {
            i9 = 0;
        }
        int i25 = (i24 + i9) * 37;
        Integer num2 = this.reviewed;
        if (num2 != null) {
            i10 = num2.hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 37;
        Boolean bool7 = this.self_see;
        if (bool7 != null) {
            i11 = bool7.hashCode();
        } else {
            i11 = 0;
        }
        int i27 = (i26 + i11) * 37;
        Boolean bool8 = this.is_prohibited;
        if (bool8 != null) {
            i12 = bool8.hashCode();
        } else {
            i12 = 0;
        }
        int i28 = (i27 + i12) * 37;
        Integer num3 = this.download_status;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (i28 + i13) * 37;
        Integer num4 = this.dont_share_status;
        if (num4 != null) {
            i14 = num4.hashCode();
        } else {
            i14 = 0;
        }
        int i30 = (i29 + i14) * 37;
        Integer num5 = this.video_hide_search;
        if (num5 != null) {
            i15 = num5.hashCode();
        } else {
            i15 = 0;
        }
        int i31 = (i30 + i15) * 37;
        VideoMuteStructV2 videoMuteStructV2 = this.video_mute;
        if (videoMuteStructV2 != null) {
            i17 = videoMuteStructV2.hashCode();
        }
        int i32 = i31 + i17;
        this.hashCode = i32;
        return i32;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.is_delete != null) {
            sb.append(", is_delete=").append(this.is_delete);
        }
        if (this.allow_share != null) {
            sb.append(", allow_share=").append(this.allow_share);
        }
        if (this.allow_comment != null) {
            sb.append(", allow_comment=").append(this.allow_comment);
        }
        if (this.is_private != null) {
            sb.append(", is_private=").append(this.is_private);
        }
        if (this.with_goods != null) {
            sb.append(", with_goods=").append(this.with_goods);
        }
        if (this.private_status != null) {
            sb.append(", private_status=").append(this.private_status);
        }
        if (this.in_reviewing != null) {
            sb.append(", in_reviewing=").append(this.in_reviewing);
        }
        if (this.reviewed != null) {
            sb.append(", reviewed=").append(this.reviewed);
        }
        if (this.self_see != null) {
            sb.append(", self_see=").append(this.self_see);
        }
        if (this.is_prohibited != null) {
            sb.append(", is_prohibited=").append(this.is_prohibited);
        }
        if (this.download_status != null) {
            sb.append(", download_status=").append(this.download_status);
        }
        if (this.dont_share_status != null) {
            sb.append(", dont_share_status=").append(this.dont_share_status);
        }
        if (this.video_hide_search != null) {
            sb.append(", video_hide_search=").append(this.video_hide_search);
        }
        if (this.video_mute != null) {
            sb.append(", video_mute=").append(this.video_mute);
        }
        return sb.replace(0, 2, "AwemeStatusStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatusStructV2)) {
            return false;
        }
        AwemeStatusStructV2 awemeStatusStructV2 = (AwemeStatusStructV2) obj;
        if (!unknownFields().equals(awemeStatusStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatusStructV2.aweme_id) || !Internal.equals(this.is_delete, awemeStatusStructV2.is_delete) || !Internal.equals(this.allow_share, awemeStatusStructV2.allow_share) || !Internal.equals(this.allow_comment, awemeStatusStructV2.allow_comment) || !Internal.equals(this.is_private, awemeStatusStructV2.is_private) || !Internal.equals(this.with_goods, awemeStatusStructV2.with_goods) || !Internal.equals(this.private_status, awemeStatusStructV2.private_status) || !Internal.equals(this.in_reviewing, awemeStatusStructV2.in_reviewing) || !Internal.equals(this.reviewed, awemeStatusStructV2.reviewed) || !Internal.equals(this.self_see, awemeStatusStructV2.self_see) || !Internal.equals(this.is_prohibited, awemeStatusStructV2.is_prohibited) || !Internal.equals(this.download_status, awemeStatusStructV2.download_status) || !Internal.equals(this.dont_share_status, awemeStatusStructV2.dont_share_status) || !Internal.equals(this.video_hide_search, awemeStatusStructV2.video_hide_search) || !Internal.equals(this.video_mute, awemeStatusStructV2.video_mute)) {
            return false;
        }
        return true;
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Integer num2, Boolean bool7, Boolean bool8, Integer num3, Integer num4, Integer num5, VideoMuteStructV2 videoMuteStructV2) {
        this(str, bool, bool2, bool3, bool4, bool5, num, bool6, num2, bool7, bool8, num3, num4, num5, videoMuteStructV2, i.EMPTY);
    }

    public AwemeStatusStructV2(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Boolean bool6, Integer num2, Boolean bool7, Boolean bool8, Integer num3, Integer num4, Integer num5, VideoMuteStructV2 videoMuteStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.is_delete = bool;
        this.allow_share = bool2;
        this.allow_comment = bool3;
        this.is_private = bool4;
        this.with_goods = bool5;
        this.private_status = num;
        this.in_reviewing = bool6;
        this.reviewed = num2;
        this.self_see = bool7;
        this.is_prohibited = bool8;
        this.download_status = num3;
        this.dont_share_status = num4;
        this.video_hide_search = num5;
        this.video_mute = videoMuteStructV2;
    }
}
