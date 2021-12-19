package com.ss.android.ttvecamera;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<a> f61553a;

    public interface a {
        static {
            Covode.recordClassIndex(37890);
        }

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(37889);
    }

    public static void a(Throwable th) {
        a aVar;
        WeakReference<a> weakReference = f61553a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            aVar.a(th);
        }
    }
}
