package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.b.l;
import h.h;
import java.util.Objects;
import org.json.JSONObject;

public final class SearchLaunchChatMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82711b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f82712c;

    /* renamed from: d  reason: collision with root package name */
    private final String f82713d = "searchLaunchChat";

    static {
        Covode.recordClassIndex(51517);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51518);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82713d;
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.c.e.a.c<? extends Context>> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(51520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.c.e.a.c<? extends Context> invoke() {
            return this.$contextProviderFactory.b(Context.class);
        }
    }

    static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchLaunchChatMethod f82714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82715b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82716c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f82717d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IMUser f82718e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f82719f;

        static {
            Covode.recordClassIndex(51519);
        }

        b(SearchLaunchChatMethod searchLaunchChatMethod, String str, String str2, Context context, IMUser iMUser, BaseBridgeMethod.a aVar) {
            this.f82714a = searchLaunchChatMethod;
            this.f82715b = str;
            this.f82716c = str2;
            this.f82717d = context;
            this.f82718e = iMUser;
            this.f82719f = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            Context context = this.f82717d;
            IMUser iMUser = this.f82718e;
            String str = this.f82715b;
            l.b(str, "");
            String str2 = this.f82716c;
            l.b(str2, "");
            if (SearchLaunchChatMethod.a(context, iMUser, str, str2)) {
                this.f82719f.a((Object) 1);
            } else {
                this.f82719f.a(0, "open chat fail");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchLaunchChatMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f82712c = h.i.a((h.f.a.a) new c(bVar));
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        com.bytedance.ies.bullet.c.e.a.c cVar = (com.bytedance.ies.bullet.c.e.a.c) this.f82712c.getValue();
        Context context = null;
        if (cVar != null) {
            context = (Context) cVar.b();
        }
        if (context == null) {
            aVar.a(0, "no params found");
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        String optString = jSONObject.optString("enter_from", "search");
        String optString2 = jSONObject.optString("enter_method", "button");
        iMUser.setFake(true);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            l.b(optString, "");
            l.b(optString2, "");
            if (a(context, iMUser, optString, optString2)) {
                aVar.a((Object) 1);
            } else {
                aVar.a(0, "open chat fail");
            }
        } else if (context instanceof Activity) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            com.ss.android.ugc.aweme.login.c.a((Activity) context, optString, optString2, new b(this, optString, optString2, context, iMUser, aVar));
        }
    }

    public static boolean a(Context context, IMUser iMUser, String str, String str2) {
        if (context == null) {
            return false;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        l.b(createIIMServicebyMonsterPlugin, "");
        if (!IMAdapterServiceImpl.d().a()) {
            return false;
        }
        createIIMServicebyMonsterPlugin.startChat(a.b.a(context, iMUser).c(str).b(str2).f103883a);
        return true;
    }
}
