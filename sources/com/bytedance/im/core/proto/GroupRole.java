package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum GroupRole implements WireEnum {
    ORDINARY(0),
    OWNER(1),
    MANAGER(2),
    VISITOR(3),
    SYSTEM(4);
    
    public static final ProtoAdapter<GroupRole> ADAPTER = new ProtoAdapter_GroupRole();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_GroupRole extends EnumAdapter<GroupRole> {
        static {
            Covode.recordClassIndex(23530);
        }

        ProtoAdapter_GroupRole() {
            super(GroupRole.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final GroupRole fromValue(int i2) {
            return GroupRole.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23529);
    }

    public static GroupRole fromValue(int i2) {
        if (i2 == 0) {
            return ORDINARY;
        }
        if (i2 == 1) {
            return OWNER;
        }
        if (i2 == 2) {
            return MANAGER;
        }
        if (i2 == 3) {
            return VISITOR;
        }
        if (i2 != 4) {
            return null;
        }
        return SYSTEM;
    }

    private GroupRole(int i2) {
        this.value = i2;
    }
}
