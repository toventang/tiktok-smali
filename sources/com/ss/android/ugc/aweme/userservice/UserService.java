package com.ss.android.ugc.aweme.userservice;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.a.a.c;
import com.bytedance.jedi.a.c.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.userservice.jedi.a;
import com.ss.android.ugc.aweme.userservice.jedi.a.f;
import com.ss.android.ugc.b;
import f.a.ab;
import f.a.e.e.e.o;
import f.a.l.d;
import f.a.t;
import f.a.x;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService {

    /* renamed from: a  reason: collision with root package name */
    public f f142437a = a.f142450b;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, d<p<com.ss.android.ugc.aweme.userservice.api.a, FollowStatus>>> f142438b = new HashMap();

    static {
        Covode.recordClassIndex(93162);
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final c<String, User> a() {
        return a.f142449a;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<FollowStatus> b() {
        return a.C1541a.f68149a.a("#FollowStatus");
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<BlockStatus> c() {
        return a.C1541a.f68149a.a("#BlockStatus");
    }

    public static IUserService d() {
        MethodCollector.i(8984);
        Object a2 = b.a(IUserService.class, false);
        if (a2 != null) {
            IUserService iUserService = (IUserService) a2;
            MethodCollector.o(8984);
            return iUserService;
        }
        if (b.ev == null) {
            synchronized (IUserService.class) {
                try {
                    if (b.ev == null) {
                        b.ev = new UserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8984);
                    throw th;
                }
            }
        }
        UserService userService = (UserService) b.ev;
        MethodCollector.o(8984);
        return userService;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final t<com.bytedance.jedi.a.c.f<User>> a(String str) {
        f fVar = this.f142437a;
        l.d(str, "");
        return com.bytedance.jedi.a.c.b.a(fVar.f142468e).a(str, new e[0]);
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final t<BaseResponse> a(String str, String str2) {
        f fVar = this.f142437a;
        l.d(str, "");
        l.d(str2, "");
        return fVar.f142466c.c(new com.ss.android.ugc.aweme.userservice.jedi.a.d(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus a(String str, int i2, String str2) {
        FollowStatus a2 = CommonFollowApi.a(str, str2, i2, -1, -1, "", -1, "", null);
        this.f142437a.f142467d.onNext(new p<>(new com.ss.android.ugc.aweme.userservice.api.a(str, str2, i2, -1, -1, "", -1, null, null, null), a2));
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final ab<FollowStatus> a(String str, String str2, int i2, int i3, int i4, String str3, int i5) {
        com.ss.android.ugc.aweme.userservice.api.a aVar;
        Integer num;
        f fVar = this.f142437a;
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.notice.repo.a.a a2 = com.ss.android.ugc.aweme.notice.repo.a.b.a(str);
        p pVar = null;
        if (a2 != null) {
            pVar = v.a(a2, 1);
        } else {
            com.ss.android.ugc.aweme.notice.repo.a.a b2 = com.ss.android.ugc.aweme.notice.repo.a.b.b(str);
            if (b2 != null) {
                pVar = v.a(b2, 0);
            }
            aVar = new com.ss.android.ugc.aweme.userservice.api.a(str, str2, i2, i3, i4, str3, i5);
            t c2 = fVar.f142465b.c(aVar);
            f.a aVar2 = new f.a(fVar, pVar, str, aVar);
            f.a.e.b.b.a((Object) aVar2, "onAfterNext is null");
            ab<FollowStatus> a3 = ab.a((x) f.a.h.a.a(new o(c2, aVar2)));
            l.b(a3, "");
            return a3;
        }
        if (!(pVar == null || (num = (Integer) pVar.getSecond()) == null || (num.intValue() != 1 && num.intValue() != 0))) {
            com.ss.android.ugc.aweme.notice.repo.a.a aVar3 = (com.ss.android.ugc.aweme.notice.repo.a.a) pVar.getFirst();
            aVar = new com.ss.android.ugc.aweme.userservice.api.a(str, str2, i2, i3, i4, str3, i5, aVar3.f112782b, aVar3.f112783c, (Integer) pVar.getSecond());
            t c22 = fVar.f142465b.c(aVar);
            f.a aVar22 = new f.a(fVar, pVar, str, aVar);
            f.a.e.b.b.a((Object) aVar22, "onAfterNext is null");
            ab<FollowStatus> a32 = ab.a((x) f.a.h.a.a(new o(c22, aVar22)));
            l.b(a32, "");
            return a32;
        }
        aVar = new com.ss.android.ugc.aweme.userservice.api.a(str, str2, i2, i3, i4, str3, i5);
        t c222 = fVar.f142465b.c(aVar);
        f.a aVar222 = new f.a(fVar, pVar, str, aVar);
        f.a.e.b.b.a((Object) aVar222, "onAfterNext is null");
        ab<FollowStatus> a322 = ab.a((x) f.a.h.a.a(new o(c222, aVar222)));
        l.b(a322, "");
        return a322;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus a(String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4, Map<String, String> map) {
        FollowStatus a2 = CommonFollowApi.a(str, str2, i2, i3, i4, str3, i5, str4, map);
        this.f142437a.f142467d.onNext(new p<>(new com.ss.android.ugc.aweme.userservice.api.a(str, str2, i2, i4, i3, str3, i5, null, null, null), a2));
        return a2;
    }
}
