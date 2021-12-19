package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f130919b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f130920a;

    static {
        Covode.recordClassIndex(85811);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85812);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        Keva repo = Keva.getRepo("auto_caption");
        l.b(repo, "");
        this.f130920a = repo;
    }

    public final void a(long j2) {
        this.f130920a.storeLong("authkey_store_time", j2);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f130920a.storeString("authkey_value", str);
    }
}
