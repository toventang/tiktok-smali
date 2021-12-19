package com.ss.android.ugc.aweme.share.improve.a;

import android.app.Application;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.ecommerce.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.router.SmartRouter;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class ah implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123613b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f123614a;

    /* renamed from: c  reason: collision with root package name */
    private final String f123615c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f123616d;

    static {
        Covode.recordClassIndex(81144);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.ezn;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "promote";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_fire;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.drawable.bi0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81145);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        if (this.f123614a.getHasPromoteEntry() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    public static final class b implements k<PromoteEntryCheck> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ah f123617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f123618b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f123619c;

        static {
            Covode.recordClassIndex(81146);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f123618b).a(R.string.de2).a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r9 != null) goto L_0x007f;
         */
        @Override // com.google.c.h.a.k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck r9) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.ah.b.onSuccess(java.lang.Object):void");
        }

        b(ah ahVar, Context context, String str) {
            this.f123617a = ahVar;
            this.f123618b = context;
            this.f123619c = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    static final class d implements com.bytedance.android.ecommerce.j.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123621a;

        static {
            Covode.recordClassIndex(81148);
        }

        d(Context context) {
            this.f123621a = context;
        }

        @Override // com.bytedance.android.ecommerce.j.k
        public final void a(String str) {
            l.b(str, "");
            if (!p.b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(this.f123621a, "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(this.f123621a, str).open();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        MethodCollector.i(9988);
        l.d(imageView, "");
        Integer num = this.f123616d;
        if (num != null) {
            imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), num.intValue()));
            MethodCollector.o(9988);
            return;
        }
        MethodCollector.o(9988);
    }

    static final class c implements com.bytedance.android.ecommerce.i.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123620a = new c();

        static {
            Covode.recordClassIndex(81147);
        }

        c() {
        }

        @Override // com.bytedance.android.ecommerce.i.b
        public final void a(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        if (!f()) {
            Application a2 = g.a();
            l.b(a2, "");
            Context applicationContext = a2.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(this.f123614a.getPromoteToast()).a();
        } else {
            a.C0095a aVar = new a.C0095a(g.a());
            aVar.f7053l = c.f123620a;
            aVar.q = new d(context);
            aVar.f7043b = "https://fp22-normal-useast1a.tiktokv.com";
            com.bytedance.android.ecommerce.e.a a3 = aVar.a();
            l.b(a3, "");
            com.bytedance.android.ecommerce.a.f6869a.a(a3);
            ShareDependService a4 = ShareDependService.a.a();
            String aid = this.f123614a.getAid();
            l.b(aid, "");
            com.google.c.h.a.l.a(a4.a(aid, "video"), new b(this, context, "video"), m.f68150a);
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        int accountType = curUser.getAccountType();
        int i2 = 0;
        if (curUser.getCommerceUserInfo() != null) {
            i2 = curUser.getCommerceUserInfo().getPromotePayType();
        }
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("group_id", this.f123614a.getAid()).a("user_account_type", accountType).a("promote_version", i2).a("video_status", f() ? 1 : 0);
        if (!f()) {
            dVar.a("unavailable_reason", this.f123614a.getPromoteToastKey());
        }
        r.a("Promote_video_entrance_click", dVar.f66730a);
    }

    public ah(Aweme aweme, String str, Integer num) {
        l.d(aweme, "");
        l.d(str, "");
        this.f123614a = aweme;
        this.f123615c = str;
        this.f123616d = num;
    }
}
