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
import java.util.List;
import k.i;

public final class ConversationCoreSearchQuery extends Message<ConversationCoreSearchQuery, Builder> {
    public static final ProtoAdapter<ConversationCoreSearchQuery> ADAPTER = new ProtoAdapter_ConversationCoreSearchQuery();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_CREAT_END_TIME = 0L;
    public static final Long DEFAULT_CREAT_START_TIME = 0L;
    public static final Long DEFAULT_OWNER_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conv_name")
    public final String conv_name;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "conv_status")
    public final String conv_status;
    @c(a = "creat_end_time")
    public final Long creat_end_time;
    @c(a = "creat_start_time")
    public final Long creat_start_time;
    @c(a = "ext_list")
    public final List<String> ext_list;
    @c(a = "owner_id")
    public final Long owner_id;

    static final class ProtoAdapter_ConversationCoreSearchQuery extends ProtoAdapter<ConversationCoreSearchQuery> {
        static {
            Covode.recordClassIndex(23304);
        }

        public ProtoAdapter_ConversationCoreSearchQuery() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationCoreSearchQuery.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationCoreSearchQuery$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationCoreSearchQuery redact(com.bytedance.im.core.proto.ConversationCoreSearchQuery r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationCoreSearchQuery$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationCoreSearchQuery r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationCoreSearchQuery.ProtoAdapter_ConversationCoreSearchQuery.redact(com.bytedance.im.core.proto.ConversationCoreSearchQuery):com.bytedance.im.core.proto.ConversationCoreSearchQuery");
        }

        public final int encodedSize(ConversationCoreSearchQuery conversationCoreSearchQuery) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationCoreSearchQuery.conv_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCoreSearchQuery.conv_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, conversationCoreSearchQuery.conv_status) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationCoreSearchQuery.creat_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationCoreSearchQuery.creat_end_time) + ProtoAdapter.INT64.encodedSizeWithTag(6, conversationCoreSearchQuery.owner_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, conversationCoreSearchQuery.ext_list) + conversationCoreSearchQuery.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCoreSearchQuery decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.conv_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.conv_status(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.creat_start_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.creat_end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.owner_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.ext_list.add(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationCoreSearchQuery conversationCoreSearchQuery) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationCoreSearchQuery.conv_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCoreSearchQuery.conv_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, conversationCoreSearchQuery.conv_status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationCoreSearchQuery.creat_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationCoreSearchQuery.creat_end_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, conversationCoreSearchQuery.owner_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, conversationCoreSearchQuery.ext_list);
            protoWriter.writeBytes(conversationCoreSearchQuery.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationCoreSearchQuery, Builder> {
        public String conv_name;
        public Long conv_short_id;
        public String conv_status;
        public Long creat_end_time;
        public Long creat_start_time;
        public List<String> ext_list = Internal.newMutableList();
        public Long owner_id;

        static {
            Covode.recordClassIndex(23303);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationCoreSearchQuery build() {
            return new ConversationCoreSearchQuery(this.conv_short_id, this.conv_name, this.conv_status, this.creat_start_time, this.creat_end_time, this.owner_id, this.ext_list, super.buildUnknownFields());
        }

        public final Builder conv_name(String str) {
            this.conv_name = str;
            return this;
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder conv_status(String str) {
            this.conv_status = str;
            return this;
        }

        public final Builder creat_end_time(Long l2) {
            this.creat_end_time = l2;
            return this;
        }

        public final Builder creat_start_time(Long l2) {
            this.creat_start_time = l2;
            return this;
        }

        public final Builder owner_id(Long l2) {
            this.owner_id = l2;
            return this;
        }

        public final Builder ext_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ext_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23302);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationCoreSearchQuery" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationCoreSearchQuery$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationCoreSearchQuery, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.conv_name = this.conv_name;
        builder.conv_status = this.conv_status;
        builder.creat_start_time = this.creat_start_time;
        builder.creat_end_time = this.creat_end_time;
        builder.owner_id = this.owner_id;
        builder.ext_list = Internal.copyOf("ext_list", this.ext_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationCoreSearchQuery(Long l2, String str, String str2, Long l3, Long l4, Long l5, List<String> list) {
        this(l2, str, str2, l3, l4, l5, list, i.EMPTY);
    }

    public ConversationCoreSearchQuery(Long l2, String str, String str2, Long l3, Long l4, Long l5, List<String> list, i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l2;
        this.conv_name = str;
        this.conv_status = str2;
        this.creat_start_time = l3;
        this.creat_end_time = l4;
        this.owner_id = l5;
        this.ext_list = Internal.immutableCopyOf("ext_list", list);
    }
}
