package com.ss.android.ugc.aweme.story.edit.business.a.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.lang.reflect.Type;

public final class a extends com.ss.android.ugc.aweme.story.edit.clip.b<EditStickerViewModel> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137127a = {new y(a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/story/edit/preview/StoryEditPreviewApi;", 0), new y(a.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new y(a.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.scene.group.b f137128b;

    /* renamed from: c  reason: collision with root package name */
    public final int f137129c = R.id.ata;

    /* renamed from: d  reason: collision with root package name */
    private final h f137130d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f137131f;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f137132k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f137133l;

    /* renamed from: m  reason: collision with root package name */
    private final h f137134m;
    private final h.f.a.a<EditStickerViewModel> n;

    static {
        Covode.recordClassIndex(89670);
    }

    public final b a() {
        return (b) this.f137130d.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.b
    public final VEEditClipCluster f() {
        return (VEEditClipCluster) this.f137132k.a(this, f137127a[1]);
    }

    public final VideoPublishEditModel g() {
        return (VideoPublishEditModel) this.f137133l.a(this, f137127a[2]);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditStickerViewModel> b() {
        return this.n;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f137128b;
    }

    static final class e extends m implements h.f.a.a<EditStickerViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f137137a = new e();

        static {
            Covode.recordClassIndex(89675);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return new EditStickerViewModel();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.b, com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return cy_();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.a$a  reason: collision with other inner class name */
    public static final class C3591a extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3591a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.f.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.f.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.f.e> r1 = com.ss.android.ugc.aweme.story.edit.business.shared.f.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.a.a.a.C3591a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.f, com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        ((com.ss.android.ugc.aweme.story.edit.b.e) this.f137131f.a(this, f137127a[0])).f().observe(this, new b(this));
        ((com.ss.android.ugc.aweme.story.edit.business.shared.f.e) this.f137134m.getValue()).b().a(this, new c(this));
    }

    static final class d extends m implements h.f.a.a<b> {
        final /* synthetic */ f $diContainer;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, f fVar) {
            super(0);
            this.this$0 = aVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.this$0);
            if (d2 != null) {
                com.ss.android.ugc.aweme.story.edit.a.d(d2, this.this$0.g());
            }
            b bVar = new b(this.$diContainer);
            com.bytedance.scene.group.b bVar2 = this.this$0.f137128b;
            int i2 = this.this$0.f137129c;
            bVar.a((j) this.this$0.getDiContainer().a((Type) j.class, (String) null));
            bVar.a((com.ss.android.ugc.aweme.editSticker.interact.e) this.this$0.getDiContainer().a((Type) com.ss.android.ugc.aweme.editSticker.interact.e.class, (String) null));
            bVar.a((ab) this.this$0.getDiContainer().a((Type) ab.class, (String) null));
            bVar2.a(i2, bVar, "EditStickerScene");
            return bVar;
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137136a;

        static {
            Covode.recordClassIndex(89673);
        }

        c(a aVar) {
            this.f137136a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            StoryEditClipModel d2;
            if ((obj instanceof com.ss.android.ugc.aweme.story.edit.business.shared.f.a) && (d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137136a)) != null) {
                com.ss.android.ugc.aweme.story.edit.a.b(this.f137136a.g(), d2);
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137135a;

        static {
            Covode.recordClassIndex(89672);
        }

        b(a aVar) {
            this.f137135a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ((EditStickerViewModel) this.f137135a.getApiComponent()).a(this.f137135a.a());
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137135a);
            if (d2 != null) {
                com.ss.android.ugc.aweme.story.edit.model.a.i(d2);
            }
            this.f137135a.a().af();
            this.f137135a.a().ad();
            this.f137135a.a().ae();
            this.f137135a.getApiComponent().d(new EditStickerViewModel.c());
            this.f137135a.getApiComponent().d(new EditStickerViewModel.h());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137128b = bVar;
        this.f137130d = h.i.a((h.f.a.a) new d(this, fVar));
        this.f137131f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.edit.b.e.class);
        this.f137132k = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);
        this.f137133l = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.f137134m = h.i.a(h.m.NONE, new C3591a(this));
        this.n = e.f137137a;
    }
}
