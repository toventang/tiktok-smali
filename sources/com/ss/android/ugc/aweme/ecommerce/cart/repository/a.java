package com.ss.android.ugc.aweme.ecommerce.cart.repository;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c;
import com.zhiliaoapp.musically.R;
import f.a.e.e.e.au;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.bytedance.jedi.a.j.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f84677c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final C2025a f84678d = new C2025a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, com.ss.android.ugc.aweme.ecommerce.pdp.repository.d> f84679b = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final h f84680e = i.a((h.f.a.a) e.f84708a);

    /* renamed from: f  reason: collision with root package name */
    private final h f84681f = i.a((h.f.a.a) f.f84709a);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$a  reason: collision with other inner class name */
    public static final class C2025a {
        static {
            Covode.recordClassIndex(52871);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$a$a  reason: collision with other inner class name */
        public static final class C2026a extends com.google.gson.b.a<Map<String, Object>> {
            static {
                Covode.recordClassIndex(52872);
            }

            C2026a() {
            }
        }

        private C2025a() {
        }

        public /* synthetic */ C2025a(byte b2) {
            this();
        }

        public static String a(HashMap<String, Object> hashMap) {
            Map map = null;
            try {
                com.google.gson.f fVar = new com.google.gson.f();
                Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
                if (obj != null) {
                    map = (Map) fVar.a((String) obj, new C2026a().type);
                    if (map != null && map.containsKey("room_id")) {
                        Object obj2 = map.get("room_id");
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        map.put("source_content_id", obj2);
                    }
                    List<String> list = com.ss.android.ugc.aweme.ecommerce.ab.d.a().f84227b;
                    JSONObject jSONObject = new JSONObject();
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (list.contains(str)) {
                                jSONObject.put(str, value);
                            }
                        }
                    }
                    String jSONObject2 = jSONObject.toString();
                    l.b(jSONObject2, "");
                    return jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (Exception unused) {
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84707a = new d();

        static {
            Covode.recordClassIndex(52880);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f84710a;

        static {
            Covode.recordClassIndex(52883);
        }

        g(h.f.a.a aVar) {
            this.f84710a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f84710a.invoke(), "");
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.cart.repository.api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84708a = new e();

        static {
            Covode.recordClassIndex(52881);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.cart.repository.api.a invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.cart.repository.api.a();
        }
    }

    static final class f extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f84709a = new f();

        static {
            Covode.recordClassIndex(52882);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(52870);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f84705b = true;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f84706c;

        static {
            Covode.recordClassIndex(52878);
        }

        c(a aVar, View view) {
            this.f84704a = aVar;
            this.f84706c = view;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.cart.repository.a$c$a  reason: collision with other inner class name */
        static final class C2027a extends m implements h.f.a.a<z> {
            final /* synthetic */ View $view;

            static {
                Covode.recordClassIndex(52879);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2027a(View view) {
                super(0);
                this.$view = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String str;
                Resources resources;
                com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.$view);
                Context context = this.$view.getContext();
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    str = resources.getString(R.string.bj_);
                }
                bVar.a(str).b();
                return z.f158842a;
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            View view;
            if (this.f84705b && (view = this.f84706c) != null) {
                this.f84704a.a(new C2027a(view));
            }
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        ((Handler) this.f84681f.getValue()).post(new g(aVar));
    }

    static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f84688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f84689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f84690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f84691e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f84692f;

        static {
            Covode.recordClassIndex(52873);
        }

        b(a aVar, View view, View view2, boolean z, h.f.a.b bVar, h.f.a.m mVar) {
            this.f84687a = aVar;
            this.f84688b = view;
            this.f84689c = view2;
            this.f84690d = z;
            this.f84691e = bVar;
            this.f84692f = mVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final View view;
            T t;
            final c cVar = (c) obj;
            l.d(cVar, "");
            if (cVar.isCodeOK()) {
                view = this.f84688b;
            } else {
                view = this.f84689c;
            }
            T t2 = cVar.data;
            if (!(t2 == null || t2.f84683b == null || view == null || (cVar.isCodeOK() && !this.f84690d))) {
                this.f84687a.a(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(52874);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
                        if (((java.lang.Boolean) r2.invoke(r1)).booleanValue() != true) goto L_0x001a;
                     */
                    @Override // h.f.a.a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ h.z invoke() {
                        /*
                            r5 = this;
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b r0 = r5.this$0
                            h.f.a.b r2 = r0.f84691e
                            if (r2 == 0) goto L_0x001a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c r1 = r4
                            java.lang.String r0 = ""
                            h.f.b.l.b(r1, r0)
                            java.lang.Object r0 = r2.invoke(r1)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r1 = r0.booleanValue()
                            r0 = 1
                            if (r1 == r0) goto L_0x0030
                        L_0x001a:
                            android.view.View r4 = r2
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c r0 = r4
                            T r0 = r0.data
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a.a r0 = (com.ss.android.ugc.aweme.ecommerce.cart.repository.a.a) r0
                            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r3 = r0.f84683b
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$1 r2 = com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b.AnonymousClass1.AnonymousClass1.f84702a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$2 r1 = com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b.AnonymousClass1.AnonymousClass2.f84703a
                            com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$3 r0 = new com.ss.android.ugc.aweme.ecommerce.cart.repository.a$b$1$3
                            r0.<init>(r5)
                            com.ss.android.ugc.aweme.ecommerce.common.d.a(r4, r3, r2, r1, r0)
                        L_0x0030:
                            h.z r0 = h.z.f158842a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b.AnonymousClass1.invoke():java.lang.Object");
                    }
                });
            }
            if (cVar.isCodeOK() || ((t = cVar.data) != null && t.f84683b != null)) {
                return cVar;
            }
            throw new RuntimeException("data error");
        }
    }

    public final t<c> a(b bVar, View view, View view2, boolean z, h.f.a.m<? super c, ? super ButtonAction, Boolean> mVar, h.f.a.b<? super c, Boolean> bVar2) {
        l.d(bVar, "");
        t<c> a2 = au.a(((com.bytedance.jedi.a.f.a) this.f84680e.getValue()).c(bVar).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new b(this, view2, view, z, bVar2, mVar)).a(new c(this, view)).c(d.f84707a), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }
}
