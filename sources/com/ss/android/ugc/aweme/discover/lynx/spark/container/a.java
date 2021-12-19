package com.ss.android.ugc.aweme.discover.lynx.spark.container;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.c;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.b.a.a;
import com.bytedance.lynx.hybrid.k;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.lynx.container.f;
import com.ss.android.ugc.aweme.discover.lynx.spark.a.a;
import com.ss.android.ugc.aweme.discover.lynx.spark.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a implements f {

    /* renamed from: i  reason: collision with root package name */
    public static final C1907a f81592i = new C1907a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f81593a;

    /* renamed from: b  reason: collision with root package name */
    public c f81594b;

    /* renamed from: c  reason: collision with root package name */
    ArrayMap<String, JSONObject> f81595c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<Object> f81596d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.discover.lynx.spark.container.a.a> f81597e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.discover.lynx.spark.a.a> f81598f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<f.a.b.b> f81599g;

    /* renamed from: h  reason: collision with root package name */
    public final m f81600h;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.hybrid.spark.page.c f81601j;

    static {
        Covode.recordClassIndex(50702);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.container.a$a  reason: collision with other inner class name */
    public static final class C1907a {
        static {
            Covode.recordClassIndex(50703);
        }

        private C1907a() {
        }

        public /* synthetic */ C1907a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final View getRealView() {
        return this.f81601j;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f81593a != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f81595c.clear();
        this.f81596d.clear();
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81605a;

        static {
            Covode.recordClassIndex(50704);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void c() {
            com.bytedance.android.alog.c.a(1, "SparkViewContainer", "onDestroy");
            c cVar = this.f81605a.f81594b;
            if (cVar != null) {
                cVar.c();
            }
            this.f81605a.b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f81605a = aVar;
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar) {
            k a2;
            l.d(hVar, "");
            com.bytedance.android.alog.c.a(1, "SparkViewContainer", "onLoadFinish".concat(String.valueOf(hVar)));
            this.f81605a.f81593a = d.a.a(hVar);
            a aVar = this.f81605a;
            com.bytedance.android.alog.c.a(1, "SparkViewContainer", "handleAllPendingIfHave: events:" + aVar.f81595c + " and updates:" + aVar.f81596d);
            for (Map.Entry<String, JSONObject> entry : aVar.f81595c.entrySet()) {
                String key = entry.getKey();
                l.b(key, "");
                JSONObject value = entry.getValue();
                l.b(value, "");
                aVar.a(key, value);
            }
            for (T t : aVar.f81596d) {
                if (t instanceof TemplateData) {
                    T t2 = t;
                    l.d(t2, "");
                    if (aVar.a()) {
                        d dVar = aVar.f81593a;
                        if (dVar == null) {
                            l.b();
                        }
                        dVar.a().updateData((TemplateData) t2);
                    } else {
                        aVar.f81596d.add(t2);
                        a.a("updateData:".concat(String.valueOf(t2)));
                    }
                }
                if (t instanceof String) {
                    aVar.b(t);
                }
            }
            aVar.b();
            for (T t3 : aVar.f81597e) {
                d dVar2 = aVar.f81593a;
                if (dVar2 == null) {
                    l.b();
                }
                l.d(dVar2, "");
                d dVar3 = t3.f81602a;
                if (!(dVar3 == null || (a2 = dVar3.a()) == null)) {
                    a2.removeOnAttachStateChangeListener(t3.f81603b);
                }
                dVar2.a().addOnAttachStateChangeListener(t3.f81603b);
                l.d(dVar2, "");
                t3.f81602a = dVar2;
            }
            d dVar4 = aVar.f81593a;
            if (dVar4 == null) {
                l.b();
            }
            com.bytedance.lynx.hybrid.b.b bVar = (com.bytedance.lynx.hybrid.b.b) dVar4.a().getHybridContext().a(com.bytedance.lynx.hybrid.b.b.class);
            if (bVar != null) {
                for (T t4 : aVar.f81598f) {
                    com.bytedance.lynx.hybrid.b.a.a aVar2 = new com.bytedance.lynx.hybrid.b.a.a();
                    aVar2.a(t4.a());
                    aVar2.b("");
                    aVar2.a(a.EnumC0990a.PUBLIC);
                    aVar2.f40887f = false;
                    aVar2.f40885d = new a.b(t4);
                    bVar.a(aVar2);
                }
            }
            c cVar = this.f81605a.f81594b;
            if (cVar != null) {
                cVar.a(hVar);
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar, String str) {
            l.d(hVar, "");
            l.d(str, "");
            com.bytedance.android.alog.c.a(1, "SparkViewContainer", "onLoadStart:".concat(String.valueOf(str)));
            c cVar = this.f81605a.f81594b;
            if (cVar != null) {
                cVar.a(hVar, str);
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void b(h hVar, String str) {
            l.d(hVar, "");
            l.d(str, "");
            com.bytedance.android.alog.c.a(1, "SparkViewContainer", "onLoadFailed".concat(String.valueOf(str)));
            c cVar = this.f81605a.f81594b;
            if (cVar != null) {
                cVar.b(hVar, str);
            }
            this.f81605a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
        l.d(dVar, "");
        b();
        this.f81593a = null;
        com.bytedance.hybrid.spark.page.c cVar = this.f81601j;
        String schema = dVar.getSchema();
        l.b(schema, "");
        com.ss.android.ugc.aweme.discover.lynx.spark.b.a(cVar, schema, (TemplateData) null, new b(this));
    }

    static void a(String str) {
        com.bytedance.android.alog.c.a(4, "SparkViewContainer", "lynx view is not already when " + str + ' ' + "\nyou can use setOnLoadListener and wait it load fished then continue your operate is recommended");
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void b(String str) {
        l.d(str, "");
        if (a()) {
            d dVar = this.f81593a;
            if (dVar == null) {
                l.b();
            }
            dVar.a().updateData(str);
            return;
        }
        this.f81596d.add(str);
        a("updateData:".concat(String.valueOf(str)));
    }

    public a(m mVar) {
        Context context;
        l.d(mVar, "");
        this.f81600h = mVar;
        mVar.getLifecycle().a(new SingleSparkView$1(this));
        if (mVar instanceof Fragment) {
            context = ((Fragment) mVar).requireContext();
            l.b(context, "");
        } else {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.content.Context");
            context = (Context) mVar;
        }
        this.f81601j = com.ss.android.ugc.aweme.discover.lynx.a.b(context);
        this.f81595c = new ArrayMap<>();
        this.f81596d = new ArrayList<>();
        this.f81597e = new ArrayList<>();
        this.f81598f = new ArrayList<>();
        this.f81599g = new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(List<com.ss.android.ugc.aweme.discover.lynx.container.a> list) {
        l.d(list, "");
        a(list.get(0).f81454b);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        l.d(viewGroup, "");
        l.d(layoutParams, "");
        f.a.a(this, viewGroup, 0, layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.container.f
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (a()) {
            d dVar = this.f81593a;
            if (dVar == null) {
                l.b();
            }
            dVar.a(str, jSONObject);
            return;
        }
        this.f81595c.put(str, jSONObject);
        a("sendEvent:" + str + ' ' + jSONObject);
    }
}
