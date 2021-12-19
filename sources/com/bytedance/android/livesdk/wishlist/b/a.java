package com.bytedance.android.livesdk.wishlist.b;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdk.wishlist.a.a;
import com.bytedance.android.livesdk.wishlist.view.WishContributorView;
import com.bytedance.android.livesdk.wishlist.view.WishGiftView;
import com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;

public final class a extends v implements a.c {

    /* renamed from: i  reason: collision with root package name */
    public static final b f22813i = new b((byte) 0);
    private HashMap A;

    /* renamed from: a  reason: collision with root package name */
    public Room f22814a;

    /* renamed from: b  reason: collision with root package name */
    public User f22815b;

    /* renamed from: c  reason: collision with root package name */
    public User f22816c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22817d;

    /* renamed from: e  reason: collision with root package name */
    public final h.h f22818e;

    /* renamed from: f  reason: collision with root package name */
    public final h.h f22819f;

    /* renamed from: g  reason: collision with root package name */
    public final h.h f22820g;

    /* renamed from: h  reason: collision with root package name */
    public final h.h f22821h;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f22822j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f22823k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f22824l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f22825m;
    private final h.h n;
    private final h.h t;
    private final h.h u;
    private final h.h v;
    private final h.h w;
    private final h.h x;
    private final h.h y;
    private final h.h z;

    /* renamed from: com.bytedance.android.livesdk.wishlist.b.a$a  reason: collision with other inner class name */
    public static final class C0496a {

        /* renamed from: a  reason: collision with root package name */
        public Room f22826a;

        /* renamed from: b  reason: collision with root package name */
        public User f22827b;

        /* renamed from: c  reason: collision with root package name */
        public User f22828c;

        static {
            Covode.recordClassIndex(13456);
        }
    }

    static {
        Covode.recordClassIndex(13455);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.A;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.A == null) {
            this.A = new HashMap();
        }
        View view = (View) this.A.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.A.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final View d() {
        return (View) this.f22822j.getValue();
    }

    public final WishListServerErrorView e() {
        return (WishListServerErrorView) this.f22823k.getValue();
    }

    public final LiveLoadingView f() {
        return (LiveLoadingView) this.f22824l.getValue();
    }

    public final LiveTextView g() {
        return (LiveTextView) this.f22825m.getValue();
    }

    public final WishGiftView h() {
        return (WishGiftView) this.n.getValue();
    }

    public final WishGiftView j() {
        return (WishGiftView) this.t.getValue();
    }

    public final WishGiftView k() {
        return (WishGiftView) this.u.getValue();
    }

    public final WishContributorView l() {
        return (WishContributorView) this.v.getValue();
    }

    public final WishContributorView m() {
        return (WishContributorView) this.w.getValue();
    }

    public final ImageView o() {
        return (ImageView) this.x.getValue();
    }

    public final ImageView p() {
        return (ImageView) this.y.getValue();
    }

    public final LiveTextView q() {
        return (LiveTextView) this.z.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(13457);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.c
    public final void c() {
        this.f22817d = false;
        r();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.livesdk.wishlist.a.class);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
        a();
    }

