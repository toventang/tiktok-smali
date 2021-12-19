package com.ss.android.ugc.gamora.recorder.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f147798b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f147799a;

    static {
        Covode.recordClassIndex(97434);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97435);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private int b() {
        return this.f147799a.getInt("story_lightening_tab_when_leave", -1);
    }

    public b() {
        Keva repo = Keva.getRepo("story_lightening_landing_strategy");
        l.b(repo, "");
        this.f147799a = repo;
    }

    public final boolean a() {
        if (b() == 0 || b() == -1) {
            return true;
        }
        return false;
    }
}
