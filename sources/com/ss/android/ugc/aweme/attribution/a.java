package com.ss.android.ugc.aweme.attribution;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.c;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Aweme f67082a;

    /* renamed from: b  reason: collision with root package name */
    static Keva f67083b;

    /* renamed from: c  reason: collision with root package name */
    static long f67084c;

    /* renamed from: d  reason: collision with root package name */
    static final Handler f67085d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.specact.api.a f67086e = new C1508a();

    /* renamed from: f  reason: collision with root package name */
    public static final a f67087f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67088g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f67089h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f67090i = f67083b.getBoolean("video_consume_10_minutes", false);

    /* renamed from: j  reason: collision with root package name */
    private static boolean f67091j;

    /* renamed from: k  reason: collision with root package name */
    private static Keva f67092k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f67093l;

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f67094m = new b();

    /* renamed from: com.ss.android.ugc.aweme.attribution.a$a  reason: collision with other inner class name */
    public static final class C1508a implements com.ss.android.ugc.aweme.specact.api.a {
        static {
            Covode.recordClassIndex(41332);
        }

        C1508a() {
        }

        @Override // com.ss.android.ugc.aweme.specact.api.a
        public final void c() {
            a.a();
            a.c();
        }

        /* renamed from: com.ss.android.ugc.aweme.attribution.a$a$a  reason: collision with other inner class name */
        static final class RunnableC1509a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f67095a;

            static {
                Covode.recordClassIndex(41333);
            }

            RunnableC1509a(long j2) {
                this.f67095a = j2;
            }

            public final void run() {
                a.f67083b.storeLong("video_consume_time_name", this.f67095a);
            }
        }

        @Override // com.ss.android.ugc.aweme.specact.api.a
        public final void a() {
            a.f67082a = null;
            a.a();
            a.c();
        }

        @Override // com.ss.android.ugc.aweme.specact.api.a
        public final void b() {
            a.f67087f.b();
            p.f107614a.post(new RunnableC1509a(a.f67084c));
            a.c();
        }

        @Override // com.ss.android.ugc.aweme.specact.api.a
        public final void a(Aweme aweme) {
            a.f67082a = aweme;
            a.c();
        }
    }

    public static final class b implements Runnable {
        static {
            Covode.recordClassIndex(41334);
        }

        b() {
        }

        public final void run() {
            Aweme a2;
            String str;
            l.b(v.O(), "");
            Activity j2 = f.j();
            if ((j2 instanceof e) && (a2 = AwemeChangeCallBack.a((e) j2)) != null) {
                String aid = a2.getAid();
                Aweme aweme = a.f67082a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(aid, str)) {
                    a.f67084c++;
                }
            }
            a.f67085d.postDelayed(this, 1000);
        }
    }

    private a() {
    }

    public static void a() {
        if (f67089h && !f67088g) {
            f67088g = true;
            f67085d.postDelayed(f67094m, 1000);
        }
    }

    public final void b() {
        if (f67088g) {
            f67088g = false;
            f67085d.removeCallbacks(f67094m);
        }
        d();
    }

    public static void c() {
        if (f67089h && f67093l) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a("" + f67084c).a();
        }
    }

    static {
        Covode.recordClassIndex(41331);
        a aVar = new a();
        f67087f = aVar;
        f67092k = Keva.getRepo("deliverAdKeva");
        Keva repo = Keva.getRepo("keva_video_consume");
        l.b(repo, "");
        f67083b = repo;
        f67084c = repo.getLong("video_consume_time_name", 0);
        boolean z = f67083b.getBoolean("video_consume_15_minutes", false);
        f67091j = z;
        f67089h = !z;
        Keva repo2 = Keva.getRepo("deliverAdKeva");
        f67092k = repo2;
        f67093l = repo2.getBoolean("webtoon_platform_enabled", false);
        aVar.d();
    }

    private final void d() {
        c a2 = UgCommonServiceImpl.j().a();
        if (f67084c >= 600 && !f67090i) {
            f67090i = true;
            a2.d("af_playtime_10min");
            f67083b.storeBoolean("video_consume_10_minutes", true);
            c();
        }
        if (f67084c >= 900 && !f67091j) {
            f67091j = true;
            a2.d("af_playtime_15min");
            f67083b.storeBoolean("video_consume_15_minutes", true);
            c();
            f67089h = false;
            b();
        }
    }
}
