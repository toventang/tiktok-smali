package com.ss.ugc.live.sdk.msg.data;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.Map;
import k.i;

public final class SdkUplinkPacket extends AndroidMessage<SdkUplinkPacket, Builder> {
    public static final ProtoAdapter<SdkUplinkPacket> ADAPTER;
    public static final Parcelable.Creator<SdkUplinkPacket> CREATOR;
    public static final i DEFAULT_PAYLOAD = i.EMPTY;
    public static final Long DEFAULT_SERVICEID = 0L;
    public static final Integer DEFAULT_STATUSCODE = 0;
    public static final Long DEFAULT_UNIQUEID = 0L;
    public static final Integer DEFAULT_UPLINKSTRATEGY = 0;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> headers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public final i payload;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> queryParams;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long serviceID;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public final Integer statusCode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public final String statusMessage;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long uniqueID;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public final Integer uplinkStrategy;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public final String uri;

    public static final class Builder extends Message.Builder<SdkUplinkPacket, Builder> {
        public Map<String, String> headers = Internal.newMutableMap();
        public i payload = i.EMPTY;
        public Map<String, String> queryParams = Internal.newMutableMap();
        public Long serviceID = 0L;
        public Integer statusCode = 0;
        public String statusMessage = "";
        public Long uniqueID = 0L;
        public Integer uplinkStrategy = 0;
        public String uri = "";

        static {
            Covode.recordClassIndex(102832);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SdkUplinkPacket build() {
            return new SdkUplinkPacket(this.uniqueID, this.serviceID, this.queryParams, this.headers, this.uri, this.payload, this.statusCode, this.statusMessage, this.uplinkStrategy, super.buildUnknownFields());
        }

        public final Builder payload(i iVar) {
            this.payload = iVar;
            return this;
        }

        public final Builder serviceID(Long l2) {
            this.serviceID = l2;
            return this;
        }

        public final Builder statusCode(Integer num) {
            this.statusCode = num;
            return this;
        }

        public final Builder statusMessage(String str) {
            this.statusMessage = str;
            return this;
        }

        public final Builder uniqueID(Long l2) {
            this.uniqueID = l2;
            return this;
        }

        public final Builder uplinkStrategy(Integer num) {
            this.uplinkStrategy = num;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }

        public final Builder queryParams(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.queryParams = map;
            return this;
        }
    }

    static final class ProtoAdapter_SdkUplinkPacket extends ProtoAdapter<SdkUplinkPacket> {
        private final ProtoAdapter<Map<String, String>> headers;
        private final ProtoAdapter<Map<String, String>> queryParams;

        static {
            Covode.recordClassIndex(102833);
        }

