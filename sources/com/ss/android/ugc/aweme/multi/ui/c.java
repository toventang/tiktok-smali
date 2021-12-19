package com.ss.android.ugc.aweme.multi.ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.google.c.a.s;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.multi.k;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c implements u<Map<String, String>> {

    /* renamed from: k  reason: collision with root package name */
    public static final b f111039k = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f111040a = this.f111050l;

    /* renamed from: b  reason: collision with root package name */
    public final int f111041b = n.a(4.0d);

    /* renamed from: c  reason: collision with root package name */
    public final int f111042c = n.a(12.0d);

    /* renamed from: d  reason: collision with root package name */
    public final int f111043d = n.a(16.0d);

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.multi.b f111044e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f111045f;

    /* renamed from: g  reason: collision with root package name */
    public final List<k> f111046g;

    /* renamed from: h  reason: collision with root package name */
    public final d f111047h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f111048i;

    /* renamed from: j  reason: collision with root package name */
    public final int f111049j;

    /* renamed from: l  reason: collision with root package name */
    private final int f111050l;

    /* renamed from: m  reason: collision with root package name */
    private final int f111051m = 1;
    private final h n = i.a((h.f.a.a) new C2843c(this));

    static {
        Covode.recordClassIndex(71266);
    }

    public final RecyclerView a() {
        return (RecyclerView) this.n.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(71274);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends RecyclerView.a<C2841a> implements org.greenrobot.eventbus.i, j {

        /* renamed from: a  reason: collision with root package name */
        Map<String, String> f111053a;

        /* renamed from: b  reason: collision with root package name */
        public int f111054b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f111055c = SystemClock.elapsedRealtime();

        /* renamed from: d  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.multi.b f111056d;

        /* renamed from: e  reason: collision with root package name */
        public final Context f111057e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f111058f;

        /* renamed from: g  reason: collision with root package name */
        public final List<k> f111059g;

        /* renamed from: h  reason: collision with root package name */
        public final HashMap<String, String> f111060h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f111061i;

        /* renamed from: j  reason: collision with root package name */
        public final int f111062j;

        static {
            Covode.recordClassIndex(71268);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemViewType(int i2) {
            return 0;
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(157, new g(a.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.b.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ C2841a onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f111059g.size();
        }

        public static final class e extends com.facebook.drawee.c.c<f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f111071a;

            static {
                Covode.recordClassIndex(71273);
            }

            e(d dVar) {
                this.f111071a = dVar;
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                this.f111071a.a(false);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                this.f111071a.a(true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$a  reason: collision with other inner class name */
        public static final class C2841a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public final View f111063a;

            /* renamed from: b  reason: collision with root package name */
            public int f111064b;

            static {
                Covode.recordClassIndex(71269);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C2841a(View view) {
                super(view);
                l.d(view, "");
                this.f111063a = view;
                this.f111064b = 0;
            }

            public /* synthetic */ C2841a(View view, byte b2) {
                this(view);
            }
        }

        static final class d extends m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ SquareImageView $icon;
            final /* synthetic */ int $pos;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(71272);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(a aVar, int i2, SquareImageView squareImageView) {
                super(1);
                this.this$0 = aVar;
                this.$pos = i2;
                this.$icon = squareImageView;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                a(bool.booleanValue());
                return z.f158842a;
            }

            public final void a(boolean z) {
                a aVar = this.this$0;
                aVar.a(String.valueOf(aVar.f111059g.get(this.$pos).f110914b.f110925b), Long.valueOf(SystemClock.elapsedRealtime() - this.this$0.f111055c), Boolean.valueOf(z), this.$pos);
                if (!z) {
                    this.$icon.setActualImageResource(2131232350);
                }
            }
        }

        @r
        public final void onEvent(com.ss.android.ugc.aweme.crossplatform.b.b bVar) {
            k kVar;
            String str = "";
            l.d(bVar, str);
            int i2 = this.f111054b;
            if (!(i2 == -1 || (kVar = this.f111059g.get(i2)) == null)) {
                String c2 = this.f111056d.c();
                Aweme b2 = this.f111056d.b();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a((HashMap<? extends String, ? extends String>) this.f111060h).a("enter_from", c2).a("anchor_entry", kVar.f110915c);
                String authorUid = b2.getAuthorUid();
                if (authorUid == null) {
                    authorUid = str;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", authorUid);
                String aid = b2.getAid();
                if (aid == null) {
                    aid = str;
                }
                com.ss.android.ugc.aweme.common.r.a("anchor_stay_time", a3.a("group_id", aid).a("duration", String.valueOf(bVar.f78592a)).a("music_id", ac.d(b2)).f66730a);
                ICommerceService a4 = com.ss.android.ugc.aweme.commerce.service.a.a();
                com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
                if (c2 == null) {
                    c2 = str;
                }
                aVar.f73497b = c2;
                String authorUid2 = b2.getAuthorUid();
                if (authorUid2 == null) {
                    authorUid2 = str;
                }
                aVar.f73499d = authorUid2;
                String aid2 = b2.getAid();
                if (aid2 == null) {
                    aid2 = str;
                }
                aVar.f73498c = aid2;
                String requestId = b2.getRequestId();
                if (requestId != null) {
                    str = requestId;
                }
                aVar.f73500e = str;
                aVar.q = "shopify";
                aVar.r = String.valueOf(bVar.f78592a);
                aVar.I = com.ss.android.ugc.aweme.base.b.a(this.f111056d.b());
                aVar.G = "video_multi_anchor";
                aVar.H = "video";
                a4.logCommerceEvents("product_stay_time", aVar);
            }
            EventBus.a().b(this);
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$c  reason: collision with other inner class name */
        static final class View$OnClickListenerC2842c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f111068a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f111069b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f111070c;

            static {
                Covode.recordClassIndex(71271);
            }

            View$OnClickListenerC2842c(a aVar, int i2, k kVar) {
                this.f111068a = aVar;
                this.f111069b = i2;
                this.f111070c = kVar;
            }

            public final void onClick(View view) {
                Integer num;
                ClickAgent.onClick(view);
                this.f111068a.f111054b = this.f111069b;
                ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
                com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
                aVar.C = "TEMAI";
                aVar.f73498c = this.f111068a.f111056d.b().getAid();
                int i2 = 1;
                if (this.f111068a.f111056d.b().isAd()) {
                    num = 1;
                } else {
                    num = 0;
                }
                aVar.E = num;
                aVar.f73499d = this.f111068a.f111056d.b().getAuthorUid();
                aVar.f73500e = this.f111068a.f111056d.b().getRequestId();
                String c2 = this.f111068a.f111056d.c();
                if (c2 == null) {
                    c2 = "";
                }
                aVar.f73497b = c2;
                aVar.v = "video_cart_tag";
                aVar.y = String.valueOf(this.f111068a.f111059g.get(this.f111069b).f110914b.f110932i);
                aVar.x = this.f111068a.f111059g.get(this.f111069b).f110914b.f110934k;
                aVar.w = this.f111068a.f111059g.get(this.f111069b).f110914b.f110935l;
                aVar.z = String.valueOf(this.f111068a.f111059g.get(this.f111069b).f110914b.f110925b);
                String authorUid = this.f111068a.f111056d.b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, "");
                if (!l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i2 = 0;
                }
                aVar.A = i2;
                aVar.B = "no";
                aVar.D = String.valueOf(this.f111069b + 1);
                aVar.I = com.ss.android.ugc.aweme.base.b.a(this.f111068a.f111056d.b());
                aVar.G = "video_multi_anchor";
                aVar.H = "video";
                a2.logCommerceEvents("tiktokec_product_click", aVar);
                if (this.f111068a.f111056d.b().isAd()) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("anchor_detail", "otherclick", this.f111068a.f111056d.b().getAwemeRawAd()).b("refer", "shop_anchor").b();
                }
                this.f111068a.a(this.f111070c);
            }
        }

        public final void a(k kVar) {
            String str = "";
            l.d(kVar, str);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(this.f111057e, kVar.f110920h, str);
            EventBus.a(EventBus.a(), this);
            Context context = this.f111057e;
            if (context instanceof androidx.lifecycle.m) {
                ((androidx.lifecycle.m) context).getLifecycle().a(new ShopWindowView$Adapter$whenShopLinkAnchorClicked$1());
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a((HashMap<? extends String, ? extends String>) this.f111060h).a("enter_from", this.f111056d.c()).a("anchor_entry", kVar.f110915c);
            String authorUid = this.f111056d.b().getAuthorUid();
            if (authorUid == null) {
                authorUid = str;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", authorUid);
            String aid = this.f111056d.b().getAid();
            if (aid == null) {
                aid = str;
            }
            com.ss.android.ugc.aweme.common.r.a("enter_multi_anchor_detail", a3.a("group_id", aid).a("music_id", ac.d(this.f111056d.b())).a("click_type", "webview").f66730a);
            com.ss.android.ugc.aweme.multi.b bVar = this.f111056d;
            ICommerceService a4 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
            String c2 = bVar.c();
            if (c2 != null) {
                str = c2;
            }
            aVar.f73497b = str;
            aVar.f73499d = bVar.b().getAuthorUid();
            aVar.f73498c = bVar.b().getAid();
            aVar.f73500e = bVar.b().getRequestId();
            aVar.q = "shopify";
            aVar.u = "video";
            aVar.v = "video_cart_tag";
            aVar.I = com.ss.android.ugc.aweme.base.b.a(this.f111056d.b());
            aVar.G = "video_multi_anchor";
            aVar.H = "video";
            a4.logCommerceEvents("enter_product_detail", aVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onViewAttachedToWindow(C2841a aVar) {
            int i2;
            int i3;
            C2841a aVar2 = aVar;
            l.d(aVar2, "");
            super.onViewAttachedToWindow(aVar2);
            String a2 = com.ss.android.ugc.aweme.multi.l.a(this.f111056d.b(), this.f111061i);
            if (a2 == null) {
                a2 = "video_multi_anchor";
            }
            ICommerceService a3 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar3 = new com.ss.android.ugc.aweme.commerce.service.a.a();
            aVar3.C = "TEMAI";
            aVar3.f73498c = this.f111056d.b().getAid();
            if (this.f111056d.b().isAd()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            aVar3.E = i2;
            aVar3.f73499d = this.f111056d.b().getAuthorUid();
            aVar3.f73500e = this.f111056d.b().getRequestId();
            String c2 = this.f111056d.c();
            if (c2 == null) {
                c2 = "";
            }
            aVar3.f73497b = c2;
            aVar3.v = "video_cart_tag";
            aVar3.y = String.valueOf(this.f111059g.get(aVar2.f111064b).f110914b.f110932i);
            aVar3.x = this.f111059g.get(aVar2.f111064b).f110914b.f110934k;
            aVar3.w = this.f111059g.get(aVar2.f111064b).f110914b.f110935l;
            aVar3.z = String.valueOf(this.f111059g.get(aVar2.f111064b).f110914b.f110925b);
            String authorUid = this.f111056d.b().getAuthorUid();
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            if (l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            aVar3.A = i3;
            aVar3.B = "no";
            aVar3.D = String.valueOf(aVar2.f111064b + 1);
            aVar3.I = com.ss.android.ugc.aweme.base.b.a(this.f111056d.b());
            aVar3.G = a2;
            aVar3.H = "video";
            aVar3.f73496a = com.ss.android.ugc.aweme.multi.l.a(this.f111056d.b(), "tiktokec_product_show", aVar3.f73497b);
            a3.logCommerceEvents("tiktokec_product_show", aVar3);
        }

        public static final class b extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f111065a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f111066b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f111067c;

            static {
                Covode.recordClassIndex(71270);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                int i2;
                int i3;
                Integer num;
                this.f111065a.f111054b = this.f111066b;
                String a2 = com.ss.android.ugc.aweme.multi.l.a(this.f111065a.f111056d.b(), this.f111065a.f111061i);
                if (a2 == null) {
                    a2 = "video_multi_anchor";
                }
                if (hl.a(this.f111067c.f110914b.f110933j)) {
                    Integer num2 = this.f111067c.f110917e;
                    int type = ab.ANCHOR_SHOP_WINDOW.getTYPE();
                    if (num2 != null && num2.intValue() == type && (num = this.f111067c.f110914b.f110932i) != null && num.intValue() == 100) {
                        com.ss.android.ugc.aweme.multi.l.a(this.f111065a.f111056d.e(), this.f111067c, this.f111065a.f111056d.b(), this.f111065a.f111056d.c(), a2, this.f111065a.f111061i);
                    } else {
                        SmartRouter.buildRoute(this.f111065a.f111056d.e(), com.ss.android.ugc.aweme.multi.l.a(this.f111067c, this.f111065a.f111056d.b(), this.f111065a.f111056d.c(), a2, this.f111065a.f111061i)).open();
                    }
                } else {
                    a aVar = this.f111065a;
                    k kVar = this.f111067c;
                    String str = null;
                    Integer num3 = kVar.f110917e;
                    int type2 = ab.ANCHOR_SHOP_WINDOW.getTYPE();
                    if (num3 != null && num3.intValue() == type2) {
                        str = kVar.f110914b.f110936m;
                        String str2 = kVar.f110914b.f110936m;
                        if (str2 == null) {
                            str2 = "";
                        }
                        l.d(kVar, "");
                        l.d(str2, "");
                        MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(aVar.f111057e, str2, "");
                        EventBus.a(EventBus.a(), aVar);
                        if (aVar.f111057e instanceof androidx.lifecycle.m) {
                            ((androidx.lifecycle.m) aVar.f111057e).getLifecycle().a(new ShopWindowView$Adapter$whenShopWindowAnchorClicked$1());
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a((HashMap<? extends String, ? extends String>) aVar.f111060h).a("enter_from", aVar.f111056d.c()).a("anchor_entry", kVar.f110915c);
                        String authorUid = aVar.f111056d.b().getAuthorUid();
                        if (authorUid == null) {
                            authorUid = "";
                        }
                        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", authorUid);
                        String aid = aVar.f111056d.b().getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        com.ss.android.ugc.aweme.common.r.a("enter_multi_anchor_detail", a4.a("group_id", aid).a("music_id", ac.d(aVar.f111056d.b())).a("click_type", "webview").f66730a);
                        com.ss.android.ugc.aweme.multi.b bVar = aVar.f111056d;
                        ICommerceService a5 = com.ss.android.ugc.aweme.commerce.service.a.a();
                        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = new com.ss.android.ugc.aweme.commerce.service.a.a();
                        String c2 = bVar.c();
                        if (c2 == null) {
                            c2 = "";
                        }
                        aVar2.f73497b = c2;
                        aVar2.f73499d = bVar.b().getAuthorUid();
                        aVar2.f73498c = bVar.b().getAid();
                        aVar2.f73500e = bVar.b().getRequestId();
                        aVar2.q = "shopify";
                        aVar2.u = "video";
                        aVar2.v = "video_cart_tag";
                        aVar2.I = com.ss.android.ugc.aweme.base.b.a(aVar.f111056d.b());
                        aVar2.G = "video_multi_anchor";
                        aVar2.H = "video";
                        a5.logCommerceEvents("enter_product_detail", aVar2);
                    } else {
                        Integer num4 = kVar.f110917e;
                        int type3 = ab.ANCHOR_SHOP_LINK.getTYPE();
                        if (num4 != null && num4.intValue() == type3) {
                            str = kVar.f110920h;
                            aVar.a(kVar);
                        }
                    }
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).showThirdpartyDisclaimerTips(aVar.f111056d.e(), str);
                }
                ICommerceService a6 = com.ss.android.ugc.aweme.commerce.service.a.a();
                com.ss.android.ugc.aweme.commerce.service.a.a aVar3 = new com.ss.android.ugc.aweme.commerce.service.a.a();
                aVar3.C = "TEMAI";
                aVar3.f73498c = this.f111065a.f111056d.b().getAid();
                if (this.f111065a.f111056d.b().isAd()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar3.E = i2;
                aVar3.f73499d = this.f111065a.f111056d.b().getAuthorUid();
                aVar3.f73500e = this.f111065a.f111056d.b().getRequestId();
                String c3 = this.f111065a.f111056d.c();
                if (c3 == null) {
                    c3 = "";
                }
                aVar3.f73497b = c3;
                aVar3.v = "video_cart_tag";
                aVar3.y = String.valueOf(this.f111065a.f111059g.get(this.f111066b).f110914b.f110932i);
                aVar3.x = this.f111065a.f111059g.get(this.f111066b).f110914b.f110934k;
                aVar3.w = this.f111065a.f111059g.get(this.f111066b).f110914b.f110935l;
                aVar3.z = String.valueOf(this.f111065a.f111059g.get(this.f111066b).f110914b.f110925b);
                String authorUid2 = this.f111065a.f111056d.b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, "");
                if (l.a((Object) authorUid2, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                aVar3.A = i3;
                aVar3.B = "no";
                aVar3.D = String.valueOf(this.f111066b + 1);
                aVar3.I = com.ss.android.ugc.aweme.base.b.a(this.f111065a.f111056d.b());
                aVar3.G = a2;
                aVar3.H = "video";
                aVar3.f73496a = com.ss.android.ugc.aweme.multi.l.a(this.f111065a.f111056d.b(), "tiktokec_product_click", aVar3.f73497b);
                a6.logCommerceEvents("tiktokec_product_click", aVar3);
                if (this.f111065a.f111056d.b().isAd()) {
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("anchor_detail", "otherclick", this.f111065a.f111056d.b().getAwemeRawAd()).b("refer", "shop_anchor").b();
                }
            }

            b(a aVar, int i2, k kVar) {
                this.f111065a = aVar;
                this.f111066b = i2;
                this.f111067c = kVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(C2841a aVar, int i2) {
            String str;
            String str2;
            C2841a aVar2 = aVar;
            l.d(aVar2, "");
            if (this.f111058f) {
                View view = aVar2.f111063a;
                k kVar = this.f111059g.get(i2);
                TextView textView = (TextView) view.findViewById(R.id.title);
                SquareImageView squareImageView = (SquareImageView) view.findViewById(R.id.bi7);
                TextView textView2 = (TextView) view.findViewById(R.id.d99);
                Integer num = kVar.f110917e;
                int type = ab.ANCHOR_SHOP_WINDOW.getTYPE();
                if (num != null && num.intValue() == type) {
                    try {
                        d dVar = new d(this, i2, squareImageView);
                        if (hl.a(kVar.f110914b.f110927d)) {
                            l.b(textView, "");
                            textView.setText(kVar.f110914b.f110927d);
                        } else {
                            l.b(textView, "");
                            textView.setText(kVar.f110914b.f110926c);
                        }
                        if (hl.a(kVar.f110914b.f110931h)) {
                            str = kVar.f110914b.f110931h;
                        } else if (hl.a(kVar.f110914b.f110930g)) {
                            str = kVar.f110914b.f110930g;
                        } else {
                            str = null;
                        }
                        if (str == null || str.length() == 0) {
                            dVar.a(false);
                        } else {
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUrlList(h.a.n.c(str));
                            com.ss.android.ugc.aweme.base.e.a(squareImageView, urlModel, new e(dVar));
                        }
                        int i3 = this.f111062j;
                        if (i3 == 1) {
                            str2 = kVar.f110914b.f110929f;
                        } else if (i3 == 2) {
                            Map<String, String> map = this.f111053a;
                            if (map != null) {
                                str2 = map.get(String.valueOf(this.f111059g.get(i2).f110914b.f110925b));
                            }
                        }
                        if (str2 != null) {
                            l.b(textView2, "");
                            textView2.setText(str2);
                        }
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.common.r.a("rd_tiktokec_shop_anchor_exception", new com.ss.android.ugc.aweme.app.f.d().a("e_stack_trace", s.b(e2)).a("extra_data", "anchor.extra : " + kVar.f110914b).a("where", "ShopWindowView").f66730a);
                    }
                }
                Integer num2 = kVar.f110917e;
                int type2 = ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 != null && num2.intValue() == type2) {
                    l.b(textView, "");
                    textView.setText(kVar.f110915c);
                    squareImageView.setActualImageResource(2131232350);
                    l.b(textView2, "");
                    textView2.setVisibility(4);
                }
                view.setOnClickListener(new b(this, i2, kVar));
                aVar2.f111064b = i2;
                return;
            }
            View view2 = aVar2.f111063a;
            k kVar2 = this.f111059g.get(i2);
            view2.setOnClickListener(new View$OnClickListenerC2842c(this, i2, kVar2));
            View findViewById = view2.findViewById(R.id.title);
            l.b(findViewById, "");
            ((TextView) findViewById).setText(kVar2.f110915c);
            ((SimpleDraweeView) view2.findViewById(R.id.bi7)).setActualImageResource(2131232351);
            aVar2.f111064b = i2;
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            C2841a aVar2;
            boolean a2;
            MethodCollector.i(6301);
            l.d(viewGroup, "");
            if (aVar.f111058f) {
                View a3 = com.a.a(LayoutInflater.from(aVar.f111057e), R.layout.a_x, viewGroup, false);
                l.b(a3, "");
                aVar2 = new C2841a(a3, (byte) 0);
            } else {
                View a4 = com.a.a(LayoutInflater.from(aVar.f111057e), R.layout.a_y, viewGroup, false);
                l.b(a4, "");
                aVar2 = new C2841a(a4, (byte) 0);
            }
            try {
                if (aVar2.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar2.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = aVar2.getClass().getName();
            MethodCollector.o(6301);
            return aVar2;
        }

        public final void a(String str, Long l2, Boolean bool, int i2) {
            ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
            aVar.C = "TEMAI";
            aVar.f73497b = this.f111056d.c();
            aVar.f73499d = this.f111056d.b().getAuthorUid();
            aVar.z = str;
            int i3 = 1;
            aVar.D = String.valueOf(i2 + 1);
            aVar.f73498c = this.f111056d.b().getAid();
            if (!l.a((Object) bool, (Object) true)) {
                i3 = 0;
            }
            aVar.V = Integer.valueOf(i3);
            aVar.W = String.valueOf(l2);
            a2.logCommerceEvents("rd_tiktokec_video_shopping_list_render", aVar);
        }

        public a(com.ss.android.ugc.aweme.multi.b bVar, Context context, boolean z, List<k> list, HashMap<String, String> hashMap, boolean z2, int i2) {
            l.d(bVar, "");
            l.d(context, "");
            l.d(list, "");
            l.d(hashMap, "");
            this.f111056d = bVar;
            this.f111057e = context;
            this.f111058f = z;
            this.f111059g = list;
            this.f111060h = hashMap;
            this.f111061i = z2;
            this.f111062j = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$c  reason: collision with other inner class name */
    static final class C2843c extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2843c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return new RecyclerView(this.this$0.f111045f);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Map<String, String> map) {
        int i2;
        Map<String, String> map2 = map;
        l.d(map2, "");
        RecyclerView.a adapter = a().getAdapter();
        if (!(adapter instanceof a)) {
            adapter = null;
        }
        a aVar = (a) adapter;
        if (aVar != null) {
            aVar.f111053a = map2;
            aVar.notifyDataSetChanged();
        }
        if (map2 == null || map2.isEmpty()) {
            i2 = this.f111050l;
        } else {
            i2 = this.f111051m;
        }
        this.f111040a = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006c, code lost:
        if (r3 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006f, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.ss.android.ugc.aweme.multi.b r11, android.content.Context r12, java.util.List<com.ss.android.ugc.aweme.multi.k> r13, com.ss.android.ugc.aweme.app.f.d r14, boolean r15, int r16) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.ui.c.<init>(com.ss.android.ugc.aweme.multi.b, android.content.Context, java.util.List, com.ss.android.ugc.aweme.app.f.d, boolean, int):void");
    }
}
