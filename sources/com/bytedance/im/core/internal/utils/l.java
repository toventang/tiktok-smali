package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.k;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.a.a.a;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;

public class l {

    /* renamed from: e  reason: collision with root package name */
    private static l f38775e;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f38776a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f38777b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f38778c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f38779d = -1;

    static {
        Covode.recordClassIndex(23130);
    }

    public final int b() {
        if (this.f38779d < 0) {
            s.a();
            this.f38779d = s.b();
        }
        return this.f38779d;
    }

    public static l a() {
        MethodCollector.i(9532);
        if (f38775e == null) {
            synchronized (l.class) {
                try {
                    if (f38775e == null) {
                        f38775e = new l();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9532);
                    throw th;
                }
            }
        }
        l lVar = f38775e;
        MethodCollector.o(9532);
        return lVar;
    }

    public final void c() {
        if (this.f38776a || this.f38778c) {
            f.b("imsdk", "LinkModeManager afterPullMixLink checking or ever migrated, isCheck:" + this.f38776a + ", isEverMigrated:" + this.f38778c, (Throwable) null);
            return;
        }
        this.f38776a = true;
        d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.internal.utils.l.AnonymousClass3 */

            static {
                Covode.recordClassIndex(23133);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Boolean a() {
                l lVar = l.this;
                int b2 = lVar.b();
                k kVar = com.bytedance.im.core.a.d.a().b().ai;
                f.b("imsdk", "LinkModeManager migrateMix, mode:" + b2 + ", config:" + kVar, (Throwable) null);
                if (b2 == 0) {
                    f.b("imsdk", "LinkModeManager migrateMix pulled recent on mix mode!!!", (Throwable) null);
                } else if (kVar.enable == 1) {
                    f.b("imsdk", "LinkModeManager migrateMix config recent", (Throwable) null);
                } else {
                    f.b("imsdk", "LinkModeManager migrateMix start to migrate", (Throwable) null);
                    lVar.f38777b = true;
                    b.a(0, kVar);
                    if (kVar.fallbackStrategy == k.FALLBACK_CLEAR) {
                        f.b("imsdk", "LinkModeManager migrateMixClear start", (Throwable) null);
                        com.bytedance.im.core.a.d.a().d();
                        s.a();
                        s.n();
                        a.a().d();
                        com.bytedance.im.core.a.d.a().c();
                        f.b("imsdk", "LinkModeManager migrateMixClear end", (Throwable) null);
                    } else {
                        lVar.d();
                    }
                    lVar.f38778c = true;
                    lVar.f38777b = false;
                    f.b("imsdk", "LinkModeManager migrateMix migrate end", (Throwable) null);
                }
                return null;
            }
        }, new com.bytedance.im.core.internal.e.b<Boolean>() {
            /* class com.bytedance.im.core.internal.utils.l.AnonymousClass4 */

            static {
                Covode.recordClassIndex(23134);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* bridge */ /* synthetic */ void a(Boolean bool) {
                l.this.f38776a = false;
            }
        }, com.bytedance.im.core.internal.e.a.d());
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        f.b("imsdk", "LinkModeManager migrateMixNormal start", (Throwable) null);
        int[] a2 = e.a();
        a(0);
        for (int i2 : a2) {
            s.a();
            long a3 = s.a(i2);
            s.a();
            long d2 = s.d(i2);
            if (d2 > 0 && d2 > a3) {
                s.a();
                s.a(i2, d2);
            }
            f.b("imsdk", "LinkModeManager migrateMixNormal for inbox:" + i2 + ", oldCursor:" + a3 + ", cursor:" + d2, (Throwable) null);
            x.a();
            x.b(i2, 9);
        }
        f.b("imsdk", "LinkModeManager migrateMixNormal end", (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 == 0 || i2 == 1) {
            s.a();
            if (i2 == 0 || i2 == 1) {
                s.f38859a.a(s.a("current_link_mode"), i2);
            } else {
                f.b("imsdk", "SPUtils setLinkMode invalid:".concat(String.valueOf(i2)), (Throwable) null);
            }
            this.f38779d = i2;
            return;
        }
        f.b("imsdk", "LinkModeManager setLinkMode invalid:".concat(String.valueOf(i2)), (Throwable) null);
    }
}
