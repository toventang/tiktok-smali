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
import java.util.Map;
import k.i;

public final class BlockMembersRequestBody extends Message<BlockMembersRequestBody, Builder> {
    public static final ProtoAdapter<BlockMembersRequestBody> ADAPTER = new ProtoAdapter_BlockMembersRequestBody();
    public static final BlockStatus DEFAULT_BLOCK_STATUS = BlockStatus.UNBLOCK;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "biz_ext")
    public final Map<String, String> biz_ext;
    @c(a = "block_status")
    public final BlockStatus block_status;
    @c(a = "block_time")
    public final Map<Long, Long> block_time;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;

    public static final class Builder extends Message.Builder<BlockMembersRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public BlockStatus block_status;
        public Map<Long, Long> block_time = Internal.newMutableMap();
        public Long conv_short_id;
        public String conversation_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23231);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BlockMembersRequestBody build() {
            return new BlockMembersRequestBody(this.block_status, this.block_time, this.conv_short_id, this.conversation_type, this.conversation_id, this.biz_ext, super.buildUnknownFields());
        }

        public final Builder block_status(BlockStatus blockStatus) {
            this.block_status = blockStatus;
            return this;
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder block_time(Map<Long, Long> map) {
            Internal.checkElementsNotNull(map);
            this.block_time = map;
            return this;
        }
    }

    static final class ProtoAdapter_BlockMembersRequestBody extends ProtoAdapter<BlockMembersRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;
        private final ProtoAdapter<Map<Long, Long>> block_time;

        static {
            Covode.recordClassIndex(23232);
        }

        public ProtoAdapter_BlockMembersRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockMembersRequestBody.class);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.block_time = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.BlockMembersRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.BlockMembersRequestBody redact(com.bytedance.im.core.proto.BlockMembersRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BlockMembersRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BlockMembersRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.BlockMembersRequestBody.ProtoAdapter_BlockMembersRequestBody.redact(com.bytedance.im.core.proto.BlockMembersRequestBody):com.bytedance.im.core.proto.BlockMembersRequestBody");
        }

        public final int encodedSize(BlockMembersRequestBody blockMembersRequestBody) {
            return BlockStatus.ADAPTER.encodedSizeWithTag(1, blockMembersRequestBody.block_status) + this.block_time.encodedSizeWithTag(2, blockMembersRequestBody.block_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, blockMembersRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, blockMembersRequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(5, blockMembersRequestBody.conversation_id) + this.biz_ext.encodedSizeWithTag(11, blockMembersRequestBody.biz_ext) + blockMembersRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BlockMembersRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.block_status(BlockStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 2) {
                    builder.block_time.putAll(this.block_time.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 5) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.biz_ext.putAll(this.biz_ext.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BlockMembersRequestBody blockMembersRequestBody) {
            BlockStatus.ADAPTER.encodeWithTag(protoWriter, 1, blockMembersRequestBody.block_status);
            this.block_time.encodeWithTag(protoWriter, 2, blockMembersRequestBody.block_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, blockMembersRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, blockMembersRequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, blockMembersRequestBody.conversation_id);
            this.biz_ext.encodeWithTag(protoWriter, 11, blockMembersRequestBody.biz_ext);
            protoWriter.writeBytes(blockMembersRequestBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23230);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BlockMembersRequestBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BlockMembersRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BlockMembersRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.block_status = this.block_status;
        builder.block_time = Internal.copyOf("block_time", this.block_time);
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_id = this.conversation_id;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BlockMembersRequestBody(BlockStatus blockStatus, Map<Long, Long> map, Long l2, Integer num, String str, Map<String, String> map2) {
        this(blockStatus, map, l2, num, str, map2, i.EMPTY);
    }

    public BlockMembersRequestBody(BlockStatus blockStatus, Map<Long, Long> map, Long l2, Integer num, String str, Map<String, String> map2, i iVar) {
        super(ADAPTER, iVar);
        this.block_status = blockStatus;
        this.block_time = Internal.immutableCopyOf("block_time", map);
        this.conv_short_id = l2;
        this.conversation_type = num;
        this.conversation_id = str;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map2);
    }
}
