package com.ss.android.ugc.aweme.analysis;

import com.bytedance.covode.number.Covode;
import com.ss.a.a.a;
import com.ss.android.agilelogger.ALog;

public final class b extends a {
    static {
        Covode.recordClassIndex(40792);
    }

    @Override // com.ss.a.a.b
    public final void g(String str, String str2) {
        ALog.v(str, str2);
    }

    @Override // com.ss.a.a.b
    public final void h(String str, String str2) {
        ALog.d(str, str2);
    }

    @Override // com.ss.a.a.b
    public final void i(String str, String str2) {
        ALog.i(str, str2);
    }

    @Override // com.ss.a.a.b
    public final void j(String str, String str2) {
        ALog.w(str, str2);
    }

    @Override // com.ss.a.a.b
    public final void k(String str, String str2) {
        ALog.e(str, str2);
    }

    @Override // com.ss.a.a.b
    public final void c(String str, Throwable th) {
        ALog.w(str, th);
    }

    @Override // com.ss.a.a.b
    public final void d(String str, Throwable th) {
        ALog.e(str, th);
    }

    @Override // com.ss.a.a.b
    public final void b(int i2, String str, StackTraceElement[] stackTraceElementArr) {
        ALog.stacktrace(i2, str, stackTraceElementArr);
    }

    @Override // com.ss.a.a.b
    public final void c(String str, String str2, Throwable th) {
        ALog.w(str, str2, th);
    }

    @Override // com.ss.a.a.b
    public final void d(String str, String str2, Throwable th) {
        ALog.e(str, str2, th);
    }

    @Override // com.ss.a.a.b
    public final void a(int i2, String str, String str2) {
        ALog.json(2, str, str2);
    }
}
