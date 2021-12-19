package com.facebook.common.f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.f;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f47085a = f.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    static {
        Covode.recordClassIndex(28650);
    }

    public static boolean a(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
