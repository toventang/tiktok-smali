package com.snapchat.kit.sdk.core.metrics.model;

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

public final class SkateEvent extends Message<SkateEvent, Builder> {
    public static final ProtoAdapter<SkateEvent> ADAPTER = new ProtoAdapter_SkateEvent();
    public static final DailySessionBucket DEFAULT_DAILY_SESSION_BUCKET = DailySessionBucket.NO_SESSION_BUCKET;
    public static final Long DEFAULT_DAY = 0L;
    public static final Boolean DEFAULT_IS_FIRST_WITHIN_MONTH = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_FROM_REACT_NATIVE_PLUGIN = Boolean.FALSE;
    public static final KitPluginType DEFAULT_KIT_PLUGIN_TYPE = KitPluginType.NO_PLUGIN;
    public static final LoginRoute DEFAULT_LOGIN_ROUTE = LoginRoute.UNKNOWN_LOGIN_ROUTE;
    public static final Long DEFAULT_MONTH = 0L;
    public static final Double DEFAULT_SAMPLE_RATE = Double.valueOf(0.0d);
    public static final SnapKitInitType DEFAULT_SNAP_KIT_INIT_TYPE = SnapKitInitType.INIT_TYPE_NONE;
    public static final Long DEFAULT_YEAR = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public final String core_version;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.DailySessionBucket#ADAPTER", tag = 1)
    public final DailySessionBucket daily_session_bucket;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final Long day;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_first_within_month;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15)
    public final Boolean is_from_react_native_plugin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public final String kit_app_id;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitPluginType#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public final KitPluginType kit_plugin_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String kit_variants_string_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SELECT_SCENE)
    public final String kit_version_string_list;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginRoute#ADAPTER", tag = 3)
    public final LoginRoute login_route;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final Long month;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final String oauth_client_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 4)
    public final Double sample_rate;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final SnapKitInitType snap_kit_init_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final Long year;

    static final class ProtoAdapter_SkateEvent extends ProtoAdapter<SkateEvent> {
        static {
            Covode.recordClassIndex(35743);
        }

        public ProtoAdapter_SkateEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, SkateEvent.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snapchat.kit.sdk.core.metrics.model.SkateEvent$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.SkateEvent redact(com.snapchat.kit.sdk.core.metrics.model.SkateEvent r2) {
            /*
                r1 = this;
                com.snapchat.kit.sdk.core.metrics.model.SkateEvent$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.SkateEvent r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.SkateEvent.ProtoAdapter_SkateEvent.redact(com.snapchat.kit.sdk.core.metrics.model.SkateEvent):com.snapchat.kit.sdk.core.metrics.model.SkateEvent");
        }

        public final int encodedSize(SkateEvent skateEvent) {
            return DailySessionBucket.ADAPTER.encodedSizeWithTag(1, skateEvent.daily_session_bucket) + ProtoAdapter.BOOL.encodedSizeWithTag(2, skateEvent.is_first_within_month) + LoginRoute.ADAPTER.encodedSizeWithTag(3, skateEvent.login_route) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, skateEvent.sample_rate) + ProtoAdapter.STRING.encodedSizeWithTag(5, skateEvent.kit_variants_string_list) + ProtoAdapter.UINT64.encodedSizeWithTag(6, skateEvent.day) + ProtoAdapter.UINT64.encodedSizeWithTag(7, skateEvent.month) + ProtoAdapter.UINT64.encodedSizeWithTag(8, skateEvent.year) + ProtoAdapter.STRING.encodedSizeWithTag(9, skateEvent.oauth_client_id) + ProtoAdapter.STRING.encodedSizeWithTag(10, skateEvent.kit_app_id) + SnapKitInitType.ADAPTER.encodedSizeWithTag(11, skateEvent.snap_kit_init_type) + KitPluginType.ADAPTER.encodedSizeWithTag(12, skateEvent.kit_plugin_type) + ProtoAdapter.STRING.encodedSizeWithTag(13, skateEvent.core_version) + ProtoAdapter.STRING.encodedSizeWithTag(14, skateEvent.kit_version_string_list) + ProtoAdapter.BOOL.encodedSizeWithTag(15, skateEvent.is_from_react_native_plugin) + skateEvent.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SkateEvent decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.daily_session_bucket(DailySessionBucket.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 2:
                            builder.is_first_within_month(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.login_route(LoginRoute.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 4:
                            builder.sample_rate(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.kit_variants_string_list(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.day(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.month(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.year(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.oauth_client_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.kit_app_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            try {
                                builder.snap_kit_init_type(SnapKitInitType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            try {
                                builder.kit_plugin_type(KitPluginType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.core_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.kit_version_string_list(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.is_from_react_native_plugin(ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SkateEvent skateEvent) {
            DailySessionBucket.ADAPTER.encodeWithTag(protoWriter, 1, skateEvent.daily_session_bucket);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, skateEvent.is_first_within_month);
            LoginRoute.ADAPTER.encodeWithTag(protoWriter, 3, skateEvent.login_route);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, skateEvent.sample_rate);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, skateEvent.kit_variants_string_list);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 6, skateEvent.day);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 7, skateEvent.month);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 8, skateEvent.year);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, skateEvent.oauth_client_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, skateEvent.kit_app_id);
            SnapKitInitType.ADAPTER.encodeWithTag(protoWriter, 11, skateEvent.snap_kit_init_type);
            KitPluginType.ADAPTER.encodeWithTag(protoWriter, 12, skateEvent.kit_plugin_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, skateEvent.core_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, skateEvent.kit_version_string_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, skateEvent.is_from_react_native_plugin);
            protoWriter.writeBytes(skateEvent.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SkateEvent, Builder> {
        public String core_version;
        public DailySessionBucket daily_session_bucket;
        public Long day;
        public Boolean is_first_within_month;
        public Boolean is_from_react_native_plugin;
        public String kit_app_id;
        public KitPluginType kit_plugin_type;
        public String kit_variants_string_list;
        public String kit_version_string_list;
        public LoginRoute login_route;
        public Long month;
        public String oauth_client_id;
        public Double sample_rate;
        public SnapKitInitType snap_kit_init_type;
        public Long year;

        static {
            Covode.recordClassIndex(35742);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SkateEvent build() {
            return new SkateEvent(this.daily_session_bucket, this.is_first_within_month, this.login_route, this.sample_rate, this.kit_variants_string_list, this.day, this.month, this.year, this.oauth_client_id, this.kit_app_id, this.snap_kit_init_type, this.kit_plugin_type, this.core_version, this.kit_version_string_list, this.is_from_react_native_plugin, super.buildUnknownFields());
        }

        public final Builder core_version(String str) {
            this.core_version = str;
            return this;
        }

        public final Builder daily_session_bucket(DailySessionBucket dailySessionBucket) {
            this.daily_session_bucket = dailySessionBucket;
            return this;
        }

        public final Builder day(Long l2) {
            this.day = l2;
            return this;
        }

        public final Builder is_first_within_month(Boolean bool) {
            this.is_first_within_month = bool;
            return this;
        }

        public final Builder is_from_react_native_plugin(Boolean bool) {
            this.is_from_react_native_plugin = bool;
            return this;
        }

        public final Builder kit_app_id(String str) {
            this.kit_app_id = str;
            return this;
        }

        public final Builder kit_plugin_type(KitPluginType kitPluginType) {
            this.kit_plugin_type = kitPluginType;
            return this;
        }

        public final Builder kit_variants_string_list(String str) {
            this.kit_variants_string_list = str;
            return this;
        }

        public final Builder kit_version_string_list(String str) {
            this.kit_version_string_list = str;
            return this;
        }

        public final Builder login_route(LoginRoute loginRoute) {
            this.login_route = loginRoute;
            return this;
        }

        public final Builder month(Long l2) {
            this.month = l2;
            return this;
        }

        public final Builder oauth_client_id(String str) {
            this.oauth_client_id = str;
            return this;
        }

        public final Builder sample_rate(Double d2) {
            this.sample_rate = d2;
            return this;
        }

        public final Builder snap_kit_init_type(SnapKitInitType snapKitInitType) {
            this.snap_kit_init_type = snapKitInitType;
            return this;
        }

        public final Builder year(Long l2) {
            this.year = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35741);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.SkateEvent$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SkateEvent, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.daily_session_bucket = this.daily_session_bucket;
        builder.is_first_within_month = this.is_first_within_month;
        builder.login_route = this.login_route;
        builder.sample_rate = this.sample_rate;
        builder.kit_variants_string_list = this.kit_variants_string_list;
        builder.day = this.day;
        builder.month = this.month;
        builder.year = this.year;
        builder.oauth_client_id = this.oauth_client_id;
        builder.kit_app_id = this.kit_app_id;
        builder.snap_kit_init_type = this.snap_kit_init_type;
        builder.kit_plugin_type = this.kit_plugin_type;
        builder.core_version = this.core_version;
        builder.kit_version_string_list = this.kit_version_string_list;
        builder.is_from_react_native_plugin = this.is_from_react_native_plugin;
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
        DailySessionBucket dailySessionBucket = this.daily_session_bucket;
        int i17 = 0;
        if (dailySessionBucket != null) {
            i2 = dailySessionBucket.hashCode();
        } else {
            i2 = 0;
        }
        int i18 = (hashCode + i2) * 37;
        Boolean bool = this.is_first_within_month;
        if (bool != null) {
            i3 = bool.hashCode();
        } else {
            i3 = 0;
        }
        int i19 = (i18 + i3) * 37;
        LoginRoute loginRoute = this.login_route;
        if (loginRoute != null) {
            i4 = loginRoute.hashCode();
        } else {
            i4 = 0;
        }
        int i20 = (i19 + i4) * 37;
        Double d2 = this.sample_rate;
        if (d2 != null) {
            i5 = d2.hashCode();
        } else {
            i5 = 0;
        }
        int i21 = (i20 + i5) * 37;
        String str = this.kit_variants_string_list;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i22 = (i21 + i6) * 37;
        Long l2 = this.day;
        if (l2 != null) {
            i7 = l2.hashCode();
        } else {
            i7 = 0;
        }
        int i23 = (i22 + i7) * 37;
        Long l3 = this.month;
        if (l3 != null) {
            i8 = l3.hashCode();
        } else {
            i8 = 0;
        }
        int i24 = (i23 + i8) * 37;
        Long l4 = this.year;
        if (l4 != null) {
            i9 = l4.hashCode();
        } else {
            i9 = 0;
        }
        int i25 = (i24 + i9) * 37;
        String str2 = this.oauth_client_id;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 37;
        String str3 = this.kit_app_id;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i27 = (i26 + i11) * 37;
        SnapKitInitType snapKitInitType = this.snap_kit_init_type;
        if (snapKitInitType != null) {
            i12 = snapKitInitType.hashCode();
        } else {
            i12 = 0;
        }
        int i28 = (i27 + i12) * 37;
        KitPluginType kitPluginType = this.kit_plugin_type;
        if (kitPluginType != null) {
            i13 = kitPluginType.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (i28 + i13) * 37;
        String str4 = this.core_version;
        if (str4 != null) {
            i14 = str4.hashCode();
        } else {
            i14 = 0;
        }
        int i30 = (i29 + i14) * 37;
        String str5 = this.kit_version_string_list;
        if (str5 != null) {
            i15 = str5.hashCode();
        } else {
            i15 = 0;
        }
        int i31 = (i30 + i15) * 37;
        Boolean bool2 = this.is_from_react_native_plugin;
        if (bool2 != null) {
            i17 = bool2.hashCode();
        }
        int i32 = i31 + i17;
        this.hashCode = i32;
        return i32;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.daily_session_bucket != null) {
            sb.append(", daily_session_bucket=").append(this.daily_session_bucket);
        }
        if (this.is_first_within_month != null) {
            sb.append(", is_first_within_month=").append(this.is_first_within_month);
        }
        if (this.login_route != null) {
            sb.append(", login_route=").append(this.login_route);
        }
        if (this.sample_rate != null) {
            sb.append(", sample_rate=").append(this.sample_rate);
        }
        if (this.kit_variants_string_list != null) {
            sb.append(", kit_variants_string_list=").append(this.kit_variants_string_list);
        }
        if (this.day != null) {
            sb.append(", day=").append(this.day);
        }
        if (this.month != null) {
            sb.append(", month=").append(this.month);
        }
        if (this.year != null) {
            sb.append(", year=").append(this.year);
        }
        if (this.oauth_client_id != null) {
            sb.append(", oauth_client_id=").append(this.oauth_client_id);
        }
        if (this.kit_app_id != null) {
            sb.append(", kit_app_id=").append(this.kit_app_id);
        }
        if (this.snap_kit_init_type != null) {
            sb.append(", snap_kit_init_type=").append(this.snap_kit_init_type);
        }
        if (this.kit_plugin_type != null) {
            sb.append(", kit_plugin_type=").append(this.kit_plugin_type);
        }
        if (this.core_version != null) {
            sb.append(", core_version=").append(this.core_version);
        }
        if (this.kit_version_string_list != null) {
            sb.append(", kit_version_string_list=").append(this.kit_version_string_list);
        }
        if (this.is_from_react_native_plugin != null) {
            sb.append(", is_from_react_native_plugin=").append(this.is_from_react_native_plugin);
        }
        return sb.replace(0, 2, "SkateEvent{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SkateEvent)) {
            return false;
        }
        SkateEvent skateEvent = (SkateEvent) obj;
        if (!unknownFields().equals(skateEvent.unknownFields()) || !Internal.equals(this.daily_session_bucket, skateEvent.daily_session_bucket) || !Internal.equals(this.is_first_within_month, skateEvent.is_first_within_month) || !Internal.equals(this.login_route, skateEvent.login_route) || !Internal.equals(this.sample_rate, skateEvent.sample_rate) || !Internal.equals(this.kit_variants_string_list, skateEvent.kit_variants_string_list) || !Internal.equals(this.day, skateEvent.day) || !Internal.equals(this.month, skateEvent.month) || !Internal.equals(this.year, skateEvent.year) || !Internal.equals(this.oauth_client_id, skateEvent.oauth_client_id) || !Internal.equals(this.kit_app_id, skateEvent.kit_app_id) || !Internal.equals(this.snap_kit_init_type, skateEvent.snap_kit_init_type) || !Internal.equals(this.kit_plugin_type, skateEvent.kit_plugin_type) || !Internal.equals(this.core_version, skateEvent.core_version) || !Internal.equals(this.kit_version_string_list, skateEvent.kit_version_string_list) || !Internal.equals(this.is_from_react_native_plugin, skateEvent.is_from_react_native_plugin)) {
            return false;
        }
        return true;
    }

    public SkateEvent(DailySessionBucket dailySessionBucket, Boolean bool, LoginRoute loginRoute, Double d2, String str, Long l2, Long l3, Long l4, String str2, String str3, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, String str4, String str5, Boolean bool2) {
        this(dailySessionBucket, bool, loginRoute, d2, str, l2, l3, l4, str2, str3, snapKitInitType, kitPluginType, str4, str5, bool2, i.EMPTY);
    }

    public SkateEvent(DailySessionBucket dailySessionBucket, Boolean bool, LoginRoute loginRoute, Double d2, String str, Long l2, Long l3, Long l4, String str2, String str3, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, String str4, String str5, Boolean bool2, i iVar) {
        super(ADAPTER, iVar);
        this.daily_session_bucket = dailySessionBucket;
        this.is_first_within_month = bool;
        this.login_route = loginRoute;
        this.sample_rate = d2;
        this.kit_variants_string_list = str;
        this.day = l2;
        this.month = l3;
        this.year = l4;
        this.oauth_client_id = str2;
        this.kit_app_id = str3;
        this.snap_kit_init_type = snapKitInitType;
        this.kit_plugin_type = kitPluginType;
        this.core_version = str4;
        this.kit_version_string_list = str5;
        this.is_from_react_native_plugin = bool2;
    }
}
