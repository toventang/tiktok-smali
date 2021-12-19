package com.zhihu.matisse;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import c.d.a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

public enum b {
    JPEG("image/jpeg", a("jpg", "jpeg")),
    PNG("image/png", a("png")),
    GIF("image/gif", a("gif")),
    BMP("image/x-ms-bmp", a("bmp")),
    WEBP("image/webp", a("webp")),
    MPEG("video/mpeg", a("mpeg", "mpg")),
    MP4("video/mp4", a("mp4", "m4v")),
    QUICKTIME("video/quicktime", a("mov")),
    THREEGPP("video/3gpp", a("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", a("3g2", "3gpp2")),
    MKV("video/x-matroska", a("mkv")),
    WEBM("video/webm", a("webm")),
    TS("video/mp2ts", a("ts")),
    AVI("video/avi", a("avi"));
    
    private final Set<String> mExtensions;
    private final String mMimeTypeName;

    public final String toString() {
        return this.mMimeTypeName;
    }

    public static Set<b> ofAll() {
        return EnumSet.allOf(b.class);
    }

    public static Set<b> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<b> ofVideo() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI);
    }

    static {
        Covode.recordClassIndex(103869);
    }

    private static Set<String> a(String... strArr) {
        return new androidx.c.b(Arrays.asList(strArr));
    }

    public static boolean isImage(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    public static Set<b> of(b bVar, b... bVarArr) {
        return EnumSet.of(bVar, bVarArr);
    }

    public final boolean checkType(Context context, ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.mExtensions) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                str = a.a(context, uri);
                if (!TextUtils.isEmpty(str)) {
                    str = str.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private b(String str, Set set) {
        this.mMimeTypeName = str;
        this.mExtensions = set;
    }
}
