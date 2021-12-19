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
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Objects;

public final class o extends a<User> {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ i[] f146256e = {new y(o.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f146257f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private EditMentionStickerViewModel f146258g;

    /* renamed from: h  reason: collision with root package name */
    private final h f146259h = h.i.a((h.f.a.a) new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f146260i = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    static {
        Covode.recordClassIndex(96132);
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final int C() {
        return 8;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96133);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void D() {
        ((a) this).f145663b.a((MentionStickerEditingLayout) this.f146259h.getValue());
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a<User> d() {
        return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b(b());
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void E() {
        super.E();
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditMentionStickerViewModel.class);
        l.b(a2, "");
        this.f146258g = (EditMentionStickerViewModel) a2;
    }

    @Override // com.ss.android.ugc.gamora.editor.a
    public final void F() {
        super.F();
        EditMentionStickerViewModel editMentionStickerViewModel = this.f146258g;
        if (editMentionStickerViewModel == null) {
            l.a("editMentionStickerViewModel");
        }
        editMentionStickerViewModel.a().observe(this, new d(this));
        EditMentionStickerViewModel editMentionStickerViewModel2 = this.f146258g;
        if (editMentionStickerViewModel2 == null) {
            l.a("editMentionStickerViewModel");
        }
        selectNonNullSubscribe(editMentionStickerViewModel2, p.f146265a, new ah(), new e(this));
        EditMentionStickerViewModel editMentionStickerViewModel3 = this.f146258g;
        if (editMentionStickerViewModel3 == null) {
            l.a("editMentionStickerViewModel");
        }
        b.a.b(this, editMentionStickerViewModel3, q.f146360a, new f(this));
    }

    static final class b extends m implements h.f.a.a<MentionStickerEditingLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(96134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MentionStickerEditingLayout invoke() {
            MethodCollector.i(3936);
            o oVar = this.this$0;
            if (oVar.o != null) {
                j jVar = oVar.o;
                if (jVar == null) {
                    l.b();
                }
                View inflate = ((ViewStub) jVar.c(R.id.fjs)).inflate();
                if (inflate != null) {
                    MentionStickerEditingLayout mentionStickerEditingLayout = (MentionStickerEditingLayout) inflate;
                    View findViewById = mentionStickerEditingLayout.findViewById(R.id.f1m);
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
                    MethodCollector.o(3936);
                    return mentionStickerEditingLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout");
                MethodCollector.o(3936);
                throw nullPointerException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Parent Scene is null".toString());
            MethodCollector.o(3936);
            throw illegalStateException;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f146264a;

        static {
            Covode.recordClassIndex(96136);
        }

        d(o oVar) {
            this.f146264a = oVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                ((a) this.f146264a).f145663b.a(f2.floatValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(com.bytedance.o.f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f146261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.g f146262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ab f146263c;

        static {
            Covode.recordClassIndex(96135);
        }

        c(o oVar, com.ss.android.ugc.asve.editor.g gVar, ab abVar) {
            this.f146261a = oVar;
            this.f146262b = gVar;
            this.f146263c = abVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            l.b(iVar, "");
            for (com.ss.android.ugc.aweme.editSticker.compile.b bVar : (List) iVar.d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(((a) this.f146261a).f145663b.f127582a, bVar.stickerPath, "", bVar.index, false, 0, this.f146262b.j(), 8);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f146263c.a(stickerItemModel);
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(96137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(bVar, "");
            this.this$0.a(booleanValue);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.b, z, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(96138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, z zVar) {
            l.d(bVar, "");
            l.d(zVar, "");
            ((a) this.this$0).f145663b.n();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.b
    public final b.i<z> a(com.ss.android.ugc.asve.editor.g gVar, ab abVar, h.f.a.b<? super String, String> bVar) {
        String str;
        l.d(gVar, "");
        l.d(abVar, "");
        if (J()) {
            if (bVar == null || (str = bVar.invoke("mention_sticker")) == null) {
                str = ((VideoPublishEditModel) this.f146260i.a(this, f146256e[0])).uniqueVideoSessionDir(L() + "/effect/mention_stickers" + File.separator + System.currentTimeMillis() + File.separator);
            }
            l.b(str, "");
            b.i<TContinuationResult> c2 = a(str, abVar.T().a(), abVar.T().b(), gVar.b().width, gVar.b().height).c(new c(this, gVar, abVar), b.i.f4826c);
            l.b(c2, "");
            return c2;
        }
        b.i<z> a2 = b.i.a(z.f158842a);
        l.b(a2, "");
        return a2;
    }
}
