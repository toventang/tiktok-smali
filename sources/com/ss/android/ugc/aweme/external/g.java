package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;

public final class g implements IEnterFromService {

    /* renamed from: a  reason: collision with root package name */
    public static final g f90394a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static String f90395b = "HOME";

    private g() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
    public final String getEnterFrom() {
        return f90395b;
    }

    static {
        Covode.recordClassIndex(56746);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
    public final void setEnterFrom(String str) {
        f90395b = str;
    }
}
