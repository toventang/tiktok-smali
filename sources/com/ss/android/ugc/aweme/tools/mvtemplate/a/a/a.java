package com.ss.android.ugc.aweme.tools.mvtemplate.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.property.cx;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.d;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C3716a f140634e = new C3716a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f140635a;

    /* renamed from: b  reason: collision with root package name */
    public MvThemeData f140636b;

    /* renamed from: c  reason: collision with root package name */
    final aa f140637c = ((aa) com.ss.android.ugc.aweme.port.in.g.a().s());

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.e f140638d;

    /* renamed from: f  reason: collision with root package name */
    private final SafeHandler f140639f;

    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final C3717a f140658b = new C3717a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f140659a;

        static {
            Covode.recordClassIndex(91849);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$d$a  reason: collision with other inner class name */
        public static final class C3717a {
            static {
                Covode.recordClassIndex(91850);
            }

            private C3717a() {
            }

            public /* synthetic */ C3717a(byte b2) {
                this();
            }

            public static d a(int i2) {
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 0;
                }
                return new d(i3);
            }
        }

        public d(int i2) {
            this.f140659a = i2;
        }
    }

    static {
        Covode.recordClassIndex(91845);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a$a  reason: collision with other inner class name */
    public static final class C3716a {
        static {
            Covode.recordClassIndex(91846);
        }

        private C3716a() {
        }

        public static MusicModel a() {
            MusicModel musicModel = new MusicModel();
            musicModel.setId(Long.MIN_VALUE);
            return musicModel;
        }

        public /* synthetic */ C3716a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f140639f.removeCallbacksAndMessages(null);
    }

    public final class b implements com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final d f140643a;

        /* renamed from: b  reason: collision with root package name */
        public final MvThemeData f140644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f140645c;

        static {
            Covode.recordClassIndex(91847);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b
        public final void a() {
            d dVar;
            if (!this.f140645c.f140635a && (dVar = this.f140643a) != null) {
                dVar.a(this.f140644b, null, null, false, false);
            }
            this.f140645c.a();
        }

        public b(a aVar, d dVar, MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            this.f140645c = aVar;
            this.f140643a = dVar;
            this.f140644b = mvThemeData;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b
        public final void a(MusicModel musicModel, String str, boolean z) {
            d dVar;
            l.d(musicModel, "");
            l.d(str, "");
            if (!this.f140645c.f140635a && (dVar = this.f140643a) != null) {
                dVar.a(this.f140644b, musicModel, str, z, false);
            }
            this.f140645c.a();
        }
    }

    public final class c implements com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.tools.mvtemplate.a.d f140646a;

        /* renamed from: b  reason: collision with root package name */
        public final String f140647b;

        /* renamed from: c  reason: collision with root package name */
        public final d f140648c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f140649d;

        /* renamed from: e  reason: collision with root package name */
        public final String f140650e;

        /* renamed from: f  reason: collision with root package name */
        public final String f140651f;

        /* renamed from: g  reason: collision with root package name */
        public final MusicModel f140652g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f140653h;

        /* renamed from: i  reason: collision with root package name */
        public final String f140654i;

        /* renamed from: j  reason: collision with root package name */
        public final IPhotoPreDownloadMusic f140655j;

        /* renamed from: k  reason: collision with root package name */
        public final d f140656k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f140657l;

        static {
            Covode.recordClassIndex(91848);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
            d dVar;
            if (!this.f140657l.f140635a && (dVar = this.f140648c) != null) {
                dVar.a();
            }
            this.f140657l.a();
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            boolean z;
            aa.c k2;
            MusicModel c2;
            l.d(mvThemeData, "");
            this.f140657l.f140636b = mvThemeData;
            String str = this.f140647b;
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a();
            if (l.a((Object) "singlepiceffect", (Object) str)) {
                aVar.a(mvThemeData);
            } else if (l.a((Object) "slideshoweffect", (Object) str)) {
                aVar.b(mvThemeData);
            }
            a aVar2 = this.f140657l;
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140646a;
            d dVar2 = this.f140648c;
            List<String> list = this.f140649d;
            String str2 = this.f140650e;
            String str3 = this.f140651f;
            MusicModel musicModel = this.f140652g;
            boolean z2 = this.f140653h;
            String str4 = this.f140654i;
            IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.f140655j;
            if (this.f140656k.f140659a == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!cx.b() || l.a((Object) str4, (Object) "photo_shoot") || l.a((Object) str4, (Object) "photo_anchor") || l.a((Object) str4, (Object) "no_change_music")) {
                aVar2.a(dVar, dVar2, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).a(null);
            } else if (list != null) {
                aa aaVar = aVar2.f140637c;
                if (aaVar == null || (k2 = aaVar.k()) == null || (c2 = k2.c()) == null || z2) {
                    aVar2.a(dVar, dVar2, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).a(null);
                    return;
                }
                b bVar = new b(aVar2, dVar2, mvThemeData);
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(dVar, new WeakReference(aVar2.f140638d), null, bVar, list, str2, str3, musicModel);
                bVar2.f140673b = c2;
                bVar2.f140676e = z;
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.b bVar3 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.b(bVar2);
                bVar3.f140640a = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.d(new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(dVar, new WeakReference(aVar2.f140638d), null, bVar, list, str2, 448));
                bVar3.a(null);
            }
        }

        public c(a aVar, com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar, String str, d dVar2, List<String> list, String str2, String str3, MusicModel musicModel, boolean z, String str4, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, d dVar3) {
            l.d(str, "");
            l.d(dVar3, "");
            this.f140657l = aVar;
            this.f140646a = dVar;
            this.f140647b = str;
            this.f140648c = dVar2;
            this.f140649d = list;
            this.f140650e = str2;
            this.f140651f = str3;
            this.f140652g = musicModel;
            this.f140653h = z;
            this.f140654i = str4;
            this.f140655j = iPhotoPreDownloadMusic;
            this.f140656k = dVar3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.d f140667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f140668c;

        static {
            Covode.recordClassIndex(91856);
        }

        j(a aVar, com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar, d dVar2) {
            this.f140666a = aVar;
            this.f140667b = dVar;
            this.f140668c = dVar2;
        }

        public final void run() {
            this.f140666a.f140635a = true;
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140667b;
            if (dVar != null) {
                int i2 = dVar.f140732a;
                int i3 = 4;
                if (i2 == 1) {
                    i3 = 2;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        i3 = 6;
                    } else if (i2 == 4) {
                        i3 = 8;
                    } else if (i2 != 5) {
                        i3 = 0;
                    } else {
                        i3 = 9;
                    }
                }
                dVar.f140742k = i3;
            }
            if (this.f140666a.f140636b == null) {
                d dVar2 = this.f140668c;
                if (dVar2 != null) {
                    dVar2.a();
                }
            } else if (!cx.b() || !(this.f140666a.f140638d instanceof w)) {
                d dVar3 = this.f140668c;
                if (dVar3 != null) {
                    MvThemeData mvThemeData = this.f140666a.f140636b;
                    if (mvThemeData == null) {
                        l.b();
                    }
                    dVar3.a(mvThemeData, null, null, false, false);
                }
            } else {
                androidx.fragment.app.e eVar = this.f140666a.f140638d;
                Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPreDownloadMusic");
                w.a e2 = ((w) eVar).e();
                if (e2.a()) {
                    d dVar4 = this.f140668c;
                    if (dVar4 != null) {
                        MvThemeData mvThemeData2 = this.f140666a.f140636b;
                        if (mvThemeData2 == null) {
                            l.b();
                        }
                        dVar4.a(mvThemeData2, e2.f129191a, e2.f129192b, false, true);
                        return;
                    }
                    return;
                }
                d dVar5 = this.f140668c;
                if (dVar5 != null) {
                    MvThemeData mvThemeData3 = this.f140666a.f140636b;
                    if (mvThemeData3 == null) {
                        l.b();
                    }
                    dVar5.a(mvThemeData3, null, null, false, false);
                }
            }
        }
    }

    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a f140660a;

        static {
            Covode.recordClassIndex(91851);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
        }

        public e(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar) {
            this.f140660a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            this.f140660a.b(mvThemeData);
        }
    }

    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a f140661a;

        static {
            Covode.recordClassIndex(91852);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
        }

        public f(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar) {
            this.f140661a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            this.f140661a.a(mvThemeData);
        }
    }

    public static final class g implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a f140662a;

        static {
            Covode.recordClassIndex(91853);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
        }

        public g(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar) {
            this.f140662a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            this.f140662a.b(mvThemeData);
        }
    }

    public static final class h implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a f140663a;

        static {
            Covode.recordClassIndex(91854);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
        }

        public h(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar) {
            this.f140663a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            this.f140663a.a(mvThemeData);
        }
    }

    public a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f140638d = eVar;
        this.f140639f = new SafeHandler(eVar);
    }

    public static final class i implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f140664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a f140665b;

        static {
            Covode.recordClassIndex(91855);
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c
        public final void a(MvThemeData mvThemeData) {
            l.d(mvThemeData, "");
            if (l.a((Object) "singlepiceffect", (Object) this.f140664a)) {
                this.f140665b.a(mvThemeData);
            } else if (l.a((Object) "slideshoweffect", (Object) this.f140664a)) {
                this.f140665b.b(mvThemeData);
            }
        }

        public i(String str, com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar) {
            this.f140664a = str;
            this.f140665b = aVar;
        }
    }

    private final void a(d dVar, com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2) {
        this.f140635a = false;
        this.f140639f.postDelayed(new j(this, dVar2, dVar), 5000);
    }

    public final com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a a(com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar, MusicModel musicModel, b bVar, List<String> list, String str) {
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(dVar, new WeakReference(this.f140638d), null, bVar, list, str, 448);
        bVar2.f140673b = musicModel;
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e eVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e(bVar2);
        eVar.f140640a = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.d(bVar2);
        return eVar;
    }

    public final com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a a(com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar, String str, String str2, boolean z, c cVar) {
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(dVar, new WeakReference(this.f140638d), cVar, null, null, null, 504);
        bVar.f140672a = str;
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.e eVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.e(str2, bVar);
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.d dVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.d(str2, bVar);
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.b bVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.b(bVar);
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.c cVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.c(bVar);
        eVar.f140640a = dVar2;
        dVar2.f140640a = bVar2;
        bVar2.f140640a = cVar2;
        if (!z) {
            return eVar;
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.a aVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.a(str2, bVar);
        aVar.f140640a = eVar;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a a(com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar, d dVar2, List<String> list, String str, MvThemeData mvThemeData, String str2, MusicModel musicModel, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, boolean z) {
        b bVar = new b(this, dVar2, mvThemeData);
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b(dVar, new WeakReference(this.f140638d), null, bVar, list, str, str2, musicModel);
        bVar2.f140675d = iPhotoPreDownloadMusic;
        bVar2.f140676e = z;
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.c cVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.c(bVar2);
        cVar.f140640a = a(dVar, (MusicModel) null, bVar, list, str);
        return cVar;
    }

    public final void a(String str, d dVar, List<String> list, String str2, String str3, MusicModel musicModel, com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2, boolean z, String str4, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, d dVar3) {
        String str5;
        l.d(str, "");
        l.d(dVar3, "");
        a(dVar, dVar2);
        this.f140636b = null;
        if (dVar2 != null) {
            str5 = dVar2.f140741j;
        } else {
            str5 = null;
        }
        a(dVar2, str5, str, true, (c) new c(this, dVar2, str, dVar, list, str2, str3, musicModel, z, str4, null, dVar3)).a(null);
    }
}
