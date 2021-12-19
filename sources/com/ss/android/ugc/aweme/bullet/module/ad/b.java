package com.ss.android.ugc.aweme.bullet.module.ad;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.l.a.a.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout;
import com.ss.android.ugc.aweme.bullet.module.base.e;
import com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.common.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.ss.android.ugc.aweme.bullet.module.base.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69354c = new a((byte) 0);
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    public GradualChangeLinearLayout f69355a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f69356b;

    static {
        Covode.recordClassIndex(42759);
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final int e() {
        return R.layout.ck;
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.bullet.module.base.a
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(265, new g(b.class, "onEvent", GetWebViewInfo.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(266, new g(b.class, "onPopupShowEvent", k.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(210, new g(b.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42760);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void i() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.z.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void j() {
        super.j();
        GradualChangeLinearLayout gradualChangeLinearLayout = this.f69355a;
        if (gradualChangeLinearLayout != null) {
            gradualChangeLinearLayout.setGradualChangeMode(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.b$b  reason: collision with other inner class name */
    static final class C1566b extends m implements h.f.a.a<h.f.a.a<? extends z>> {
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.business.b $business;
        final /* synthetic */ com.ss.android.ugc.aweme.ad.b.c $it$inlined;
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $providerFactoryParam$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(42761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1566b(com.ss.android.ugc.aweme.bullet.business.b bVar, com.ss.android.ugc.aweme.ad.b.c cVar, b bVar2, com.bytedance.ies.bullet.c.e.a.b bVar3) {
            super(0);
            this.$business = bVar;
            this.$it$inlined = cVar;
            this.this$0 = bVar2;
            this.$providerFactoryParam$inlined = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.f.a.a<? extends z> invoke() {
            final AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.$business.a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                return new h.f.a.a<z>() {
                    /* class com.ss.android.ugc.aweme.bullet.module.ad.b.C1566b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(42762);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        String str;
                        String str2 = null;
                        if (adWebStatBusiness.a()) {
                            str = adWebStatBusiness.d();
                        } else {
                            str = null;
                        }
                        if (adWebStatBusiness.b()) {
                            str2 = adWebStatBusiness.e();
                        }
                        this.$it$inlined.c(str, str2);
                        adWebStatBusiness.a(this.$providerFactoryParam$inlined, this.$it$inlined.e());
                        return z.f158842a;
                    }
                };
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final boolean f() {
        String m2;
        boolean f2 = super.f();
        if (!(this.f69404k instanceof j)) {
            f2 = false;
        }
        e eVar = this.f69404k;
        if (eVar == null || (m2 = eVar.m()) == null || com.bytedance.x.c.c.a(m2)) {
            return false;
        }
        String lowerCase = m2.toLowerCase();
        l.b(lowerCase, "");
        if (!p.b(lowerCase, "http://", false)) {
            String lowerCase2 = m2.toLowerCase();
            l.b(lowerCase2, "");
            if (!p.b(lowerCase2, "https://", false)) {
                return false;
            }
        }
        return f2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void g() {
        super.g();
        j jVar = (j) this.f69404k;
        if (jVar != null) {
            JSONObject jSONObject = null;
            if (!com.bytedance.x.c.c.a(jVar.b())) {
                try {
                    jSONObject = new JSONObject(jVar.b());
                } catch (Exception unused) {
                }
            }
            Activity activity = this.r;
            String b2 = jVar.am.b();
            if (b2 == null) {
                b2 = "";
            }
            q.a(activity, "wap_stat", "wap_enter", b2, 0, 0, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final boolean h() {
        e eVar = this.f69404k;
        if (!(eVar instanceof j)) {
            eVar = null;
        }
        j jVar = (j) eVar;
        if (jVar != null) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                return a2.a(AwemeService.b().e(String.valueOf(jVar.Y.b())));
            }
        }
        return false;
    }

    public static final class c implements SSWebView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f69357a;

        static {
            Covode.recordClassIndex(42763);
        }

        c(b bVar) {
            this.f69357a = bVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.b
        public final void onScrollChanged(int i2, int i3, int i4, int i5) {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f69357a.f69355a;
            if (gradualChangeLinearLayout != null) {
                gradualChangeLinearLayout.onScrollChanged(i2, i3, i4, i5);
            }
        }
    }

    public static final class d extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f69358a;

        static {
            Covode.recordClassIndex(42764);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f69358a = bVar;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            OpenURLHintLayout openURLHintLayout;
            Resources resources;
            if (bitmap != null && (openURLHintLayout = this.f69358a.f69401h) != null) {
                Activity activity = this.f69358a.r;
                if (activity != null) {
                    resources = activity.getResources();
                } else {
                    resources = null;
                }
                openURLHintLayout.setBackground(new BitmapDrawable(resources, bitmap));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a, com.bytedance.ies.bullet.ui.common.b.c
    public final ViewGroup a(Context context) {
        l.d(context, "");
        ViewGroup a2 = super.a(context);
        this.f69355a = (GradualChangeLinearLayout) k().findViewById(R.id.cfg);
        return a2;
    }

    @r
    public final void onPopupShowEvent(k kVar) {
        l.d(kVar, "");
        Activity activity = this.r;
        if (activity != null) {
            boolean z = kVar.f69377a;
            if (z) {
                b(activity);
                this.B = z;
                return;
            }
            this.B = z;
            c(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void a(Activity activity) {
        l.d(activity, "");
        super.a(activity);
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.z.a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.c();
        }
        this.f69356b = null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void b(Activity activity) {
        l.d(activity, "");
        if (!this.B) {
            super.b(activity);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.z.a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.a(false);
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.z.a(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                adLynxStatBusiness.a(false);
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) this.z.a(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void c(Activity activity) {
        l.d(activity, "");
        if (!this.B) {
            super.c(activity);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.z.a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.c();
            }
            AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.z.a(AdLynxStatBusiness.class);
            if (adLynxStatBusiness != null) {
                adLynxStatBusiness.b();
            }
            PlayableBusiness playableBusiness = (PlayableBusiness) this.z.a(PlayableBusiness.class);
            if (playableBusiness != null) {
                playableBusiness.b();
            }
        }
    }

    @r
    public final void onEvent(GetWebViewInfo.a aVar) {
        SSWebView sSWebView;
        PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.a.a(this.z);
        if (a2 != null) {
            a2.a(aVar);
        } else if (aVar != null && aVar.f68880b != null && aVar.f68879a != 0 && (sSWebView = this.f69402i) != null && sSWebView.hashCode() == aVar.f68879a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 0);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            aVar.f68880b.a(jSONObject);
        }
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.crossplatform.b.a aVar) {
        String str;
        BulletCommonTitleBar bulletCommonTitleBar;
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
        Boolean bool = null;
        if (aVar != null && aVar.f78591a != null && m() && (str = aVar.f78591a) != null && str.hashCode() == 51 && str.equals("3") && l.a((Object) "1", (Object) this.w)) {
            a("3");
            e eVar = this.f69404k;
            if (!(eVar == null || (dVar = eVar.f32686b) == null)) {
                bool = dVar.b();
            }
            if (l.a((Object) bool, (Object) true)) {
                n();
                return;
            }
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f69355a;
            if (gradualChangeLinearLayout != null) {
                gradualChangeLinearLayout.setGradualChangeMode(false);
            }
            n.a(this.f69400g, 0);
            e eVar2 = this.f69404k;
            if (eVar2 != null && (bulletCommonTitleBar = this.f69398e) != null) {
                l.d(eVar2, "");
                t b2 = eVar2.f32688d.b();
                if (b2 == null || b2.f32728a != -2) {
                    t b3 = eVar2.f32688d.b();
                    if (b3 != null) {
                        bulletCommonTitleBar.setBackgroundColor(b3.f32728a);
                    }
                } else {
                    bulletCommonTitleBar.setBackgroundResource(R.drawable.u6);
                }
                t b4 = eVar2.f32692h.b();
                if (b4 == null || b4.f32728a != -2) {
                    t b5 = eVar2.f32692h.b();
                    if (b5 != null) {
                        ((TuxTextView) bulletCommonTitleBar.a(R.id.title)).setTextColor(b5.f32728a);
                    }
                    Context context = bulletCommonTitleBar.getContext();
                    if (context != null) {
                        i a2 = i.a(context.getResources(), R.drawable.a3r, context.getTheme());
                        t b6 = eVar2.f32692h.b();
                        if (!(b6 == null || a2 == null)) {
                            a2.setTint(b6.f32728a);
                        }
                        ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7s)).setImageDrawable(a2);
                    }
                } else {
                    ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7s)).setImageResource(2131231523);
                }
                View a3 = bulletCommonTitleBar.a(R.id.so);
                l.b(a3, "");
                a3.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.a(R.id.title);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7s)).setImageResource(2131231523);
                ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.a7m)).setImageResource(2131231525);
                ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.zo)).setImageResource(2131231533);
                ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.dll)).setImageResource(2131231530);
                ((AutoRTLImageView) bulletCommonTitleBar.a(R.id.dng)).setImageResource(2131231527);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        super(bVar, bVar2);
        l.d(bVar, "");
        l.d(bVar2, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.module.base.a, com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        String str;
        Activity activity;
        com.bytedance.ies.bullet.service.f.a.b.d<String> dVar;
        com.bytedance.ies.bullet.service.f.a.b.d<t> dVar2;
        t b2;
        int i2;
        GradualChangeLinearLayout gradualChangeLinearLayout;
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        super.a(view, uri, iVar);
        SSWebView sSWebView = this.f69402i;
        if (sSWebView != null) {
            sSWebView.setWebScrollListener(new c(this));
        }
        e eVar = this.f69404k;
        if (!(eVar == null || (dVar2 = eVar.D) == null || (b2 = dVar2.b()) == null || (i2 = b2.f32728a) == -2 || (gradualChangeLinearLayout = this.f69355a) == null)) {
            gradualChangeLinearLayout.setBackgroundColor(i2);
        }
        c cVar = (c) iVar.a(c.class);
        if (cVar == null || (dVar = cVar.ag) == null || (str = dVar.b()) == null) {
            str = "";
        }
        if (!com.bytedance.x.c.c.a(str) && (activity = this.r) != null) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                a2.c(activity);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        if (r0 == null) goto L_0x013d;
     */
    @Override // com.ss.android.ugc.aweme.bullet.module.base.a, com.bytedance.ies.bullet.ui.common.h.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.bullet.c.c.i r13, android.net.Uri r14, com.bytedance.ies.bullet.service.f.a.b.q r15) {
        /*
        // Method dump skipped, instructions count: 796
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.ad.b.a(com.bytedance.ies.bullet.c.c.i, android.net.Uri, com.bytedance.ies.bullet.service.f.a.b.q):void");
    }
}
