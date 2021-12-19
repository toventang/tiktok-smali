package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static c f48440a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f48441b;

    static {
        Covode.recordClassIndex(29204);
        try {
            f48440a = (c) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f48441b = true;
        } catch (Throwable unused) {
            f48441b = false;
        }
    }
}
