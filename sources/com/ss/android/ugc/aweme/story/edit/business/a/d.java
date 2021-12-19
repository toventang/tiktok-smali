package com.ss.android.ugc.aweme.story.edit.business.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.List;
import java.util.Objects;

public final class d extends com.bytedance.scene.group.b implements com.bytedance.o.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b, ab {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f137157b = {new y(d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(d.class, "storySharedEditConfigure", "getStorySharedEditConfigure()Lcom/ss/android/ugc/aweme/story/edit/model/StorySharedEditConfigure;", 0), new y(d.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f137158c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f137159d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f137160e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f137161f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f137162g;

    /* renamed from: h  reason: collision with root package name */
    private final f f137163h;

    static {
        Covode.recordClassIndex(89691);
    }

    private final VideoPublishEditModel F() {
        return (VideoPublishEditModel) this.f137159d.a(this, f137157b[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89692);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137161f.a(this, f137157b[2]);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final bq T() {
        com.ss.android.ugc.aweme.story.edit.model.c cVar = (com.ss.android.ugc.aweme.story.edit.model.c) this.f137160e.a(this, f137157b[1]);
        StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        if (d2 == null) {
            l.b();
        }
        return cVar.a(d2);
    }

    static final class c extends m implements h.f.a.b<n, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        public static final class a extends p<d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f137166a;

            static {
                Covode.recordClassIndex(89695);
            }

            public a(c cVar) {
                this.f137166a = cVar;
            }

            @Override // com.bytedance.o.p
            public final d get(f fVar) {
                l.d(fVar, "");
                return this.f137166a.this$0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            n nVar2 = nVar;
            l.d(nVar2, "");
            n.a a2 = nVar2.a(d.class, (String) null, (p) new a(this));
            l.b(a2, "");
            a2.a(ab.class);
            return z.f158842a;
        }
    }

    public static final class b extends p<com.ss.android.ugc.aweme.story.edit.business.a.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f137164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f137165b;

        static {
            Covode.recordClassIndex(89693);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.edit.business.a.a.a get(f fVar) {
            l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.edit.business.a.a.a(fVar, this.f137165b);
        }

        public b(com.bytedance.als.dsl.d dVar, d dVar2) {
            this.f137164a = dVar;
            this.f137165b = dVar2;
        }
    }

    public final <T> T a(Class<T> cls) {
        l.d(cls, "");
        if (this.f137162g) {
            return (T) getDiContainer().b(cls, null);
        }
        return null;
    }

    public d(f fVar) {
        l.d(fVar, "");
        this.f137163h = fVar;
        this.f137159d = com.bytedance.o.b.a.a(fVar, VideoPublishEditModel.class);
        this.f137160e = com.bytedance.o.b.a.a(fVar, com.ss.android.ugc.aweme.story.edit.model.c.class);
        this.f137161f = com.bytedance.o.b.a.a(fVar, VEEditClipCluster.class);
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        g.a(this, new c(this));
        com.bytedance.als.dsl.b bVar = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.edit.business.a.a.a.class, (String) null, (p) new b(dVar, this));
        alsLogicContainer.a(EditStickerViewModel.class, com.ss.android.ugc.aweme.story.edit.business.a.a.a.class);
        bVar.a();
        this.f137162g = true;
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final void a(StickerItemModel stickerItemModel) {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        l.d(stickerItemModel, "");
        int i2 = 1;
        if (F().infoStickerModel != null) {
            InfoStickerModel infoStickerModel = F().infoStickerModel;
            if (!(infoStickerModel == null || (list2 = infoStickerModel.stickers) == null)) {
                for (T t : list2) {
                    l.b(t, "");
                    if (com.ss.android.ugc.aweme.editSticker.model.c.a(t) && t.layerWeight > i2) {
                        i2 = t.layerWeight;
                    }
                }
            }
            stickerItemModel.layerWeight += i2;
            InfoStickerModel infoStickerModel2 = F().infoStickerModel;
            if (!(infoStickerModel2 == null || (list = infoStickerModel2.stickers) == null)) {
                list.add(stickerItemModel);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("the infoStickerModel of tmp VideoPublishEditModel is null which is not allowed".toString());
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2r, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }
}
