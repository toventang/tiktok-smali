package com.ss.android.ugc.gamora.recorder.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.port.in.c;
import h.f.b.l;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f147802b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f147803a;

    static {
        Covode.recordClassIndex(97438);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97439);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d() {
        Keva repo = Keva.getRepo("live_tab_pop_up_in_record");
        l.b(repo, "");
        this.f147803a = repo;
    }

    public final boolean b() {
        return this.f147803a.getBoolean("never_live_flag_when_first_entrance".concat(String.valueOf(c.u.c())), false);
    }

    public final boolean a() {
        return this.f147803a.getBoolean("has_live_tab_pop_up_show".concat(String.valueOf(c.u.c())), false);
    }

    public final void a(boolean z) {
        this.f147803a.storeBoolean("never_live_flag_when_first_entrance".concat(String.valueOf(c.u.c())), z);
    }
}
