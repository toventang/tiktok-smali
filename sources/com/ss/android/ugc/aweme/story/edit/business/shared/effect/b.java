package com.ss.android.ugc.aweme.story.edit.business.shared.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.tools.view.base.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class b extends com.ss.android.ugc.aweme.story.edit.clip.b<StoryEditEffectPanelViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public c f137363a;

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<StoryEditEffectPanelViewModel> f137364b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.scene.group.b f137365c;

    /* renamed from: d  reason: collision with root package name */
    private final int f137366d = R.id.c9b;

    static {
        Covode.recordClassIndex(89839);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<StoryEditEffectPanelViewModel> b() {
        return this.f137364b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137365c;
    }

    static final class a extends m implements h.f.a.a<StoryEditEffectPanelViewModel> {
        final /* synthetic */ f $diContainer;

        static {
            Covode.recordClassIndex(89840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryEditEffectPanelViewModel invoke() {
            return new StoryEditEffectPanelViewModel(this.$diContainer);
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        if (this.f137363a != null) {
            c cVar = this.f137363a;
            if (cVar == null) {
                l.a("scene");
            }
            cVar.b().a();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        if (this.f137363a == null) {
            c cVar = new c(getDiContainer());
            this.f137365c.a(this.f137366d, cVar, "StoryEditEffectPanelScene");
            this.f137363a = cVar;
        }
        c cVar2 = this.f137363a;
        if (cVar2 == null) {
            l.a("scene");
        }
        j jVar = cVar2.o;
        if (!(jVar instanceof com.bytedance.scene.group.b)) {
            jVar = null;
        }
        com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) jVar;
        if (bVar != null) {
            bVar.e(cVar2);
        }
        d dVar = cVar2.b().f137380b;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        j().c(StoryEditEffectPanelViewModel.c.f137361a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137365c = bVar;
        this.f137364b = new a(fVar);
    }
}
