package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.cc.c;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.inbox.d.f;
import com.ss.android.ugc.aweme.inbox.d.g;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.notice.api.b.d;
import com.ss.android.ugc.aweme.notice.api.services.b;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.f.b.l;
import java.util.Objects;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f113930a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f113931b;

    static {
        Covode.recordClassIndex(73258);
    }

    public a(Context context) {
        l.d(context, "");
        this.f113931b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f113930a = (e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.a("mus_new_notification");
        b.f112773a.d();
        if (!com.ss.android.ugc.aweme.inbox.b.b.b()) {
            com.ss.android.ugc.aweme.inbox.d.e.a();
        } else if (f.a("inbox_enter_perf_v1", 1.0f)) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (!(currentUserID == null || currentUserID.length() == 0 || l.a((Object) g.f104141b, (Object) currentUserID))) {
                g.f104141b = currentUserID;
                g.f104140a = new g.a();
                g.a(g.k.f104164a);
            }
        }
        ScrollSwitchStateManager a2 = ScrollSwitchStateManager.a.a(this.f113930a);
        AVExternalServiceImpl.a().enterFromService().setEnterFrom("NOTIFICATION");
        com.ss.android.ugc.aweme.notice.api.b.a(true);
        com.ss.android.ugc.aweme.notice.api.b.d(998);
        com.ss.android.ugc.aweme.logger.c.f109013a = false;
        a.b.f109011a.f109002c = false;
        a.b.f109011a.f109006g = false;
        com.ss.android.ugc.aweme.share.d.c.f123452d = null;
        IMainPageFragment i2 = MainPageFragmentImpl.i();
        i2.c();
        String str = a2.f99148j;
        if (true ^ l.a((Object) str, (Object) "NOTIFICATION")) {
            com.ss.android.ugc.d.a.c.b(new d());
            i2.g();
        }
        if (str != null) {
            i2.a(str, "NOTIFICATION");
        }
        i2.a(a2);
        com.ss.android.common.c.c.a(com.bytedance.ies.ugc.appcontext.d.a(), "message", "click");
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(2, "notification_page", "auto", this.f113931b);
        FollowFeedServiceImpl.c().a();
    }
}
