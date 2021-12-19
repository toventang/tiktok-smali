package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.EarlyAVLog;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements EarlyAVLog.IEarlyLogPrint {

    /* renamed from: a  reason: collision with root package name */
    static final EarlyAVLog.IEarlyLogPrint f7956a = new n();

    static {
        Covode.recordClassIndex(3933);
    }

    private n() {
    }

    @Override // com.ss.avframework.utils.EarlyAVLog.IEarlyLogPrint
    public final void print(int i2, String str, String str2, Throwable th) {
        a.b("LiveBroadcastContext", "code:" + i2 + " var2:" + str + " var3:" + str2, th);
    }
}
