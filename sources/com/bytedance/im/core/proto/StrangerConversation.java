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
import java.util.Map;
import k.i;

public final class StrangerConversation extends Message<StrangerConversation, Builder> {
    public static final ProtoAdapter<StrangerConversation> ADAPTER = new ProtoAdapter_StrangerConversation();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_UNREAD = 0;
    private static final long serialVersionUID = 0;
    @c(a = "badge_count")
    public final Integer badge_count;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "last_message")
    public final MessageBody last_message;
    @c(a = "participants")
    public final List<Participant> participants;
    @c(a = "unread")
    public final Integer unread;

    static final class ProtoAdapter_StrangerConversation extends ProtoAdapter<StrangerConversation> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23781);
        }

        public ProtoAdapter_StrangerConversation() {
            super(FieldEncoding.LENGTH_DELIMITED, StrangerConversation.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.StrangerConversation$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.StrangerConversation redact(com.bytedance.im.core.proto.StrangerConversation r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.StrangerConversation$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.MessageBody r0 = r2.last_message
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r1 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.bytedance.im.core.proto.MessageBody r0 = r2.last_message
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.MessageBody r0 = (com.bytedance.im.core.proto.MessageBody) r0
                r2.last_message = r0
            L_0x0014:
                java.util.List<com.bytedance.im.core.proto.Participant> r1 = r2.participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Participant> r0 = com.bytedance.im.core.proto.Participant.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.StrangerConversation r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.StrangerConversation.ProtoAdapter_StrangerConversation.redact(com.bytedance.im.core.proto.StrangerConversation):com.bytedance.im.core.proto.StrangerConversation");
        }

        public final int encodedSize(StrangerConversation strangerConversation) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, strangerConversation.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, strangerConversation.unread) + MessageBody.ADAPTER.encodedSizeWithTag(3, strangerConversation.last_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, strangerConversation.conversation_id) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(5, strangerConversation.participants) + ProtoAdapter.INT32.encodedSizeWithTag(6, strangerConversation.badge_count) + this.ext.encodedSizeWithTag(7, strangerConversation.ext) + strangerConversation.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StrangerConversation decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.unread(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.last_message(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.participants.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
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

        public final void encode(ProtoWriter protoWriter, StrangerConversation strangerConversation) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, strangerConversation.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, strangerConversation.unread);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 3, strangerConversation.last_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, strangerConversation.conversation_id);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, strangerConversation.participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, strangerConversation.badge_count);
            this.ext.encodeWithTag(protoWriter, 7, strangerConversation.ext);
            protoWriter.writeBytes(strangerConversation.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<StrangerConversation, Builder> {
        public Integer badge_count;
        public String conversation_id;
        public Long conversation_short_id;
        public Map<String, String> ext = Internal.newMutableMap();
        public MessageBody last_message;
        public List<Participant> participants = Internal.newMutableList();
        public Integer unread;

        static {
            Covode.recordClassIndex(23780);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StrangerConversation build() {
            return new StrangerConversation(this.conversation_short_id, this.unread, this.last_message, this.conversation_id, this.participants, this.badge_count, this.ext, super.buildUnknownFields());
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
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

        public final Builder last_message(MessageBody messageBody) {
            this.last_message = messageBody;
            return this;
        }

        public final Builder unread(Integer num) {
            this.unread = num;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder participants(List<Participant> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23779);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "StrangerConversation" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.StrangerConversation$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StrangerConversation, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.unread = this.unread;
        builder.last_message = this.last_message;
        builder.conversation_id = this.conversation_id;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.badge_count = this.badge_count;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public StrangerConversation(Long l2, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map) {
        this(l2, num, messageBody, str, list, num2, map, i.EMPTY);
    }

    public StrangerConversation(Long l2, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
        this.unread = num;
        this.last_message = messageBody;
        this.conversation_id = str;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.badge_count = num2;
        this.ext = Internal.immutableCopyOf("ext", map);
    }
}
