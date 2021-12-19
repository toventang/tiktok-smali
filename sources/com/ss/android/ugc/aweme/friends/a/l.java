package com.ss.android.ugc.aweme.friends.a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.friends.c.b;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f96814a;

    static {
        Covode.recordClassIndex(61418);
    }

    l(k kVar) {
        this.f96814a = kVar;
    }

    public final void onClick(View view) {
        Friend a2;
        u.a aVar;
        boolean z;
        ClickAgent.onClick(view);
        k kVar = this.f96814a;
        if (kVar.f96800c != null) {
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = k.a();
            }
            if (!j.f107229h && kVar.f96798a) {
                new a(kVar.f96799b).a(R.string.de8).a();
            } else if (kVar.f96806i.f96900a && kVar.f96800c.getFollowStatus() == 2) {
                T t = kVar.f96800c;
                NoticeServiceImpl.f().a(kVar.f96799b, t, "message", null, true);
                u q = new u().a("find_friends_page").q(kVar.p);
                q.f109596a = u.c.CARD;
                q.f109597b = u.a.ENTER_CHAT;
                q.a(t).s(t.getRequestId()).f();
            } else if (!TextUtils.isEmpty(kVar.f96800c.getUid())) {
                if (kVar.f96800c.getFollowStatus() == 0) {
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName(k.a(kVar.f96801d)).setValue(kVar.f96800c.getUid()).setJsonObject(new s().a("nt", "4").a()));
                    com.ss.android.ugc.aweme.friends.e.a.b(kVar.f96800c, kVar.n, "", kVar.d());
                } else if (kVar.f96800c.getFollowStatus() == 1 || kVar.f96800c.getFollowStatus() == 4) {
                    r.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(k.a(kVar.f96801d)).setValue(kVar.f96800c.getUid()));
                    com.ss.android.ugc.aweme.friends.e.a.c(kVar.f96800c, kVar.n, "", kVar.d());
                }
                u q2 = new u().a("find_friends_page").q(kVar.p);
                q2.f109596a = u.c.CARD;
                if (kVar.f96800c.getFollowStatus() == 0) {
                    aVar = u.a.FOLLOW;
                } else {
                    aVar = u.a.FOLLOW_CANCEL;
                }
                q2.f109597b = aVar;
                q2.a(kVar.f96800c).s(kVar.f96800c.getRequestId()).f();
                if (kVar.f96802e != null) {
                    b bVar = kVar.f96802e;
                    String uid = kVar.f96800c.getUid();
                    String secUid = kVar.f96800c.getSecUid();
                    int followerStatus = kVar.f96800c.getFollowerStatus();
                    int i2 = kVar.f96800c.getFollowStatus() == 0 ? 1 : 0;
                    if (kVar.f96800c.isSecret() || kVar.f96800c.isPrivateAccount()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.a(uid, secUid, followerStatus, i2, z);
                }
            } else if (kVar.f96801d == 0 && (a2 = k.a(kVar.f96800c)) != null && !a2.isInvited()) {
                r.a("invite_friend", new d().a("enter_from", k.a(kVar.f96801d)).f66730a);
                com.ss.android.ugc.aweme.friends.e.a.a("find_friends_page", "contact", (String) null, (String) null);
                kVar.f96802e.a(a2);
            }
        }
    }
}
