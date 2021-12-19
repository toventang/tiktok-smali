package com.ss.android.ugc.aweme.services.function;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class FunctionSupportService implements IFunctionSupportService {
    public static final FunctionSupportService INSTANCE = new FunctionSupportService();
    private final /* synthetic */ IFunctionSupportService $$delegate_0;

    @Override // com.ss.android.ugc.aweme.services.function.IFunctionSupportService
    public final boolean notSupport(IFunctionKey iFunctionKey) {
        return this.$$delegate_0.notSupport(iFunctionKey);
    }

    static {
        Covode.recordClassIndex(79722);
    }

    private FunctionSupportService() {
        IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin = FunctionSupportServiceImpl.createIFunctionSupportServicebyMonsterPlugin(false);
        l.b(createIFunctionSupportServicebyMonsterPlugin, "");
        this.$$delegate_0 = createIFunctionSupportServicebyMonsterPlugin;
    }
}
