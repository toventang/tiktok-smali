package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.os.Handler;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.x;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public VEVideoCutterViewModel f127894a;

    /* renamed from: b  reason: collision with root package name */
    public d f127895b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c f127896c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a f127897d;

    /* renamed from: e  reason: collision with root package name */
    public int f127898e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f127899f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f127900g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f127901h = new Handler();

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a f127902i = new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(0, x.f.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: j  reason: collision with root package name */
    public final t f127903j = new t(this);

    /* renamed from: k  reason: collision with root package name */
    private CutMultiVideoViewModel f127904k;

    /* renamed from: l  reason: collision with root package name */
    private VideoEditViewModel f127905l;

    /* renamed from: m  reason: collision with root package name */
    private CutVideoSpeedViewModel f127906m;

    static {
        Covode.recordClassIndex(83829);
    }

    public final void a() {
        this.f127901h.removeCallbacks(this.f127903j);
    }

    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127926a;

        static {
            Covode.recordClassIndex(83849);
        }

        public final void run() {
            this.f127926a.a(false);
            this.f127926a.f127901h.postDelayed(this, 30);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(e eVar) {
            this.f127926a = eVar;
        }
    }

    public final long b() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127897d;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        return aVar.a().getLeftSeekingValue();
    }

    public final long c() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127897d;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        return aVar.a().getRightSeekingValue();
    }

    public final void d() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c cVar = this.f127896c;
        if (cVar == null) {
            h.f.b.l.a("multiEditVideoObserversListener");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127897d;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        F f2 = aVar.a().getPlayBoundary().f2397a;
        if (f2 == null) {
            h.f.b.l.b();
        }
        long longValue = f2.longValue();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar2 = this.f127897d;
        if (aVar2 == null) {
            h.f.b.l.a("viewManager");
        }
        S s2 = aVar2.a().getPlayBoundary().f2398b;
        if (s2 == null) {
            h.f.b.l.b();
        }
        cVar.a(longValue, s2.longValue());
    }

    public static final class n implements VideoEditViewModel.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127920a;

        static {
            Covode.recordClassIndex(83843);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(e eVar) {
            this.f127920a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.a
        public final void a(VideoSegment videoSegment) {
            if (this.f127920a.f127900g) {
                e.d(this.f127920a).a(videoSegment);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.a
        public final void b(VideoSegment videoSegment) {
            if (this.f127920a.f127900g) {
                e.d(this.f127920a).b(videoSegment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127914a;

        static {
            Covode.recordClassIndex(83837);
        }

        h(e eVar) {
            this.f127914a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            e.d(this.f127914a).c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127918a;

        static {
            Covode.recordClassIndex(83841);
        }

        l(e eVar) {
            this.f127918a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            e.b(this.f127918a).a((androidx.core.g.e) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127921a;

        static {
            Covode.recordClassIndex(83844);
        }

        o(e eVar) {
            this.f127921a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127921a.f127900g) {
                e.b(this.f127921a).d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127922a;

        static {
            Covode.recordClassIndex(83845);
        }

        p(e eVar) {
            this.f127922a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127922a.f127900g) {
                e.b(this.f127922a).b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127923a;

        static {
            Covode.recordClassIndex(83846);
        }

        q(e eVar) {
            this.f127923a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127923a.f127900g) {
                e.b(this.f127923a).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127924a;

        static {
            Covode.recordClassIndex(83847);
        }

        r(e eVar) {
            this.f127924a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127924a.f127900g) {
                e.b(this.f127924a).a();
            }
        }
    }

    public static final /* synthetic */ d a(e eVar) {
        d dVar = eVar.f127895b;
        if (dVar == null) {
            h.f.b.l.a("editorPresenter");
        }
        return dVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c b(e eVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c cVar = eVar.f127896c;
        if (cVar == null) {
            h.f.b.l.a("multiEditVideoObserversListener");
        }
        return cVar;
    }

    public static final /* synthetic */ VEVideoCutterViewModel c(e eVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = eVar.f127894a;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a d(e eVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = eVar.f127897d;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127917a;

        static {
            Covode.recordClassIndex(83840);
        }

        k(e eVar) {
            this.f127917a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 != null) {
                e.b(this.f127917a).a(f2.floatValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127925a;

        static {
            Covode.recordClassIndex(83848);
        }

        s(e eVar) {
            this.f127925a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (this.f127925a.f127900g) {
                e.b(this.f127925a).a(num);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c cVar) {
        h.f.b.l.d(cVar, "");
        this.f127896c = cVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127908a;

        static {
            Covode.recordClassIndex(83831);
        }

        b(e eVar) {
            this.f127908a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f127908a.f127900g && bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                e.c(this.f127908a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(e.d(this.f127908a).a().getPlayingPosition(), x.f.EDITOR_SEEK_FLAG_LastSeek));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127909a;

        static {
            Covode.recordClassIndex(83832);
        }

        c(e eVar) {
            this.f127909a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (this.f127909a.f127900g && l2 != null) {
                l2.longValue();
                e.c(this.f127909a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(l2.longValue(), x.f.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127910a;

        static {
            Covode.recordClassIndex(83833);
        }

        d(e eVar) {
            this.f127910a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127910a.f127900g) {
                e.c(this.f127910a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f127910a.b(), x.f.EDITOR_SEEK_FLAG_OnGoing));
                e.d(this.f127910a).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$e  reason: collision with other inner class name */
    public static final class C3335e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127911a;

        static {
            Covode.recordClassIndex(83834);
        }

        C3335e(e eVar) {
            this.f127911a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127911a.f127900g) {
                e.c(this.f127911a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f127911a.c(), x.f.EDITOR_SEEK_FLAG_OnGoing));
                e.d(this.f127911a).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127912a;

        static {
            Covode.recordClassIndex(83835);
        }

        f(e eVar) {
            this.f127912a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127912a.f127900g) {
                e.c(this.f127912a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f127912a.b(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateIn));
                e.d(this.f127912a).c();
                this.f127912a.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127913a;

        static {
            Covode.recordClassIndex(83836);
        }

        g(e eVar) {
            this.f127913a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127913a.f127900g) {
                e.c(this.f127913a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f127913a.c(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateOut));
                e.d(this.f127913a).c();
                this.f127913a.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127915a;

        static {
            Covode.recordClassIndex(83838);
        }

        i(e eVar) {
            this.f127915a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f127915a.f127900g) {
                this.f127915a.f127902i.f126288b = e.d(this.f127915a).a().getPlayingPosition();
                e.c(this.f127915a).a(this.f127915a.f127902i);
                e.d(this.f127915a).c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127916a;

        static {
            Covode.recordClassIndex(83839);
        }

        j(e eVar) {
            this.f127916a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            e.c(this.f127916a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(this.f127916a.b(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            this.f127916a.d();
            e.d(this.f127916a).c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127907a;

        static {
            Covode.recordClassIndex(83830);
        }

        a(e eVar) {
            this.f127907a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f126290d)) != null) {
                if (valueOf.intValue() == 1) {
                    this.f127907a.f127901h.post(this.f127907a.f127903j);
                    e.a(this.f127907a).a();
                } else if (valueOf.intValue() == 2) {
                    this.f127907a.f127901h.removeCallbacks(this.f127907a.f127903j);
                    e.a(this.f127907a).b();
                } else if (valueOf.intValue() == 3) {
                    this.f127907a.f127901h.removeCallbacks(this.f127907a.f127903j);
                    e.a(this.f127907a).a(aVar.f126288b, aVar.f126287a);
                }
            }
        }
    }

    public final void a(boolean z) {
        long k2;
        d dVar = this.f127895b;
        if (dVar == null) {
            h.f.b.l.a("editorPresenter");
        }
        if (dVar.f127891a == null) {
            k2 = 0;
        } else {
            com.ss.android.ugc.asve.editor.g gVar = dVar.f127891a;
            if (gVar == null) {
                h.f.b.l.b();
            }
            k2 = (long) gVar.k();
        }
        if (z) {
            k2 = 0;
        } else if (k2 < 0) {
            return;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f127904k;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel = this.f127905l;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        List<VideoSegment> j2 = videoEditViewModel.j();
        VideoEditViewModel videoEditViewModel2 = this.f127905l;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        cutMultiVideoViewModel.a(k2, j2, videoEditViewModel2.l());
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127919a;

        static {
            Covode.recordClassIndex(83842);
        }

        m(e eVar) {
            this.f127919a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            com.ss.android.ugc.aweme.shortvideo.cut.model.f fVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.f) obj;
            if (fVar != null && (valueOf = Integer.valueOf(fVar.f125510d)) != null) {
                if (valueOf.intValue() == 0) {
                    if (this.f127919a.f127899f) {
                        this.f127919a.f127898e = fVar.f125511e;
                        e.c(this.f127919a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                    }
                    this.f127919a.f127899f = false;
                    e.d(this.f127919a).a(false, 0);
                } else if (valueOf != null && valueOf.intValue() != 1 && valueOf.intValue() == 2) {
                    this.f127919a.f127899f = true;
                    e.d(this.f127919a).a(true, fVar.f125512f);
                    e.b(this.f127919a).a(this.f127919a.f127898e, fVar.f125512f);
                    if (!e.d(this.f127919a).b()) {
                        e.c(this.f127919a).a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(1, false));
                    }
                }
            }
        }
    }

    public final void a(androidx.fragment.app.e eVar) {
        h.f.b.l.d(eVar, "");
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f127894a;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.a().observe(eVar, new a(this));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f127904k;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel.f125326a.observe(eVar, new l(this));
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f127904k;
        if (cutMultiVideoViewModel2 == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel2.f125335j.observe(eVar, new m(this));
        VideoEditViewModel videoEditViewModel = this.f127905l;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel.y = new n(this);
        VideoEditViewModel videoEditViewModel2 = this.f127905l;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel2.o.observe(eVar, new o(this));
        VideoEditViewModel videoEditViewModel3 = this.f127905l;
        if (videoEditViewModel3 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel3.p.observe(eVar, new p(this));
        VideoEditViewModel videoEditViewModel4 = this.f127905l;
        if (videoEditViewModel4 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel4.q.observe(eVar, new q(this));
        VideoEditViewModel videoEditViewModel5 = this.f127905l;
        if (videoEditViewModel5 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel5.r.observe(eVar, new r(this));
        VideoEditViewModel videoEditViewModel6 = this.f127905l;
        if (videoEditViewModel6 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel6.f126129b.observe(eVar, new s(this));
        VideoEditViewModel videoEditViewModel7 = this.f127905l;
        if (videoEditViewModel7 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel7.f126130c.observe(eVar, new b(this));
        VideoEditViewModel videoEditViewModel8 = this.f127905l;
        if (videoEditViewModel8 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel8.f126132e.observe(eVar, new c(this));
        VideoEditViewModel videoEditViewModel9 = this.f127905l;
        if (videoEditViewModel9 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel9.f126134g.observe(eVar, new d(this));
        VideoEditViewModel videoEditViewModel10 = this.f127905l;
        if (videoEditViewModel10 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel10.f126133f.observe(eVar, new C3335e(this));
        VideoEditViewModel videoEditViewModel11 = this.f127905l;
        if (videoEditViewModel11 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel11.f126135h.observe(eVar, new f(this));
        VideoEditViewModel videoEditViewModel12 = this.f127905l;
        if (videoEditViewModel12 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel12.f126138k.observe(eVar, new g(this));
        VideoEditViewModel videoEditViewModel13 = this.f127905l;
        if (videoEditViewModel13 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel13.f126131d.observe(eVar, new h(this));
        VideoEditViewModel videoEditViewModel14 = this.f127905l;
        if (videoEditViewModel14 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel14.f126139l.observe(eVar, new i(this));
        VideoEditViewModel videoEditViewModel15 = this.f127905l;
        if (videoEditViewModel15 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel15.f126140m.observe(eVar, new j(this));
        VideoEditViewModel videoEditViewModel16 = this.f127905l;
        if (videoEditViewModel16 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel16.n.observe(eVar, new k(this));
    }

    public final void a(VEVideoCutterViewModel vEVideoCutterViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, CutVideoSpeedViewModel cutVideoSpeedViewModel, d dVar, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar) {
        h.f.b.l.d(vEVideoCutterViewModel, "");
        h.f.b.l.d(cutMultiVideoViewModel, "");
        h.f.b.l.d(videoEditViewModel, "");
        h.f.b.l.d(cutVideoSpeedViewModel, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        this.f127894a = vEVideoCutterViewModel;
        this.f127904k = cutMultiVideoViewModel;
        this.f127905l = videoEditViewModel;
        this.f127906m = cutVideoSpeedViewModel;
        this.f127895b = dVar;
        this.f127897d = aVar;
    }
}
