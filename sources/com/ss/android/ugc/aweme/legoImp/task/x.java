package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;

final /* synthetic */ class x implements ICrashCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ICrashReportService f107999a;

    static {
        Covode.recordClassIndex(69239);
    }

    x(ICrashReportService iCrashReportService) {
        this.f107999a = iCrashReportService;
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        ICrashReportService iCrashReportService = this.f107999a;
        if (str == null || !str.contains("OutOfMemoryError")) {
            iCrashReportService.report(3);
        } else {
            iCrashReportService.report(1);
        }
    }
}
