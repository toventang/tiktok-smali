package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.bytedance.android.b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p.h;
import com.bytedance.android.livesdk.utils.al;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.live.api.ILivePermissionApi;
import com.ss.android.ugc.aweme.live.n;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.d.a.c;
import f.a.h.a;

public final class e implements n {

    /* renamed from: a  reason: collision with root package name */
    public static e f137976a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f137977b = false;

    /* renamed from: c  reason: collision with root package name */
    static boolean f137978c = false;

    static {
        Covode.recordClassIndex(90244);
    }

    private e() {
        if (a.f157962a == null) {
            a.a(f.f137979a);
        }
        IAccountService a2 = AccountService.a();
        if (a2 != null) {
            a2.a(g.f137980a);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void b() {
        if (!al.f22240a) {
            b.a();
            ((h) com.bytedance.android.live.t.a.a(h.class)).releaseToolbarView();
            al.f22240a = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final boolean a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || !createIUserServicebyMonsterPlugin.isLogin() || !f137977b) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void a(boolean z) {
        f137977b = z;
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void a(Context context) {
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).onLiveTabShow(context);
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void b(boolean z) {
        c.a(new a(z));
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void a(cg cgVar) {
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).setApplyLivePermission(new com.bytedance.android.livesdkapi.l.a(cgVar.f69843c, cgVar.f69842b, cgVar.f69841a));
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void a(com.bytedance.android.livesdkapi.l.c cVar) {
        ((ILivePermissionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://webcast.tiktokv.com").create(ILivePermissionApi.class)).getLivePodCast().b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(cVar), new i(cVar));
    }

    @Override // com.ss.android.ugc.aweme.live.n
    public final void a(ch chVar) {
        f137978c = chVar.f69864d;
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).setDetailLivePermission(new com.bytedance.android.livesdkapi.l.b(chVar.f69864d, chVar.f69861a, chVar.f69863c, chVar.f69862b, chVar.f69865e));
    }
}
