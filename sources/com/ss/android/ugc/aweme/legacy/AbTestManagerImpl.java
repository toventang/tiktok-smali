package com.ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.setting.bg;
import com.ss.android.ugc.aweme.settingsrequest.a;
import com.ss.android.ugc.b;

public class AbTestManagerImpl implements IAbTestManager {

    /* renamed from: a  reason: collision with root package name */
    private final IAbTestManager f107298a = a.b();

    static {
        Covode.recordClassIndex(68657);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void cz_() {
        this.f107298a.cz_();
    }

    public static IAbTestManager b() {
        MethodCollector.i(3027);
        Object a2 = b.a(IAbTestManager.class, false);
        if (a2 != null) {
            IAbTestManager iAbTestManager = (IAbTestManager) a2;
            MethodCollector.o(3027);
            return iAbTestManager;
        }
        if (b.cf == null) {
            synchronized (IAbTestManager.class) {
                try {
                    if (b.cf == null) {
                        b.cf = new AbTestManagerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3027);
                    throw th;
                }
            }
        }
        AbTestManagerImpl abTestManagerImpl = (AbTestManagerImpl) b.cf;
        MethodCollector.o(3027);
        return abTestManagerImpl;
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(l lVar) {
        this.f107298a.a(lVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(o oVar) {
        this.f107298a.a(oVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(bg bgVar) {
        this.f107298a.a(bgVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(boolean z) {
        this.f107298a.a(z);
    }
}
