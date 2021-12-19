package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.ao;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class dz extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public ao f94664a;

    /* renamed from: b  reason: collision with root package name */
    public final m f94665b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, String> f94666c;

    /* renamed from: d  reason: collision with root package name */
    private VideoTitleFollowBtn f94667d;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnTouchListener f94668e;

    static {
        Covode.recordClassIndex(60075);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(66, new g(dz.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void f() {
        super.f();
        m mVar = this.f94665b;
        if (mVar != null) {
            com.ss.android.ugc.aweme.base.utils.m.a(new b(mVar, this));
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dz f94669a;

        static {
            Covode.recordClassIndex(60076);
        }

        a(dz dzVar) {
            this.f94669a = dzVar;
        }

        public final void run() {
            ao aoVar = this.f94669a.f94664a;
            if (aoVar != null) {
                DataCenter dataCenter = this.f94669a.Q;
                GenericWidget genericWidget = this.f94669a.J;
                l.b(genericWidget, "");
                aoVar.a(dataCenter, genericWidget);
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f94670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dz f94671b;

        static {
            Covode.recordClassIndex(60077);
        }

        b(m mVar, dz dzVar) {
            this.f94670a = mVar;
            this.f94671b = dzVar;
        }

        public final void run() {
            CommentService e2 = CommentServiceImpl.e();
            androidx.lifecycle.i lifecycle = this.f94670a.getLifecycle();
            l.b(lifecycle, "");
            LiveData<Aweme> a2 = e2.a(lifecycle);
            if (a2 != null) {
                a2.observe(this.f94670a, new u(this) {
                    /* class com.ss.android.ugc.aweme.feed.ui.dz.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f94672a;

                    static {
                        Covode.recordClassIndex(60078);
                    }

                    {
                        this.f94672a = r1;
                    }

                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = this.f94672a.f94671b.L;
                            String str = null;
                            if (aweme2 != null) {
                                str = aweme2.getAid();
                            }
                            if (l.a((Object) aid, (Object) str)) {
                                this.f94672a.f94671b.Q.a("social_video_tag_info", aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        ao aoVar = this.f94664a;
        if (aoVar != null) {
            aoVar.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!TextUtils.equals(bVar.f67014a, "video_params")) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("aweme_state", this.L);
        ao aoVar = this.f94664a;
        if (aoVar != null) {
            aoVar.a((VideoItemParams) bVar.a(), hashMap);
        }
        return new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        Context context = this.R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.T = c.a((Activity) context, (int) R.layout.t9);
        this.f94667d = (VideoTitleFollowBtn) this.T.findViewById(R.id.yf);
        this.f94664a = new ao(this.T, this.f94668e, this.R, this.f94666c);
        p.f93149a.a(new r(false, new a(this)));
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(7811);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T, new FrameLayout.LayoutParams(-2, -2));
            }
        }
        if (bVar == null) {
            MethodCollector.o(7811);
            return;
        }
        ao aoVar = this.f94664a;
        if (aoVar != null) {
            Object a2 = bVar.a();
            l.b(a2, "");
            aoVar.a((HashMap) a2);
            MethodCollector.o(7811);
            return;
        }
        MethodCollector.o(7811);
    }

    @org.greenrobot.eventbus.r
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        ao aoVar;
        l.d(followStatusEvent, "");
        FollowStatus followStatus = followStatusEvent.status;
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(ac.a(this.L), followStatus.userId) && (aoVar = this.f94664a) != null) {
            l.d(followStatus, "");
            if (bm.c(aoVar.r)) {
                ao.e eVar = new ao.e(aoVar, followStatus);
                if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                    eVar.run();
                } else if (aoVar.f94238b == null || aoVar.p == null) {
                    com.ss.android.ugc.aweme.framework.a.a.a(3, null, "onFollowEvent mFollowUserBtn is null!");
                } else {
                    View view = aoVar.f94238b;
                    if (view != null) {
                        view.post(eVar);
                    }
                }
            }
        }
    }

    public dz(View view, View.OnTouchListener onTouchListener, m mVar, HashMap<String, String> hashMap) {
        super(view);
        this.f94668e = onTouchListener;
        this.f94665b = mVar;
        this.f94666c = hashMap;
    }
}
