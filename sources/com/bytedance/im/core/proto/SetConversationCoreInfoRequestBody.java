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

public final class SetConversationCoreInfoRequestBody extends Message<SetConversationCoreInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetConversationCoreInfoRequestBody> ADAPTER = new ProtoAdapter_SetConversationCoreInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_IS_DESC_SET = false;
    public static final Boolean DEFAULT_IS_ICON_SET = false;
    public static final Boolean DEFAULT_IS_NAME_SET = false;
    public static final Boolean DEFAULT_IS_NOTICE_SET = false;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "desc")
    public final String desc;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "icon")
    public final String icon;
    @c(a = "is_desc_set")
    public final Boolean is_desc_set;
    @c(a = "is_icon_set")
    public final Boolean is_icon_set;
    @c(a = "is_name_set")
    public final Boolean is_name_set;
    @c(a = "is_notice_set")
    public final Boolean is_notice_set;
    @c(a = StringSet.name)
    public final String name;
    @c(a = "notice")
    public final String notice;

    static final class ProtoAdapter_SetConversationCoreInfoRequestBody extends ProtoAdapter<SetConversationCoreInfoRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23765);
        }

        public ProtoAdapter_SetConversationCoreInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody redact(com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody.ProtoAdapter_SetConversationCoreInfoRequestBody.redact(com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody):com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationCoreInfoRequestBody decode(ProtoReader protoReader) {
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
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.icon(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.notice(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.is_name_set(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.is_desc_set(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.is_icon_set(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.is_notice_set(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
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

        public final int encodedSize(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationCoreInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationCoreInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationCoreInfoRequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, setConversationCoreInfoRequestBody.name) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationCoreInfoRequestBody.desc) + ProtoAdapter.STRING.encodedSizeWithTag(6, setConversationCoreInfoRequestBody.icon) + ProtoAdapter.STRING.encodedSizeWithTag(7, setConversationCoreInfoRequestBody.notice) + ProtoAdapter.BOOL.encodedSizeWithTag(8, setConversationCoreInfoRequestBody.is_name_set) + ProtoAdapter.BOOL.encodedSizeWithTag(9, setConversationCoreInfoRequestBody.is_desc_set) + ProtoAdapter.BOOL.encodedSizeWithTag(10, setConversationCoreInfoRequestBody.is_icon_set) + ProtoAdapter.BOOL.encodedSizeWithTag(11, setConversationCoreInfoRequestBody.is_notice_set) + this.ext.encodedSizeWithTag(12, setConversationCoreInfoRequestBody.ext) + setConversationCoreInfoRequestBody.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationCoreInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationCoreInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationCoreInfoRequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setConversationCoreInfoRequestBody.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationCoreInfoRequestBody.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, setConversationCoreInfoRequestBody.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, setConversationCoreInfoRequestBody.notice);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, setConversationCoreInfoRequestBody.is_name_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, setConversationCoreInfoRequestBody.is_desc_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, setConversationCoreInfoRequestBody.is_icon_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, setConversationCoreInfoRequestBody.is_notice_set);
            this.ext.encodeWithTag(protoWriter, 12, setConversationCoreInfoRequestBody.ext);
            protoWriter.writeBytes(setConversationCoreInfoRequestBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SetConversationCoreInfoRequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<SetConversationCoreInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public String desc;
        public Map<String, String> ext = Internal.newMutableMap();
        public String icon;
        public Boolean is_desc_set;
        public Boolean is_icon_set;
        public Boolean is_name_set;
        public Boolean is_notice_set;
        public String name;
        public String notice;

        static {
            Covode.recordClassIndex(23764);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SetConversationCoreInfoRequestBody build() {
            return new SetConversationCoreInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.name, this.desc, this.icon, this.notice, this.is_name_set, this.is_desc_set, this.is_icon_set, this.is_notice_set, this.ext, super.buildUnknownFields());
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

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder is_desc_set(Boolean bool) {
            this.is_desc_set = bool;
            return this;
        }

        public final Builder is_icon_set(Boolean bool) {
            this.is_icon_set = bool;
            return this;
        }

        public final Builder is_name_set(Boolean bool) {
            this.is_name_set = bool;
            return this;
        }

        public final Builder is_notice_set(Boolean bool) {
            this.is_notice_set = bool;
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

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23763);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SetConversationCoreInfoRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.name = this.name;
        builder.desc = this.desc;
        builder.icon = this.icon;
        builder.notice = this.notice;
        builder.is_name_set = this.is_name_set;
        builder.is_desc_set = this.is_desc_set;
        builder.is_icon_set = this.is_icon_set;
        builder.is_notice_set = this.is_notice_set;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SetConversationCoreInfoRequestBody(String str, Long l2, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map) {
        this(str, l2, num, str2, str3, str4, str5, bool, bool2, bool3, bool4, map, i.EMPTY);
    }

    public SetConversationCoreInfoRequestBody(String str, Long l2, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.notice = str5;
        this.is_name_set = bool;
        this.is_desc_set = bool2;
        this.is_icon_set = bool3;
        this.is_notice_set = bool4;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
