package com.ss.android.ugc.aweme.music.ui.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ay.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.a.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MusicDetailVideoItemViewHolder extends JediSimpleViewHolder<Aweme> implements g, g {
    public static final a n = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final Context f112039f;

    /* renamed from: g  reason: collision with root package name */
    public Aweme f112040g;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.lighten.a.c.a f112041j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f112042k;

    /* renamed from: l  reason: collision with root package name */
    public final d f112043l;

    /* renamed from: m  reason: collision with root package name */
    public final String f112044m;
    private boolean o;
    private final RemoteImageView p;
    private final TextView q;
    private final TextView r;
    private final TextView s;
    private final TextView t;
    private final View u;
    private final SmartImageView v;
    private final float w;
    private boolean x;

    static {
        Covode.recordClassIndex(72003);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72004);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final boolean aZ_() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        m();
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void ak_() {
        this.v.c();
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void am_() {
        this.v.b();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        this.x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void f() {
        super.f();
        this.x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
        this.x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void h() {
        super.h();
        this.x = false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void i() {
        super.i();
        this.x = false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void j() {
        super.j();
        this.x = false;
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void aq_() {
        super.aq_();
        if (this.f112040g != null) {
            getAdapterPosition();
        }
    }

    private static boolean p() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean o2 = o();
        j.f107226e = o2;
        return o2;
    }

    private static boolean q() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return com.ss.android.ugc.aweme.base.h.a.a("aweme_app", "use_dynamic_cover", z);
    }

    private final void m() {
        Aweme aweme = this.f112040g;
        if (aweme != null) {
            Video video = aweme.getVideo();
            l.b(video, "");
            if (a(video, "MusicDetailVideoItemViewHolder")) {
                this.o = true;
            } else {
                a(video.getCover(), "MusicDetailVideoItemViewHolder");
            }
        }
    }

    private boolean n() {
        if (com.ss.android.ugc.aweme.performance.i.a()) {
            return false;
        }
        View view = this.itemView;
        l.b(view, "");
        view.getContext();
        if (p()) {
            View view2 = this.itemView;
            l.b(view2, "");
            if (!com.ss.android.ugc.aweme.framework.c.a.a(view2.getContext())) {
                return false;
            }
        }
        if (q()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void al_() {
        if (this.v.getController() != null) {
            com.facebook.drawee.h.a controller = this.v.getController();
            if (controller == null) {
                l.b();
            }
            l.b(controller, "");
            if (controller.i() != null) {
                com.facebook.drawee.h.a controller2 = this.v.getController();
                if (controller2 == null) {
                    l.b();
                }
                l.b(controller2, "");
                Animatable i2 = controller2.i();
                if (i2 instanceof com.facebook.f.a.a) {
                    ((com.facebook.f.a.a) i2).a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void a(boolean z) {
        this.v.setUserVisibleHint(z);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void b(boolean z) {
        this.v.setAttached(z);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicDetailVideoItemViewHolder f112045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f112046b;

        static {
            Covode.recordClassIndex(72005);
        }

        b(MusicDetailVideoItemViewHolder musicDetailVideoItemViewHolder, Aweme aweme) {
            this.f112045a = musicDetailVideoItemViewHolder;
            this.f112046b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f112046b.getStatus() == null || !this.f112046b.getStatus().isDelete()) {
                this.f112045a.f112043l.a(view, this.f112045a.f112040g, this.f112045a.f112044m);
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f112045a.f112039f).a(R.string.h_6).a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        l.d(aweme2, "");
        this.v.setOnClickListener(new b(this, aweme2));
        this.v.setAnimationListener(this.f112041j);
        this.v.setUserVisibleHint(false);
        SmartImageView smartImageView = this.v;
        getPosition();
        smartImageView.setContentDescription("");
        this.f112040g = aweme2;
        if (this.f112042k) {
            m();
        }
        this.p.setVisibility(4);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        a(this.u, aweme2);
        this.t.setVisibility(8);
        a(this.t, aweme2);
        if (aweme2.getMusicStarter() != null) {
            this.s.setVisibility(0);
            if (!TextUtils.isEmpty(aweme2.getLabelMusicStarterText())) {
                this.s.setText(aweme2.getLabelMusicStarterText());
            }
        }
        if (aweme2.isPgcShow() && aweme2.getTextTopLabels() != null && aweme2.getTextTopLabels().size() > 0) {
            this.q.setVisibility(0);
            this.p.setVisibility(8);
            TextView textView = this.q;
            AwemeTextLabelModel awemeTextLabelModel = aweme2.getTextTopLabels().get(0);
            l.b(awemeTextLabelModel, "");
            AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
            if (TextUtils.isEmpty(awemeTextLabelModel2.getLabelName())) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(awemeTextLabelModel2.getLabelName());
            textView.setTextSize(0, this.w);
            textView.setTextColor(Color.parseColor(awemeTextLabelModel2.getTextColor()));
            textView.setBackground(o.a(Color.parseColor(awemeTextLabelModel2.getBgColor()), (float) n.a(2.0d)));
            textView.setSingleLine();
        }
    }

    private static void a(View view, Aweme aweme) {
        if (y.f(aweme)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private final void a(UrlModel urlModel, String str) {
        Video video;
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        int[] a3 = em.a(200);
        if (a3 != null) {
            a2.b(a3);
        }
        a2.E = this.v;
        a2.a(str).c();
        Aweme aweme = this.f112040g;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            video.setCachedOuterCoverUrl(urlModel);
            video.setCachedOuterCoverSize(a3);
        }
    }

    private final boolean a(Video video, String str) {
        if (!n()) {
            return false;
        }
        c cVar = c.f67775a;
        SmartImageView smartImageView = this.v;
        if (video == null) {
            l.b();
        }
        if (c.a(cVar, smartImageView, video, str, true, false, 96)) {
            return true;
        }
        return false;
    }
}
