package com.ss.android.ugc.gamora.editor.multiedit;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends com.bytedance.ui_component.b<MultiEditViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146177a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146178b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f146179c = i.a((h.f.a.a) a.f146183a);

    /* renamed from: d  reason: collision with root package name */
    private final h f146180d = i.a((h.f.a.a) new C3904b(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<MultiEditViewModel> f146181e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f146182f;

    static {
        Covode.recordClassIndex(96066);
    }

    private final c f() {
        return (c) this.f146180d.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f a() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f) this.f146179c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<MultiEditViewModel> b() {
        return this.f146181e;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146177a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146182f;
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146183a = new a();

        static {
            Covode.recordClassIndex(96067);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f();
        }
    }

    static final class c extends m implements h.f.a.a<MultiEditViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiEditViewModel invoke() {
            return new MultiEditViewModel(this.this$0.a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.b$b  reason: collision with other inner class name */
    static final class C3904b extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(96068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3904b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer(), this.this$0.a());
            this.this$0.f146177a.a(this.this$0.f146178b, cVar, "MultiEditVideoScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        this.f146177a.e(f());
        c f2 = f();
        g value = f2.F().C().getValue();
        if (f2.f146186c == null) {
            f2.f146186c = value;
            f2.f146188e.a(f2.f146186c);
        }
        VideoPublishEditModel E = f2.E();
        if (!(E == null || E.getCurMultiEditVideoRecordData() == null || k.a(E.getCurMultiEditVideoRecordData().segmentDataList))) {
            E.copyMultiEditMusicInfo();
            f2.f146188e.a(E);
        }
        f2.f146188e.b();
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f146182f = fVar;
        this.f146177a = bVar;
    }
}
