package com.snapchat.kit.sdk.core.metrics.model;

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
import k.i;

public final class KitEventBase extends Message<KitEventBase, Builder> {
    public static final ProtoAdapter<KitEventBase> ADAPTER = new ProtoAdapter_KitEventBase();
    public static final Long DEFAULT_CLIENT_SEQUENCE_ID = 0L;
    public static final Boolean DEFAULT_IS_APP_PRERELEASE = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_FROM_REACT_NATIVE_PLUGIN = Boolean.FALSE;
    public static final Long DEFAULT_KIT_CLIENT_TIMESTAMP_MILLIS = 0L;
    public static final KitPluginType DEFAULT_KIT_PLUGIN_TYPE = KitPluginType.NO_PLUGIN;
    public static final KitType DEFAULT_KIT_VARIANT = KitType.UNKNOWN_KIT_TYPE;
    public static final Long DEFAULT_MAX_CLIENT_SEQUENCE_ID_ON_INSTANCE = 0L;
    public static final Boolean DEFAULT_RUNNING_IN_SIMULATOR = Boolean.FALSE;
    public static final Boolean DEFAULT_RUNNING_IN_TESTS = Boolean.FALSE;
    public static final Boolean DEFAULT_RUNNING_WITH_DEBUGGER_ATTACHED = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final Long client_sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String ip_address;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15)
    public final Boolean is_app_prerelease;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 19)
    public final Boolean is_from_react_native_plugin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public final String kit_app_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final Long kit_client_timestamp_millis;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitPluginType#ADAPTER", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public final KitPluginType kit_plugin_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public final String kit_session_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String kit_user_agent;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitType#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final KitType kit_variant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final String kit_variant_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String locale;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public final Long max_client_sequence_id_on_instance;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String oauth_client_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String os_minor_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_SELECT_SCENE)
    public final Boolean running_in_simulator;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public final Boolean running_in_tests;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public final Boolean running_with_debugger_attached;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final String target_architecture;

    static final class ProtoAdapter_KitEventBase extends ProtoAdapter<KitEventBase> {
        static {
            Covode.recordClassIndex(35704);
        }

        public ProtoAdapter_KitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, KitEventBase.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snapchat.kit.sdk.core.metrics.model.KitEventBase$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.KitEventBase redact(com.snapchat.kit.sdk.core.metrics.model.KitEventBase r2) {
            /*
                r1 = this;
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.KitEventBase.ProtoAdapter_KitEventBase.redact(com.snapchat.kit.sdk.core.metrics.model.KitEventBase):com.snapchat.kit.sdk.core.metrics.model.KitEventBase");
        }

        public final int encodedSize(KitEventBase kitEventBase) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, kitEventBase.oauth_client_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, kitEventBase.locale) + ProtoAdapter.STRING.encodedSizeWithTag(3, kitEventBase.kit_user_agent) + ProtoAdapter.STRING.encodedSizeWithTag(4, kitEventBase.ip_address) + ProtoAdapter.STRING.encodedSizeWithTag(5, kitEventBase.os_minor_version) + KitType.ADAPTER.encodedSizeWithTag(6, kitEventBase.kit_variant) + ProtoAdapter.STRING.encodedSizeWithTag(7, kitEventBase.kit_variant_version) + ProtoAdapter.UINT64.encodedSizeWithTag(8, kitEventBase.kit_client_timestamp_millis) + ProtoAdapter.UINT64.encodedSizeWithTag(9, kitEventBase.client_sequence_id) + ProtoAdapter.UINT64.encodedSizeWithTag(10, kitEventBase.max_client_sequence_id_on_instance) + ProtoAdapter.STRING.encodedSizeWithTag(11, kitEventBase.target_architecture) + ProtoAdapter.BOOL.encodedSizeWithTag(12, kitEventBase.running_with_debugger_attached) + ProtoAdapter.BOOL.encodedSizeWithTag(13, kitEventBase.running_in_tests) + ProtoAdapter.BOOL.encodedSizeWithTag(14, kitEventBase.running_in_simulator) + ProtoAdapter.BOOL.encodedSizeWithTag(15, kitEventBase.is_app_prerelease) + ProtoAdapter.STRING.encodedSizeWithTag(16, kitEventBase.kit_app_id) + ProtoAdapter.STRING.encodedSizeWithTag(17, kitEventBase.kit_session_id) + KitPluginType.ADAPTER.encodedSizeWithTag(18, kitEventBase.kit_plugin_type) + ProtoAdapter.BOOL.encodedSizeWithTag(19, kitEventBase.is_from_react_native_plugin) + kitEventBase.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final KitEventBase decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.oauth_client_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.locale(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.kit_user_agent(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.ip_address(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.os_minor_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            try {
                                builder.kit_variant(KitType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.kit_variant_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.kit_client_timestamp_millis(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.client_sequence_id(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.max_client_sequence_id_on_instance(ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.target_architecture(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.running_with_debugger_attached(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.running_in_tests(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.running_in_simulator(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 15:
                            builder.is_app_prerelease(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 16:
                            builder.kit_app_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.kit_session_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            try {
                                builder.kit_plugin_type(KitPluginType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 19:
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

        public final void encode(ProtoWriter protoWriter, KitEventBase kitEventBase) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, kitEventBase.oauth_client_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, kitEventBase.locale);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, kitEventBase.kit_user_agent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, kitEventBase.ip_address);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, kitEventBase.os_minor_version);
            KitType.ADAPTER.encodeWithTag(protoWriter, 6, kitEventBase.kit_variant);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, kitEventBase.kit_variant_version);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 8, kitEventBase.kit_client_timestamp_millis);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 9, kitEventBase.client_sequence_id);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 10, kitEventBase.max_client_sequence_id_on_instance);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, kitEventBase.target_architecture);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, kitEventBase.running_with_debugger_attached);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, kitEventBase.running_in_tests);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, kitEventBase.running_in_simulator);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, kitEventBase.is_app_prerelease);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, kitEventBase.kit_app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, kitEventBase.kit_session_id);
            KitPluginType.ADAPTER.encodeWithTag(protoWriter, 18, kitEventBase.kit_plugin_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, kitEventBase.is_from_react_native_plugin);
            protoWriter.writeBytes(kitEventBase.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35702);
    }

    public static final class Builder extends Message.Builder<KitEventBase, Builder> {
        public Long client_sequence_id;
        public String ip_address;
        public Boolean is_app_prerelease;
        public Boolean is_from_react_native_plugin;
        public String kit_app_id;
        public Long kit_client_timestamp_millis;
        public KitPluginType kit_plugin_type;
        public String kit_session_id;
        public String kit_user_agent;
        public KitType kit_variant;
        public String kit_variant_version;
        public String locale;
        public Long max_client_sequence_id_on_instance;
        public String oauth_client_id;
        public String os_minor_version;
        public Boolean running_in_simulator;
        public Boolean running_in_tests;
        public Boolean running_with_debugger_attached;
        public String target_architecture;

        static {
            Covode.recordClassIndex(35703);
        }

        @Override // com.squareup.wire.Message.Builder
        public final KitEventBase build() {
            return new KitEventBase(this.oauth_client_id, this.locale, this.kit_user_agent, this.ip_address, this.os_minor_version, this.kit_variant, this.kit_variant_version, this.kit_client_timestamp_millis, this.client_sequence_id, this.max_client_sequence_id_on_instance, this.target_architecture, this.running_with_debugger_attached, this.running_in_tests, this.running_in_simulator, this.is_app_prerelease, this.kit_app_id, this.kit_session_id, this.kit_plugin_type, this.is_from_react_native_plugin, super.buildUnknownFields());
        }

        public final Builder client_sequence_id(Long l2) {
            this.client_sequence_id = l2;
            return this;
        }

        public final Builder ip_address(String str) {
            this.ip_address = str;
            return this;
        }

        public final Builder is_app_prerelease(Boolean bool) {
            this.is_app_prerelease = bool;
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

        public final Builder kit_client_timestamp_millis(Long l2) {
            this.kit_client_timestamp_millis = l2;
            return this;
        }

        public final Builder kit_plugin_type(KitPluginType kitPluginType) {
            this.kit_plugin_type = kitPluginType;
            return this;
        }

        public final Builder kit_session_id(String str) {
            this.kit_session_id = str;
            return this;
        }

        public final Builder kit_user_agent(String str) {
            this.kit_user_agent = str;
            return this;
        }

        public final Builder kit_variant(KitType kitType) {
            this.kit_variant = kitType;
            return this;
        }

        public final Builder kit_variant_version(String str) {
            this.kit_variant_version = str;
            return this;
        }

        public final Builder locale(String str) {
            this.locale = str;
            return this;
        }

        public final Builder max_client_sequence_id_on_instance(Long l2) {
            this.max_client_sequence_id_on_instance = l2;
            return this;
        }

        public final Builder oauth_client_id(String str) {
            this.oauth_client_id = str;
            return this;
        }

        public final Builder os_minor_version(String str) {
            this.os_minor_version = str;
            return this;
        }

        public final Builder running_in_simulator(Boolean bool) {
            this.running_in_simulator = bool;
            return this;
        }

        public final Builder running_in_tests(Boolean bool) {
            this.running_in_tests = bool;
            return this;
        }

        public final Builder running_with_debugger_attached(Boolean bool) {
            this.running_with_debugger_attached = bool;
            return this;
        }

        public final Builder target_architecture(String str) {
            this.target_architecture = str;
            return this;
        }
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.KitEventBase$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<KitEventBase, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.oauth_client_id = this.oauth_client_id;
        builder.locale = this.locale;
        builder.kit_user_agent = this.kit_user_agent;
        builder.ip_address = this.ip_address;
        builder.os_minor_version = this.os_minor_version;
        builder.kit_variant = this.kit_variant;
        builder.kit_variant_version = this.kit_variant_version;
        builder.kit_client_timestamp_millis = this.kit_client_timestamp_millis;
        builder.client_sequence_id = this.client_sequence_id;
        builder.max_client_sequence_id_on_instance = this.max_client_sequence_id_on_instance;
        builder.target_architecture = this.target_architecture;
        builder.running_with_debugger_attached = this.running_with_debugger_attached;
        builder.running_in_tests = this.running_in_tests;
        builder.running_in_simulator = this.running_in_simulator;
        builder.is_app_prerelease = this.is_app_prerelease;
        builder.kit_app_id = this.kit_app_id;
        builder.kit_session_id = this.kit_session_id;
        builder.kit_plugin_type = this.kit_plugin_type;
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
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.hashCode;
        if (i20 != 0) {
            return i20;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.oauth_client_id;
        int i21 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i22 = (hashCode + i2) * 37;
        String str2 = this.locale;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i23 = (i22 + i3) * 37;
        String str3 = this.kit_user_agent;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 37;
        String str4 = this.ip_address;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 37;
        String str5 = this.os_minor_version;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 37;
        KitType kitType = this.kit_variant;
        if (kitType != null) {
            i7 = kitType.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 37;
        String str6 = this.kit_variant_version;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 37;
        Long l2 = this.kit_client_timestamp_millis;
        if (l2 != null) {
            i9 = l2.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 37;
        Long l3 = this.client_sequence_id;
        if (l3 != null) {
            i10 = l3.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 37;
        Long l4 = this.max_client_sequence_id_on_instance;
        if (l4 != null) {
            i11 = l4.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (i30 + i11) * 37;
        String str7 = this.target_architecture;
        if (str7 != null) {
            i12 = str7.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 37;
        Boolean bool = this.running_with_debugger_attached;
        if (bool != null) {
            i13 = bool.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 37;
        Boolean bool2 = this.running_in_tests;
        if (bool2 != null) {
            i14 = bool2.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 37;
        Boolean bool3 = this.running_in_simulator;
        if (bool3 != null) {
            i15 = bool3.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (i34 + i15) * 37;
        Boolean bool4 = this.is_app_prerelease;
        if (bool4 != null) {
            i16 = bool4.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (i35 + i16) * 37;
        String str8 = this.kit_app_id;
        if (str8 != null) {
            i17 = str8.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 37;
        String str9 = this.kit_session_id;
        if (str9 != null) {
            i18 = str9.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 37;
        KitPluginType kitPluginType = this.kit_plugin_type;
        if (kitPluginType != null) {
            i19 = kitPluginType.hashCode();
        } else {
            i19 = 0;
        }
        int i39 = (i38 + i19) * 37;
        Boolean bool5 = this.is_from_react_native_plugin;
        if (bool5 != null) {
            i21 = bool5.hashCode();
        }
        int i40 = i39 + i21;
        this.hashCode = i40;
        return i40;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.oauth_client_id != null) {
            sb.append(", oauth_client_id=").append(this.oauth_client_id);
        }
        if (this.locale != null) {
            sb.append(", locale=").append(this.locale);
        }
        if (this.kit_user_agent != null) {
            sb.append(", kit_user_agent=").append(this.kit_user_agent);
        }
        if (this.ip_address != null) {
            sb.append(", ip_address=").append(this.ip_address);
        }
        if (this.os_minor_version != null) {
            sb.append(", os_minor_version=").append(this.os_minor_version);
        }
        if (this.kit_variant != null) {
            sb.append(", kit_variant=").append(this.kit_variant);
        }
        if (this.kit_variant_version != null) {
            sb.append(", kit_variant_version=").append(this.kit_variant_version);
        }
        if (this.kit_client_timestamp_millis != null) {
            sb.append(", kit_client_timestamp_millis=").append(this.kit_client_timestamp_millis);
        }
        if (this.client_sequence_id != null) {
            sb.append(", client_sequence_id=").append(this.client_sequence_id);
        }
        if (this.max_client_sequence_id_on_instance != null) {
            sb.append(", max_client_sequence_id_on_instance=").append(this.max_client_sequence_id_on_instance);
        }
        if (this.target_architecture != null) {
            sb.append(", target_architecture=").append(this.target_architecture);
        }
        if (this.running_with_debugger_attached != null) {
            sb.append(", running_with_debugger_attached=").append(this.running_with_debugger_attached);
        }
        if (this.running_in_tests != null) {
            sb.append(", running_in_tests=").append(this.running_in_tests);
        }
        if (this.running_in_simulator != null) {
            sb.append(", running_in_simulator=").append(this.running_in_simulator);
        }
        if (this.is_app_prerelease != null) {
            sb.append(", is_app_prerelease=").append(this.is_app_prerelease);
        }
        if (this.kit_app_id != null) {
            sb.append(", kit_app_id=").append(this.kit_app_id);
        }
        if (this.kit_session_id != null) {
            sb.append(", kit_session_id=").append(this.kit_session_id);
        }
        if (this.kit_plugin_type != null) {
            sb.append(", kit_plugin_type=").append(this.kit_plugin_type);
        }
        if (this.is_from_react_native_plugin != null) {
            sb.append(", is_from_react_native_plugin=").append(this.is_from_react_native_plugin);
        }
        return sb.replace(0, 2, "KitEventBase{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KitEventBase)) {
            return false;
        }
        KitEventBase kitEventBase = (KitEventBase) obj;
        if (!unknownFields().equals(kitEventBase.unknownFields()) || !Internal.equals(this.oauth_client_id, kitEventBase.oauth_client_id) || !Internal.equals(this.locale, kitEventBase.locale) || !Internal.equals(this.kit_user_agent, kitEventBase.kit_user_agent) || !Internal.equals(this.ip_address, kitEventBase.ip_address) || !Internal.equals(this.os_minor_version, kitEventBase.os_minor_version) || !Internal.equals(this.kit_variant, kitEventBase.kit_variant) || !Internal.equals(this.kit_variant_version, kitEventBase.kit_variant_version) || !Internal.equals(this.kit_client_timestamp_millis, kitEventBase.kit_client_timestamp_millis) || !Internal.equals(this.client_sequence_id, kitEventBase.client_sequence_id) || !Internal.equals(this.max_client_sequence_id_on_instance, kitEventBase.max_client_sequence_id_on_instance) || !Internal.equals(this.target_architecture, kitEventBase.target_architecture) || !Internal.equals(this.running_with_debugger_attached, kitEventBase.running_with_debugger_attached) || !Internal.equals(this.running_in_tests, kitEventBase.running_in_tests) || !Internal.equals(this.running_in_simulator, kitEventBase.running_in_simulator) || !Internal.equals(this.is_app_prerelease, kitEventBase.is_app_prerelease) || !Internal.equals(this.kit_app_id, kitEventBase.kit_app_id) || !Internal.equals(this.kit_session_id, kitEventBase.kit_session_id) || !Internal.equals(this.kit_plugin_type, kitEventBase.kit_plugin_type) || !Internal.equals(this.is_from_react_native_plugin, kitEventBase.is_from_react_native_plugin)) {
            return false;
        }
        return true;
    }

    public KitEventBase(String str, String str2, String str3, String str4, String str5, KitType kitType, String str6, Long l2, Long l3, Long l4, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str8, String str9, KitPluginType kitPluginType, Boolean bool5) {
        this(str, str2, str3, str4, str5, kitType, str6, l2, l3, l4, str7, bool, bool2, bool3, bool4, str8, str9, kitPluginType, bool5, i.EMPTY);
    }

    public KitEventBase(String str, String str2, String str3, String str4, String str5, KitType kitType, String str6, Long l2, Long l3, Long l4, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str8, String str9, KitPluginType kitPluginType, Boolean bool5, i iVar) {
        super(ADAPTER, iVar);
        this.oauth_client_id = str;
        this.locale = str2;
        this.kit_user_agent = str3;
        this.ip_address = str4;
        this.os_minor_version = str5;
        this.kit_variant = kitType;
        this.kit_variant_version = str6;
        this.kit_client_timestamp_millis = l2;
        this.client_sequence_id = l3;
        this.max_client_sequence_id_on_instance = l4;
        this.target_architecture = str7;
        this.running_with_debugger_attached = bool;
        this.running_in_tests = bool2;
        this.running_in_simulator = bool3;
        this.is_app_prerelease = bool4;
        this.kit_app_id = str8;
        this.kit_session_id = str9;
        this.kit_plugin_type = kitPluginType;
        this.is_from_react_native_plugin = bool5;
    }
}
