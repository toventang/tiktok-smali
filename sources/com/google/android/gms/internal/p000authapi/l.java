package com.google.android.gms.internal.p000authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api.l  reason: invalid package */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Feature f50562a;

    /* renamed from: b  reason: collision with root package name */
    public static final Feature f50563b;

    /* renamed from: c  reason: collision with root package name */
    public static final Feature f50564c;

    /* renamed from: d  reason: collision with root package name */
    public static final Feature f50565d;

    /* renamed from: e  reason: collision with root package name */
    public static final Feature[] f50566e;

    /* renamed from: f  reason: collision with root package name */
    private static final Feature f50567f;

    /* renamed from: g  reason: collision with root package name */
    private static final Feature f50568g;

    /* renamed from: h  reason: collision with root package name */
    private static final Feature f50569h;

    static {
        Covode.recordClassIndex(31525);
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4);
        f50562a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2);
        f50563b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1);
        f50567f = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1);
        f50568g = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3);
        f50564c = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 3);
        f50565d = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2);
        f50569h = feature7;
        f50566e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
