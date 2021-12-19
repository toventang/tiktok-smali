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

public final class UserStructV2 extends Message<UserStructV2, Builder> {
    public static final ProtoAdapter<UserStructV2> ADAPTER = new ProtoAdapter_UserStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public String account_region;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 29)
    public UrlStructV2 avatar_168x168;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 30)
    public UrlStructV2 avatar_300x300;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 avatar_larger;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = v.U)
    public String avatar_uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public String country;
    @WireField(adapter = "tiktok.kids.proto.UrlStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 22)
    public List<UrlStructV2> cover_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 19)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String custom_verify;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Boolean is_minor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 28)
    public Boolean is_star;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 23)
    public String iso_country_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public String language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public String region;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 17)
    public Long register_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String remark_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer secret;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_SELECT_SCENE)
    public List<Long> type_label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String unique_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer unique_id_modify_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)
    public Boolean user_canceled;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 26)
    public Integer user_mode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 27)
    public Integer user_period;

    public UserStructV2() {
    }

    static final class ProtoAdapter_UserStructV2 extends ProtoAdapter<UserStructV2> {
        static {
            Covode.recordClassIndex(106764);
        }

        public ProtoAdapter_UserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UserStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.short_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.avatar_larger(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.avatar_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.avatar_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.custom_verify(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.unique_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.is_minor(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.region(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.account_region(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.secret(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.type_label.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 15:
                            builder.unique_id_modify_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.user_canceled(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 17:
                            builder.register_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 19:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case v.U:
                            builder.avatar_uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 21:
                            builder.country(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            builder.cover_url.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            builder.iso_country_code(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            builder.language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 25:
                            builder.remark_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            builder.user_mode(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 27:
                            builder.user_period(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 28:
                            builder.is_star(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 29:
                            builder.avatar_168x168(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.avatar_300x300(UrlStructV2.ADAPTER.decode(protoReader));
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

        public final int encodedSize(UserStructV2 userStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, userStructV2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, userStructV2.short_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, userStructV2.nickname) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, userStructV2.avatar_larger) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, userStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, userStructV2.avatar_medium) + ProtoAdapter.STRING.encodedSizeWithTag(7, userStructV2.custom_verify) + ProtoAdapter.STRING.encodedSizeWithTag(8, userStructV2.unique_id) + ProtoAdapter.BOOL.encodedSizeWithTag(9, userStructV2.is_minor) + ProtoAdapter.STRING.encodedSizeWithTag(10, userStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(11, userStructV2.region) + ProtoAdapter.STRING.encodedSizeWithTag(12, userStructV2.account_region) + ProtoAdapter.INT32.encodedSizeWithTag(13, userStructV2.secret) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(14, userStructV2.type_label) + ProtoAdapter.INT32.encodedSizeWithTag(15, userStructV2.unique_id_modify_time) + ProtoAdapter.BOOL.encodedSizeWithTag(16, userStructV2.user_canceled) + ProtoAdapter.INT64.encodedSizeWithTag(17, userStructV2.register_time) + ProtoAdapter.INT32.encodedSizeWithTag(18, userStructV2.status) + ProtoAdapter.INT64.encodedSizeWithTag(19, userStructV2.create_time) + ProtoAdapter.STRING.encodedSizeWithTag(20, userStructV2.avatar_uri) + ProtoAdapter.STRING.encodedSizeWithTag(21, userStructV2.country) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(22, userStructV2.cover_url) + ProtoAdapter.STRING.encodedSizeWithTag(23, userStructV2.iso_country_code) + ProtoAdapter.STRING.encodedSizeWithTag(24, userStructV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(25, userStructV2.remark_name) + ProtoAdapter.INT32.encodedSizeWithTag(26, userStructV2.user_mode) + ProtoAdapter.INT32.encodedSizeWithTag(27, userStructV2.user_period) + ProtoAdapter.BOOL.encodedSizeWithTag(28, userStructV2.is_star) + UrlStructV2.ADAPTER.encodedSizeWithTag(29, userStructV2.avatar_168x168) + UrlStructV2.ADAPTER.encodedSizeWithTag(30, userStructV2.avatar_300x300) + userStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UserStructV2 userStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userStructV2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userStructV2.short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userStructV2.nickname);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, userStructV2.avatar_larger);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, userStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, userStructV2.avatar_medium);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, userStructV2.custom_verify);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, userStructV2.unique_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, userStructV2.is_minor);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, userStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, userStructV2.region);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, userStructV2.account_region);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, userStructV2.secret);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 14, userStructV2.type_label);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, userStructV2.unique_id_modify_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, userStructV2.user_canceled);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, userStructV2.register_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, userStructV2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, userStructV2.create_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, userStructV2.avatar_uri);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, userStructV2.country);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, userStructV2.cover_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, userStructV2.iso_country_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, userStructV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, userStructV2.remark_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 26, userStructV2.user_mode);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 27, userStructV2.user_period);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, userStructV2.is_star);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 29, userStructV2.avatar_168x168);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 30, userStructV2.avatar_300x300);
            protoWriter.writeBytes(userStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106762);
    }

    public static final class Builder extends Message.Builder<UserStructV2, Builder> {
        public String account_region;
        public UrlStructV2 avatar_168x168;
        public UrlStructV2 avatar_300x300;
        public UrlStructV2 avatar_larger;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_thumb;
        public String avatar_uri;
        public String country;
        public List<UrlStructV2> cover_url = Internal.newMutableList();
        public Long create_time;
        public String custom_verify;
        public Boolean is_minor;
        public Boolean is_star;
        public String iso_country_code;
        public String language;
        public String nickname;
        public String region;
        public Long register_time;
        public String remark_name;
        public String sec_uid;
        public Integer secret;
        public String short_id;
        public Integer status;
        public List<Long> type_label = Internal.newMutableList();
        public String uid;
        public String unique_id;
        public Integer unique_id_modify_time;
        public Boolean user_canceled;
        public Integer user_mode;
        public Integer user_period;

        static {
            Covode.recordClassIndex(106763);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UserStructV2 build() {
            return new UserStructV2(this.uid, this.short_id, this.nickname, this.avatar_larger, this.avatar_thumb, this.avatar_medium, this.custom_verify, this.unique_id, this.is_minor, this.sec_uid, this.region, this.account_region, this.secret, this.type_label, this.unique_id_modify_time, this.user_canceled, this.register_time, this.status, this.create_time, this.avatar_uri, this.country, this.cover_url, this.iso_country_code, this.language, this.remark_name, this.user_mode, this.user_period, this.is_star, this.avatar_168x168, this.avatar_300x300, super.buildUnknownFields());
        }

        public final Builder account_region(String str) {
            this.account_region = str;
            return this;
        }

        public final Builder avatar_168x168(UrlStructV2 urlStructV2) {
            this.avatar_168x168 = urlStructV2;
            return this;
        }

        public final Builder avatar_300x300(UrlStructV2 urlStructV2) {
            this.avatar_300x300 = urlStructV2;
            return this;
        }

        public final Builder avatar_larger(UrlStructV2 urlStructV2) {
            this.avatar_larger = urlStructV2;
            return this;
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder avatar_uri(String str) {
            this.avatar_uri = str;
            return this;
        }

        public final Builder country(String str) {
            this.country = str;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder custom_verify(String str) {
            this.custom_verify = str;
            return this;
        }

        public final Builder is_minor(Boolean bool) {
            this.is_minor = bool;
            return this;
        }

        public final Builder is_star(Boolean bool) {
            this.is_star = bool;
            return this;
        }

        public final Builder iso_country_code(String str) {
            this.iso_country_code = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder register_time(Long l2) {
            this.register_time = l2;
            return this;
        }

        public final Builder remark_name(String str) {
            this.remark_name = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder secret(Integer num) {
            this.secret = num;
            return this;
        }

        public final Builder short_id(String str) {
            this.short_id = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }

        public final Builder unique_id(String str) {
            this.unique_id = str;
            return this;
        }

        public final Builder unique_id_modify_time(Integer num) {
            this.unique_id_modify_time = num;
            return this;
        }

        public final Builder user_canceled(Boolean bool) {
            this.user_canceled = bool;
            return this;
        }

        public final Builder user_mode(Integer num) {
            this.user_mode = num;
            return this;
        }

        public final Builder user_period(Integer num) {
            this.user_period = num;
            return this;
        }

        public final Builder cover_url(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.cover_url = list;
            return this;
        }

        public final Builder type_label(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.type_label = list;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.UserStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UserStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.short_id = this.short_id;
        builder.nickname = this.nickname;
        builder.avatar_larger = this.avatar_larger;
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.custom_verify = this.custom_verify;
        builder.unique_id = this.unique_id;
        builder.is_minor = this.is_minor;
        builder.sec_uid = this.sec_uid;
        builder.region = this.region;
        builder.account_region = this.account_region;
        builder.secret = this.secret;
        builder.type_label = Internal.copyOf("type_label", this.type_label);
        builder.unique_id_modify_time = this.unique_id_modify_time;
        builder.user_canceled = this.user_canceled;
        builder.register_time = this.register_time;
        builder.status = this.status;
        builder.create_time = this.create_time;
        builder.avatar_uri = this.avatar_uri;
        builder.country = this.country;
        builder.cover_url = Internal.copyOf("cover_url", this.cover_url);
        builder.iso_country_code = this.iso_country_code;
        builder.language = this.language;
        builder.remark_name = this.remark_name;
        builder.user_mode = this.user_mode;
        builder.user_period = this.user_period;
        builder.is_star = this.is_star;
        builder.avatar_168x168 = this.avatar_168x168;
        builder.avatar_300x300 = this.avatar_300x300;
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
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29 = this.hashCode;
        if (i29 != 0) {
            return i29;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.uid;
        int i30 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i31 = (hashCode + i2) * 37;
        String str2 = this.short_id;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i32 = (i31 + i3) * 37;
        String str3 = this.nickname;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 37;
        UrlStructV2 urlStructV2 = this.avatar_larger;
        if (urlStructV2 != null) {
            i5 = urlStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i34 = (i33 + i5) * 37;
        UrlStructV2 urlStructV22 = this.avatar_thumb;
        if (urlStructV22 != null) {
            i6 = urlStructV22.hashCode();
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 37;
        UrlStructV2 urlStructV23 = this.avatar_medium;
        if (urlStructV23 != null) {
            i7 = urlStructV23.hashCode();
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 37;
        String str4 = this.custom_verify;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i37 = (i36 + i8) * 37;
        String str5 = this.unique_id;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        int i38 = (i37 + i9) * 37;
        Boolean bool = this.is_minor;
        if (bool != null) {
            i10 = bool.hashCode();
        } else {
            i10 = 0;
        }
        int i39 = (i38 + i10) * 37;
        String str6 = this.sec_uid;
        if (str6 != null) {
            i11 = str6.hashCode();
        } else {
            i11 = 0;
        }
        int i40 = (i39 + i11) * 37;
        String str7 = this.region;
        if (str7 != null) {
            i12 = str7.hashCode();
        } else {
            i12 = 0;
        }
        int i41 = (i40 + i12) * 37;
        String str8 = this.account_region;
        if (str8 != null) {
            i13 = str8.hashCode();
        } else {
            i13 = 0;
        }
        int i42 = (i41 + i13) * 37;
        Integer num = this.secret;
        if (num != null) {
            i14 = num.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode2 = (((i42 + i14) * 37) + this.type_label.hashCode()) * 37;
        Integer num2 = this.unique_id_modify_time;
        if (num2 != null) {
            i15 = num2.hashCode();
        } else {
            i15 = 0;
        }
        int i43 = (hashCode2 + i15) * 37;
        Boolean bool2 = this.user_canceled;
        if (bool2 != null) {
            i16 = bool2.hashCode();
        } else {
            i16 = 0;
        }
        int i44 = (i43 + i16) * 37;
        Long l2 = this.register_time;
        if (l2 != null) {
            i17 = l2.hashCode();
        } else {
            i17 = 0;
        }
        int i45 = (i44 + i17) * 37;
        Integer num3 = this.status;
        if (num3 != null) {
            i18 = num3.hashCode();
        } else {
            i18 = 0;
        }
        int i46 = (i45 + i18) * 37;
        Long l3 = this.create_time;
        if (l3 != null) {
            i19 = l3.hashCode();
        } else {
            i19 = 0;
        }
        int i47 = (i46 + i19) * 37;
        String str9 = this.avatar_uri;
        if (str9 != null) {
            i20 = str9.hashCode();
        } else {
            i20 = 0;
        }
        int i48 = (i47 + i20) * 37;
        String str10 = this.country;
        if (str10 != null) {
            i21 = str10.hashCode();
        } else {
            i21 = 0;
        }
        int hashCode3 = (((i48 + i21) * 37) + this.cover_url.hashCode()) * 37;
        String str11 = this.iso_country_code;
        if (str11 != null) {
            i22 = str11.hashCode();
        } else {
            i22 = 0;
        }
        int i49 = (hashCode3 + i22) * 37;
        String str12 = this.language;
        if (str12 != null) {
            i23 = str12.hashCode();
        } else {
            i23 = 0;
        }
        int i50 = (i49 + i23) * 37;
        String str13 = this.remark_name;
        if (str13 != null) {
            i24 = str13.hashCode();
        } else {
            i24 = 0;
        }
        int i51 = (i50 + i24) * 37;
        Integer num4 = this.user_mode;
        if (num4 != null) {
            i25 = num4.hashCode();
        } else {
            i25 = 0;
        }
        int i52 = (i51 + i25) * 37;
        Integer num5 = this.user_period;
        if (num5 != null) {
            i26 = num5.hashCode();
        } else {
            i26 = 0;
        }
        int i53 = (i52 + i26) * 37;
        Boolean bool3 = this.is_star;
        if (bool3 != null) {
            i27 = bool3.hashCode();
        } else {
            i27 = 0;
        }
        int i54 = (i53 + i27) * 37;
        UrlStructV2 urlStructV24 = this.avatar_168x168;
        if (urlStructV24 != null) {
            i28 = urlStructV24.hashCode();
        } else {
            i28 = 0;
        }
        int i55 = (i54 + i28) * 37;
        UrlStructV2 urlStructV25 = this.avatar_300x300;
        if (urlStructV25 != null) {
            i30 = urlStructV25.hashCode();
        }
        int i56 = i55 + i30;
        this.hashCode = i56;
        return i56;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=").append(this.uid);
        }
        if (this.short_id != null) {
            sb.append(", short_id=").append(this.short_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.avatar_larger != null) {
            sb.append(", avatar_larger=").append(this.avatar_larger);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=").append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=").append(this.avatar_medium);
        }
        if (this.custom_verify != null) {
            sb.append(", custom_verify=").append(this.custom_verify);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=").append(this.unique_id);
        }
        if (this.is_minor != null) {
            sb.append(", is_minor=").append(this.is_minor);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.region != null) {
            sb.append(", region=").append(this.region);
        }
        if (this.account_region != null) {
            sb.append(", account_region=").append(this.account_region);
        }
        if (this.secret != null) {
            sb.append(", secret=").append(this.secret);
        }
        if (!this.type_label.isEmpty()) {
            sb.append(", type_label=").append(this.type_label);
        }
        if (this.unique_id_modify_time != null) {
            sb.append(", unique_id_modify_time=").append(this.unique_id_modify_time);
        }
        if (this.user_canceled != null) {
            sb.append(", user_canceled=").append(this.user_canceled);
        }
        if (this.register_time != null) {
            sb.append(", register_time=").append(this.register_time);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.create_time != null) {
            sb.append(", create_time=").append(this.create_time);
        }
        if (this.avatar_uri != null) {
            sb.append(", avatar_uri=").append(this.avatar_uri);
        }
        if (this.country != null) {
            sb.append(", country=").append(this.country);
        }
        if (!this.cover_url.isEmpty()) {
            sb.append(", cover_url=").append(this.cover_url);
        }
        if (this.iso_country_code != null) {
            sb.append(", iso_country_code=").append(this.iso_country_code);
        }
        if (this.language != null) {
            sb.append(", language=").append(this.language);
        }
        if (this.remark_name != null) {
            sb.append(", remark_name=").append(this.remark_name);
        }
        if (this.user_mode != null) {
            sb.append(", user_mode=").append(this.user_mode);
        }
        if (this.user_period != null) {
            sb.append(", user_period=").append(this.user_period);
        }
        if (this.is_star != null) {
            sb.append(", is_star=").append(this.is_star);
        }
        if (this.avatar_168x168 != null) {
            sb.append(", avatar_168x168=").append(this.avatar_168x168);
        }
        if (this.avatar_300x300 != null) {
            sb.append(", avatar_300x300=").append(this.avatar_300x300);
        }
        return sb.replace(0, 2, "UserStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserStructV2)) {
            return false;
        }
        UserStructV2 userStructV2 = (UserStructV2) obj;
        if (!unknownFields().equals(userStructV2.unknownFields()) || !Internal.equals(this.uid, userStructV2.uid) || !Internal.equals(this.short_id, userStructV2.short_id) || !Internal.equals(this.nickname, userStructV2.nickname) || !Internal.equals(this.avatar_larger, userStructV2.avatar_larger) || !Internal.equals(this.avatar_thumb, userStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, userStructV2.avatar_medium) || !Internal.equals(this.custom_verify, userStructV2.custom_verify) || !Internal.equals(this.unique_id, userStructV2.unique_id) || !Internal.equals(this.is_minor, userStructV2.is_minor) || !Internal.equals(this.sec_uid, userStructV2.sec_uid) || !Internal.equals(this.region, userStructV2.region) || !Internal.equals(this.account_region, userStructV2.account_region) || !Internal.equals(this.secret, userStructV2.secret) || !this.type_label.equals(userStructV2.type_label) || !Internal.equals(this.unique_id_modify_time, userStructV2.unique_id_modify_time) || !Internal.equals(this.user_canceled, userStructV2.user_canceled) || !Internal.equals(this.register_time, userStructV2.register_time) || !Internal.equals(this.status, userStructV2.status) || !Internal.equals(this.create_time, userStructV2.create_time) || !Internal.equals(this.avatar_uri, userStructV2.avatar_uri) || !Internal.equals(this.country, userStructV2.country) || !this.cover_url.equals(userStructV2.cover_url) || !Internal.equals(this.iso_country_code, userStructV2.iso_country_code) || !Internal.equals(this.language, userStructV2.language) || !Internal.equals(this.remark_name, userStructV2.remark_name) || !Internal.equals(this.user_mode, userStructV2.user_mode) || !Internal.equals(this.user_period, userStructV2.user_period) || !Internal.equals(this.is_star, userStructV2.is_star) || !Internal.equals(this.avatar_168x168, userStructV2.avatar_168x168) || !Internal.equals(this.avatar_300x300, userStructV2.avatar_300x300)) {
            return false;
        }
        return true;
    }

    public UserStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, String str4, String str5, Boolean bool, String str6, String str7, String str8, Integer num, List<Long> list, Integer num2, Boolean bool2, Long l2, Integer num3, Long l3, String str9, String str10, List<UrlStructV2> list2, String str11, String str12, String str13, Integer num4, Integer num5, Boolean bool3, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25) {
        this(str, str2, str3, urlStructV2, urlStructV22, urlStructV23, str4, str5, bool, str6, str7, str8, num, list, num2, bool2, l2, num3, l3, str9, str10, list2, str11, str12, str13, num4, num5, bool3, urlStructV24, urlStructV25, i.EMPTY);
    }

    public UserStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, String str4, String str5, Boolean bool, String str6, String str7, String str8, Integer num, List<Long> list, Integer num2, Boolean bool2, Long l2, Integer num3, Long l3, String str9, String str10, List<UrlStructV2> list2, String str11, String str12, String str13, Integer num4, Integer num5, Boolean bool3, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, i iVar) {
        super(ADAPTER, iVar);
        this.uid = str;
        this.short_id = str2;
        this.nickname = str3;
        this.avatar_larger = urlStructV2;
        this.avatar_thumb = urlStructV22;
        this.avatar_medium = urlStructV23;
        this.custom_verify = str4;
        this.unique_id = str5;
        this.is_minor = bool;
        this.sec_uid = str6;
        this.region = str7;
        this.account_region = str8;
        this.secret = num;
        this.type_label = Internal.immutableCopyOf("type_label", list);
        this.unique_id_modify_time = num2;
        this.user_canceled = bool2;
        this.register_time = l2;
        this.status = num3;
        this.create_time = l3;
        this.avatar_uri = str9;
        this.country = str10;
        this.cover_url = Internal.immutableCopyOf("cover_url", list2);
        this.iso_country_code = str11;
        this.language = str12;
        this.remark_name = str13;
        this.user_mode = num4;
        this.user_period = num5;
        this.is_star = bool3;
        this.avatar_168x168 = urlStructV24;
        this.avatar_300x300 = urlStructV25;
    }
}
