package com.ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.common.applog.AppLog;
import com.ss.android.i.a;
import com.ss.android.i.d;
import com.ss.android.ugc.aweme.app.l;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LegacyTask f107988a;

    static {
        Covode.recordClassIndex(69228);
    }

    p(LegacyTask legacyTask) {
        this.f107988a = legacyTask;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LegacyTask legacyTask = this.f107988a;
        String str = (String) obj;
        if (!TextUtils.equals(legacyTask.f107831c, str)) {
            legacyTask.f107831c = str;
            if (!TextUtils.isEmpty(legacyTask.f107831c)) {
                String serverDeviceId = AppLog.getServerDeviceId();
                if (legacyTask.f107830b) {
                    FirebaseAnalytics instance = FirebaseAnalytics.getInstance(legacyTask.f107829a);
                    if (!TextUtils.isEmpty(serverDeviceId)) {
                        instance.setUserId(serverDeviceId);
                    }
                }
                a aVar = d.a.f59589a.f59586g;
                if (aVar != null) {
                    aVar.f59546e = legacyTask.f107831c;
                    d.a.f59589a.a(aVar);
                }
                String str2 = legacyTask.f107831c;
                String installId = AppLog.getInstallId();
                if (installId == null) {
                    installId = "";
                }
                SecApiImpl.a().updateDeviceIdAndInstallId(str2, installId);
                if (l.a() != ((int) com.bytedance.ies.ugc.appcontext.d.e())) {
                    SecApiImpl.a().reportData("install");
                }
                new f.c().b((w) new LegacyTask.DeviceIdChangeTask(legacyTask, (byte) 0)).a();
            }
        }
    }
}
