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
import com.ss.android.ugc.playerkit.model.v;
import java.util.List;
import k.i;

public final class MusicStructV2 extends Message<MusicStructV2, Builder> {
    public static final ProtoAdapter<MusicStructV2> ADAPTER = new ProtoAdapter_MusicStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String album;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 audio_track;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean author_deleted;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public UrlStructV2 cover_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Integer end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String id_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Boolean is_author_artist;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean is_del_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = v.U)
    public Boolean is_original;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 24)
    public Boolean is_video_self_see;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public String mid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String offline_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SELECT_SCENE)
    public String owner_handle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public String owner_nickname;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public UrlStructV2 play_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer status;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 strong_beat_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public List<String> unshelve_countries;

    public MusicStructV2() {
    }

    static final class ProtoAdapter_MusicStructV2 extends ProtoAdapter<MusicStructV2> {
        static {
            Covode.recordClassIndex(106755);
        }

        public ProtoAdapter_MusicStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.id_str(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.author(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.album(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.strong_beat_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.is_author_artist(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.cover_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.play_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.start_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.end_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.duration(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.owner_handle(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.offline_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.owner_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.owner_nickname(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 19:
                            builder.audio_track(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.is_original(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 21:
                            builder.mid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            builder.author_deleted(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 23:
                            builder.is_del_video(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 24:
                            builder.is_video_self_see(ProtoAdapter.BOOL.decode(protoReader));
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

        public final int encodedSize(MusicStructV2 musicStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, musicStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicStructV2.id_str) + ProtoAdapter.STRING.encodedSizeWithTag(3, musicStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, musicStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(5, musicStructV2.album) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, musicStructV2.strong_beat_url) + ProtoAdapter.BOOL.encodedSizeWithTag(7, musicStructV2.is_author_artist) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, musicStructV2.unshelve_countries) + UrlStructV2.ADAPTER.encodedSizeWithTag(9, musicStructV2.cover_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, musicStructV2.play_url) + ProtoAdapter.INT32.encodedSizeWithTag(11, musicStructV2.start_time) + ProtoAdapter.INT32.encodedSizeWithTag(12, musicStructV2.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(13, musicStructV2.duration) + ProtoAdapter.STRING.encodedSizeWithTag(14, musicStructV2.owner_handle) + ProtoAdapter.INT32.encodedSizeWithTag(15, musicStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(16, musicStructV2.offline_desc) + ProtoAdapter.STRING.encodedSizeWithTag(17, musicStructV2.owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(18, musicStructV2.owner_nickname) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, musicStructV2.audio_track) + ProtoAdapter.BOOL.encodedSizeWithTag(20, musicStructV2.is_original) + ProtoAdapter.STRING.encodedSizeWithTag(21, musicStructV2.mid) + ProtoAdapter.BOOL.encodedSizeWithTag(22, musicStructV2.author_deleted) + ProtoAdapter.BOOL.encodedSizeWithTag(23, musicStructV2.is_del_video) + ProtoAdapter.BOOL.encodedSizeWithTag(24, musicStructV2.is_video_self_see) + musicStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MusicStructV2 musicStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, musicStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicStructV2.id_str);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, musicStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, musicStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, musicStructV2.album);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, musicStructV2.strong_beat_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, musicStructV2.is_author_artist);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, musicStructV2.unshelve_countries);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, musicStructV2.cover_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, musicStructV2.play_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, musicStructV2.start_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, musicStructV2.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, musicStructV2.duration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, musicStructV2.owner_handle);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, musicStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, musicStructV2.offline_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, musicStructV2.owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, musicStructV2.owner_nickname);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, musicStructV2.audio_track);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, musicStructV2.is_original);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, musicStructV2.mid);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, musicStructV2.author_deleted);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, musicStructV2.is_del_video);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, musicStructV2.is_video_self_see);
            protoWriter.writeBytes(musicStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106753);
    }

    public static final class Builder extends Message.Builder<MusicStructV2, Builder> {
        public String album;
        public UrlStructV2 audio_track;
        public String author;
        public Boolean author_deleted;
        public UrlStructV2 cover_thumb;
        public Integer duration;
        public Integer end_time;
        public Long id;
        public String id_str;
        public Boolean is_author_artist;
        public Boolean is_del_video;
        public Boolean is_original;
        public Boolean is_video_self_see;
        public String mid;
        public String offline_desc;
        public String owner_handle;
        public String owner_id;
        public String owner_nickname;
        public UrlStructV2 play_url;
        public Integer start_time;
        public Integer status;
        public UrlStructV2 strong_beat_url;
        public String title;
        public List<String> unshelve_countries = Internal.newMutableList();

        static {
            Covode.recordClassIndex(106754);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicStructV2 build() {
            return new MusicStructV2(this.id, this.id_str, this.title, this.author, this.album, this.strong_beat_url, this.is_author_artist, this.unshelve_countries, this.cover_thumb, this.play_url, this.start_time, this.end_time, this.duration, this.owner_handle, this.status, this.offline_desc, this.owner_id, this.owner_nickname, this.audio_track, this.is_original, this.mid, this.author_deleted, this.is_del_video, this.is_video_self_see, super.buildUnknownFields());
        }

        public final Builder album(String str) {
            this.album = str;
            return this;
        }

        public final Builder audio_track(UrlStructV2 urlStructV2) {
            this.audio_track = urlStructV2;
            return this;
        }

        public final Builder author(String str) {
            this.author = str;
            return this;
        }

        public final Builder author_deleted(Boolean bool) {
            this.author_deleted = bool;
            return this;
        }

        public final Builder cover_thumb(UrlStructV2 urlStructV2) {
            this.cover_thumb = urlStructV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder end_time(Integer num) {
            this.end_time = num;
            return this;
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder id_str(String str) {
            this.id_str = str;
            return this;
        }

        public final Builder is_author_artist(Boolean bool) {
            this.is_author_artist = bool;
            return this;
        }

        public final Builder is_del_video(Boolean bool) {
            this.is_del_video = bool;
            return this;
        }

        public final Builder is_original(Boolean bool) {
            this.is_original = bool;
            return this;
        }

        public final Builder is_video_self_see(Boolean bool) {
            this.is_video_self_see = bool;
            return this;
        }

        public final Builder mid(String str) {
            this.mid = str;
            return this;
        }

        public final Builder offline_desc(String str) {
            this.offline_desc = str;
            return this;
        }

        public final Builder owner_handle(String str) {
            this.owner_handle = str;
            return this;
        }

        public final Builder owner_id(String str) {
            this.owner_id = str;
            return this;
        }

        public final Builder owner_nickname(String str) {
            this.owner_nickname = str;
            return this;
        }

        public final Builder play_url(UrlStructV2 urlStructV2) {
            this.play_url = urlStructV2;
            return this;
        }

        public final Builder start_time(Integer num) {
            this.start_time = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder strong_beat_url(UrlStructV2 urlStructV2) {
            this.strong_beat_url = urlStructV2;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder unshelve_countries(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.unshelve_countries = list;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.MusicStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.id_str = this.id_str;
        builder.title = this.title;
        builder.author = this.author;
        builder.album = this.album;
        builder.strong_beat_url = this.strong_beat_url;
        builder.is_author_artist = this.is_author_artist;
        builder.unshelve_countries = Internal.copyOf("unshelve_countries", this.unshelve_countries);
        builder.cover_thumb = this.cover_thumb;
        builder.play_url = this.play_url;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.duration = this.duration;
        builder.owner_handle = this.owner_handle;
        builder.status = this.status;
        builder.offline_desc = this.offline_desc;
        builder.owner_id = this.owner_id;
        builder.owner_nickname = this.owner_nickname;
        builder.audio_track = this.audio_track;
        builder.is_original = this.is_original;
        builder.mid = this.mid;
        builder.author_deleted = this.author_deleted;
        builder.is_del_video = this.is_del_video;
        builder.is_video_self_see = this.is_video_self_see;
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = this.hashCode;
        if (i24 != 0) {
            return i24;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.id;
        int i25 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i26 = (hashCode + i2) * 37;
        String str = this.id_str;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i27 = (i26 + i3) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i28 = (i27 + i4) * 37;
        String str3 = this.author;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i29 = (i28 + i5) * 37;
        String str4 = this.album;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i30 = (i29 + i6) * 37;
        UrlStructV2 urlStructV2 = this.strong_beat_url;
        if (urlStructV2 != null) {
            i7 = urlStructV2.hashCode();
        } else {
            i7 = 0;
        }
        int i31 = (i30 + i7) * 37;
        Boolean bool = this.is_author_artist;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode2 = (((i31 + i8) * 37) + this.unshelve_countries.hashCode()) * 37;
        UrlStructV2 urlStructV22 = this.cover_thumb;
        if (urlStructV22 != null) {
            i9 = urlStructV22.hashCode();
        } else {
            i9 = 0;
        }
        int i32 = (hashCode2 + i9) * 37;
        UrlStructV2 urlStructV23 = this.play_url;
        if (urlStructV23 != null) {
            i10 = urlStructV23.hashCode();
        } else {
            i10 = 0;
        }
        int i33 = (i32 + i10) * 37;
        Integer num = this.start_time;
        if (num != null) {
            i11 = num.hashCode();
        } else {
            i11 = 0;
        }
        int i34 = (i33 + i11) * 37;
        Integer num2 = this.end_time;
        if (num2 != null) {
            i12 = num2.hashCode();
        } else {
            i12 = 0;
        }
        int i35 = (i34 + i12) * 37;
        Integer num3 = this.duration;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i36 = (i35 + i13) * 37;
        String str5 = this.owner_handle;
        if (str5 != null) {
            i14 = str5.hashCode();
        } else {
            i14 = 0;
        }
        int i37 = (i36 + i14) * 37;
        Integer num4 = this.status;
        if (num4 != null) {
            i15 = num4.hashCode();
        } else {
            i15 = 0;
        }
        int i38 = (i37 + i15) * 37;
        String str6 = this.offline_desc;
        if (str6 != null) {
            i16 = str6.hashCode();
        } else {
            i16 = 0;
        }
        int i39 = (i38 + i16) * 37;
        String str7 = this.owner_id;
        if (str7 != null) {
            i17 = str7.hashCode();
        } else {
            i17 = 0;
        }
        int i40 = (i39 + i17) * 37;
        String str8 = this.owner_nickname;
        if (str8 != null) {
            i18 = str8.hashCode();
        } else {
            i18 = 0;
        }
        int i41 = (i40 + i18) * 37;
        UrlStructV2 urlStructV24 = this.audio_track;
        if (urlStructV24 != null) {
            i19 = urlStructV24.hashCode();
        } else {
            i19 = 0;
        }
        int i42 = (i41 + i19) * 37;
        Boolean bool2 = this.is_original;
        if (bool2 != null) {
            i20 = bool2.hashCode();
        } else {
            i20 = 0;
        }
        int i43 = (i42 + i20) * 37;
        String str9 = this.mid;
        if (str9 != null) {
            i21 = str9.hashCode();
        } else {
            i21 = 0;
        }
        int i44 = (i43 + i21) * 37;
        Boolean bool3 = this.author_deleted;
        if (bool3 != null) {
            i22 = bool3.hashCode();
        } else {
            i22 = 0;
        }
        int i45 = (i44 + i22) * 37;
        Boolean bool4 = this.is_del_video;
        if (bool4 != null) {
            i23 = bool4.hashCode();
        } else {
            i23 = 0;
        }
        int i46 = (i45 + i23) * 37;
        Boolean bool5 = this.is_video_self_see;
        if (bool5 != null) {
            i25 = bool5.hashCode();
        }
        int i47 = i46 + i25;
        this.hashCode = i47;
        return i47;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.id_str != null) {
            sb.append(", id_str=").append(this.id_str);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.album != null) {
            sb.append(", album=").append(this.album);
        }
        if (this.strong_beat_url != null) {
            sb.append(", strong_beat_url=").append(this.strong_beat_url);
        }
        if (this.is_author_artist != null) {
            sb.append(", is_author_artist=").append(this.is_author_artist);
        }
        if (!this.unshelve_countries.isEmpty()) {
            sb.append(", unshelve_countries=").append(this.unshelve_countries);
        }
        if (this.cover_thumb != null) {
            sb.append(", cover_thumb=").append(this.cover_thumb);
        }
        if (this.play_url != null) {
            sb.append(", play_url=").append(this.play_url);
        }
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        if (this.owner_handle != null) {
            sb.append(", owner_handle=").append(this.owner_handle);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.offline_desc != null) {
            sb.append(", offline_desc=").append(this.offline_desc);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=").append(this.owner_id);
        }
        if (this.owner_nickname != null) {
            sb.append(", owner_nickname=").append(this.owner_nickname);
        }
        if (this.audio_track != null) {
            sb.append(", audio_track=").append(this.audio_track);
        }
        if (this.is_original != null) {
            sb.append(", is_original=").append(this.is_original);
        }
        if (this.mid != null) {
            sb.append(", mid=").append(this.mid);
        }
        if (this.author_deleted != null) {
            sb.append(", author_deleted=").append(this.author_deleted);
        }
        if (this.is_del_video != null) {
            sb.append(", is_del_video=").append(this.is_del_video);
        }
        if (this.is_video_self_see != null) {
            sb.append(", is_video_self_see=").append(this.is_video_self_see);
        }
        return sb.replace(0, 2, "MusicStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicStructV2)) {
            return false;
        }
        MusicStructV2 musicStructV2 = (MusicStructV2) obj;
        if (!unknownFields().equals(musicStructV2.unknownFields()) || !Internal.equals(this.id, musicStructV2.id) || !Internal.equals(this.id_str, musicStructV2.id_str) || !Internal.equals(this.title, musicStructV2.title) || !Internal.equals(this.author, musicStructV2.author) || !Internal.equals(this.album, musicStructV2.album) || !Internal.equals(this.strong_beat_url, musicStructV2.strong_beat_url) || !Internal.equals(this.is_author_artist, musicStructV2.is_author_artist) || !this.unshelve_countries.equals(musicStructV2.unshelve_countries) || !Internal.equals(this.cover_thumb, musicStructV2.cover_thumb) || !Internal.equals(this.play_url, musicStructV2.play_url) || !Internal.equals(this.start_time, musicStructV2.start_time) || !Internal.equals(this.end_time, musicStructV2.end_time) || !Internal.equals(this.duration, musicStructV2.duration) || !Internal.equals(this.owner_handle, musicStructV2.owner_handle) || !Internal.equals(this.status, musicStructV2.status) || !Internal.equals(this.offline_desc, musicStructV2.offline_desc) || !Internal.equals(this.owner_id, musicStructV2.owner_id) || !Internal.equals(this.owner_nickname, musicStructV2.owner_nickname) || !Internal.equals(this.audio_track, musicStructV2.audio_track) || !Internal.equals(this.is_original, musicStructV2.is_original) || !Internal.equals(this.mid, musicStructV2.mid) || !Internal.equals(this.author_deleted, musicStructV2.author_deleted) || !Internal.equals(this.is_del_video, musicStructV2.is_del_video) || !Internal.equals(this.is_video_self_see, musicStructV2.is_video_self_see)) {
            return false;
        }
        return true;
    }

    public MusicStructV2(Long l2, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, Boolean bool, List<String> list, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, Integer num, Integer num2, Integer num3, String str5, Integer num4, String str6, String str7, String str8, UrlStructV2 urlStructV24, Boolean bool2, String str9, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(l2, str, str2, str3, str4, urlStructV2, bool, list, urlStructV22, urlStructV23, num, num2, num3, str5, num4, str6, str7, str8, urlStructV24, bool2, str9, bool3, bool4, bool5, i.EMPTY);
    }

    public MusicStructV2(Long l2, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, Boolean bool, List<String> list, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, Integer num, Integer num2, Integer num3, String str5, Integer num4, String str6, String str7, String str8, UrlStructV2 urlStructV24, Boolean bool2, String str9, Boolean bool3, Boolean bool4, Boolean bool5, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.id_str = str;
        this.title = str2;
        this.author = str3;
        this.album = str4;
        this.strong_beat_url = urlStructV2;
        this.is_author_artist = bool;
        this.unshelve_countries = Internal.immutableCopyOf("unshelve_countries", list);
        this.cover_thumb = urlStructV22;
        this.play_url = urlStructV23;
        this.start_time = num;
        this.end_time = num2;
        this.duration = num3;
        this.owner_handle = str5;
        this.status = num4;
        this.offline_desc = str6;
        this.owner_id = str7;
        this.owner_nickname = str8;
        this.audio_track = urlStructV24;
        this.is_original = bool2;
        this.mid = str9;
        this.author_deleted = bool3;
        this.is_del_video = bool4;
        this.is_video_self_see = bool5;
    }
}
