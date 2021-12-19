package com.ss.ugc.live.sdk.msg.c;

import com.bytedance.covode.number.Covode;

public enum g {
    WS_MSG_ORIGIN,
    WS_ORIGIN,
    ORIGIN;
    
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(102815);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102816);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static g a(int i2) {
            if (i2 == 0) {
                return g.WS_MSG_ORIGIN;
            }
            if (i2 != 1) {
                return g.ORIGIN;
            }
            return g.WS_ORIGIN;
        }
    }

    public final String getStrategy(boolean z) {
        int i2 = h.f154180a[ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && z) {
                return "ws";
            }
            return "origin_http";
        } else if (z) {
            return "ws";
        } else {
            return "room_http";
        }
    }
}
