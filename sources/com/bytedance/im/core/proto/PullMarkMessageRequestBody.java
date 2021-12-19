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
import k.i;

public final class PullMarkMessageRequestBody extends Message<PullMarkMessageRequestBody, Builder> {
    public static final ProtoAdapter<PullMarkMessageRequestBody> ADAPTER = new ProtoAdapter_PullMarkMessageRequestBody();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    public static final Boolean DEFAULT_ASC = false;
    public static final Boolean DEFAULT_CLEAR_UNREAD_COUNT = false;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_LIMIT = 0L;
    public static final Long DEFAULT_TAG = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "action_type")
    public final ActionType action_type;
    @c(a = "asc")
    public final Boolean asc;
    @c(a = "clear_unread_count")
    public final Boolean clear_unread_count;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "cursor")
    public final Long cursor;
    @c(a = "limit")
    public final Long limit;
    @c(a = "tag")
    public final Long tag;

    static final class ProtoAdapter_PullMarkMessageRequestBody extends ProtoAdapter<PullMarkMessageRequestBody> {
        static {
            Covode.recordClassIndex(23700);
        }

        public ProtoAdapter_PullMarkMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, PullMarkMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.PullMarkMessageRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.PullMarkMessageRequestBody redact(com.bytedance.im.core.proto.PullMarkMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.PullMarkMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.PullMarkMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.PullMarkMessageRequestBody.ProtoAdapter_PullMarkMessageRequestBody.redact(com.bytedance.im.core.proto.PullMarkMessageRequestBody):com.bytedance.im.core.proto.PullMarkMessageRequestBody");
        }

        public final int encodedSize(PullMarkMessageRequestBody pullMarkMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pullMarkMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, pullMarkMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, pullMarkMessageRequestBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, pullMarkMessageRequestBody.cursor) + ProtoAdapter.INT64.encodedSizeWithTag(5, pullMarkMessageRequestBody.limit) + ProtoAdapter.BOOL.encodedSizeWithTag(6, pullMarkMessageRequestBody.asc) + ActionType.ADAPTER.encodedSizeWithTag(7, pullMarkMessageRequestBody.action_type) + ProtoAdapter.INT64.encodedSizeWithTag(8, pullMarkMessageRequestBody.tag) + ProtoAdapter.BOOL.encodedSizeWithTag(9, pullMarkMessageRequestBody.clear_unread_count) + pullMarkMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PullMarkMessageRequestBody decode(ProtoReader protoReader) {
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
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.limit(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.asc(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            try {
                                builder.action_type(ActionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.tag(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.clear_unread_count(ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PullMarkMessageRequestBody pullMarkMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullMarkMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullMarkMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullMarkMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pullMarkMessageRequestBody.cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, pullMarkMessageRequestBody.limit);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, pullMarkMessageRequestBody.asc);
            ActionType.ADAPTER.encodeWithTag(protoWriter, 7, pullMarkMessageRequestBody.action_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, pullMarkMessageRequestBody.tag);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, pullMarkMessageRequestBody.clear_unread_count);
            protoWriter.writeBytes(pullMarkMessageRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PullMarkMessageRequestBody, Builder> {
        public ActionType action_type;
        public Boolean asc;
        public Boolean clear_unread_count;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long cursor;
        public Long limit;
        public Long tag;

        static {
            Covode.recordClassIndex(23699);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PullMarkMessageRequestBody build() {
            return new PullMarkMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.cursor, this.limit, this.asc, this.action_type, this.tag, this.clear_unread_count, super.buildUnknownFields());
        }

        public final Builder action_type(ActionType actionType) {
            this.action_type = actionType;
            return this;
        }

        public final Builder asc(Boolean bool) {
            this.asc = bool;
            return this;
        }

        public final Builder clear_unread_count(Boolean bool) {
            this.clear_unread_count = bool;
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

        public final Builder cursor(Long l2) {
            this.cursor = l2;
            return this;
        }

        public final Builder limit(Long l2) {
            this.limit = l2;
            return this;
        }

        public final Builder tag(Long l2) {
            this.tag = l2;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "PullMarkMessageRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23698);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.PullMarkMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PullMarkMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.cursor = this.cursor;
        builder.limit = this.limit;
        builder.asc = this.asc;
        builder.action_type = this.action_type;
        builder.tag = this.tag;
        builder.clear_unread_count = this.clear_unread_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l2, Long l3, Long l4, Boolean bool, ActionType actionType, Long l5, Boolean bool2) {
        this(str, num, l2, l3, l4, bool, actionType, l5, bool2, i.EMPTY);
    }

    public PullMarkMessageRequestBody(String str, Integer num, Long l2, Long l3, Long l4, Boolean bool, ActionType actionType, Long l5, Boolean bool2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.cursor = l3;
        this.limit = l4;
        this.asc = bool;
        this.action_type = actionType;
        this.tag = l5;
        this.clear_unread_count = bool2;
    }
}
