package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.i;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a;
import com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.hl;
import f.a.e.e.e.bo;
import f.a.j.c;
import f.a.t;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class b implements h.b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f73896g = b.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final a f73897h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f73898a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.b<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a> f73899b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.b<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.b> f73900c;

    /* renamed from: d  reason: collision with root package name */
    public String f73901d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.lifecycle.k f73902e;

    /* renamed from: f  reason: collision with root package name */
    public final IAdLandPagePreloadService f73903f;

    /* renamed from: i  reason: collision with root package name */
    private boolean f73904i;

    /* renamed from: j  reason: collision with root package name */
    private long f73905j;

    /* renamed from: k  reason: collision with root package name */
    private final WishListBulletApi f73906k;

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f73912a = new g();

        static {
            Covode.recordClassIndex(45534);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f73914a = new i();

        static {
            Covode.recordClassIndex(45536);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f73918a = new l();

        static {
            Covode.recordClassIndex(45539);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(iVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45528);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class m implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f73919a = new JSONObject();

        /* renamed from: b  reason: collision with root package name */
        private final String f73920b = "favoritePageShow";

        static {
            Covode.recordClassIndex(45540);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f73920b;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f73919a;
        }

        m() {
        }
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(45527);
    }

    public final void a() {
        f.a.b.b a2 = this.f73906k.getWishListGeckoChannel().b(f.a.h.a.b(f.a.k.a.f158006c)).c(new C1660b(this)).a(new c(this), new d(this));
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, this.f73898a);
    }

    public static final class e<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        public static final e f73910a = new e();

        static {
            Covode.recordClassIndex(45532);
        }

        e() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            h.f.b.l.d(obj, "");
            return obj instanceof a.c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$b  reason: collision with other inner class name */
    public static final class C1660b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73907a;

        static {
            Covode.recordClassIndex(45529);
        }

        C1660b(b bVar) {
            this.f73907a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f73907a.f73899b.onNext(a.b.f73868a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73909a;

        static {
            Covode.recordClassIndex(45531);
        }

        d(b bVar) {
            this.f73909a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f73909a.f73899b.onNext(a.C1657a.f73867a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73908a;

        static {
            Covode.recordClassIndex(45530);
        }

        c(b bVar) {
            this.f73908a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.d dVar = (com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.d) obj;
            f.a.l.b<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a> bVar = this.f73908a.f73899b;
            h.f.b.l.b(dVar, "");
            bVar.onNext(new a.c(dVar));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.k {

        /* renamed from: a  reason: collision with root package name */
        public static final j f73915a = new j();

        static {
            Covode.recordClassIndex(45537);
        }

        j() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            h.p pVar = (h.p) obj;
            h.f.b.l.d(pVar, "");
            if (!(pVar.getFirst() instanceof i.b) || !(pVar.getSecond() instanceof a.c)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        h.f.b.l.d(uri, "");
        this.f73900c.onNext(b.C1658b.f73871a);
        this.f73905j = System.currentTimeMillis();
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73911a;

        static {
            Covode.recordClassIndex(45533);
        }

        public f(b bVar) {
            this.f73911a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> geckoChannels;
            com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a aVar = (com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a) obj;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.model.GeckoInfoFetchResult.Success");
            com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.c lynxSchema = ((a.c) aVar).f73869a.getLynxSchema();
            if (lynxSchema != null && (geckoChannels = lynxSchema.getGeckoChannels()) != null) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                h.f.b.l.b(f2, "");
                f2.a().c(geckoChannels);
            }
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a f73913a;

        static {
            Covode.recordClassIndex(45535);
        }

        public h(com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.a.a aVar) {
            this.f73913a = aVar;
        }

        @Override // f.a.d.f
        public final void accept(Object obj) {
            if ((obj instanceof a.b) || (obj instanceof i.c) || (obj instanceof b.C1658b)) {
                this.f73913a.a();
            } else if ((obj instanceof a.C1657a) || (obj instanceof b.a)) {
                this.f73913a.b();
            } else if (obj instanceof b.c) {
                this.f73913a.c();
            }
        }
    }

    private final com.ss.android.ugc.aweme.app.f.d a(boolean z) {
        String queryParameter;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("success", z ? 1 : 0).a("load_time", String.valueOf(((float) (System.currentTimeMillis() - this.f73905j)) / 1000.0f));
        String str = this.f73901d;
        if (str == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("schema_url", str);
        Uri parse = Uri.parse(this.f73901d);
        String str2 = null;
        if (parse != null) {
            str2 = parse.getQueryParameter("channel");
        }
        if (!(str2 == null || str2.length() == 0 || str2 == null)) {
            a3.a("channel", str2);
        }
        Uri parse2 = Uri.parse(this.f73901d);
        if (!(parse2 == null || (queryParameter = parse2.getQueryParameter("bundle")) == null || queryParameter.length() == 0 || queryParameter == null)) {
            a3.a("bundle", queryParameter);
        }
        h.f.b.l.b(a3, "");
        return a3;
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.d f73917b;

        static {
            Covode.recordClassIndex(45538);
        }

        k(b bVar, com.bytedance.ies.bullet.ui.common.d dVar) {
            this.f73916a = bVar;
            this.f73917b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String renderUrl;
            String str;
            IResourceLoaderService iResourceLoaderService;
            Object second = ((h.p) obj).getSecond();
            Objects.requireNonNull(second, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.model.GeckoInfoFetchResult.Success");
            com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.c lynxSchema = ((a.c) second).f73869a.getLynxSchema();
            if (lynxSchema != null && (renderUrl = lynxSchema.getRenderUrl()) != null) {
                this.f73916a.f73901d = renderUrl;
                b bVar = this.f73916a;
                com.bytedance.ies.bullet.ui.common.d dVar = this.f73917b;
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                if (f2 == null || (str = f2.g("lynx_feed")) == null) {
                    str = "";
                }
                if (hl.a(str) && (iResourceLoaderService = (IResourceLoaderService) e.a.a().a(IResourceLoaderService.class)) != null) {
                    GeckoConfig a2 = com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(iResourceLoaderService), str);
                    if (!h.f.b.l.a((Object) a2.getAccessKey(), (Object) str)) {
                        iResourceLoaderService.registerConfig(str, new GeckoConfig(str, a2.getOfflineDir(), a2.getLoaderDepender(), false, false, 24, null));
                    }
                    androidx.lifecycle.i lifecycle = dVar.getLifecycle();
                    iResourceLoaderService.registerCustomLoader(com.ss.android.ugc.aweme.commercialize.e_commerce.a.a.class, com.bytedance.ies.bullet.service.base.e.HIGH);
                    lifecycle.b(bVar.f73902e);
                    lifecycle.a(bVar.f73902e);
                }
                this.f73917b.a(com.ss.android.ugc.aweme.bullet.utils.c.a(renderUrl), (Bundle) null, this.f73916a);
            }
        }
    }

    public final void a(com.bytedance.ies.bullet.ui.common.d dVar) {
        h.f.b.l.d(dVar, "");
        if (!this.f73904i) {
            this.f73904i = true;
            t<com.ss.android.ugc.aweme.ad.preload.i> b2 = this.f73903f.a().b();
            t<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a> c2 = this.f73899b.c();
            h.f.b.l.b(c2, "");
            h.f.b.l.c(b2, "");
            h.f.b.l.c(c2, "");
            c.a aVar = c.a.f157995a;
            f.a.e.b.b.a((Object) c2, "other is null");
            f.a.e.b.b.a((Object) aVar, "combiner is null");
            t a2 = f.a.h.a.a(new bo(b2, aVar, c2));
            h.f.b.l.a((Object) a2, "");
            f.a.b.b a3 = a2.a(j.f73915a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(this, dVar), l.f73918a);
            h.f.b.l.b(a3, "");
            f.a.j.a.a(a3, this.f73898a);
        }
    }

    public b(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        h.f.b.l.d(wishListBulletApi, "");
        h.f.b.l.d(iAdLandPagePreloadService, "");
        this.f73906k = wishListBulletApi;
        this.f73903f = iAdLandPagePreloadService;
        f.a.l.b<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.a> bVar = new f.a.l.b<>();
        h.f.b.l.b(bVar, "");
        this.f73899b = bVar;
        f.a.l.b<com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.b> bVar2 = new f.a.l.b<>();
        h.f.b.l.b(bVar2, "");
        this.f73900c = bVar2;
        this.f73902e = WishListManager$lifecycleEventObserver$1.f73893a;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        h.f.b.l.d(uri, "");
        h.f.b.l.d(th, "");
        this.f73900c.onNext(b.a.f73870a);
        r.a("ads_wishlist_tab_load", a(false).f66730a);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(uri, "");
        h.f.b.l.d(iVar, "");
        iVar.onEvent(new m());
        this.f73900c.onNext(b.c.f73872a);
        view.getContext();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = b();
        }
        r.a("ads_wishlist_tab_load", a(com.ss.android.ugc.aweme.lancet.j.f107226e).f66730a);
    }
}
