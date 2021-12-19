package com.lynx.tasm.d;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    List<b> f56561a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, d> f56562b = new HashMap();

    static {
        Covode.recordClassIndex(35281);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f56597a = new c();

        static {
            Covode.recordClassIndex(35292);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized d a(a aVar) {
        MethodCollector.i(13549);
        Iterator<Pair<a.EnumC1269a, String>> it = aVar.f56556b.iterator();
        if (it.hasNext()) {
            Pair<a.EnumC1269a, String> next = it.next();
            d dVar = this.f56562b.get(((a.EnumC1269a) next.first).name() + ((String) next.second));
            MethodCollector.o(13549);
            return dVar;
        }
        MethodCollector.o(13549);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(a aVar, d dVar) {
        MethodCollector.i(13394);
        for (Pair<a.EnumC1269a, String> pair : aVar.f56556b) {
            this.f56562b.put(((a.EnumC1269a) pair.first).name() + ((String) pair.second), dVar);
        }
        MethodCollector.o(13394);
    }

    public final Typeface a(final j jVar, final String str, final int i2, final r.b bVar) {
        final a b2 = jVar.b(str);
        if (b2 == null) {
            return null;
        }
        final d dVar = b2.f56557c;
        final Handler handler = new Handler(Looper.myLooper());
        if (dVar != null) {
            if (bVar != null) {
                handler.post(new Runnable() {
                    /* class com.lynx.tasm.d.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35282);
                    }

                    public final void run() {
                        LLog.b("Lynx", "load font success " + str + i2);
                        if (Build.VERSION.SDK_INT >= 28) {
                            r.b bVar = bVar;
                            dVar.a(i2);
                            bVar.a();
                        } else if (Looper.getMainLooper() == Looper.myLooper()) {
                            dVar.a(i2);
                            bVar.a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                /* class com.lynx.tasm.d.c.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(35283);
                                }

                                public final void run() {
                                    final Typeface a2 = dVar.a(i2);
                                    handler.post(new Runnable() {
                                        /* class com.lynx.tasm.d.c.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(35284);
                                        }

                                        public final void run() {
                                            bVar.a();
                                        }
                                    });
                                }
                            });
                        }
                    }
                });
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return dVar.a(i2);
            }
            return dVar.a(0);
        }
        com.lynx.tasm.core.a.a().execute(new Runnable() {
            /* class com.lynx.tasm.d.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35285);
            }

            public final void run() {
                MethodCollector.i(13620);
                c cVar = c.this;
                j jVar = jVar;
                a aVar = b2;
                int i2 = i2;
                r.b bVar = bVar;
                Handler handler = handler;
                synchronized (cVar) {
                    try {
                        d a2 = cVar.a(aVar);
                        if (a2 != null) {
                            aVar.f56557c = a2;
                            cVar.a(aVar, a2);
                            if (Build.VERSION.SDK_INT >= 28) {
                                Typeface a3 = a2.a(i2);
                                if (bVar != null) {
                                    handler.post(new Runnable(bVar, a3, i2) {
                                        /* class com.lynx.tasm.d.c.AnonymousClass3 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ r.b f56578a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ Typeface f56579b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ int f56580c;

                                        static {
                                            Covode.recordClassIndex(35286);
                                        }

                                        public final void run() {
                                            LLog.a(4, "Lynx", "load font success");
                                            this.f56578a.a();
                                        }

                                        {
                                            this.f56578a = r2;
                                            this.f56579b = r3;
                                            this.f56580c = r4;
                                        }
                                    });
                                } else {
                                    return;
                                }
                            } else if (bVar == null) {
                                MethodCollector.o(13620);
                                return;
                            } else {
                                new Handler(Looper.getMainLooper()).post(new Runnable(a2, i2, handler, bVar) {
                                    /* class com.lynx.tasm.d.c.AnonymousClass4 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ d f56582a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ int f56583b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ Handler f56584c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ r.b f56585d;

                                    static {
                                        Covode.recordClassIndex(35287);
                                    }

                                    public final void run() {
                                        final Typeface a2 = this.f56582a.a(this.f56583b);
                                        this.f56584c.post(new Runnable() {
                                            /* class com.lynx.tasm.d.c.AnonymousClass4.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(35288);
                                            }

                                            public final void run() {
                                                LLog.a(4, "Lynx", "load font success");
                                                AnonymousClass4.this.f56585d.a();
                                            }
                                        });
                                    }

                                    {
                                        this.f56582a = r2;
                                        this.f56583b = r3;
                                        this.f56584c = r4;
                                        this.f56585d = r5;
                                    }
                                });
                            }
                            MethodCollector.o(13620);
                            return;
                        }
                        for (b bVar2 : cVar.f56561a) {
                            if (bVar2.b(aVar)) {
                                bVar2.a(aVar);
                                bVar2.a(new Pair<>(bVar, Integer.valueOf(i2)));
                                MethodCollector.o(13620);
                                return;
                            }
                        }
                        b bVar3 = new b();
                        bVar3.a(new Pair<>(bVar, Integer.valueOf(i2)));
                        bVar3.a(aVar);
                        cVar.f56561a.add(bVar3);
                        cVar.a(jVar, bVar3, aVar.f56556b.iterator(), handler);
                        MethodCollector.o(13620);
                    } finally {
                        MethodCollector.o(13620);
                    }
                }
            }
        });
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(j jVar, final b bVar, Iterator<Pair<a.EnumC1269a, String>> it, final Handler handler) {
        MethodCollector.i(13487);
        while (it.hasNext()) {
            Pair<a.EnumC1269a, String> next = it.next();
            Typeface b2 = com.lynx.tasm.e.c.f56602a.b(jVar, (a.EnumC1269a) next.first, (String) next.second);
            if (b2 != null) {
                final d dVar = new d(b2);
                synchronized (this) {
                    try {
                        for (a aVar : bVar.f56560b) {
                            aVar.f56557c = dVar;
                            a(aVar, dVar);
                        }
                        this.f56561a.remove(bVar);
                    } catch (Throwable th) {
                        MethodCollector.o(13487);
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    for (Pair<r.b, Integer> pair : bVar.f56559a) {
                        dVar.a(((Integer) pair.second).intValue());
                    }
                }
                handler.post(new Runnable() {
                    /* class com.lynx.tasm.d.c.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(35289);
                    }

                    public final void run() {
                        Iterator<Pair<r.b, Integer>> it = bVar.f56559a.iterator();
                        while (it.hasNext()) {
                            final Pair<r.b, Integer> next = it.next();
                            it.remove();
                            if (next.first != null) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    LLog.a(4, "Lynx", "load font success");
                                    dVar.a(((Integer) next.second).intValue());
                                    ((Integer) next.second).intValue();
                                    ((r.b) next.first).a();
                                } else {
                                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                                        /* class com.lynx.tasm.d.c.AnonymousClass5.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(35290);
                                        }

                                        public final void run() {
                                            final Typeface a2 = dVar.a(((Integer) next.second).intValue());
                                            handler.post(new Runnable() {
                                                /* class com.lynx.tasm.d.c.AnonymousClass5.AnonymousClass1.AnonymousClass1 */

                                                static {
                                                    Covode.recordClassIndex(35291);
                                                }

                                                public final void run() {
                                                    LLog.a(4, "Lynx", "load font success");
                                                    ((Integer) next.second).intValue();
                                                    ((r.b) next.first).a();
                                                }
                                            });
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                MethodCollector.o(13487);
                return;
            }
        }
        MethodCollector.o(13487);
    }
}
