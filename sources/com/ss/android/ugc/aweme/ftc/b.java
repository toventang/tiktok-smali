package com.ss.android.ugc.aweme.ftc;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements w.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f97445a;

    /* renamed from: b  reason: collision with root package name */
    private final h f97446b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final VideoPublishEditModel f97447c;

    static {
        Covode.recordClassIndex(61920);
    }

    private final FTCEditToolbarViewModel h() {
        return (FTCEditToolbarViewModel) this.f97446b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void e() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void f() {
    }

    static final class a extends m implements h.f.a.a<FTCEditToolbarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditToolbarViewModel invoke() {
            return t.a(this.this$0.f97445a).a(FTCEditToolbarViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void a() {
        h().c(2, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void b() {
        h().c(1, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void g() {
        h().c(3, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.w.a
    public final void d() {
        if (bp.f(this.f97447c)) {
            h().c(6, true);
        }
    }

    public b(e eVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(eVar, "");
        l.d(videoPublishEditModel, "");
        this.f97445a = eVar;
        this.f97447c = videoPublishEditModel;
    }
}
