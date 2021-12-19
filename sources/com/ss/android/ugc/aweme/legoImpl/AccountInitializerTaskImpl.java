package com.ss.android.ugc.aweme.legoImpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImpl.task.AccountRegisterTask;
import com.ss.android.ugc.aweme.legoImpl.task.ApiGuardInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.LoginProxyTask;
import com.ss.android.ugc.aweme.legoImpl.task.RegisterSessionReceiver;
import com.ss.android.ugc.aweme.legoImpl.task.TokenSdkTask;
import com.ss.android.ugc.b;

public final class AccountInitializerTaskImpl implements IAccountInitializerTaskApi {
    static {
        Covode.recordClassIndex(69242);
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final /* synthetic */ w a() {
        return new RegisterSessionReceiver();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final /* synthetic */ w b() {
        return new ApiGuardInitTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final /* synthetic */ w c() {
        return new TokenSdkTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final /* synthetic */ w d() {
        return new LoginProxyTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final /* synthetic */ w e() {
        return new AccountRegisterTask();
    }

    public static IAccountInitializerTaskApi f() {
        MethodCollector.i(6365);
        Object a2 = b.a(IAccountInitializerTaskApi.class, false);
        if (a2 != null) {
            IAccountInitializerTaskApi iAccountInitializerTaskApi = (IAccountInitializerTaskApi) a2;
            MethodCollector.o(6365);
            return iAccountInitializerTaskApi;
        }
        if (b.cq == null) {
            synchronized (IAccountInitializerTaskApi.class) {
                try {
                    if (b.cq == null) {
                        b.cq = new AccountInitializerTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6365);
                    throw th;
                }
            }
        }
        AccountInitializerTaskImpl accountInitializerTaskImpl = (AccountInitializerTaskImpl) b.cq;
        MethodCollector.o(6365);
        return accountInitializerTaskImpl;
    }
}
