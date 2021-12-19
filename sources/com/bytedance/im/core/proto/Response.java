package com.bytedance.im.core.proto;

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
import java.util.Map;
import k.i;

public final class Response extends Message<Response, Builder> {
    public static final ProtoAdapter<Response> ADAPTER = new ProtoAdapter_Response();
    public static final Integer DEFAULT_CMD = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_REQUEST_ARRIVED_TIME = 0L;
    public static final Integer DEFAULT_RETRY_COUNT = 0;
    public static final Long DEFAULT_SEQUENCE_ID = 0L;
    public static final Long DEFAULT_SERVER_EXECUTION_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final Integer DEFAULT_STATUS_CODE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "body")
    public final ResponseBody body;
    @c(a = "cmd")
    public final Integer cmd;
    @c(a = "error_desc")
    public final String error_desc;
    @c(a = "headers")
    public final Map<String, String> headers;
    @c(a = "inbox_type")
    public final Integer inbox_type;
    @c(a = "log_id")
    public final String log_id;
    @c(a = "request_arrived_time")
    public final Long request_arrived_time;
    @c(a = "retry_count")
    public final Integer retry_count;
    @c(a = "sequence_id")
    public final Long sequence_id;
    @c(a = "server_execution_end_time")
    public final Long server_execution_end_time;
    @c(a = "start_time_stamp")
    public final Long start_time_stamp;
    @c(a = "status_code")
    public final Integer status_code;

    static final class ProtoAdapter_Response extends ProtoAdapter<Response> {
        private final ProtoAdapter<Map<String, String>> headers;

        static {
            Covode.recordClassIndex(23731);
        }

        public ProtoAdapter_Response() {
            super(FieldEncoding.LENGTH_DELIMITED, Response.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.Response$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.Response redact(com.bytedance.im.core.proto.Response r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.Response$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ResponseBody r0 = r2.body
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ResponseBody> r1 = com.bytedance.im.core.proto.ResponseBody.ADAPTER
                com.bytedance.im.core.proto.ResponseBody r0 = r2.body
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ResponseBody r0 = (com.bytedance.im.core.proto.ResponseBody) r0
                r2.body = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.Response r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.Response.ProtoAdapter_Response.redact(com.bytedance.im.core.proto.Response):com.bytedance.im.core.proto.Response");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Response decode(ProtoReader protoReader) {
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
                            builder.status_code(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.error_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.body(ResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.log_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.headers.putAll(this.headers.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.start_time_stamp(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.request_arrived_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.server_execution_end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
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

        public final int encodedSize(Response response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, response.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, response.sequence_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, response.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, response.error_desc) + ProtoAdapter.INT32.encodedSizeWithTag(5, response.inbox_type) + ResponseBody.ADAPTER.encodedSizeWithTag(6, response.body) + ProtoAdapter.STRING.encodedSizeWithTag(7, response.log_id) + this.headers.encodedSizeWithTag(8, response.headers) + ProtoAdapter.INT64.encodedSizeWithTag(9, response.start_time_stamp) + ProtoAdapter.INT64.encodedSizeWithTag(10, response.request_arrived_time) + ProtoAdapter.INT64.encodedSizeWithTag(11, response.server_execution_end_time) + ProtoAdapter.INT32.encodedSizeWithTag(12, response.retry_count) + response.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Response response) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, response.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, response.sequence_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, response.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, response.error_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, response.inbox_type);
            ResponseBody.ADAPTER.encodeWithTag(protoWriter, 6, response.body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, response.log_id);
            this.headers.encodeWithTag(protoWriter, 8, response.headers);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, response.start_time_stamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, response.request_arrived_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, response.server_execution_end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, response.retry_count);
            protoWriter.writeBytes(response.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "Response" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<Response, Builder> {
        public ResponseBody body;
        public Integer cmd;
        public String error_desc;
        public Map<String, String> headers = Internal.newMutableMap();
        public Integer inbox_type;
        public String log_id;
        public Long request_arrived_time;
        public Integer retry_count;
        public Long sequence_id;
        public Long server_execution_end_time;
        public Long start_time_stamp;
        public Integer status_code;

        static {
            Covode.recordClassIndex(23730);
        }

        @Override // com.squareup.wire.Message.Builder
        public final Response build() {
            return new Response(this.cmd, this.sequence_id, this.status_code, this.error_desc, this.inbox_type, this.body, this.log_id, this.headers, this.start_time_stamp, this.request_arrived_time, this.server_execution_end_time, this.retry_count, super.buildUnknownFields());
        }

        public final Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder error_desc(String str) {
            this.error_desc = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder log_id(String str) {
            this.log_id = str;
            return this;
        }

        public final Builder request_arrived_time(Long l2) {
            this.request_arrived_time = l2;
            return this;
        }

        public final Builder retry_count(Integer num) {
            this.retry_count = num;
            return this;
        }

        public final Builder sequence_id(Long l2) {
            this.sequence_id = l2;
            return this;
        }

        public final Builder server_execution_end_time(Long l2) {
            this.server_execution_end_time = l2;
            return this;
        }

        public final Builder start_time_stamp(Long l2) {
            this.start_time_stamp = l2;
            return this;
        }

        public final Builder status_code(Integer num) {
            this.status_code = num;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23729);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.Response$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<Response, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cmd = this.cmd;
        builder.sequence_id = this.sequence_id;
        builder.status_code = this.status_code;
        builder.error_desc = this.error_desc;
        builder.inbox_type = this.inbox_type;
        builder.body = this.body;
        builder.log_id = this.log_id;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.start_time_stamp = this.start_time_stamp;
        builder.request_arrived_time = this.request_arrived_time;
        builder.server_execution_end_time = this.server_execution_end_time;
        builder.retry_count = this.retry_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public Response(Integer num, Long l2, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l3, Long l4, Long l5, Integer num4) {
        this(num, l2, num2, str, num3, responseBody, str2, map, l3, l4, l5, num4, i.EMPTY);
    }

    public Response(Integer num, Long l2, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l3, Long l4, Long l5, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.cmd = num;
        this.sequence_id = l2;
        this.status_code = num2;
        this.error_desc = str;
        this.inbox_type = num3;
        this.body = responseBody;
        this.log_id = str2;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.start_time_stamp = l3;
        this.request_arrived_time = l4;
        this.server_execution_end_time = l5;
        this.retry_count = num4;
    }
}
