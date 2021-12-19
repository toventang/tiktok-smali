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

public final class BlockMembersResponseBody extends Message<BlockMembersResponseBody, Builder> {
    public static final ProtoAdapter<BlockMembersResponseBody> ADAPTER = new ProtoAdapter_BlockMembersResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "failed_members")
    public final List<Long> failed_members;

    static final class ProtoAdapter_BlockMembersResponseBody extends ProtoAdapter<BlockMembersResponseBody> {
        static {
            Covode.recordClassIndex(23235);
        }

        public ProtoAdapter_BlockMembersResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockMembersResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.BlockMembersResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BlockMembersResponseBody redact(com.bytedance.im.core.proto.BlockMembersResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockMembersResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockMembersResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BlockMembersResponseBody.ProtoAdapter_BlockMembersResponseBody.redact(com.bytedance.im.core.proto.BlockMembersResponseBody):com.bytedance.im.core.proto.BlockMembersResponseBody");
        }

        public final int encodedSize(BlockMembersResponseBody blockMembersResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, blockMembersResponseBody.failed_members) + blockMembersResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockMembersResponseBody decode(ProtoReader protoReader) {
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
                    builder.failed_members.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockMembersResponseBody blockMembersResponseBody) {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, blockMembersResponseBody.failed_members);
            protoWriter.writeBytes(blockMembersResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BlockMembersResponseBody, Builder> {
        public List<Long> failed_members = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23234);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockMembersResponseBody build() {
            return new BlockMembersResponseBody(this.failed_members, super.buildUnknownFields());
        }

        public final Builder failed_members(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_members = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23233);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockMembersResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockMembersResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.failed_members = Internal.copyOf("failed_members", this.failed_members);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockMembersResponseBody" + h.f38770a.b(this).toString();
    }

    public BlockMembersResponseBody(List<Long> list) {
        this(list, i.EMPTY);
    }

    public BlockMembersResponseBody(List<Long> list, i iVar) {
        super(ADAPTER, iVar);
        this.failed_members = Internal.immutableCopyOf("failed_members", list);
    }
}
