package com.ss.android.ugc.gamora.editor.sticker.info;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.z;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.p;
import h.u;
import java.util.Iterator;

public final class EditInfoStickerViewModel extends LifecycleAwareViewModel<EditInfoStickerState> implements a {

    /* renamed from: a  reason: collision with root package name */
    public c f146639a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f146640b = i.a((h.f.a.a) new g(this));

    static {
        Covode.recordClassIndex(96510);
    }

    private com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i k() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i) this.f146640b.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a() {
        d(f.f146643a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void i() {
        c(c.f146641a);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void j() {
        d(d.f146642a);
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i> {
        final /* synthetic */ EditInfoStickerViewModel this$0;

        static {
            Covode.recordClassIndex(96517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(EditInfoStickerViewModel editInfoStickerViewModel) {
            super(0);
            this.this$0 = editInfoStickerViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i invoke() {
            c cVar = this.this$0.f146639a;
            if (cVar == null) {
                l.a("scene");
            }
            return cVar.E();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final Object c() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        return cVar.E().K;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditInfoStickerState(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final com.ss.android.ugc.aweme.editSticker.interact.d h() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        return cVar.E();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void b() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.E().g();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final boolean f() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d != null) {
            return E.f127155d.x;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final boolean g() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d != null) {
            return E.f127155d.y;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void e() {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.c cVar2 = E.f127155d.f127073g;
            if (!com.bytedance.common.utility.h.a(cVar2.f127131a)) {
                Iterator<aj> it = cVar2.f127131a.iterator();
                while (it.hasNext()) {
                    aj next = it.next();
                    cVar2.f127135e.g(next.f127114c.getId());
                    it.remove();
                    if (cVar2.f127136f != null) {
                        cVar2.f127136f.b(next.f127114c);
                    }
                }
                cVar2.f127132b = null;
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(p<Integer, Integer> pVar) {
        l.d(pVar, "");
        c(new e(pVar));
    }

    public static final class b extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {
        final /* synthetic */ StickerItemModel $item;

        static {
            Covode.recordClassIndex(96512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(StickerItemModel stickerItemModel) {
            super(1);
            this.$item = stickerItemModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, new com.bytedance.jedi.arch.d(this.$item), null, null, null, 119, null);
        }
    }

    static final class c extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f146641a = new c();

        static {
            Covode.recordClassIndex(96513);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, 125, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146642a = new d();

        static {
            Covode.recordClassIndex(96514);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), 63, null);
        }
    }

    static final class e extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {
        final /* synthetic */ p $value;

        static {
            Covode.recordClassIndex(96515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p pVar) {
            super(1);
            this.$value = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, new n(this.$value), null, null, null, null, 123, null);
        }
    }

    static final class f extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f146643a = new f();

        static {
            Covode.recordClassIndex(96516);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, new a.b(), null, null, null, null, null, null, 126, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(com.ss.android.ugc.aweme.editSticker.interact.h<?> hVar) {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.E().a(true, (com.ss.android.ugc.aweme.editSticker.interact.h) hVar);
    }

    public static final class a extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {
        final /* synthetic */ long $duration = 300;
        final /* synthetic */ float $toY;

        static {
            Covode.recordClassIndex(96511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f2) {
            super(1);
            this.$toY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, new n(new p(Float.valueOf(this.$toY), Long.valueOf(this.$duration))), null, null, 111, null);
        }
    }

    public static final class h extends m implements h.f.a.b<EditInfoStickerState, EditInfoStickerState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(96518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditInfoStickerState invoke(EditInfoStickerState editInfoStickerState) {
            EditInfoStickerState editInfoStickerState2 = editInfoStickerState;
            l.d(editInfoStickerState2, "");
            return EditInfoStickerState.copy$default(editInfoStickerState2, null, null, null, null, null, new o(new u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, 95, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void b(com.ss.android.ugc.aweme.editSticker.interact.h<?> hVar) {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        cVar.E().a((com.ss.android.ugc.aweme.editSticker.interact.h) hVar);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(boolean z) {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d != null) {
            InfoStickerEditView infoStickerEditView = E.f127155d;
            infoStickerEditView.f127075i = z;
            if (!z && infoStickerEditView.f127073g.f127132b != null) {
                infoStickerEditView.f127073g.b();
                infoStickerEditView.E.b();
                infoStickerEditView.f127073g.a();
                infoStickerEditView.invalidate();
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final boolean a(int i2) {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        return cVar.E().a(i2);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(int i2, boolean z) {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i k2 = k();
        if (!(k2.u == null || k2.u.infoStickerModel == null || com.bytedance.common.utility.h.a(k2.u.infoStickerModel.stickers))) {
            for (StickerItemModel stickerItemModel : k2.u.infoStickerModel.stickers) {
                p<Integer, Integer> a2 = com.ss.android.ugc.aweme.shortvideo.util.aj.a(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i2);
                stickerItemModel.uiStartTime = a2.getFirst().intValue();
                stickerItemModel.uiEndTime = a2.getSecond().intValue();
                if (k2.s != null) {
                    stickerItemModel.startTime = k2.s.s(a2.getFirst().intValue());
                    stickerItemModel.endTime = k2.s.s(a2.getSecond().intValue());
                }
            }
        }
        if (z) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i k3 = k();
            if (k3.f127155d != null) {
                InfoStickerEditView infoStickerEditView = k3.f127155d;
                for (aj ajVar : infoStickerEditView.f127073g.f127131a) {
                    if (ajVar.f127114c.isPin) {
                        infoStickerEditView.H.a(ajVar);
                        infoStickerEditView.a(ajVar);
                        ajVar.f127114c.setPin(false);
                        com.ss.android.ugc.tools.utils.i.b(ajVar.f127114c.pinAlgorithmFile);
                        ajVar.f127114c.setPinAlgorithmFile(null);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(int i2, int i3, int[] iArr) {
        l.d(iArr, "");
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        l.d(iArr, "");
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.s != null) {
            E.A.post(new z(E, i2, i3, iArr));
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(String str, String str2, String str3, int i2) {
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d.getStickNumber() >= E.r) {
            new com.ss.android.ugc.aweme.tux.a.i.a(E.f127155d.getContext()).a(R.string.cn6).a();
            return;
        }
        InfoStickerEditView infoStickerEditView = E.f127155d;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.c cVar2 = infoStickerEditView.f127073g;
        if (cVar2.f127132b != null && cVar2.f127132b.f127115d) {
            cVar2.f127132b.f127115d = false;
        }
        cVar2.a(str, str2, str3, i2, cVar2.f127135e.a(str2, TextUtils.isEmpty(str3) ? null : new String[]{str3}), 0.0f, 0.0f, 1.0f, 1.0f, false);
        infoStickerEditView.invalidate();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.info.a
    public final void a(String str, String str2, int i2, int i3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        c cVar = this.f146639a;
        if (cVar == null) {
            l.a("scene");
        }
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i E = cVar.E();
        if (E.f127155d.getStickNumber() >= E.r) {
            new com.ss.android.ugc.aweme.tux.a.i.a(E.f127155d.getContext()).a(R.string.cn6).a();
            return;
        }
        InfoStickerEditView infoStickerEditView = E.f127155d;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.c cVar2 = infoStickerEditView.f127073g;
        float[] fArr = i2 > i3 ? new float[]{280.0f, (((float) i3) * 280.0f) / ((float) i2)} : new float[]{(((float) i2) * 280.0f) / ((float) i3), 280.0f};
        float f2 = fArr[0] / ((float) cVar2.f127134d.f127069c);
        float f3 = fArr[1] / ((float) cVar2.f127134d.f127070d);
        float f4 = (1.0f - f2) / 2.0f;
        float f5 = (1.0f - f3) / 2.0f;
        aj a2 = cVar2.a(str, str2, null, 11, cVar2.f127135e.a(str2, f4, f5, f2, f3), f4, f5, f2, f3, z);
        if (a2 != null) {
            a2.f127124m = true;
        }
        infoStickerEditView.invalidate();
    }
}
