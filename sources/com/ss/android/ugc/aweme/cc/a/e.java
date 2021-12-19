package com.ss.android.ugc.aweme.cc.a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cc.a.c;
import com.ss.android.ugc.aweme.cc.b;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f69785a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.cc.a f69786b = new com.ss.android.ugc.aweme.cc.b.a();

    /* renamed from: c  reason: collision with root package name */
    private c f69787c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final h f69788d = i.a((h.f.a.a) new a(this));

    /* renamed from: e  reason: collision with root package name */
    private String f69789e;

    /* renamed from: f  reason: collision with root package name */
    private long f69790f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f69791g;

    static {
        Covode.recordClassIndex(43027);
    }

    private ConcurrentHashMap<String, String> a() {
        return (ConcurrentHashMap) this.f69788d.getValue();
    }

    static final class a extends m implements h.f.a.a<ConcurrentHashMap<String, String>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(43028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<String, String> invoke() {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put("SearchResultActivity", "search_mix");
            return concurrentHashMap;
        }
    }

    @Override // com.ss.android.ugc.aweme.cc.a.b
    public final void a(Activity activity) {
        l.d(activity, "");
        this.f69789e = activity.getClass().getName();
        this.f69790f = System.currentTimeMillis();
        this.f69791g = true;
    }

    private final String a(String str) {
        List<String> split;
        if (TextUtils.isEmpty(str)) {
            return this.f69785a;
        }
        if (str == null || (split = new h.m.l("\\.").split(str, 0)) == null || split.isEmpty()) {
            return this.f69785a;
        }
        return split.get(split.size() - 1);
    }

    @Override // com.ss.android.ugc.aweme.cc.a.b
    public final void b(Activity activity) {
        l.d(activity, "");
        if (!TextUtils.isEmpty(this.f69789e) && this.f69791g && this.f69790f != 0 && TextUtils.equals(activity.getClass().getName(), this.f69789e)) {
            a(a(this.f69789e), b.CANCEL, 0);
            this.f69791g = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.cc.a.b
    public final void a(Activity activity, boolean z) {
        l.d(activity, "");
        if (z && !TextUtils.isEmpty(this.f69789e) && this.f69791g && this.f69790f != 0 && TextUtils.equals(activity.getClass().getName(), this.f69789e)) {
            String a2 = a(this.f69789e);
            long currentTimeMillis = System.currentTimeMillis() - this.f69790f;
            c cVar = this.f69787c;
            if (cVar != null) {
                l.d(a2, "");
                g.c().execute(new c.a(cVar, a2, currentTimeMillis));
            }
            a(a2, b.SUCCESS, currentTimeMillis);
            this.f69791g = false;
        }
    }

    private final void a(String str, b bVar, long j2) {
        String str2;
        com.ss.android.ugc.aweme.cc.a aVar;
        if (!TextUtils.isEmpty(str) && a().containsKey(str) && (str2 = a().get(str)) != null && (aVar = this.f69786b) != null) {
            l.b(str2, "");
            aVar.a(str2, bVar, j2);
        }
    }
}
