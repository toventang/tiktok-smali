package com.ss.android.ugc.aweme.commercialize.profile;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.a.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder implements g {

    /* renamed from: a  reason: collision with root package name */
    final SmartImageView f75145a;

    /* renamed from: b  reason: collision with root package name */
    final TuxTextView f75146b;

    /* renamed from: c  reason: collision with root package name */
    final SmartAvatarImageView f75147c;

    /* renamed from: d  reason: collision with root package name */
    final TuxTextView f75148d;

    /* renamed from: e  reason: collision with root package name */
    final TuxTextView f75149e;

    /* renamed from: f  reason: collision with root package name */
    final RelativeLayout f75150f;

    /* renamed from: g  reason: collision with root package name */
    Aweme f75151g;

    /* renamed from: h  reason: collision with root package name */
    public final d f75152h;

    static {
        Covode.recordClassIndex(46353);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final boolean aZ_() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void ak_() {
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void al_() {
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void am_() {
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        UrlModel urlModel;
        Video video;
        Aweme aweme = this.f75151g;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            urlModel = null;
        } else {
            urlModel = video.getCover();
        }
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        l.b(a2, "");
        int[] a3 = em.a(201);
        if (a3 != null) {
            a2.b(a3);
        }
        a2.E = this.f75145a;
        a2.c();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75153a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75154b;

        static {
            Covode.recordClassIndex(46354);
        }

        a(c cVar, Aweme aweme) {
            this.f75153a = cVar;
            this.f75154b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75153a.f75152h.a(view, this.f75154b, "just_watched_cover");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f75156b;

        static {
            Covode.recordClassIndex(46355);
        }

        b(c cVar, Aweme aweme) {
            this.f75155a = cVar;
            this.f75156b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75155a.f75152h.a(view, this.f75156b, "normal_cover");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, d dVar) {
        super(view);
        l.d(view, "");
        l.d(dVar, "");
        this.f75152h = dVar;
        View findViewById = view.findViewById(R.id.azk);
        l.b(findViewById, "");
        this.f75145a = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.azh);
        l.b(findViewById2, "");
        this.f75146b = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.azm);
        l.b(findViewById3, "");
        this.f75147c = (SmartAvatarImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.azo);
        l.b(findViewById4, "");
        this.f75148d = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.azn);
        l.b(findViewById5, "");
        this.f75149e = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.azq);
        l.b(findViewById6, "");
        this.f75150f = (RelativeLayout) findViewById6;
    }
}
