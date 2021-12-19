package com.ss.android.ugc.aweme.sharedar;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f124499b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f124500a;

    static {
        Covode.recordClassIndex(81759);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81760);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public h() {
        Keva repo = Keva.getRepo("sharedar");
        l.b(repo, "");
        this.f124500a = repo;
    }
}
