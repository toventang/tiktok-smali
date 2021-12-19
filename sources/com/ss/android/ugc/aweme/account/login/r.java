package com.ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;

public final /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f63535a;

    static {
        Covode.recordClassIndex(39166);
        int[] iArr = new int[LoginMethodName.values().length];
        f63535a = iArr;
        iArr[LoginMethodName.EMAIL_PASS.ordinal()] = 1;
        iArr[LoginMethodName.USER_NAME_PASS.ordinal()] = 2;
        iArr[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 3;
        iArr[LoginMethodName.PHONE_SMS.ordinal()] = 4;
        iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 5;
    }
}
