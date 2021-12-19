package com.ss.android.ugc.aweme.account.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.k;

public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f63145a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f63146b;

    static {
        Covode.recordClassIndex(38892);
        int[] iArr = new int[k.values().length];
        f63145a = iArr;
        iArr[k.RESET_PASSWORD_FOR_EMAIL.ordinal()] = 1;
        iArr[k.RESET_PASSWORD_FOR_PHONE.ordinal()] = 2;
        int[] iArr2 = new int[k.values().length];
        f63146b = iArr2;
        iArr2[k.CHANGE_PASSWORD.ordinal()] = 1;
        iArr2[k.RESET_PASSWORD_FOR_EMAIL.ordinal()] = 2;
        iArr2[k.RESET_PASSWORD_FOR_PHONE.ordinal()] = 3;
        iArr2[k.CREATE_PASSWORD_FOR_PHONE.ordinal()] = 4;
        iArr2[k.CREATE_PASSWORD_FOR_EMAIL.ordinal()] = 5;
    }
}
