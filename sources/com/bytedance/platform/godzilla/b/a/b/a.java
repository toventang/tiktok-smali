package com.bytedance.platform.godzilla.b.a.b;

import android.app.Instrumentation;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import java.util.ArrayList;
import java.util.List;

public final class a extends Instrumentation {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f41966a;

    /* renamed from: b  reason: collision with root package name */
    private static List<com.bytedance.platform.godzilla.b.a.a.b.a> f41967b = new ArrayList();

    static {
        Covode.recordClassIndex(25633);
    }

    public static void a(com.bytedance.platform.godzilla.b.a.a.b.a aVar) {
        if (g.f41954b && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("register only in UI thread.");
        } else if (!f41967b.contains(aVar)) {
            f41967b.add(aVar);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        for (com.bytedance.platform.godzilla.b.a.a.b.a aVar : f41967b) {
            if (aVar.a(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
