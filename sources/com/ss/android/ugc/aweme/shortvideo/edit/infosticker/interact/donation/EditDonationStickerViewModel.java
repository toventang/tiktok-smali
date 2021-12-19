package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class EditDonationStickerViewModel extends BaseJediViewModel<EditDonationStickerState> {

    /* renamed from: a  reason: collision with root package name */
    public t<Boolean> f127217a;

    /* renamed from: b  reason: collision with root package name */
    private final h f127218b = i.a((h.f.a.a) c.f127220a);

    static {
        Covode.recordClassIndex(83449);
    }

    public final t<Float> a() {
        return (t) this.f127218b.getValue();
    }

    static final class c extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f127220a = new c();

        static {
            Covode.recordClassIndex(83452);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Float> invoke() {
            return new t();
        }
    }

    public final void b() {
        c(a.f127219a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditDonationStickerState(null, false, 3, null);
    }

    static final class b extends m implements h.f.a.b<EditDonationStickerState, EditDonationStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(83451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditDonationStickerState invoke(EditDonationStickerState editDonationStickerState) {
            EditDonationStickerState editDonationStickerState2 = editDonationStickerState;
            l.d(editDonationStickerState2, "");
            return EditDonationStickerState.copy$default(editDonationStickerState2, null, this.$value, 1, null);
        }
    }

    static final class a extends m implements h.f.a.b<EditDonationStickerState, EditDonationStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f127219a = new a();

        static {
            Covode.recordClassIndex(83450);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditDonationStickerState invoke(EditDonationStickerState editDonationStickerState) {
            EditDonationStickerState editDonationStickerState2 = editDonationStickerState;
            l.d(editDonationStickerState2, "");
            return EditDonationStickerState.copy$default(editDonationStickerState2, new p(), false, 2, null);
        }
    }

    public final void a(float f2) {
        a().setValue(Float.valueOf(f2));
    }

    public final void a(boolean z) {
        c(new b(z));
        t<Boolean> tVar = this.f127217a;
        if (tVar != null && (!l.a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
