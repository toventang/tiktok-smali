package com.facebook.internal;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f48640a;

    /* renamed from: b  reason: collision with root package name */
    public String f48641b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48642c;

    /* renamed from: d  reason: collision with root package name */
    public int f48643d;

    /* renamed from: e  reason: collision with root package name */
    public EnumSet<ac> f48644e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Map<String, a>> f48645f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f48646g;

    /* renamed from: h  reason: collision with root package name */
    public l f48647h;

    /* renamed from: i  reason: collision with root package name */
    public String f48648i;

    /* renamed from: j  reason: collision with root package name */
    public String f48649j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f48650k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f48651l;

    /* renamed from: m  reason: collision with root package name */
    public String f48652m;
    public JSONArray n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;

    static {
        Covode.recordClassIndex(29341);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f48653a;

        /* renamed from: b  reason: collision with root package name */
        public String f48654b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f48655c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f48656d;

        static {
            Covode.recordClassIndex(29342);
        }

        static int[] a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = -1;
                int optInt = jSONArray.optInt(i2, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i2);
                    if (!ad.a(optString)) {
                        try {
                            i3 = Integer.parseInt(optString);
                        } catch (NumberFormatException e2) {
                            ad.a("FacebookSDK", (Exception) e2);
                        }
                        iArr[i2] = i3;
                    }
                }
                i3 = optInt;
                iArr[i2] = i3;
            }
            return iArr;
        }

        a(String str, String str2, Uri uri, int[] iArr) {
            this.f48653a = str;
            this.f48654b = str2;
            this.f48655c = uri;
            this.f48656d = iArr;
        }
    }

    public static a a(String str, String str2, String str3) {
        q a2;
        Map<String, a> map;
        if (ad.a(str2) || ad.a(str3) || (a2 = r.a(str)) == null || (map = a2.f48645f.get(str2)) == null) {
            return null;
        }
        return map.get(str3);
    }

    public q(boolean z, String str, boolean z2, int i2, EnumSet<ac> enumSet, Map<String, Map<String, a>> map, boolean z3, l lVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.f48640a = z;
        this.f48641b = str;
        this.f48642c = z2;
        this.f48645f = map;
        this.f48647h = lVar;
        this.f48643d = i2;
        this.f48646g = z3;
        this.f48644e = enumSet;
        this.f48648i = str2;
        this.f48649j = str3;
        this.f48650k = z4;
        this.f48651l = z5;
        this.n = jSONArray;
        this.f48652m = str4;
        this.o = z6;
        this.p = z7;
        this.q = str5;
        this.r = str6;
        this.s = str7;
    }
}
