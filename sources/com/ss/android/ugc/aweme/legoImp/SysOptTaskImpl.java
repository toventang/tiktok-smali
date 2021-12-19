package com.ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.legoapi.ISysOptTaskApi;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.FdSanFatalSwitchTask;
import com.ss.android.ugc.aweme.legoImp.task.HoraeInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NativeBitmapTask;
import com.ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla;
import com.ss.android.ugc.b;

public final class SysOptTaskImpl implements ISysOptTaskApi {
    static {
        Covode.recordClassIndex(68879);
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w a() {
        return new InitGodzilla();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w b() {
        return new SysOptimizerTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w c() {
        return new SamangCrashHandleTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w d() {
        return new FdSanFatalSwitchTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w e() {
        return new HoraeInitTask();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final w f() {
        return new NativeBitmapTask();
    }

    public static ISysOptTaskApi g() {
        MethodCollector.i(5986);
        Object a2 = b.a(ISysOptTaskApi.class, false);
        if (a2 != null) {
            ISysOptTaskApi iSysOptTaskApi = (ISysOptTaskApi) a2;
            MethodCollector.o(5986);
            return iSysOptTaskApi;
        }
        if (b.cn == null) {
            synchronized (ISysOptTaskApi.class) {
                try {
                    if (b.cn == null) {
                        b.cn = new SysOptTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5986);
                    throw th;
                }
            }
        }
        SysOptTaskImpl sysOptTaskImpl = (SysOptTaskImpl) b.cn;
        MethodCollector.o(5986);
        return sysOptTaskImpl;
    }
}
