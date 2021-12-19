package com.ss.android.ugc.gamora.recorder.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3980a f147796a = new C3980a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Keva f147797b;

    static {
        Covode.recordClassIndex(97432);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.a$a  reason: collision with other inner class name */
    public static final class C3980a {
        static {
            Covode.recordClassIndex(97433);
        }

        private C3980a() {
        }

        public /* synthetic */ C3980a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        return this.f147797b.getBoolean("has_enable_switch_duration_after_shooting_tip_shown", false);
    }

    public final void b() {
        this.f147797b.storeBoolean("has_enable_switch_duration_after_shooting_tip_shown", true);
    }

    public a() {
        Keva repo = Keva.getRepo("enable_switch_duration_after_shooting_tip");
        l.b(repo, "");
        this.f147797b = repo;
    }
}
