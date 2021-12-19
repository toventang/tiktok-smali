package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MuteMessageType implements WireEnum {
    TYPE_MENTION(1),
    TYPE_SEND_BY_GROUP_OWNER(2),
    TYPE_AUTO_SEND_BY_SERVER(3),
    TYPE_MENTION_AND_SEND_BY_GROUP_OWNER(4);
    
    public static final ProtoAdapter<MuteMessageType> ADAPTER = new ProtoAdapter_MuteMessageType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MuteMessageType extends EnumAdapter<MuteMessageType> {
        static {
            Covode.recordClassIndex(23650);
        }

        ProtoAdapter_MuteMessageType() {
            super(MuteMessageType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MuteMessageType fromValue(int i2) {
            return MuteMessageType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23649);
    }

    public static MuteMessageType fromValue(int i2) {
        if (i2 == 1) {
            return TYPE_MENTION;
        }
        if (i2 == 2) {
            return TYPE_SEND_BY_GROUP_OWNER;
        }
        if (i2 == 3) {
            return TYPE_AUTO_SEND_BY_SERVER;
        }
        if (i2 != 4) {
            return null;
        }
        return TYPE_MENTION_AND_SEND_BY_GROUP_OWNER;
    }

    private MuteMessageType(int i2) {
        this.value = i2;
    }
}
