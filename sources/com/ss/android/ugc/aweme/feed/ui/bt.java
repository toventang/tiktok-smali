package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cp.c;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.helper.l;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.legoImp.inflate.e;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class bt extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    TextView f94413a;

    /* renamed from: b  reason: collision with root package name */
    View f94414b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f94415c;

    /* renamed from: d  reason: collision with root package name */
    View f94416d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f94417e;

    /* renamed from: f  reason: collision with root package name */
    private c f94418f;

    static {
        Covode.recordClassIndex(59972);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(bt.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(5, new g(bt.class, "onCommentEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
    }

    private c b() {
        if (this.f94418f == null) {
            this.f94418f = new c();
        }
        return this.f94418f;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    public class a implements View.OnClickListener {
        static {
            Covode.recordClassIndex(59973);
        }

        public a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.feed.assem.videocomment.a.a();
            r.a("verify_precise_exp", new d().a("scene", "enter_comment").f66730a);
            bt.this.Q.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", bt.this.L.getAid());
            if (com.ss.android.ugc.aweme.login.b.a.a(bt.this.L)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(com.ss.android.ugc.aweme.login.b.a.a(bt.this.L, R.string.har)).a();
            } else if (bt.this.L == null || (bt.this.L.isCanPlay() && !bt.this.L.isDelete())) {
                CommentServiceImpl.e().b();
                l.a();
                l.b(bt.this.f94415c, bt.this.M, ac.e(bt.this.L), ac.a(bt.this.L));
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                if (z.d(bt.this.L) && !m.a(bt.this.L)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.ew0).a();
                } else if (!m.a(bt.this.L) && z.c(bt.this.L) && !z.e(bt.this.L)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.hfj).a();
                } else if (bt.this.L != null && bt.this.L.getVideoControl() != null && bt.this.L.getVideoControl().timerStatus == 0) {
                } else {
                    if (b.aX(bt.this.L)) {
                        new com.bytedance.tux.g.b(view).e(R.string.alc).b();
                    } else if (bt.this.L == null || !bt.this.L.isProhibited()) {
                        bt btVar = bt.this;
                        if ((btVar.L != null && btVar.L.getStatus() != null && btVar.L.getStatus().isAllowComment()) || b.U(bt.this.L)) {
                            bt.this.Q.a("video_comment_list", (Object) 7);
                        } else if (!b.U(bt.this.L)) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.a9_).a();
                        }
                        if ("homepage_hot".equals(bt.this.M) && b.s(bt.this.L)) {
                            com.ss.android.ugc.aweme.commercialize.g.a().e(bt.this.R, bt.this.L);
                        }
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.alc).a();
                    }
                }
            } else if (bt.this.L.isImage()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.cjs).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(bt.this.R).a(R.string.har).a();
            }
        }
    }

    public bt(View view) {
        super(view);
        EventBus.a(EventBus.a(), this);
    }

    private static String a(long j2) {
        if (j2 <= 0) {
            return "0";
        }
        return com.ss.android.ugc.aweme.i18n.b.a(j2);
    }

    private static long b(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            return 0;
        }
        return statistics.getCommentCount() + 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar != null) {
            p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new bu(this, bVar.f67014a, bVar, VideoGiftService.l())));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean d(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        View view;
        if (!bVar.f67014a.equals("video_open_comment_dialog")) {
            return false;
        }
        if (this.L == null || this.T == null || (view = this.f94416d) == null) {
            return true;
        }
        view.callOnClick();
        return true;
    }

    @org.greenrobot.eventbus.r
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        Object[] objArr;
        int i2 = cVar.f71746a;
        if ((i2 == 3 || i2 == 4 || i2 == 8) && (objArr = (Object[]) cVar.f71747b) != null && objArr.length == 2) {
            c((Map<String, Object>) null);
        }
    }

    @org.greenrobot.eventbus.r
    public void onVideoEvent(ag agVar) {
        if (agVar != null && 14 == agVar.f93450a) {
            if (com.bytedance.common.utility.m.a(this.L.getAid(), (String) agVar.f93451b)) {
                c((Map<String, Object>) null);
            }
        }
    }

    private static long a(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            return 0;
        }
        long commentCount = statistics.getCommentCount();
        s adCommentStruct = aweme.getAdCommentStruct();
        if (adCommentStruct == null) {
            return commentCount;
        }
        if (commentCount > 0 || adCommentStruct.showAsDefault()) {
            return commentCount + 1;
        }
        return commentCount;
    }

    private void c(Aweme aweme) {
        int i2;
        if (aweme != null) {
            if (aweme.isAd() || !b.T(aweme)) {
                TextView textView = this.f94413a;
                if (aweme.isCmtSwt() || b.U(aweme)) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                textView.setVisibility(i2);
            }
            if (aweme.isDelete()) {
                this.f94413a.setVisibility(4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!bVar.f67014a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
        hashMap.put("aweme_state", this.L);
        hashMap.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
        return bVar2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("show_festival_activity_icon", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_open_comment_dialog", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("on_viewpager_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("action_video_on_play_progress_change", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(7462);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(7462);
            return;
        }
        HashMap hashMap = (HashMap) bVar.a();
        if (hashMap.get("aweme_state") == null) {
            MethodCollector.o(7462);
            return;
        }
        a(hashMap);
        c(hashMap);
        b().c();
        MethodCollector.o(7462);
    }

    private void c(Map<String, Object> map) {
        Aweme aweme;
        long j2;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.L;
        }
        if (aweme == null || !aweme.isDelete()) {
            this.f94413a.setVisibility(0);
            this.f94414b.setVisibility(0);
            String aid = this.L.getAid();
            if (aid == null || !be.c(aid)) {
                this.f94417e.setVisibility(8);
            } else {
                this.f94417e.setVisibility(0);
            }
            c(aweme);
            long j3 = 0;
            if (CommentServiceImpl.e().c(aweme) || com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                j2 = 0;
            } else {
                j2 = a(aweme);
            }
            if (CommentServiceImpl.e().a(aweme) != null) {
                j2 = b(aweme);
            }
            if (j2 >= 0) {
                j3 = j2;
            }
            try {
                this.f94413a.setText(a(j3));
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                this.f94413a.setText("0");
            }
        } else {
            this.f94413a.setVisibility(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.T = com.a.b.c.a((Activity) this.R, (int) R.layout.sz);
        View findViewById = this.T.findViewById(R.id.aao);
        this.f94416d = findViewById;
        if (findViewById == null) {
            this.T = e.a(getClass().getName(), this.T, this.R, R.layout.sz);
            this.f94416d = this.T.findViewById(R.id.aao);
        }
        this.f94413a = (TextView) this.T.findViewById(R.id.a_2);
        this.f94414b = this.T.findViewById(R.id.a_0);
        this.f94415c = (ImageView) this.T.findViewById(R.id.a_h);
        this.f94416d.setOnClickListener(new a());
        this.f94413a.setOnClickListener(new a());
        this.f94414b.setOnClickListener(new a());
        this.f94414b.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.6f));
        if (k.a()) {
            com.ss.android.ugc.aweme.common.f.d.a(this.f94413a, 14);
        }
        this.f94417e = (ImageView) this.T.findViewById(R.id.a_f);
        c b2 = b();
        b2.f78251a = this.S;
        b2.f78252b = this.f94414b;
        b2.f78253c = this.f94415c;
        b2.f78254d = this.f94413a;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(Map<String, Object> map) {
        if (map != null) {
            if (!((Boolean) map.get("isInActivityState")).booleanValue()) {
                return;
            }
        } else if (!com.ss.android.ugc.aweme.aq.a.a.a()) {
            return;
        }
        this.f94415c.setImageDrawable(androidx.core.content.b.a(this.R, 2131233108));
    }
}
