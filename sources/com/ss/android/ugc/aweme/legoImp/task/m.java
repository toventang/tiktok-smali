package com.ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.i.a;
import com.ss.android.i.d;
import com.ss.android.ugc.aweme.app.l;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final KidsModeLegacyTask f107984a;

    static {
        Covode.recordClassIndex(69219);
    }

    m(KidsModeLegacyTask kidsModeLegacyTask) {
        this.f107984a = kidsModeLegacyTask;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        KidsModeLegacyTask kidsModeLegacyTask = this.f107984a;
        String str = (String) obj;
        if (!TextUtils.equals(kidsModeLegacyTask.f107818a, str)) {
            kidsModeLegacyTask.f107818a = str;
            if (!TextUtils.isEmpty(kidsModeLegacyTask.f107818a)) {
                a aVar = d.a.f59589a.f59586g;
                if (aVar != null) {
                    aVar.f59546e = kidsModeLegacyTask.f107818a;
                    d.a.f59589a.a(aVar);
                }
                String str2 = kidsModeLegacyTask.f107818a;
                String installId = AppLog.getInstallId();
                if (installId == null) {
                    installId = "";
                }
                SecApiImpl.a().updateDeviceIdAndInstallId(str2, installId);
                if (l.a() != ((int) com.bytedance.ies.ugc.appcontext.d.e())) {
                    SecApiImpl.a().reportData("install");
                }
                new f.c().b((w) new KidsModeLegacyTask.DeviceIdChangeTask(kidsModeLegacyTask, (byte) 0)).a();
            }
        }
    }
}
