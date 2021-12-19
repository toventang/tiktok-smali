package com.ss.android.ugc.gamora.editor.sticker.qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.vesdk.VESize;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;

public final class EditPageQaStickerViewModel extends LifecycleAwareViewModel<EditQaStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f146781a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qasticker.a f146782b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146783c = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(96665);
    }

    public final c k() {
        return (c) this.f146783c.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a() {
        this.f146781a.c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void b() {
        c(b.f146784a);
    }

    static final class c extends m implements h.f.a.a<c> {
        final /* synthetic */ EditPageQaStickerViewModel this$0;

        static {
            Covode.recordClassIndex(96668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditPageQaStickerViewModel editPageQaStickerViewModel) {
            super(0);
            this.this$0 = editPageQaStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return this.this$0.f146781a.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void c() {
        k().d().q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditQaStickerState(null, null, null, 0.0f, 15, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void e() {
        k().d().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final InteractStickerStruct h() {
        return k().d().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final boolean i() {
        return k().d().b();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void g() {
        c k2 = k();
        if (k2.a().qaStruct != null) {
            QaStruct qaStruct = k2.a().qaStruct;
            l.b(qaStruct, "");
            k2.a(qaStruct);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void j() {
        r.a("click_ask_sticker", this.f146782b.a().a("user_id", g.a().A().c()).a("enter_method", "click_main_panel").f149193a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void f() {
        c k2 = k();
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(k2.a().getMainBusinessContext(), 12, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        k2.d().a(k2.b().C().getValue(), k2.b());
        if (a2 != null && !a2.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a2.get(0);
            l.b(interactStickerStruct, "");
            if (interactStickerStruct.getQaStruct() != null) {
                k2.a().hasQaSticker = true;
                com.ss.android.ugc.gamora.editor.lightening.a.a C = k2.C();
                if (C != null) {
                    C.f();
                }
                k2.d().a(a2.get(0));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a(float f2) {
        c(new d(f2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void b(String str) {
        l.d(str, "");
        k().d().A = str;
    }

    static final class a extends m implements h.f.a.b<EditQaStickerState, EditQaStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            l.d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, null, Boolean.valueOf(this.$value), 0.0f, 11, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditQaStickerState, EditQaStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146784a = new b();

        static {
            Covode.recordClassIndex(96667);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            l.d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, new p(), null, 0.0f, 13, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditQaStickerState, EditQaStickerState> {
        final /* synthetic */ float $value;

        static {
            Covode.recordClassIndex(96669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f2) {
            super(1);
            this.$value = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditQaStickerState invoke(EditQaStickerState editQaStickerState) {
            EditQaStickerState editQaStickerState2 = editQaStickerState;
            l.d(editQaStickerState2, "");
            return EditQaStickerState.copy$default(editQaStickerState2, null, null, null, this.$value, 7, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a(QaStruct qaStruct) {
        l.d(qaStruct, "");
        if (!g.a().A().a()) {
            k().a(qaStruct);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a(VESize vESize) {
        l.d(vESize, "");
        k().a(vESize);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a(String str) {
        l.d(str, "");
        k().d().f127564c = str;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final void a(boolean z) {
        c(new a(z));
    }

    public EditPageQaStickerViewModel(b bVar, com.ss.android.ugc.aweme.qasticker.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f146781a = bVar;
        this.f146782b = aVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.qa.a
    public final b.i<z> a(com.ss.android.ugc.asve.editor.g gVar, ab abVar, h.f.a.b<? super String, String> bVar) {
        l.d(gVar, "");
        l.d(abVar, "");
        return k().a(gVar, abVar, bVar);
    }
}
