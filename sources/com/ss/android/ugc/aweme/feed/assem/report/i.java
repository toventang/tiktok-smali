package com.ss.android.ugc.aweme.feed.assem.report;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.language.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends com.ss.android.ugc.aweme.feed.assem.base.a<c> {
    public static final a u = new a((byte) 0);
    private SparseArray v;

    static {
        Covode.recordClassIndex(58488);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.sv;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.v == null) {
            this.v = new SparseArray();
        }
        View view = (View) this.v.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.v.put(R.id.dlk, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58489);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f92417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92418b;

        static {
            Covode.recordClassIndex(58490);
        }

        b(i iVar, VideoItemParams videoItemParams) {
            this.f92417a = iVar;
            this.f92418b = videoItemParams;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f92418b.mAweme;
            l.b(aweme, "");
            FrameLayout frameLayout = (FrameLayout) this.f92417a.G();
            l.b(frameLayout, "");
            a.a(aweme, frameLayout);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        l.d(videoItemParams2, "");
        if (TextUtils.equals(videoItemParams2.mEventType, "homepage_hot")) {
            d.a();
            if (b.a()) {
                FrameLayout frameLayout = (FrameLayout) G();
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                FrameLayout frameLayout2 = (FrameLayout) G();
                if (frameLayout2 != null) {
                    frameLayout2.setOnClickListener(new b(this, videoItemParams2));
                    return;
                }
                return;
            }
        }
        FrameLayout frameLayout3 = (FrameLayout) G();
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(4);
        }
    }
}
