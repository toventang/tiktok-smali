package com.ss.android.ugc.aweme.kids.setting.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106817a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final IKidsAccountService f106818b = KidsAccountServiceImpl.h();

    private a() {
    }

    public static boolean b() {
        return f106818b.a();
    }

    public static String a() {
        return f106818b.b().getUserId();
    }

    static {
        Covode.recordClassIndex(68300);
    }
}
