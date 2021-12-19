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

public final class ParticipantReadIndex extends Message<ParticipantReadIndex, Builder> {
    public static final ProtoAdapter<ParticipantReadIndex> ADAPTER = new ProtoAdapter_ParticipantReadIndex();
    public static final Long DEFAULT_INDEX = 0L;
    public static final Long DEFAULT_INDEX_MIN = 0L;
    public static final Long DEFAULT_INDEX_V2 = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "index")
    public final Long index;
    @c(a = "index_min")
    public final Long index_min;
    @c(a = "index_v2")
    public final Long index_v2;
    @c(a = "sec_uid")
    public final String sec_uid;
    @c(a = "user_id")
    public final Long user_id;

    static final class ProtoAdapter_ParticipantReadIndex extends ProtoAdapter<ParticipantReadIndex> {
        static {
            Covode.recordClassIndex(23671);
        }

        public ProtoAdapter_ParticipantReadIndex() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantReadIndex.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ParticipantReadIndex$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ParticipantReadIndex redact(com.bytedance.im.core.proto.ParticipantReadIndex r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ParticipantReadIndex$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ParticipantReadIndex r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ParticipantReadIndex.ProtoAdapter_ParticipantReadIndex.redact(com.bytedance.im.core.proto.ParticipantReadIndex):com.bytedance.im.core.proto.ParticipantReadIndex");
        }

        public final int encodedSize(ParticipantReadIndex participantReadIndex) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, participantReadIndex.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, participantReadIndex.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantReadIndex.index) + ProtoAdapter.INT64.encodedSizeWithTag(4, participantReadIndex.index_v2) + ProtoAdapter.INT64.encodedSizeWithTag(5, participantReadIndex.index_min) + participantReadIndex.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ParticipantReadIndex decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.index(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.index_v2(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.index_min(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ParticipantReadIndex participantReadIndex) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, participantReadIndex.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, participantReadIndex.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantReadIndex.index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, participantReadIndex.index_v2);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, participantReadIndex.index_min);
            protoWriter.writeBytes(participantReadIndex.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ParticipantReadIndex, Builder> {
        public Long index;
        public Long index_min;
        public Long index_v2;
        public String sec_uid;
        public Long user_id;

        static {
            Covode.recordClassIndex(23670);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ParticipantReadIndex build() {
            return new ParticipantReadIndex(this.user_id, this.sec_uid, this.index, this.index_v2, this.index_min, super.buildUnknownFields());
        }

        public final Builder index(Long l2) {
            this.index = l2;
            return this;
        }

        public final Builder index_min(Long l2) {
            this.index_min = l2;
            return this;
        }

        public final Builder index_v2(Long l2) {
            this.index_v2 = l2;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23669);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ParticipantReadIndex" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ParticipantReadIndex$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ParticipantReadIndex, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.sec_uid = this.sec_uid;
        builder.index = this.index;
        builder.index_v2 = this.index_v2;
        builder.index_min = this.index_min;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ParticipantReadIndex(Long l2, String str, Long l3, Long l4, Long l5) {
        this(l2, str, l3, l4, l5, i.EMPTY);
    }

    public ParticipantReadIndex(Long l2, String str, Long l3, Long l4, Long l5, i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l2;
        this.sec_uid = str;
        this.index = l3;
        this.index_v2 = l4;
        this.index_min = l5;
    }
}
