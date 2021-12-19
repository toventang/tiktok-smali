package com.ss.android.ugc.aweme.discover.lynx.spark;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.f;
import com.bytedance.lynx.hybrid.j;
import com.bytedance.lynx.hybrid.k;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.a.o;
import com.ss.android.ugc.aweme.utils.hl;
import f.a.d.g;
import h.f.b.l;
import h.f.b.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f81560a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(50686);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b$b  reason: collision with other inner class name */
    public static final class C1905b implements com.bytedance.hybrid.spark.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TemplateData f81568a;

        static {
            Covode.recordClassIndex(50688);
        }

        C1905b(TemplateData templateData) {
            this.f81568a = templateData;
        }

        @Override // com.bytedance.hybrid.spark.a.b
        public final void a(f fVar) {
            l.d(fVar, "");
            if (fVar instanceof j) {
                j jVar = (j) fVar;
                jVar.f41008l = o.a();
                jVar.f41007k = this.f81568a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f81585a;

        static {
            Covode.recordClassIndex(50690);
        }

        d(k kVar) {
            this.f81585a = kVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f81585a.updateData((TemplateData) obj);
        }
    }

    public static final class a extends com.bytedance.hybrid.spark.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f81561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.delegate.j f81562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.e.b f81563c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.hybrid.spark.a.c f81564d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d f81565e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f81566f;

        static {
            Covode.recordClassIndex(50687);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar) {
            l.d(hVar, "");
            super.a(hVar);
            T t = this.f81561a.element;
            if (t != null) {
                com.bytedance.android.alog.c.a(1, "SparkLoadHelper", "continue preload succeed:" + ((Object) this.f81561a.element));
                b.a(this.f81562b, t, this.f81563c, this.f81564d, this.f81565e, this.f81566f);
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar, String str, String str2) {
            l.d(hVar, "");
            l.d(str, "");
            super.a(hVar, str, str2);
            com.bytedance.android.alog.c.a(1, "SparkLoadHelper", "continue preload failed:" + ((Object) this.f81561a.element));
            b.a(this.f81563c, this.f81562b, this.f81565e, this.f81566f, this.f81564d);
        }

        public a(z.e eVar, com.ss.android.ugc.aweme.discover.lynx.delegate.j jVar, com.ss.android.ugc.aweme.discover.lynx.e.b bVar, com.bytedance.hybrid.spark.a.c cVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map map) {
            this.f81561a = eVar;
            this.f81562b = jVar;
            this.f81563c = bVar;
            this.f81564d = cVar;
            this.f81565e = dVar;
            this.f81566f = map;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f81573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d f81574b;

        static {
            Covode.recordClassIndex(50689);
        }

        c(Map map, com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
            this.f81573a = map;
            this.f81574b = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            if (this.f81573a != null) {
                TemplateData a2 = TemplateData.a(this.f81574b.getRawData());
                l.b(a2, "");
                return b.a(a2, this.f81573a);
            }
            TemplateData a3 = TemplateData.a(this.f81574b.getRawData());
            l.b(a3, "");
            return a3;
        }
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        }
        if (!(context instanceof m)) {
            return false;
        }
        i lifecycle = ((m) context).getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a() == i.b.DESTROYED) {
            return true;
        }
        return false;
    }

    public static TemplateData a(TemplateData templateData, Map<String, ? extends Object> map) {
        l.d(templateData, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            templateData.a(next, jSONObject.get(next));
        }
        return templateData;
    }

    private static void b(k kVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map) {
        TemplateData a2;
        l.d(kVar, "");
        l.d(dVar, "");
        if (map != null) {
            TemplateData a3 = TemplateData.a(dVar.getRawData());
            l.b(a3, "");
            a2 = a(a3, map);
        } else {
            a2 = TemplateData.a(dVar.getRawData());
            l.b(a2, "");
        }
        kVar.updateData(a2);
    }

    public static void a(k kVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map) {
        l.d(kVar, "");
        l.d(dVar, "");
        f.a.h.a(dVar.getRawData()).b(new c(map, dVar)).b(f.a.h.a.a(f.a.k.a.f158005b)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new d(kVar));
    }

    private static void a(com.bytedance.hybrid.spark.page.c cVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map, com.bytedance.hybrid.spark.a.c cVar2) {
        TemplateData templateData;
        l.d(cVar, "");
        l.d(dVar, "");
        l.d(cVar2, "");
        if (hl.a(dVar.getRawData())) {
            templateData = a(TemplateData.a(dVar.getRawData()), map);
        } else {
            templateData = null;
        }
        String schema = dVar.getSchema();
        l.b(schema, "");
        a(cVar, schema, templateData, cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        if ((r1 instanceof com.lynx.tasm.LynxView) != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.hybrid.spark.page.c r5, java.lang.String r6, com.lynx.tasm.TemplateData r7, com.bytedance.hybrid.spark.a.c r8) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.spark.b.a(com.bytedance.hybrid.spark.page.c, java.lang.String, com.lynx.tasm.TemplateData, com.bytedance.hybrid.spark.a.c):void");
    }

    public static void a(com.ss.android.ugc.aweme.discover.lynx.e.b bVar, com.ss.android.ugc.aweme.discover.lynx.delegate.j jVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map, com.bytedance.hybrid.spark.a.c cVar) {
        com.bytedance.android.alog.c.a(1, "SparkLoadHelper", "normalLoad");
        if (a(bVar)) {
            new com.ss.android.ugc.aweme.discover.lynx.d.c().a("spark_container_destroyed").b(dVar.getSchema()).f();
        } else if (!bVar.c()) {
            new com.ss.android.ugc.aweme.discover.lynx.d.c().a("spark_view_miss").b(dVar.getSchema()).f();
        } else {
            View hybirdContainerView = bVar.getHybirdContainerView();
            Objects.requireNonNull(hybirdContainerView, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView");
            jVar.f81505a = false;
            a((com.bytedance.hybrid.spark.page.c) hybirdContainerView, dVar, map, cVar);
        }
    }

    public static void a(com.ss.android.ugc.aweme.discover.lynx.delegate.j jVar, com.ss.android.ugc.aweme.discover.lynx.spark.b.b bVar, com.ss.android.ugc.aweme.discover.lynx.e.b bVar2, com.bytedance.hybrid.spark.a.c cVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map) {
        String str;
        jVar.f81505a = true;
        com.bytedance.hybrid.spark.page.c cVar2 = bVar.f81570b;
        try {
            bVar2.a(cVar2);
            com.ss.android.ugc.aweme.discover.lynx.d.c b2 = new com.ss.android.ugc.aweme.discover.lynx.d.c().a("preload_hit").b(1);
            if (dVar != null) {
                str = dVar.getSchema();
            } else {
                str = null;
            }
            b2.b(str).f();
            View childAt = cVar2.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            k kVar = (k) childAt;
            if (bVar.f81572d) {
                a(kVar, dVar, map);
            } else {
                b(kVar, dVar, map);
            }
            cVar.a(kVar);
        } catch (Exception e2) {
            new com.ss.android.ugc.aweme.discover.lynx.d.c().b(dVar.getSchema()).a("spark_replace_error").c(e2.getMessage()).f();
            com.bytedance.android.alog.c.a(4, "SparkLoadHelper", e2.toString());
        }
    }
}
