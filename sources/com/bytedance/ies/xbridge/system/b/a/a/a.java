package com.bytedance.ies.xbridge.system.b.a.a;

import com.bytedance.covode.number.Covode;

public enum a {
    Failed(0),
    UnauthorizedInvocation(-1),
    UnregisteredMethod(-2),
    InvalidParameter(-3),
    InvalidResult(-5),
    Success(1),
    UnauthorizedAccess(-6),
    OperationCancelled(-7),
    OperationTimeout(-8),
    ArgumentError(100),
    NoAccount(1000),
    NotFound(-9),
    NotImplemented(-10),
    AlreadyExists(-11),
    Unknown(-1000);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(21861);
    }

    private a(int i2) {
        this.value = i2;
    }
}
