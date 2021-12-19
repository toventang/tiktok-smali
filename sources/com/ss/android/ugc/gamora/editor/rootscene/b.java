package com.ss.android.ugc.gamora.editor.rootscene;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f146377a;

    /* renamed from: b  reason: collision with root package name */
    private final h f146378b = i.a((h.f.a.a) new c(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f146379c = i.a((h.f.a.a) new C3915b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f146380d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(96225);
    }

    private final EditToolbarViewModel a() {
        return (EditToolbarViewModel) this.f146378b.getValue();
    }

    private final EditCornerViewModel b() {
        return (EditCornerViewModel) this.f146380d.getValue();
    }

    static final class a extends m implements h.f.a.a<EditCornerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditCornerViewModel invoke() {
            return t.a(this.this$0.f146377a).a(EditCornerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.rootscene.b$b  reason: collision with other inner class name */
    static final class C3915b extends m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3915b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditStickerViewModel invoke() {
            return t.a(this.this$0.f146377a).a(EditStickerViewModel.class);
        }
    }

    static final class c extends m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return t.a(this.this$0.f146377a).a(EditToolbarViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(boolean z) {
        int i2;
        EditCornerViewModel b2 = b();
        if (z) {
            i2 = dh.c(this.f146377a);
        } else {
            i2 = 0;
        }
        b2.a(i2);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void b(boolean z) {
        int c2 = com.ss.android.ugc.aweme.adaptation.a.c();
        EditCornerViewModel b2 = b();
        if (!z) {
            c2 = 0;
        }
        b2.b(c2);
    }

    public b(e eVar) {
        l.d(eVar, "");
        this.f146377a = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(int i2, int i3) {
        a().c(new EditToolbarViewModel.p(i2));
        ((EditStickerViewModel) this.f146379c.getValue()).a(Integer.valueOf(i2));
        a().c(new EditToolbarViewModel.j(i3));
    }
}
