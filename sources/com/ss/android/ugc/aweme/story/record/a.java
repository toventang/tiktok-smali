package com.ss.android.ugc.aweme.story.record;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.view.w;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public abstract class a extends w implements com.ss.android.ugc.aweme.story.base.c {

    /* renamed from: b  reason: collision with root package name */
    public EnterStoryParam f138156b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.record.g.b f138157c;

    /* renamed from: d  reason: collision with root package name */
    private final h f138158d = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(90356);
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void E() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean F();

    /* access modifiers changed from: protected */
    public abstract void G();

    @Override // com.ss.android.ugc.aweme.story.base.c
    public void a(int i2, int i3, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public void c() {
    }

    static final class d extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0)).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public void a(boolean z) {
        com.ss.android.ugc.aweme.story.record.g.b bVar = this.f138157c;
        if (bVar != null) {
            bVar.f138291b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<p, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            Context s = this.this$0.s();
            l.b(s, "");
            if (com.ss.android.ugc.aweme.story.record.g.d.a(s)) {
                this.this$0.G();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138161a;

        static {
            Covode.recordClassIndex(90359);
        }

        c(a aVar) {
            this.f138161a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            androidx.lifecycle.i lifecycle = this.f138161a.getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                this.f138161a.G();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.a$a  reason: collision with other inner class name */
    public static final class C3637a extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.g.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f138160b;

        static {
            Covode.recordClassIndex(90357);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.g.b get(f fVar) {
            l.d(fVar, "");
            a aVar = this.f138160b;
            e b2 = com.bytedance.scene.ktx.c.b(this.f138160b);
            a aVar2 = this.f138160b;
            aVar.f138157c = new com.ss.android.ugc.aweme.story.record.g.b(b2, aVar2, R.id.dqk, fVar, aVar2.F());
            com.ss.android.ugc.aweme.story.record.g.b bVar = this.f138160b.f138157c;
            if (bVar == null) {
                l.b();
            }
            return bVar;
        }

        public C3637a(com.bytedance.als.dsl.d dVar, a aVar) {
            this.f138159a = dVar;
            this.f138160b = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public void a(EnterStoryParam enterStoryParam) {
        EnterStoryParam enterStoryParam2;
        l.d(enterStoryParam, "");
        EnterStoryParam enterStoryParam3 = this.f138156b;
        if (enterStoryParam3 != null) {
            enterStoryParam2 = EnterStoryParam.copy$default(enterStoryParam3, null, enterStoryParam.getEnterMethod(), enterStoryParam.getEnterFrom(), false, false, enterStoryParam.isWestWindowExist(), false, 89, null);
        } else {
            enterStoryParam2 = null;
        }
        this.f138156b = enterStoryParam2;
    }

    @Override // com.bytedance.scene.j
    public void a(Bundle bundle) {
        EnterStoryParam enterStoryParam;
        androidx.lifecycle.t<Boolean> tVar;
        super.a(bundle);
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            enterStoryParam = (EnterStoryParam) bundle2.getParcelable("enter_story_param");
        } else {
            enterStoryParam = null;
        }
        this.f138156b = enterStoryParam;
        Context s = s();
        l.b(s, "");
        if (!com.ss.android.ugc.aweme.story.record.g.d.a(s)) {
            com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
            com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer = bVar.f6461a;
            alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.record.g.b.class, (String) null, (com.bytedance.o.p) new C3637a(dVar, this));
            alsLogicContainer.a(com.ss.android.ugc.aweme.story.record.g.a.class, com.ss.android.ugc.aweme.story.record.g.b.class);
            bVar.a();
        }
        f.a.b.b unused = ((StoryRecordBaseViewModel) this.f138158d.getValue()).a(this, b.f138172a, new ah(), new b(this));
        com.ss.android.ugc.aweme.story.record.g.b bVar2 = this.f138157c;
        if (bVar2 != null && (tVar = bVar2.f138290a) != null) {
            tVar.observe(this, new c(this));
        }
    }
}
