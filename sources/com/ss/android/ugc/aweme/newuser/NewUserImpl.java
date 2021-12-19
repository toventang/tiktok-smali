package com.ss.android.ugc.aweme.newuser;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi;
import com.ss.android.ugc.b;

public final class NewUserImpl implements INewUserApi {
    static {
        Covode.recordClassIndex(72376);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi
    public final void a() {
        a.a();
    }

    public static INewUserApi b() {
        MethodCollector.i(6404);
        Object a2 = b.a(INewUserApi.class, false);
        if (a2 != null) {
            INewUserApi iNewUserApi = (INewUserApi) a2;
            MethodCollector.o(6404);
            return iNewUserApi;
        }
        if (b.cU == null) {
            synchronized (INewUserApi.class) {
                try {
                    if (b.cU == null) {
                        b.cU = new NewUserImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6404);
                    throw th;
                }
            }
        }
        NewUserImpl newUserImpl = (NewUserImpl) b.cU;
        MethodCollector.o(6404);
        return newUserImpl;
    }
}
