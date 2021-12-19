package com.ss.android.ugc.aweme.services.function;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class FunctionSupportServiceImpl implements IFunctionSupportService {
    static {
        Covode.recordClassIndex(79723);
    }

    @Override // com.ss.android.ugc.aweme.services.function.IFunctionSupportService
    public boolean notSupport(IFunctionKey iFunctionKey) {
        return false;
    }

    public static IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(6152);
        Object a2 = b.a(IFunctionSupportService.class, z);
        if (a2 != null) {
            IFunctionSupportService iFunctionSupportService = (IFunctionSupportService) a2;
            MethodCollector.o(6152);
            return iFunctionSupportService;
        }
        if (b.dD == null) {
            synchronized (IFunctionSupportService.class) {
                try {
                    if (b.dD == null) {
                        b.dD = new FunctionSupportServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6152);
                    throw th;
                }
            }
        }
        FunctionSupportServiceImpl functionSupportServiceImpl = (FunctionSupportServiceImpl) b.dD;
        MethodCollector.o(6152);
        return functionSupportServiceImpl;
    }
}
