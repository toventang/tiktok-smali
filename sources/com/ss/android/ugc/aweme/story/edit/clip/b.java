package com.ss.android.ugc.aweme.story.edit.clip;

import androidx.lifecycle.m;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.o.a;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.story.edit.clip.a.f;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public abstract class b<T extends JediViewModel<? extends UiState> & m & com.bytedance.als.b> extends f<T, VEEditClip, VEEditClipCluster> implements a, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ i[] f137550e = {new y(b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final d f137551a = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.o.f f137552b;

    static {
        Covode.recordClassIndex(89992);
    }

    /* renamed from: f */
    public VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137551a.a(this, f137550e[0]);
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.f137552b;
    }

    public b(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f137552b = fVar;
    }
}
