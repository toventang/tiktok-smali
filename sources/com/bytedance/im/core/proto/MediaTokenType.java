package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MediaTokenType implements WireEnum {
    VSDK(1),
    IMAGEX(2);
    
    public static final ProtoAdapter<MediaTokenType> ADAPTER = new ProtoAdapter_MediaTokenType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MediaTokenType extends EnumAdapter<MediaTokenType> {
        static {
            Covode.recordClassIndex(23581);
        }

        ProtoAdapter_MediaTokenType() {
            super(MediaTokenType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MediaTokenType fromValue(int i2) {
            return MediaTokenType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23580);
    }

    public static MediaTokenType fromValue(int i2) {
        if (i2 == 1) {
            return VSDK;
        }
        if (i2 != 2) {
            return null;
        }
        return IMAGEX;
    }

    private MediaTokenType(int i2) {
        this.value = i2;
    }
}
