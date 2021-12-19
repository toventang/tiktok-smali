package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.feed.ui.x;
import com.ss.android.ugc.aweme.feed.x.ag;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.k;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class dr extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a implements i, j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f94610b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public x f94611a;

    static {
        Covode.recordClassIndex(60050);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(66, new g(dr.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60051);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dr f94613a;

        static {
            Covode.recordClassIndex(60053);
        }

        c(dr drVar) {
            this.f94613a = drVar;
        }

        public final void run() {
            DataCenter dataCenter;
            x xVar = this.f94613a.f94611a;
            if (xVar != null && (dataCenter = this.f94613a.Q) != null) {
                xVar.f95129d = dataCenter;
            }
        }
    }

    public dr(View view) {
        super(view, ((Boolean) bv.f89646d.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        return com.ss.android.ugc.aweme.feed.x.g.a(bVar, b.f94612a);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        this.Q.a("follow_button_interaction", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("show_expose_sharer_info_view", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("follow_success", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        Context context = this.R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.T = com.a.b.c.a((Activity) context, (int) R.layout.t4);
        this.f94611a = new x(this.T, this.R);
        p.f93149a.a(new r(false, new c(this)));
        EventBus.a(EventBus.a(), this);
    }

    static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f94612a = new b();

        static {
            Covode.recordClassIndex(60052);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            AwemeRelationRecommendModel relationRecommendInfo;
            User author;
            List<AwemeHybridLabelModel> hybridLabels;
            Aweme aweme = (Aweme) obj;
            l.d(aweme, "");
            if (hh.b() || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((aweme.getMutualRelation() == null && ((hybridLabels = aweme.getHybridLabels()) == null || hybridLabels.size() <= 0)) || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0 || ag.d(aweme))) {
                return false;
            }
            return true;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        x xVar;
        l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (TextUtils.equals(ac.a(this.L), followStatus.userId) && (xVar = this.f94611a) != null && xVar.f95127b != null && xVar.f95128c != null && xVar.f95126a != null) {
            if (followStatus.followFrom != 13) {
                xVar.b();
            }
            x.d dVar = new x.d(xVar, followStatus);
            if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                dVar.run();
                return;
            }
            View view = xVar.f95126a;
            if (view != null) {
                view.post(dVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        x xVar;
        x xVar2;
        super.c(bVar);
        if (bVar != null && (str = bVar.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 827882451) {
                if (hashCode == 1245120163 && str.equals("show_expose_sharer_info_view") && (xVar2 = this.f94611a) != null) {
                    xVar2.b();
                }
            } else if (!str.equals("follow_button_interaction")) {
            } else {
                if (bVar.a() instanceof k.b) {
                    x xVar3 = this.f94611a;
                    if (xVar3 != null) {
                        Object a2 = bVar.a();
                        l.b(a2, "");
                        k.b bVar2 = (k.b) a2;
                        l.d(bVar2, "");
                        if (xVar3.f95130e != null && xVar3.f95127b != null && hh.a() == 3 && !ag.a(xVar3.f95130e)) {
                            if (xVar3.f95131f) {
                                xVar3.f95131f = false;
                                return;
                            }
                            p.f93149a.a(new r(false, new x.e(xVar3)));
                            String e2 = ag.e(xVar3.f95130e);
                            if (e2 != null) {
                                ag.f95301a.put(e2, true);
                            }
                            Aweme aweme = xVar3.f95130e;
                            l.d(bVar2, "");
                            String e3 = ag.e(aweme);
                            if (e3 != null) {
                                ag.f95302b.put(e3, bVar2);
                            }
                            y.a(xVar3.f95130e, k.a.SHOW, bVar2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Integer num = (Integer) bVar.a();
                if (num != null && num.intValue() == 0 && (xVar = this.f94611a) != null) {
                    xVar.f95131f = true;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        User user;
        Aweme aweme;
        Aweme aweme2;
        AwemeRelationRecommendModel relationRecommendInfo;
        Aweme aweme3;
        Aweme aweme4;
        List<AwemeHybridLabelModel> hybridLabels;
        User user2 = null;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!TextUtils.equals(bVar.f67014a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aweme_state", this.L);
        Aweme aweme5 = this.L;
        if (aweme5 != null) {
            user = aweme5.getAuthor();
        } else {
            user = null;
        }
        hashMap.put("author_state", user);
        x xVar = this.f94611a;
        if (xVar != null) {
            VideoItemParams videoItemParams = (VideoItemParams) bVar.a();
            l.d(hashMap, "");
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            xVar.f95130e = aweme;
            Aweme aweme6 = xVar.f95130e;
            if (aweme6 != null) {
                user2 = aweme6.getAuthor();
            }
            boolean z = false;
            if (!(hh.b() || (aweme2 = xVar.f95130e) == null || (relationRecommendInfo = aweme2.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((((aweme3 = xVar.f95130e) == null || aweme3.getMutualRelation() == null) && ((aweme4 = xVar.f95130e) == null || (hybridLabels = aweme4.getHybridLabels()) == null || hybridLabels.size() <= 0)) || user2 == null || user2.getFollowStatus() != 0 || ag.d(xVar.f95130e)))) {
                z = true;
            }
            hashMap.put("need show follow button", Boolean.valueOf(z));
        }
        return new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        int i2;
        float f2;
        MethodCollector.i(8550);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(8550);
            return;
        }
        x xVar = this.f94611a;
        if (xVar != null) {
            Object a2 = bVar.a();
            l.b(a2, "");
            HashMap hashMap = (HashMap) a2;
            l.d(hashMap, "");
            if (xVar.f95130e != null) {
                Object obj = hashMap.get("need show follow button");
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    MethodCollector.o(8550);
                    throw nullPointerException;
                } else if (((Boolean) obj).booleanValue()) {
                    User user = (User) hashMap.get("author_state");
                    if (user == null) {
                        MethodCollector.o(8550);
                        return;
                    }
                    if (ag.a(xVar.f95130e)) {
                        i2 = 8;
                        f2 = 270.0f;
                    } else {
                        i2 = 0;
                        f2 = 131.0f;
                    }
                    NewFollowButton newFollowButton = xVar.f95127b;
                    if (newFollowButton != null) {
                        ViewGroup.LayoutParams layoutParams = newFollowButton.getLayoutParams();
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        l.a((Object) system2, "");
                        layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
                        newFollowButton.setLayoutParams(layoutParams);
                        newFollowButton.setAlpha(1.0f);
                        newFollowButton.setVisibility(0);
                        newFollowButton.a(user.getFollowStatus(), user.getFollowerStatus());
                    }
                    TuxButton tuxButton = xVar.f95128c;
                    if (tuxButton != null) {
                        ViewGroup.LayoutParams layoutParams2 = tuxButton.getLayoutParams();
                        Resources system3 = Resources.getSystem();
                        l.a((Object) system3, "");
                        layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
                        Resources system4 = Resources.getSystem();
                        l.a((Object) system4, "");
                        layoutParams2.width = h.g.a.a(TypedValue.applyDimension(1, 131.0f, system4.getDisplayMetrics()));
                        tuxButton.setLayoutParams(layoutParams2);
                        tuxButton.setAlpha(1.0f);
                        tuxButton.setVisibility(i2);
                        tuxButton.a(true);
                        tuxButton.setText(tuxButton.getResources().getText(R.string.dhi));
                    }
                    View view = xVar.f95126a;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                        Resources system5 = Resources.getSystem();
                        l.a((Object) system5, "");
                        layoutParams3.height = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system5.getDisplayMetrics()));
                        Resources system6 = Resources.getSystem();
                        l.a((Object) system6, "");
                        layoutParams3.width = h.g.a.a(TypedValue.applyDimension(1, 270.0f, system6.getDisplayMetrics()));
                        view.setLayoutParams(layoutParams3);
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        MethodCollector.o(8550);
                        return;
                    }
                    MethodCollector.o(8550);
                    return;
                } else {
                    xVar.b();
                }
            }
            MethodCollector.o(8550);
            return;
        }
        MethodCollector.o(8550);
    }
}
