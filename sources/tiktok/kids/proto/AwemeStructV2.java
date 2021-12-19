package tiktok.kids.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class AwemeStructV2 extends Message<AwemeStructV2, Builder> {
    public static final ProtoAdapter<AwemeStructV2> ADAPTER = new ProtoAdapter_AwemeStructV2();
    @WireField(adapter = "tiktok.kids.proto.UserStructV2#ADAPTER", tag = 3)
    public UserStructV2 author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer aweme_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String desc_language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public Integer distribute_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public String group_id;
    @WireField(adapter = "tiktok.kids.proto.ImageInfoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public List<ImageInfoStructV2> image_infos;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Boolean is_vr;
    @WireField(adapter = "tiktok.kids.proto.LongVideoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_SELECT_SCENE)
    public List<LongVideoStructV2> long_video;
    @WireField(adapter = "tiktok.kids.proto.MusicStructV2#ADAPTER", tag = 4)
    public MusicStructV2 music;
    @WireField(adapter = "tiktok.kids.proto.AwemeStatisticsStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public AwemeStatisticsStructV2 statistics;
    @WireField(adapter = "tiktok.kids.proto.AwemeStatusStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public AwemeStatusStructV2 status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String take_down_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 16)
    public Integer take_down_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer user_digged;
    @WireField(adapter = "tiktok.kids.proto.VideoStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public VideoStructV2 video;

    public AwemeStructV2() {
    }

    static final class ProtoAdapter_AwemeStructV2 extends ProtoAdapter<AwemeStructV2> {
        static {
            Covode.recordClassIndex(106734);
        }

        public ProtoAdapter_AwemeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStructV2.class);
        }

        public final int encodedSize(AwemeStructV2 awemeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, awemeStructV2.create_time) + UserStructV2.ADAPTER.encodedSizeWithTag(3, awemeStructV2.author) + MusicStructV2.ADAPTER.encodedSizeWithTag(4, awemeStructV2.music) + VideoStructV2.ADAPTER.encodedSizeWithTag(5, awemeStructV2.video) + ProtoAdapter.INT32.encodedSizeWithTag(6, awemeStructV2.user_digged) + AwemeStatisticsStructV2.ADAPTER.encodedSizeWithTag(7, awemeStructV2.statistics) + AwemeStatusStructV2.ADAPTER.encodedSizeWithTag(8, awemeStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(9, awemeStructV2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(10, awemeStructV2.is_vr) + ProtoAdapter.INT32.encodedSizeWithTag(11, awemeStructV2.aweme_type) + ImageInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(12, awemeStructV2.image_infos) + ProtoAdapter.STRING.encodedSizeWithTag(13, awemeStructV2.group_id) + LongVideoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(14, awemeStructV2.long_video) + ProtoAdapter.STRING.encodedSizeWithTag(15, awemeStructV2.desc_language) + ProtoAdapter.INT32.encodedSizeWithTag(16, awemeStructV2.take_down_reason) + ProtoAdapter.STRING.encodedSizeWithTag(17, awemeStructV2.take_down_desc) + ProtoAdapter.INT32.encodedSizeWithTag(18, awemeStructV2.distribute_type) + awemeStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStructV2 decode(ProtoReader protoReader) {
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
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.author(UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.music(MusicStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.video(VideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.user_digged(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.statistics(AwemeStatisticsStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.status(AwemeStatusStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.is_vr(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.aweme_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.image_infos.add(ImageInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.group_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.long_video.add(LongVideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.desc_language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.take_down_reason(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.take_down_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.distribute_type(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeStructV2 awemeStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, awemeStructV2.create_time);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 3, awemeStructV2.author);
            MusicStructV2.ADAPTER.encodeWithTag(protoWriter, 4, awemeStructV2.music);
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 5, awemeStructV2.video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, awemeStructV2.user_digged);
            AwemeStatisticsStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeStructV2.statistics);
            AwemeStatusStructV2.ADAPTER.encodeWithTag(protoWriter, 8, awemeStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, awemeStructV2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, awemeStructV2.is_vr);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, awemeStructV2.aweme_type);
            ImageInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, awemeStructV2.image_infos);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, awemeStructV2.group_id);
            LongVideoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, awemeStructV2.long_video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, awemeStructV2.desc_language);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, awemeStructV2.take_down_reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, awemeStructV2.take_down_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, awemeStructV2.distribute_type);
            protoWriter.writeBytes(awemeStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106732);
    }

    public static final class Builder extends Message.Builder<AwemeStructV2, Builder> {
        public UserStructV2 author;
        public String aweme_id;
        public Integer aweme_type;
        public Long create_time;
        public String desc_language;
        public Integer distribute_type;
        public String extra;
        public String group_id;
        public List<ImageInfoStructV2> image_infos = Internal.newMutableList();
        public Boolean is_vr;
        public List<LongVideoStructV2> long_video = Internal.newMutableList();
        public MusicStructV2 music;
        public AwemeStatisticsStructV2 statistics;
        public AwemeStatusStructV2 status;
        public String take_down_desc;
        public Integer take_down_reason;
        public Integer user_digged;
        public VideoStructV2 video;

        static {
            Covode.recordClassIndex(106733);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStructV2 build() {
            return new AwemeStructV2(this.aweme_id, this.create_time, this.author, this.music, this.video, this.user_digged, this.statistics, this.status, this.extra, this.is_vr, this.aweme_type, this.image_infos, this.group_id, this.long_video, this.desc_language, this.take_down_reason, this.take_down_desc, this.distribute_type, super.buildUnknownFields());
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder aweme_type(Integer num) {
            this.aweme_type = num;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder desc_language(String str) {
            this.desc_language = str;
            return this;
        }

        public final Builder distribute_type(Integer num) {
            this.distribute_type = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder group_id(String str) {
            this.group_id = str;
            return this;
        }

        public final Builder is_vr(Boolean bool) {
            this.is_vr = bool;
            return this;
        }

        public final Builder music(MusicStructV2 musicStructV2) {
            this.music = musicStructV2;
            return this;
        }

        public final Builder statistics(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            this.statistics = awemeStatisticsStructV2;
            return this;
        }

        public final Builder status(AwemeStatusStructV2 awemeStatusStructV2) {
            this.status = awemeStatusStructV2;
            return this;
        }

        public final Builder take_down_desc(String str) {
            this.take_down_desc = str;
            return this;
        }

        public final Builder take_down_reason(Integer num) {
            this.take_down_reason = num;
            return this;
        }

        public final Builder user_digged(Integer num) {
            this.user_digged = num;
            return this;
        }

        public final Builder video(VideoStructV2 videoStructV2) {
            this.video = videoStructV2;
            return this;
        }

        public final Builder image_infos(List<ImageInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.image_infos = list;
            return this;
        }

        public final Builder long_video(List<LongVideoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.long_video = list;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.AwemeStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.create_time = this.create_time;
        builder.author = this.author;
        builder.music = this.music;
        builder.video = this.video;
        builder.user_digged = this.user_digged;
        builder.statistics = this.statistics;
        builder.status = this.status;
        builder.extra = this.extra;
        builder.is_vr = this.is_vr;
        builder.aweme_type = this.aweme_type;
        builder.image_infos = Internal.copyOf("image_infos", this.image_infos);
        builder.group_id = this.group_id;
        builder.long_video = Internal.copyOf("long_video", this.long_video);
        builder.desc_language = this.desc_language;
        builder.take_down_reason = this.take_down_reason;
        builder.take_down_desc = this.take_down_desc;
        builder.distribute_type = this.distribute_type;
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
        int i16;
        int i17 = this.hashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.aweme_id;
        int i18 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (hashCode + i2) * 37;
        Long l2 = this.create_time;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 37;
        UserStructV2 userStructV2 = this.author;
        if (userStructV2 != null) {
            i4 = userStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 37;
        MusicStructV2 musicStructV2 = this.music;
        if (musicStructV2 != null) {
            i5 = musicStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        VideoStructV2 videoStructV2 = this.video;
        if (videoStructV2 != null) {
            i6 = videoStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        Integer num = this.user_digged;
        if (num != null) {
            i7 = num.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        AwemeStatisticsStructV2 awemeStatisticsStructV2 = this.statistics;
        if (awemeStatisticsStructV2 != null) {
            i8 = awemeStatisticsStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        AwemeStatusStructV2 awemeStatusStructV2 = this.status;
        if (awemeStatusStructV2 != null) {
            i9 = awemeStatusStructV2.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        String str2 = this.extra;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        Boolean bool = this.is_vr;
        if (bool != null) {
            i11 = bool.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        Integer num2 = this.aweme_type;
        if (num2 != null) {
            i12 = num2.hashCode();
        } else {
            i12 = 0;
        }
        int hashCode2 = (((i28 + i12) * 37) + this.image_infos.hashCode()) * 37;
        String str3 = this.group_id;
        if (str3 != null) {
            i13 = str3.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode3 = (((hashCode2 + i13) * 37) + this.long_video.hashCode()) * 37;
        String str4 = this.desc_language;
        if (str4 != null) {
            i14 = str4.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (hashCode3 + i14) * 37;
        Integer num3 = this.take_down_reason;
        if (num3 != null) {
            i15 = num3.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 37;
        String str5 = this.take_down_desc;
        if (str5 != null) {
            i16 = str5.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 37;
        Integer num4 = this.distribute_type;
        if (num4 != null) {
            i18 = num4.hashCode();
        }
        int i32 = i31 + i18;
        this.hashCode = i32;
        return i32;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=").append(this.create_time);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.music != null) {
            sb.append(", music=").append(this.music);
        }
        if (this.video != null) {
            sb.append(", video=").append(this.video);
        }
        if (this.user_digged != null) {
            sb.append(", user_digged=").append(this.user_digged);
        }
        if (this.statistics != null) {
            sb.append(", statistics=").append(this.statistics);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.is_vr != null) {
            sb.append(", is_vr=").append(this.is_vr);
        }
        if (this.aweme_type != null) {
            sb.append(", aweme_type=").append(this.aweme_type);
        }
        if (!this.image_infos.isEmpty()) {
            sb.append(", image_infos=").append(this.image_infos);
        }
        if (this.group_id != null) {
            sb.append(", group_id=").append(this.group_id);
        }
        if (!this.long_video.isEmpty()) {
            sb.append(", long_video=").append(this.long_video);
        }
        if (this.desc_language != null) {
            sb.append(", desc_language=").append(this.desc_language);
        }
        if (this.take_down_reason != null) {
            sb.append(", take_down_reason=").append(this.take_down_reason);
        }
        if (this.take_down_desc != null) {
            sb.append(", take_down_desc=").append(this.take_down_desc);
        }
        if (this.distribute_type != null) {
            sb.append(", distribute_type=").append(this.distribute_type);
        }
        return sb.replace(0, 2, "AwemeStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStructV2)) {
            return false;
        }
        AwemeStructV2 awemeStructV2 = (AwemeStructV2) obj;
        if (!unknownFields().equals(awemeStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStructV2.aweme_id) || !Internal.equals(this.create_time, awemeStructV2.create_time) || !Internal.equals(this.author, awemeStructV2.author) || !Internal.equals(this.music, awemeStructV2.music) || !Internal.equals(this.video, awemeStructV2.video) || !Internal.equals(this.user_digged, awemeStructV2.user_digged) || !Internal.equals(this.statistics, awemeStructV2.statistics) || !Internal.equals(this.status, awemeStructV2.status) || !Internal.equals(this.extra, awemeStructV2.extra) || !Internal.equals(this.is_vr, awemeStructV2.is_vr) || !Internal.equals(this.aweme_type, awemeStructV2.aweme_type) || !this.image_infos.equals(awemeStructV2.image_infos) || !Internal.equals(this.group_id, awemeStructV2.group_id) || !this.long_video.equals(awemeStructV2.long_video) || !Internal.equals(this.desc_language, awemeStructV2.desc_language) || !Internal.equals(this.take_down_reason, awemeStructV2.take_down_reason) || !Internal.equals(this.take_down_desc, awemeStructV2.take_down_desc) || !Internal.equals(this.distribute_type, awemeStructV2.distribute_type)) {
            return false;
        }
        return true;
    }

    public AwemeStructV2(String str, Long l2, UserStructV2 userStructV2, MusicStructV2 musicStructV2, VideoStructV2 videoStructV2, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str2, Boolean bool, Integer num2, List<ImageInfoStructV2> list, String str3, List<LongVideoStructV2> list2, String str4, Integer num3, String str5, Integer num4) {
        this(str, l2, userStructV2, musicStructV2, videoStructV2, num, awemeStatisticsStructV2, awemeStatusStructV2, str2, bool, num2, list, str3, list2, str4, num3, str5, num4, i.EMPTY);
    }

    public AwemeStructV2(String str, Long l2, UserStructV2 userStructV2, MusicStructV2 musicStructV2, VideoStructV2 videoStructV2, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str2, Boolean bool, Integer num2, List<ImageInfoStructV2> list, String str3, List<LongVideoStructV2> list2, String str4, Integer num3, String str5, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.create_time = l2;
        this.author = userStructV2;
        this.music = musicStructV2;
        this.video = videoStructV2;
        this.user_digged = num;
        this.statistics = awemeStatisticsStructV2;
        this.status = awemeStatusStructV2;
        this.extra = str2;
        this.is_vr = bool;
        this.aweme_type = num2;
        this.image_infos = Internal.immutableCopyOf("image_infos", list);
        this.group_id = str3;
        this.long_video = Internal.immutableCopyOf("long_video", list2);
        this.desc_language = str4;
        this.take_down_reason = num3;
        this.take_down_desc = str5;
        this.distribute_type = num4;
    }
}
