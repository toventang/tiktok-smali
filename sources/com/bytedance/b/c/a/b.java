package com.bytedance.b.c.a;

import android.content.SharedPreferences;
import android.os.Process;
import com.bytedance.b.c.a;
import com.bytedance.b.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f25990a;

    /* renamed from: b  reason: collision with root package name */
    public d f25991b;

    /* renamed from: c  reason: collision with root package name */
    public c f25992c;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences f25993d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.b.j.d.a f25994e;

    /* renamed from: f  reason: collision with root package name */
    public a.AbstractC0555a f25995f;

    /* renamed from: g  reason: collision with root package name */
    private c f25996g;

    static {
        Covode.recordClassIndex(15148);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25999a = new b((byte) 0);

        static {
            Covode.recordClassIndex(15151);
        }
    }

    private b() {
        this.f25990a = new AtomicBoolean(false);
        try {
            this.f25996g = com.bytedance.z.a.a.b.a(com.bytedance.apm.c.f24685a);
        } catch (Throwable unused) {
        }
        this.f25992c = new c(this.f25996g);
        this.f25991b = new d(this.f25992c, this.f25996g);
    }

    public final boolean a() {
        boolean z;
        if (this.f25994e.a()) {
            this.f25993d.edit().putString(com.bytedance.b.e.a.a.d(), Process.myPid() + "," + this.f25994e.a()).apply();
            return true;
        }
        Map<String, ?> all = this.f25993d.getAll();
        if (all != null) {
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    if (((String) it.next().getValue()).split(",")[1].equals("true")) {
                        z = true;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            b.a a2 = com.bytedance.b.c.b.a();
            if (!z || this.f25994e.a() || a2 == b.a.TOP_APP || a2 == b.a.FOREGROUND) {
                return true;
            }
            return false;
        }
        z = false;
        b.a a22 = com.bytedance.b.c.b.a();
        if (!z) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (0 == 0) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.c.a.b.b():void");
    }

    /* synthetic */ b(byte b2) {
        this();
    }
}
