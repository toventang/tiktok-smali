package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.platform.a.a;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.utils.h;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;

final class ab implements AttachUserData {

    /* renamed from: a  reason: collision with root package name */
    private final a f107942a;

    static {
        Covode.recordClassIndex(69182);
    }

    ab(a aVar) {
        this.f107942a = aVar;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        HashMap hashMap = new HashMap();
        if (this.f107942a != null) {
            String str = "";
            ALog.d("horae", str);
            if ((Thread.getDefaultUncaughtExceptionHandler() instanceof com.ss.android.ugc.aweme.i18n.a) && (uncaughtExceptionHandler = ((com.ss.android.ugc.aweme.i18n.a) Thread.getDefaultUncaughtExceptionHandler()).f99763a) != null) {
                str = str + "super:" + uncaughtExceptionHandler.getClass().getName();
            }
            hashMap.put("double_turbo_quicken_engine", str + Thread.getDefaultUncaughtExceptionHandler().getClass().getName() + df.f142819a + ",ArrayMapPlugin:" + h.f143050b);
        }
        return hashMap;
    }
}
