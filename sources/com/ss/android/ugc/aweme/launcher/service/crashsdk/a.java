package com.ss.android.ugc.aweme.launcher.service.crashsdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import h.f.b.l;

public final class a implements ICrashSdkApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107292a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ICrashSdkApi f107293b;

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void a() {
        this.f107293b.a();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void a(Throwable th, String str) {
        l.d(th, "");
        l.d(str, "");
        this.f107293b.a(th, str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final boolean a(long j2) {
        return this.f107293b.a(j2);
    }

    static {
        Covode.recordClassIndex(68647);
    }

    private a() {
        ICrashSdkApi b2 = CrashSdkImpl.b();
        l.b(b2, "");
        this.f107293b = b2;
    }
}
