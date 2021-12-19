package com.ss.android.ugc.aweme.tools.music.a;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.cz.a.i;
import com.ss.android.ugc.aweme.cz.a.m;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.property.cx;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.tools.music.f.b;
import com.ss.android.ugc.aweme.tools.music.f.c;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.h;
import h.z;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a implements aa.c {

    /* renamed from: a  reason: collision with root package name */
    static final List<i> f140273a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static List<? extends MusicModel> f140274b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f140275c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final h f140276d = h.i.a((h.f.a.a) C3701a.f140286a);

    /* renamed from: e  reason: collision with root package name */
    private static m f140277e;

    /* renamed from: f  reason: collision with root package name */
    private static m f140278f;

    /* renamed from: g  reason: collision with root package name */
    private static int f140279g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f140280h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f140281i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f140282j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile c f140283k;

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, c> f140284l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    private static f.a.b.b f140285m;

    public static String e() {
        return (String) f140276d.getValue();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f140287a = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(91656);
        }

        public static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.cz.a.e {
        static {
            Covode.recordClassIndex(91657);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.cz.a.e
        public final Integer b() {
            com.ss.android.ugc.aweme.port.in.a f2 = a.f();
            if (f2 != null) {
                return Integer.valueOf(f2.f115562c);
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.e
        public final long c() {
            com.ss.android.ugc.aweme.port.in.a f2 = a.f();
            if (f2 != null) {
                return f2.f115561b;
            }
            return -1;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.e
        public final void d() {
            com.ss.android.ugc.aweme.port.in.a f2 = a.f();
            if (f2 != null) {
                f2.f115561b = -1;
            }
        }

        @Override // com.ss.android.ugc.aweme.cz.a.e
        public final List<com.ss.android.ugc.aweme.shortvideo.c> e() {
            List<? extends MusicModel> list;
            com.ss.android.ugc.aweme.port.in.a f2 = a.f();
            if (f2 != null) {
                list = f2.f115560a;
            } else {
                list = null;
            }
            return b.a.a(list);
        }

        @Override // com.ss.android.ugc.aweme.cz.a.e
        public final boolean a() {
            if (a.f() != null) {
                com.ss.android.ugc.aweme.port.in.a f2 = a.f();
                if (f2 == null) {
                    l.b();
                }
                List<? extends MusicModel> list = f2.f115560a;
                if (list == null || list.isEmpty()) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(List<String> list, String str, String str2) {
        String str3 = str;
        String str4 = "";
        l.d(list, str4);
        com.ss.android.ugc.aweme.c.c cVar = new com.ss.android.ugc.aweme.c.c(list);
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        a(new com.ss.android.ugc.aweme.c.a(cVar, 0, str3, str4, false, false, 114));
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(List<String> list, String str, boolean z) {
        String str2 = "";
        l.d(list, str2);
        com.ss.android.ugc.aweme.c.c cVar = new com.ss.android.ugc.aweme.c.c(list);
        if (str != null) {
            str2 = str;
        }
        a(new com.ss.android.ugc.aweme.c.a(cVar, 0, str2, null, z, false, 90));
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(boolean z) {
        if (!z || !f140280h || f140282j || !cx.a()) {
            i();
            e(false);
        } else {
            e(true);
        }
        f.a.b.b bVar = f140285m;
        if (bVar != null) {
            bVar.dispose();
        }
        r.a("ai_music_reset", new com.ss.android.ugc.tools.f.b().a("login", String.valueOf(com.ss.android.ugc.aweme.port.in.g.a().A().b())).f149193a);
    }

    private static void i() {
        f140274b = null;
        f140279g = 0;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final com.ss.android.ugc.aweme.cz.a.e a() {
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void b() {
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void d() {
        f140279g++;
    }

    public static com.ss.android.ugc.aweme.port.in.a f() {
        c cVar = f140283k;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final MusicModel c() {
        List<? extends MusicModel> list = f140274b;
        if (list == null || com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return null;
        }
        return (MusicModel) list.get(f140279g % list.size());
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$a  reason: collision with other inner class name */
    static final class C3701a extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3701a f140286a = new C3701a();

        static {
            Covode.recordClassIndex(91655);
        }

        C3701a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            l.b(applicationService, "");
            Application c2 = applicationService.c();
            l.b(c2, "");
            File filesDir = c2.getFilesDir();
            StringBuilder sb = new StringBuilder();
            l.b(filesDir, "");
            return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("ai_choose_music").toString();
        }
    }

    static {
        Covode.recordClassIndex(91654);
    }

    public static final void g() {
        List<String> list;
        com.ss.android.ugc.aweme.tools.music.e.a aVar = com.ss.android.ugc.aweme.tools.music.e.a.f140436a;
        if (aVar != null && (list = aVar.f140439d) != null && !list.isEmpty()) {
            if (l.a((Object) aVar.f140439d.get(0), (Object) b.b())) {
                if (System.currentTimeMillis() - b.a() < 86400000) {
                    return;
                }
            }
            b.i.b(new g(aVar), b.i.f4824a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.music.e.a f140307a;

        static {
            Covode.recordClassIndex(91663);
        }

        g(com.ss.android.ugc.aweme.tools.music.e.a aVar) {
            this.f140307a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = this.f140307a.f140439d.get(0);
            l.b(str, "");
            String str2 = str;
            l.d(str2, "");
            l.d(str2, "");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            l.b(createIAVServiceProxybyMonsterPlugin.getApplicationService(), "");
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = b.a();
            }
            if (j.f107229h) {
                String executeGet = NetworkUtils.executeGet(0, str2);
                l.b(executeGet, "");
                if (!(executeGet == null || executeGet.length() == 0)) {
                    SharedPreferences.Editor edit = b.f140308a.edit();
                    edit.putLong("ai_music_time", System.currentTimeMillis());
                    edit.putString("ai_music_list", executeGet);
                    edit.putString("ai_music_url", this.f140307a.f140439d.get(0));
                    edit.commit();
                }
                return z.f158842a;
            }
            throw new IOException();
        }
    }

    public static List<MusicModel> h() {
        boolean z;
        String string = b.f140308a.getString("ai_music_list", "");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            MusicList musicList = (MusicList) com.ss.android.ugc.aweme.tools.music.f.d.f140594a.a(string, MusicList.class);
            if (musicList == null || com.bytedance.common.utility.collection.b.a((Collection) musicList.musicList)) {
                return null;
            }
            return c.a.a(musicList.musicList);
        } catch (Exception unused) {
            SharedPreferences.Editor edit = b.f140308a.edit();
            edit.remove("ai_music_time");
            edit.remove("ai_music_list");
            edit.remove("ai_music_url");
            edit.commit();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void b(boolean z) {
        f140280h = z;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void c(boolean z) {
        f140281i = z;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void d(boolean z) {
        f140282j = z;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void b(m mVar) {
        c cVar = f140283k;
        if (cVar != null) {
            cVar.a(mVar);
        }
        f140278f = mVar;
    }

    static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f140296a = 0;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f140297b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f140298c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f140299d;

        static {
            Covode.recordClassIndex(91658);
        }

        d(int i2) {
            this.f140297b = i2;
            this.f140298c = true;
            this.f140299d = 0;
        }

        @Override // f.a.w
        public final void subscribe(final v<List<MusicModel>> vVar) {
            l.d(vVar, "");
            b.i<List<MusicModel>> a2 = MusicService.m().a(this.f140296a, this.f140297b, this.f140298c, this.f140299d);
            if (a2 != null) {
                a2.a(new b.g() {
                    /* class com.ss.android.ugc.aweme.tools.music.a.a.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(91659);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // b.g
                    public final /* synthetic */ Object then(b.i iVar) {
                        l.b(iVar, "");
                        if (iVar.c() || !iVar.a()) {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.d() != null) {
                            a.f140274b = (List) iVar.d();
                            vVar.a(iVar.d());
                        } else {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f140301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f140302b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f140303c = false;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f140304d;

        static {
            Covode.recordClassIndex(91660);
        }

        e(int i2, int i3, int i4) {
            this.f140301a = i2;
            this.f140302b = i3;
            this.f140304d = i4;
        }

        @Override // f.a.w
        public final void subscribe(final v<SuggestMusicList> vVar) {
            l.d(vVar, "");
            b.i<SuggestMusicList> b2 = MusicService.m().b(this.f140301a, this.f140302b, this.f140303c, this.f140304d);
            if (b2 != null) {
                b2.a(new b.g() {
                    /* class com.ss.android.ugc.aweme.tools.music.a.a.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(91661);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // b.g
                    public final /* synthetic */ Object then(b.i iVar) {
                        l.b(iVar, "");
                        if (iVar.c() || !iVar.a()) {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.d() != null) {
                            Object d2 = iVar.d();
                            l.b(d2, "");
                            a.f140274b = ((SuggestMusicList) d2).musicList;
                            vVar.a(iVar.d());
                        } else {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f140306a = new f();

        static {
            Covode.recordClassIndex(91662);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : a.f140273a) {
                if (t != null) {
                    t.a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final t<List<MusicModel>> a(int i2) {
        t<List<MusicModel>> a2 = t.a(new d(i2));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(i iVar) {
        if (iVar == null) {
            f140273a.clear();
            return;
        }
        f140273a.add(iVar);
        if (f() != null) {
            iVar.a();
        }
    }

    private static void e(boolean z) {
        boolean z2;
        c cVar;
        c cVar2;
        com.ss.android.ugc.aweme.c.a aVar;
        c cVar3 = f140283k;
        if (!(((cVar3 == null || (aVar = cVar3.f140346i) == null) ? null : aVar.f69576a) instanceof com.ss.android.ugc.aweme.c.c) || (cVar2 = f140283k) == null || cVar2.b() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        for (T t : f140284l.values()) {
            if (!z || (!l.a((Object) t, (Object) f140283k)) || !z2) {
                t.e();
            }
        }
        Map<String, c> map = f140284l;
        map.clear();
        if (z2 && (cVar = f140283k) != null) {
            map.put(cVar.a(), cVar);
        }
        com.ss.android.ugc.tools.utils.i.a(new File(e()));
        f140283k = null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final String a(com.ss.android.ugc.aweme.c.a aVar) {
        T t;
        l.d(aVar, "");
        com.ss.android.ugc.aweme.tools.music.a.b.a b2 = com.ss.android.ugc.aweme.tools.music.a.b.e.f140336a.b(aVar.f69576a);
        Iterator<T> it = f140284l.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.a(aVar)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            t2 = new c(aVar, b2);
            f140284l.put(t2.a(), t2);
            t2.c();
        }
        m mVar = f140277e;
        if (mVar != null) {
            t2.a(mVar);
        }
        m mVar2 = f140278f;
        if (mVar2 != null && (aVar.f69576a instanceof com.ss.android.ugc.aweme.c.c)) {
            t2.a(mVar2);
        }
        f.a.b.b bVar = f140285m;
        if (bVar != null) {
            bVar.dispose();
        }
        f140285m = t2.d().a(f.f140306a, f.a.e.b.a.f157191d);
        f140283k = t2;
        return t2.a();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(m mVar) {
        c cVar;
        if (mVar == null) {
            m mVar2 = f140277e;
            if (!(mVar2 == null || (cVar = f140283k) == null)) {
                l.d(mVar2, "");
                cVar.f140343f.remove(mVar2);
            }
        } else {
            c cVar2 = f140283k;
            if (cVar2 != null) {
                cVar2.a(mVar);
            }
        }
        f140277e = mVar;
    }

    public static t<SuggestMusicList> a(int i2, int i3, int i4) {
        t<SuggestMusicList> a2 = t.a(new e(i2, i3, i4));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(ExtractFramesModel extractFramesModel, String str, String str2, long j2) {
        String str3 = str;
        com.ss.android.ugc.aweme.c.d dVar = new com.ss.android.ugc.aweme.c.d(extractFramesModel);
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        a(new com.ss.android.ugc.aweme.c.a(dVar, j2, str3, str4, false, false, 112));
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final void a(String str, String str2, String str3, long j2) {
        String str4 = str2;
        String str5 = "";
        l.d(str, str5);
        l.d(str, str5);
        com.ss.android.ugc.aweme.c.b bVar = new com.ss.android.ugc.aweme.c.b(str, 0, j2);
        if (str4 == null) {
            str4 = str5;
        }
        if (str3 != null) {
            str5 = str3;
        }
        a(new com.ss.android.ugc.aweme.c.a(bVar, 0, str4, str5, false, false, 114));
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.c
    public final t<com.ss.android.ugc.aweme.port.in.a> a(String str, long j2, int i2, int i3, int i4, boolean z) {
        c cVar;
        if (str == null) {
            cVar = f140283k;
        } else {
            cVar = f140284l.get(str);
            if (cVar == null) {
                cVar = f140283k;
            }
        }
        com.ss.android.ugc.aweme.tools.music.a.b.a b2 = com.ss.android.ugc.aweme.tools.music.a.b.e.f140336a.b(null);
        if (cVar == null) {
            cVar = new c(new com.ss.android.ugc.aweme.c.a(null, 0, null, null, false, false, 126), b2);
        }
        if (z) {
            cVar.f140344g = false;
            f.a.l.b<com.ss.android.ugc.aweme.port.in.a> bVar = new f.a.l.b<>();
            l.b(bVar, "");
            cVar.f140341d = bVar;
        }
        if (!cVar.f140344g) {
            cVar.f140344g = true;
            cVar.a(i2, j2, null, i3, i4);
        }
        t<com.ss.android.ugc.aweme.port.in.a> c2 = cVar.f140341d.c();
        l.b(c2, "");
        return c2;
    }
}
