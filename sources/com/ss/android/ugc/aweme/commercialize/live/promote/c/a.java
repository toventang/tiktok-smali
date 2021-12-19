package com.ss.android.ugc.aweme.commercialize.live.promote.c;

import android.content.Context;
import com.bytedance.android.ecommerce.e.a;
import com.bytedance.android.ecommerce.j.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74697a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46060);
    }

    public static final String a() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    public static final int b() {
        User currentUser;
        CommerceUserInfo commerceUserInfo;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || (commerceUserInfo = currentUser.getCommerceUserInfo()) == null) {
            return 0;
        }
        return commerceUserInfo.promotePayType;
    }

    public static final int c() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null) {
            return 0;
        }
        return currentUser.getAccountType();
    }

    static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f74699a;

        static {
            Covode.recordClassIndex(46062);
        }

        b(Context context) {
            this.f74699a = context;
        }

        @Override // com.bytedance.android.ecommerce.j.k
        public final void a(String str) {
            l.b(str, "");
            if (!p.b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(this.f74699a, "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(this.f74699a, str).open();
            }
        }
    }

    public static final void a(Context context) {
        l.d(context, "");
        a.C0095a aVar = new a.C0095a(g.a());
        aVar.f7053l = C1699a.f74698a;
        aVar.q = new b(context);
        aVar.f7043b = "https://fp22-normal-useast1a.tiktokv.com";
        com.bytedance.android.ecommerce.e.a a2 = aVar.a();
        l.b(a2, "");
        com.bytedance.android.ecommerce.a.f6869a.a(a2);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.c.a$a  reason: collision with other inner class name */
    static final class C1699a implements com.bytedance.android.ecommerce.i.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1699a f74698a = new C1699a();

        static {
            Covode.recordClassIndex(46061);
        }

        C1699a() {
        }

        @Override // com.bytedance.android.ecommerce.i.b
        public final void a(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
        }
    }
}
