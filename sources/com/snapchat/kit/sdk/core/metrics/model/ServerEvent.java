package com.snapchat.kit.sdk.core.metrics.model;

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

public final class ServerEvent extends Message<ServerEvent, Builder> {
    public static final ProtoAdapter<ServerEvent> ADAPTER = new ProtoAdapter_ServerEvent();
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final Double DEFAULT_SERVER_TS = Double.valueOf(0.0d);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String app_build;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SELECT_SCENE)
    public final String app_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final String country;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.ServerEventData#ADAPTER", tag = a.f41622a)
    public final ServerEventData event_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final String event_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String event_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public final String instance_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public final String os_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public final String os_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final String region;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String request_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public final Long sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public final Double server_ts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String user_agent;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String user_id;

    static final class ProtoAdapter_ServerEvent extends ProtoAdapter<ServerEvent> {
        static {
            Covode.recordClassIndex(35734);
        }

        public ProtoAdapter_ServerEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, ServerEvent.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.ServerEvent redact(com.snapchat.kit.sdk.core.metrics.model.ServerEvent r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.ServerEventData r0 = r2.event_data
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.ServerEventData> r1 = com.snapchat.kit.sdk.core.metrics.model.ServerEventData.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.ServerEventData r0 = r2.event_data
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.ServerEventData r0 = (com.snapchat.kit.sdk.core.metrics.model.ServerEventData) r0
                r2.event_data = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.ServerEvent r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.ServerEvent.ProtoAdapter_ServerEvent.redact(com.snapchat.kit.sdk.core.metrics.model.ServerEvent):com.snapchat.kit.sdk.core.metrics.model.ServerEvent");
        }

        public final int encodedSize(ServerEvent serverEvent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, serverEvent.event_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, serverEvent.request_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, serverEvent.server_ts) + ProtoAdapter.STRING.encodedSizeWithTag(4, serverEvent.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, serverEvent.user_agent) + ProtoAdapter.STRING.encodedSizeWithTag(6, serverEvent.country) + ProtoAdapter.STRING.encodedSizeWithTag(7, serverEvent.city) + ProtoAdapter.STRING.encodedSizeWithTag(8, serverEvent.region) + ProtoAdapter.STRING.encodedSizeWithTag(9, serverEvent.event_id) + ProtoAdapter.STRING.encodedSizeWithTag(10, serverEvent.instance_id) + ProtoAdapter.UINT64.encodedSizeWithTag(11, serverEvent.sequence_id) + ProtoAdapter.STRING.encodedSizeWithTag(12, serverEvent.os_type) + ProtoAdapter.STRING.encodedSizeWithTag(13, serverEvent.os_version) + ProtoAdapter.STRING.encodedSizeWithTag(14, serverEvent.app_version) + ProtoAdapter.STRING.encodedSizeWithTag(15, serverEvent.app_build) + ServerEventData.ADAPTER.encodedSizeWithTag(100, serverEvent.event_data) + serverEvent.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ServerEvent decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            builder.event_name(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 2:
                            builder.request_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 3:
                            builder.server_ts(ProtoAdapter.DOUBLE.decode(protoReader));
                            continue;
                        case 4:
                            builder.user_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.user_agent(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.country(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.city(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.region(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.event_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.instance_id(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.sequence_id(ProtoAdapter.UINT64.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.os_type(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.os_version(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.app_version(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 15:
                            builder.app_build(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    builder.event_data(ServerEventData.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ServerEvent serverEvent) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serverEvent.event_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, serverEvent.request_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, serverEvent.server_ts);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, serverEvent.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, serverEvent.user_agent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, serverEvent.country);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, serverEvent.city);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, serverEvent.region);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, serverEvent.event_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, serverEvent.instance_id);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 11, serverEvent.sequence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, serverEvent.os_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, serverEvent.os_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, serverEvent.app_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, serverEvent.app_build);
            ServerEventData.ADAPTER.encodeWithTag(protoWriter, 100, serverEvent.event_data);
            protoWriter.writeBytes(serverEvent.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35732);
    }

    public static final class Builder extends Message.Builder<ServerEvent, Builder> {
        public String app_build;
        public String app_version;
        public String city;
        public String country;
        public ServerEventData event_data;
        public String event_id;
        public String event_name;
        public String instance_id;
        public String os_type;
        public String os_version;
        public String region;
        public String request_id;
        public Long sequence_id;
        public Double server_ts;
        public String user_agent;
        public String user_id;

        static {
            Covode.recordClassIndex(35733);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ServerEvent build() {
            return new ServerEvent(this.event_name, this.request_id, this.server_ts, this.user_id, this.user_agent, this.country, this.city, this.region, this.event_id, this.instance_id, this.sequence_id, this.os_type, this.os_version, this.app_version, this.app_build, this.event_data, super.buildUnknownFields());
        }

        public final Builder app_build(String str) {
            this.app_build = str;
            return this;
        }

        public final Builder app_version(String str) {
            this.app_version = str;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder country(String str) {
            this.country = str;
            return this;
        }

        public final Builder event_data(ServerEventData serverEventData) {
            this.event_data = serverEventData;
            return this;
        }

        public final Builder event_id(String str) {
            this.event_id = str;
            return this;
        }

        public final Builder event_name(String str) {
            this.event_name = str;
            return this;
        }

        public final Builder instance_id(String str) {
            this.instance_id = str;
            return this;
        }

        public final Builder os_type(String str) {
            this.os_type = str;
            return this;
        }

        public final Builder os_version(String str) {
            this.os_version = str;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder request_id(String str) {
            this.request_id = str;
            return this;
        }

        public final Builder sequence_id(Long l2) {
            this.sequence_id = l2;
            return this;
        }

        public final Builder server_ts(Double d2) {
            this.server_ts = d2;
            return this;
        }

        public final Builder user_agent(String str) {
            this.user_agent = str;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.ServerEvent$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ServerEvent, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.event_name = this.event_name;
        builder.request_id = this.request_id;
        builder.server_ts = this.server_ts;
        builder.user_id = this.user_id;
        builder.user_agent = this.user_agent;
        builder.country = this.country;
        builder.city = this.city;
        builder.region = this.region;
        builder.event_id = this.event_id;
        builder.instance_id = this.instance_id;
        builder.sequence_id = this.sequence_id;
        builder.os_type = this.os_type;
        builder.os_version = this.os_version;
        builder.app_version = this.app_version;
        builder.app_build = this.app_build;
        builder.event_data = this.event_data;
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
        String str = this.event_name;
        int i18 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (hashCode + i2) * 37;
        String str2 = this.request_id;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 37;
        Double d2 = this.server_ts;
        if (d2 != null) {
            i4 = d2.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 37;
        String str3 = this.user_id;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        String str4 = this.user_agent;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        String str5 = this.country;
        if (str5 != null) {
            i7 = str5.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        String str6 = this.city;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        String str7 = this.region;
        if (str7 != null) {
            i9 = str7.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        String str8 = this.event_id;
        if (str8 != null) {
            i10 = str8.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        String str9 = this.instance_id;
        if (str9 != null) {
            i11 = str9.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        Long l2 = this.sequence_id;
        if (l2 != null) {
            i12 = l2.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 37;
        String str10 = this.os_type;
        if (str10 != null) {
            i13 = str10.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 37;
        String str11 = this.os_version;
        if (str11 != null) {
            i14 = str11.hashCode();
        } else {
            i14 = 0;
        }
        int i31 = (i30 + i14) * 37;
        String str12 = this.app_version;
        if (str12 != null) {
            i15 = str12.hashCode();
        } else {
            i15 = 0;
        }
        int i32 = (i31 + i15) * 37;
        String str13 = this.app_build;
        if (str13 != null) {
            i16 = str13.hashCode();
        } else {
            i16 = 0;
        }
        int i33 = (i32 + i16) * 37;
        ServerEventData serverEventData = this.event_data;
        if (serverEventData != null) {
            i18 = serverEventData.hashCode();
        }
        int i34 = i33 + i18;
        this.hashCode = i34;
        return i34;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.event_name != null) {
            sb.append(", event_name=").append(this.event_name);
        }
        if (this.request_id != null) {
            sb.append(", request_id=").append(this.request_id);
        }
        if (this.server_ts != null) {
            sb.append(", server_ts=").append(this.server_ts);
        }
        if (this.user_id != null) {
            sb.append(", user_id=").append(this.user_id);
        }
        if (this.user_agent != null) {
            sb.append(", user_agent=").append(this.user_agent);
        }
        if (this.country != null) {
            sb.append(", country=").append(this.country);
        }
        if (this.city != null) {
            sb.append(", city=").append(this.city);
        }
        if (this.region != null) {
            sb.append(", region=").append(this.region);
        }
        if (this.event_id != null) {
            sb.append(", event_id=").append(this.event_id);
        }
        if (this.instance_id != null) {
            sb.append(", instance_id=").append(this.instance_id);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=").append(this.sequence_id);
        }
        if (this.os_type != null) {
            sb.append(", os_type=").append(this.os_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=").append(this.os_version);
        }
        if (this.app_version != null) {
            sb.append(", app_version=").append(this.app_version);
        }
        if (this.app_build != null) {
            sb.append(", app_build=").append(this.app_build);
        }
        if (this.event_data != null) {
            sb.append(", event_data=").append(this.event_data);
        }
        return sb.replace(0, 2, "ServerEvent{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEvent)) {
            return false;
        }
        ServerEvent serverEvent = (ServerEvent) obj;
        if (!unknownFields().equals(serverEvent.unknownFields()) || !Internal.equals(this.event_name, serverEvent.event_name) || !Internal.equals(this.request_id, serverEvent.request_id) || !Internal.equals(this.server_ts, serverEvent.server_ts) || !Internal.equals(this.user_id, serverEvent.user_id) || !Internal.equals(this.user_agent, serverEvent.user_agent) || !Internal.equals(this.country, serverEvent.country) || !Internal.equals(this.city, serverEvent.city) || !Internal.equals(this.region, serverEvent.region) || !Internal.equals(this.event_id, serverEvent.event_id) || !Internal.equals(this.instance_id, serverEvent.instance_id) || !Internal.equals(this.sequence_id, serverEvent.sequence_id) || !Internal.equals(this.os_type, serverEvent.os_type) || !Internal.equals(this.os_version, serverEvent.os_version) || !Internal.equals(this.app_version, serverEvent.app_version) || !Internal.equals(this.app_build, serverEvent.app_build) || !Internal.equals(this.event_data, serverEvent.event_data)) {
            return false;
        }
        return true;
    }

    public ServerEvent(String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l2, String str10, String str11, String str12, String str13, ServerEventData serverEventData) {
        this(str, str2, d2, str3, str4, str5, str6, str7, str8, str9, l2, str10, str11, str12, str13, serverEventData, i.EMPTY);
    }

    public ServerEvent(String str, String str2, Double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l2, String str10, String str11, String str12, String str13, ServerEventData serverEventData, i iVar) {
        super(ADAPTER, iVar);
        this.event_name = str;
        this.request_id = str2;
        this.server_ts = d2;
        this.user_id = str3;
        this.user_agent = str4;
        this.country = str5;
        this.city = str6;
        this.region = str7;
        this.event_id = str8;
        this.instance_id = str9;
        this.sequence_id = l2;
        this.os_type = str10;
        this.os_version = str11;
        this.app_version = str12;
        this.app_build = str13;
        this.event_data = serverEventData;
    }
}
