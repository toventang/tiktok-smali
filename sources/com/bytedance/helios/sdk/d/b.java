package com.bytedance.helios.sdk.d;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.ab;
import com.bytedance.helios.sdk.utils.g;

public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f30854b = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<e> f30855a = new SparseArray<>();

    /* access modifiers changed from: protected */
    public abstract void a(d dVar, Throwable th);

    public abstract int[] a();

    static {
        Covode.recordClassIndex(17918);
    }

    public final e a(int i2) {
        return this.f30855a.get(i2);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, e eVar) {
        this.f30855a.put(i2, eVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th, e eVar, d dVar) {
        StackTraceElement[] b2 = ab.b(th);
        StackTraceElement stackTraceElement = new StackTraceElement(getClass().getCanonicalName(), eVar.f30876d, eVar.f30877e + ".kt", 0);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(b2.length + 1)];
        stackTraceElementArr[0] = stackTraceElement;
        System.arraycopy(b2, 0, stackTraceElementArr, 1, b2.length);
        th.setStackTrace(stackTraceElementArr);
        a(dVar, th);
    }

    public final void a(Object obj, Object obj2, Object[] objArr, int i2, long j2, boolean z, String str) {
        e a2 = a(i2);
        g.b().post(new c(this, new Throwable(a2.f30877e + "." + a2.f30876d + " SensitiveApiException"), a2, new d(obj, obj2, objArr, i2, j2, z, (String) null, str, Thread.currentThread().getName())));
    }
}
