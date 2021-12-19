package com.ss.android.ugc.aweme.story.edit.canvas;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.als.dsl.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.f;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.canvas.ad;
import com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.ss.android.ugc.aweme.canvas.n;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.story.edit.clip.b<EditPhotoCanvasViewModel> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137533a = {new y(b.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<EditPhotoCanvasViewModel> f137534b;

    /* renamed from: c  reason: collision with root package name */
    private final d f137535c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f137536d;

    /* renamed from: f  reason: collision with root package name */
    private n f137537f;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.scene.group.b f137538k;

    /* renamed from: l  reason: collision with root package name */
    private final int f137539l = R.id.c9b;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.a<j> f137540m;

    static {
        Covode.recordClassIndex(89976);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditPhotoCanvasViewModel> b() {
        return this.f137534b;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137538k;
    }

    static final class a extends m implements h.f.a.a<EditPhotoCanvasViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137541a = new a();

        static {
            Covode.recordClassIndex(89977);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditPhotoCanvasViewModel invoke() {
            return new EditPhotoCanvasViewModel();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f, com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        List<StoryEditClipModel> clips = ((StoryEditModel) this.f137535c.a(this, f137533a[0])).getClips();
        if (!(clips instanceof Collection) || !clips.isEmpty()) {
            Iterator<T> it = clips.iterator();
            while (it.hasNext()) {
                if (a((StoryEditClipModel) it.next())) {
                    this.f137536d = true;
                    n nVar = new n(getDiContainer(), this.f137540m);
                    this.f137538k.a(this.f137539l, nVar, "StoryEditCanvasScene");
                    this.f137537f = nVar;
                    return;
                }
            }
        }
    }

    private static boolean a(StoryEditClipModel storyEditClipModel) {
        if (storyEditClipModel.getVideoEditorType() == 11) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f
    public final /* synthetic */ void b(VEEditClip vEEditClip) {
        n nVar;
        j a2;
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.b(vEEditClip2);
        if (this.f137536d && a(vEEditClip2.f137559g) && (nVar = this.f137537f) != null && (a2 = nVar.a()) != null) {
            f fVar = nVar.f69731g;
            if (fVar == null) {
                l.a("gestureInteractItem");
            }
            a2.b(fVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        if (this.f137536d && a(vEEditClip2.f137559g)) {
            n nVar = this.f137537f;
            if (nVar != null) {
                nVar.a(vEEditClip2.f137559g.getClipId(), vEEditClip2.f137559g.getCanvasVideoData());
            }
            if (ad.f69671a && !w.a("canvas_gesture")) {
                Activity b2 = g.b(this);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                EditPhotoCanvasPromptViewModel.a.a((e) b2).a();
                w.b("canvas_gesture");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar, h.f.a.a<? extends j> aVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(aVar, "");
        this.f137538k = bVar;
        this.f137540m = aVar;
        this.f137534b = a.f137541a;
        this.f137535c = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);
    }
}
