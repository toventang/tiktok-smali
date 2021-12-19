package com.snap.kit.common.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.snap.kit.common.model.OsType;
import com.snap.kit.common.model.Types;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class DeviceEnvironmentInfo extends Message<DeviceEnvironmentInfo, Builder> {
    public static final ProtoAdapter<DeviceEnvironmentInfo> ADAPTER = new ProtoAdapter_DeviceEnvironmentInfo();
    public static final Types.Trilean DEFAULT_IS_APP_PRERELEASE = Types.Trilean.NONE;
    public static final OsType.Enum DEFAULT_OS_TYPE = OsType.Enum.NONE;
    public static final Types.Trilean DEFAULT_RUNNING_IN_SIMULATOR = Types.Trilean.NONE;
    public static final Types.Trilean DEFAULT_RUNNING_IN_TESTS = Types.Trilean.NONE;
    public static final Types.Trilean DEFAULT_RUNNING_WITH_DEBUGGER_ATTACHED = Types.Trilean.NONE;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snap.kit.common.model.Types$Trilean#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final Types.Trilean is_app_prerelease;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String locale;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String model;
    @WireField(adapter = "com.snap.kit.common.model.OsType$Enum#ADAPTER", tag = 1)
    public final OsType.Enum os_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String os_version;
    @WireField(adapter = "com.snap.kit.common.model.Types$Trilean#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final Types.Trilean running_in_simulator;
    @WireField(adapter = "com.snap.kit.common.model.Types$Trilean#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final Types.Trilean running_in_tests;
    @WireField(adapter = "com.snap.kit.common.model.Types$Trilean#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final Types.Trilean running_with_debugger_attached;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String target_architecture;

    static final class ProtoAdapter_DeviceEnvironmentInfo extends ProtoAdapter<DeviceEnvironmentInfo> {
        static {
            Covode.recordClassIndex(35517);
        }

        public ProtoAdapter_DeviceEnvironmentInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, DeviceEnvironmentInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snap.kit.common.model.DeviceEnvironmentInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.common.model.DeviceEnvironmentInfo redact(com.snap.kit.common.model.DeviceEnvironmentInfo r2) {
            /*
                r1 = this;
                com.snap.kit.common.model.DeviceEnvironmentInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snap.kit.common.model.DeviceEnvironmentInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.common.model.DeviceEnvironmentInfo.ProtoAdapter_DeviceEnvironmentInfo.redact(com.snap.kit.common.model.DeviceEnvironmentInfo):com.snap.kit.common.model.DeviceEnvironmentInfo");
        }

        public final int encodedSize(DeviceEnvironmentInfo deviceEnvironmentInfo) {
            return OsType.Enum.ADAPTER.encodedSizeWithTag(1, deviceEnvironmentInfo.os_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, deviceEnvironmentInfo.os_version) + ProtoAdapter.STRING.encodedSizeWithTag(3, deviceEnvironmentInfo.model) + ProtoAdapter.STRING.encodedSizeWithTag(4, deviceEnvironmentInfo.target_architecture) + ProtoAdapter.STRING.encodedSizeWithTag(5, deviceEnvironmentInfo.locale) + Types.Trilean.ADAPTER.encodedSizeWithTag(6, deviceEnvironmentInfo.running_with_debugger_attached) + Types.Trilean.ADAPTER.encodedSizeWithTag(7, deviceEnvironmentInfo.running_in_tests) + Types.Trilean.ADAPTER.encodedSizeWithTag(8, deviceEnvironmentInfo.running_in_simulator) + Types.Trilean.ADAPTER.encodedSizeWithTag(9, deviceEnvironmentInfo.is_app_prerelease) + deviceEnvironmentInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeviceEnvironmentInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.os_type(OsType.Enum.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 2:
                            builder.os_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.model(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.target_architecture(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.locale(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            try {
                                builder.running_with_debugger_attached(Types.Trilean.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            try {
                                builder.running_in_tests(Types.Trilean.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            try {
                                builder.running_in_simulator(Types.Trilean.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            try {
                                builder.is_app_prerelease(Types.Trilean.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, DeviceEnvironmentInfo deviceEnvironmentInfo) {
            OsType.Enum.ADAPTER.encodeWithTag(protoWriter, 1, deviceEnvironmentInfo.os_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deviceEnvironmentInfo.os_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, deviceEnvironmentInfo.model);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, deviceEnvironmentInfo.target_architecture);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, deviceEnvironmentInfo.locale);
            Types.Trilean.ADAPTER.encodeWithTag(protoWriter, 6, deviceEnvironmentInfo.running_with_debugger_attached);
            Types.Trilean.ADAPTER.encodeWithTag(protoWriter, 7, deviceEnvironmentInfo.running_in_tests);
            Types.Trilean.ADAPTER.encodeWithTag(protoWriter, 8, deviceEnvironmentInfo.running_in_simulator);
            Types.Trilean.ADAPTER.encodeWithTag(protoWriter, 9, deviceEnvironmentInfo.is_app_prerelease);
            protoWriter.writeBytes(deviceEnvironmentInfo.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DeviceEnvironmentInfo, Builder> {
        public Types.Trilean is_app_prerelease;
        public String locale;
        public String model;
        public OsType.Enum os_type;
        public String os_version;
        public Types.Trilean running_in_simulator;
        public Types.Trilean running_in_tests;
        public Types.Trilean running_with_debugger_attached;
        public String target_architecture;

        static {
            Covode.recordClassIndex(35516);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DeviceEnvironmentInfo build() {
            return new DeviceEnvironmentInfo(this.os_type, this.os_version, this.model, this.target_architecture, this.locale, this.running_with_debugger_attached, this.running_in_tests, this.running_in_simulator, this.is_app_prerelease, super.buildUnknownFields());
        }

        public final Builder is_app_prerelease(Types.Trilean trilean) {
            this.is_app_prerelease = trilean;
            return this;
        }

        public final Builder locale(String str) {
            this.locale = str;
            return this;
        }

        public final Builder model(String str) {
            this.model = str;
            return this;
        }

        public final Builder os_type(OsType.Enum r1) {
            this.os_type = r1;
            return this;
        }

        public final Builder os_version(String str) {
            this.os_version = str;
            return this;
        }

        public final Builder running_in_simulator(Types.Trilean trilean) {
            this.running_in_simulator = trilean;
            return this;
        }

        public final Builder running_in_tests(Types.Trilean trilean) {
            this.running_in_tests = trilean;
            return this;
        }

        public final Builder running_with_debugger_attached(Types.Trilean trilean) {
            this.running_with_debugger_attached = trilean;
            return this;
        }

        public final Builder target_architecture(String str) {
            this.target_architecture = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35515);
    }

    /* Return type fixed from 'com.snap.kit.common.model.DeviceEnvironmentInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DeviceEnvironmentInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.os_type = this.os_type;
        builder.os_version = this.os_version;
        builder.model = this.model;
        builder.target_architecture = this.target_architecture;
        builder.locale = this.locale;
        builder.running_with_debugger_attached = this.running_with_debugger_attached;
        builder.running_in_tests = this.running_in_tests;
        builder.running_in_simulator = this.running_in_simulator;
        builder.is_app_prerelease = this.is_app_prerelease;
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
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OsType.Enum r0 = this.os_type;
        int i11 = 0;
        if (r0 != null) {
            i2 = r0.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (hashCode + i2) * 37;
        String str = this.os_version;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        String str2 = this.model;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        String str3 = this.target_architecture;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        String str4 = this.locale;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        Types.Trilean trilean = this.running_with_debugger_attached;
        if (trilean != null) {
            i7 = trilean.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        Types.Trilean trilean2 = this.running_in_tests;
        if (trilean2 != null) {
            i8 = trilean2.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        Types.Trilean trilean3 = this.running_in_simulator;
        if (trilean3 != null) {
            i9 = trilean3.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 37;
        Types.Trilean trilean4 = this.is_app_prerelease;
        if (trilean4 != null) {
            i11 = trilean4.hashCode();
        }
        int i20 = i19 + i11;
        this.hashCode = i20;
        return i20;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.os_type != null) {
            sb.append(", os_type=").append(this.os_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=").append(this.os_version);
        }
        if (this.model != null) {
            sb.append(", model=").append(this.model);
        }
        if (this.target_architecture != null) {
            sb.append(", target_architecture=").append(this.target_architecture);
        }
        if (this.locale != null) {
            sb.append(", locale=").append(this.locale);
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
        return sb.replace(0, 2, "DeviceEnvironmentInfo{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceEnvironmentInfo)) {
            return false;
        }
        DeviceEnvironmentInfo deviceEnvironmentInfo = (DeviceEnvironmentInfo) obj;
        if (!unknownFields().equals(deviceEnvironmentInfo.unknownFields()) || !Internal.equals(this.os_type, deviceEnvironmentInfo.os_type) || !Internal.equals(this.os_version, deviceEnvironmentInfo.os_version) || !Internal.equals(this.model, deviceEnvironmentInfo.model) || !Internal.equals(this.target_architecture, deviceEnvironmentInfo.target_architecture) || !Internal.equals(this.locale, deviceEnvironmentInfo.locale) || !Internal.equals(this.running_with_debugger_attached, deviceEnvironmentInfo.running_with_debugger_attached) || !Internal.equals(this.running_in_tests, deviceEnvironmentInfo.running_in_tests) || !Internal.equals(this.running_in_simulator, deviceEnvironmentInfo.running_in_simulator) || !Internal.equals(this.is_app_prerelease, deviceEnvironmentInfo.is_app_prerelease)) {
            return false;
        }
        return true;
    }

    public DeviceEnvironmentInfo(OsType.Enum r12, String str, String str2, String str3, String str4, Types.Trilean trilean, Types.Trilean trilean2, Types.Trilean trilean3, Types.Trilean trilean4) {
        this(r12, str, str2, str3, str4, trilean, trilean2, trilean3, trilean4, i.EMPTY);
    }

    public DeviceEnvironmentInfo(OsType.Enum r2, String str, String str2, String str3, String str4, Types.Trilean trilean, Types.Trilean trilean2, Types.Trilean trilean3, Types.Trilean trilean4, i iVar) {
        super(ADAPTER, iVar);
        this.os_type = r2;
        this.os_version = str;
        this.model = str2;
        this.target_architecture = str3;
        this.locale = str4;
        this.running_with_debugger_attached = trilean;
        this.running_in_tests = trilean2;
        this.running_in_simulator = trilean3;
        this.is_app_prerelease = trilean4;
    }
}
