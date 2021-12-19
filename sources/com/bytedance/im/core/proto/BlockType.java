package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BlockType implements WireEnum {
    MEMBER(1),
    CONVERSATION_NOT_MANAGERS(2),
    CONVERSATION_ALL(3);
    
    public static final ProtoAdapter<BlockType> ADAPTER = new ProtoAdapter_BlockType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BlockType extends EnumAdapter<BlockType> {
        static {
            Covode.recordClassIndex(23239);
        }

        ProtoAdapter_BlockType() {
            super(BlockType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BlockType fromValue(int i2) {
            return BlockType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23238);
    }

    public static BlockType fromValue(int i2) {
        if (i2 == 1) {
            return MEMBER;
        }
        if (i2 == 2) {
            return CONVERSATION_NOT_MANAGERS;
        }
        if (i2 != 3) {
            return null;
        }
        return CONVERSATION_ALL;
    }

    private BlockType(int i2) {
        this.value = i2;
    }
}
