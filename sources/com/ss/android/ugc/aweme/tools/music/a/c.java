package com.ss.android.ugc.aweme.tools.music.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.m;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import f.a.t;
import h.f.b.l;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends MusicModel> f140338a;

    /* renamed from: b  reason: collision with root package name */
    public long f140339b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    f.a.b.b f140340c;

    /* renamed from: d  reason: collision with root package name */
    public f.a.l.b<com.ss.android.ugc.aweme.port.in.a> f140341d;

    /* renamed from: e  reason: collision with root package name */
    public final f.a.l.b<Boolean> f140342e;

    /* renamed from: f  reason: collision with root package name */
    public final List<m> f140343f;

    /* renamed from: g  reason: collision with root package name */
    volatile boolean f140344g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f140345h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.c.a f140346i;

    /* renamed from: j  reason: collision with root package name */
    final com.ss.android.ugc.aweme.tools.music.a.b.a f140347j;

    /* renamed from: k  reason: collision with root package name */
    private final h f140348k = i.a((h.f.a.a) f.f140361a);

    /* renamed from: l  reason: collision with root package name */
    private final f.a.b.a f140349l;

    static {
        Covode.recordClassIndex(91686);
    }

    public final String a() {
        return (String) this.f140348k.getValue();
    }

    public final void c() {
        com.ss.android.ugc.aweme.tools.music.a.b.a aVar = this.f140347j;
        if (aVar != null) {
            aVar.e();
        }
    }

    public final com.ss.android.ugc.aweme.port.in.a b() {
        return this.f140341d.i();
    }

    public final t<Boolean> d() {
        t<Boolean> c2 = this.f140342e.c();
        l.b(c2, "");
        return c2;
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f140361a = new f();

        static {
            Covode.recordClassIndex(91693);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return "taskId:" + SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        com.ss.android.ugc.aweme.tools.music.a.b.a aVar = this.f140347j;
        if (aVar != null) {
            aVar.f();
        }
        this.f140349l.dispose();
        f.a.b.b bVar = this.f140340c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f140343f.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.c$c  reason: collision with other inner class name */
    public static final class C3705c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140356a;

        static {
            Covode.recordClassIndex(91690);
        }

        C3705c(c cVar) {
            this.f140356a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.a(this.f140356a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140360a;

        static {
            Covode.recordClassIndex(91692);
        }

        e(c cVar) {
            this.f140360a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.a(this.f140360a);
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f140352b = 0;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f140353c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f140354d;

        static {
            Covode.recordClassIndex(91688);
        }

        a(c cVar, long j2) {
            this.f140351a = cVar;
            this.f140353c = j2;
            this.f140354d = null;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f140351a.a(this.f140352b, this.f140353c, this.f140354d, 10, 20);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140355a;

        static {
            Covode.recordClassIndex(91689);
        }

        b(c cVar) {
            this.f140355a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
            f.a.l.b<com.ss.android.ugc.aweme.port.in.a> bVar = this.f140355a.f140341d;
            l.b(suggestMusicList, "");
            bVar.onNext(new com.ss.android.ugc.aweme.port.in.a(suggestMusicList.musicList, 0, 3, suggestMusicList.cursor, suggestMusicList.hasMore, null, 32));
        }
    }

    public final void a(m mVar) {
        l.d(mVar, "");
        this.f140343f.add(mVar);
    }

    static /* synthetic */ void a(c cVar) {
        List<MusicModel> h2 = a.h();
        com.ss.android.ugc.aweme.port.in.a aVar = new com.ss.android.ugc.aweme.port.in.a(a.h(), System.currentTimeMillis() - cVar.f140339b, 1, 0, false, null, 56);
        if (h2 != null) {
            com.bytedance.apm.b.a("ies_ai_recommend_request_monitor", 1, new ar().a("time_cost_ms", Integer.valueOf((int) aVar.f115561b)).a());
        } else {
            com.bytedance.apm.b.a("ies_ai_recommend_request_monitor", 2, new ar().a());
        }
        cVar.f140341d.onNext(aVar);
        cVar.f140342e.onNext(true);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f140358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f140359c;

        static {
            Covode.recordClassIndex(91691);
        }

        d(c cVar, String str, List list) {
            this.f140357a = cVar;
            this.f140358b = str;
            this.f140359c = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            int i3;
            Integer num;
            SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
            if (suggestMusicList != null) {
                List<MusicModel> list = suggestMusicList.musicList;
                l.b(list, "");
                for (T t : list) {
                    l.b(t, "");
                    t.setLogPb(suggestMusicList.logPb);
                    t.setComeFromForMod(1);
                }
                this.f140357a.f140338a = suggestMusicList.musicList;
                Integer num2 = suggestMusicList.musicType;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 3;
                }
                List<? extends MusicModel> list2 = this.f140357a.f140338a;
                long currentTimeMillis = System.currentTimeMillis() - this.f140357a.f140339b;
                if (i2 == 2) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
                com.ss.android.ugc.aweme.port.in.a aVar = new com.ss.android.ugc.aweme.port.in.a(list2, currentTimeMillis, i3, suggestMusicList.cursor, suggestMusicList.hasMore, this.f140358b);
                this.f140357a.f140341d.onNext(aVar);
                this.f140357a.f140342e.onNext(true);
                Integer valueOf = Integer.valueOf((int) aVar.f115561b);
                List list3 = this.f140359c;
                if (list3 != null) {
                    num = Integer.valueOf(list3.size());
                } else {
                    num = null;
                }
                ar a2 = new ar().a("time_cost_ms", valueOf);
                if (num != null) {
                    num.intValue();
                    a2.a("photo_to_video_assets_count", num);
                }
                com.bytedance.apm.b.a("ies_ai_recommend_request_monitor", 0, a2.a());
                return;
            }
            c.a(this.f140357a);
        }
    }

    public final boolean a(com.ss.android.ugc.aweme.c.a aVar) {
        l.d(aVar, "");
        return aVar.a(this.f140346i);
    }

    public c(com.ss.android.ugc.aweme.c.a aVar, com.ss.android.ugc.aweme.tools.music.a.b.a aVar2) {
        t<String> d2;
        t<String> a2;
        f.a.b.b a3;
        l.d(aVar, "");
        this.f140346i = aVar;
        this.f140347j = aVar2;
        f.a.b.a aVar3 = new f.a.b.a();
        this.f140349l = aVar3;
        f.a.l.b<com.ss.android.ugc.aweme.port.in.a> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f140341d = bVar;
        f.a.l.b<Boolean> bVar2 = new f.a.l.b<>();
        l.b(bVar2, "");
        this.f140342e = bVar2;
        this.f140343f = new ArrayList();
        if (aVar2 != null && (d2 = aVar2.d()) != null && (a2 = d2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null && (a3 = a2.a(new f.a.d.f(this) {
            /* class com.ss.android.ugc.aweme.tools.music.a.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f140350a;

            static {
                Covode.recordClassIndex(91687);
            }

            {
                this.f140350a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<String> d2;
                String str = (String) obj;
                this.f140350a.f140345h = true;
                Iterator<T> it = this.f140350a.f140343f.iterator();
                while (it.hasNext()) {
                    l.b(str, "");
                    it.next().a(str, this.f140350a.f140346i.f69578c);
                }
                c cVar = this.f140350a;
                boolean z = cVar.f140346i.f69581f;
                try {
                    r.a("account_info_before_rec_music_list", new com.ss.android.ugc.tools.f.b().a("login", String.valueOf(g.a().A().b())).f149193a);
                    IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                    l.b(iESSettingsProxy, "");
                    Boolean aiMusicBackupStrategy = iESSettingsProxy.getAiMusicBackupStrategy();
                    l.b(aiMusicBackupStrategy, "");
                    if (aiMusicBackupStrategy.booleanValue() || z) {
                        long j2 = cVar.f140346i.f69577b;
                        f.a.b.b bVar = null;
                        if (cVar.f140347j == null || !cVar.f140346i.f69582g) {
                            cVar.a(0, j2, null, 10, 20);
                            return;
                        }
                        f.a.b.b bVar2 = cVar.f140340c;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        com.ss.android.ugc.aweme.tools.music.a.b.a aVar = cVar.f140347j;
                        if (!(aVar == null || (d2 = aVar.d()) == null)) {
                            bVar = d2.a(new a(cVar, j2), f.a.e.b.a.f157191d);
                        }
                        cVar.f140340c = bVar;
                    }
                } catch (com.bytedance.ies.a unused) {
                }
            }
        }, f.a.e.b.a.f157191d)) != null) {
            aVar3.a(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2, List<String> list, int i3, int i4) {
        f.a.b.b bVar = this.f140340c;
        String str = null;
        if (bVar != null) {
            bVar.dispose();
            this.f140340c = null;
        }
        com.ss.android.ugc.aweme.tools.music.a.b.a aVar = this.f140347j;
        if (aVar != null) {
            str = aVar.c();
        }
        if (str == null || str.length() == 0) {
            this.f140349l.a(a.a(0, i3, i2).a(new b(this), new C3705c(this)));
        } else {
            this.f140349l.a(com.ss.android.ugc.aweme.tools.music.a.a.b.f140288a.a(str, this.f140346i.f69578c, this.f140346i.f69579d, j2, i4, 0).a(new d(this, str, list), new e(this)));
        }
    }
}
