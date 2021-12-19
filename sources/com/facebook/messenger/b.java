package com.facebook.messenger;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f48936a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f48937b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f48938c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f48939d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48940e;

    /* renamed from: f  reason: collision with root package name */
    public final String f48941f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f48942g;

    static {
        Covode.recordClassIndex(29497);
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        f48937b = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add("android.resource");
        hashSet2.add("file");
        f48936a = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add("https");
        f48938c = Collections.unmodifiableSet(hashSet3);
    }

    b(c cVar) {
        Uri uri = cVar.f48943a;
        this.f48939d = uri;
        String str = cVar.f48944b;
        this.f48940e = str;
        this.f48941f = cVar.f48945c;
        Uri uri2 = cVar.f48946d;
        this.f48942g = uri2;
        Objects.requireNonNull(uri, "Must provide non-null uri");
        Objects.requireNonNull(str, "Must provide mimeType");
        if (!f48936a.contains(uri.getScheme())) {
            throw new IllegalArgumentException("Unsupported URI scheme: " + uri.getScheme());
        } else if (!f48937b.contains(str)) {
            throw new IllegalArgumentException("Unsupported mime-type: " + str);
        } else if (uri2 != null && !f48938c.contains(uri2.getScheme())) {
            throw new IllegalArgumentException("Unsupported external uri scheme: " + uri2.getScheme());
        }
    }

    public static c a(Uri uri, String str) {
        return new c(uri, str);
    }
}
