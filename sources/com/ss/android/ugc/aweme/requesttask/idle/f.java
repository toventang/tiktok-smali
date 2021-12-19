package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.notice.api.b;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.aweme.notice.api.d.d;
import com.ss.android.ugc.aweme.notice.api.d.e;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.List;

public final class f implements r {
    static {
        Covode.recordClassIndex(78635);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f120704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120705b;

        static {
            Covode.recordClassIndex(78636);
        }

        a(f fVar, String str) {
            this.f120704a = fVar;
            this.f120705b = str;
        }

        @Override // b.g
        public final Object then(i<TutorialVideoResp> iVar) {
            TutorialVideoInfo info;
            int i2;
            l.b(iVar, "");
            if (iVar.a()) {
                e eVar = (e) d.a.a(e.class);
                TutorialVideoResp d2 = iVar.d();
                if (d2 != null && (info = d2.getInfo()) != null) {
                    if (TextUtils.isEmpty(info.getMsgId()) || TextUtils.isEmpty(info.getDeepLink()) || TextUtils.equals(this.f120705b, info.getMsgId())) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    b.a(1000, i2);
                    c.b(new m(1000, i2));
                    if (eVar != null) {
                        eVar.b(info.getMsgId());
                        eVar.d(info.getIcon());
                        eVar.f(info.getTitle());
                        eVar.h(info.getDesc());
                        eVar.j(info.getButton());
                        eVar.l(info.getDeepLink());
                    }
                } else if (eVar != null) {
                    eVar.b("");
                    eVar.d("");
                    eVar.f("");
                    eVar.h("");
                    eVar.j("");
                    eVar.l("");
                }
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        Keva repo = Keva.getRepo("top_message_keva_repo");
        String string = repo.getString("msg_id_".concat(String.valueOf(curUserId)), "");
        long j2 = repo.getLong("first_show_time_".concat(String.valueOf(curUserId)), 0);
        long j3 = repo.getLong("current_show_time_".concat(String.valueOf(curUserId)), 0);
        int i2 = repo.getInt("clicked_".concat(String.valueOf(curUserId)), 0);
        l.b(string, "");
        TutorialVideoApiManager.a.a(string, j2, j3, i2).c(new a(this, string), i.f4826c);
    }
}
