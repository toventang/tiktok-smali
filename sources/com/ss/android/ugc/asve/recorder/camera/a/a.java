package com.ss.android.ugc.asve.recorder.camera.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f62196a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f62197b = {"PCCM00", "PCAM00"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f62198c = new String[0];

    static {
        Covode.recordClassIndex(38232);
    }

    public static int a(String str) {
        for (String str2 : f62197b) {
            if (str2.equals(str)) {
                return 2;
            }
        }
        for (String str3 : f62196a) {
            if (str3.equals(str)) {
                return 1;
            }
        }
        return 0;
    }
}
