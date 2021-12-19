package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum TokenType implements WireEnum {
    DEFAULT_TOKEN(0),
    APP_TOKEN(1),
    SERVER_TOKEN(2);
    
    public static final ProtoAdapter<TokenType> ADAPTER = new ProtoAdapter_TokenType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_TokenType extends EnumAdapter<TokenType> {
        static {
            Covode.recordClassIndex(23791);
        }

        ProtoAdapter_TokenType() {
            super(TokenType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final TokenType fromValue(int i2) {
            return TokenType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23790);
    }

    public static TokenType fromValue(int i2) {
        if (i2 == 0) {
            return DEFAULT_TOKEN;
        }
        if (i2 == 1) {
            return APP_TOKEN;
        }
        if (i2 != 2) {
            return null;
        }
        return SERVER_TOKEN;
    }

    private TokenType(int i2) {
        this.value = i2;
    }
}
