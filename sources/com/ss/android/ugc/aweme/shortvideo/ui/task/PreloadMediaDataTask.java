package com.ss.android.ugc.aweme.shortvideo.ui.task;

import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.a.c;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.setting.i.n;
import f.a.d.f;
import h.f.b.l;

public final class PreloadMediaDataTask implements au, a {

    /* renamed from: a  reason: collision with root package name */
    final e f131909a;

    /* renamed from: b  reason: collision with root package name */
    public long f131910b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f131911c;

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.b f131912d;

    /* renamed from: e  reason: collision with root package name */
    private final i f131913e;

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f131915a = new b();

        static {
            Covode.recordClassIndex(86426);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f131916a = new c();

        static {
            Covode.recordClassIndex(86427);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f131917a = new d();

        static {
            Covode.recordClassIndex(86428);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(86424);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        if (n.a() || com.ss.android.ugc.aweme.setting.i.a.a() == 1) {
            return true;
        }
        return false;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        f.a.b.b bVar = this.f131911c;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f131912d;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        c.a.a().f109343b.c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        com.ss.android.ugc.aweme.mediachoose.a.c a2 = c.a.a();
        this.f131911c = a2.a(new com.ss.android.ugc.aweme.mediachoose.a.e(3, 30, 0), d.a.f109380a).a(new a(this), b.f131915a);
        this.f131912d = a2.a(new com.ss.android.ugc.aweme.mediachoose.a.e(4, 30, 0), d.a.f109380a).a(c.f131916a, d.f131917a);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreloadMediaDataTask f131914a;

        static {
            Covode.recordClassIndex(86425);
        }

        a(PreloadMediaDataTask preloadMediaDataTask) {
            this.f131914a = preloadMediaDataTask;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.mediachoose.a.d dVar = (com.ss.android.ugc.aweme.mediachoose.a.d) obj;
            PreloadMediaDataTask preloadMediaDataTask = this.f131914a;
            l.b(dVar, "");
            if (!dVar.f109352b.isEmpty()) {
                com.ss.android.ugc.aweme.mediachoose.a.d dVar2 = com.ss.android.ugc.aweme.mediachoose.a.d.a(dVar.f109351a, h.a.n.c(dVar.f109352b.get(0)));
                l.d(dVar2, "");
                ((FirstPhotoViewModel) ae.a(preloadMediaDataTask.f131909a, (ad.b) null).a(FirstPhotoViewModel.class)).f131908a.setValue(dVar2);
            }
            if (preloadMediaDataTask.f131910b != -1) {
                r.a("tool_performance_operation_cost_time", new com.ss.android.ugc.tools.f.b().a(StringSet.type, "tool_performance_show_album_icon").a("totaltime", System.currentTimeMillis() - preloadMediaDataTask.f131910b).f149193a);
                preloadMediaDataTask.f131910b = -1;
            }
        }
    }

    public PreloadMediaDataTask(i iVar, e eVar, long j2) {
        l.d(iVar, "");
        l.d(eVar, "");
        this.f131913e = iVar;
        this.f131909a = eVar;
        this.f131910b = j2;
        iVar.a(this);
    }
}
