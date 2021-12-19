package com.ss.android.ugc.aweme.story.edit.clip;

import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.story.edit.clip.a.d;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import h.f.b.l;
import h.f.b.y;
import h.k.i;

public abstract class a<Api extends b> extends d<Api, VEEditClip, VEEditClipCluster> implements com.bytedance.o.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ i[] f137542e = {new y(a.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final h.h.d f137543a = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: b  reason: collision with root package name */
    private final f f137544b;

    static {
        Covode.recordClassIndex(89978);
    }

    /* renamed from: cx_ */
    public final VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137543a.a(this, f137542e[0]);
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f137544b;
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f137544b = fVar;
    }
}
