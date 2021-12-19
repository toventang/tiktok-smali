package com.ss.android.ugc.aweme.discover.lynx.a;

import android.content.Context;
import android.content.MutableContextWrapper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.discover.a.o;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public e f81410a;

    /* renamed from: b  reason: collision with root package name */
    public i f81411b;

    /* renamed from: c  reason: collision with root package name */
    public String f81412c;

    /* renamed from: d  reason: collision with root package name */
    public LynxView f81413d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f81414e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f81415f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f81416g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.d f81417h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, ? extends Object> f81418i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f81419j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f81420k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f81421l;

    /* renamed from: m  reason: collision with root package name */
    public final h f81422m;
    public com.ss.android.ugc.aweme.discover.lynx.c.a n;
    public Object o;
    public int p;
    public com.ss.android.ugc.aweme.discover.lynx.spark.d q;
    public final com.ss.android.ugc.aweme.discover.lynx.e.b r;
    private List<p> s;
    private final h t;

    static {
        Covode.recordClassIndex(50598);
    }

    public final d a() {
        return (d) this.t.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.b$b  reason: collision with other inner class name */
    public static final class C1897b implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f81424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f81425b;

        /* renamed from: c  reason: collision with root package name */
        private final String f81426c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f81427d;

        static {
            Covode.recordClassIndex(50600);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f81426c;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final Object b() {
            return this.f81427d;
        }

        C1897b(p pVar, b bVar) {
            JSONObject jSONObject;
            this.f81424a = pVar;
            this.f81425b = bVar;
            this.f81426c = pVar.a();
            if (bVar.f81415f) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", pVar.b());
                jSONObject2.put("code", 1);
                jSONObject2.put("reactId", bVar.f81412c);
                jSONObject = jSONObject2;
            } else {
                jSONObject = pVar.b();
            }
            this.f81427d = jSONObject;
        }
    }

    public static final class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f81429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f81430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f81431c;

        /* renamed from: d  reason: collision with root package name */
        private final String f81432d;

        static {
            Covode.recordClassIndex(50602);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f81432d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f81429a;
        }

        d(String str, JSONObject jSONObject) {
            this.f81430b = str;
            this.f81431c = jSONObject;
            this.f81432d = str;
            this.f81429a = jSONObject;
        }
    }

    static final class a extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81423a = new a();

        static {
            Covode.recordClassIndex(50599);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class c extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f81428a = new c();

        static {
            Covode.recordClassIndex(50601);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    public final void b() {
        this.f81411b = null;
        this.f81412c = null;
        this.q = null;
    }

    public final void c() {
        if (this.f81411b != null && this.f81412c != null) {
            Iterator<T> it = this.s.iterator();
            while (it.hasNext()) {
                C1897b bVar = new C1897b(it.next(), this);
                i iVar = this.f81411b;
                if (iVar != null) {
                    iVar.onEvent(bVar);
                }
            }
            this.s.clear();
        }
    }

    public b(com.ss.android.ugc.aweme.discover.lynx.e.b bVar) {
        Context context;
        l.d(bVar, "");
        this.r = bVar;
        Context context2 = bVar.getContext();
        e eVar = null;
        e eVar2 = (e) (!(context2 instanceof e) ? null : context2);
        if (eVar2 == null) {
            Context context3 = bVar.getContext();
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) (!(context3 instanceof MutableContextWrapper) ? null : context3);
            if (mutableContextWrapper != null) {
                context = mutableContextWrapper.getBaseContext();
            } else {
                context = null;
            }
            eVar2 = context instanceof e ? context : eVar;
        }
        this.f81410a = eVar2;
        this.f81414e = true;
        this.s = new ArrayList();
        this.f81419j = o.a();
        this.f81422m = h.i.a((h.f.a.a) a.f81423a);
        this.t = h.i.a((h.f.a.a) c.f81428a);
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (this.r.b()) {
            com.ss.android.ugc.aweme.discover.lynx.spark.d dVar = this.q;
            if (dVar != null) {
                dVar.a(str, jSONObject);
                return;
            }
            return;
        }
        this.s.add(new d(str, jSONObject));
        c();
    }
}
