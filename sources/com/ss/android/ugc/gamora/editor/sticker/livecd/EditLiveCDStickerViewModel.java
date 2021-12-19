package com.ss.android.ugc.gamora.editor.sticker.livecd;

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

public final class EditLiveCDStickerViewModel extends LifecycleAwareViewModel<EditLiveCDStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f146673a;

    /* renamed from: b  reason: collision with root package name */
    private final h f146674b = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(96554);
    }

    private final c l() {
        return (c) this.f146674b.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void a() {
        c(c.f146676a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void b() {
        this.f146673a.c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void h() {
        c(b.f146675a);
    }

    static final class d extends m implements h.f.a.a<c> {
        final /* synthetic */ EditLiveCDStickerViewModel this$0;

        static {
            Covode.recordClassIndex(96558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(EditLiveCDStickerViewModel editLiveCDStickerViewModel) {
            super(0);
            this.this$0 = editLiveCDStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return this.this$0.f146673a.a();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d c() {
        return l().d();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditLiveCDStickerState(null, null, 0.0f, null, null, 31, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void e() {
        l().d().d();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final InteractStickerStruct f() {
        return l().d().c();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final boolean g() {
        return l().d().a();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final boolean i() {
        return l().d().b();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void j() {
        l().d().q();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final boolean k() {
        return l().d().A;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void a(float f2) {
        c(new e(f2));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void b(String str) {
        l.d(str, "");
        l().d().f127467b = str;
    }

    static final class a extends m implements h.f.a.b<EditLiveCDStickerState, EditLiveCDStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            l.d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, Boolean.valueOf(this.$value), 0.0f, null, null, 29, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146675a = new b();

        static {
            Covode.recordClassIndex(96556);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            l.d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, new p(), null, 0.0f, null, null, 30, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditLiveCDStickerState, EditLiveCDStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f146676a = new c();

        static {
            Covode.recordClassIndex(96557);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            l.d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, null, 0.0f, new p(), null, 23, null);
        }
    }

    static final class e extends m implements h.f.a.b<EditLiveCDStickerState, EditLiveCDStickerState> {
        final /* synthetic */ float $value;

        static {
            Covode.recordClassIndex(96559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(float f2) {
            super(1);
            this.$value = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditLiveCDStickerState invoke(EditLiveCDStickerState editLiveCDStickerState) {
            EditLiveCDStickerState editLiveCDStickerState2 = editLiveCDStickerState;
            l.d(editLiveCDStickerState2, "");
            return EditLiveCDStickerState.copy$default(editLiveCDStickerState2, null, null, this.$value, null, null, 27, null);
        }
    }

    public EditLiveCDStickerViewModel(b bVar) {
        l.d(bVar, "");
        this.f146673a = bVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void a(VESize vESize) {
        l.d(vESize, "");
        l().a(vESize);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void a(String str) {
        l.d(str, "");
        l().d().f127466a = str;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.livecd.a
    public final void a(boolean z) {
        c(new a(z));
    }
}
