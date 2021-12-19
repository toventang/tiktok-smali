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
import k.i;

public final class ConversationMessageSearchRequestBody extends Message<ConversationMessageSearchRequestBody, Builder> {
    public static final ProtoAdapter<ConversationMessageSearchRequestBody> ADAPTER = new ProtoAdapter_ConversationMessageSearchRequestBody();
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_FRAG_SIZE = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "end_time")
    public final Long end_time;
    @c(a = "frag_size")
    public final Integer frag_size;
    @c(a = "scroll_id")
    public final String scroll_id;
    @c(a = "search_query")
    public final String search_query;
    @c(a = "start_time")
    public final Long start_time;

    static final class ProtoAdapter_ConversationMessageSearchRequestBody extends ProtoAdapter<ConversationMessageSearchRequestBody> {
        static {
            Covode.recordClassIndex(23322);
        }

        public ProtoAdapter_ConversationMessageSearchRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationMessageSearchRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationMessageSearchRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationMessageSearchRequestBody redact(com.bytedance.im.core.proto.ConversationMessageSearchRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationMessageSearchRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationMessageSearchRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationMessageSearchRequestBody.ProtoAdapter_ConversationMessageSearchRequestBody.redact(com.bytedance.im.core.proto.ConversationMessageSearchRequestBody):com.bytedance.im.core.proto.ConversationMessageSearchRequestBody");
        }

        public final int encodedSize(ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationMessageSearchRequestBody.search_query) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationMessageSearchRequestBody.conv_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, conversationMessageSearchRequestBody.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationMessageSearchRequestBody.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(5, conversationMessageSearchRequestBody.frag_size) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationMessageSearchRequestBody.scroll_id) + conversationMessageSearchRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessageSearchRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.search_query(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.frag_size(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.scroll_id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationMessageSearchRequestBody.search_query);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationMessageSearchRequestBody.conv_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, conversationMessageSearchRequestBody.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationMessageSearchRequestBody.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, conversationMessageSearchRequestBody.frag_size);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationMessageSearchRequestBody.scroll_id);
            protoWriter.writeBytes(conversationMessageSearchRequestBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23320);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationMessageSearchRequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ConversationMessageSearchRequestBody, Builder> {
        public Long conv_short_id;
        public Long end_time;
        public Integer frag_size;
        public String scroll_id;
        public String search_query;
        public Long start_time;

        static {
            Covode.recordClassIndex(23321);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationMessageSearchRequestBody build() {
            String str = this.search_query;
            if (str != null && this.conv_short_id != null) {
                return new ConversationMessageSearchRequestBody(this.search_query, this.conv_short_id, this.start_time, this.end_time, this.frag_size, this.scroll_id, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "search_query", this.conv_short_id, "conv_short_id");
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder end_time(Long l2) {
            this.end_time = l2;
            return this;
        }

        public final Builder frag_size(Integer num) {
            this.frag_size = num;
            return this;
        }

        public final Builder scroll_id(String str) {
            this.scroll_id = str;
            return this;
        }

        public final Builder search_query(String str) {
            this.search_query = str;
            return this;
        }

        public final Builder start_time(Long l2) {
            this.start_time = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationMessageSearchRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationMessageSearchRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.search_query = this.search_query;
        builder.conv_short_id = this.conv_short_id;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.frag_size = this.frag_size;
        builder.scroll_id = this.scroll_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationMessageSearchRequestBody(String str, Long l2, Long l3, Long l4, Integer num, String str2) {
        this(str, l2, l3, l4, num, str2, i.EMPTY);
    }

    public ConversationMessageSearchRequestBody(String str, Long l2, Long l3, Long l4, Integer num, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.search_query = str;
        this.conv_short_id = l2;
        this.start_time = l3;
        this.end_time = l4;
        this.frag_size = num;
        this.scroll_id = str2;
    }
}
