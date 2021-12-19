package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MediaType implements WireEnum {
    IMG(1),
    VIDEO(2),
    AUDIO(3),
    FILE(4),
    OTHER(10);
    
    public static final ProtoAdapter<MediaType> ADAPTER = new ProtoAdapter_MediaType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MediaType extends EnumAdapter<MediaType> {
        static {
            Covode.recordClassIndex(23583);
        }

        ProtoAdapter_MediaType() {
            super(MediaType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MediaType fromValue(int i2) {
            return MediaType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23582);
    }

    public static MediaType fromValue(int i2) {
        if (i2 == 1) {
            return IMG;
        }
        if (i2 == 2) {
            return VIDEO;
        }
        if (i2 == 3) {
            return AUDIO;
        }
        if (i2 == 4) {
            return FILE;
        }
        if (i2 != 10) {
            return null;
        }
        return OTHER;
    }

    private MediaType(int i2) {
        this.value = i2;
    }
}