    static final class c extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.bto);
            }
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.evg);
            }
            return null;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.evh);
            }
            return null;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.evj);
            }
            return null;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.aic);
            }
            return null;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<LiveLoadingView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveLoadingView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fn3);
            }
            return null;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<WishListServerErrorView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishListServerErrorView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fn6);
            }
            return null;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<WishGiftView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fmz);
            }
            return null;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<WishGiftView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fn0);
            }
            return null;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<WishGiftView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishGiftView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fn1);
            }
            return null;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<WishContributorView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fmw);
            }
            return null;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<WishContributorView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fmx);
            }
            return null;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<WishContributorView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishContributorView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fmy);
            }
            return null;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.bm1);
            }
            return null;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.fmv);
            }
            return null;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.f_s);
            }
            return null;
        }
    }

    private final void r() {
        View d2 = d();
        if (d2 != null) {
            d2.setVisibility(8);
        }
        WishListServerErrorView e2 = e();
        if (e2 != null) {
            e2.setVisibility(8);
        }
        LiveLoadingView f2 = f();
        if (f2 != null) {
            f2.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8l);
        bVar.f22380g = 80;
        bVar.f22379f = 0.0f;
        bVar.f22381h = -1;
        bVar.f22382i = y.a(450.0f);
        return bVar;
    }

    private a() {
        this.f22822j = h.i.a((h.f.a.a) new g(this));
        this.f22823k = h.i.a((h.f.a.a) new i(this));
        this.f22824l = h.i.a((h.f.a.a) new h(this));
        this.f22818e = h.i.a((h.f.a.a) new c(this));
        this.f22825m = h.i.a((h.f.a.a) new e(this));
        this.f22819f = h.i.a((h.f.a.a) new d(this));
        this.f22820g = h.i.a((h.f.a.a) new f(this));
        this.n = h.i.a((h.f.a.a) new j(this));
        this.t = h.i.a((h.f.a.a) new k(this));
        this.u = h.i.a((h.f.a.a) new l(this));
        this.f22821h = h.i.a((h.f.a.a) new m(this));
        this.v = h.i.a((h.f.a.a) new n(this));
        this.w = h.i.a((h.f.a.a) new o(this));
        this.x = h.i.a((h.f.a.a) new q(this));
        this.y = h.i.a((h.f.a.a) new p(this));
        this.z = h.i.a((h.f.a.a) new r(this));
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    static final class s extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            if (this.this$0.f22817d) {
                a aVar = this.this$0;
                WishGiftView h2 = aVar.h();
                if (h2 != null) {
                    h2.a();
                }
                WishGiftView j2 = aVar.j();
                if (j2 != null) {
                    j2.a();
                }
                WishGiftView k2 = aVar.k();
                if (k2 != null) {
                    k2.a();
                }
            }
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.wishlist.c, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(13475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.wishlist.c cVar) {
            WishGiftView k2;
            com.bytedance.android.livesdk.wishlist.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            if (this.this$0.f22817d) {
                a aVar = this.this$0;
                long j2 = cVar2.f22829a;
                WishGiftView h2 = aVar.h();
                if (h2 == null || j2 != h2.getWishGiftId()) {
                    WishGiftView j3 = aVar.j();
                    if (j3 == null || j2 != j3.getWishGiftId()) {
                        WishGiftView k3 = aVar.k();
                        if (!(k3 == null || j2 != k3.getWishGiftId() || (k2 = aVar.k()) == null)) {
                            k2.a(cVar2.f22830b);
                        }
                    } else {
                        WishGiftView j4 = aVar.j();
                        if (j4 != null) {
                            j4.a(cVar2.f22830b);
                        }
                    }
                } else {
                    WishGiftView h3 = aVar.h();
                    if (h3 != null) {
                        h3.a(cVar2.f22830b);
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.p == null) {
            dismiss();
            return;
        }
        this.f22817d = false;
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((Object) this, com.bytedance.android.livesdk.d.class, (h.f.a.b) new s(this));
            dataChannel.a((Object) this, com.bytedance.android.livesdk.wishlist.b.class, (h.f.a.b) new t(this));
        }
        WishListServerErrorView e2 = e();
        if (e2 != null) {
            h.f.b.l.d(this, "");
            e2.getMRefreshLayout().setOnClickListener(new WishListServerErrorView.a(this));
        }
        r();
        b.a.a("livesdk_wishlist_show").a().a(com.bytedance.android.livesdk.wishlist.c.b.a(false)).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r2 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.wishlist.view.WishGiftView r7, com.bytedance.android.livesdk.gift.model.x.a r8) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlist.b.a.a(com.bytedance.android.livesdk.wishlist.view.WishGiftView, com.bytedance.android.livesdk.gift.model.x$a):void");
    }
}
