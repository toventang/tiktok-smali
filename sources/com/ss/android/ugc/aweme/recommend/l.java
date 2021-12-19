package com.ss.android.ugc.aweme.recommend;

import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.friends.service.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel;
import com.ss.android.ugc.aweme.recommend.k;
import com.ss.android.ugc.aweme.utils.in;
import h.p;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static m f120096a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f120097b;

    /* renamed from: c  reason: collision with root package name */
    public static final l f120098c = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(78059);
    }

    private static boolean a() {
        if (a(1) || a(2)) {
            return true;
        }
        return false;
    }

    private static boolean a(int i2) {
        b q = a.f97047a.q();
        if (q != null) {
            p<Boolean, Long> b2 = q.b(i2);
            if (!b2.getFirst().booleanValue() || System.currentTimeMillis() >= b2.getSecond().longValue() + 259200000) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void a(m mVar) {
        List<User> recommendUsers;
        h.f.b.l.d(mVar, "");
        Object obj = mVar.f120099a.get();
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin()) {
                if (!o.a()) {
                    a(eVar, false);
                    return;
                } else if (!RecommendUserDialogTask.f120047b.get()) {
                    f120096a = mVar;
                    return;
                } else {
                    RecommendUserDialogList recommendUserDialogList = RecommendUserDialogTask.f120048c;
                    if (recommendUserDialogList == null || (recommendUsers = recommendUserDialogList.getRecommendUsers()) == null || recommendUsers.isEmpty()) {
                        a(eVar, false);
                        return;
                    } else if (!p.a()) {
                        a(eVar, false);
                        return;
                    } else if (a()) {
                        a(eVar, false);
                        return;
                    } else if (eVar != null) {
                        a(eVar, true);
                        i supportFragmentManager = eVar.getSupportFragmentManager();
                        h.f.b.l.b(supportFragmentManager, "");
                        k.a.a(supportFragmentManager, recommendUserDialogList, mVar.f120100b, mVar.f120101c);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        a(eVar, false);
    }

    static void a(e eVar, boolean z) {
        if (eVar != null) {
            RecommendUsersDialogViewModel.a.a(eVar).f120057a.postValue(Boolean.valueOf(z));
        }
    }
}
