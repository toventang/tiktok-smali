package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.api.e;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.cp.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.al;
import com.ss.android.ugc.aweme.feed.experiment.r;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.helper.o;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.u.aa;
import com.ss.android.ugc.aweme.feed.u.ac;
import com.ss.android.ugc.aweme.feed.u.w;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.y;
import com.ss.android.ugc.aweme.metrics.z;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public class cv extends a implements w, i, j {

    /* renamed from: a  reason: collision with root package name */
    DiggAnimationView f94511a;

    /* renamed from: b  reason: collision with root package name */
    TextView f94512b;

    /* renamed from: c  reason: collision with root package name */
    View f94513c;

    /* renamed from: d  reason: collision with root package name */
    public long f94514d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f94515e;

    /* renamed from: f  reason: collision with root package name */
    long f94516f;

    /* renamed from: g  reason: collision with root package name */
    public ac f94517g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f94518h;

    /* renamed from: i  reason: collision with root package name */
    public final String f94519i;

    /* renamed from: j  reason: collision with root package name */
    e f94520j;

    /* renamed from: k  reason: collision with root package name */
    public View f94521k;

    /* renamed from: l  reason: collision with root package name */
    u<p<String, Long>> f94522l = new cw(this);

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f94523m = new View.OnClickListener() {
        /* class com.ss.android.ugc.aweme.feed.ui.cv.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60011);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            cv.this.Q.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", cv.this.L.getAid());
            if (b.ax(cv.this.L)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.of).a();
                return;
            }
            int a2 = r.a();
            if (a2 != 0 ? !(a2 <= 0 || com.ss.android.ugc.aweme.account.b.g().isLogin() || cv.this.f94515e || cv.this.L.getUserDigg() != 0 || al.b() < a2) : (!com.ss.android.ugc.aweme.account.b.g().isLogin())) {
                z a3 = new z().a(cv.this.f94519i);
                a3.f109628e = cv.this.P;
                a3.f109624a = cv.this.L.getAid();
                z f2 = a3.g(cv.this.L);
                f2.f109625b = "click_like";
                f2.f109626c = !al.d() ? 1 : 0;
                f2.f109627d = 1;
                f2.f();
                if (!al.d()) {
                    al.c();
                }
                if (cv.this.L != null) {
                    str = cv.this.L.getAid();
                } else {
                    str = "";
                }
                c.a((Activity) cv.this.R, cv.this.f94519i, "click_like", new ap().a("login_title", "").a("group_id", str).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(str)).f142646a, new de(this, view));
            } else if (b.aX(cv.this.L)) {
                new com.bytedance.tux.g.b(view).e(R.string.cw6).b();
            } else if (com.ss.android.ugc.aweme.login.b.a.a(cv.this.L) && cv.this.L.getUserDigg() == 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(com.ss.android.ugc.aweme.login.b.a.a(cv.this.L, R.string.har)).a();
            } else if (cv.this.L.isCanPlay() || cv.this.L.getUserDigg() != 0) {
                if (cv.this.L.isDelete() && cv.this.L.getUserDigg() == 0) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.har).a();
                } else if (cv.this.L.getVideoControl() != null && cv.this.L.getVideoControl().timerStatus == 0) {
                } else {
                    if (cv.this.L.isProhibited()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.cw6).a();
                    } else if (m.a(cv.this.L) && com.ss.android.ugc.aweme.utils.z.d(cv.this.L)) {
                        new com.bytedance.tux.g.b(cv.this.f94521k).e(R.string.evj).b();
                    } else if (cv.this.f94515e || !com.ss.android.ugc.aweme.utils.z.c(cv.this.L) || !com.ss.android.ugc.aweme.utils.z.a(cv.this.L)) {
                        cv.this.f94511a.a(view);
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                            com.ss.android.ugc.aweme.lancet.j.f107229h = a();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.de8).a();
                            return;
                        }
                        cv cvVar = cv.this;
                        cvVar.a(cvVar.L);
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.hfj).a();
                    }
                }
            } else if (cv.this.L.isImage()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.cjs).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(cv.this.R).a(R.string.har).a();
            }
        }
    };
    private long n;
    private int o;
    private View p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final VideoDiggWidget.a w;
    private d x;
    private View y;
    private com.ss.android.ugc.aweme.feed.x.a z = new com.ss.android.ugc.aweme.feed.x.a();

    static {
        Covode.recordClassIndex(60010);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(7, new g(cv.class, "onEventDiggUpdate", com.ss.android.ugc.aweme.feed.i.r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, Aweme aweme, Map<String, Object> map) {
        long j2;
        if (aweme != null) {
            this.f94511a.setSelected(z2);
            j2 = ((Long) map.get("digg_count_state")).longValue();
            this.Q.a("update_diig_view", Boolean.valueOf(z2));
            if (j2 < 0) {
                j2 = 0;
            }
            if (aweme != null) {
                try {
                    if (aweme.isDelete() && j2 == 0) {
                        this.f94512b.setVisibility(4);
                        this.f94516f = j2;
                    }
                } catch (NullPointerException e2) {
                    this.f94512b.setText(a(0, aweme));
                    this.f94516f = 0;
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    e2.printStackTrace();
                    return;
                }
            }
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggView", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            j2 = 0;
        }
        this.f94512b.setVisibility(0);
        this.f94512b.setText(a(j2, aweme));
        this.f94516f = j2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new cz(this)));
                return;
            }
        } else if (!com.ss.android.ugc.aweme.aq.a.a.a()) {
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new da(this)));
            return;
        }
        com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new db(this)));
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(Exception exc) {
        CaptchaHelperServiceImpl.a();
        final Aweme aweme = this.L;
        if (!(this.R == null || aweme == null)) {
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(this.I, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.cv.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(60012);
                }

                public final void run() {
                    final boolean z;
                    if (!cv.this.f94515e) {
                        cv.this.f94514d++;
                        z = true;
                    } else {
                        if (cv.this.f94515e) {
                            cv.this.f94514d--;
                        }
                        z = false;
                    }
                    com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.ui.cv.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(60013);
                        }

                        public final void run() {
                            cv.this.a(z, aweme);
                        }
                    }));
                }
            }));
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(this.R, (Throwable) exc, this.f94517g.d() == 1 ? R.string.b7d : R.string.h48);
    }

    private d b() {
        if (this.x == null) {
            this.x = new d();
        }
        return this.x;
    }

    private JSONObject c() {
        return com.ss.android.ugc.aweme.feed.x.i.a(this.L, this.P, this.U, this.f94519i);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dd(this)));
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    private static void d(Aweme aweme) {
        if (aweme != null) {
            com.ss.android.ugc.aweme.common.r.a("unlogin_like_cancel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").a("group_id", aweme.getAid()).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(aweme)).a("log_pb", ac.a.f91473a.a(aweme.getRequestId())).f66730a);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEventDiggUpdate(com.ss.android.ugc.aweme.feed.i.r rVar) {
        if (rVar != null && this.L != null && TextUtils.equals(rVar.f93490a, com.ss.android.ugc.aweme.metrics.ac.e(this.L))) {
            this.L.setUserDigg(rVar.f93491b ? 1 : 0);
            a(rVar.f93491b, this.L);
        }
    }

    private static String b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    private static String c(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(androidx.core.g.e<String, Integer> eVar) {
        this.Q.a("digg_success", eVar);
        ag agVar = new ag(13, eVar.f2397a);
        Bundle bundle = new Bundle();
        S s2 = eVar.f2398b;
        if (s2 == null) {
            s2 = -1;
        }
        bundle.putInt("user_digged", s2.intValue());
        agVar.f93452c = bundle;
        com.ss.android.ugc.d.a.c.a(agVar);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.b(s2.intValue()));
        com.ss.android.ugc.aweme.discover.hitrank.d.f81205b.a(this.L, 4);
        SpecActServiceImpl.i().b("like");
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        long diggCount;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (bVar.f67014a.equals("video_params")) {
            HashMap hashMap = new HashMap();
            bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("uistate", hashMap);
            Aweme aweme = this.L;
            hashMap.put("aweme_state", aweme);
            if (this.L.getStatistics() == null) {
                diggCount = 0;
            } else {
                diggCount = this.L.getStatistics().getDiggCount();
            }
            this.f94514d = diggCount;
            this.n = diggCount;
            this.o = this.L.getUserDigg();
            hashMap.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
            boolean z2 = true;
            if (aweme.getUserDigg() != 1) {
                z2 = false;
            }
            b(z2, aweme, hashMap);
            this.f94513c.setOnClickListener(this.f94523m);
            this.f94512b.setOnClickListener(this.f94523m);
            this.p.setOnClickListener(this.f94523m);
        }
        return bVar2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.y = view;
        View a2 = com.a.b.c.a((Activity) this.R, (int) R.layout.t2);
        this.f94521k = a2;
        this.f94511a = (DiggAnimationView) a2.findViewById(R.id.am1);
        this.f94512b = (TextView) a2.findViewById(R.id.am4);
        this.f94513c = a2.findViewById(R.id.am3);
        this.p = a2.findViewById(R.id.am7);
        com.ss.android.ugc.aweme.feed.u.ac acVar = new com.ss.android.ugc.aweme.feed.u.ac();
        this.f94517g = acVar;
        acVar.a(new aa());
        this.f94517g.a_(this);
        this.f94518h = this.R.getResources().getDrawable(R.drawable.azy);
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new cx(this)));
        if (k.a()) {
            com.ss.android.ugc.aweme.common.f.d.a(this.f94512b, 12);
        }
        d b2 = b();
        b2.f78255a = this.S;
        b2.f78256b = this.f94513c;
        b2.f78257c = this.f94511a;
        b2.f78258d = this.f94512b;
        Drawable d2 = d.d();
        if (d2 != null) {
            this.f94518h = d2;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(8688);
        boolean z2 = true;
        if (!this.K) {
            this.K = true;
            View view = this.y;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.f94521k);
            }
        }
        if (bVar == null) {
            MethodCollector.o(8688);
            return;
        }
        Map<String, Object> map = (Map) bVar.a();
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (aweme == null) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggView", "dig aweme is null content visible" + this.f94521k.getVisibility());
            MethodCollector.o(8688);
            return;
        }
        a(map);
        com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggView", "dig visible" + this.f94521k.getVisibility() + " aweme " + aweme.getAid());
        if (aweme.getUserDigg() != 1) {
            z2 = false;
        }
        a(z2, aweme, map);
        b().c();
        l.d("VideoDiggView OnBind", "");
        MethodCollector.o(8688);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        Aweme aweme;
        boolean z2;
        long diggCount;
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1475411887:
                    if (str.equals("handle_double_click")) {
                        Aweme aweme2 = (Aweme) bVar.a();
                        if (this.R != null && aweme2 != null) {
                            if (b.ax(aweme2)) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.of).a();
                                return;
                            } else if (b.aX(aweme2)) {
                                new com.bytedance.tux.g.b(this.f94513c).e(R.string.cw6).b();
                                return;
                            } else if (!this.f94515e && aweme2.getUserDigg() == 0) {
                                this.f94514d++;
                                HashMap hashMap = new HashMap();
                                b(true, aweme2, hashMap);
                                com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dc(this, aweme2, hashMap)));
                                a(aweme2, "click_double_like");
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 281945252:
                    if (!str.equals("show_festival_activity_icon")) {
                        return;
                    }
                    a((Map<String, Object>) null);
                    return;
                case 350216171:
                    if (!str.equals("on_page_selected")) {
                        return;
                    }
                    a((Map<String, Object>) null);
                    return;
                case 651229933:
                    if (!str.equals("awesome_update_backup_data")) {
                        return;
                    }
                    onChanged(new com.ss.android.ugc.aweme.arch.widgets.base.b("video_params", bVar.a()));
                    return;
                case 710615618:
                    if (str.equals("video_resume_play") && (aweme = (Aweme) bVar.a()) != null && aweme.isAd()) {
                        if (aweme.getUserDigg() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (this.L != null) {
                            this.f94515e = z2;
                            if (this.L.getStatistics() == null) {
                                diggCount = 0;
                            } else {
                                diggCount = this.L.getStatistics().getDiggCount();
                            }
                            this.f94514d = diggCount;
                            if (diggCount < 0) {
                                this.f94514d = 0;
                            }
                            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new cy(this, z2, this.f94514d, this.L)));
                            return;
                        }
                        return;
                    }
                    return;
                case 1759823748:
                    if (!str.equals("awesome_update_data")) {
                        return;
                    }
                    onChanged(new com.ss.android.ugc.aweme.arch.widgets.base.b("video_params", bVar.a()));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("video_resume_play", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("handle_double_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("show_festival_activity_icon", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    public final void a(Aweme aweme) {
        String str;
        if (this.R == null || aweme == null) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggView", "handleDiggClick:" + String.valueOf(this.R) + ",aweme:" + String.valueOf(aweme));
            return;
        }
        com.ss.android.ugc.aweme.feed.helper.l.a();
        com.ss.android.ugc.aweme.feed.helper.l.b(this.f94511a, this.f94519i, com.ss.android.ugc.aweme.metrics.ac.e(this.L), com.ss.android.ugc.aweme.metrics.ac.a(this.L));
        this.Q.a("handle_digg_click", aweme);
        boolean z2 = true;
        if (!this.f94515e && aweme.getUserDigg() == 0) {
            this.Q.a("video_digg", (Object) 5);
            this.f94514d++;
            a(true, aweme);
            a(aweme, "click_like");
        } else if (!this.f94515e || aweme.getUserDigg() == 0) {
            if (aweme.getUserDigg() != 1) {
                z2 = false;
            }
            this.f94515e = z2;
            a(z2, aweme);
            if (this.f94515e) {
                this.f94514d++;
            } else {
                this.f94514d--;
            }
        } else {
            this.Q.a("video_digg", (Object) 6);
            this.f94514d--;
            a(false, aweme);
            if (!f.a.f68431a.c()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.de8).a();
            } else {
                String searchResultId = FeedParamProvider.a(this.R).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId)) {
                    searchResultId = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
                }
                if (aweme.playlist_info != null) {
                    str = aweme.playlist_info.getMixId();
                } else {
                    str = "";
                }
                y yVar = (y) new y("like_cancel").a(this.f94519i).l(FeedParamProvider.a(this.R).getSearchId()).f(searchResultId);
                yVar.f109623e = this.q;
                yVar.f109619a = this.P;
                y o2 = yVar.g(aweme).o(this.t);
                o2.r = this.u;
                o2.s = this.v;
                o2.X = str;
                o2.a(com.ss.android.ugc.aweme.utils.w.a(this.L, "like_cancel", this.f94519i)).f();
                if (!TextUtils.equals("opus", this.f94519i)) {
                    com.ss.android.ugc.aweme.common.r.a("like_cancel", this.f94519i, aweme.getAid(), 0, c());
                } else if (this.O) {
                    com.ss.android.ugc.aweme.common.r.a("like_cancel", "personal_homepage", aweme.getAid(), 0, c());
                } else {
                    com.ss.android.ugc.aweme.common.r.a("like_cancel", "others_homepage", aweme.getAid(), 0, c());
                }
                if (aweme.getAwemeType() != 34) {
                    a(aweme.getAid(), 0, aweme);
                } else {
                    com.ss.android.ugc.aweme.commercialize.g.a().g(this.R, aweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like_cancel", aweme.getAwemeRawAd()).c();
                }
            }
        }
        com.ss.android.ugc.aweme.feed.x.a.a(this.R, this.R.getString(R.string.kx), false, 0);
    }

    public final void a(boolean z2, Aweme aweme) {
        HashMap hashMap = new HashMap();
        b(z2, aweme, hashMap);
        a(z2, aweme, hashMap);
    }

    static String a(long j2, Aweme aweme) {
        if (!com.ss.android.ugc.aweme.login.b.a.a(aweme) && j2 > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a(j2);
        }
        return "0";
    }

    private void a(Aweme aweme, String str) {
        boolean z2;
        String str2;
        long j2;
        String str3;
        long j3;
        if (!TextUtils.equals("opus", this.f94519i)) {
            com.ss.android.ugc.aweme.common.r.a("like", this.f94519i, aweme.getAid(), 0, c());
        } else if (this.O) {
            com.ss.android.ugc.aweme.common.r.a("like", "personal_homepage", aweme.getAid(), 0, c());
        } else {
            com.ss.android.ugc.aweme.common.r.a("like", "others_homepage", aweme.getAid(), 0, c());
        }
        String a2 = com.ss.android.ugc.aweme.feed.helper.e.a(this.P, this.f94519i, true);
        if (aweme == null || aweme.getBottomBarModel() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (aweme == null || aweme.playlist_info == null) {
            str2 = "";
        } else {
            str2 = aweme.playlist_info.getMixId();
        }
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            z a3 = new z().a(this.f94519i);
            a3.f109628e = this.P;
            a3.f109624a = aweme.getAid();
            z f2 = a3.g(aweme);
            f2.f109625b = str;
            f2.f109626c = !al.d() ? 1 : 0;
            f2.f109627d = 0;
            f2.f();
            String searchResultId = FeedParamProvider.a.a(this.R).getSearchResultId();
            if (TextUtils.isEmpty(searchResultId)) {
                searchResultId = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
            }
            y yVar = new y();
            yVar.u = 0;
            yVar.t = str;
            y a4 = yVar.a(a2);
            a4.f109623e = this.q;
            a4.f109620b = (String) this.Q.b("playlist_type", "");
            a4.f109622d = (String) this.Q.b("playlist_id", "");
            a4.f109621c = (String) this.Q.b("playlist_id_key", "");
            y yVar2 = (y) ((y) a4.c((String) this.Q.b("tab_name", "")).d(com.ss.android.ugc.aweme.metrics.ac.b(this.L, this.P))).g(aweme).a(Boolean.valueOf(m.b(aweme)));
            VideoDiggWidget.a aVar = this.w;
            if (aVar != null) {
                j3 = aVar.a();
            } else {
                j3 = 0;
            }
            yVar2.v = j3;
            y o2 = yVar2.o(this.t);
            o2.r = this.u;
            o2.s = this.v;
            y yVar3 = (y) o2.l(FeedParamProvider.a.a(this.R).getSearchId()).f(searchResultId);
            yVar3.X = str2;
            yVar3.ab = a2;
            yVar3.ac = FeedParamProvider.a.a(this.R).getLastGroupId();
            y yVar4 = (y) yVar3.n(com.ss.android.ugc.aweme.feed.x.y.a(this.q, this.r));
            yVar4.ad = FeedParamProvider.a.a(this.R).getNewsId();
            yVar4.a(com.ss.android.ugc.aweme.utils.w.a(this.L, "like", this.f94519i)).f();
        } else {
            String searchResultId2 = FeedParamProvider.a.a(this.R).getSearchResultId();
            if (TextUtils.isEmpty(searchResultId2)) {
                searchResultId2 = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
            }
            this.Q.a("follow_button_interaction", k.b.LIKE);
            y yVar5 = new y();
            yVar5.u = 1;
            yVar5.t = str;
            y yVar6 = (y) yVar5.a(a2).l(FeedParamProvider.a.a(this.R).getSearchId());
            yVar6.f109623e = this.q;
            yVar6.p = this.s;
            yVar6.q = z2;
            yVar6.f109620b = (String) this.Q.b("playlist_type", "");
            yVar6.f109622d = (String) this.Q.b("playlist_id", "");
            yVar6.f109621c = (String) this.Q.b("playlist_id_key", "");
            y yVar7 = (y) ((y) yVar6.c((String) this.Q.b("tab_name", "")).d(com.ss.android.ugc.aweme.metrics.ac.b(this.L, this.P))).g(aweme).a(Boolean.valueOf(m.b(aweme)));
            VideoDiggWidget.a aVar2 = this.w;
            if (aVar2 != null) {
                j2 = aVar2.a();
            } else {
                j2 = 0;
            }
            yVar7.v = j2;
            y o3 = yVar7.o(this.t);
            o3.r = this.u;
            o3.s = this.v;
            y yVar8 = (y) o3.l(FeedParamProvider.a.a(this.R).getSearchId()).f(searchResultId2);
            yVar8.V = h.a(aweme.getAuthor());
            if (com.ss.android.ugc.aweme.story.d.a.g(this.L)) {
                str3 = "story";
            } else {
                str3 = UGCMonitor.TYPE_POST;
            }
            yVar8.W = str3;
            yVar8.ab = a2;
            yVar8.ac = FeedParamProvider.a.a(this.R).getLastGroupId();
            y yVar9 = (y) yVar8.b_(com.ss.android.ugc.aweme.story.d.a.b(aweme));
            yVar9.X = str2;
            yVar9.ad = FeedParamProvider.a.a(this.R).getNewsId();
            com.ss.android.ugc.aweme.metrics.h n2 = yVar9.n(com.ss.android.ugc.aweme.feed.x.y.a(this.q, this.r));
            com.ss.android.ugc.aweme.upvote.event.c.a(n2, aweme, a2);
            h.a(n2, aweme).a(com.ss.android.ugc.aweme.utils.w.a(this.L, "like", this.f94519i)).f();
        }
        if (aweme.getAwemeType() != 34) {
            a(aweme.getAid(), 1, aweme);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.g.a().f(this.R, aweme);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", c(aweme)).c();
    }

    public cv(View view, Bundle bundle, VideoDiggWidget.a aVar) {
        super(view);
        this.f94519i = bundle.getString("eventType");
        this.q = bundle.getString("previousPage");
        this.r = bundle.getString("from_group_id");
        this.s = bundle.getString("previousPagePosition");
        this.t = bundle.getString("creationId");
        this.u = bundle.getString("challengeId");
        this.v = bundle.getString("extra_parent_tag_id");
        this.w = aVar;
    }

    private void b(boolean z2, Aweme aweme, Map<String, Object> map) {
        long j2;
        e b2;
        if (aweme != null) {
            this.f94515e = z2;
            if (z2) {
                if (this.o == 1) {
                    if (this.n < 1 && !aweme.isDelete()) {
                        this.n = 1;
                    }
                    j2 = this.n;
                } else {
                    j2 = 1 + this.n;
                }
            } else if (this.o != 1 || aweme.isDelete()) {
                j2 = this.n;
            } else {
                j2 = this.n - 1;
            }
            map.put("digg_count_state", Long.valueOf(j2));
            if ((this.R instanceof androidx.fragment.app.e) && (b2 = CommentServiceImpl.e().b((androidx.fragment.app.e) this.R)) != null) {
                b2.a(aweme.getAid(), j2);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggView", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
    }

    private void a(String str, int i2, Aweme aweme) {
        if (!al.d()) {
            al.c();
        }
        if (!TextUtils.isEmpty(this.f94519i) && i2 == 1) {
            t.a(new o(aweme.getAid(), 1, System.currentTimeMillis(), this.f94519i));
        }
        if (r.a() == 0 || com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_id", String.valueOf(str));
            hashMap.put(StringSet.type, String.valueOf(i2));
            hashMap.put("channel_id", String.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.f94519i)));
            if (this.L == null || !this.L.isAd()) {
                com.ss.android.ugc.aweme.feed.x.d.a(this.f94519i, null, hashMap);
            } else {
                com.ss.android.ugc.aweme.feed.x.d.a(this.R, this.L.getAwemeRawAd().getLogExtra(), String.valueOf(this.L.getAwemeRawAd().getAdId()), String.valueOf(this.L.getAwemeRawAd().getCreativeId()), hashMap);
            }
            this.f94517g.a(hashMap);
        } else if (i2 == 1) {
            al.a(al.b() + 1);
            if (!(aweme == null || aweme.getStatistics() == null)) {
                aweme.setUserDigg(1);
                aweme.getStatistics().setDiggCount(this.f94514d);
            }
            com.ss.android.ugc.d.a.c.a(new ag(13, 0));
        } else if (i2 == 0) {
            al.a(Math.max(al.b() - 1, 0));
            d(aweme);
            if (!(aweme == null || aweme.getStatistics() == null)) {
                aweme.setUserDigg(0);
                aweme.getStatistics().setDiggCount(this.f94514d);
            }
            com.ss.android.ugc.d.a.c.a(new ag(13, 1));
        }
    }
}
