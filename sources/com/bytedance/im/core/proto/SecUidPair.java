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

public final class SecUidPair extends Message<SecUidPair, Builder> {
    public static final ProtoAdapter<SecUidPair> ADAPTER = new ProtoAdapter_SecUidPair();
    public static final Long DEFAULT_UID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "sec_uid")
    public final String sec_uid;
    @c(a = "uid")
    public final Long uid;

    static final class ProtoAdapter_SecUidPair extends ProtoAdapter<SecUidPair> {
        static {
            Covode.recordClassIndex(23737);
        }

        public ProtoAdapter_SecUidPair() {
            super(FieldEncoding.LENGTH_DELIMITED, SecUidPair.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.SecUidPair$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SecUidPair redact(com.bytedance.im.core.proto.SecUidPair r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SecUidPair$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SecUidPair r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SecUidPair.ProtoAdapter_SecUidPair.redact(com.bytedance.im.core.proto.SecUidPair):com.bytedance.im.core.proto.SecUidPair");
        }

        public final int encodedSize(SecUidPair secUidPair) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, secUidPair.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, secUidPair.sec_uid) + secUidPair.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SecUidPair decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.uid(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SecUidPair secUidPair) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, secUidPair.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, secUidPair.sec_uid);
            protoWriter.writeBytes(secUidPair.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SecUidPair, Builder> {
        public String sec_uid;
        public Long uid;

        static {
            Covode.recordClassIndex(23736);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SecUidPair build() {
            return new SecUidPair(this.uid, this.sec_uid, super.buildUnknownFields());
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(Long l2) {
            this.uid = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23735);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SecUidPair$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SecUidPair, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.sec_uid = this.sec_uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SecUidPair" + h.f38770a.b(this).toString();
    }

    public SecUidPair(Long l2, String str) {
        this(l2, str, i.EMPTY);
    }

    public SecUidPair(Long l2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.uid = l2;
        this.sec_uid = str;
    }
}
