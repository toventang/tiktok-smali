package com.google.android.play.core.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.c.a;
import com.google.android.play.core.install.b;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.m;

final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final s f52704a;

    /* renamed from: b  reason: collision with root package name */
    private final e f52705b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f52706c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f52707d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32642);
    }

    h(s sVar, e eVar, Context context) {
        this.f52704a = sVar;
        this.f52705b = eVar;
        this.f52706c = context;
    }

    @Override // com.google.android.play.core.a.b
    public final synchronized void a(b bVar) {
        MethodCollector.i(6243);
        this.f52705b.a((a) bVar);
        MethodCollector.o(6243);
    }

    @Override // com.google.android.play.core.a.b
    public final synchronized void b(b bVar) {
        MethodCollector.i(6245);
        this.f52705b.b(bVar);
        MethodCollector.o(6245);
    }

    @Override // com.google.android.play.core.a.b
    public final d<a> a() {
        s sVar = this.f52704a;
        String packageName = this.f52706c.getPackageName();
        if (sVar.f52728b == null) {
            return s.a();
        }
        s.f52726a.d("requestUpdateInfo(%s)", packageName);
        m mVar = new m();
        sVar.f52728b.a(new n(sVar, mVar, packageName, mVar));
        return mVar.f53383a;
    }

    @Override // com.google.android.play.core.a.b
    public final boolean a(a aVar, Activity activity) {
        d b2 = d.c().b();
        g gVar = new g(activity);
        if (aVar.a(b2) == null) {
            return false;
        }
        gVar.a(aVar.a(b2).getIntentSender(), 19);
        return true;
    }

    @Override // com.google.android.play.core.a.b
    public final d<Void> b() {
        s sVar = this.f52704a;
        String packageName = this.f52706c.getPackageName();
        if (sVar.f52728b == null) {
            return s.a();
        }
        s.f52726a.d("completeUpdate(%s)", packageName);
        m mVar = new m();
        sVar.f52728b.a(new o(sVar, mVar, mVar, packageName));
        return mVar.f53383a;
    }
}
