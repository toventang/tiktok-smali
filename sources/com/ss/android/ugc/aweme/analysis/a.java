package com.ss.android.ugc.aweme.analysis;

import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static int f66391a = 20971520;

    /* renamed from: b  reason: collision with root package name */
    private static int f66392b = 10485760;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66393c;

    @Override // com.ss.android.ugc.aweme.framework.a.b
    public final String b() {
        return "AppLog";
    }

    static {
        Covode.recordClassIndex(40790);
    }

    @Override // com.ss.android.ugc.aweme.framework.a.b
    public final boolean a() {
        return this.f66393c;
    }

    public a(boolean z) {
        this.f66393c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    @Override // com.ss.android.ugc.aweme.framework.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.analysis.a.a(android.content.Context):void");
    }

    @Override // com.ss.android.ugc.aweme.framework.a.b
    public final void a(String str, Throwable th) {
        ALog.e(str, th);
    }

    @Override // com.ss.android.ugc.aweme.framework.a.b
    public final void a(String str, String str2, Exception exc) {
        ALog.e(str, str2, exc);
    }

    @Override // com.ss.android.ugc.aweme.framework.a.b
    public final void a(int i2, String str, String str2) {
        if (i2 == 2) {
            ALog.v(str, str2);
        } else if (i2 == 3) {
            ALog.d(str, str2);
        } else if (i2 == 4) {
            ALog.i(str, str2);
        } else if (i2 == 5) {
            ALog.w(str, str2);
        } else if (i2 == 6) {
            ALog.e(str, str2);
        }
    }
}
