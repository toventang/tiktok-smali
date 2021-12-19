package com.google.android.play.core.e;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.c.a;
import com.google.android.play.core.tasks.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class as implements c {

    /* renamed from: a  reason: collision with root package name */
    final ap f53253a;

    /* renamed from: b  reason: collision with root package name */
    private final t f53254b;

    /* renamed from: c  reason: collision with root package name */
    private final al f53255c;

    /* renamed from: d  reason: collision with root package name */
    private final v f53256d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f53257e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32913);
    }

    as(t tVar, ap apVar, al alVar, v vVar) {
        this.f53254b = tVar;
        this.f53253a = apVar;
        this.f53255c = alVar;
        this.f53256d = vVar;
    }

    static List<String> a(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (Build.VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.e.c
    public final d<Void> a(int i2) {
        return this.f53254b.b(i2);
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> a() {
        Set<String> b2 = this.f53255c.b();
        return b2 == null ? Collections.emptySet() : b2;
    }

    @Override // com.google.android.play.core.e.c
    public final synchronized void a(g gVar) {
        MethodCollector.i(9970);
        this.f53253a.a((a) gVar);
        MethodCollector.o(9970);
    }

    @Override // com.google.android.play.core.e.c
    public final d<f> b(int i2) {
        return this.f53254b.a(i2);
    }

    @Override // com.google.android.play.core.e.c
    public final Set<String> b() {
        return this.f53255c.a();
    }

    @Override // com.google.android.play.core.e.c
    public final synchronized void b(g gVar) {
        MethodCollector.i(9971);
        this.f53253a.b(gVar);
        MethodCollector.o(9971);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3.containsAll(r2) != false) goto L_0x0018;
     */
    @Override // com.google.android.play.core.e.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.d<java.lang.Integer> a(com.google.android.play.core.e.e r6) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.e.as.a(com.google.android.play.core.e.e):com.google.android.play.core.tasks.d");
    }

    @Override // com.google.android.play.core.e.c
    public final boolean a(f fVar, Activity activity, int i2) {
        ar arVar = new ar(activity);
        if (fVar.b() != 8 || fVar.h() == null) {
            return false;
        }
        arVar.a(fVar.h().getIntentSender(), i2);
        return true;
    }
}
