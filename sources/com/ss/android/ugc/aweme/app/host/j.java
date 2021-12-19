package com.ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.c.c.ab;
import com.google.c.c.ai;
import com.ss.android.ugc.aweme.app.host.c;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.h;
import com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment;
import com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity;
import com.ss.android.ugc.aweme.favorites.ui.ac;
import com.ss.android.ugc.aweme.favorites.ui.x;
import com.ss.android.ugc.aweme.favorites.ui.y;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.d;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.e;
import com.ss.android.ugc.aweme.music.assem.list.q;
import com.ss.android.ugc.aweme.music.assem.list.u;
import com.ss.android.ugc.aweme.music.assem.list.v;
import com.ss.android.ugc.aweme.music.search.t;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.ss.android.ugc.aweme.profile.edit.l;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.az;
import com.ss.android.ugc.aweme.profile.ui.bm;
import com.ss.android.ugc.aweme.profile.ui.co;
import com.ss.android.ugc.aweme.profile.widgets.common.o;
import com.ss.android.ugc.aweme.profile.widgets.follow.n;
import com.ss.android.ugc.aweme.profile.widgets.follow.p;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.m;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.ss.android.ugc.aweme.qrcode.presenter.a.k;
import com.ss.android.ugc.aweme.recommend.users.profile.ui.i;
import dagger.a.f;
import f.a.aa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class j extends c.AbstractC1495c {

    /* renamed from: a  reason: collision with root package name */
    public final dagger.hilt.android.internal.c.c f66760a;

    static {
        Covode.recordClassIndex(41106);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        dagger.hilt.android.internal.c.c f66802a;

        static {
            Covode.recordClassIndex(41122);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    final class b extends c.b {

        /* renamed from: a  reason: collision with root package name */
        volatile javax.a.a<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a> f66762a;

        /* renamed from: b  reason: collision with root package name */
        volatile javax.a.a<GiphyAnalytics> f66763b;

        /* renamed from: c  reason: collision with root package name */
        volatile javax.a.a<GiphyViewModel.a> f66764c;

        /* renamed from: d  reason: collision with root package name */
        volatile javax.a.a<aa> f66765d;

        static {
            Covode.recordClassIndex(41108);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b  reason: collision with other inner class name */
        final class C1496b extends c.a {
            private volatile javax.a.a<m> A;
            private volatile javax.a.a<h> B;
            private volatile Object C;
            private volatile Object D;
            private volatile Object E;
            private volatile Object F;

            /* renamed from: a  reason: collision with root package name */
            public final Activity f66769a;

            /* renamed from: b  reason: collision with root package name */
            final com.ss.android.ugc.aweme.relation.api.a f66770b;

            /* renamed from: c  reason: collision with root package name */
            final com.ss.android.ugc.aweme.comment.page.tag.b.a f66771c;

            /* renamed from: d  reason: collision with root package name */
            volatile javax.a.a<q> f66772d;

            /* renamed from: e  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.relation.api.d> f66773e;

            /* renamed from: f  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.music.search.q> f66774f;

            /* renamed from: g  reason: collision with root package name */
            volatile javax.a.a<n> f66775g;

            /* renamed from: h  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.profile.widgets.common.m> f66776h;

            /* renamed from: i  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.recommend.users.profile.a.b> f66777i;

            /* renamed from: j  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.profile.widgets.recommend.user.d> f66778j;

            /* renamed from: k  reason: collision with root package name */
            volatile javax.a.a<com.ss.android.ugc.aweme.comment.page.tag.api.h> f66779k;

            /* renamed from: l  reason: collision with root package name */
            volatile javax.a.a<String> f66780l;
            private volatile androidx.fragment.app.e n;
            private volatile Object o;
            private volatile javax.a.a<Fragment> p;
            private volatile Object q;
            private volatile javax.a.a<az> r;
            private volatile javax.a.a<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.f> s;
            private volatile javax.a.a<com.ss.android.ugc.aweme.music.assem.video.d> t;
            private volatile javax.a.a<u> u;
            private volatile javax.a.a<com.ss.android.ugc.aweme.relation.viewmodel.c> v;
            private volatile javax.a.a<t> w;
            private volatile javax.a.a<p> x;
            private volatile javax.a.a<o> y;
            private volatile javax.a.a<i> z;

            static {
                Covode.recordClassIndex(41110);
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d */
            final class d extends c.e {

                /* renamed from: b  reason: collision with root package name */
                private volatile Object f66788b;

                /* renamed from: c  reason: collision with root package name */
                private volatile javax.a.a<com.ss.android.ugc.aweme.favorites.a.f> f66789c;

                static {
                    Covode.recordClassIndex(41114);
                }

                @Override // dagger.hilt.android.internal.managers.g.c
                public final dagger.hilt.android.internal.a.f a() {
                    return new C1498b(this, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$a */
                final class a<T> implements javax.a.a<T> {

                    /* renamed from: b  reason: collision with root package name */
                    private final int f66791b = 0;

                    static {
                        Covode.recordClassIndex(41115);
                    }

                    @Override // javax.a.a
                    public final T get() {
                        if (this.f66791b == 0) {
                            d dVar = d.this;
                            androidx.fragment.app.i e2 = C1496b.this.e();
                            Activity activity = C1496b.this.f66769a;
                            C1496b.this.f();
                            C1496b.this.g();
                            return (T) new com.ss.android.ugc.aweme.favorites.a.f(e2, activity);
                        }
                        throw new AssertionError(this.f66791b);
                    }

                    a() {
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$b  reason: collision with other inner class name */
                final class C1498b implements i {

                    /* renamed from: b  reason: collision with root package name */
                    private View f66793b;

                    static {
                        Covode.recordClassIndex(41116);
                    }

                    @Override // dagger.hilt.android.internal.a.f
                    public final /* synthetic */ dagger.hilt.android.a.f a() {
                        if (this.f66793b != null) {
                            return new c(d.this, (byte) 0);
                        }
                        throw new IllegalStateException(View.class.getCanonicalName() + " must be set");
                    }

                    private C1498b() {
                    }

                    @Override // dagger.hilt.android.internal.a.f
                    public final /* bridge */ /* synthetic */ dagger.hilt.android.internal.a.f a(View view) {
                        this.f66793b = (View) dagger.a.f.a(view);
                        return this;
                    }

                    /* synthetic */ C1498b(d dVar, byte b2) {
                        this();
                    }
                }

                private com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b b() {
                    Object obj;
                    MethodCollector.i(3913);
                    Object obj2 = this.f66788b;
                    if (obj2 instanceof dagger.a.e) {
                        synchronized (obj2) {
                            try {
                                obj = this.f66788b;
                                if (obj instanceof dagger.a.e) {
                                    obj = com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b.d.a(com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b.c.a(), com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.b.b.a());
                                    this.f66788b = dagger.a.b.a(this.f66788b, obj);
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(3913);
                                throw th;
                            }
                        }
                        obj2 = obj;
                    }
                    com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b bVar = (com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b) obj2;
                    MethodCollector.o(3913);
                    return bVar;
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$c */
                final class c extends c.g {
                    static {
                        Covode.recordClassIndex(41117);
                    }

                    private c() {
                    }

                    /* synthetic */ c(d dVar, byte b2) {
                        this();
                    }
                }

                private d() {
                    this.f66788b = new dagger.a.e();
                }

                @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.e
                public final void a(com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.d dVar) {
                    dVar.f73834a = new PdpLogHelper();
                }

                @Override // com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.c
                public final void a(com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b bVar) {
                    bVar.f73877a = b();
                }

                @Override // com.ss.android.ugc.aweme.commercialize.preview.ui.a
                public final void a(AdsPreviewFragment adsPreviewFragment) {
                    adsPreviewFragment.f75047a = new AdsPreviewStateManager();
                }

                @Override // com.ss.android.ugc.aweme.favorites.ui.ab
                public final void a(y yVar) {
                    javax.a.a aVar = this.f66789c;
                    if (aVar == null) {
                        aVar = new a();
                        this.f66789c = aVar;
                    }
                    ac.a(yVar, dagger.a.b.b(aVar));
                    C1496b bVar = C1496b.this;
                    javax.a.a aVar2 = bVar.f66780l;
                    if (aVar2 == null) {
                        aVar2 = new e(20);
                        bVar.f66780l = aVar2;
                    }
                    ac.b(yVar, dagger.a.b.b(aVar2));
                }

                @Override // com.ss.android.ugc.aweme.profile.ui.cn
                public final void a(bm bmVar) {
                    InstagramPresenter instagramPresenter = new InstagramPresenter();
                    instagramPresenter.f116068b = C1496b.this.c();
                    instagramPresenter.f116069c = C1496b.this.a();
                    co.a(bmVar, instagramPresenter);
                    com.ss.android.ugc.aweme.profile.edit.h hVar = new com.ss.android.ugc.aweme.profile.edit.h();
                    l.a(hVar, C1496b.this.c());
                    l.a(hVar, C1496b.this.a());
                    co.a(bmVar, hVar);
                    co.a(bmVar, new com.ss.android.ugc.aweme.profile.edit.m(C1496b.this.a(), C1496b.this.c()));
                }

                @Override // com.ss.android.ugc.aweme.qrcode.h
                public final void a(QRCodeFragment qRCodeFragment) {
                    com.ss.android.ugc.aweme.qrcode.presenter.a.j jVar = new com.ss.android.ugc.aweme.qrcode.presenter.a.j();
                    k.a(jVar, C1496b.this.h());
                    k.a(jVar, C1496b.this.a());
                    com.ss.android.ugc.aweme.qrcode.i.a(qRCodeFragment, jVar);
                }

                /* synthetic */ d(C1496b bVar, byte b2) {
                    this();
                }
            }

            @Override // dagger.hilt.android.internal.managers.c.a
            public final dagger.hilt.android.internal.a.c j() {
                return new a(this, (byte) 0);
            }

            @Override // dagger.hilt.android.internal.managers.e.a
            public final dagger.hilt.android.internal.a.d k() {
                return new c(this, (byte) 0);
            }

            @Override // dagger.hilt.android.internal.managers.g.b
            public final dagger.hilt.android.internal.a.e l() {
                return new f(this, (byte) 0);
            }

            public final androidx.fragment.app.e a() {
                androidx.fragment.app.e eVar = this.n;
                if (eVar != null) {
                    return eVar;
                }
                androidx.fragment.app.e a2 = dagger.hilt.android.internal.c.b.a(this.f66769a);
                this.n = a2;
                return a2;
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$b  reason: collision with other inner class name */
            final class C1497b extends c.d {
                static {
                    Covode.recordClassIndex(41112);
                }

                @Override // dagger.hilt.android.internal.b.a.b
                public final Set<ad.b> a() {
                    return ai.of(androidx.f.a.e.a(dagger.hilt.android.internal.c.d.a(j.this.f66760a), C1496b.this.d()));
                }

                private C1497b() {
                }

                /* synthetic */ C1497b(C1496b bVar, byte b2) {
                    this();
                }
            }

            @Override // dagger.hilt.android.internal.b.a.AbstractC4137a
            public final Set<ad.b> i() {
                return ai.of(androidx.f.a.d.a(this.f66769a, dagger.hilt.android.internal.c.d.a(j.this.f66760a), d()));
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$a */
            final class a implements f {

                /* renamed from: b  reason: collision with root package name */
                private com.bytedance.assem.arch.core.a f66783b;

                static {
                    Covode.recordClassIndex(41111);
                }

                @Override // dagger.hilt.android.internal.a.c
                public final /* synthetic */ dagger.hilt.android.a.c a() {
                    if (this.f66783b != null) {
                        return new C1497b(C1496b.this, (byte) 0);
                    }
                    throw new IllegalStateException(com.bytedance.assem.arch.core.a.class.getCanonicalName() + " must be set");
                }

                private a() {
                }

                @Override // dagger.hilt.android.internal.a.c
                public final /* bridge */ /* synthetic */ dagger.hilt.android.internal.a.c a(com.bytedance.assem.arch.core.a aVar) {
                    this.f66783b = (com.bytedance.assem.arch.core.a) dagger.a.f.a(aVar);
                    return this;
                }

                /* synthetic */ a(C1496b bVar, byte b2) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$c */
            final class c implements g {

                /* renamed from: b  reason: collision with root package name */
                private Fragment f66786b;

                static {
                    Covode.recordClassIndex(41113);
                }

                @Override // dagger.hilt.android.internal.a.d
                public final /* synthetic */ dagger.hilt.android.a.d a() {
                    if (this.f66786b != null) {
                        return new d(C1496b.this, (byte) 0);
                    }
                    throw new IllegalStateException(Fragment.class.getCanonicalName() + " must be set");
                }

                private c() {
                }

                @Override // dagger.hilt.android.internal.a.d
                public final /* bridge */ /* synthetic */ dagger.hilt.android.internal.a.d a(Fragment fragment) {
                    this.f66786b = (Fragment) dagger.a.f.a(fragment);
                    return this;
                }

                /* synthetic */ c(C1496b bVar, byte b2) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$f */
            final class f implements h {

                /* renamed from: b  reason: collision with root package name */
                private View f66798b;

                static {
                    Covode.recordClassIndex(41119);
                }

                @Override // dagger.hilt.android.internal.a.e
                public final /* synthetic */ dagger.hilt.android.a.e a() {
                    if (this.f66798b != null) {
                        return new g(C1496b.this, (byte) 0);
                    }
                    throw new IllegalStateException(View.class.getCanonicalName() + " must be set");
                }

                private f() {
                }

                @Override // dagger.hilt.android.internal.a.e
                public final /* bridge */ /* synthetic */ dagger.hilt.android.internal.a.e a(View view) {
                    this.f66798b = (View) dagger.a.f.a(view);
                    return this;
                }

                /* synthetic */ f(C1496b bVar, byte b2) {
                    this();
                }
            }

            public final Fragment b() {
                Object obj;
                MethodCollector.i(6981);
                Object obj2 = this.o;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.o;
                            if (obj instanceof dagger.a.e) {
                                obj = com.ss.android.ugc.aweme.favorites.c.c.a(a());
                                this.o = dagger.a.b.a(this.o, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(6981);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                Fragment fragment = (Fragment) obj2;
                MethodCollector.o(6981);
                return fragment;
            }

            public final az c() {
                Object obj;
                MethodCollector.i(6994);
                Object obj2 = this.q;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.q;
                            if (obj instanceof dagger.a.e) {
                                obj = com.ss.android.ugc.aweme.profile.ui.a.b.a(a());
                                this.q = dagger.a.b.a(this.q, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(6994);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                az azVar = (az) obj2;
                MethodCollector.o(6994);
                return azVar;
            }

            public final androidx.fragment.app.i e() {
                Object obj;
                MethodCollector.i(7063);
                Object obj2 = this.C;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.C;
                            if (obj instanceof dagger.a.e) {
                                obj = com.ss.android.ugc.aweme.favorites.c.b.a(b());
                                this.C = dagger.a.b.a(this.C, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(7063);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                androidx.fragment.app.i iVar = (androidx.fragment.app.i) obj2;
                MethodCollector.o(7063);
                return iVar;
            }

            public final QRCodeFragment h() {
                Object obj;
                MethodCollector.i(7209);
                Object obj2 = this.F;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.F;
                            if (obj instanceof dagger.a.e) {
                                obj = com.ss.android.ugc.aweme.qrcode.a.b.a(a());
                                this.F = dagger.a.b.a(this.F, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(7209);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                QRCodeFragment qRCodeFragment = (QRCodeFragment) obj2;
                MethodCollector.o(7209);
                return qRCodeFragment;
            }

            public final String f() {
                Object obj;
                MethodCollector.i(7068);
                Object obj2 = this.D;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.D;
                            if (obj instanceof dagger.a.e) {
                                androidx.fragment.app.e a2 = a();
                                h.f.b.l.d(a2, "");
                                if (a2.getIntent() == null) {
                                    obj = "personal_homepage";
                                } else if (a2.getIntent().hasExtra("enter_from")) {
                                    obj = com.ss.android.ugc.aweme.favorites.c.a.a(a2.getIntent(), "enter_from");
                                } else {
                                    obj = "h5";
                                }
                                this.D = dagger.a.b.a(this.D, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(7068);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                String str = (String) obj2;
                MethodCollector.o(7068);
                return str;
            }

            public final Map<String, javax.a.a<androidx.f.a.b<? extends androidx.lifecycle.ac>>> d() {
                ab.a builderWithExpectedSize = ab.builderWithExpectedSize(10);
                javax.a.a aVar = this.s;
                if (aVar == null) {
                    aVar = new e(2);
                    this.s = aVar;
                }
                ab.a a2 = builderWithExpectedSize.a("com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel", aVar);
                javax.a.a aVar2 = this.t;
                if (aVar2 == null) {
                    aVar2 = new e(3);
                    this.t = aVar2;
                }
                ab.a a3 = a2.a("com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel", aVar2);
                javax.a.a aVar3 = this.u;
                if (aVar3 == null) {
                    aVar3 = new e(4);
                    this.u = aVar3;
                }
                ab.a a4 = a3.a("com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel", aVar3);
                javax.a.a aVar4 = this.v;
                if (aVar4 == null) {
                    aVar4 = new e(6);
                    this.v = aVar4;
                }
                ab.a a5 = a4.a("com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel", aVar4);
                javax.a.a aVar5 = this.w;
                if (aVar5 == null) {
                    aVar5 = new e(8);
                    this.w = aVar5;
                }
                ab.a a6 = a5.a("com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel", aVar5);
                javax.a.a aVar6 = this.x;
                if (aVar6 == null) {
                    aVar6 = new e(10);
                    this.x = aVar6;
                }
                ab.a a7 = a6.a("com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM", aVar6);
                javax.a.a aVar7 = this.y;
                if (aVar7 == null) {
                    aVar7 = new e(12);
                    this.y = aVar7;
                }
                ab.a a8 = a7.a("com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM", aVar7);
                javax.a.a aVar8 = this.z;
                if (aVar8 == null) {
                    aVar8 = new e(14);
                    this.z = aVar8;
                }
                ab.a a9 = a8.a("com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM", aVar8);
                javax.a.a aVar9 = this.A;
                if (aVar9 == null) {
                    aVar9 = new e(16);
                    this.A = aVar9;
                }
                ab.a a10 = a9.a("com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM", aVar9);
                javax.a.a aVar10 = this.B;
                if (aVar10 == null) {
                    aVar10 = new e(18);
                    this.B = aVar10;
                }
                return a10.a("com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel", aVar10).a();
            }

            public final ArrayList<String> g() {
                Object obj;
                String str;
                List<String> list;
                MethodCollector.i(7134);
                Object obj2 = this.E;
                if (obj2 instanceof dagger.a.e) {
                    synchronized (obj2) {
                        try {
                            obj = this.E;
                            if (obj instanceof dagger.a.e) {
                                androidx.fragment.app.e a2 = a();
                                h.f.b.l.d(a2, "");
                                obj = null;
                                if (a2.getIntent() != null) {
                                    if (a2.getIntent().hasExtra("tab_name")) {
                                        str = com.ss.android.ugc.aweme.favorites.c.a.a(a2.getIntent(), "tab_name");
                                    } else {
                                        str = null;
                                    }
                                    if (a2.getIntent().hasExtra("push_ids")) {
                                        String a3 = com.ss.android.ugc.aweme.favorites.c.a.a(a2.getIntent(), "push_ids");
                                        if (h.f.b.l.a((Object) "compilation", (Object) str)) {
                                            if (a3 != null) {
                                                list = h.m.p.b(a3, new String[]{","});
                                            } else {
                                                list = null;
                                            }
                                            if (list != null) {
                                                obj = new ArrayList(list);
                                            }
                                        }
                                    }
                                }
                                this.E = dagger.a.b.a(this.E, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(7134);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                ArrayList<String> arrayList = (ArrayList) obj2;
                MethodCollector.o(7134);
                return arrayList;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$e */
            public final class e<T> implements javax.a.a<T> {

                /* renamed from: b  reason: collision with root package name */
                private final int f66796b;

                static {
                    Covode.recordClassIndex(41118);
                }

                @Override // javax.a.a
                public final T get() {
                    switch (this.f66796b) {
                        case 0:
                            return (T) C1496b.this.b();
                        case 1:
                            return (T) C1496b.this.c();
                        case 2:
                            C1496b bVar = C1496b.this;
                            b bVar2 = b.this;
                            javax.a.a aVar = bVar2.f66762a;
                            if (aVar == null) {
                                aVar = new c(0);
                                bVar2.f66762a = aVar;
                            }
                            b bVar3 = b.this;
                            javax.a.a aVar2 = bVar3.f66763b;
                            if (aVar2 == null) {
                                aVar2 = new c(1);
                                bVar3.f66763b = aVar2;
                            }
                            b bVar4 = b.this;
                            javax.a.a aVar3 = bVar4.f66764c;
                            if (aVar3 == null) {
                                aVar3 = new c(2);
                                bVar4.f66764c = aVar3;
                            }
                            b bVar5 = b.this;
                            javax.a.a aVar4 = bVar5.f66765d;
                            if (aVar4 == null) {
                                aVar4 = new c(3);
                                bVar5.f66765d = aVar4;
                            }
                            return (T) com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.g.a(aVar, aVar2, aVar3, aVar4);
                        case 3:
                            return (T) new com.ss.android.ugc.aweme.music.assem.video.d();
                        case 4:
                            C1496b bVar6 = C1496b.this;
                            javax.a.a aVar5 = bVar6.f66772d;
                            if (aVar5 == null) {
                                aVar5 = new e(5);
                                bVar6.f66772d = aVar5;
                            }
                            return (T) v.a(aVar5);
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            return (T) new q();
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            C1496b bVar7 = C1496b.this;
                            javax.a.a aVar6 = bVar7.f66773e;
                            if (aVar6 == null) {
                                aVar6 = new e(7);
                                bVar7.f66773e = aVar6;
                            }
                            return (T) com.ss.android.ugc.aweme.relation.viewmodel.d.a(aVar6);
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            T t = (T) new com.ss.android.ugc.aweme.relation.api.d();
                            t.f120333a = com.ss.android.ugc.aweme.relation.api.b.a();
                            return t;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            C1496b bVar8 = C1496b.this;
                            javax.a.a aVar7 = bVar8.f66774f;
                            if (aVar7 == null) {
                                aVar7 = new e(9);
                                bVar8.f66774f = aVar7;
                            }
                            return (T) com.ss.android.ugc.aweme.music.search.u.a(aVar7);
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            return (T) new com.ss.android.ugc.aweme.music.search.q();
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            C1496b bVar9 = C1496b.this;
                            javax.a.a aVar8 = bVar9.f66775g;
                            if (aVar8 == null) {
                                aVar8 = new e(11);
                                bVar9.f66775g = aVar8;
                            }
                            return (T) com.ss.android.ugc.aweme.profile.widgets.follow.q.a(aVar8);
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            return (T) new n(com.ss.android.ugc.aweme.profile.widgets.follow.a.b.a());
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            C1496b bVar10 = C1496b.this;
                            javax.a.a aVar9 = bVar10.f66776h;
                            if (aVar9 == null) {
                                aVar9 = new e(13);
                                bVar10.f66776h = aVar9;
                            }
                            return (T) com.ss.android.ugc.aweme.profile.widgets.common.p.a(aVar9);
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            return (T) new com.ss.android.ugc.aweme.profile.widgets.common.m();
                        case ABRConfig.ABR_SELECT_SCENE:
                            C1496b bVar11 = C1496b.this;
                            javax.a.a aVar10 = bVar11.f66777i;
                            if (aVar10 == null) {
                                aVar10 = new e(15);
                                bVar11.f66777i = aVar10;
                            }
                            return (T) com.ss.android.ugc.aweme.recommend.users.profile.ui.j.a(aVar10);
                        case 15:
                            return (T) new com.ss.android.ugc.aweme.recommend.users.profile.a.b();
                        case 16:
                            C1496b bVar12 = C1496b.this;
                            javax.a.a aVar11 = bVar12.f66778j;
                            if (aVar11 == null) {
                                aVar11 = new e(17);
                                bVar12.f66778j = aVar11;
                            }
                            return (T) com.ss.android.ugc.aweme.profile.widgets.recommend.user.n.a(aVar11);
                        case 17:
                            return (T) new com.ss.android.ugc.aweme.profile.widgets.recommend.user.d();
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            C1496b bVar13 = C1496b.this;
                            javax.a.a aVar12 = bVar13.f66779k;
                            if (aVar12 == null) {
                                aVar12 = new e(19);
                                bVar13.f66779k = aVar12;
                            }
                            return (T) com.ss.android.ugc.aweme.comment.page.tag.viewmodel.i.a(aVar12);
                        case 19:
                            T t2 = (T) new com.ss.android.ugc.aweme.comment.page.tag.api.h();
                            t2.f72233a = com.ss.android.ugc.aweme.comment.page.tag.b.b.a();
                            return t2;
                        case com.ss.android.ugc.playerkit.model.v.U /*{ENCODED_INT: 20}*/:
                            return (T) C1496b.this.f();
                        default:
                            throw new AssertionError(this.f66796b);
                    }
                }

                e(int i2) {
                    this.f66796b = i2;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$g */
            final class g extends c.f {
                static {
                    Covode.recordClassIndex(41120);
                }

                private g() {
                }

                /* synthetic */ g(C1496b bVar, byte b2) {
                    this();
                }
            }

            @Override // com.ss.android.ugc.aweme.favorites.ui.w
            public final void a(UserFavoritesActivity userFavoritesActivity) {
                javax.a.a aVar = this.p;
                if (aVar == null) {
                    aVar = new e(0);
                    this.p = aVar;
                }
                x.a(userFavoritesActivity, dagger.a.b.b(aVar));
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.bi
            public final void a(ProfileEditActivity profileEditActivity) {
                javax.a.a aVar = this.r;
                if (aVar == null) {
                    aVar = new e(1);
                    this.r = aVar;
                }
                profileEditActivity.f116790a = dagger.a.b.b(aVar);
            }

            private C1496b(com.ss.android.ugc.aweme.relation.api.a aVar, com.ss.android.ugc.aweme.comment.page.tag.b.a aVar2, Activity activity) {
                this.o = new dagger.a.e();
                this.q = new dagger.a.e();
                this.C = new dagger.a.e();
                this.D = new dagger.a.e();
                this.E = new dagger.a.e();
                this.F = new dagger.a.e();
                this.f66769a = activity;
                this.f66770b = aVar;
                this.f66771c = aVar2;
            }

            /* synthetic */ C1496b(b bVar, com.ss.android.ugc.aweme.relation.api.a aVar, com.ss.android.ugc.aweme.comment.page.tag.b.a aVar2, Activity activity, byte b2) {
                this(aVar, aVar2, activity);
            }
        }

        @Override // dagger.hilt.android.internal.managers.a.AbstractC4138a
        public final dagger.hilt.android.internal.a.a a() {
            return new a(this, (byte) 0);
        }

        final class a implements d {

            /* renamed from: b  reason: collision with root package name */
            private Activity f66768b;

            static {
                Covode.recordClassIndex(41109);
            }

            @Override // dagger.hilt.android.internal.a.a
            public final /* synthetic */ dagger.hilt.android.a.a a() {
                if (this.f66768b != null) {
                    return new C1496b(b.this, new com.ss.android.ugc.aweme.relation.api.a(), new com.ss.android.ugc.aweme.comment.page.tag.b.a(), this.f66768b, (byte) 0);
                }
                throw new IllegalStateException(Activity.class.getCanonicalName() + " must be set");
            }

            private a() {
            }

            @Override // dagger.hilt.android.internal.a.a
            public final /* bridge */ /* synthetic */ dagger.hilt.android.internal.a.a a(Activity activity) {
                this.f66768b = (Activity) f.a(activity);
                return this;
            }

            /* synthetic */ a(b bVar, byte b2) {
                this();
            }
        }

        final class c<T> implements javax.a.a<T> {

            /* renamed from: b  reason: collision with root package name */
            private final int f66801b;

            static {
                Covode.recordClassIndex(41121);
            }

            @Override // javax.a.a
            public final T get() {
                int i2 = this.f66801b;
                if (i2 == 0) {
                    return (T) e.a(d.a(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.c.a()));
                }
                if (i2 == 1) {
                    return (T) com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.b.a();
                }
                if (i2 == 2) {
                    return (T) com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.e.a(new a.d());
                }
                if (i2 == 3) {
                    return (T) com.ss.android.ugc.aweme.im.sdk.common.controller.i.b.a();
                }
                throw new AssertionError(this.f66801b);
            }

            c(int i2) {
                this.f66801b = i2;
            }
        }

        private b() {
        }

        /* synthetic */ b(j jVar, byte b2) {
            this();
        }
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.a
    public final dagger.hilt.android.internal.a.b a() {
        return new a(this, (byte) 0);
    }

    final class a implements e {
        static {
            Covode.recordClassIndex(41107);
        }

        @Override // dagger.hilt.android.internal.a.b
        public final /* synthetic */ dagger.hilt.android.a.b a() {
            return new b(j.this, (byte) 0);
        }

        private a() {
        }

        /* synthetic */ a(j jVar, byte b2) {
            this();
        }
    }

    private j(dagger.hilt.android.internal.c.c cVar) {
        this.f66760a = cVar;
    }

    /* synthetic */ j(dagger.hilt.android.internal.c.c cVar, byte b2) {
        this(cVar);
    }
}
