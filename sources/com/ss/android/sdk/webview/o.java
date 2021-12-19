package com.ss.android.sdk.webview;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f60239a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60240b;

    /* renamed from: c  reason: collision with root package name */
    public String f60241c;

    /* renamed from: d  reason: collision with root package name */
    public long f60242d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f60243e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f60244f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f60245g = new ArrayList();

    static {
        Covode.recordClassIndex(37207);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return str + "_" + str2;
    }

    public o(String str, String str2, String str3) {
        this.f60239a = str2 == null ? "" : str2;
        this.f60240b = str3 == null ? "" : str3;
        this.f60241c = str == null ? "" : str;
    }
}
