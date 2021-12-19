package com.bytedance.assem.arch.viewModel;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import f.a.d.d;
import h.c.f;
import h.f.b.l;
import kotlinx.coroutines.android.c;

public final class k<R> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25722a;

    /* renamed from: b  reason: collision with root package name */
    public d<R, R> f25723b = a.f25731a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25724c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25725d;

    /* renamed from: e  reason: collision with root package name */
    public f f25726e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25727f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25728g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25729h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f25730i;

    static {
        Covode.recordClassIndex(15010);
    }

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        l.a((Object) mainLooper, "");
        this.f25726e = c.a(a.a(mainLooper), "fast-main");
        this.f25730i = 0;
    }

    public final void a(boolean z) {
        this.f25724c = z;
        this.f25725d = true;
    }

    static final class a<T1, T2> implements d<R, R> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25731a = new a();

        static {
            Covode.recordClassIndex(15011);
        }

        a() {
        }

        @Override // f.a.d.d
        public final boolean a(R r, R r2) {
            return l.a((Object) r, (Object) r2);
        }
    }
}
