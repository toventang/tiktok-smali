package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.m;
import com.bytedance.lighten.a.g;
import com.bytedance.lighten.a.n;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.n.al;
import com.facebook.imagepipeline.n.c;
import com.facebook.imagepipeline.n.k;
import com.facebook.imagepipeline.n.t;
import java.util.HashMap;
import java.util.Map;

final class p extends c<a> {

    /* renamed from: a  reason: collision with root package name */
    private n f39993a;

    /* renamed from: b  reason: collision with root package name */
    private String f39994b;

    static {
        Covode.recordClassIndex(24659);
    }

    public final String toString() {
        return "use fetcher: " + this.f39994b;
    }

    public p(n nVar) {
        this.f39993a = nVar;
    }

    public static class a extends t {

        /* renamed from: a  reason: collision with root package name */
        public g f39997a;

        static {
            Covode.recordClassIndex(24661);
        }

        public a(k<e> kVar, al alVar) {
            super(kVar, alVar);
        }
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final /* synthetic */ t createFetchState(k kVar, al alVar) {
        a aVar = new a(kVar, alVar);
        aVar.f39997a = new g();
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.n.c, com.facebook.imagepipeline.n.ag
    public final /* synthetic */ void onFetchCompletion(a aVar, int i2) {
        a aVar2 = aVar;
        if (aVar2.f39997a.f39853j != null) {
            aVar2.f39997a.f39853j.run();
        }
    }

    @Override // com.facebook.imagepipeline.n.ag
    public final /* synthetic */ void fetch(t tVar, ag.a aVar) {
        a aVar2 = (a) tVar;
        if (aVar2 != null) {
            n nVar = new n(aVar);
            aVar2.f39997a.f39851h = aVar2.c();
            aVar2.f39997a.f39852i = new o(aVar2.f48390e);
            aVar2.f39997a.f39849f = aVar2.a();
            aVar2.f39997a.f39855l = aVar2.d();
            com.f.a.c cVar = t.f40037a;
            if (cVar != null) {
                aVar2.f39997a.f39854k = cVar.f46471b;
            }
            final m a2 = this.f39993a.a();
            this.f39994b = a2.getClass().getName();
            a2.a(aVar2.f39997a);
            aVar2.f48390e.a(new com.facebook.imagepipeline.n.e() {
                /* class com.bytedance.lighten.loader.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24660);
                }

                @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
                public final void a() {
                    a2.a();
                }
            });
            a2.a(aVar2.f39997a, nVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.n.c, com.facebook.imagepipeline.n.ag
    public final /* synthetic */ Map getExtraMap(a aVar, int i2) {
        String str;
        a aVar2 = aVar;
        HashMap hashMap = new HashMap(5);
        if (aVar2.f39997a.f39845b == 0 || aVar2.f39997a.f39844a == 0) {
            hashMap.put("queue_time", Long.toString(-1));
        } else {
            hashMap.put("queue_time", Long.toString(aVar2.f39997a.f39845b - aVar2.f39997a.f39844a));
        }
        if (aVar2.f39997a.f39847d == 0 || aVar2.f39997a.f39845b == 0) {
            hashMap.put("fetch_time", Long.toString(-1));
        } else {
            hashMap.put("fetch_time", Long.toString(aVar2.f39997a.f39847d - aVar2.f39997a.f39845b));
        }
        if (aVar2.f39997a.f39847d == 0 || aVar2.f39997a.f39844a == 0) {
            hashMap.put("total_time", Long.toString(-1));
        } else {
            hashMap.put("total_time", Long.toString(aVar2.f39997a.f39847d - aVar2.f39997a.f39844a));
        }
        hashMap.put("image_size", Integer.toString(i2));
        if (aVar2.f39997a.f39850g) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("hit_cdn_cache", str);
        hashMap.put("content_length", Long.toString(aVar2.f39997a.f39856m));
        return hashMap;
    }
}
