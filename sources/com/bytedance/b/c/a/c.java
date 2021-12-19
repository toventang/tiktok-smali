package com.bytedance.b.c.a;

import com.bytedance.b.c.a.a;
import com.bytedance.b.c.b.a;
import com.bytedance.b.j.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f26000a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public a f26001b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, a> f26002c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, a> f26003d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, a> f26004e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.z.a.a.c f26005f;

    static {
        Covode.recordClassIndex(15152);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.c.a.c$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26006a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 15153(0x3b31, float:2.1234E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.b.c.a.a$a[] r0 = com.bytedance.b.c.a.a.EnumC0556a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.b.c.a.c.AnonymousClass1.f26006a = r2
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.MIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.b.c.a.c.AnonymousClass1.f26006a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.BACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.b.c.a.c.AnonymousClass1.f26006a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.b.c.a.a.EnumC0556a.FRONT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.c.a.c.AnonymousClass1.<clinit>():void");
        }
    }

    c(com.bytedance.z.a.a.c cVar) {
        this.f26005f = cVar;
    }

    public final void a(c.a aVar) {
        if (this.f26000a.get()) {
            synchronized (c.class) {
                a(a.EnumC0556a.FRONT, aVar);
                a(a.EnumC0556a.BACK, aVar);
                a(a.EnumC0556a.MIX, aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final a a(a.EnumC0556a aVar, String str) {
        int i2 = AnonymousClass1.f26006a[aVar.ordinal()];
        if (i2 == 1) {
            return this.f26002c.get(str);
        }
        if (i2 == 2) {
            return this.f26004e.get(str);
        }
        if (i2 != 3) {
            return null;
        }
        return this.f26003d.get(str);
    }

    private void a(a.EnumC0556a aVar, c.a aVar2) {
        Iterator<Map.Entry<String, a>> it;
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = AnonymousClass1.f26006a[aVar.ordinal()];
        if (i2 == 1) {
            it = this.f26002c.entrySet().iterator();
        } else if (i2 == 2) {
            it = this.f26004e.entrySet().iterator();
        } else if (i2 == 3) {
            it = this.f26003d.entrySet().iterator();
        } else {
            return;
        }
        if (it != null) {
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (currentTimeMillis - value.f25987g > this.f26001b.a()) {
                    it.remove();
                    double d2 = value.f25982b;
                    double d3 = (double) value.f25988h;
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    double d5 = value.f25983c;
                    double d6 = value.f25984d;
                    double d7 = (double) value.f25988h;
                    Double.isNaN(d7);
                    a(aVar, value.f25986f, d4, d5, d6 / d7, value.f25985e, aVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a.EnumC0556a aVar, String str, a aVar2) {
        int i2 = AnonymousClass1.f26006a[aVar.ordinal()];
        if (i2 == 1) {
            this.f26002c.put(str, aVar2);
        } else if (i2 == 2) {
            this.f26004e.put(str, aVar2);
        } else if (i2 == 3) {
            this.f26003d.put(str, aVar2);
        }
    }

    static a a(a.EnumC0556a aVar, a aVar2, double d2, double d3) {
        if (aVar2 == null) {
            aVar2 = new a(aVar, System.currentTimeMillis());
            aVar2.f25986f = com.bytedance.b.i.a.c.a().b();
        }
        if (d2 >= 0.0d || d3 >= 0.0d) {
            aVar2.f25988h++;
        }
        if (d3 >= 0.0d) {
            aVar2.f25984d += d3;
        }
        if (d2 >= 0.0d) {
            aVar2.f25982b += d2;
        }
        if (aVar2.f25983c < d2) {
            aVar2.f25983c = d2;
        }
        if (aVar2.f25985e < d3) {
            aVar2.f25985e = d3;
        }
        return aVar2;
    }

    private void a(a.EnumC0556a aVar, String str, double d2, double d3, double d4, double d5, c.a aVar2) {
        e eVar = new e(aVar, str, d2, d3, d4, d5, aVar2);
        try {
            eVar.f26018b = this.f26005f.i();
        } catch (Throwable unused) {
        }
        com.bytedance.b.h.a.a(eVar);
    }
}
