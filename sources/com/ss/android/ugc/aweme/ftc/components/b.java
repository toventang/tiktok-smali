package com.ss.android.ugc.aweme.ftc.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.gamora.editor.rootscene.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f97754a;

    /* renamed from: b  reason: collision with root package name */
    private final h f97755b = i.a((h.f.a.a) new c(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f97756c = i.a((h.f.a.a) new C2358b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f97757d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(62107);
    }

    private final FTCEditToolbarViewModel a() {
        return (FTCEditToolbarViewModel) this.f97755b.getValue();
    }

    private final FTCEditCornerViewModel b() {
        return (FTCEditCornerViewModel) this.f97757d.getValue();
    }

    static final class a extends m implements h.f.a.a<FTCEditCornerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditCornerViewModel invoke() {
            return t.a(this.this$0.f97754a).a(FTCEditCornerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.b$b  reason: collision with other inner class name */
    static final class C2358b extends m implements h.f.a.a<FTCEditStickerViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2358b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditStickerViewModel invoke() {
            return t.a(this.this$0.f97754a).a(FTCEditStickerViewModel.class);
        }
    }

    static final class c extends m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return t.a(this.this$0.f97754a).a(FTCEditToolbarViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(boolean z) {
        int i2;
        FTCEditCornerViewModel b2 = b();
        if (z) {
            i2 = dh.c(this.f97754a);
        } else {
            i2 = 0;
        }
        b2.c(new FTCEditCornerViewModel.c(i2));
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void b(boolean z) {
        int c2 = com.ss.android.ugc.aweme.adaptation.a.c();
        FTCEditCornerViewModel b2 = b();
        if (!z) {
            c2 = 0;
        }
        b2.c(new FTCEditCornerViewModel.a(c2));
    }

    public b(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f97754a = eVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.e
    public final void a(int i2, int i3) {
        a().c(new FTCEditToolbarViewModel.k(i2));
        ((JediViewModel) this.f97756c.getValue()).c(new FTCEditStickerViewModel.d(Integer.valueOf(i2)));
        a().c(new FTCEditToolbarViewModel.g(i3));
    }
}
