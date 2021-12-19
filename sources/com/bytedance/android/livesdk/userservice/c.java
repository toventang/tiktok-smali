package com.bytedance.android.livesdk.userservice;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.at.k;
import com.bytedance.android.livesdk.chatroom.c.t;
import com.bytedance.android.livesdk.event.n;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.model.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.ae;
import f.a.h;
import java.util.HashMap;
import java.util.List;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public b f22058a;

    /* renamed from: b  reason: collision with root package name */
    IHostUser f22059b;

    /* renamed from: c  reason: collision with root package name */
    public final f.a.i.b<n> f22060c = new f.a.i.b<>();

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.c<b> f22061d = new f.a.l.c<>();

    /* renamed from: e  reason: collision with root package name */
    final f.a.l.c<a> f22062e = new f.a.l.c<>();

    /* renamed from: f  reason: collision with root package name */
    public f.a.l.c<b> f22063f;

    /* renamed from: g  reason: collision with root package name */
    private User f22064g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.android.live.core.a.a<Long, b> f22065h = new com.bytedance.android.live.core.a.c();

    /* renamed from: i  reason: collision with root package name */
    private UserApi f22066i;

    /* renamed from: j  reason: collision with root package name */
    private FollowApi f22067j;

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.host.c.a f22068k = new com.bytedance.android.livesdkapi.host.c.a() {
        /* class com.bytedance.android.livesdk.userservice.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(12999);
        }

        @Override // com.bytedance.android.livesdkapi.host.c.a
        public final void a(final b bVar) {
            if (c.this.f22063f != null) {
                c.this.f22058a = bVar;
                c.this.i().a_(new ae<b>() {
                    /* class com.bytedance.android.livesdk.userservice.c.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(13000);
                    }

                    @Override // f.a.ae
                    public final void onError(Throwable th) {
                    }

                    @Override // f.a.ae
                    public final void onSubscribe(f.a.b.b bVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.ae
                    public final /* synthetic */ void onSuccess(b bVar) {
                        b bVar2 = bVar;
                        if (c.this.f22063f != null) {
                            c.this.f22063f.onNext(bVar2);
                            c.this.f22063f.onComplete();
                            c.this.f22063f = null;
                        }
                        t tVar = new t();
                        tVar.f15148a = true;
                        tVar.f15149b = bVar;
                        com.bytedance.android.livesdk.an.a.a().a(tVar);
                        c.this.f22060c.onNext(new n(b.a.Login, bVar));
                        c.this.b(bVar2);
                    }
                });
            }
        }
    };

    static {
        Covode.recordClassIndex(12998);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final b a() {
        return this.f22058a;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final h<n> h() {
        return this.f22060c;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<a> k() {
        return this.f22062e;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final boolean a(com.bytedance.android.livesdk.at.h hVar) {
        return this.f22059b.interceptOperation(hVar.getFunc());
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final void a(a aVar) {
        b c2 = this.f22065h.c(Long.valueOf(aVar.f23019a));
        if (c2 != null) {
            c2.setFollowStatus(aVar.a());
        }
        this.f22062e.onNext(aVar);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final void a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j2) {
        if (context != null) {
            b.a aVar = new b.a(context);
            aVar.f18284a = str;
            aVar.b(R.string.gle, d.f22078a, false).a(R.string.gwr, (DialogInterface.OnClickListener) new e(str2, j2, str3, "", "", onClickListener), false);
            aVar.a().show();
        }
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final long c() {
        return this.f22058a.getId();
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final void f() {
        this.f22059b.markAsOutOfDate(true);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final List<e> g() {
        return this.f22059b.getAllFriends();
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final User b() {
        com.bytedance.android.live.base.model.user.b bVar = this.f22058a;
        if (bVar instanceof User) {
            return (User) bVar;
        }
        return this.f22064g;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final boolean e() {
        if (this.f22058a.getId() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<com.bytedance.android.live.base.model.user.b> j() {
        return this.f22061d.a(new t(this));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final boolean d() {
        IHostUser iHostUser = this.f22059b;
        if (iHostUser == null) {
            return false;
        }
        if (iHostUser.isMinorMode() || this.f22059b.isDeleteByAgeGate()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final ab<com.bytedance.android.live.base.model.user.b> i() {
        long curUserId = this.f22059b.getCurUserId();
        return this.f22066i.queryUser(curUserId, 2, a(curUserId)).b(f.a.h.a.b(f.a.k.a.f158006c)).c(q.f22106a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new r(this));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final void a(int i2) {
        this.f22059b.setRoomAttrsAdminFlag(i2);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<a> a(d dVar) {
        return a(1, dVar.f14132a, dVar.f14137e);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<com.bytedance.android.live.base.model.user.b> c(long j2) {
        return this.f22061d.a(new s(j2));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<a> d(long j2) {
        return this.f22062e.a(new f(j2));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<a> a(com.bytedance.android.livesdk.at.e eVar) {
        return a(1, eVar.f14132a, eVar.f14137e);
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final ab<User> a(HashMap<String, String> hashMap) {
        return this.f22066i.queryUser(hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).c(o.f22104a).b(new p(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final ab<User> b(long j2) {
        return this.f22066i.queryUser(j2, 2, a(j2)).b(f.a.h.a.b(f.a.k.a.f158006c)).c(m.f22102a).b(new n(this)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
    }

    public c(IHostUser iHostUser) {
        b bVar = new b();
        this.f22064g = bVar;
        this.f22058a = bVar;
        if (iHostUser != null) {
            this.f22059b = iHostUser;
            b(iHostUser.getCurUser());
            this.f22066i = (UserApi) com.bytedance.android.live.network.e.a().a(UserApi.class);
            this.f22067j = (FollowApi) com.bytedance.android.live.network.e.a().a(FollowApi.class);
            iHostUser.registerCurrentUserUpdateListener(new g(this, iHostUser));
            iHostUser.registerFollowStatusListener(new h(this));
            i().a_(new g());
        }
    }

    public final void b(com.bytedance.android.live.base.model.user.b bVar) {
        if (bVar != null) {
            this.f22058a = bVar;
            this.f22060c.onNext(new n(b.a.Update, bVar));
            this.f22065h.a(Long.valueOf(bVar.getId()), bVar);
            this.f22061d.onNext(bVar);
            return;
        }
        this.f22058a = new b();
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<a> a(k kVar) {
        return f.a.t.a(new i(this, kVar, kVar));
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final String a(long j2) {
        com.bytedance.android.live.base.model.user.b c2 = this.f22065h.c(Long.valueOf(j2));
        if (c2 != null) {
            return c2.getSecUid();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final void a(com.bytedance.android.live.base.model.user.b bVar) {
        if (bVar != null) {
            this.f22065h.a(Long.valueOf(bVar.getId()), bVar);
        }
    }

    @Override // com.bytedance.android.livesdk.at.f
    public final f.a.t<com.bytedance.android.live.base.model.user.b> a(Context context, j jVar) {
        if (context.getResources().getConfiguration().orientation == 2) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a("login"));
        }
        androidx.fragment.app.e a2 = p.a(context);
        if (a2 != null) {
            this.f22059b.login(a2, this.f22068k, jVar.f14152a, jVar.f14153b, jVar.f14154c, jVar.f14155d, jVar.f14156e, jVar.f14157f);
            f.a.l.c<com.bytedance.android.live.base.model.user.b> cVar = new f.a.l.c<>();
            this.f22063f = cVar;
            return cVar.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    public final f.a.t<a> a(int i2, long j2, long j3) {
        f.a.t<com.bytedance.android.live.network.response.d<a>> unfollow;
        if (i2 == 1) {
            unfollow = this.f22067j.follow(1, j2, j3, this.f22058a.getSecUid(), a(j2));
        } else {
            unfollow = this.f22067j.unfollow(i2, this.f22058a.getSecUid(), j2, a(j2), j3);
        }
        f.a.t<R> i3 = unfollow.a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new j(j2)).e().i();
        i3.a(new k(this, i2, j2, j3), new l(this, i2, j2, j3));
        return i3.e().i();
    }
}
