package com.google.android.play.core.e.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.at;
import com.google.android.play.core.d.q;
import com.google.android.play.core.e.aa;
import com.google.android.play.core.e.ad;
import com.google.android.play.core.e.ah;
import com.google.android.play.core.e.al;
import com.google.android.play.core.e.c;
import com.google.android.play.core.e.f;
import com.google.android.play.core.e.g;
import com.google.android.play.core.tasks.d;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    static final long f53265a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    final Context f53266b;

    /* renamed from: c  reason: collision with root package name */
    final com.google.android.play.core.b.a<f> f53267c;

    /* renamed from: d  reason: collision with root package name */
    final Executor f53268d;

    /* renamed from: e  reason: collision with root package name */
    public final File f53269e;

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f53270f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g  reason: collision with root package name */
    final Set<String> f53271g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h  reason: collision with root package name */
    final AtomicBoolean f53272h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private final Handler f53273i = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    private final al f53274j;

    /* renamed from: k  reason: collision with root package name */
    private final at f53275k;

    /* renamed from: l  reason: collision with root package name */
    private final aa f53276l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReference<f> f53277m = new AtomicReference<>();
    private final b n;

    static {
        Covode.recordClassIndex(32918);
    }

    a(Context context, File file, al alVar) {
        Executor a2 = q.a();
        at atVar = new at(context);
        b bVar = b.f53278a;
        this.f53266b = context;
        this.f53269e = file;
        this.f53274j = alVar;
        this.f53268d = a2;
        this.f53275k = atVar;
        this.n = bVar;
        this.f53267c = new com.google.android.play.core.b.a<>();
        this.f53276l = ah.f53232a;
    }

    private final synchronized f a(k kVar) {
        MethodCollector.i(10158);
        f c2 = c();
        f a2 = kVar.a(c2);
        if (this.f53277m.compareAndSet(c2, a2)) {
            MethodCollector.o(10158);
            return a2;
        }
        MethodCollector.o(10158);
        return null;
    }

    static String a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final void a(f fVar) {
        this.f53273i.post(new g(this, fVar));
    }

    private final ad d() {
        ad c2 = this.f53274j.c();
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    @Override // com.google.android.play.core.e.c
    public final d<Void> a(int i2) {
        try {
            f a2 = a(new f(i2));
            if (a2 != null) {
                a(a2);
            }
            return com.google.android.play.core.tasks.f.a((Object) null);
        } catch (com.google.android.play.core.e.a e2) {
            return com.google.android.play.core.tasks.f.a((Exception) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0110, code lost:
        if (r1.contains(r11) == false) goto L_0x0113;
     */
    @Override // com.google.android.play.core.e.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.d<java.lang.Integer> a(com.google.android.play.core.e.e r21) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.e.b.a.a(com.google.android.play.core.e.e):com.google.android.play.core.tasks.d");
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        if (this.f53274j.b() != null) {
            hashSet.addAll(this.f53274j.b());
        }
        hashSet.addAll(this.f53271g);
        return hashSet;
    }

    @Override // com.google.android.play.core.e.c
    public final void a(g gVar) {
        this.f53267c.a(gVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Intent> list, List<String> list2, List<String> list3, long j2, boolean z) {
        this.f53276l.a().a(list, new j(this, list2, list3, j2, z, list));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, Long l2, Long l3, List<String> list, Integer num, List<String> list2) {
        f a2 = a(new c(num, i2, i3, l2, l3, list, list2));
        if (a2 == null) {
            return false;
        }
        a(a2);
        return true;
    }

    @Override // com.google.android.play.core.e.c
    public final boolean a(f fVar, Activity activity, int i2) {
        return false;
    }

    @Override // com.google.android.play.core.e.c
    public final d<f> b(int i2) {
        f c2 = c();
        return (c2 == null || c2.a() != i2) ? com.google.android.play.core.tasks.f.a((Exception) new com.google.android.play.core.e.a(-4)) : com.google.android.play.core.tasks.f.a(c2);
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f53274j.a());
        hashSet.addAll(this.f53270f);
        return hashSet;
    }

    @Override // com.google.android.play.core.e.c
    public final void b(g gVar) {
        this.f53267c.b(gVar);
    }

    /* access modifiers changed from: package-private */
    public final f c() {
        return this.f53277m.get();
    }

    /* access modifiers changed from: package-private */
    public final boolean c(int i2) {
        return a(6, i2, null, null, null, null, null);
    }
}
