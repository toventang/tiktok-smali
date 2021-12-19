package com.ss.android.ugc.gamora.editor.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.q.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public class b extends com.bytedance.ui_component.b<EditMusicViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146202a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146203b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146204c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditMusicViewModel> f146205d = C3906b.f146207a;

    /* renamed from: e  reason: collision with root package name */
    private final f f146206e;

    static {
        Covode.recordClassIndex(96092);
    }

    private final c a() {
        return (c) this.f146204c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditMusicViewModel> b() {
        return this.f146205d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146202a;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f146206e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.b$b  reason: collision with other inner class name */
    static final class C3906b extends m implements h.f.a.a<EditMusicViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3906b f146207a = new C3906b();

        static {
            Covode.recordClassIndex(96094);
        }

        C3906b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer());
            this.this$0.f146202a.a(this.this$0.f146203b, cVar, "MusicScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        c a2 = a();
        a2.b().d();
        try {
            VideoPublishEditModel d2 = a2.d();
            a2.b();
            bl.a(d2, e.a());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        c a2 = a();
        g value = a2.C().C().getValue();
        if (a2.b().t == null) {
            a2.b().t = value;
        }
        a2.b().c();
        a2.F();
        EditMusicViewModel editMusicViewModel = a2.f146213e;
        if (editMusicViewModel == null) {
            l.a("musicViewModel");
        }
        editMusicViewModel.a(bp.m(a2.d()));
        a2.b().a(1, true);
        aa.d dVar = a2.b().f129948f;
        if (dVar != null) {
            dVar.k();
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146206e = fVar;
        this.f146202a = bVar;
    }
}
