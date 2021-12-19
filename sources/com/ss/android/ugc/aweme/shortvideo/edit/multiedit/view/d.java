package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.g.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.google.android.material.internal.CheckableImageButton;
import com.ss.android.ttve.utils.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class d extends b {

    /* renamed from: k  reason: collision with root package name */
    public CutVideoSpeedViewModel f128017k;

    /* renamed from: l  reason: collision with root package name */
    public CutVideoBottomBarViewModel f128018l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f128019m = true;

    static {
        Covode.recordClassIndex(83900);
    }

    public static final /* synthetic */ CutVideoSpeedViewModel a(d dVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = dVar.f128017k;
        if (cutVideoSpeedViewModel == null) {
            l.a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void b(e<Float, Float> eVar) {
        l.d(eVar, "");
        l().a(eVar, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        p().setOnClickListener(new a(this));
        q().setOnClickListener(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void c(boolean z) {
        int i2;
        CheckableImageButton p = p();
        if (z) {
            i2 = 255;
        } else {
            i2 = 127;
        }
        p.setImageAlpha(i2);
        this.f128019m = z;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f128020a;

        static {
            Covode.recordClassIndex(83901);
        }

        a(d dVar) {
            this.f128020a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f128020a.f128019m) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f128020a.p().getContext()).a(R.string.b29).a();
                return;
            }
            boolean isChecked = this.f128020a.p().isChecked();
            this.f128020a.p().toggle();
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f128020a.f128018l;
            if (cutVideoBottomBarViewModel == null) {
                l.a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.b(!isChecked);
            if (!isChecked) {
                CutVideoSpeedViewModel a2 = d.a(this.f128020a);
                i a3 = m.a(this.f128020a.l().getCurrentSpeed());
                l.b(a3, "");
                a2.a(a3);
                d.a(this.f128020a).b(true);
                return;
            }
            d.a(this.f128020a).b(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.fragment.app.e eVar, View view, boolean z) {
        if (eVar != null && view != null) {
            super.a(eVar, view, z);
            JediViewModel a2 = t.a(eVar).a(CutVideoSpeedViewModel.class);
            l.b(a2, "");
            this.f128017k = (CutVideoSpeedViewModel) a2;
            JediViewModel a3 = t.a(eVar).a(CutVideoBottomBarViewModel.class);
            l.b(a3, "");
            this.f128018l = (CutVideoBottomBarViewModel) a3;
            view.findViewById(R.id.at9).setBackgroundColor(0);
            View findViewById = view.findViewById(R.id.ase);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
            o().setVisibility(8);
            if (z) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.we);
                l.b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                frameLayout.setLayoutParams(layoutParams2);
                p().setVisibility(0);
                q().setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.fragment.app.e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z, w wVar) {
        l.d(eVar, "");
        if (!k.a(list)) {
            l().setExtractFramesInRoughMode(true);
            l().a(eVar, cutMultiVideoViewModel, (List<MediaModel>) list);
            ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = (int) b.b(eVar, 70.0f);
            l().setLayoutParams(layoutParams2);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a l2 = l();
            if (!(l2 instanceof VideoEditView)) {
                l2 = null;
            }
            VideoEditView videoEditView = (VideoEditView) l2;
            if (videoEditView != null) {
                videoEditView.setViewConfig(wVar);
            }
        }
    }
}
