package com.bytedance.ttnet.a;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class i implements SsHttpCall.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f44493a = i.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static volatile i f44494b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44495c;

    /* renamed from: d  reason: collision with root package name */
    private int f44496d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44497e;

    /* renamed from: f  reason: collision with root package name */
    private Set<String> f44498f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Integer> f44499g = new HashMap();

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean a() {
        return this.f44495c;
    }

    static {
        Covode.recordClassIndex(27243);
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean b() {
        return k.a().b();
    }

    private i() {
        d();
    }

    public static i c() {
        MethodCollector.i(9514);
        if (f44494b == null) {
            synchronized (i.class) {
                try {
                    if (f44494b == null) {
                        f44494b = new i();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9514);
                    throw th;
                }
            }
        }
        i iVar = f44494b;
        MethodCollector.o(9514);
        return iVar;
    }

    public final void d() {
        boolean z;
        boolean z2 = true;
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "app_delay_enable", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f44495c = z;
        if (TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "app_delay_use_black_list", 0) <= 0) {
            z2 = false;
        }
        this.f44497e = z2;
        this.f44496d = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "app_delay_whitelist_delay_time", 0);
        this.f44498f = g.d(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "app_delay_white_list", ""));
        this.f44499g = g.c(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "app_delay_black_list", ""));
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final int a(String str) {
        if (this.f44497e) {
            return this.f44499g.get(str).intValue();
        }
        return this.f44496d;
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final boolean b(String str) {
        if (!this.f44495c) {
            return false;
        }
        if (this.f44497e) {
            boolean a2 = a.a(str, this.f44499g.keySet());
            if (a2) {
                Logger.debug();
            } else {
                Logger.debug();
            }
            return a2;
        } else if (a.a(str, this.f44498f)) {
            Logger.debug();
            return false;
        } else {
            Logger.debug();
            return true;
        }
    }

    @Override // com.bytedance.retrofit2.SsHttpCall.a
    public final int a(String str, String str2) {
        return k.a().a(str, str2);
    }
}
