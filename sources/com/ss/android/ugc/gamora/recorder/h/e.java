package com.ss.android.ugc.gamora.recorder.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f147804b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f147805a;

    static {
        Covode.recordClassIndex(97440);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97441);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e() {
        Keva repo = Keva.getRepo("upload_photomv_tip_keva");
        l.b(repo, "");
        this.f147805a = repo;
    }
}
