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

public final class ConversationSettingInfo extends Message<ConversationSettingInfo, Builder> {
    public static final ProtoAdapter<ConversationSettingInfo> ADAPTER = new ProtoAdapter_ConversationSettingInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_FAVORITE = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_MIN_INDEX = 0L;
    public static final Long DEFAULT_MIN_INDEX_V2 = 0L;
    public static final Integer DEFAULT_MUTE = 0;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    public static final Long DEFAULT_SETTING_VERSION = 0L;
    public static final Long DEFAULT_SET_FAVORITE_TIME = 0L;
    public static final Long DEFAULT_SET_TOP_TIME = 0L;
    public static final Integer DEFAULT_STICK_ON_TOP = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "favorite")
    public final Integer favorite;
    @c(a = "inbox_type")
    public final Integer inbox_type;
    @c(a = "min_index")
    public final Long min_index;
    @c(a = "min_index_v2")
    public final Long min_index_v2;
    @c(a = "mute")
    public final Integer mute;
    @c(a = "read_badge_count")
    public final Integer read_badge_count;
    @c(a = "read_index")
    public final Long read_index;
    @c(a = "read_index_v2")
    public final Long read_index_v2;
    @c(a = "set_favorite_time")
    public final Long set_favorite_time;
    @c(a = "set_top_time")
    public final Long set_top_time;
    @c(a = "setting_version")
    public final Long setting_version;
    @c(a = "stick_on_top")
    public final Integer stick_on_top;

    static final class ProtoAdapter_ConversationSettingInfo extends ProtoAdapter<ConversationSettingInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23348);
        }

        public ProtoAdapter_ConversationSettingInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationSettingInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationSettingInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationSettingInfo redact(com.bytedance.im.core.proto.ConversationSettingInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationSettingInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationSettingInfo.ProtoAdapter_ConversationSettingInfo.redact(com.bytedance.im.core.proto.ConversationSettingInfo):com.bytedance.im.core.proto.ConversationSettingInfo");
        }

        public final int encodedSize(ConversationSettingInfo conversationSettingInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationSettingInfo.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationSettingInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationSettingInfo.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationSettingInfo.min_index) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationSettingInfo.read_index) + ProtoAdapter.INT32.encodedSizeWithTag(6, conversationSettingInfo.mute) + ProtoAdapter.INT32.encodedSizeWithTag(7, conversationSettingInfo.stick_on_top) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationSettingInfo.inbox_type) + this.ext.encodedSizeWithTag(9, conversationSettingInfo.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, conversationSettingInfo.setting_version) + ProtoAdapter.INT32.encodedSizeWithTag(11, conversationSettingInfo.favorite) + ProtoAdapter.INT64.encodedSizeWithTag(12, conversationSettingInfo.set_top_time) + ProtoAdapter.INT64.encodedSizeWithTag(13, conversationSettingInfo.set_favorite_time) + ProtoAdapter.INT64.encodedSizeWithTag(14, conversationSettingInfo.read_index_v2) + ProtoAdapter.INT64.encodedSizeWithTag(15, conversationSettingInfo.min_index_v2) + ProtoAdapter.INT32.encodedSizeWithTag(16, conversationSettingInfo.read_badge_count) + conversationSettingInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationSettingInfo decode(ProtoReader protoReader) {
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
                            builder.min_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.read_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.mute(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.stick_on_top(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.inbox_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.setting_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.favorite(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.set_top_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.set_favorite_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            builder.read_index_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 15:
                            builder.min_index_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 16:
                            builder.read_badge_count(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationSettingInfo conversationSettingInfo) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationSettingInfo.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationSettingInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationSettingInfo.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationSettingInfo.min_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationSettingInfo.read_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, conversationSettingInfo.mute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, conversationSettingInfo.stick_on_top);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationSettingInfo.inbox_type);
            this.ext.encodeWithTag(protoWriter, 9, conversationSettingInfo.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, conversationSettingInfo.setting_version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, conversationSettingInfo.favorite);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, conversationSettingInfo.set_top_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, conversationSettingInfo.set_favorite_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, conversationSettingInfo.read_index_v2);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, conversationSettingInfo.min_index_v2);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, conversationSettingInfo.read_badge_count);
            protoWriter.writeBytes(conversationSettingInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationSettingInfo" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23346);
    }

    public static final class Builder extends Message.Builder<ConversationSettingInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public Integer favorite;
        public Integer inbox_type;
        public Long min_index;
        public Long min_index_v2;
        public Integer mute;
        public Integer read_badge_count;
        public Long read_index;
        public Long read_index_v2;
        public Long set_favorite_time;
        public Long set_top_time;
        public Long setting_version;
        public Integer stick_on_top;

        static {
            Covode.recordClassIndex(23347);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationSettingInfo build() {
            return new ConversationSettingInfo(this.conversation_id, this.conversation_short_id, this.conversation_type, this.min_index, this.read_index, this.mute, this.stick_on_top, this.inbox_type, this.ext, this.setting_version, this.favorite, this.set_top_time, this.set_favorite_time, this.read_index_v2, this.min_index_v2, this.read_badge_count, super.buildUnknownFields());
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

        public final Builder favorite(Integer num) {
            this.favorite = num;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder min_index(Long l2) {
            this.min_index = l2;
            return this;
        }

        public final Builder min_index_v2(Long l2) {
            this.min_index_v2 = l2;
            return this;
        }

        public final Builder mute(Integer num) {
            this.mute = num;
            return this;
        }

        public final Builder read_badge_count(Integer num) {
            this.read_badge_count = num;
            return this;
        }

        public final Builder read_index(Long l2) {
            this.read_index = l2;
            return this;
        }

        public final Builder read_index_v2(Long l2) {
            this.read_index_v2 = l2;
            return this;
        }

        public final Builder set_favorite_time(Long l2) {
            this.set_favorite_time = l2;
            return this;
        }

        public final Builder set_top_time(Long l2) {
            this.set_top_time = l2;
            return this;
        }

        public final Builder setting_version(Long l2) {
            this.setting_version = l2;
            return this;
        }

        public final Builder stick_on_top(Integer num) {
            this.stick_on_top = num;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationSettingInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationSettingInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.min_index = this.min_index;
        builder.read_index = this.read_index;
        builder.mute = this.mute;
        builder.stick_on_top = this.stick_on_top;
        builder.inbox_type = this.inbox_type;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.setting_version = this.setting_version;
        builder.favorite = this.favorite;
        builder.set_top_time = this.set_top_time;
        builder.set_favorite_time = this.set_favorite_time;
        builder.read_index_v2 = this.read_index_v2;
        builder.min_index_v2 = this.min_index_v2;
        builder.read_badge_count = this.read_badge_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationSettingInfo(String str, Long l2, Integer num, Long l3, Long l4, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l5, Integer num5, Long l6, Long l7, Long l8, Long l9, Integer num6) {
        this(str, l2, num, l3, l4, num2, num3, num4, map, l5, num5, l6, l7, l8, l9, num6, i.EMPTY);
    }

    public ConversationSettingInfo(String str, Long l2, Integer num, Long l3, Long l4, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l5, Integer num5, Long l6, Long l7, Long l8, Long l9, Integer num6, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.min_index = l3;
        this.read_index = l4;
        this.mute = num2;
        this.stick_on_top = num3;
        this.inbox_type = num4;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.setting_version = l5;
        this.favorite = num5;
        this.set_top_time = l6;
        this.set_favorite_time = l7;
        this.read_index_v2 = l8;
        this.min_index_v2 = l9;
        this.read_badge_count = num6;
    }
}
