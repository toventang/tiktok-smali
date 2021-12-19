package com.ss.android.ugc.aweme.buildconfigdiff;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import l.b.c;
import l.b.e;
import l.b.o;

public final class UnlockStickerApiBcd {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68816a = "https://api-va.tiktokv.com";

    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(42391);
        }

        @o(a = "https://api-va.tiktokv.com/aweme/v1/ug/event/record/")
        @e
        q<Object> unlockSticker(@c(a = "event_type") int i2, @c(a = "extra") String str);
    }

    static {
        Covode.recordClassIndex(42390);
    }
}
