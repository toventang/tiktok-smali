package com.ss.android.ugc.aweme.story.edit.business.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;

public final class c extends com.ss.android.ugc.aweme.story.edit.clip.a<b> implements b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137151a = {new y(c.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final b f137152b = this;

    /* renamed from: c  reason: collision with root package name */
    final d f137153c = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private d f137154d;

    /* renamed from: f  reason: collision with root package name */
    private final b f137155f;

    /* renamed from: g  reason: collision with root package name */
    private final int f137156g = R.id.bro;

    static {
        Covode.recordClassIndex(89689);
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this.f137152b;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ VEEditClip $clip$inlined;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, VEEditClip vEEditClip) {
            super(0);
            this.this$0 = cVar;
            this.$clip$inlined = vEEditClip;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c cVar = this.this$0;
            com.ss.android.ugc.aweme.story.edit.a.b((VideoPublishEditModel) cVar.f137153c.a(cVar, c.f137151a[0]), this.$clip$inlined.f137559g);
            this.this$0.U();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.a.b
    public final <T> T a(Class<T> cls) {
        l.d(cls, "");
        d dVar = this.f137154d;
        if (dVar != null) {
            return (T) dVar.a(cls);
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d
    public final /* synthetic */ void b(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.b(vEEditClip2);
        com.ss.android.ugc.gamora.editor.sticker.core.a aVar = (com.ss.android.ugc.gamora.editor.sticker.core.a) a(com.ss.android.ugc.gamora.editor.sticker.core.a.class);
        if (aVar != null) {
            V();
            aVar.a(true, (h.f.a.a<z>) new a(this, vEEditClip2));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.d
    public final /* synthetic */ void a(VEEditClip vEEditClip) {
        VEEditClip vEEditClip2 = vEEditClip;
        l.d(vEEditClip2, "");
        super.a(vEEditClip2);
        d dVar = new d(getDiContainer());
        this.f137154d = dVar;
        b bVar = this.f137155f;
        int i2 = this.f137156g;
        l.c(bVar, "");
        l.c(dVar, "");
        l.c("StoryIsolateClipEditRootScene", "");
        l.c(bVar, "");
        l.c(dVar, "");
        l.c("StoryIsolateClipEditRootScene", "");
        j a2 = bVar.a("StoryIsolateClipEditRootScene");
        if (!l.a(a2, dVar)) {
            if (bVar.f(dVar)) {
                bVar.c(dVar);
            }
            if (a2 == null) {
                bVar.b(i2, dVar, "StoryIsolateClipEditRootScene");
            } else if (bVar.g(a2)) {
                bVar.c(a2);
                bVar.b(i2, dVar, "StoryIsolateClipEditRootScene");
            } else {
                bVar.c(a2);
                com.bytedance.scene.ktx.a.a(bVar, i2, dVar, "StoryIsolateClipEditRootScene");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f fVar, b bVar) {
        super(fVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137155f = bVar;
    }
}
