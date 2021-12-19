package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class b implements com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b f34704a;

    /* renamed from: b  reason: collision with root package name */
    public AwemeRawAd f34705b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f34706c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f34707d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f34708e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c f34709f;

    /* renamed from: g  reason: collision with root package name */
    private AwemeSearchAdModel f34710g;

    /* renamed from: h  reason: collision with root package name */
    private final h f34711h = i.a((h.f.a.a) d.f34719a);

    /* renamed from: i  reason: collision with root package name */
    private Context f34712i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f34713j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f34714k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f34715l;

    static {
        Covode.recordClassIndex(20809);
    }

    public final ISearchAdService i() {
        return (ISearchAdService) this.f34711h.getValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final boolean h() {
        return this.f34715l;
    }

    static final class d extends m implements h.f.a.a<ISearchAdService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34719a = new d();

        static {
            Covode.recordClassIndex(20813);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchAdService invoke() {
            return SearchAdServiceImpl.a();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void d() {
        i().d(this.f34706c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void g() {
        i().f(this.f34706c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void a() {
        String str;
        a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "othershow", this.f34705b);
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34704a;
        if (bVar != null) {
            str = bVar.b();
        } else {
            str = null;
        }
        a2.a("enter_from", str).b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final boolean b() {
        Boolean bool;
        AwemeSearchAdModel awemeSearchAdModel = this.f34710g;
        if (awemeSearchAdModel != null) {
            bool = awemeSearchAdModel.isAutoPlayEnable();
        } else {
            bool = null;
        }
        return !l.a((Object) bool, (Object) true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void c() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "othershow", this.f34705b).b("refer", "button").b();
        i().a(this.f34706c);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void f() {
        this.f34715l = false;
        i().b(this.f34706c);
        i().e(this.f34713j);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void e() {
        i().a(this.f34705b, this.f34713j, new View$OnClickListenerC0783b(this), new c(this));
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34704a;
        if (bVar != null) {
            bVar.h();
        }
        this.f34714k = true;
        this.f34715l = true;
        i().c(this.f34706c);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34716a;

        static {
            Covode.recordClassIndex(20810);
        }

        a(b bVar) {
            this.f34716a = bVar;
        }

        public final void onClick(View view) {
            this.f34716a.f34708e = true;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34716a.f34704a;
            if (bVar != null) {
                bVar.e();
            }
            this.f34716a.f34708e = false;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.c.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0783b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34717a;

        static {
            Covode.recordClassIndex(20811);
        }

        View$OnClickListenerC0783b(b bVar) {
            this.f34717a = bVar;
        }

        public final void onClick(View view) {
            this.f34717a.f34708e = true;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34717a.f34704a;
            if (bVar != null) {
                bVar.f();
            }
            this.f34717a.f34708e = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a
    public final void a(String str) {
        String str2;
        if (!this.f34708e) {
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "otherclick", this.f34705b);
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34704a;
            if (bVar != null) {
                str2 = bVar.b();
            } else {
                str2 = null;
            }
            a2.a("enter_from", str2).b("refer", str).b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34718a;

        static {
            Covode.recordClassIndex(20812);
        }

        c(b bVar) {
            this.f34718a = bVar;
        }

        public final void onClick(View view) {
            this.f34718a.f34707d = true;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar = this.f34718a.f34704a;
            if (bVar != null) {
                bVar.g();
            }
            this.f34718a.f34707d = false;
            this.f34718a.f();
            ISearchAdService i2 = this.f34718a.i();
            if (i2 != null) {
                i2.a(this.f34718a.f34706c);
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "replay", this.f34718a.f34705b).b("refer", "background").b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.a
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.c cVar) {
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b bVar;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel awemeSearchAdModel;
        Context context;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        l.d(cVar, "");
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c cVar2 = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c) cVar;
        this.f34709f = cVar2;
        ViewGroup viewGroup3 = null;
        if (cVar2 != null) {
            bVar = cVar2.f34651b;
        } else {
            bVar = null;
        }
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.ISearchAdVideoSceneCallBack");
        this.f34704a = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b) bVar;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.c cVar3 = this.f34709f;
        if (cVar3 != null) {
            awemeRawAd = cVar3.f34654a;
        } else {
            awemeRawAd = null;
        }
        this.f34705b = awemeRawAd;
        if (awemeRawAd != null) {
            awemeSearchAdModel = awemeRawAd.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.f34710g = awemeSearchAdModel;
        com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar2 = this.f34704a;
        if (bVar2 != null) {
            context = bVar2.c();
        } else {
            context = null;
        }
        this.f34712i = context;
        ISearchAdService i2 = i();
        if (i2 != null) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar3 = this.f34704a;
            if (bVar3 != null) {
                viewGroup2 = bVar3.a();
            } else {
                viewGroup2 = null;
            }
            viewGroup = i2.a(viewGroup2, this.f34712i, this.f34705b, new a(this));
        } else {
            viewGroup = null;
        }
        this.f34706c = viewGroup;
        ISearchAdService i3 = i();
        if (i3 != null) {
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.b bVar4 = this.f34704a;
            if (bVar4 != null) {
                viewGroup3 = bVar4.d();
            }
            viewGroup3 = i3.a(viewGroup3, this.f34712i, this.f34705b);
        }
        this.f34713j = viewGroup3;
    }
}
