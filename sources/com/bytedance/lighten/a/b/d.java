package com.bytedance.lighten.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.p;

public final class d {
    static {
        Covode.recordClassIndex(24576);
    }

    public static p a() {
        try {
            return (p) Class.forName("com.bytedance.lighten.loader.PicassoImageLoaderDelegate").asSubclass(p.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
