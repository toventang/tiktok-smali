package com.ss.android.ugc.aweme.story.edit.business.shared.effect;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.o.f;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.story.edit.b;
import com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.n;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class StoryEditEffectPanelViewModel extends LifecycleAwareViewModel<StoryEditEffectPanelState> implements com.bytedance.o.a, a, com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137354a = {new y(StoryEditEffectPanelViewModel.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new y(StoryEditEffectPanelViewModel.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private final h.h.d f137355b = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: c  reason: collision with root package name */
    private final h.h.d f137356c = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private final h f137357d = h.i.a(m.NONE, new a(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f137358e = h.i.a((h.f.a.a) b.f137360a);

    /* renamed from: f  reason: collision with root package name */
    private final f f137359f;

    static {
        Covode.recordClassIndex(89833);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.a
    public final com.ss.android.ugc.aweme.effect.e.b b() {
        return (com.ss.android.ugc.aweme.effect.e.b) this.f137358e.getValue();
    }

    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137359f;
    }

    static final class b extends h.f.b.m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137360a = new b();

        static {
            Covode.recordClassIndex(89835);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    @v(a = i.a.ON_DESTROY)
    private final void onDestroy() {
        b().a();
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.effect.a
    public final void a() {
        c(d.f137362a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new StoryEditEffectPanelState(null, null, 3, null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.effect.StoryEditEffectPanelViewModel.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        getLifecycle().a(this);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137355b.a(this, f137354a[0]);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.a
    public final void h() {
        ((com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d) this.f137357d.getValue()).a(new n(100, "click_panel"));
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.a
    public final void g() {
        boolean z;
        g a2;
        VEEditClip c2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this);
        if (c2 != null) {
            ArrayList<EffectPointModel> effectList = c2.f137559g.getEffectList();
            if (effectList == null || effectList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!(!z) || effectList == null || (a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(c2)) == null)) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) effectList, 10));
                Iterator<T> it = effectList.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().getIndex()));
                }
                a2.a(h.a.n.e((Collection<Integer>) arrayList));
            }
            c2.f137559g.setEffectList(null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<StoryEditEffectPanelState, StoryEditEffectPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137361a = new c();

        static {
            Covode.recordClassIndex(89836);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditEffectPanelState invoke(StoryEditEffectPanelState storyEditEffectPanelState) {
            StoryEditEffectPanelState storyEditEffectPanelState2 = storyEditEffectPanelState;
            l.d(storyEditEffectPanelState2, "");
            return StoryEditEffectPanelState.copy$default(storyEditEffectPanelState2, null, new p(), 1, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<StoryEditEffectPanelState, StoryEditEffectPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137362a = new d();

        static {
            Covode.recordClassIndex(89837);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditEffectPanelState invoke(StoryEditEffectPanelState storyEditEffectPanelState) {
            StoryEditEffectPanelState storyEditEffectPanelState2 = storyEditEffectPanelState;
            l.d(storyEditEffectPanelState2, "");
            return StoryEditEffectPanelState.copy$default(storyEditEffectPanelState2, new a.b(), null, 2, null);
        }
    }

    public StoryEditEffectPanelViewModel(f fVar) {
        l.d(fVar, "");
        this.f137359f = fVar;
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.a
    public final void a(EffectModel effectModel) {
        g a2;
        l.d(effectModel, "");
        VEEditClip c2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.c(this);
        if (c2 != null && (a2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(c2)) != null) {
            g();
            int j2 = a2.j();
            int[] a3 = a2.a(new int[]{0}, new int[]{j2}, new String[]{effectModel.resDir});
            if (a3.length != 0) {
                EffectPointModel effectPointModel = new EffectPointModel();
                effectPointModel.setName(effectModel.name);
                effectPointModel.setKey(effectModel.key);
                effectPointModel.setExtra(effectModel.extra);
                effectPointModel.setType(effectModel.type);
                effectPointModel.setCategory(effectModel.category);
                effectPointModel.setIndex(a3[0]);
                effectPointModel.setUiStartPoint(0);
                effectPointModel.setUiEndPoint(j2);
                effectPointModel.setStartPoint(0);
                effectPointModel.setEndPoint(j2);
                effectPointModel.setFromEnd(false);
                effectPointModel.setSelectedColor(0);
                effectPointModel.setDuration(j2 - 0);
                effectPointModel.setResDir(effectModel.resDir);
                effectPointModel.setAdjustParams(effectModel.adjustParams);
                effectPointModel.setIsNewEngineEffect(effectModel.isNewEngineEffect);
                StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
                if (d2 != null) {
                    d2.setEffectList(h.a.n.d(effectPointModel));
                }
                StoryEditModel storyEditModel = (StoryEditModel) this.f137356c.a(this, f137354a[1]);
                String str = effectModel.name;
                l.b(str, "");
                String str2 = effectModel.key;
                l.b(str2, "");
                l.d(storyEditModel, "");
                l.d(str, "");
                l.d(str2, "");
                com.ss.android.ugc.aweme.story.edit.b.a("effect_click", storyEditModel, new b.d(str, str2));
            }
        }
    }
}
