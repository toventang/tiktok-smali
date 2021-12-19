package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<a> f61217a;

    public interface a {
        static {
            Covode.recordClassIndex(37688);
        }

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(37687);
    }

    public static void a(Throwable th) {
        a aVar;
        WeakReference<a> weakReference = f61217a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.a(th);
        }
    }
}
