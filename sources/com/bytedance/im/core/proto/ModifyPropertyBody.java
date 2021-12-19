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

public final class ModifyPropertyBody extends Message<ModifyPropertyBody, Builder> {
    public static final ProtoAdapter<ModifyPropertyBody> ADAPTER = new ProtoAdapter_ModifyPropertyBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "client_message_id")
    public final String client_message_id;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "modify_property_content")
    public final List<ModifyPropertyContent> modify_property_content;
    @c(a = "server_message_id")
    public final Long server_message_id;

    static final class ProtoAdapter_ModifyPropertyBody extends ProtoAdapter<ModifyPropertyBody> {
        static {
            Covode.recordClassIndex(23633);
        }

        public ProtoAdapter_ModifyPropertyBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyPropertyBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ModifyPropertyBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ModifyPropertyBody redact(com.bytedance.im.core.proto.ModifyPropertyBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ModifyPropertyBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ModifyPropertyContent> r1 = r2.modify_property_content
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ModifyPropertyContent> r0 = com.bytedance.im.core.proto.ModifyPropertyContent.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ModifyPropertyBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ModifyPropertyBody.ProtoAdapter_ModifyPropertyBody.redact(com.bytedance.im.core.proto.ModifyPropertyBody):com.bytedance.im.core.proto.ModifyPropertyBody");
        }

        public final int encodedSize(ModifyPropertyBody modifyPropertyBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, modifyPropertyBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, modifyPropertyBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, modifyPropertyBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, modifyPropertyBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, modifyPropertyBody.client_message_id) + ModifyPropertyContent.ADAPTER.asRepeated().encodedSizeWithTag(6, modifyPropertyBody.modify_property_content) + modifyPropertyBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyPropertyBody decode(ProtoReader protoReader) {
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
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.client_message_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.modify_property_content.add(ModifyPropertyContent.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ModifyPropertyBody modifyPropertyBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifyPropertyBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifyPropertyBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, modifyPropertyBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, modifyPropertyBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, modifyPropertyBody.client_message_id);
            ModifyPropertyContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, modifyPropertyBody.modify_property_content);
            protoWriter.writeBytes(modifyPropertyBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ModifyPropertyBody, Builder> {
        public String client_message_id;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<ModifyPropertyContent> modify_property_content = Internal.newMutableList();
        public Long server_message_id;

        static {
            Covode.recordClassIndex(23632);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ModifyPropertyBody build() {
            return new ModifyPropertyBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_id, this.client_message_id, this.modify_property_content, super.buildUnknownFields());
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
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

        public final Builder server_message_id(Long l2) {
            this.server_message_id = l2;
            return this;
        }

        public final Builder modify_property_content(List<ModifyPropertyContent> list) {
            Internal.checkElementsNotNull(list);
            this.modify_property_content = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23631);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ModifyPropertyBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ModifyPropertyBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ModifyPropertyBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_id = this.server_message_id;
        builder.client_message_id = this.client_message_id;
        builder.modify_property_content = Internal.copyOf("modify_property_content", this.modify_property_content);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ModifyPropertyBody(String str, Integer num, Long l2, Long l3, String str2, List<ModifyPropertyContent> list) {
        this(str, num, l2, l3, str2, list, i.EMPTY);
    }

    public ModifyPropertyBody(String str, Integer num, Long l2, Long l3, String str2, List<ModifyPropertyContent> list, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.server_message_id = l3;
        this.client_message_id = str2;
        this.modify_property_content = Internal.immutableCopyOf("modify_property_content", list);
    }
}
