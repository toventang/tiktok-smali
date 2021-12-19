package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
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
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.HashMap;
import java.util.Set;

public final class ev extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: a  reason: collision with root package name */
    public an f94743a;

    /* renamed from: b  reason: collision with root package name */
    public final m f94744b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, String> f94745c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f94746d = true;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnTouchListener f94747e;

    static {
        Covode.recordClassIndex(60115);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void f() {
        super.f();
        m mVar = this.f94744b;
        if (mVar != null) {
            com.ss.android.ugc.aweme.base.utils.m.a(new b(mVar, this));
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ev f94748a;

        static {
            Covode.recordClassIndex(60116);
        }

        a(ev evVar) {
            this.f94748a = evVar;
        }

        public final void run() {
            an anVar = this.f94748a.f94743a;
            if (anVar != null) {
                DataCenter dataCenter = this.f94748a.Q;
                GenericWidget genericWidget = this.f94748a.J;
                l.b(genericWidget, "");
                anVar.a(dataCenter, genericWidget);
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f94749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ev f94750b;

        static {
            Covode.recordClassIndex(60117);
        }

        b(m mVar, ev evVar) {
            this.f94749a = mVar;
            this.f94750b = evVar;
        }

        public final void run() {
            CommentService e2 = CommentServiceImpl.e();
            i lifecycle = this.f94749a.getLifecycle();
            l.b(lifecycle, "");
            LiveData<Aweme> a2 = e2.a(lifecycle);
            if (a2 != null) {
                a2.observe(this.f94749a, new u(this) {
                    /* class com.ss.android.ugc.aweme.feed.ui.ev.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f94751a;

                    static {
                        Covode.recordClassIndex(60118);
                    }

                    {
                        this.f94751a = r1;
                    }

                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(Object obj) {
                        Aweme aweme = (Aweme) obj;
                        if (aweme != null) {
                            String aid = aweme.getAid();
                            Aweme aweme2 = this.f94751a.f94750b.L;
                            String str = null;
                            if (aweme2 != null) {
                                str = aweme2.getAid();
                            }
                            if (l.a((Object) aid, (Object) str)) {
                                this.f94751a.f94750b.Q.a("social_video_tag_info", aweme);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void i() {
        an anVar;
        super.i();
        an anVar2 = this.f94743a;
        if (anVar2 != null) {
            anVar2.f94246j = this.L;
        }
        an anVar3 = this.f94743a;
        if (anVar3 != null) {
            anVar3.f94247k = this.f94746d;
        }
        an anVar4 = this.f94743a;
        if (anVar4 != null) {
            anVar4.f94248l = false;
        }
        HashMap<String, String> hashMap = this.f94745c;
        if (hashMap != null) {
            Set<String> keySet = hashMap.keySet();
            l.b(keySet, "");
            Aweme aweme = this.L;
            String str = null;
            if (aweme != null) {
                str = aweme.getAid();
            }
            if (n.a((Iterable) keySet, (Object) str) && (anVar = this.f94743a) != null) {
                anVar.a(this.L);
            }
        }
        if (this.f94746d) {
            this.f94746d = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        an anVar = this.f94743a;
        if (anVar != null) {
            anVar.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.T = c.a((Activity) this.R, (int) R.layout.t7);
        View view2 = this.T;
        View.OnTouchListener onTouchListener = this.f94747e;
        Context context = this.R;
        l.b(context, "");
        this.f94743a = new an(view2, onTouchListener, context, this.f94745c);
        p.f93149a.a(new r(false, new a(this)));
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
        an anVar = this.f94743a;
        if (anVar != null) {
            anVar.a((VideoItemParams) bVar.a(), hashMap);
        }
        return new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(7299);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T, new FrameLayout.LayoutParams(-2, -2));
            }
        }
        if (bVar == null) {
            MethodCollector.o(7299);
            return;
        }
        an anVar = this.f94743a;
        if (anVar != null) {
            Object a2 = bVar.a();
            l.b(a2, "");
            anVar.a((HashMap) a2);
            MethodCollector.o(7299);
            return;
        }
        MethodCollector.o(7299);
    }

    public ev(View view, View.OnTouchListener onTouchListener, m mVar, HashMap<String, String> hashMap) {
        super(view);
        this.f94747e = onTouchListener;
        this.f94744b = mVar;
        this.f94745c = hashMap;
    }
}
