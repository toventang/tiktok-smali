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

public final class GetUserConversationListRequestBody extends Message<GetUserConversationListRequestBody, Builder> {
    public static final ProtoAdapter<GetUserConversationListRequestBody> ADAPTER = new ProtoAdapter_GetUserConversationListRequestBody();
    public static final ConversationType DEFAULT_CON_TYPE = ConversationType.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_CUSTOMED_CON_TYPE = 0;
    public static final Integer DEFAULT_EXCLUDE_ROLE = 0;
    public static final Boolean DEFAULT_INCLUDE_REMOVED_GROUP = false;
    public static final Integer DEFAULT_INCLUDE_ROLE = 0;
    public static final Long DEFAULT_LIMIT = 0L;
    public static final SortType DEFAULT_SORT_TYPE = SortType.JOIN_TIME;
    public static final Boolean DEFAULT_WITH_COLD = false;
    private static final long serialVersionUID = 0;
    @c(a = "con_type")
    public final ConversationType con_type;
    @c(a = "cursor")
    public final Long cursor;
    @c(a = "customed_con_type")
    public final Integer customed_con_type;
    @c(a = "exclude_role")
    public final Integer exclude_role;
    @c(a = "include_removed_group")
    public final Boolean include_removed_group;
    @c(a = "include_role")
    public final Integer include_role;
    @c(a = "limit")
    public final Long limit;
    @c(a = "sort_type")
    public final SortType sort_type;
    @c(a = "with_cold")
    public final Boolean with_cold;

    static final class ProtoAdapter_GetUserConversationListRequestBody extends ProtoAdapter<GetUserConversationListRequestBody> {
        static {
            Covode.recordClassIndex(23525);
        }

        public ProtoAdapter_GetUserConversationListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetUserConversationListRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetUserConversationListRequestBody redact(com.bytedance.im.core.proto.GetUserConversationListRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetUserConversationListRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetUserConversationListRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetUserConversationListRequestBody.ProtoAdapter_GetUserConversationListRequestBody.redact(com.bytedance.im.core.proto.GetUserConversationListRequestBody):com.bytedance.im.core.proto.GetUserConversationListRequestBody");
        }

        public final int encodedSize(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            return SortType.ADAPTER.encodedSizeWithTag(1, getUserConversationListRequestBody.sort_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, getUserConversationListRequestBody.cursor) + ConversationType.ADAPTER.encodedSizeWithTag(3, getUserConversationListRequestBody.con_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, getUserConversationListRequestBody.limit) + ProtoAdapter.INT32.encodedSizeWithTag(5, getUserConversationListRequestBody.include_role) + ProtoAdapter.INT32.encodedSizeWithTag(6, getUserConversationListRequestBody.exclude_role) + ProtoAdapter.BOOL.encodedSizeWithTag(7, getUserConversationListRequestBody.include_removed_group) + ProtoAdapter.BOOL.encodedSizeWithTag(8, getUserConversationListRequestBody.with_cold) + ProtoAdapter.INT32.encodedSizeWithTag(9, getUserConversationListRequestBody.customed_con_type) + getUserConversationListRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetUserConversationListRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.sort_type(SortType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 2:
                            builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.con_type(ConversationType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 4:
                            builder.limit(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.include_role(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.exclude_role(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.include_removed_group(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.with_cold(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.customed_con_type(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetUserConversationListRequestBody getUserConversationListRequestBody) {
            SortType.ADAPTER.encodeWithTag(protoWriter, 1, getUserConversationListRequestBody.sort_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getUserConversationListRequestBody.cursor);
            ConversationType.ADAPTER.encodeWithTag(protoWriter, 3, getUserConversationListRequestBody.con_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getUserConversationListRequestBody.limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getUserConversationListRequestBody.include_role);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getUserConversationListRequestBody.exclude_role);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getUserConversationListRequestBody.include_removed_group);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getUserConversationListRequestBody.with_cold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, getUserConversationListRequestBody.customed_con_type);
            protoWriter.writeBytes(getUserConversationListRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetUserConversationListRequestBody, Builder> {
        public ConversationType con_type;
        public Long cursor;
        public Integer customed_con_type;
        public Integer exclude_role;
        public Boolean include_removed_group;
        public Integer include_role;
        public Long limit;
        public SortType sort_type;
        public Boolean with_cold;

        static {
            Covode.recordClassIndex(23524);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetUserConversationListRequestBody build() {
            return new GetUserConversationListRequestBody(this.sort_type, this.cursor, this.con_type, this.limit, this.include_role, this.exclude_role, this.include_removed_group, this.with_cold, this.customed_con_type, super.buildUnknownFields());
        }

        public final Builder con_type(ConversationType conversationType) {
            this.con_type = conversationType;
            return this;
        }

        public final Builder cursor(Long l2) {
            this.cursor = l2;
            return this;
        }

        public final Builder customed_con_type(Integer num) {
            this.customed_con_type = num;
            return this;
        }

        public final Builder exclude_role(Integer num) {
            this.exclude_role = num;
            return this;
        }

        public final Builder include_removed_group(Boolean bool) {
            this.include_removed_group = bool;
            return this;
        }

        public final Builder include_role(Integer num) {
            this.include_role = num;
            return this;
        }

        public final Builder limit(Long l2) {
            this.limit = l2;
            return this;
        }

        public final Builder sort_type(SortType sortType) {
            this.sort_type = sortType;
            return this;
        }

        public final Builder with_cold(Boolean bool) {
            this.with_cold = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetUserConversationListRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23523);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetUserConversationListRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetUserConversationListRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sort_type = this.sort_type;
        builder.cursor = this.cursor;
        builder.con_type = this.con_type;
        builder.limit = this.limit;
        builder.include_role = this.include_role;
        builder.exclude_role = this.exclude_role;
        builder.include_removed_group = this.include_removed_group;
        builder.with_cold = this.with_cold;
        builder.customed_con_type = this.customed_con_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public GetUserConversationListRequestBody(SortType sortType, Long l2, ConversationType conversationType, Long l3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3) {
        this(sortType, l2, conversationType, l3, num, num2, bool, bool2, num3, i.EMPTY);
    }

    public GetUserConversationListRequestBody(SortType sortType, Long l2, ConversationType conversationType, Long l3, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, i iVar) {
        super(ADAPTER, iVar);
        this.sort_type = sortType;
        this.cursor = l2;
        this.con_type = conversationType;
        this.limit = l3;
        this.include_role = num;
        this.exclude_role = num2;
        this.include_removed_group = bool;
        this.with_cold = bool2;
        this.customed_con_type = num3;
    }
}
