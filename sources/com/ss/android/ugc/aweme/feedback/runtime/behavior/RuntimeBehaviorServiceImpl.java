package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;
import java.util.Map;

public class RuntimeBehaviorServiceImpl implements IRuntimeBehaviorService {

    /* renamed from: a  reason: collision with root package name */
    private IRuntimeBehaviorService f95400a = b.f95406a;

    static {
        Covode.recordClassIndex(60415);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final Map<String, String> b() {
        return this.f95400a.b();
    }

    public static IRuntimeBehaviorService c() {
        MethodCollector.i(6266);
        Object a2 = b.a(IRuntimeBehaviorService.class, false);
        if (a2 != null) {
            IRuntimeBehaviorService iRuntimeBehaviorService = (IRuntimeBehaviorService) a2;
            MethodCollector.o(6266);
            return iRuntimeBehaviorService;
        }
        if (b.bp == null) {
            synchronized (IRuntimeBehaviorService.class) {
                try {
                    if (b.bp == null) {
                        b.bp = new RuntimeBehaviorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6266);
                    throw th;
                }
            }
        }
        RuntimeBehaviorServiceImpl runtimeBehaviorServiceImpl = (RuntimeBehaviorServiceImpl) b.bp;
        MethodCollector.o(6266);
        return runtimeBehaviorServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean a() {
        return this.f95400a.a();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(Context context) {
        this.f95400a.a(context);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(String str) {
        this.f95400a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(String str, String str2) {
        this.f95400a.a(str, str2);
    }
}
