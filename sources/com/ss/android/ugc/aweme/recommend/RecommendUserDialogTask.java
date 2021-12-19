package com.ss.android.ugc.aweme.recommend;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.m;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import h.j.g;
import h.j.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RecommendUserDialogTask implements w {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AtomicBoolean f120047b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static volatile RecommendUserDialogList f120048c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f120049d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f120050a;

    /* renamed from: e  reason: collision with root package name */
    private f.a.b.b f120051e;

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78025);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserDialogTask f120054a;

        static {
            Covode.recordClassIndex(78028);
        }

        d(RecommendUserDialogTask recommendUserDialogTask) {
            this.f120054a = recommendUserDialogTask;
        }

        @Override // f.a.d.a
        public final void a() {
            RecommendUserDialogTask.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(78024);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        int a2 = h.a(new g(0, 1), h.i.c.Default);
        String.valueOf(a2);
        if (!((Boolean) m.f107605m.getValue()).booleanValue() || a2 != 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        com.ss.android.ugc.aweme.friends.g.a a2 = com.ss.android.ugc.aweme.recommend.users.b.f120122a.a();
        com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
        l.b(eVar, "");
        this.f120051e = a2.a((Integer) 30, (Integer) 0, eVar.a()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this), new d(this), new e(this));
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserDialogTask f120055a;

        static {
            Covode.recordClassIndex(78029);
        }

        e(RecommendUserDialogTask recommendUserDialogTask) {
            this.f120055a = recommendUserDialogTask;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            RecommendUserDialogTask.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserDialogTask f120053a;

        static {
            Covode.recordClassIndex(78027);
        }

        c(RecommendUserDialogTask recommendUserDialogTask) {
            this.f120053a = recommendUserDialogTask;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            RecommendUserDialogTask recommendUserDialogTask = this.f120053a;
            if (recommendUserDialogTask.f120050a < 0) {
                recommendUserDialogTask.f120050a++;
                recommendUserDialogTask.c();
                return;
            }
            RecommendUserDialogTask.b(false);
            RecommendUserDialogTask.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendUserDialogTask f120052a;

        static {
            Covode.recordClassIndex(78026);
        }

        b(RecommendUserDialogTask recommendUserDialogTask) {
            this.f120052a = recommendUserDialogTask;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            User user;
            RecommendUserDialogList recommendUserDialogList = (RecommendUserDialogList) obj;
            List<User> recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (!(recommendUsers == null || (user = (User) n.h((List) recommendUsers)) == null)) {
                user.getNickname();
            }
            RecommendUserDialogTask.b(true);
            List<User> recommendUsers2 = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers2 != null && !recommendUsers2.isEmpty()) {
                RecommendUserDialogTask.f120048c = recommendUserDialogList;
            }
        }
    }

    public static void a(boolean z) {
        f120047b.set(z);
        if (z) {
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (l.f120096a != null) {
                m mVar = l.f120096a;
                if (mVar == null) {
                    l.b();
                }
                l.a(mVar);
            } else {
                if (!(j2 instanceof androidx.fragment.app.e)) {
                    j2 = null;
                }
                l.a((androidx.fragment.app.e) j2, false);
            }
            l.f120096a = null;
        }
    }

    public static void b(boolean z) {
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        f120047b.get();
        if (!(j2 instanceof androidx.fragment.app.e)) {
            j2 = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) j2;
        if (eVar != null) {
            ((RecommendUsersDialogViewModel) androidx.lifecycle.ae.a(eVar, (ad.b) null).a(RecommendUsersDialogViewModel.class)).f120057a.postValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                if (!o.a()) {
                    b(false);
                    return;
                } else if (f120047b.get()) {
                    b(false);
                    return;
                } else if (!p.a()) {
                    b(false);
                    return;
                } else {
                    c();
                    return;
                }
            }
        }
        b(false);
    }
}
