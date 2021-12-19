package com.facebook.imageutils;

import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Class f48471a;

    /* renamed from: b  reason: collision with root package name */
    private static Class f48472b;

    /* renamed from: c  reason: collision with root package name */
    private static com.facebook.h.c f48473c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f48474d;

    static {
        Covode.recordClassIndex(29232);
        try {
            f48471a = Class.forName("com.ixigua.image.heif.Heif");
            f48472b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e2) {
            a.c("HeifFormatUtil", "Heif init ", e2);
        }
    }

    public static com.facebook.h.c a() {
        com.facebook.h.c cVar = f48473c;
        if (cVar != null) {
            return cVar;
        }
        Class cls = f48472b;
        if (cls == null) {
            return null;
        }
        try {
            f48473c = (com.facebook.h.c) cls.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (NoSuchFieldException e2) {
            a.c("HeifFormatUtil", "HeifFormat init ", e2);
        } catch (IllegalAccessException e3) {
            a.c("HeifFormatUtil", "HeifFormat init ", e3);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return f48473c;
    }

    public static int[] a(byte[] bArr, int i2) {
        Class cls = f48471a;
        if (cls == null) {
            return null;
        }
        try {
            if (f48474d == null) {
                f48474d = cls.getDeclaredMethod("parseMeta", byte[].class, Integer.TYPE);
            }
            Method method = f48474d;
            if (method != null) {
                method.setAccessible(true);
                return (int[]) f48474d.invoke(null, bArr, Integer.valueOf(i2));
            }
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return null;
    }
}
