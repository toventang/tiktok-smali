package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public abstract class a extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: a  reason: collision with root package name */
    public View f94205a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f94206b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f94207c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f94208d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f94209e;

    /* renamed from: f  reason: collision with root package name */
    private View f94210f;

    static {
        Covode.recordClassIndex(59854);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    public abstract void a(Aweme aweme);

    public abstract int b();

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f94213b;

        static {
            Covode.recordClassIndex(59856);
        }

        b(a aVar, Aweme aweme) {
            this.f94212a = aVar;
            this.f94213b = aweme;
        }

        public final void run() {
            this.f94212a.a(this.f94213b);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void i() {
        Aweme aweme = this.L;
        if (aweme != null) {
            p.f93149a.a(new r(false, new b(this, aweme)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$a  reason: collision with other inner class name */
    static final class RunnableC2279a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f94211a;

        static {
            Covode.recordClassIndex(59855);
        }

        RunnableC2279a(a aVar) {
            this.f94211a = aVar;
        }

        public final void run() {
            a aVar = this.f94211a;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aVar.L)) {
                e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                if (a2 != null) {
                    a2.c();
                }
            } else {
                v.O().B();
            }
            Aweme aweme = aVar.L;
            l.b(aweme, "");
            String aid = aweme.getAid();
            l.b(aid, "");
            c.a(new ah(true, aid));
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Aweme aweme = this.L;
        l.b(aweme, "");
        if (!aweme.isAd()) {
            i O = v.O();
            Aweme aweme2 = this.L;
            l.b(aweme2, "");
            Video video = aweme2.getVideo();
            Aweme aweme3 = this.L;
            l.b(aweme3, "");
            O.a(video, aweme3.getAudio(), false, true);
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(this.L)) {
            e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
            if (a2 != null) {
                a2.b();
            }
        } else {
            v.O().y();
        }
        Aweme aweme4 = this.L;
        l.b(aweme4, "");
        String aid = aweme4.getAid();
        l.b(aid, "");
        c.a(new ah(false, aid));
    }

    public a(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public void a(DataCenter dataCenter) {
        DataCenter dataCenter2 = this.Q;
        if (dataCenter2 != null) {
            dataCenter2.a("startPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        if (!this.K) {
            View view = this.f94210f;
            if (view instanceof FrameLayout) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) view).addView(this.f94205a);
                View view2 = this.f94205a;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.K = true;
            }
        }
        if (bVar != null && (videoItemParams = (VideoItemParams) bVar.a()) != null && (aweme = videoItemParams.mAweme) != null) {
            a(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        View view;
        if (bVar != null) {
            str = bVar.f67014a;
        } else {
            str = null;
        }
        if (l.a((Object) "startPlayAnimation", (Object) str) && y.f(this.L) && (view = this.f94205a) != null && view.getVisibility() == 0) {
            p.f93149a.a(new r(false, new RunnableC2279a(this)));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public void a(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        this.f94210f = view;
        View a2 = com.a.b.c.a((Activity) this.R, b());
        this.f94205a = a2;
        ImageView imageView = null;
        if (a2 != null) {
            textView = (TextView) a2.findViewById(R.id.title);
        } else {
            textView = null;
        }
        this.f94206b = textView;
        View view2 = this.f94205a;
        if (view2 != null) {
            textView2 = (TextView) view2.findViewById(R.id.button);
        } else {
            textView2 = null;
        }
        this.f94207c = textView2;
        View view3 = this.f94205a;
        if (view3 != null) {
            textView3 = (TextView) view3.findViewById(R.id.adh);
        } else {
            textView3 = null;
        }
        this.f94208d = textView3;
        View view4 = this.f94205a;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.bi7);
        }
        this.f94209e = imageView;
    }
}
