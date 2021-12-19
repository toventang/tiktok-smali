package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import b.i;
import com.bytedance.android.live.base.a.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.m;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.f.ad;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.dd;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Map;

public class ag extends aa {

    /* renamed from: c  reason: collision with root package name */
    String f116531c;

    /* renamed from: d  reason: collision with root package name */
    String f116532d;

    /* renamed from: e  reason: collision with root package name */
    public String f116533e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f116534f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f116535g = 0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f116536k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f116537l = false;

    static {
        Covode.recordClassIndex(75305);
    }

    public final void d() {
        a(new b<UserResponse>() {
            /* class com.ss.android.ugc.aweme.profile.presenter.ag.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75306);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length < 2) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                String str;
                if (!super.sendRequest(objArr)) {
                    d a2 = new d().a("enter_from", ag.this.f116533e);
                    if (objArr != null) {
                        a2.a("params", TextUtils.join(",", objArr));
                    }
                    r.a("profile_request_request", a2.f66730a);
                    return false;
                }
                ag.this.f116531c = (String) objArr[0];
                ag.this.f116532d = (String) objArr[1];
                if (objArr.length > 2) {
                    str = (String) objArr[2];
                } else {
                    str = null;
                }
                if (c.f99077a.f99078b.getSecIdSwitch().intValue() == 0) {
                    e.a();
                    e.a(this.mHandler, ag.this.f116531c, ag.this.f116532d, str, ag.this.e(), ag.this.f116534f);
                } else if (!TextUtils.isEmpty(ag.this.f116532d)) {
                    e.a();
                    e.b(this.mHandler, com.ss.android.ugc.aweme.profile.api.c.a(ag.this.f116532d, null, ag.this.e(), ag.this.f116534f));
                } else {
                    e.a();
                    e.b(this.mHandler, com.ss.android.ugc.aweme.profile.api.c.a(null, ag.this.f116531c, str, ag.this.e(), ag.this.f116534f));
                }
                r.a("profile_request_request", new d().a("enter_from", ag.this.f116533e).a("sec_uid", ag.this.f116532d).a("uid", ag.this.f116531c).f66730a);
                return true;
            }
        });
    }

    public ag() {
        d();
    }

    public final int e() {
        if (TextUtils.equals(this.f116533e, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(this.f116533e, "prop_page")) {
            return 3;
        }
        if (TextUtils.equals(this.f116533e, "general_search") && this.f116535g == 2) {
            return 2;
        }
        if (TextUtils.equals(this.f116533e, "general_search") && this.f116535g == 3) {
            return 4;
        }
        if (TextUtils.equals(this.f116533e, "general_search") && this.f116535g == 1) {
            return 6;
        }
        if (this.f116536k) {
            return 7;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void c() {
        String a2;
        if (this.f116537l) {
            com.bytedance.a.b.b("profile", "info");
        }
        User user = null;
        if (!(this.f76396h == null || this.f76396h.mData == null)) {
            user = this.f76396h.mData.getUser();
        }
        if (!(this.f76396h == null || this.f76396h.mData == null)) {
            i.b(new ah(this.f76396h.mData), r.a());
        }
        if (!(this.f76396h == null || this.f76396h.mData == null)) {
            ac.a.f91473a.b(this.f116531c, this.f76396h.mData.getLogPb());
        }
        boolean z = false;
        if (user == null || com.ss.android.ugc.aweme.account.b.g().isUserEmpty(user)) {
            r.a("profile_request_response", new d().a("enter_from", this.f116533e).a("is_success", 0).a("fail_info", "user_is_empty").a("to_user_id", this.f116531c).a("log_pb", ac.a.f91473a.c(this.f116531c)).f66730a);
            return;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUserFollowStatus(IMUser.fromUser(user));
        }
        if (this.f76397i == null || (!TextUtils.isEmpty(((s) this.f76397i).a()) && !TextUtils.equals(user.getUid(), ((s) this.f76397i).a()))) {
            d a3 = new d().a("enter_from", this.f116533e).a("is_success", 1);
            StringBuilder append = new StringBuilder().append(this.f116531c).append(",").append(this.f116532d).append(",");
            if (this.f76397i == null) {
                a2 = "";
            } else {
                a2 = ((s) this.f76397i).a();
            }
            r.a("profile_request_response", a3.a("fail_info", append.append(a2).append(",").append(user.getUid()).toString()).a("log_pb", ac.a.f91473a.c(this.f116531c)).f66730a);
            return;
        }
        a(user);
        a aVar = new a();
        aVar.f7363b = Long.parseLong(user.getUid());
        aVar.f7362a = user.roomId;
        aVar.f7364c = !user.isLive();
        com.ss.android.ugc.d.a.c.a(aVar);
        if (!in.g(user)) {
            int followStatus = user.getFollowStatus();
            IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
            if (createIMainServiceHelperbyMonsterPlugin != null && createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                return;
            }
            if (com.bytedance.ies.abmock.b.a().a(true, "hide_profile_message_button", false) && !user.isShowMessageButton()) {
                return;
            }
            if (followStatus == 1 || followStatus == 2 || (m.b() && dd.a.a(user))) {
                String uid = user.getUid();
                if (user.getAccountType() == 3) {
                    z = true;
                }
                ad.a(uid, followStatus, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        if (this.f116537l) {
            com.bytedance.a.b.a("profile", "info");
        }
        return super.a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.profile.presenter.aa
    public void a_(Exception exc) {
        if (this.f116537l) {
            com.bytedance.a.b.a("profile", "info", com.bytedance.ies.b.a.a.a(com.bytedance.ies.ugc.appcontext.d.a(), exc));
        }
        d a2 = new d().a("to_user_id", this.f116531c).a("enter_from", this.f116533e).a("is_success", 0).a("fail_info", exc.getMessage());
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            a2.a("response", ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse());
        }
        Map<String, String> map = a2.f66730a;
        r.a("profile_request_response", map);
        com.ss.android.ugc.aweme.framework.a.a.a(4, "aweme/v1/user", map.toString());
        super.a_(exc);
    }
}
