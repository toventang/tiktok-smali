package com.ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.discover.lynx.b.b;
import f.a.e.e.b.m;
import f.a.h;
import f.a.j;
import f.a.k;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f81462a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f81463b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<e> f81464c;

    private d() {
    }

    static {
        Covode.recordClassIndex(50619);
    }

    public static p<e, Boolean> a() {
        boolean z;
        e eVar;
        MethodCollector.i(3144);
        WeakReference<e> weakReference = f81464c;
        if (weakReference == null || weakReference.get() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            WeakReference<e> weakReference2 = f81464c;
            if (weakReference2 == null) {
                l.b();
            }
            eVar = weakReference2.get();
            if (eVar == null) {
                l.b();
            }
        } else {
            Context context = GlobalContext.getContext();
            l.b(context, "");
            eVar = new e(context);
        }
        ViewParent parent = eVar.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        l.d(eVar, "");
        f81464c = new WeakReference<>(eVar);
        p<e, Boolean> pVar = new p<>(eVar, Boolean.valueOf(z));
        MethodCollector.o(3144);
        return pVar;
    }

    public static void b() {
        String bulletSchema;
        for (a aVar : com.ss.android.ugc.aweme.discover.ui.intermediate.a.a()) {
            if (aVar.f81453a == b.f81455a && aVar.f81454b != null) {
                if (TextUtils.isEmpty(aVar.f81454b.getBulletSchema())) {
                    bulletSchema = aVar.f81454b.getSchema();
                } else {
                    bulletSchema = aVar.f81454b.getBulletSchema();
                }
                if (bulletSchema != null) {
                    b bVar = b.f81440b;
                    Context context = GlobalContext.getContext();
                    l.b(context, "");
                    bVar.a(context, bulletSchema, aVar.f81454b.getRawData());
                    f81462a = true;
                }
            }
        }
    }

    static final class a<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81465a = new a();

        static {
            Covode.recordClassIndex(50620);
        }

        a() {
        }

        @Override // f.a.k
        public final void a(j<String> jVar) {
            l.d(jVar, "");
            d.b();
            jVar.a();
        }
    }

    public static void a(boolean z) {
        if (z) {
            h.a(a.f81465a, f.a.a.DROP).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.e.b.a.f157191d, f.a.e.b.a.f157193f, f.a.e.b.a.f157190c, m.a.INSTANCE);
        } else {
            b();
        }
    }
}
