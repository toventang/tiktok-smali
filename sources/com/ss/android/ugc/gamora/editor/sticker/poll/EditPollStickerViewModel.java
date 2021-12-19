package com.ss.android.ugc.gamora.editor.sticker.poll;

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

public final class EditPollStickerViewModel extends LifecycleAwareViewModel<EditPollStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f146753a;

    /* renamed from: b  reason: collision with root package name */
    private final h f146754b = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(96639);
    }

    private final c m() {
        return (c) this.f146754b.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void a() {
        this.f146753a.c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void b() {
        c(b.f146755a);
    }

    static final class c extends m implements h.f.a.a<c> {
        final /* synthetic */ EditPollStickerViewModel this$0;

        static {
            Covode.recordClassIndex(96642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditPollStickerViewModel editPollStickerViewModel) {
            super(0);
            this.this$0 = editPollStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return this.this$0.f146753a.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void c() {
        m().d().q();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditPollStickerState(null, null, 0.0f, null, 15, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void e() {
        m().d().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final InteractStickerStruct g() {
        return m().d().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final boolean h() {
        return m().d().B;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d i() {
        return m().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final String j() {
        return m().d().f127512b;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final boolean k() {
        return m().d().b();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final boolean l() {
        return m().d().a();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void f() {
        c m2 = m();
        List<InteractStickerStruct> a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(m2.a().getMainBusinessContext(), 1, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        m2.d().a(m2.b().C().getValue(), m2.b());
        if (a2 != null && !a2.isEmpty()) {
            InteractStickerStruct interactStickerStruct = a2.get(0);
            l.b(interactStickerStruct, "");
            if (interactStickerStruct.getPollStruct() != null) {
                m2.d().a(a2.get(0));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void a(float f2) {
        c(new d(f2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void b(String str) {
        l.d(str, "");
        m().d().f127513c = str;
    }

    static final class a extends m implements h.f.a.b<EditPollStickerState, EditPollStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            l.d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, null, Boolean.valueOf(this.$value), 0.0f, null, 13, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<EditPollStickerState, EditPollStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146755a = new b();

        static {
            Covode.recordClassIndex(96641);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            l.d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, new p(), null, 0.0f, null, 14, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditPollStickerState, EditPollStickerState> {
        final /* synthetic */ float $value;

        static {
            Covode.recordClassIndex(96643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f2) {
            super(1);
            this.$value = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditPollStickerState invoke(EditPollStickerState editPollStickerState) {
            EditPollStickerState editPollStickerState2 = editPollStickerState;
            l.d(editPollStickerState2, "");
            return EditPollStickerState.copy$default(editPollStickerState2, null, null, this.$value, null, 11, null);
        }
    }

    public EditPollStickerViewModel(b bVar) {
        l.d(bVar, "");
        this.f146753a = bVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void a(VESize vESize) {
        l.d(vESize, "");
        m().a(vESize);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void a(String str) {
        l.d(str, "");
        m().d().f127512b = str;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.poll.a
    public final void a(boolean z) {
        c(new a(z));
    }
}
