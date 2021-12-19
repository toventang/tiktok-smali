package com.ss.android.ugc.aweme.launcher.service.crashsdk;

import com.bytedance.covode.number.Covode;

public interface ICrashSdkApi {
    static {
        Covode.recordClassIndex(68646);
    }

    void a();

    void a(Throwable th, String str);

    boolean a(long j2);
}
