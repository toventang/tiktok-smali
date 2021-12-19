package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import android.util.Pair;
import androidx.h.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.a.n;
import com.bytedance.android.live.core.e.b;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.paging.b.c;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.l;
import com.bytedance.android.livesdk.livesetting.feed.RefreshShowSandBoxRoomSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.l.c;
import f.a.t;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FeedRepository extends BaseFeedRepository implements com.bytedance.android.livesdk.feed.a, l, au {

    /* renamed from: e  reason: collision with root package name */
    protected final FeedApi f17602e;

    /* renamed from: f  reason: collision with root package name */
    protected final com.bytedance.android.live.core.a.a<FeedDataKey, com.bytedance.android.live.base.model.c.a> f17603f;

    /* renamed from: g  reason: collision with root package name */
    protected l.a f17604g;

    /* renamed from: h  reason: collision with root package name */
    protected com.bytedance.android.livesdk.feed.feed.a<b<FeedItem>, com.bytedance.android.livesdk.feed.feed.b> f17605h;

    /* renamed from: i  reason: collision with root package name */
    protected c<Object> f17606i = new c<>();

    /* renamed from: j  reason: collision with root package name */
    protected c<String> f17607j = new c<>();

    /* renamed from: k  reason: collision with root package name */
    protected c<List<ImageModel>> f17608k = new c<>();

    /* renamed from: l  reason: collision with root package name */
    protected c<Pair<String, String>> f17609l = new c<>();

    /* renamed from: m  reason: collision with root package name */
    protected c<String> f17610m;
    protected final com.bytedance.android.livesdk.feed.g.a n;
    protected b<FeedItem> o;
    protected int p;
    protected final com.bytedance.android.live.core.a.a<Long, Integer> q;
    public h r;
    public a s;
    String t;
    private com.bytedance.android.livesdk.feed.d.a u;
    private String v;

    static {
        Covode.recordClassIndex(9762);
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final t<String> a() {
        return this.f17607j;
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final t<List<ImageModel>> b() {
        return this.f17608k;
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final h d() {
        return this.r;
    }

    @Override // com.bytedance.android.livesdk.feed.r
    public final List<FeedItem> e() {
        return this.f17595b.b(h());
    }

    private int i() {
        l.a aVar = this.f17604g;
        if (aVar == null || aVar.b() <= 0) {
            return 12;
        }
        return this.f17604g.b();
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final void c() {
        if (this.f17594a != null) {
            h();
            TextUtils.equals(this.t, "enter_auto");
            h();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.r
    public final void f() {
        this.f17595b.d(h());
        a aVar = this.s;
        if (aVar != null) {
            aVar.f17621k.a();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.r
    public final void g() {
        this.f17595b.d(h());
        if (this.o != null) {
            com.bytedance.android.b.a.a.f6785g.d();
            this.o.f();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.repository.BaseFeedRepository
    public final FeedDataKey h() {
        l.a aVar = this.f17604g;
        if (aVar != null) {
            return aVar.a();
        }
        throw new IllegalStateException("not call init() or params be null");
    }

    public static class a implements com.bytedance.android.live.core.paging.c.b<FeedItem> {

        /* renamed from: a  reason: collision with root package name */
        int f17611a;

        /* renamed from: b  reason: collision with root package name */
        public String f17612b;

        /* renamed from: c  reason: collision with root package name */
        String f17613c = "enter_auto";

        /* renamed from: d  reason: collision with root package name */
        String f17614d = "feed_loadmore";

        /* renamed from: e  reason: collision with root package name */
        h f17615e;

        /* renamed from: f  reason: collision with root package name */
        c<String> f17616f;

        /* renamed from: g  reason: collision with root package name */
        c<String> f17617g;

        /* renamed from: h  reason: collision with root package name */
        long f17618h;

        /* renamed from: i  reason: collision with root package name */
        com.bytedance.android.livesdk.feed.a f17619i;

        /* renamed from: j  reason: collision with root package name */
        c<List<ImageModel>> f17620j;

        /* renamed from: k  reason: collision with root package name */
        final f.a.b.a f17621k = new f.a.b.a();

        /* renamed from: l  reason: collision with root package name */
        private FeedApi f17622l;

        /* renamed from: m  reason: collision with root package name */
        private com.bytedance.android.livesdk.feed.g.a f17623m;
        private AbstractC0368a n;
        private com.bytedance.android.livesdk.feed.d.a o;
        private FeedDataKey p;

        /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a$a  reason: collision with other inner class name */
        interface AbstractC0368a {
            static {
                Covode.recordClassIndex(9764);
            }
        }

        static {
            Covode.recordClassIndex(9763);
        }

        private void a(f.a.b.b bVar) {
            this.f17621k.a(bVar);
        }

        @Override // com.bytedance.android.live.core.paging.c.b
        public final t<Pair<List<FeedItem>, com.bytedance.android.live.base.model.c.a>> a(boolean z, Long l2) {
            t<com.bytedance.android.live.network.response.a<FeedItem, com.bytedance.android.live.base.model.c.a>> feed;
            a(t.b((Object) 1).e(3000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(this), l.f17635a));
            if (z) {
                this.f17619i.a(a.EnumC0361a.REFRESH, this.f17613c);
                if (this.f17618h > 0) {
                    feed = this.f17622l.feed(this.f17612b, 0, "push");
                } else {
                    if (RefreshShowSandBoxRoomSetting.INSTANCE.getValue() && ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel().equals("local_test")) {
                        this.f17613c = "feed_refresh_local_test";
                    }
                    feed = this.f17622l.feed(this.f17612b, 0, this.f17613c);
                }
                this.f17616f.onNext(this.f17613c);
            } else {
                this.f17619i.a(a.EnumC0361a.LOAD_MORE, this.f17614d);
                feed = this.f17622l.feed(this.f17612b, l2.longValue(), this.f17614d);
                this.f17616f.onNext(this.f17614d);
                this.f17617g.onNext(this.f17614d);
            }
            return feed.d(new m(this, z)).b(new n(this)).b(new o(this)).b(p.f17640a).b(new q(this)).a(new r(this, z));
        }

        a(String str, FeedApi feedApi, com.bytedance.android.livesdk.feed.g.a aVar, h hVar, c<Pair<String, String>> cVar, com.bytedance.android.livesdk.feed.a aVar2, c<String> cVar2, c<String> cVar3, String str2, AbstractC0368a aVar3, com.bytedance.android.livesdk.feed.d.a aVar4, FeedDataKey feedDataKey, c<List<ImageModel>> cVar4) {
            this.f17612b = str;
            this.f17622l = feedApi;
            this.n = aVar3;
            this.f17615e = hVar;
            this.f17623m = aVar;
            this.o = aVar4;
            this.p = feedDataKey;
            this.f17616f = cVar2;
            this.f17619i = aVar2;
            this.f17617g = cVar3;
            this.f17613c = str2;
            a(cVar.a(new h(this), i.f17632a));
            this.f17620j = cVar4;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final void a(l.a aVar) {
        this.f17604g = aVar;
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final void b(String str) {
        this.v = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.live.core.e.b bVar) {
        c<Object> cVar;
        if (bVar != null && bVar.f9012a == b.a.SUCCESS && (cVar = this.f17606i) != null) {
            cVar.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.r
    public final FeedItem d(String str) {
        return (FeedItem) this.f17595b.a((Object) h(), (n) new g(str));
    }

    @Override // com.bytedance.android.livesdk.feed.r
    public final void c(String str) {
        FeedItem d2 = d(str);
        if (d2 != null) {
            this.f17595b.a(h(), d2);
        }
        com.bytedance.android.live.core.paging.b<FeedItem> bVar = this.o;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final com.bytedance.android.livesdk.feed.feed.a<com.bytedance.android.live.core.paging.b<FeedItem>, com.bytedance.android.livesdk.feed.feed.b> a(String str) {
        String str2;
        int i2;
        a(this.f17603f.a(this.f17604g.a()).d(d.f17627a));
        FeedApi feedApi = this.f17602e;
        com.bytedance.android.livesdk.feed.g.a aVar = this.n;
        h hVar = this.r;
        c<Pair<String, String>> cVar = this.f17609l;
        c<String> cVar2 = this.f17610m;
        c<String> cVar3 = this.f17607j;
        if (!com.bytedance.common.utility.m.a(this.v)) {
            str2 = this.v;
        } else {
            str2 = "enter_auto";
        }
        this.s = new a(str, feedApi, aVar, hVar, cVar, this, cVar2, cVar3, str2, new e(this), this.u, this.f17604g.a(), this.f17608k);
        com.bytedance.android.live.core.paging.b.c cVar4 = new com.bytedance.android.live.core.paging.b.c();
        cVar4.o = this.s;
        cVar4.f9170k = (CacheKey) this.f17604g.a();
        cVar4.f9171l = this.f17595b;
        cVar4.f9172m = (com.bytedance.android.live.core.a.a<CacheKey, com.bytedance.android.live.base.model.c.a>) this.f17603f;
        i.d.a aVar2 = new i.d.a();
        aVar2.f3170d = false;
        aVar2.f3167a = i();
        aVar2.f3169c = i();
        l.a aVar3 = this.f17604g;
        if (aVar3 == null || aVar3.c() <= 0) {
            i2 = 4;
        } else {
            i2 = this.f17604g.c();
        }
        aVar2.f3168b = i2;
        cVar4.n = aVar2.a();
        c.AnonymousClass1 r4 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0090: CONSTRUCTOR  (r4v1 'r4' com.bytedance.android.live.core.paging.b.c$1) = (r5v1 'cVar4' com.bytedance.android.live.core.paging.b.c) call: com.bytedance.android.live.core.paging.b.c.1.<init>(com.bytedance.android.live.core.paging.b.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.repository.FeedRepository.a(java.lang.String):com.bytedance.android.livesdk.feed.feed.a<com.bytedance.android.live.core.paging.b<com.bytedance.android.livesdk.model.FeedItem>, com.bytedance.android.livesdk.feed.feed.b>, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.core.paging.b.c, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.repository.FeedRepository.a(java.lang.String):com.bytedance.android.livesdk.feed.feed.a");
    }

    @Override // com.bytedance.android.livesdk.feed.l
    public final void a(String str, String str2) {
        this.f17609l.onNext(new Pair<>(str, str2));
    }

    public FeedRepository(h hVar, FeedApi feedApi, com.bytedance.android.live.core.a.a<FeedDataKey, com.bytedance.android.live.base.model.c.a> aVar, com.bytedance.android.live.core.a.b<FeedDataKey, FeedItem> bVar, com.bytedance.android.live.core.a.a<Long, Integer> aVar2, com.bytedance.android.livesdk.feed.g.a aVar3, com.bytedance.android.livesdk.feed.d.a aVar4) {
        super(hVar, bVar);
        f.a.l.c<String> cVar = new f.a.l.c<>();
        this.f17610m = cVar;
        this.p = -1;
        this.v = null;
        this.r = hVar;
        this.f17602e = feedApi;
        this.f17603f = aVar;
        this.q = aVar2;
        this.n = aVar3;
        this.u = aVar4;
        a(cVar.a(new a(this), b.f17625a));
        a(bVar.a().d(c.f17626a));
    }
}
