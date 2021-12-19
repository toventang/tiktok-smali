package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.statisticlogger.e;
import com.bytedance.librarian.Librarian;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.f;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.deviceregister.a.d;
import com.ss.android.ugc.aweme.experiment.ex;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.c;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NpthCoreInitTask implements w {
    static {
        Covode.recordClassIndex(69070);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static class a implements ICommonParams {

        /* renamed from: a  reason: collision with root package name */
        public String f107845a;

        static {
            Covode.recordClassIndex(69071);
        }

        @Override // com.bytedance.crash.ICommonParams
        public final List<String> getPatchInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final Map<String, Integer> getPluginInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final String getSessionId() {
            return e.f35345b;
        }

        @Override // com.bytedance.crash.ICommonParams
        public final String getDeviceId() {
            return DeviceRegisterManager.getDeviceId();
        }

        @Override // com.bytedance.crash.ICommonParams
        public final long getUserId() {
            try {
                return Long.parseLong(AppLog.getUserId());
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return 0;
            }
        }

        @Override // com.bytedance.crash.ICommonParams
        public final Map<String, Object> getCommonParams() {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            q.b(hashMap2, true);
            hashMap.putAll(hashMap2);
            if (!hashMap.containsKey("release_build")) {
                hashMap.put("release_build", d.f59410f);
            }
            if ("3902".equals(this.f107845a)) {
                hashMap.put("aid", "3902");
            }
            return hashMap;
        }

        a(String str) {
            this.f107845a = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (ex.c()) {
            return ae.MAIN;
        }
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String str;
        Npth.setApplication((Application) context);
        if (!f.b(context).contains("miniapp")) {
            String b2 = f.b(context);
            if (TextUtils.isEmpty(b2) || !b2.contains("bm")) {
                str = null;
            } else {
                str = "3902";
            }
            if (((Boolean) c.f107451g.getValue()).booleanValue()) {
                Npth.setNpthStartEventDelayTime(5000);
            } else if (((Boolean) c.f107452h.getValue()).booleanValue()) {
                Npth.setNpthStartEventDelayTime(7000);
            }
            Npth.init(context, new a(str), true, true, true);
            if (!((Boolean) ex.f90002a.getValue()).booleanValue()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a("npth_tools", false, (Context) null);
                m.a(uptimeMillis, "npth_tools");
            }
        }
    }
}
