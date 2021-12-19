package com.facebook.common.f;

import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.f;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final MimeTypeMap f47086a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f47087b = f.of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f47088c = f.of("image/heif", "heif", "image/heic", "heic");

    static {
        Covode.recordClassIndex(28651);
    }
}
