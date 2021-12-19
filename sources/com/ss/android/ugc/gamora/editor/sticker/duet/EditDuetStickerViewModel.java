package com.ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.vesdk.VESize;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class EditDuetStickerViewModel extends LifecycleAwareViewModel<EditDuetStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f146613a;

    /* renamed from: b  reason: collision with root package name */
    private final h f146614b = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(96487);
    }

    private final c k() {
        return (c) this.f146614b.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void a() {
        this.f146613a.c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void b() {
        c(b.f146615a);
    }

    static final class c extends m implements h.f.a.a<c> {
        final /* synthetic */ EditDuetStickerViewModel this$0;

        static {
            Covode.recordClassIndex(96490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditDuetStickerViewModel editDuetStickerViewModel) {
            super(0);
            this.this$0 = editDuetStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return this.this$0.f146613a.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void c() {
        k().d().q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditDuetStickerState(null, null, 0.0f, null, 15, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void e() {
        k().d().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final InteractStickerStruct g() {
        return k().d().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d h() {
        return k().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final boolean i() {
        return k().d().b();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final boolean j() {
        return k().d().a();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void f() {
        c k2 = k();
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(k2.a().getMainBusinessContext(), 16, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        k2.d().a(k2.b().C().getValue(), k2.b());
        if (a2 != null && !a2.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a2.get(0);
            l.b(interactStickerStruct, "");
            if (interactStickerStruct.getDuetStickerStruct() != null) {
                k2.d().a(a2.get(0));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void a(float f2) {
        c(new d(f2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void b(String str) {
        l.d(str, "");
        k().d().f127310c = str;
    }

    static final class a extends m implements h.f.a.b<EditDuetStickerState, EditDuetStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            l.d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, null, Boolean.valueOf(this.$value), 0.0f, null, 13, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditDuetStickerState, EditDuetStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146615a = new b();

        static {
            Covode.recordClassIndex(96489);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            l.d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, new p(), null, 0.0f, null, 14, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditDuetStickerState, EditDuetStickerState> {
        final /* synthetic */ float $value;

        static {
            Covode.recordClassIndex(96491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f2) {
            super(1);
            this.$value = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditDuetStickerState invoke(EditDuetStickerState editDuetStickerState) {
            EditDuetStickerState editDuetStickerState2 = editDuetStickerState;
            l.d(editDuetStickerState2, "");
            return EditDuetStickerState.copy$default(editDuetStickerState2, null, null, this.$value, null, 11, null);
        }
    }

    public EditDuetStickerViewModel(b bVar) {
        l.d(bVar, "");
        this.f146613a = bVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void a(VESize vESize) {
        l.d(vESize, "");
        k().a(vESize);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void a(String str) {
        l.d(str, "");
        k().d().f127309b = str;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.duet.a
    public final void a(boolean z) {
        c(new a(z));
    }
}
