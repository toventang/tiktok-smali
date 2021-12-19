package com.lynx.tasm;

import com.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

public class l {

    /* renamed from: e  reason: collision with root package name */
    static int f56747e;

    /* renamed from: f  reason: collision with root package name */
    public static String f56748f = "-1";

    /* renamed from: a  reason: collision with root package name */
    public String f56749a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f56750b = false;

    /* renamed from: c  reason: collision with root package name */
    public String[] f56751c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f56752d;

    /* renamed from: g  reason: collision with root package name */
    private String f56753g;

    static {
        Covode.recordClassIndex(35353);
    }

    private static String a() {
        String a2 = a.a("%d", new Object[]{Integer.valueOf(f56747e)});
        f56747e++;
        return a2;
    }

    public static l a(String str, String[] strArr) {
        return new l(str, a(), strArr, false);
    }

    public static l a(String str, String[] strArr, boolean z) {
        return new l(str, a(), strArr, z);
    }

    private l(String str, String str2, String[] strArr, boolean z) {
        this.f56753g = str;
        this.f56751c = strArr;
        this.f56752d = z;
        this.f56749a = str2;
        this.f56752d = z;
        LLog.a(4, "LynxGroup", "LynxGroup init with name " + str + ", id: " + str2 + ", enableCanvas: " + z);
    }
}
