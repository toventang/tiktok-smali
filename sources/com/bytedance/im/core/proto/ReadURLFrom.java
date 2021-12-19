package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ReadURLFrom implements WireEnum {
    URL_VSDK(1),
    URL_IMAGEX(2);
    
    public static final ProtoAdapter<ReadURLFrom> ADAPTER = new ProtoAdapter_ReadURLFrom();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ReadURLFrom extends EnumAdapter<ReadURLFrom> {
        static {
            Covode.recordClassIndex(23705);
        }

        ProtoAdapter_ReadURLFrom() {
            super(ReadURLFrom.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ReadURLFrom fromValue(int i2) {
            return ReadURLFrom.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23704);
    }

    public static ReadURLFrom fromValue(int i2) {
        if (i2 == 1) {
            return URL_VSDK;
        }
        if (i2 != 2) {
            return null;
        }
        return URL_IMAGEX;
    }

    private ReadURLFrom(int i2) {
        this.value = i2;
    }
}
