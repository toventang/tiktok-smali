package com.bytedance.ies.powerpreload;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.ies.powerpreload.task.e;
import h.f.b.l;
import h.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;

public final class a {

    /* renamed from: com.bytedance.ies.powerpreload.a$a  reason: collision with other inner class name */
    public static final class C0770a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final C0770a f34476a = new C0770a();

        static {
            Covode.recordClassIndex(20618);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(20617);
    }

    public static final String b(Intent intent) {
        l.c(intent, "");
        return e.a(intent);
    }

    public static final TaskTraceMetric a(Bundle bundle) {
        l.c(bundle, "");
        l.c(bundle, "");
        String string = bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
        if (string == null) {
            return null;
        }
        l.a((Object) string, "");
        return e.f34549a.get(string);
    }

    public static final String b(Bundle bundle) {
        l.c(bundle, "");
        return e.a(bundle);
    }

    public static final Intent a(Intent intent) {
        l.c(intent, "");
        l.c(intent, "");
        String a2 = e.a(intent);
        if (a2 == null) {
            a2 = UUID.randomUUID().toString();
            intent.putExtra("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", a2);
            l.a((Object) a2, "");
        }
        if (e.f34549a.get(a2) == null) {
            e.f34549a.put(a2, new TaskTraceMetric());
        }
        return intent;
    }
}
