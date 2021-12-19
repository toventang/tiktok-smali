package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.d.c;
import com.ss.android.ugc.aweme.common.l;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.cv;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class dg extends a implements r, i, j {

    /* renamed from: a  reason: collision with root package name */
    View f94574a;

    /* renamed from: b  reason: collision with root package name */
    int f94575b = 0;

    /* renamed from: c  reason: collision with root package name */
    SmartAvatarImageView f94576c;

    /* renamed from: d  reason: collision with root package name */
    TextView f94577d;

    /* renamed from: e  reason: collision with root package name */
    public View f94578e;

    /* renamed from: f  reason: collision with root package name */
    View f94579f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f94580g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f94581h = false;

    /* renamed from: i  reason: collision with root package name */
    w f94582i;

    /* renamed from: j  reason: collision with root package name */
    public ExposeSharer f94583j;

    /* renamed from: k  reason: collision with root package name */
    private View f94584k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextView f94585l;

    static {
        Covode.recordClassIndex(60033);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(87, new g(dg.class, "onEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(13, new g(dg.class, "onProfileFollowEvent", c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        w wVar = this.f94582i;
        if (wVar != null) {
            wVar.cd_();
            this.f94582i = null;
        }
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final b e(b bVar) {
        super.e(bVar);
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(VideoItemParams videoItemParams) {
        super.b(videoItemParams);
        a(1);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("show_expose_sharer_info_view", (u<b>) this);
            dataCenter.a("action_video_on_play_progress_change", (u<b>) this);
        }
    }

    public dg(View view) {
        super(view, ((Boolean) bv.f89644b.getValue()).booleanValue());
    }

    public final void b(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f94577d.getLayoutParams();
        marginLayoutParams.setMarginEnd(i2);
        this.f94577d.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(b bVar) {
        if (bVar != null) {
            p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dk(this, bVar.f67014a, bVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void d_(Exception exc) {
        ExposeSharer exposeSharer;
        if (this.L != null && (exposeSharer = this.f94583j) != null && exposeSharer.getUid() != null) {
            l.a(o.a(this.R), exc);
            this.f94579f.setVisibility(8);
        }
    }

    static boolean a(ExposeSharer exposeSharer) {
        if (exposeSharer == null) {
            return false;
        }
        if (exposeSharer.getUid() != null && exposeSharer.getUid().equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
            return true;
        }
        if (exposeSharer.getSecUid() == null || !exposeSharer.getSecUid().equals(com.ss.android.ugc.aweme.account.b.g().getCurSecUserId())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(b bVar) {
        MethodCollector.i(8402);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
            this.f94574a = (View) this.T.getParent().getParent();
        }
        MethodCollector.o(8402);
    }

    @org.greenrobot.eventbus.r
    public void onEvent(FollowStatusEvent followStatusEvent) {
        if (followStatusEvent.status.followStatus == 0 && this.f94583j.getUid().equals(followStatusEvent.status.userId)) {
            this.f94583j.setFollowStatus(followStatusEvent.status.followStatus);
            this.f94583j.setFollowerStatus(followStatusEvent.status.followerStatus);
            this.f94578e.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(60039);
                }

                public final void run() {
                    dg.this.a(false);
                }
            }, 550);
        }
    }

    @org.greenrobot.eventbus.r
    public void onProfileFollowEvent(c cVar) {
        if (cVar != null && (cVar.f69921b instanceof User) && this.f94583j != null && ((User) cVar.f69921b).getUid().equals(this.f94583j.getUid())) {
            this.f94583j.setFollowStatus(cVar.f69920a);
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dl(this, i2)));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.r
    public final void b(FollowStatus followStatus) {
        ExposeSharer exposeSharer;
        if (this.L != null && (exposeSharer = this.f94583j) != null && exposeSharer.getUid() != null && this.f94583j.getUid().equals(followStatus.userId)) {
            this.f94583j.setFollowStatus(followStatus.followStatus);
            a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.T = com.a.b.c.a((Activity) this.R, (int) R.layout.aj3);
        this.T.setVisibility(8);
        this.f94576c = (SmartAvatarImageView) this.T.findViewById(R.id.e2h);
        this.f94577d = (TextView) this.T.findViewById(R.id.f7_);
        this.f94578e = this.T.findViewById(R.id.ezp);
        this.f94585l = (TuxTextView) this.T.findViewById(R.id.b7h);
        this.f94579f = this.T.findViewById(R.id.cs2);
        this.f94584k = this.T.findViewById(R.id.ayz);
        this.f94578e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60034);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (dg.this.L != null && dg.this.f94583j != null && !dg.this.L.isDelete() && !TextUtils.equals(dg.this.f94583j.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(dg.this.L) && !com.ss.android.ugc.aweme.commercialize.e.a.b.Y(dg.this.L)) {
                        com.ss.android.ugc.aweme.commercialize.g.a().a(dg.this.S.getContext(), dg.this.L);
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "follow", dg.this.L.getAwemeRawAd()).c();
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aa(dg.this.L) || com.ss.android.ugc.aweme.commercialize.e.a.b.Y(dg.this.L)) {
                        com.ss.android.ugc.aweme.commercialize.g.a().a(dg.this.R, dg.this.L, "plus_sign");
                    }
                    if (!f.a.f68431a.c()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(dg.this.R).a(R.string.de8).a();
                        return;
                    }
                    dg dgVar = dg.this;
                    if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                        com.ss.android.ugc.aweme.login.c.a((Activity) dgVar.R, dgVar.M, "click_follow", new ap().a("group_id", dgVar.L.getAid()).a("log_pb", ac.c(dgVar.L.getAid())).f142646a, new dh(dgVar));
                    } else {
                        dgVar.a(dgVar.f94583j, dgVar.M, true);
                    }
                }
            }
        });
        this.f94584k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass2 */

            static {
                Covode.recordClassIndex(60035);
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (dg.this.L != null && dg.this.f94583j != null && dg.this.f94583j.getUid() != null && !com.ss.android.ugc.aweme.login.b.a.a(dg.this.L)) {
                    if (dg.this.L == null || (dg.this.L.isCanPlay() && !dg.this.L.isDelete())) {
                        dg dgVar = dg.this;
                        d a2 = new d().a("enter_from", "share_user_info_card");
                        if (dgVar.P == 0) {
                            str = "homepage_hot";
                        } else {
                            str = "server_push";
                        }
                        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", a2.a("previous_page", str).a("group_id", dgVar.L.getAid()).a("author_id", dgVar.L.getAuthorUid()).a("to_user_id", dgVar.f94583j.getUid()).f66730a);
                        SmartRouter.buildRoute(dgVar.R, "aweme://user/profile/").withParam("uid", dgVar.f94583j.getUid()).withParam("sec_user_id", dgVar.f94583j.getSecUid()).withParam("extra_from_pre_page", "share_user_info_card").withParam("enter_from", "others_homepage").open();
                    } else if (dg.this.L.isImage()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(dg.this.R).a(R.string.cjs).a();
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(dg.this.R).a(R.string.har).a();
                    }
                }
            }
        });
        EventBus.a(EventBus.a(), this);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int followStatus = this.f94583j.getFollowStatus();
        int followerStatus = this.f94583j.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                this.f94585l.setText(R.string.c06);
            } else if (followStatus == 2) {
                this.f94585l.setText(R.string.bbg);
            } else if (followStatus == 4) {
                this.f94585l.setText(R.string.bzw);
            }
        } else if (followerStatus == 1) {
            this.f94585l.setText(R.string.byt);
        } else {
            this.f94585l.setText(R.string.byp);
        }
        if (followStatus == 0) {
            int b2 = (int) n.b(this.R, 92.0f);
            this.f94578e.setVisibility(0);
            this.f94578e.setAlpha(1.0f);
            this.f94579f.setAlpha(0.0f);
            b(b2);
            if (this.f94583j.getFollowerStatus() == 1) {
                this.f94585l.setText(R.string.byt);
            } else {
                this.f94585l.setText(R.string.byp);
            }
        } else if (!this.f94581h) {
            p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dj(this, z, (int) n.b(this.R, 30.0f))));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(b bVar) {
        return com.ss.android.ugc.aweme.feed.x.g.a(bVar, new di(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(ExposeSharer exposeSharer, String str, boolean z) {
        boolean z2;
        String str2;
        int a2;
        w wVar = this.f94582i;
        if (wVar != null && wVar.i()) {
            n.a b2 = new n.a().a(exposeSharer.getUid()).b(exposeSharer.getSecUid());
            int i2 = 0;
            if (exposeSharer.isPrivateAccount() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            n.a d2 = b2.a(z2).a(1).c(str).b(cv.a.a(str, null)).d(exposeSharer.getFollowStatus()).d(exposeSharer.getFollowerStatus());
            String str3 = "homepage_hot";
            if (z) {
                if (TextUtils.equals(this.M, str3)) {
                    a2 = -1;
                } else {
                    a2 = cv.a.a(this.M);
                }
                d2.c(a2);
            } else {
                d2.c(cv.a.a(str));
            }
            this.f94582i.a(d2.a());
            d a3 = new d().a("enter_from", "share_user_info_card");
            if (this.P != 0) {
                str3 = "server_push";
            }
            d a4 = a3.a("previous_page", str3).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("to_user_id", this.f94583j.getUid());
            if (this.f94583j.getFollowerStatus() == 1) {
                str2 = "mutual";
            } else {
                str2 = "single";
            }
            d a5 = a4.a("follow_type", str2);
            if (this.f94583j.isPrivateAccount() == 1) {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.common.r.a("follow", a5.a("is_private", i2).f66730a);
        }
    }
}
