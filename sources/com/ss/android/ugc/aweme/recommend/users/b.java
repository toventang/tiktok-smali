package com.ss.android.ugc.aweme.recommend.users;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.g.a;
import com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.ss.android.ugc.aweme.profile.service.f;
import f.a.t;
import h.f.b.l;

public final class b implements IRecommendUsersService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f120122a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IRecommendUsersService f120123b;

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final a a() {
        return this.f120123b.a();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f120123b.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void a(String str, String str2) {
        l.d(str, "");
        this.f120123b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean b() {
        return this.f120123b.b();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean c() {
        return this.f120123b.c();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean d() {
        return this.f120123b.d();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean e() {
        return this.f120123b.e();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean f() {
        return this.f120123b.f();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean g() {
        return this.f120123b.g();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final t<RecommendUserInDMBean> h() {
        return this.f120123b.h();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final f i() {
        return this.f120123b.i();
    }

    static {
        Covode.recordClassIndex(78080);
    }

    private b() {
        IRecommendUsersService j2 = IRecommendUsersServiceImpl.j();
        l.b(j2, "");
        this.f120123b = j2;
    }
}
