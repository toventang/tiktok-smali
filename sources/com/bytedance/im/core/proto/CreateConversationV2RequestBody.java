package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import java.util.Map;
import k.i;

public final class CreateConversationV2RequestBody extends Message<CreateConversationV2RequestBody, Builder> {
    public static final ProtoAdapter<CreateConversationV2RequestBody> ADAPTER = new ProtoAdapter_CreateConversationV2RequestBody();
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_PERSISTENT = false;
    private static final long serialVersionUID = 0;
    @c(a = "avatar_url")
    public final String avatar_url;
    @c(a = "biz_ext")
    public final Map<String, String> biz_ext;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "description")
    public final String description;
    @c(a = "idempotent_id")
    public final String idempotent_id;
    @c(a = StringSet.name)
    public final String name;
    @c(a = "participants")
    public final List<Long> participants;
    @c(a = "persistent")
    public final Boolean persistent;

    static final class ProtoAdapter_CreateConversationV2RequestBody extends ProtoAdapter<CreateConversationV2RequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        static {
            Covode.recordClassIndex(23359);
        }

        public ProtoAdapter_CreateConversationV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2RequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.CreateConversationV2RequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.CreateConversationV2RequestBody redact(com.bytedance.im.core.proto.CreateConversationV2RequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.CreateConversationV2RequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.CreateConversationV2RequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.CreateConversationV2RequestBody.ProtoAdapter_CreateConversationV2RequestBody.redact(com.bytedance.im.core.proto.CreateConversationV2RequestBody):com.bytedance.im.core.proto.CreateConversationV2RequestBody");
        }

        public final int encodedSize(CreateConversationV2RequestBody createConversationV2RequestBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, createConversationV2RequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, createConversationV2RequestBody.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(3, createConversationV2RequestBody.persistent) + ProtoAdapter.STRING.encodedSizeWithTag(4, createConversationV2RequestBody.idempotent_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, createConversationV2RequestBody.name) + ProtoAdapter.STRING.encodedSizeWithTag(7, createConversationV2RequestBody.avatar_url) + ProtoAdapter.STRING.encodedSizeWithTag(8, createConversationV2RequestBody.description) + this.biz_ext.encodedSizeWithTag(11, createConversationV2RequestBody.biz_ext) + createConversationV2RequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreateConversationV2RequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.persistent(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.idempotent_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 6) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 7) {
                    builder.avatar_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 8) {
                    builder.description(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreateConversationV2RequestBody createConversationV2RequestBody) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, createConversationV2RequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, createConversationV2RequestBody.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createConversationV2RequestBody.persistent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createConversationV2RequestBody.idempotent_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createConversationV2RequestBody.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, createConversationV2RequestBody.avatar_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, createConversationV2RequestBody.description);
            this.biz_ext.encodeWithTag(protoWriter, 11, createConversationV2RequestBody.biz_ext);
            protoWriter.writeBytes(createConversationV2RequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CreateConversationV2RequestBody, Builder> {
        public String avatar_url;
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public Integer conversation_type;
        public String description;
        public String idempotent_id;
        public String name;
        public List<Long> participants = Internal.newMutableList();
        public Boolean persistent;

        static {
            Covode.recordClassIndex(23358);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CreateConversationV2RequestBody build() {
            return new CreateConversationV2RequestBody(this.conversation_type, this.participants, this.persistent, this.idempotent_id, this.name, this.avatar_url, this.description, this.biz_ext, super.buildUnknownFields());
        }

        public final Builder avatar_url(String str) {
            this.avatar_url = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder persistent(Boolean bool) {
            this.persistent = bool;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23357);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "CreateConversationV2RequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.CreateConversationV2RequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CreateConversationV2RequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.persistent = this.persistent;
        builder.idempotent_id = this.idempotent_id;
        builder.name = this.name;
        builder.avatar_url = this.avatar_url;
        builder.description = this.description;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map) {
        this(num, list, bool, str, str2, str3, str4, map, i.EMPTY);
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.persistent = bool;
        this.idempotent_id = str;
        this.name = str2;
        this.avatar_url = str3;
        this.description = str4;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
