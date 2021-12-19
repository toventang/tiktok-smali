package com.bytedance.assem.jedi_vm.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f25750a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f25751b;

    public static final boolean a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(15021);
        Handler handler = new Handler(Looper.getMainLooper());
        f25750a = handler;
        f25751b = new c(handler);
    }
}
