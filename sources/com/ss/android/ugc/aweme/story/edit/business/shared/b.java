package com.ss.android.ugc.aweme.story.edit.business.shared;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;

public final class b extends com.ss.android.ugc.aweme.story.edit.clip.a<a> implements a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137179a = {new y(b.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f137180b = this;

    /* renamed from: c  reason: collision with root package name */
    private final d f137181c = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private final h f137182d;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f137183f;

    /* renamed from: g  reason: collision with root package name */
    private final int f137184g = R.id.e2g;

    static {
        Covode.recordClassIndex(89708);
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.f137180b;
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ f $diContainer;

        static {
            Covode.recordClassIndex(89709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c(this.$diContainer);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f137183f.a(this.f137184g, (c) this.f137182d.getValue(), "StorySharedClipEditRootScene");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        ((VideoPublishEditModel) this.f137181c.a(this, f137179a[0])).setPreviewInfo(vEEditClip2.f137559g.getPreviewMediaInfo());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137183f = bVar;
        this.f137182d = h.i.a((h.f.a.a) new a(fVar));
    }
}
