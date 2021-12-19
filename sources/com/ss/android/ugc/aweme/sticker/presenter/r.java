package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f135428a;

    static {
        Covode.recordClassIndex(88475);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof r) && this.f135428a == ((r) obj).f135428a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f135428a;
    }

    public final String toString() {
        return "StickerTabInfo(index=" + this.f135428a + ")";
    }

    private /* synthetic */ r() {
        this(-1);
    }

    public r(int i2) {
        this.f135428a = i2;
    }
}
