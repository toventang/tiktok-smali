package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.u;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Objects;

public final class l extends a<com.ss.android.ugc.aweme.video.hashtag.b> {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ i[] f146004e = {new y(l.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f146005f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private EditHashTagStickerViewModel f146006g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146007h = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h f146008i = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(95956);
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final int C() {
        return 9;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(95957);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void D() {
        ((a) this).f145663b.a((HashTagStickerEditingLayout) this.f146008i.getValue());
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<com.ss.android.ugc.aweme.video.hashtag.b> d() {
        return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a(b());
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void E() {
        super.E();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditHashTagStickerViewModel.class);
        h.f.b.l.b(a2, "");
        this.f146006g = (EditHashTagStickerViewModel) a2;
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void F() {
        super.F();
        EditHashTagStickerViewModel editHashTagStickerViewModel = this.f146006g;
        if (editHashTagStickerViewModel == null) {
            h.f.b.l.a("editHashTagStickerViewModel");
        }
        editHashTagStickerViewModel.a().observe(this, new d(this));
        EditHashTagStickerViewModel editHashTagStickerViewModel2 = this.f146006g;
        if (editHashTagStickerViewModel2 == null) {
            h.f.b.l.a("editHashTagStickerViewModel");
        }
        selectNonNullSubscribe(editHashTagStickerViewModel2, m.f146172a, new ah(), new e(this));
        EditHashTagStickerViewModel editHashTagStickerViewModel3 = this.f146006g;
        if (editHashTagStickerViewModel3 == null) {
            h.f.b.l.a("editHashTagStickerViewModel");
        }
        b.a.b(this, editHashTagStickerViewModel3, n.f146255a, new f(this));
    }

    static final class b extends m implements h.f.a.a<HashTagStickerEditingLayout> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(95958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashTagStickerEditingLayout invoke() {
            MethodCollector.i(3823);
            l lVar = this.this$0;
            if (lVar.o != null) {
                j jVar = lVar.o;
                if (jVar == null) {
                    h.f.b.l.b();
                }
                View inflate = ((ViewStub) jVar.c(R.id.fjq)).inflate();
                if (inflate != null) {
                    HashTagStickerEditingLayout hashTagStickerEditingLayout = (HashTagStickerEditingLayout) inflate;
                    hashTagStickerEditingLayout.setModel(lVar.b());
                    View findViewById = hashTagStickerEditingLayout.findViewById(R.id.f1m);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = com.ss.android.ugc.aweme.adaptation.a.f66177a.d();
                            findViewById.requestLayout();
                        }
                    }
                    MethodCollector.o(3823);
                    return hashTagStickerEditingLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout");
                MethodCollector.o(3823);
                throw nullPointerException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Parent Scene is null".toString());
            MethodCollector.o(3823);
            throw illegalStateException;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f146012a;

        static {
            Covode.recordClassIndex(95960);
        }

        d(l lVar) {
            this.f146012a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                ((a) this.f146012a).f145663b.a(f2.floatValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(com.bytedance.o.f fVar) {
        super(fVar);
        h.f.b.l.d(fVar, "");
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f146009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f146010b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ab f146011c;

        static {
            Covode.recordClassIndex(95959);
        }

        c(l lVar, com.ss.android.ugc.asve.editor.g gVar, ab abVar) {
            this.f146009a = lVar;
            this.f146010b = gVar;
            this.f146011c = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.b(iVar, "");
            for (com.ss.android.ugc.aweme.editSticker.compile.b bVar : (List) iVar.d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(((a) this.f146009a).f145663b.f127582a, bVar.stickerPath, "", bVar.index, false, 0, this.f146010b.j(), 9);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f146011c.a(stickerItemModel);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(95961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar) {
            super(2);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            this.this$0.a(booleanValue);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(95962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(2);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(zVar, "");
            ((a) this.this$0).f145663b.n();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.b
    public final b.i<z> a(com.ss.android.ugc.asve.editor.g gVar, ab abVar, h.f.a.b<? super String, String> bVar) {
        String str;
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(abVar, "");
        if (J()) {
            if (bVar == null || (str = bVar.invoke("hashtag_sticker")) == null) {
                str = ((VideoPublishEditModel) this.f146007h.a(this, f146004e[0])).uniqueVideoSessionDir(L() + "/effect/hashtag_stickers" + File.separator + System.currentTimeMillis() + File.separator);
            }
            h.f.b.l.b(str, "");
            b.i<TContinuationResult> c2 = a(str, abVar.T().a(), abVar.T().b(), gVar.b().width, gVar.b().height).c(new c(this, gVar, abVar), b.i.f4826c);
            h.f.b.l.b(c2, "");
            return c2;
        }
        b.i<z> a2 = b.i.a(z.f158842a);
        h.f.b.l.b(a2, "");
        return a2;
    }
}
