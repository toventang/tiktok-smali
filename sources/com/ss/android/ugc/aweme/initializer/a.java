package com.ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.profile.api.c;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.in;
import f.a.ae;
import java.util.HashMap;
import java.util.Map;

public final class a implements z {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, IAccountService.b> f104724a = new HashMap();

    static {
        Covode.recordClassIndex(67133);
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final boolean a() {
        return in.e();
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final boolean b() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final String c() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final boolean g() {
        return b.g().isUidContactPermisioned();
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void i() {
        BaseUserService.createIUserServicebyMonsterPlugin(false).setIsOldUser(true);
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final String d() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return currentUser.getSecUid();
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final com.ss.android.ugc.aweme.account.model.a e() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return new n(currentUser);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final boolean f() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isCanSetGeoFencing()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final boolean h() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isPrivateAccount()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void b(z.b bVar) {
        IAccountService a2 = AccountService.a();
        IAccountService.b remove = this.f104724a.remove(Integer.valueOf(bVar.hashCode()));
        if (remove != null) {
            a2.b(remove);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void a(z.b bVar) {
        IAccountService a2 = AccountService.a();
        b bVar2 = new b(bVar);
        this.f104724a.put(Integer.valueOf(bVar.hashCode()), bVar2);
        a2.a(bVar2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final com.ss.android.ugc.aweme.account.model.a a(String str, String str2) {
        return new n(c.a(c.b(str2, str), false, null));
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void a(Fragment fragment, String str, String str2, final z.a aVar) {
        com.ss.android.ugc.aweme.login.c.a(fragment, str, str2, (Bundle) null, new f() {
            /* class com.ss.android.ugc.aweme.initializer.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67134);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                z.a aVar = aVar;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                z.a aVar = aVar;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void a(String str, String str2, int i2, final h.f.a.b<? super Integer, h.z> bVar) {
        UserService.d().a(str, str2, i2, -1, -1, "", -1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<FollowStatus>() {
            /* class com.ss.android.ugc.aweme.initializer.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(67136);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(FollowStatus followStatus) {
                bVar.invoke(Integer.valueOf(followStatus.followStatus));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.port.in.z
    public final void a(Activity activity, String str, String str2, Bundle bundle, final z.a aVar) {
        com.ss.android.ugc.aweme.login.c.a(activity, str, str2, bundle, new f() {
            /* class com.ss.android.ugc.aweme.initializer.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67135);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                z.a aVar = aVar;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                z.a aVar = aVar;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }
}
