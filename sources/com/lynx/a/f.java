package com.lynx.a;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static e f55070a;

    /* renamed from: b  reason: collision with root package name */
    private static a f55071b;

    static {
        Covode.recordClassIndex(34563);
    }

    public static e a() {
        final Class<?> cls;
        e eVar = f55070a;
        if (eVar != null) {
            return eVar;
        }
        try {
            cls = Class.forName("com.lynx.fresco.FrescoImageLoader");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("com.lynx.glide.GlideImageLoader");
            } catch (ClassNotFoundException unused2) {
                throw new RuntimeException("can not find lynx ImageLoader!");
            }
        }
        AnonymousClass1 r0 = new e() {
            /* class com.lynx.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34564);
            }

            @Override // com.lynx.a.e
            public final d a() {
                try {
                    return (d) cls.newInstance();
                } catch (Exception e2) {
                    throw new RuntimeException("instance lynx ImageLoader failed", e2);
                }
            }
        };
        f55070a = r0;
        return r0;
    }

    public static a b() {
        Class<?> cls;
        a aVar = f55071b;
        if (aVar != null) {
            return aVar;
        }
        try {
            cls = Class.forName("com.lynx.fresco.FrescoBitmapPool");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("com.lynx.glide.GlideBitmapPool");
            } catch (ClassNotFoundException unused2) {
                throw new RuntimeException("can not find lynx BitmapCache!");
            }
        }
        try {
            a aVar2 = (a) cls.newInstance();
            f55071b = aVar2;
            return aVar2;
        } catch (Exception e2) {
            throw new RuntimeException("instance lynx BitmapCache failed", e2);
        }
    }
}
