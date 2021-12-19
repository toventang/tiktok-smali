package com.ss.android.ugc.aweme.cn;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cn.a.c;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import f.a.d.f;
import f.a.t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, g> f71235a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, g> f71236b;

    /* renamed from: c  reason: collision with root package name */
    public final c f71237c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f71238d = g.a(l.a(o.SERIAL).a());

    static {
        Covode.recordClassIndex(43845);
    }

    public final boolean a(String str) {
        return this.f71235a.keySet().contains(str);
    }

    public final void a(c cVar) {
        h.f.b.l.d(cVar, "");
        t<i> c2 = cVar.f71200b.c();
        h.f.b.l.b(c2, "");
        c2.a(f.a.k.a.a(this.f71238d)).a(new a(this), new b(this));
    }

    static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f71240a;

        static {
            Covode.recordClassIndex(43847);
        }

        b(j jVar) {
            this.f71240a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            this.f71240a.f71237c.a("action_name_stop_preview", null, new e(false, false, false, null, null, false, null, false, 254));
            StringBuilder sb = new StringBuilder("stream onError: ");
            h.f.b.l.b(th2, "");
            com.ss.android.ugc.tools.c.f149151f.d("qilan: SensitiveApiManagement: onError: ".concat(String.valueOf(sb.append(th2.getStackTrace()).toString())));
        }
    }

    static final class a<T> implements f<i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f71239a;

        static {
            Covode.recordClassIndex(43846);
        }

        a(j jVar) {
            this.f71239a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
            if (r2 == false) goto L_0x0076;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.cn.i r10) {
            /*
            // Method dump skipped, instructions count: 422
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cn.j.a.accept(java.lang.Object):void");
        }
    }

    public j(Map<String, g> map, c cVar) {
        h.f.b.l.d(map, "");
        h.f.b.l.d(cVar, "");
        this.f71236b = map;
        this.f71237c = cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f71235a = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}
