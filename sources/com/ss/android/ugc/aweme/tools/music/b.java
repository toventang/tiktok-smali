package com.ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.port.in.ar;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;

public final class b implements ar {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.a f140369a;

    static {
        Covode.recordClassIndex(91698);
    }

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.j.a f140370a;

        static {
            Covode.recordClassIndex(91699);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final boolean bN_() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void c(MusicModel musicModel) {
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final MusicModel h() {
            return this.f140370a.a();
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final Activity i() {
            return this.f140370a.b();
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void r() {
            this.f140370a.c();
        }

        a(com.ss.android.ugc.aweme.music.j.a aVar) {
            this.f140370a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(MusicModel musicModel, long j2) {
            this.f140370a.a(musicModel, j2);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(MusicModel musicModel, Exception exc) {
            this.f140370a.a(musicModel, exc);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(String str, MusicModel musicModel, String str2) {
            this.f140370a.a(str, musicModel, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void a() {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.ao_();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void b() {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void c() {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void d() {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void a(MusicModel musicModel) {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.a(musicModel, 11, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void a(com.ss.android.ugc.aweme.music.j.a aVar) {
        l.d(aVar, "");
        this.f140369a = MusicService.m().b(new a(aVar));
    }

    @Override // com.ss.android.ugc.aweme.port.in.ar
    public final void a(MusicModel musicModel, boolean z) {
        com.ss.android.ugc.aweme.music.a aVar = this.f140369a;
        if (aVar != null) {
            aVar.a(musicModel, 11, z, false);
        }
    }
}
