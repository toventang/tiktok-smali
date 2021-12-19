package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class MessagesPerUserInitV2RequestBody extends Message<MessagesPerUserInitV2RequestBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserInitV2RequestBody> ADAPTER = new ProtoAdapter_MessagesPerUserInitV2RequestBody();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_INIT_SUB_TYPE = 0;
    public static final Integer DEFAULT_NEW_USER = 0;
    private static final long serialVersionUID = 0;
    @c(a = "cursor")
    public final Long cursor;
    @c(a = "init_sub_type")
    public final Integer init_sub_type;
    @c(a = "new_user")
    public final Integer new_user;

    static final class ProtoAdapter_MessagesPerUserInitV2RequestBody extends ProtoAdapter<MessagesPerUserInitV2RequestBody> {
        static {
            Covode.recordClassIndex(23613);
        }

        public ProtoAdapter_MessagesPerUserInitV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserInitV2RequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody redact(com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody.ProtoAdapter_MessagesPerUserInitV2RequestBody.redact(com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody):com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody");
        }

        public final int encodedSize(MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerUserInitV2RequestBody.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesPerUserInitV2RequestBody.new_user) + ProtoAdapter.INT32.encodedSizeWithTag(3, messagesPerUserInitV2RequestBody.init_sub_type) + messagesPerUserInitV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserInitV2RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.new_user(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.init_sub_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerUserInitV2RequestBody.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesPerUserInitV2RequestBody.new_user);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messagesPerUserInitV2RequestBody.init_sub_type);
            protoWriter.writeBytes(messagesPerUserInitV2RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MessagesPerUserInitV2RequestBody, Builder> {
        public Long cursor;
        public Integer init_sub_type;
        public Integer new_user;

        static {
            Covode.recordClassIndex(23612);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesPerUserInitV2RequestBody build() {
            return new MessagesPerUserInitV2RequestBody(this.cursor, this.new_user, this.init_sub_type, super.buildUnknownFields());
        }

        public final Builder cursor(Long l2) {
            this.cursor = l2;
            return this;
        }

        public final Builder init_sub_type(Integer num) {
            this.init_sub_type = num;
            return this;
        }

        public final Builder new_user(Integer num) {
            this.new_user = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23611);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesPerUserInitV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesPerUserInitV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.new_user = this.new_user;
        builder.init_sub_type = this.init_sub_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesPerUserInitV2RequestBody" + h.f38770a.b(this).toString();
    }

    public MessagesPerUserInitV2RequestBody(Long l2, Integer num, Integer num2) {
        this(l2, num, num2, i.EMPTY);
    }

    public MessagesPerUserInitV2RequestBody(Long l2, Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.cursor = l2;
        this.new_user = num;
        this.init_sub_type = num2;
    }
}
