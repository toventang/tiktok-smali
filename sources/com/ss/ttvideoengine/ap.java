package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.k.k;
import java.util.HashMap;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f152259a;

    /* renamed from: b  reason: collision with root package name */
    public static k f152260b;

    /* renamed from: c  reason: collision with root package name */
    private static i f152261c;

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<Integer, ClassLoader> f152262d;

    static {
        Covode.recordClassIndex(101488);
    }

    public static ClassLoader a(int i2) {
        ClassLoader classLoader;
        HashMap<Integer, ClassLoader> hashMap = f152262d;
        if (hashMap != null && (classLoader = hashMap.get(Integer.valueOf(i2))) != null) {
            return classLoader;
        }
        i iVar = f152261c;
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }
}