        public ProtoAdapter_SdkUplinkPacket() {
            super(FieldEncoding.LENGTH_DELIMITED, SdkUplinkPacket.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.queryParams = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        public final SdkUplinkPacket redact(SdkUplinkPacket sdkUplinkPacket) {
            Builder newBuilder = sdkUplinkPacket.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SdkUplinkPacket sdkUplinkPacket) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, sdkUplinkPacket.uniqueID) + ProtoAdapter.INT64.encodedSizeWithTag(2, sdkUplinkPacket.serviceID) + this.queryParams.encodedSizeWithTag(3, sdkUplinkPacket.queryParams) + this.headers.encodedSizeWithTag(4, sdkUplinkPacket.headers) + ProtoAdapter.STRING.encodedSizeWithTag(5, sdkUplinkPacket.uri) + ProtoAdapter.BYTES.encodedSizeWithTag(6, sdkUplinkPacket.payload) + ProtoAdapter.INT32.encodedSizeWithTag(7, sdkUplinkPacket.statusCode) + ProtoAdapter.STRING.encodedSizeWithTag(8, sdkUplinkPacket.statusMessage) + ProtoAdapter.INT32.encodedSizeWithTag(9, sdkUplinkPacket.uplinkStrategy) + sdkUplinkPacket.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SdkUplinkPacket decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uniqueID(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.serviceID(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.queryParams.putAll(this.queryParams.decode(protoReader));
                            break;
                        case 4:
                            builder.headers.putAll(this.headers.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.payload(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.statusCode(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.statusMessage(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.uplinkStrategy(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SdkUplinkPacket sdkUplinkPacket) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sdkUplinkPacket.uniqueID);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, sdkUplinkPacket.serviceID);
            this.queryParams.encodeWithTag(protoWriter, 3, sdkUplinkPacket.queryParams);
            this.headers.encodeWithTag(protoWriter, 4, sdkUplinkPacket.headers);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, sdkUplinkPacket.uri);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, sdkUplinkPacket.payload);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, sdkUplinkPacket.statusCode);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sdkUplinkPacket.statusMessage);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, sdkUplinkPacket.uplinkStrategy);
            protoWriter.writeBytes(sdkUplinkPacket.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102831);
        ProtoAdapter_SdkUplinkPacket protoAdapter_SdkUplinkPacket = new ProtoAdapter_SdkUplinkPacket();
        ADAPTER = protoAdapter_SdkUplinkPacket;
        CREATOR = AndroidMessage.newCreator(protoAdapter_SdkUplinkPacket);
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uniqueID = this.uniqueID;
        builder.serviceID = this.serviceID;
        builder.queryParams = Internal.copyOf("queryParams", this.queryParams);
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.uri = this.uri;
        builder.payload = this.payload;
        builder.statusCode = this.statusCode;
        builder.statusMessage = this.statusMessage;
        builder.uplinkStrategy = this.uplinkStrategy;
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
        int i8 = ((AndroidMessage) this).hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.uniqueID;
        int i9 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 37;
        Long l3 = this.serviceID;
        if (l3 != null) {
            i3 = l3.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((((i10 + i3) * 37) + this.queryParams.hashCode()) * 37) + this.headers.hashCode()) * 37;
        String str = this.uri;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (hashCode2 + i4) * 37;
        i iVar = this.payload;
        if (iVar != null) {
            i5 = iVar.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        Integer num = this.statusCode;
        if (num != null) {
            i6 = num.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        String str2 = this.statusMessage;
        if (str2 != null) {
            i7 = str2.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 37;
        Integer num2 = this.uplinkStrategy;
        if (num2 != null) {
            i9 = num2.hashCode();
        }
        int i15 = i14 + i9;
        ((AndroidMessage) this).hashCode = i15;
        return i15;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uniqueID != null) {
            sb.append(", uniqueID=").append(this.uniqueID);
        }
        if (this.serviceID != null) {
            sb.append(", serviceID=").append(this.serviceID);
        }
        Map<String, String> map = this.queryParams;
        if (map != null && !map.isEmpty()) {
            sb.append(", queryParams=").append(this.queryParams);
        }
        Map<String, String> map2 = this.headers;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", headers=").append(this.headers);
        }
        if (this.uri != null) {
            sb.append(", uri=").append(this.uri);
        }
        if (this.statusCode != null) {
            sb.append(", statusCode=").append(this.statusCode);
        }
        if (this.statusMessage != null) {
            sb.append(", statusMessage=").append(this.statusMessage);
        }
        if (this.uplinkStrategy != null) {
            sb.append(", uplinkStrategy=").append(this.uplinkStrategy);
        }
        return sb.replace(0, 2, "SdkUplinkPacket{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkUplinkPacket)) {
            return false;
        }
        SdkUplinkPacket sdkUplinkPacket = (SdkUplinkPacket) obj;
        if (!unknownFields().equals(sdkUplinkPacket.unknownFields()) || !Internal.equals(this.uniqueID, sdkUplinkPacket.uniqueID) || !Internal.equals(this.serviceID, sdkUplinkPacket.serviceID) || !this.queryParams.equals(sdkUplinkPacket.queryParams) || !this.headers.equals(sdkUplinkPacket.headers) || !Internal.equals(this.uri, sdkUplinkPacket.uri) || !Internal.equals(this.payload, sdkUplinkPacket.payload) || !Internal.equals(this.statusCode, sdkUplinkPacket.statusCode) || !Internal.equals(this.statusMessage, sdkUplinkPacket.statusMessage) || !Internal.equals(this.uplinkStrategy, sdkUplinkPacket.uplinkStrategy)) {
            return false;
        }
        return true;
    }

    public SdkUplinkPacket(Long l2, Long l3, Map<String, String> map, Map<String, String> map2, String str, i iVar, Integer num, String str2, Integer num2) {
        this(l2, l3, map, map2, str, iVar, num, str2, num2, i.EMPTY);
    }

    public SdkUplinkPacket(Long l2, Long l3, Map<String, String> map, Map<String, String> map2, String str, i iVar, Integer num, String str2, Integer num2, i iVar2) {
        super(ADAPTER, iVar2);
        this.uniqueID = l2;
        this.serviceID = l3;
        this.queryParams = Internal.immutableCopyOf("queryParams", map);
        this.headers = Internal.immutableCopyOf("headers", map2);
        this.uri = str;
        this.payload = iVar;
        this.statusCode = num;
        this.statusMessage = str2;
        this.uplinkStrategy = num2;
    }
}
