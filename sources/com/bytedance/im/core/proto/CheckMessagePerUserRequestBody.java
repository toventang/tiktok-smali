package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class CheckMessagePerUserRequestBody extends Message<CheckMessagePerUserRequestBody, Builder> {
    public static final ProtoAdapter<CheckMessagePerUserRequestBody> ADAPTER = new ProtoAdapter_CheckMessagePerUserRequestBody();
    private static final long serialVersionUID = 0;
    @c(a = "checks")
    public final List<InboxMessagesPerUser> checks;

    static final class ProtoAdapter_CheckMessagePerUserRequestBody extends ProtoAdapter<CheckMessagePerUserRequestBody> {
        static {
            Covode.recordClassIndex(23254);
        }

        public ProtoAdapter_CheckMessagePerUserRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckMessagePerUserRequestBody.class);
        }

        public final int encodedSize(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            return InboxMessagesPerUser.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagePerUserRequestBody.checks) + checkMessagePerUserRequestBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.CheckMessagePerUserRequestBody redact(com.bytedance.im.core.proto.CheckMessagePerUserRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.InboxMessagesPerUser> r1 = r2.checks
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.InboxMessagesPerUser> r0 = com.bytedance.im.core.proto.InboxMessagesPerUser.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.CheckMessagePerUserRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.CheckMessagePerUserRequestBody.ProtoAdapter_CheckMessagePerUserRequestBody.redact(com.bytedance.im.core.proto.CheckMessagePerUserRequestBody):com.bytedance.im.core.proto.CheckMessagePerUserRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckMessagePerUserRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.checks.add(InboxMessagesPerUser.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            InboxMessagesPerUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagePerUserRequestBody.checks);
            protoWriter.writeBytes(checkMessagePerUserRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CheckMessagePerUserRequestBody, Builder> {
        public List<InboxMessagesPerUser> checks = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23253);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CheckMessagePerUserRequestBody build() {
            return new CheckMessagePerUserRequestBody(this.checks, super.buildUnknownFields());
        }

        public final Builder checks(List<InboxMessagesPerUser> list) {
            Internal.checkElementsNotNull(list);
            this.checks = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23252);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CheckMessagePerUserRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.checks = Internal.copyOf("checks", this.checks);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "CheckMessagePerUserRequestBody" + h.f38770a.b(this).toString();
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list) {
        this(list, i.EMPTY);
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list, i iVar) {
        super(ADAPTER, iVar);
        this.checks = Internal.immutableCopyOf("checks", list);
    }
}
