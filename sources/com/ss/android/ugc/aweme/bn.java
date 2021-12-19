package com.ss.android.ugc.aweme;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

public interface bn {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68733a = a.f68734a;

    static {
        Covode.recordClassIndex(42321);
    }

    void fetchLoginHistoryState(m mVar, b<? super Integer, z> bVar);

    String getLatestLoginMethodName();

    boolean getSaveLoginStatus();

    boolean isCurrentMethodAvaliable();

    boolean isOneKeyLoginExprimentEnable();

    boolean isTrustedEnvLoginFreshInstallEnable();

    void updateLoginHistoryState(int i2, b<? super Integer, z> bVar);

    void updateMethodInfo(String str, Object... objArr);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f68734a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(42322);
        }
    }
}
