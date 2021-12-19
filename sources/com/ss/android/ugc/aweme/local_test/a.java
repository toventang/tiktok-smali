package com.ss.android.ugc.aweme.local_test;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public LocalTestApi f108996a;

    static {
        Covode.recordClassIndex(69787);
    }

    /* renamed from: com.ss.android.ugc.aweme.local_test.a$a  reason: collision with other inner class name */
    public static final class C2792a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108997a = new a((byte) 0);

        static {
            Covode.recordClassIndex(69788);
        }
    }

    public static boolean a() {
        if (!b()) {
            return true;
        }
        return false;
    }

    private static boolean b() {
        LocalTestApi localTestApi = C2792a.f108997a.f108996a;
        if (localTestApi == null) {
            return true;
        }
        return localTestApi instanceof DefaultLocalTestImpl;
    }

    private a() {
        this.f108996a = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}
