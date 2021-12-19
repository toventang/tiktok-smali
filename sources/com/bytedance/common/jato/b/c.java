package com.bytedance.common.jato.b;

import android.content.SharedPreferences;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class c {
    static {
        Covode.recordClassIndex(15802);
    }

    public static SharedPreferences a() {
        return d.a(Jato.getContext(), "start_up_fdio", 0);
    }
}
