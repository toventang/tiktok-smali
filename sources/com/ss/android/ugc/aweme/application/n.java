package com.ss.android.ugc.aweme.application;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f66950a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f66951b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<a, Boolean> f66952c = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f66953a;

        /* renamed from: b  reason: collision with root package name */
        boolean f66954b;

        /* renamed from: c  reason: collision with root package name */
        boolean f66955c;

        static {
            Covode.recordClassIndex(41265);
        }

        public final int hashCode() {
            return Objects.hash(this.f66953a, Boolean.valueOf(this.f66954b), Boolean.valueOf(this.f66955c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f66954b == aVar.f66954b && this.f66955c == aVar.f66955c && this.f66953a.equals(aVar.f66953a)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public a(String str, boolean z, boolean z2) {
            this.f66953a = str;
            this.f66954b = z;
            this.f66955c = z2;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(41264);
        if (new Random().nextFloat() < 1.0E-4f) {
            z = true;
        } else {
            z = false;
        }
        f66951b = z;
    }

    public static void a(Context context, String str, boolean z, boolean z2) {
        MethodCollector.i(6196);
        if (TextUtils.isEmpty(str) || !f66951b || context == null) {
            MethodCollector.o(6196);
            return;
        }
        if (f66950a == null) {
            synchronized (n.class) {
                try {
                    if (f66950a == null) {
                        f66950a = new AtomicBoolean(com.ss.android.ugc.aweme.lego.f.a.a(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6196);
                    throw th;
                }
            }
        }
        if (!f66950a.get()) {
            MethodCollector.o(6196);
            return;
        }
        a aVar = new a(str, z, z2);
        if (f66952c.containsKey(aVar)) {
            MethodCollector.o(6196);
            return;
        }
        f66952c.put(aVar, true);
        r.a("stat_loadso_num", new d().a("tag_type", !z ? 1 : 0).a("num_type", !z2 ? 1 : 0).a("so_name", str).f66730a);
        MethodCollector.o(6196);
    }
}
