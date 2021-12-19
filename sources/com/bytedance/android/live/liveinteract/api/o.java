package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10017a = o.class.getSimpleName();

    static {
        Covode.recordClassIndex(5201);
    }

    public enum a {
        BAN_FOR_LINK(13),
        BAN_FOR_BROADCASTING(2);
        
        public final int type;

        static {
            Covode.recordClassIndex(5202);
        }

        private a(int i2) {
            this.type = i2;
        }
    }
}
