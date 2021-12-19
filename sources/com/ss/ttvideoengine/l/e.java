package com.ss.ttvideoengine.l;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.s.j;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public long f153074a;

    /* renamed from: b  reason: collision with root package name */
    public long f153075b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f153076c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, a> f153077d = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f153078a;

        /* renamed from: b  reason: collision with root package name */
        public long f153079b;

        /* renamed from: c  reason: collision with root package name */
        public long f153080c;

        /* renamed from: d  reason: collision with root package name */
        public String f153081d = "";

        /* renamed from: e  reason: collision with root package name */
        public boolean f153082e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f153083f;

        static {
            Covode.recordClassIndex(101715);
        }
    }

    static {
        Covode.recordClassIndex(101714);
    }

    public final void a(String str) {
        a aVar = this.f153077d.get(str);
        if (aVar != null) {
            if (aVar.f153078a > this.f153075b && !aVar.f153083f) {
                j.b("PreloadUtil", "trigger preload " + str + " playable buffer is: " + aVar.f153078a);
                d.h.f152465a.a(aVar.f153078a);
                aVar.f153083f = true;
            }
            if (aVar.f153082e || (aVar.f153080c > 0 && aVar.f153078a + aVar.f153079b + 1000 >= aVar.f153080c)) {
                if (!aVar.f153083f) {
                    j.b("PreloadUtil", "cached video trigger preload " + str + " playable buffer is: " + aVar.f153078a);
                    d.h.f152465a.a(aVar.f153078a);
                    aVar.f153083f = true;
                }
            } else if (aVar.f153078a < this.f153074a) {
                long i2 = d.h.f152465a.i();
                if (aVar.f153083f && i2 > 0) {
                    a("low_buffer", str);
                    aVar.f153083f = false;
                }
            }
        }
    }

    public static void a(String str, String str2) {
        j.b("PreloadUtil", "cancel preload because:" + str + " traceId:" + str2);
        d.h.f152465a.h();
        d.h.f152465a.a(str);
    }
}
