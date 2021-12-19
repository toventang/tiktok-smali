package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class e extends com.ss.android.ugc.aweme.story.edit.clip.b<StoryEditToolbarViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f137475a;

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.scene.group.b f137476b;

    /* renamed from: c  reason: collision with root package name */
    public final int f137477c = R.id.ath;

    /* renamed from: d  reason: collision with root package name */
    public final int f137478d = R.id.asd;

    /* renamed from: f  reason: collision with root package name */
    private final h f137479f = i.a(m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<StoryEditToolbarViewModel> f137480k = c.f137482a;

    static {
        Covode.recordClassIndex(89927);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<StoryEditToolbarViewModel> b() {
        return this.f137480k;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137476b;
    }

    static final class c extends h.f.b.m implements h.f.a.a<StoryEditToolbarViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137482a = new c();

        static {
            Covode.recordClassIndex(89930);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryEditToolbarViewModel invoke() {
            return new StoryEditToolbarViewModel();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.e.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f, com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        ((com.ss.android.ugc.aweme.story.edit.b.e) this.f137479f.getValue()).T().observe(this, new b(this));
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f137481a;

        static {
            Covode.recordClassIndex(89929);
        }

        b(e eVar) {
            this.f137481a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f137481a.f137475a) {
                this.f137481a.f137476b.a(this.f137481a.f137477c, new f(this.f137481a.getDiContainer()), "StoryEditToolbarScene");
                this.f137481a.f137476b.a(this.f137481a.f137478d, new a(this.f137481a.getDiContainer()), "StoryEditBottomBarScene");
                this.f137481a.f137475a = true;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        if (this.f137475a) {
            ((StoryEditToolbarViewModel) j()).d(com.ss.android.ugc.aweme.story.edit.model.a.f(vEEditClip2.f137559g));
            j().c(new StoryEditToolbarViewModel.c(!com.ss.android.ugc.aweme.story.edit.model.a.e(vEEditClip2.f137559g)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137476b = bVar;
    }
}
