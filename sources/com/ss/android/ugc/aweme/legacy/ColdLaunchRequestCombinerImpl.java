package com.ss.android.ugc.aweme.legacy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.request.c;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;
import com.ss.android.ugc.b;

public class ColdLaunchRequestCombinerImpl implements IColdLaunchRequestCombiner {

    /* renamed from: a  reason: collision with root package name */
    private final IColdLaunchRequestCombiner f107299a = c.f120649d;

    static {
        Covode.recordClassIndex(68658);
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean a() {
        return this.f107299a.a();
    }

    public static IColdLaunchRequestCombiner b() {
        MethodCollector.i(3607);
        Object a2 = b.a(IColdLaunchRequestCombiner.class, false);
        if (a2 != null) {
            IColdLaunchRequestCombiner iColdLaunchRequestCombiner = (IColdLaunchRequestCombiner) a2;
            MethodCollector.o(3607);
            return iColdLaunchRequestCombiner;
        }
        if (b.cg == null) {
            synchronized (IColdLaunchRequestCombiner.class) {
                try {
                    if (b.cg == null) {
                        b.cg = new ColdLaunchRequestCombinerImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3607);
                    throw th;
                }
            }
        }
        ColdLaunchRequestCombinerImpl coldLaunchRequestCombinerImpl = (ColdLaunchRequestCombinerImpl) b.cg;
        MethodCollector.o(3607);
        return coldLaunchRequestCombinerImpl;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final a a(String str) {
        return this.f107299a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void a(com.ss.android.ugc.aweme.requestcombine.a aVar) {
        this.f107299a.a(aVar);
    }
}
