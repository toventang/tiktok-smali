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
import java.util.Map;
import k.i;

public final class ConversationCoreInfo extends Message<ConversationCoreInfo, Builder> {
    public static final ProtoAdapter<ConversationCoreInfo> ADAPTER = new ProtoAdapter_ConversationCoreInfo();
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = false;
    public static final BlockStatus DEFAULT_BLOCK_STATUS = BlockStatus.UNBLOCK;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CREATOR_UID = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_INFO_VERSION = 0L;
    public static final Integer DEFAULT_MODE = 0;
    public static final Long DEFAULT_OWNER = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "block_normal_only")
    public final Boolean block_normal_only;
    @c(a = "block_status")
    public final BlockStatus block_status;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "creator_uid")
    public final Long creator_uid;
    @c(a = "desc")
    public final String desc;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "icon")
    public final String icon;
    @c(a = "inbox_type")
    public final Integer inbox_type;
    @c(a = "info_version")
    public final Long info_version;
    @c(a = "mode")
    public final Integer mode;
    @c(a = StringSet.name)
    public final String name;
    @c(a = "notice")
    public final String notice;
    @c(a = "owner")
    public final Long owner;
    @c(a = "sec_owner")
    public final String sec_owner;

    static final class ProtoAdapter_ConversationCoreInfo extends ProtoAdapter<ConversationCoreInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23301);
        }

        public ProtoAdapter_ConversationCoreInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationCoreInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationCoreInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationCoreInfo redact(com.bytedance.im.core.proto.ConversationCoreInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationCoreInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationCoreInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationCoreInfo.ProtoAdapter_ConversationCoreInfo.redact(com.bytedance.im.core.proto.ConversationCoreInfo):com.bytedance.im.core.proto.ConversationCoreInfo");
        }

        public final int encodedSize(ConversationCoreInfo conversationCoreInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationCoreInfo.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationCoreInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationCoreInfo.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationCoreInfo.info_version) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationCoreInfo.name) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationCoreInfo.desc) + ProtoAdapter.STRING.encodedSizeWithTag(7, conversationCoreInfo.icon) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationCoreInfo.inbox_type) + ProtoAdapter.STRING.encodedSizeWithTag(9, conversationCoreInfo.notice) + this.ext.encodedSizeWithTag(11, conversationCoreInfo.ext) + ProtoAdapter.INT64.encodedSizeWithTag(12, conversationCoreInfo.owner) + ProtoAdapter.STRING.encodedSizeWithTag(13, conversationCoreInfo.sec_owner) + BlockStatus.ADAPTER.encodedSizeWithTag(14, conversationCoreInfo.block_status) + ProtoAdapter.BOOL.encodedSizeWithTag(15, conversationCoreInfo.block_normal_only) + ProtoAdapter.INT32.encodedSizeWithTag(16, conversationCoreInfo.mode) + ProtoAdapter.INT64.encodedSizeWithTag(17, conversationCoreInfo.creator_uid) + conversationCoreInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCoreInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.info_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.icon(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.notice(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.owner(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.sec_owner(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            try {
                                builder.block_status(BlockStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            builder.block_normal_only(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 16:
                            builder.mode(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.creator_uid(ProtoAdapter.INT64.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationCoreInfo conversationCoreInfo) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationCoreInfo.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationCoreInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationCoreInfo.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationCoreInfo.info_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationCoreInfo.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationCoreInfo.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, conversationCoreInfo.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationCoreInfo.inbox_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, conversationCoreInfo.notice);
            this.ext.encodeWithTag(protoWriter, 11, conversationCoreInfo.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, conversationCoreInfo.owner);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, conversationCoreInfo.sec_owner);
            BlockStatus.ADAPTER.encodeWithTag(protoWriter, 14, conversationCoreInfo.block_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, conversationCoreInfo.block_normal_only);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, conversationCoreInfo.mode);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, conversationCoreInfo.creator_uid);
            protoWriter.writeBytes(conversationCoreInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationCoreInfo" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23299);
    }

    public static final class Builder extends Message.Builder<ConversationCoreInfo, Builder> {
        public Boolean block_normal_only;
        public BlockStatus block_status;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long creator_uid;
        public String desc;
        public Map<String, String> ext = Internal.newMutableMap();
        public String icon;
        public Integer inbox_type;
        public Long info_version;
        public Integer mode;
        public String name;
        public String notice;
        public Long owner;
        public String sec_owner;

        static {
            Covode.recordClassIndex(23300);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationCoreInfo build() {
            return new ConversationCoreInfo(this.conversation_id, this.conversation_short_id, this.conversation_type, this.info_version, this.name, this.desc, this.icon, this.inbox_type, this.notice, this.ext, this.owner, this.sec_owner, this.block_status, this.block_normal_only, this.mode, this.creator_uid, super.buildUnknownFields());
        }

        public final Builder block_normal_only(Boolean bool) {
            this.block_normal_only = bool;
            return this;
        }

        public final Builder block_status(BlockStatus blockStatus) {
            this.block_status = blockStatus;
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

        public final Builder creator_uid(Long l2) {
            this.creator_uid = l2;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder info_version(Long l2) {
            this.info_version = l2;
            return this;
        }

        public final Builder mode(Integer num) {
            this.mode = num;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder notice(String str) {
            this.notice = str;
            return this;
        }

        public final Builder owner(Long l2) {
            this.owner = l2;
            return this;
        }

        public final Builder sec_owner(String str) {
            this.sec_owner = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationCoreInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationCoreInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.info_version = this.info_version;
        builder.name = this.name;
        builder.desc = this.desc;
        builder.icon = this.icon;
        builder.inbox_type = this.inbox_type;
        builder.notice = this.notice;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.owner = this.owner;
        builder.sec_owner = this.sec_owner;
        builder.block_status = this.block_status;
        builder.block_normal_only = this.block_normal_only;
        builder.mode = this.mode;
        builder.creator_uid = this.creator_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationCoreInfo(String str, Long l2, Integer num, Long l3, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l4, String str6, BlockStatus blockStatus, Boolean bool, Integer num3, Long l5) {
        this(str, l2, num, l3, str2, str3, str4, num2, str5, map, l4, str6, blockStatus, bool, num3, l5, i.EMPTY);
    }

    public ConversationCoreInfo(String str, Long l2, Integer num, Long l3, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l4, String str6, BlockStatus blockStatus, Boolean bool, Integer num3, Long l5, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.info_version = l3;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.inbox_type = num2;
        this.notice = str5;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.owner = l4;
        this.sec_owner = str6;
        this.block_status = blockStatus;
        this.block_normal_only = bool;
        this.mode = num3;
        this.creator_uid = l5;
    }
}
