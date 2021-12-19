package com.ss.android.ugc.aweme.autoplay.d.a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autoplay.d.k;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.discover.alading.a.c;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.playerkit.videoview.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends k implements View.OnAttachStateChangeListener {
    static final float y = 1.7777778f;
    public static final a z = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f67342a;

    /* renamed from: b  reason: collision with root package name */
    public c f67343b;

    /* renamed from: c  reason: collision with root package name */
    public AwemeRawAd f67344c;

    /* renamed from: d  reason: collision with root package name */
    final SearchVideoView f67345d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearGradientDraweeView f67346e;

    /* renamed from: f  reason: collision with root package name */
    final TuxTextView f67347f;

    /* renamed from: g  reason: collision with root package name */
    final TuxTextView f67348g;

    /* renamed from: l  reason: collision with root package name */
    final SmartCircleImageView f67349l;

    /* renamed from: m  reason: collision with root package name */
    final TuxTextView f67350m;
    final View n;
    public final LinearGradientDraweeView o;
    final ConstraintLayout p;
    public boolean q;
    final b r = new b(this);
    int s;
    int t;
    boolean u;
    boolean v;
    public final View w;
    final com.ss.android.ugc.aweme.autoplay.player.video.f x;

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41479);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.k
    public final /* bridge */ /* synthetic */ ImageView j() {
        return this.f67346e;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.k
    public final SearchVideoView l() {
        return this.f67345d;
    }

    static {
        Covode.recordClassIndex(41477);
    }

    public static final class b implements SearchVideoView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67352a;

        static {
            Covode.recordClassIndex(41480);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f67352a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView.b
        public final void a(j jVar) {
            l.d(jVar, "");
            if (jVar.f128596c == 0) {
                this.f67352a.q = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, g gVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar, View view2, com.ss.android.ugc.aweme.autoplay.player.video.f fVar) {
        super(view, aVar, gVar, bVar);
        SearchPlayerCore core;
        i surfaceHolder;
        l.d(view, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        l.d(view2, "");
        l.d(fVar, "");
        this.w = view2;
        this.x = fVar;
        SearchVideoView searchVideoView = (SearchVideoView) view.findViewById(R.id.fhs);
        l.b(searchVideoView, "");
        this.f67345d = searchVideoView;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.agf);
        l.b(linearGradientDraweeView, "");
        this.f67346e = linearGradientDraweeView;
        this.f67347f = (TuxTextView) view.findViewById(R.id.ddg);
        this.f67348g = (TuxTextView) view.findViewById(R.id.c_s);
        this.f67349l = (SmartCircleImageView) view.findViewById(R.id.nu);
        this.f67350m = (TuxTextView) view.findViewById(R.id.nw);
        this.n = view.findViewById(R.id.bh2);
        this.o = (LinearGradientDraweeView) view.findViewById(R.id.bh3);
        this.p = (ConstraintLayout) view.findViewById(R.id.ve);
        this.s = n.a(view.getContext());
        this.t = n.b(view.getContext());
        a(new e(b(), searchVideoView));
        view.addOnAttachStateChangeListener(this);
        if (!(aVar.h() == null || (core = searchVideoView.getCore()) == null || (surfaceHolder = core.getSurfaceHolder()) == null)) {
            surfaceHolder.a(aVar.h());
        }
        com.bytedance.ies.ugc.appcontext.f.c().d(new f.a.d.f(this) {
            /* class com.ss.android.ugc.aweme.autoplay.d.a.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f67351a;

            static {
                Covode.recordClassIndex(41478);
            }

            {
                this.f67351a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                if (obj instanceof SearchResultActivity) {
                    this.f67351a.f67345d.b();
                }
            }
        });
    }
}
