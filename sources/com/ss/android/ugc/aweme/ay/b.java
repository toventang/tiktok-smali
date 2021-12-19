package com.ss.android.ugc.aweme.ay;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.retrofit.a;
import com.bytedance.lighten.a.c.m;
import com.facebook.net.d;
import java.util.concurrent.Executor;

public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    protected Executor f67771a;

    /* renamed from: b  reason: collision with root package name */
    public k f67772b;

    /* renamed from: c  reason: collision with root package name */
    public d f67773c;

    /* renamed from: d  reason: collision with root package name */
    protected l f67774d;

    static {
        Covode.recordClassIndex(41726);
    }

    public b() {
        this(new a());
        this.f67774d = new l();
    }

    private b(Executor executor) {
        this.f67771a = executor;
    }

    protected static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
