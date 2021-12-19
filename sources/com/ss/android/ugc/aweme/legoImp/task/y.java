package com.ss.android.ugc.aweme.legoImp.task;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.utils.bq;
import h.m.p;
import java.util.Objects;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f108000a = new y();

    /* renamed from: b  reason: collision with root package name */
    private static Keva f108001b;

    private y() {
    }

    static {
        Covode.recordClassIndex(69240);
    }

    public static final String a() {
        String str;
        String str2;
        if (f108001b == null) {
            f108001b = Keva.getRepo("PosterSR");
        }
        Keva keva = f108001b;
        String str3 = null;
        if (keva != null) {
            str = keva.getString("cpu_model", null);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String c2 = bq.c();
        if (c2 != null) {
            Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlin.CharSequence");
            str2 = p.b((CharSequence) c2).toString();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Build.HARDWARE;
        }
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            str3 = p.b((CharSequence) str2).toString();
        }
        a.b(4, "cacheCpuModel", "not use cacheCpuModel:".concat(String.valueOf(str3)));
        Keva keva2 = f108001b;
        if (keva2 != null) {
            keva2.storeString("cpu_model", str3);
        }
        return str3;
    }
}
