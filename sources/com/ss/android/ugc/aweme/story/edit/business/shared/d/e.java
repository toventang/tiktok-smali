package com.ss.android.ugc.aweme.story.edit.business.shared.d;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;
import h.z;
import java.util.Objects;

public final class e extends j implements com.bytedance.o.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137332a = {new y(e.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new y(e.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final b f137333d = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f137334b;

    /* renamed from: c  reason: collision with root package name */
    public b f137335c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f137336e = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f137337f = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: g  reason: collision with root package name */
    private final h f137338g = h.i.a(m.NONE, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private final f f137339h;

    static {
        Covode.recordClassIndex(89818);
    }

    public final StoryEditModel a() {
        return (StoryEditModel) this.f137336e.a(this, f137332a[0]);
    }

    /* renamed from: b */
    public final VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137337f.a(this, f137332a[1]);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(89820);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137339h;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89819);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.d.e.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f137340a;

        static {
            Covode.recordClassIndex(89821);
        }

        c(e eVar) {
            this.f137340a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            int i2;
            int a2;
            int a3;
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            boolean a4 = com.ss.android.ugc.aweme.tools.c.a(this.f137340a.t());
            RecyclerView recyclerView2 = this.f137340a.f137334b;
            if (recyclerView2 == null) {
                l.a("clipNavigateView");
            }
            RecyclerView.a adapter = recyclerView2.getAdapter();
            if (adapter != null) {
                i2 = adapter.getItemCount();
            } else {
                i2 = 0;
            }
            int d2 = RecyclerView.d(view);
            if (a4) {
                if (d2 == 0) {
                    rect.right = en.a(14.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                }
                if (d2 == i2 - 1) {
                    a3 = en.a(10.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                } else {
                    a3 = en.a(6.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                }
                rect.left = a3;
                return;
            }
            if (d2 == 0) {
                rect.left = en.a(14.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            }
            if (d2 == i2 - 1) {
                a2 = en.a(10.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            } else {
                a2 = en.a(6.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
            }
            rect.right = a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.e$e  reason: collision with other inner class name */
    static final class C3602e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f137341a;

        static {
            Covode.recordClassIndex(89823);
        }

        C3602e(e eVar) {
            this.f137341a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f137341a.f137335c != null) {
                b bVar = this.f137341a.f137335c;
                if (bVar == null) {
                    l.a("clipAdapter");
                }
                bVar.f137320a = true;
                bVar.notifyDataSetChanged();
            }
        }
    }

    public e(f fVar) {
        l.d(fVar, "");
        this.f137339h = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        MethodCollector.i(3011);
        super.a(bundle);
        if (a().getClips().size() > 1) {
            View inflate = ((ViewStub) c(R.id.ctz)).inflate();
            if (inflate != null) {
                RecyclerView recyclerView = (RecyclerView) inflate;
                this.f137335c = new b(recyclerView, a().getClips(), com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this), new d(this));
                this.f137334b = recyclerView;
                if (recyclerView == null) {
                    l.a("clipNavigateView");
                }
                t();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.b(new c(this));
                b bVar = this.f137335c;
                if (bVar == null) {
                    l.a("clipAdapter");
                }
                recyclerView.setAdapter(bVar);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                MethodCollector.o(3011);
                throw nullPointerException;
            }
        }
        ((com.ss.android.ugc.aweme.story.edit.b.e) this.f137338g.getValue()).f().observe(this, new C3602e(this));
        MethodCollector.o(3011);
    }

    @Override // com.bytedance.scene.j
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2p, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    static final class d extends h.f.b.m implements h.f.a.m<StoryEditClipModel, Integer, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(89822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(StoryEditClipModel storyEditClipModel, Integer num) {
            StoryEditClipModel storyEditClipModel2 = storyEditClipModel;
            int intValue = num.intValue();
            l.d(storyEditClipModel2, "");
            VEEditClipCluster b2 = this.this$0.cy_();
            String clipId = storyEditClipModel2.getClipId();
            l.d(clipId, "");
            VEEditClip vEEditClip = b2.f137567a.get(clipId);
            if (vEEditClip != null) {
                b2.a(vEEditClip);
            }
            StoryEditModel a2 = this.this$0.a();
            l.d(a2, "");
            r.a("click_clip", new com.ss.android.ugc.tools.f.b().a("creation_id", a2.getCreationId()).a("shoot_way", a2.getShootWay()).a("clip_index", intValue).a("clips_cnt", a2.getClips().size()).f149193a);
            return z.f158842a;
        }
    }
}
