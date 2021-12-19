package com.ss.android.ugc.aweme.music.e;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settings.y;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.musicprovider.MusicPreloaderService;
import com.toutiao.proxyserver.a.a;
import com.toutiao.proxyserver.ad;
import com.toutiao.proxyserver.r;
import com.toutiao.proxyserver.t;
import com.toutiao.proxyserver.u;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.z;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111458a = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static boolean f111459e;

    /* renamed from: b  reason: collision with root package name */
    private final String f111460b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<String, p<q<String, Long, Long, z>, com.ss.android.ugc.musicprovider.c>> f111461c;

    /* renamed from: d  reason: collision with root package name */
    private final h f111462d;

    static {
        Covode.recordClassIndex(71603);
    }

    private final MusicPreloaderService c() {
        return (MusicPreloaderService) this.f111462d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71604);
        }

        private a() {
        }

        public static j a() {
            return new j((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.toutiao.proxyserver.p {
        static {
            Covode.recordClassIndex(71605);
        }

        b() {
        }

        @Override // com.toutiao.proxyserver.p
        public final void a(String str, int i2) {
            com.bytedance.apm.b.a("video_cache_monitor", 0, new com.ss.android.ugc.aweme.app.f.c().a("request_log", str).a("action_type", Integer.valueOf(i2)).a());
        }

        @Override // com.toutiao.proxyserver.p
        public final void a(Exception exc, String str, int i2) {
            String str2;
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("request_log", str);
            if (exc != null) {
                str2 = exc.getMessage();
            } else {
                str2 = "";
            }
            com.bytedance.apm.b.a("video_cache_monitor", 1, a2.a("errorDesc", str2).a("action_type", Integer.valueOf(i2)).a());
        }
    }

    static final class c extends m implements h.f.a.a<MusicPreloaderService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f111463a = new c();

        static {
            Covode.recordClassIndex(71606);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusicPreloaderService invoke() {
            return MusicPreloaderServiceImpl.b();
        }
    }

    private j() {
        this.f111460b = "TAG_TTMusicFileLoader";
        this.f111461c = new WeakHashMap<>();
        this.f111462d = i.a((h.f.a.a) c.f111463a);
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void b() {
        Set<String> keySet = this.f111461c.keySet();
        l.b(keySet, "");
        for (T t : keySet) {
            l.b(t, "");
            b(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a() {
        c().a();
        if (!f111459e) {
            f111459e = true;
            u.f154996k = new b();
        }
        if (u.f154988c == null) {
            com.ss.android.ugc.musicprovider.e a2 = com.ss.android.ugc.musicprovider.e.a();
            l.b(a2, "");
            String c2 = a2.c();
            if (!TextUtils.isEmpty(c2)) {
                try {
                    com.ss.android.ugc.musicprovider.e a3 = com.ss.android.ugc.musicprovider.e.a();
                    l.b(a3, "");
                    String c3 = a3.c();
                    if (!com.ss.android.ugc.musicprovider.b.b(c3)) {
                        com.ss.android.ugc.musicprovider.b.a(c3);
                    }
                    if (com.ss.android.ugc.aweme.music.a.c.a()) {
                        u.a(new d(new File(c2), com.ss.android.ugc.aweme.music.a.a.a(), AVExternalServiceImpl.a().configService().cacheConfig().draftMusicList()), com.bytedance.ies.ugc.appcontext.d.a());
                    } else {
                        u.a(new r(new File(c2)), com.bytedance.ies.ugc.appcontext.d.a());
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public /* synthetic */ j(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a(String str) {
        l.d(str, "");
        b(str);
    }

    public final void b(String str) {
        p<q<String, Long, Long, z>, com.ss.android.ugc.musicprovider.c> pVar = this.f111461c.get(str);
        if (pVar != null) {
            l.b(pVar, "");
            this.f111461c.remove(str);
            c().b(pVar.getFirst());
            c().b(pVar.getSecond());
        }
    }

    public static final class d implements com.ss.android.ugc.musicprovider.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f111464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f111465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.service.b f111466c;

        static {
            Covode.recordClassIndex(71607);
        }

        d(j jVar, String str, com.ss.android.ugc.aweme.music.service.b bVar) {
            this.f111464a = jVar;
            this.f111465b = str;
            this.f111466c = bVar;
        }

        @Override // com.ss.android.ugc.musicprovider.c
        public final void a(String str, int i2, String str2) {
            l.d(str, "");
            l.d(str2, "");
            if (i2 == 1 && TextUtils.equals(this.f111465b, str2)) {
                this.f111466c.a(str, null);
                this.f111464a.b(str2);
            }
        }

        @Override // com.ss.android.ugc.musicprovider.c
        public final void a(com.toutiao.proxyserver.j jVar, int i2, String str) {
            l.d(jVar, "");
            l.d(str, "");
            if (i2 == 1 && TextUtils.equals(this.f111465b, str)) {
                String a2 = com.toutiao.proxyserver.e.c.a(jVar.f154914c);
                com.ss.android.ugc.aweme.music.service.b bVar = this.f111466c;
                int i3 = jVar.f154912a;
                if (a2.length() > 1500) {
                    l.b(a2, "");
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
                    a2 = a2.substring(0, 1500);
                    l.b(a2, "");
                }
                bVar.a(new com.ss.android.ugc.musicprovider.a(i3, a2));
                this.f111464a.b(str);
            }
        }
    }

    static final class e extends m implements q<String, Long, Long, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.music.service.b $listener;

        static {
            Covode.recordClassIndex(71608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.music.service.b bVar) {
            super(3);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, Long l2, Long l3) {
            long longValue = l2.longValue();
            long longValue2 = l3.longValue();
            l.d(str, "");
            this.$listener.a((int) ((longValue2 * 100) / longValue));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a(MusicModel musicModel, String str, List<String> list, com.ss.android.ugc.aweme.music.service.b bVar) {
        String str2 = "";
        l.d(musicModel, str2);
        l.d(str, str2);
        l.d(list, str2);
        l.d(bVar, str2);
        a();
        a.C4113a.f154764a.f154762a.set(2);
        String musicId = musicModel.getMusicId();
        UrlModel url = musicModel.getUrl();
        l.b(url, str2);
        String c2 = e.c(url);
        l.b(musicId, str2);
        e eVar = new e(bVar);
        d dVar = new d(this, musicId, bVar);
        this.f111461c.put(musicId, new p<>(eVar, dVar));
        c().a(eVar);
        c().a(dVar);
        List<com.toutiao.proxyserver.net.c> c3 = n.c(new com.toutiao.proxyserver.net.c("cache_scene", "music"));
        if (musicModel.isNeedSetCookie()) {
            if (TextUtils.isEmpty(c2)) {
                StringBuilder append = new StringBuilder().append(this.f111460b).append(" Invalid music, firstUrl is null, id: ");
                String musicId2 = musicModel.getMusicId();
                if (musicId2 == null) {
                    musicId2 = str2;
                }
                StringBuilder append2 = append.append(musicId2).append(", name: ");
                String name = musicModel.getName();
                if (name == null) {
                    name = str2;
                }
                bj.b(append2.append(name).toString());
            }
            String cookie = CookieManager.getInstance().getCookie(c2);
            if (TextUtils.isEmpty(cookie)) {
                StringBuilder append3 = new StringBuilder().append(this.f111460b).append(" Invalid music, cookies is null, id: ");
                String musicId3 = musicModel.getMusicId();
                if (musicId3 == null) {
                    musicId3 = str2;
                }
                StringBuilder append4 = append3.append(musicId3).append(", name: ");
                String name2 = musicModel.getName();
                if (name2 != null) {
                    str2 = name2;
                }
                bj.b(append4.append(str2).toString());
            } else {
                c3.add(new com.toutiao.proxyserver.net.c("cookie", cookie));
            }
        }
        bVar.b();
        int a2 = y.a();
        t a3 = t.a();
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!TextUtils.isEmpty(musicId) && strArr2 != null && strArr2.length > 0) {
            a3.a(false, a2, musicId, c3, null, new ad(com.toutiao.proxyserver.g.b.a(strArr2)), true);
        }
    }
}
