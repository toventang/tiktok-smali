package com.ss.android.ugc.aweme.music.assem.video;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.assem.h;
import com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class b extends a implements m {

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f111284j;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.b$b  reason: collision with other inner class name */
    public static final class C2851b extends h.f.b.m implements h.f.a.b<e, e> {
        public static final C2851b INSTANCE = new C2851b();

        static {
            Covode.recordClassIndex(71519);
        }

        public C2851b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(71517);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    /* access modifiers changed from: package-private */
    public final MusicPlayViewModel u() {
        return (MusicPlayViewModel) this.f111284j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return this.f25594h;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return u().f111277l;
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        super.l();
        a(true);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        Context ar_ = ar_();
        if (!(ar_ instanceof androidx.fragment.app.e)) {
            ar_ = null;
        }
        return (androidx.fragment.app.e) ar_;
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        super.j();
        u().l();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        a(false);
        MusicPlayViewModel u = u();
        u.f111276k = null;
        u.f111275j = null;
    }

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        c cVar = new c(this);
        h.k.c a2 = ab.a(MusicPlayViewModel.class);
        a aVar = new a(a2);
        C2851b bVar2 = C2851b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), cVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), cVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), cVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f111284j = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        u().a(z);
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null) {
                if (aVar2.f25631b.booleanValue()) {
                    this.this$0.u().l();
                } else {
                    this.this$0.a(true);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        DataCenter dataCenter = null;
        if (a2 != null) {
            dataCenter = DataCenter.a(ae.a(a2, (ad.b) null), this);
        }
        MusicPlayViewModel u = u();
        l.d(this, "");
        u.f111275j = new MusicDownloadPlayHelper(this);
        MusicDownloadPlayHelper musicDownloadPlayHelper = u.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.b();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = u.f111275j;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.f111798h = new MusicPlayViewModel.c(dataCenter);
        }
        u.f111276k = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("music_loading", (androidx.lifecycle.u<com.ss.android.ugc.aweme.arch.widgets.base.b>) u);
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(h.class), c.f111291a, new e(this));
    }

    public static final class d extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f111285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig f111286b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f111287c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f111288d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f111289e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MusicModel f111290f;

        static {
            Covode.recordClassIndex(71521);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f111285a, this.f111286b, this.f111290f, true);
        }

        d(Activity activity, RecordConfig recordConfig, b bVar, String str, String str2, MusicModel musicModel) {
            this.f111285a = activity;
            this.f111286b = recordConfig;
            this.f111287c = bVar;
            this.f111288d = str;
            this.f111289e = str2;
            this.f111290f = musicModel;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, MusicModel musicModel, String str2) {
        Activity i2;
        if (musicModel != null && (i2 = i()) != null) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            if (str2 == null) {
                l.b();
            }
            RecordConfig.Builder musicOrigin = builder.musicOrigin(str2);
            if (str == null) {
                l.b();
            }
            RecordConfig.Builder musicPath = musicOrigin.musicPath(str);
            if (!u().i()) {
                musicPath.shootFrom("others_homepage");
            }
            AVExternalServiceImpl.a().asyncService("OriginMusic", new d(i2, musicPath.build(), this, str2, str, musicModel));
        }
    }
}
