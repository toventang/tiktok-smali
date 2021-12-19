package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.assem.arch.a.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.api.b;
import com.ss.android.ugc.aweme.favorites.api.c;
import com.ss.android.ugc.aweme.favorites.api.e;
import com.ss.android.ugc.aweme.favorites.api.f;
import com.ss.android.ugc.aweme.favorites.api.g;
import com.ss.android.ugc.aweme.favorites.api.h;
import f.a.t;

public interface k extends d {

    public static final class a {
        static {
            Covode.recordClassIndex(56934);
        }
    }

    static {
        Covode.recordClassIndex(56933);
    }

    t<b> a(int i2);

    t<c> a(long j2);

    t<e> a(long j2, String str);

    t<g> a(f fVar);

    t<h> a(String str);

    t<c> a(String str, long j2);

    t<c> b(long j2);

    t<BaseResponse> b(String str);
}
