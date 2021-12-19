package com.ss.android.ugc.aweme.sticker.presenter.handler.c;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f135383a;

    static {
        Covode.recordClassIndex(88436);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f135383a == ((b) obj).f135383a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f135383a;
    }

    public final String toString() {
        return "StickerHandleResponse(result=" + this.f135383a + ")";
    }

    public b(int i2) {
        this.f135383a = i2;
    }
}
