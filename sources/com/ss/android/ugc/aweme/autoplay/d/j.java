package com.ss.android.ugc.aweme.autoplay.d;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.autoplay.player.video.e;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final SearchVideoView f67418a;

    /* renamed from: b  reason: collision with root package name */
    private b.a f67419b;

    /* renamed from: c  reason: collision with root package name */
    private final h f67420c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f67421d = i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f67422e = i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f67423f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.flowfeed.a.a f67424g;

    /* renamed from: i  reason: collision with root package name */
    private final g f67425i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.flowfeed.a.b f67426j;

    /* renamed from: k  reason: collision with root package name */
    private final View f67427k;

    static {
        Covode.recordClassIndex(41514);
    }

    public final e a() {
        return (e) this.f67420c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final com.ss.android.ugc.aweme.autoplay.player.video.c b() {
        return (com.ss.android.ugc.aweme.autoplay.player.video.c) this.f67422e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final n c() {
        return (n) this.f67421d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final b.a d() {
        return this.f67419b;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        a().e();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        a().f();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        a().g();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.autoplay.player.video.c> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.autoplay.player.video.c invoke() {
            SearchVideoView searchVideoView = this.this$0.f67418a;
            if (searchVideoView != null) {
                return searchVideoView.getDataProvider();
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        return a().h();
    }

    static final class b extends m implements h.f.a.a<n> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            SearchPlayerCore searchPlayerCore;
            SearchVideoView searchVideoView = this.this$0.f67418a;
            if (searchVideoView != null) {
                searchPlayerCore = searchVideoView.getCore();
            } else {
                searchPlayerCore = null;
            }
            return new n(searchPlayerCore, this.this$0.a(), (byte) 0);
        }
    }

    static final class c extends m implements h.f.a.a<e> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(41517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            SearchPlayerCore searchPlayerCore;
            SearchVideoView searchVideoView = this.this$0.f67418a;
            if (searchVideoView != null) {
                searchPlayerCore = searchVideoView.getCore();
            } else {
                searchPlayerCore = null;
            }
            return new e(searchPlayerCore, this.this$0.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        a().a(j2);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final void a(b.a aVar) {
        this.f67419b = aVar;
        com.ss.android.ugc.aweme.autoplay.player.video.c b2 = b();
        if (b2 != null) {
            b2.f67587m = this.f67419b;
        }
    }

    public j(SearchVideoView searchVideoView, ImageView imageView, com.ss.android.ugc.aweme.flowfeed.a.a aVar, g gVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar, View view) {
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        l.d(view, "");
        this.f67418a = searchVideoView;
        this.f67423f = imageView;
        this.f67424g = aVar;
        this.f67425i = gVar;
        this.f67426j = bVar;
        this.f67427k = view;
        if (searchVideoView != null) {
            SearchPlayerCore core = searchVideoView.getCore();
            if (core != null) {
                core.setFillHeight(false);
            }
            searchVideoView.setMScrollStateObserver(c());
            searchVideoView.hashCode();
            com.ss.android.ugc.aweme.flowfeed.utils.i mScrollStateObserver = searchVideoView.getMScrollStateObserver();
            if (mScrollStateObserver != null) {
                mScrollStateObserver.hashCode();
            }
            searchVideoView.setMScrollStateManager(gVar);
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider = searchVideoView.getDataProvider();
            if (dataProvider != null) {
                dataProvider.f67582h = this.f67426j;
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider2 = searchVideoView.getDataProvider();
            if (dataProvider2 != null) {
                dataProvider2.f67583i = aVar;
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider3 = searchVideoView.getDataProvider();
            if (dataProvider3 != null) {
                dataProvider3.f67575a = view;
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider4 = searchVideoView.getDataProvider();
            if (dataProvider4 != null) {
                dataProvider4.f67586l = a();
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider5 = searchVideoView.getDataProvider();
            if (dataProvider5 != null) {
                dataProvider5.f67587m = this.f67419b;
            }
            com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider6 = searchVideoView.getDataProvider();
            if (dataProvider6 != null) {
                dataProvider6.a("general_search");
            }
            searchVideoView.setMCoverView(imageView);
        }
    }
}
