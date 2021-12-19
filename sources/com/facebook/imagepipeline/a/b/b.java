package com.facebook.imagepipeline.a.b;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.e.e;
import com.facebook.imagepipeline.j.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static f f47657a;

    /* renamed from: b  reason: collision with root package name */
    public static int f47658b;
    private static a sImpl;
    private static boolean sImplLoaded;

    static {
        Covode.recordClassIndex(28890);
    }

    public static a a(f fVar, e eVar, h<com.facebook.c.a.e, c> hVar) {
        if (!sImplLoaded) {
            try {
                sImpl = (a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(f.class, e.class, h.class).newInstance(fVar, eVar, hVar);
            } catch (Throwable unused) {
            }
            if (sImpl != null) {
                sImplLoaded = true;
            }
        }
        return sImpl;
    }
}
