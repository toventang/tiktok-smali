package com.bytedance.im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.playerkit.model.v;
import java.util.Map;
import k.i;

public final class Request extends Message<Request, Builder> {
    public static final ProtoAdapter<Request> ADAPTER = new ProtoAdapter_Request();
    public static final AuthType DEFAULT_AUTH_TYPE = AuthType.UNKNOWN_AUTH;
    public static final Integer DEFAULT_CMD = 0;
    public static final Integer DEFAULT_CONFIG_ID = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Refer DEFAULT_REFER = Refer.REFER_NOT_USED;
    public static final Integer DEFAULT_RETRY_COUNT = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "auth_type")
    public final AuthType auth_type;
    @c(a = "body")
    public final RequestBody body;
    @c(a = "build_number")
    public final String build_number;
    @c(a = "channel")
    public final String channel;
    @c(a = "cmd")
    public final Integer cmd;
    @c(a = "config_id")
    public final Integer config_id;
    @c(a = "device_id")
    public final String device_id;
    @c(a = "device_platform")
    public final String device_platform;
    @c(a = "device_type")
    public final String device_type;
    @c(a = "headers")
    public final Map<String, String> headers;
    @c(a = "inbox_type")
    public final Integer inbox_type;
    @c(a = "msg_trace")
    public final MsgTrace msg_trace;
    @c(a = "os_version")
    public final String os_version;
    @c(a = "refer")
    public final Refer refer;
    @c(a = "retry_count")
    public final Integer retry_count;
    @c(a = "sdk_version")
    public final String sdk_version;
    @c(a = "sequence_id")
    public final Long sequence_id;
    @c(a = "token")
    public final String token;
    @c(a = "token_info")
    public final TokenInfo token_info;
    @c(a = "version_code")
    public final String version_code;

    static final class ProtoAdapter_Request extends ProtoAdapter<Request> {
        private final ProtoAdapter<Map<String, String>> headers;

        static {
            Covode.recordClassIndex(23725);
        }

        public ProtoAdapter_Request() {
            super(FieldEncoding.LENGTH_DELIMITED, Request.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.Request$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.Request redact(com.bytedance.im.core.proto.Request r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.Request$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.RequestBody r0 = r2.body
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.RequestBody> r1 = com.bytedance.im.core.proto.RequestBody.ADAPTER
                com.bytedance.im.core.proto.RequestBody r0 = r2.body
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.RequestBody r0 = (com.bytedance.im.core.proto.RequestBody) r0
                r2.body = r0
            L_0x0014:
                com.bytedance.im.core.proto.TokenInfo r0 = r2.token_info
                if (r0 == 0) goto L_0x0024
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.TokenInfo> r1 = com.bytedance.im.core.proto.TokenInfo.ADAPTER
                com.bytedance.im.core.proto.TokenInfo r0 = r2.token_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.TokenInfo r0 = (com.bytedance.im.core.proto.TokenInfo) r0
                r2.token_info = r0
            L_0x0024:
                com.bytedance.im.core.proto.MsgTrace r0 = r2.msg_trace
                if (r0 == 0) goto L_0x0034
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MsgTrace> r1 = com.bytedance.im.core.proto.MsgTrace.ADAPTER
                com.bytedance.im.core.proto.MsgTrace r0 = r2.msg_trace
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MsgTrace r0 = (com.bytedance.im.core.proto.MsgTrace) r0
                r2.msg_trace = r0
            L_0x0034:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.Request r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.Request.ProtoAdapter_Request.redact(com.bytedance.im.core.proto.Request):com.bytedance.im.core.proto.Request");
        }

        public final int encodedSize(Request request) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, request.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, request.sequence_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, request.sdk_version) + ProtoAdapter.STRING.encodedSizeWithTag(4, request.token) + Refer.ADAPTER.encodedSizeWithTag(5, request.refer) + ProtoAdapter.INT32.encodedSizeWithTag(6, request.inbox_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, request.build_number) + RequestBody.ADAPTER.encodedSizeWithTag(8, request.body) + ProtoAdapter.STRING.encodedSizeWithTag(9, request.device_id) + ProtoAdapter.STRING.encodedSizeWithTag(10, request.channel) + ProtoAdapter.STRING.encodedSizeWithTag(11, request.device_platform) + ProtoAdapter.STRING.encodedSizeWithTag(12, request.device_type) + ProtoAdapter.STRING.encodedSizeWithTag(13, request.os_version) + ProtoAdapter.STRING.encodedSizeWithTag(14, request.version_code) + this.headers.encodedSizeWithTag(15, request.headers) + ProtoAdapter.INT32.encodedSizeWithTag(16, request.config_id) + TokenInfo.ADAPTER.encodedSizeWithTag(17, request.token_info) + AuthType.ADAPTER.encodedSizeWithTag(18, request.auth_type) + MsgTrace.ADAPTER.encodedSizeWithTag(19, request.msg_trace) + ProtoAdapter.INT32.encodedSizeWithTag(20, request.retry_count) + request.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Request decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cmd(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sequence_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.sdk_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.token(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            try {
                                builder.refer(Refer.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.build_number(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.body(RequestBody.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.device_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.channel(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.device_platform(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.device_type(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.os_version(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            builder.version_code(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.headers.putAll(this.headers.decode(protoReader));
                            break;
                        case 16:
                            builder.config_id(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.token_info(TokenInfo.ADAPTER.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            try {
                                builder.auth_type(AuthType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 19:
                            builder.msg_trace(MsgTrace.ADAPTER.decode(protoReader));
                            break;
                        case v.U /*{ENCODED_INT: 20}*/:
                            builder.retry_count(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, Request request) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, request.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, request.sequence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, request.sdk_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, request.token);
            Refer.ADAPTER.encodeWithTag(protoWriter, 5, request.refer);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, request.inbox_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, request.build_number);
            RequestBody.ADAPTER.encodeWithTag(protoWriter, 8, request.body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, request.device_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, request.channel);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, request.device_platform);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, request.device_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, request.os_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, request.version_code);
            this.headers.encodeWithTag(protoWriter, 15, request.headers);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, request.config_id);
            TokenInfo.ADAPTER.encodeWithTag(protoWriter, 17, request.token_info);
            AuthType.ADAPTER.encodeWithTag(protoWriter, 18, request.auth_type);
            MsgTrace.ADAPTER.encodeWithTag(protoWriter, 19, request.msg_trace);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, request.retry_count);
            protoWriter.writeBytes(request.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "Request" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23723);
    }

    public static final class Builder extends Message.Builder<Request, Builder> {
        public AuthType auth_type;
        public RequestBody body;
        public String build_number;
        public String channel;
        public Integer cmd;
        public Integer config_id;
        public String device_id;
        public String device_platform;
        public String device_type;
        public Map<String, String> headers = Internal.newMutableMap();
        public Integer inbox_type;
        public MsgTrace msg_trace;
        public String os_version;
        public Refer refer;
        public Integer retry_count;
        public String sdk_version;
        public Long sequence_id;
        public String token;
        public TokenInfo token_info;
        public String version_code;

        static {
            Covode.recordClassIndex(23724);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Request build() {
            return new Request(this.cmd, this.sequence_id, this.sdk_version, this.token, this.refer, this.inbox_type, this.build_number, this.body, this.device_id, this.channel, this.device_platform, this.device_type, this.os_version, this.version_code, this.headers, this.config_id, this.token_info, this.auth_type, this.msg_trace, this.retry_count, super.buildUnknownFields());
        }

        public final Builder auth_type(AuthType authType) {
            this.auth_type = authType;
            return this;
        }

        public final Builder body(RequestBody requestBody) {
            this.body = requestBody;
            return this;
        }

        public final Builder build_number(String str) {
            this.build_number = str;
            return this;
        }

        public final Builder channel(String str) {
            this.channel = str;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder config_id(Integer num) {
            this.config_id = num;
            return this;
        }

        public final Builder device_id(String str) {
            this.device_id = str;
            return this;
        }

        public final Builder device_platform(String str) {
            this.device_platform = str;
            return this;
        }

        public final Builder device_type(String str) {
            this.device_type = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder msg_trace(MsgTrace msgTrace) {
            this.msg_trace = msgTrace;
            return this;
        }

        public final Builder os_version(String str) {
            this.os_version = str;
            return this;
        }

        public final Builder refer(Refer refer2) {
            this.refer = refer2;
            return this;
        }

        public final Builder retry_count(Integer num) {
            this.retry_count = num;
            return this;
        }

        public final Builder sdk_version(String str) {
            this.sdk_version = str;
            return this;
        }

        public final Builder sequence_id(Long l2) {
            this.sequence_id = l2;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }

        public final Builder token_info(TokenInfo tokenInfo) {
            this.token_info = tokenInfo;
            return this;
        }

        public final Builder version_code(String str) {
            this.version_code = str;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.Request$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Request, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cmd = this.cmd;
        builder.sequence_id = this.sequence_id;
        builder.sdk_version = this.sdk_version;
        builder.token = this.token;
        builder.refer = this.refer;
        builder.inbox_type = this.inbox_type;
        builder.build_number = this.build_number;
        builder.body = this.body;
        builder.device_id = this.device_id;
        builder.channel = this.channel;
        builder.device_platform = this.device_platform;
        builder.device_type = this.device_type;
        builder.os_version = this.os_version;
        builder.version_code = this.version_code;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.config_id = this.config_id;
        builder.token_info = this.token_info;
        builder.auth_type = this.auth_type;
        builder.msg_trace = this.msg_trace;
        builder.retry_count = this.retry_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public Request(Integer num, Long l2, String str, String str2, Refer refer2, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, AuthType authType, MsgTrace msgTrace, Integer num4) {
        this(num, l2, str, str2, refer2, num2, str3, requestBody, str4, str5, str6, str7, str8, str9, map, num3, tokenInfo, authType, msgTrace, num4, i.EMPTY);
    }

    public Request(Integer num, Long l2, String str, String str2, Refer refer2, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, AuthType authType, MsgTrace msgTrace, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.cmd = num;
        this.sequence_id = l2;
        this.sdk_version = str;
        this.token = str2;
        this.refer = refer2;
        this.inbox_type = num2;
        this.build_number = str3;
        this.body = requestBody;
        this.device_id = str4;
        this.channel = str5;
        this.device_platform = str6;
        this.device_type = str7;
        this.os_version = str8;
        this.version_code = str9;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.config_id = num3;
        this.token_info = tokenInfo;
        this.auth_type = authType;
        this.msg_trace = msgTrace;
        this.retry_count = num4;
    }
}
