package com.ss.android.ugc.aweme.ag;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.j.d;
import com.bytedance.keva.Keva;

public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f66292d = new a((byte) 0);

    static {
        Covode.recordClassIndex(40733);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40734);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.crash.j.d
    public final void a() {
        Keva.getRepo("crash_marker_repo").storeLong("key_last_time", System.currentTimeMillis());
    }
}
