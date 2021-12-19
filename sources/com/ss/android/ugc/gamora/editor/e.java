package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import h.f.b.m;
import h.h;
import h.i;

public final class e implements w.a {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f145802a;

    /* renamed from: b  reason: collision with root package name */
    private final h f145803b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final VideoPublishEditModel f145804c;

    static {
        Covode.recordClassIndex(95797);
    }

    private final EditToolbarViewModel h() {
        return (EditToolbarViewModel) this.f145803b.getValue();
    }

    static final class a extends m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(95798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            return t.a(this.this$0.f145802a).a(EditToolbarViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void a() {
        h().c(2, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void c() {
        h().c(4, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void e() {
        EditPhotoCanvasPromptViewModel.a.a(this.f145802a).a();
        w.b("canvas_gesture");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void f() {
        h().c(15, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void g() {
        h().c(3, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void d() {
        if (bp.f(this.f145804c)) {
            h().c(6, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void b() {
        if (!com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.b(this.f145804c) || !bp.a()) {
            h().c(1, true);
            return;
        }
        h().f146975a.f145947a = true;
        if (l.f115658a.b().h() || !h().f146975a.f145948b) {
            h().c(1, true);
        } else {
            h().a(true);
        }
    }

    public e(androidx.fragment.app.e eVar, VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(videoPublishEditModel, "");
        this.f145802a = eVar;
        this.f145804c = videoPublishEditModel;
    }
}
