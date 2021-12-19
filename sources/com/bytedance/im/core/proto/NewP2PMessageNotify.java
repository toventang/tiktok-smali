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

public final class NewP2PMessageNotify extends Message<NewP2PMessageNotify, Builder> {
    public static final ProtoAdapter<NewP2PMessageNotify> ADAPTER = new ProtoAdapter_NewP2PMessageNotify();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_SENDER = 0L;
    public static final SendType DEFAULT_SEND_TYPE = SendType.BY_CONVERSATION;
    private static final long serialVersionUID = 0;
    @c(a = "content")
    public final String content;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "create_time")
    public final Long create_time;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "message_type")
    public final Integer message_type;
    @c(a = "sec_sender")
    public final String sec_sender;
    @c(a = "send_type")
    public final SendType send_type;
    @c(a = "sender")
    public final Long sender;

    static final class ProtoAdapter_NewP2PMessageNotify extends ProtoAdapter<NewP2PMessageNotify> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23660);
        }

        public ProtoAdapter_NewP2PMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, NewP2PMessageNotify.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.NewP2PMessageNotify$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.NewP2PMessageNotify redact(com.bytedance.im.core.proto.NewP2PMessageNotify r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.NewP2PMessageNotify$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.NewP2PMessageNotify r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.NewP2PMessageNotify.ProtoAdapter_NewP2PMessageNotify.redact(com.bytedance.im.core.proto.NewP2PMessageNotify):com.bytedance.im.core.proto.NewP2PMessageNotify");
        }

        public final int encodedSize(NewP2PMessageNotify newP2PMessageNotify) {
            return SendType.ADAPTER.encodedSizeWithTag(1, newP2PMessageNotify.send_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, newP2PMessageNotify.sender) + ProtoAdapter.STRING.encodedSizeWithTag(3, newP2PMessageNotify.sec_sender) + ProtoAdapter.STRING.encodedSizeWithTag(4, newP2PMessageNotify.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, newP2PMessageNotify.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, newP2PMessageNotify.conversation_type) + ProtoAdapter.INT32.encodedSizeWithTag(7, newP2PMessageNotify.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(8, newP2PMessageNotify.content) + this.ext.encodedSizeWithTag(9, newP2PMessageNotify.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, newP2PMessageNotify.create_time) + newP2PMessageNotify.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NewP2PMessageNotify decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.send_type(SendType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 2:
                            builder.sender(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.sec_sender(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.message_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewP2PMessageNotify newP2PMessageNotify) {
            SendType.ADAPTER.encodeWithTag(protoWriter, 1, newP2PMessageNotify.send_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, newP2PMessageNotify.sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, newP2PMessageNotify.sec_sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, newP2PMessageNotify.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, newP2PMessageNotify.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, newP2PMessageNotify.conversation_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, newP2PMessageNotify.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, newP2PMessageNotify.content);
            this.ext.encodeWithTag(protoWriter, 9, newP2PMessageNotify.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, newP2PMessageNotify.create_time);
            protoWriter.writeBytes(newP2PMessageNotify.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<NewP2PMessageNotify, Builder> {
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long create_time;
        public Map<String, String> ext = Internal.newMutableMap();
        public Integer message_type;
        public String sec_sender;
        public SendType send_type;
        public Long sender;

        static {
            Covode.recordClassIndex(23659);
        }

        @Override // com.squareup.wire.Message.Builder
        public final NewP2PMessageNotify build() {
            return new NewP2PMessageNotify(this.send_type, this.sender, this.sec_sender, this.conversation_id, this.conversation_short_id, this.conversation_type, this.message_type, this.content, this.ext, this.create_time, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder sec_sender(String str) {
            this.sec_sender = str;
            return this;
        }

        public final Builder send_type(SendType sendType) {
            this.send_type = sendType;
            return this;
        }

        public final Builder sender(Long l2) {
            this.sender = l2;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "NewP2PMessageNotify" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23658);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.NewP2PMessageNotify$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<NewP2PMessageNotify, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.send_type = this.send_type;
        builder.sender = this.sender;
        builder.sec_sender = this.sec_sender;
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.message_type = this.message_type;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.create_time = this.create_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public NewP2PMessageNotify(SendType sendType, Long l2, String str, String str2, Long l3, Integer num, Integer num2, String str3, Map<String, String> map, Long l4) {
        this(sendType, l2, str, str2, l3, num, num2, str3, map, l4, i.EMPTY);
    }

    public NewP2PMessageNotify(SendType sendType, Long l2, String str, String str2, Long l3, Integer num, Integer num2, String str3, Map<String, String> map, Long l4, i iVar) {
        super(ADAPTER, iVar);
        this.send_type = sendType;
        this.sender = l2;
        this.sec_sender = str;
        this.conversation_id = str2;
        this.conversation_short_id = l3;
        this.conversation_type = num;
        this.message_type = num2;
        this.content = str3;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.create_time = l4;
    }
}
