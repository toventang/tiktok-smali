package com.ss.android.ugc.aweme.utils;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ij<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f143100a = true;

    /* renamed from: b  reason: collision with root package name */
    private T f143101b;

    static {
        Covode.recordClassIndex(93671);
    }

    private final void a(T t) {
        this.f143101b = t;
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        if (this.f143100a) {
            a(t);
            this.f143100a = false;
        } else if (!l.a((Object) this.f143101b, (Object) t)) {
            a(t);
        }
    }
}
