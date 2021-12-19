package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ClientACKRequestBody extends Message<ClientACKRequestBody, Builder> {
    public static final ProtoAdapter<ClientACKRequestBody> ADAPTER = new ProtoAdapter_ClientACKRequestBody();
    public static final Long DEFAULT_CLIENT_TIME_STAMP = 0L;
    public static final Integer DEFAULT_CMD = 0;
    public static final NetworkType DEFAULT_NETWORK_TYPE = NetworkType.UNKNOWN;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_START_TIME_STAMP = 0L;
    public static final MsgReportType DEFAULT_TYPE = MsgReportType.NOT_USE;
    private static final long serialVersionUID = 0;
    @c(a = "client_time_stamp")
    public final Long client_time_stamp;
    @c(a = "cmd")
    public final Integer cmd;
    @c(a = "logid")
    public final String logid;
    @c(a = "network_type")
    public final NetworkType network_type;
    @c(a = "server_message_id")
    public final Long server_message_id;
    @c(a = "start_time_stamp")
    public final Long start_time_stamp;
    @c(a = StringSet.type)
    public final MsgReportType type;

    static final class ProtoAdapter_ClientACKRequestBody extends ProtoAdapter<ClientACKRequestBody> {
        static {
            Covode.recordClassIndex(23266);
        }

        public ProtoAdapter_ClientACKRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ClientACKRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ClientACKRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ClientACKRequestBody redact(com.bytedance.im.core.proto.ClientACKRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ClientACKRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ClientACKRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ClientACKRequestBody.ProtoAdapter_ClientACKRequestBody.redact(com.bytedance.im.core.proto.ClientACKRequestBody):com.bytedance.im.core.proto.ClientACKRequestBody");
        }

        public final int encodedSize(ClientACKRequestBody clientACKRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, clientACKRequestBody.start_time_stamp) + ProtoAdapter.INT32.encodedSizeWithTag(2, clientACKRequestBody.cmd) + NetworkType.ADAPTER.encodedSizeWithTag(3, clientACKRequestBody.network_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, clientACKRequestBody.logid) + ProtoAdapter.INT64.encodedSizeWithTag(5, clientACKRequestBody.client_time_stamp) + ProtoAdapter.INT64.encodedSizeWithTag(6, clientACKRequestBody.server_message_id) + MsgReportType.ADAPTER.encodedSizeWithTag(7, clientACKRequestBody.type) + clientACKRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientACKRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start_time_stamp(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.cmd(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.network_type(NetworkType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            builder.logid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.client_time_stamp(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            try {
                                builder.type(MsgReportType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
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

        public final void encode(ProtoWriter protoWriter, ClientACKRequestBody clientACKRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, clientACKRequestBody.start_time_stamp);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, clientACKRequestBody.cmd);
            NetworkType.ADAPTER.encodeWithTag(protoWriter, 3, clientACKRequestBody.network_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, clientACKRequestBody.logid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, clientACKRequestBody.client_time_stamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, clientACKRequestBody.server_message_id);
            MsgReportType.ADAPTER.encodeWithTag(protoWriter, 7, clientACKRequestBody.type);
            protoWriter.writeBytes(clientACKRequestBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ClientACKRequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ClientACKRequestBody, Builder> {
        public Long client_time_stamp;
        public Integer cmd;
        public String logid;
        public NetworkType network_type;
        public Long server_message_id;
        public Long start_time_stamp;
        public MsgReportType type;

        static {
            Covode.recordClassIndex(23265);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ClientACKRequestBody build() {
            Long l2 = this.start_time_stamp;
            if (l2 != null && this.cmd != null) {
                return new ClientACKRequestBody(this.start_time_stamp, this.cmd, this.network_type, this.logid, this.client_time_stamp, this.server_message_id, this.type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "start_time_stamp", this.cmd, "cmd");
        }

        public final Builder client_time_stamp(Long l2) {
            this.client_time_stamp = l2;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder logid(String str) {
            this.logid = str;
            return this;
        }

        public final Builder network_type(NetworkType networkType) {
            this.network_type = networkType;
            return this;
        }

        public final Builder server_message_id(Long l2) {
            this.server_message_id = l2;
            return this;
        }

        public final Builder start_time_stamp(Long l2) {
            this.start_time_stamp = l2;
            return this;
        }

        public final Builder type(MsgReportType msgReportType) {
            this.type = msgReportType;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23264);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ClientACKRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ClientACKRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start_time_stamp = this.start_time_stamp;
        builder.cmd = this.cmd;
        builder.network_type = this.network_type;
        builder.logid = this.logid;
        builder.client_time_stamp = this.client_time_stamp;
        builder.server_message_id = this.server_message_id;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ClientACKRequestBody(Long l2, Integer num, NetworkType networkType, String str, Long l3, Long l4, MsgReportType msgReportType) {
        this(l2, num, networkType, str, l3, l4, msgReportType, i.EMPTY);
    }

    public ClientACKRequestBody(Long l2, Integer num, NetworkType networkType, String str, Long l3, Long l4, MsgReportType msgReportType, i iVar) {
        super(ADAPTER, iVar);
        this.start_time_stamp = l2;
        this.cmd = num;
        this.network_type = networkType;
        this.logid = str;
        this.client_time_stamp = l3;
        this.server_message_id = l4;
        this.type = msgReportType;
    }
}
