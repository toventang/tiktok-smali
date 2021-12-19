package com.bytedance.android.livesdk.an;

import androidx.lifecycle.m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.k;
import f.a.l.c;
import f.a.l.g;
import f.a.t;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f13956b;

    /* renamed from: a  reason: collision with root package name */
    private final g<Object> f13957a = new c().j();

    static {
        Covode.recordClassIndex(7745);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(13472);
        if (f13956b == null) {
            synchronized (a.class) {
                try {
                    if (f13956b == null) {
                        f13956b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13472);
                    throw th;
                }
            }
        }
        a aVar = f13956b;
        MethodCollector.o(13472);
        return aVar;
    }

    public final void a(Object obj) {
        this.f13957a.onNext(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: f.a.t<U>, f.a.t<T> */
    public final <T> t<T> a(Class<T> cls) {
        return (t<U>) this.f13957a.a(cls).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
    }

    public final <T> z<T> a(m mVar, Class<T> cls, DataChannel dataChannel) {
        return a(mVar, cls, new b(dataChannel));
    }

    public final <T> z<T> a(m mVar, Class<T> cls, k<T> kVar) {
        return (z) this.f13957a.a(cls).a(kVar).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.a(mVar));
    }
}
