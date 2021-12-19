package com.ss.android.ugc.aweme.follow.widet;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.common.l;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import h.z;

public class a implements u<FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public androidx.fragment.app.e f96284a;

    /* renamed from: b  reason: collision with root package name */
    f f96285b;

    /* renamed from: c  reason: collision with root package name */
    public b f96286c;

    /* renamed from: d  reason: collision with root package name */
    public d f96287d;

    /* renamed from: e  reason: collision with root package name */
    public c f96288e;

    /* renamed from: f  reason: collision with root package name */
    public e f96289f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC2320a f96290g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f96291h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f96292i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f96293j;

    /* renamed from: k  reason: collision with root package name */
    private User f96294k;

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$a  reason: collision with other inner class name */
    public interface AbstractC2320a {
        static {
            Covode.recordClassIndex(60976);
        }

        void a();

        void b();

        void c();
    }

    public interface b {
        static {
            Covode.recordClassIndex(60977);
        }

        void a(FollowStatus followStatus);
    }

    public interface c {
        static {
            Covode.recordClassIndex(60978);
        }

        boolean a(int i2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(60979);
        }

        void a();

        void a(FollowStatus followStatus);

        void b();
    }

    public interface e {
        static {
            Covode.recordClassIndex(60980);
        }

        void a(FollowStatus followStatus);
    }

    public interface f {
        static {
            Covode.recordClassIndex(60981);
        }

        void a(int i2, User user);

        String getEnterFrom();

        String getEnterMethod();

        int getFollowFromType();
    }

    public static class g implements f {
        static {
            Covode.recordClassIndex(60982);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.f
        public void a(int i2, User user) {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.f
        public String getEnterFrom() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.f
        public String getEnterMethod() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.f
        public int getFollowFromType() {
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(60974);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(User user) {
        int i2;
        boolean z;
        if (user.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        f fVar = this.f96285b;
        if (fVar != null) {
            fVar.a(i2, user);
        }
        if (user.isSecret() || user.isPrivateAccount()) {
            z = true;
        } else {
            z = false;
        }
        a(user.getUid(), user.getSecUid(), i2, user.getFollowerStatus(), z);
    }

    private static void a(Activity activity) {
        aj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = privacyAccountFollowCount.c().intValue();
        if (intValue == 0) {
            new a.C0731a(activity).b(R.string.evb).a(R.string.cc_, (DialogInterface.OnClickListener) null, false).a().b();
        } else if (intValue > 0 && intValue < 4) {
            new com.bytedance.tux.g.b(activity).e(R.string.evc).b();
        }
        privacyAccountFollowCount.b(Integer.valueOf(intValue + 1));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (followStatus2 != null && TextUtils.equals(followStatus2.userId, this.f96294k.getUid())) {
            this.f96294k.setFollowStatus(followStatus2.followStatus);
            b bVar = this.f96286c;
            if (bVar != null) {
                bVar.a(followStatus2);
            }
            d dVar = this.f96287d;
            if (dVar != null) {
                dVar.a(followStatus2);
            }
            com.ss.android.ugc.aweme.following.ui.view.a aVar = this.f96293j;
            int i2 = followStatus2.followStatus;
            int i3 = 1;
            if (this.f96294k.getFollowerStatus() != 1) {
                i3 = 0;
            }
            aVar.a(i2, i3, this.f96294k.getUid());
        }
    }

    public final void a(User user) {
        if (this.f96294k != null) {
            UserService.d().b().removeObserver(this);
        }
        this.f96294k = user;
        int followStatus = user.getFollowStatus();
        int i2 = 0;
        if (TextUtils.equals(user.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
            com.ss.android.ugc.aweme.following.ui.view.a aVar = this.f96293j;
            if (this.f96294k.getFollowerStatus() == 1) {
                i2 = 1;
            }
            aVar.a(3, i2);
            return;
        }
        com.ss.android.ugc.aweme.following.ui.view.a aVar2 = this.f96293j;
        if (this.f96294k.getFollowerStatus() == 1) {
            i2 = 1;
        }
        aVar2.a(followStatus, i2, this.f96294k.getUid());
        UserService.d().b().observe(this.f96293j.getLifeCycleOwner(), this);
        this.f96293j.setOnClickListener(new b(this, user));
    }

    /* access modifiers changed from: package-private */
    public final void b(User user) {
        int i2;
        if (user.getFollowStatus() != 0) {
            i2 = 0;
        } else if (user.isSecret()) {
            i2 = 4;
        } else if (user.getFollowerStatus() == 1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (user.getFollowStatus() == 2 && !user.isEnableDirectMessage() && this.f96290g != null) {
            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this.f96284a);
            bVar.a(R.string.h84, new c(this, user, i2));
            bVar.b(R.string.c04, new d(this, user));
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(this.f96284a).a(false).b(R.string.h3l)).a(bVar).a().b().show();
            AbstractC2320a aVar = this.f96290g;
            user.getFollowStatus();
            aVar.a();
        } else if (user.getFollowStatus() == 0 && user.getBlockStatus() == 1 && this.f96291h) {
            com.bytedance.tux.dialog.b.b bVar2 = new com.bytedance.tux.dialog.b.b(this.f96284a);
            bVar2.a(R.string.asg, new e(this, i2, user));
            bVar2.b(R.string.c04, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(this.f96284a).a(false).b(R.string.h44)).a(bVar2).a().b().show();
        } else if (user.getFollowStatus() != 4 || this.f96290g == null) {
            if (i2 == 4) {
                a(this.f96284a);
            }
            c(user);
        } else if (!this.f96292i) {
            com.bytedance.tux.dialog.b.b bVar3 = new com.bytedance.tux.dialog.b.b(this.f96284a);
            bVar3.a(R.string.c03, new f(this, user, i2));
            bVar3.b(R.string.fjc, new g(this, user));
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(this.f96284a).a(false).b(R.string.c05)).a(bVar3).a().b().show();
            AbstractC2320a aVar2 = this.f96290g;
            user.getFollowStatus();
            aVar2.a();
            this.f96292i = true;
        }
    }

    public a(com.ss.android.ugc.aweme.following.ui.view.a aVar, f fVar) {
        this.f96293j = aVar;
        this.f96284a = (androidx.fragment.app.e) o.a(aVar.getContext());
        this.f96285b = fVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(int i2, User user) {
        if (i2 == 4) {
            a(this.f96284a);
        }
        c(user);
        return z.f158842a;
    }

    public final void a(String str, String str2, int i2, int i3, boolean z) {
        String enterFrom;
        int followFromType;
        final w i4 = com.ss.android.ugc.aweme.friends.service.a.f97047a.i();
        i4.a(new r() {
            /* class com.ss.android.ugc.aweme.follow.widet.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60975);
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void b(FollowStatus followStatus) {
                a.this.f96292i = false;
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void c(FollowStatus followStatus) {
                if (a.this.f96289f != null) {
                    a.this.f96289f.a(followStatus);
                }
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void d_(Exception exc) {
                a.this.f96292i = false;
                CaptchaHelperServiceImpl.a();
                l.a(o.a((Context) a.this.f96284a), com.ss.android.ugc.aweme.app.api.b.a.a(exc));
                if (a.this.f96287d != null) {
                    a.this.f96287d.b();
                }
            }
        });
        n.a a2 = new n.a().a(str).b(str2).a(z).a(i2);
        f fVar = this.f96285b;
        if (fVar == null) {
            enterFrom = "";
        } else {
            enterFrom = fVar.getEnterFrom();
        }
        n.a c2 = a2.c(enterFrom);
        f fVar2 = this.f96285b;
        if (fVar2 == null) {
            followFromType = 0;
        } else {
            followFromType = fVar2.getFollowFromType();
        }
        i4.a(c2.b(followFromType).d(i3).a());
        this.f96293j.getLifeCycleOwner().getLifecycle().a(new FollowUserBlock$2(this, i4));
    }
}
