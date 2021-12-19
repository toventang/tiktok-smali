package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.al;
import f.a.d.f;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b implements al {

    /* renamed from: a  reason: collision with root package name */
    public static final b f106898a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f106899b;

    /* renamed from: c  reason: collision with root package name */
    private static final CopyOnWriteArrayList<al> f106900c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private static int f106901d;

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b$b  reason: collision with other inner class name */
    public static final class C2742b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C2742b f106909a = new C2742b();

        static {
            Covode.recordClassIndex(68375);
        }

        C2742b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(68373);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final synchronized void a() {
        MethodCollector.i(4062);
        c();
        int i2 = f106901d + 1;
        f106901d = i2;
        if (i2 == 1) {
            Iterator<T> it = f106900c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        MethodCollector.o(4062);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final synchronized void b() {
        MethodCollector.i(4181);
        c();
        int i2 = f106901d - 1;
        f106901d = i2;
        if (i2 == 0) {
            Iterator<T> it = f106900c.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        MethodCollector.o(4181);
    }

    public final synchronized void c() {
        MethodCollector.i(3787);
        if (f106899b) {
            MethodCollector.o(3787);
            return;
        }
        if (com.ss.android.common.util.f.a(d.a())) {
            a(new c());
        }
        f106899b = true;
        MethodCollector.o(3787);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f106902a = new a();

        static {
            Covode.recordClassIndex(68374);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.f106898a.a();
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f106910a = new c();

        static {
            Covode.recordClassIndex(68376);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.f106898a.b();
        }
    }

    private synchronized void a(al alVar) {
        MethodCollector.i(4057);
        l.d(alVar, "");
        CopyOnWriteArrayList<al> copyOnWriteArrayList = f106900c;
        if (!copyOnWriteArrayList.contains(alVar)) {
            copyOnWriteArrayList.add(alVar);
        }
        MethodCollector.o(4057);
    }
}
