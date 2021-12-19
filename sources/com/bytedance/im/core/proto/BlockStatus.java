package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BlockStatus implements WireEnum {
    UNBLOCK(0),
    BLOCK(1);
    
    public static final ProtoAdapter<BlockStatus> ADAPTER = new ProtoAdapter_BlockStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BlockStatus extends EnumAdapter<BlockStatus> {
        static {
            Covode.recordClassIndex(23237);
        }

        ProtoAdapter_BlockStatus() {
            super(BlockStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BlockStatus fromValue(int i2) {
            return BlockStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23236);
    }

    public static BlockStatus fromValue(int i2) {
        if (i2 == 0) {
            return UNBLOCK;
        }
        if (i2 != 1) {
            return null;
        }
        return BLOCK;
    }

    private BlockStatus(int i2) {
        this.value = i2;
    }
}
