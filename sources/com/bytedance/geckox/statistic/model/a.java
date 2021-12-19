package com.bytedance.geckox.statistic.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f30073a;

    /* renamed from: b  reason: collision with root package name */
    public String f30074b;

    /* renamed from: c  reason: collision with root package name */
    public String f30075c;

    /* renamed from: d  reason: collision with root package name */
    public String f30076d;

    /* renamed from: e  reason: collision with root package name */
    public String f30077e;

    /* renamed from: f  reason: collision with root package name */
    public int f30078f;

    /* renamed from: g  reason: collision with root package name */
    public int f30079g = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f30080h;

    /* renamed from: i  reason: collision with root package name */
    public int f30081i;

    /* renamed from: j  reason: collision with root package name */
    public int f30082j;

    /* renamed from: k  reason: collision with root package name */
    public String f30083k;

    /* renamed from: l  reason: collision with root package name */
    public long f30084l = -1;

    /* renamed from: m  reason: collision with root package name */
    public long f30085m = -1;
    public int n = -1;

    static {
        Covode.recordClassIndex(17476);
    }

    public static String a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
