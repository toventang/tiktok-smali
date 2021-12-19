package com.ss.android.ugc.aweme.ug.praise;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.d;
import com.ss.android.ugc.aweme.ug.praise.b;
import h.f.b.l;

public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static d f141974i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f141975j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f141976a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f141977b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f141978c;

    /* renamed from: d  reason: collision with root package name */
    public String f141979d = "";

    /* renamed from: e  reason: collision with root package name */
    public long f141980e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f141981f;

    /* renamed from: g  reason: collision with root package name */
    public long f141982g;

    /* renamed from: h  reason: collision with root package name */
    public long f141983h;

    /* renamed from: k  reason: collision with root package name */
    private final Keva f141984k;

    /* renamed from: l  reason: collision with root package name */
    private final String f141985l;

    static {
        Covode.recordClassIndex(92774);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92775);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str) {
            l.d(str, "");
            if (c.f141974i == null) {
                Object service = ServiceManager.get().getService(LocalTestApi.class);
                l.b(service, "");
                c.f141974i = ((LocalTestApi) service).getSpecActDebugService();
            }
            d dVar = c.f141974i;
            if (dVar != null) {
                dVar.a("Praise", str);
            }
        }
    }

    public final void a(long j2) {
        this.f141976a = j2;
        this.f141984k.storeLong(this.f141985l + "key_last_dialog_show_time", j2);
    }

    public final void b(long j2) {
        if (this.f141980e == 0) {
            this.f141980e = j2;
            this.f141984k.storeLong("key_app_first_open_time", j2);
        }
    }

    public final void c(long j2) {
        this.f141982g = j2;
        this.f141984k.storeLong(this.f141985l + "key_last_try_show_time", j2);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f141979d = str;
        this.f141984k.storeString(this.f141985l + "key_last_show_version", str);
    }

    public final void b(boolean z) {
        this.f141978c = z;
        this.f141984k.storeBoolean(this.f141985l + "key_is_clicked_submit", z);
    }

    public final void a(boolean z) {
        this.f141977b = z;
        this.f141984k.storeBoolean(this.f141985l + "key_is_clicked_feedback", z);
    }

    public c(b.EnumC3781b bVar) {
        l.d(bVar, "");
        Keva repo = Keva.getRepo("praise_keva");
        l.b(repo, "");
        this.f141984k = repo;
        String bVar2 = bVar.toString();
        this.f141985l = bVar2;
        b(repo.getLong("key_app_first_open_time", 0));
        a(repo.getLong(bVar2 + "key_last_dialog_show_time", 0));
        a(repo.getBoolean(bVar2 + "key_is_clicked_feedback", false));
        b(repo.getBoolean(bVar2 + "key_is_clicked_submit", false));
        String string = repo.getString(bVar2 + "key_last_show_version", "");
        l.b(string, "");
        a(string);
        c(repo.getLong(bVar2 + "key_last_try_show_time", 0));
        long j2 = repo.getLong(bVar2 + "key_last_2_try_show_time", 0);
        this.f141983h = j2;
        repo.storeLong(bVar2 + "key_last_2_try_show_time", j2);
        boolean z = repo.getBoolean("key_debug_open", false);
        this.f141981f = z;
        repo.storeBoolean("key_debug_open", z);
    }
}
