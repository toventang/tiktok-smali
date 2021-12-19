package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.h;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class ds extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f94614a = ((int) n.b(h.f39857a, 10.0f));

    /* renamed from: b  reason: collision with root package name */
    public static final a f94615b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final View f94616c;

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        l.d(dataCenter, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60055);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60054);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ds f94617a;

        static {
            Covode.recordClassIndex(60056);
        }

        b(ds dsVar) {
            this.f94617a = dsVar;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f94617a.T.getHitRect(rect);
            rect.top -= ds.f94614a;
            rect.left -= ds.f94614a;
            rect.bottom += ds.f94614a;
            rect.right += ds.f94614a;
            View view = this.f94617a.S;
            l.b(view, "");
            view.setTouchDelegate(new TouchDelegate(rect, this.f94617a.T));
        }
    }

    public final void b() {
        String uid;
        if (y.f124429b && k.c()) {
            Aweme aweme = this.L;
            l.b(aweme, "");
            y.c(aweme);
        }
        if (this.M == null) {
            this.M = "";
        }
        f f2 = new f().a("homepage_hot").g(this.L);
        f2.p = (String) this.Q.b("playlist_id", "");
        f2.f109572e = (String) this.Q.b("playlist_id_key", "");
        f2.f109571d = (String) this.Q.b("playlist_type", "");
        f fVar = (f) f2.c((String) this.Q.b("tab_name", "")).d(ac.b(this.L, this.P));
        Aweme aweme2 = this.L;
        l.b(aweme2, "");
        if (aweme2.getAuthor() == null) {
            uid = "";
        } else {
            Aweme aweme3 = this.L;
            if (aweme3 == null) {
                l.b();
            }
            User author = aweme3.getAuthor();
            if (author == null) {
                l.b();
            }
            uid = author.getUid();
        }
        fVar.f109569b = uid;
        Aweme aweme4 = this.L;
        l.b(aweme4, "");
        fVar.V = com.ss.android.ugc.aweme.story.b.h.a(aweme4.getAuthor());
        fVar.u = Boolean.valueOf(com.ss.android.ugc.aweme.story.d.a.g(this.L));
        fVar.f109570c = this.P;
        Aweme aweme5 = this.L;
        l.b(aweme5, "");
        fVar.v = com.ss.android.ugc.aweme.story.d.a.b(aweme5);
        f fVar2 = (f) com.ss.android.ugc.aweme.upvote.event.c.a(fVar, this.L, "homepage_hot");
        String str = this.M;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1271119582) {
                if (hashCode == 1691937916 && str.equals("homepage_hot")) {
                    fVar2.a("homepage_hot");
                    fVar2.f();
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                }
            } else if (str.equals("homepage_follow")) {
                fVar2.a("homepage_follow");
                fVar2.f();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
            }
        }
        if (this.W == 2) {
            fVar2.a(this.M);
        }
        fVar2.f();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ds(View view) {
        super(view);
        l.d(view, "");
        this.f94616c = view;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ds f94618a;

        static {
            Covode.recordClassIndex(60057);
        }

        c(ds dsVar) {
            this.f94618a = dsVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200)) {
                this.f94618a.Q.a("video_more_click", (Object) null);
                this.f94618a.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        l.d(view, "");
        Context context = this.R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.T = com.a.b.c.a((Activity) context, (int) R.layout.t5);
        this.T.setOnClickListener(new c(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(8242);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
            this.S.post(new b(this));
            if (!k.c()) {
                View view = this.S;
                l.b(view, "");
                view.setVisibility(8);
            }
        }
        if (bVar == null) {
            MethodCollector.o(8242);
        } else {
            MethodCollector.o(8242);
        }
    }
}
