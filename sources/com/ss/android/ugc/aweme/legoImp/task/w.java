package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;

final /* synthetic */ class w implements ICrashCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ICrashReportService f107998a;

    static {
        Covode.recordClassIndex(69238);
    }

    w(ICrashReportService iCrashReportService) {
        this.f107998a = iCrashReportService;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        this.f107998a.report(2);
    }
}
