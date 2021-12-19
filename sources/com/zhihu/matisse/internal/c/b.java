package com.zhihu.matisse.internal.c;

import android.content.ContentResolver;
import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import c.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f156415a = b.class.getSimpleName();

    static {
        Covode.recordClassIndex(103882);
    }

    private b() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    public static float a(long j2) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return Float.valueOf(decimalFormat.format((double) ((((float) j2) / 1024.0f) / 1024.0f)).replaceAll(",", ".")).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[SYNTHETIC, Splitter:B:22:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058 A[SYNTHETIC, Splitter:B:31:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067 A[SYNTHETIC, Splitter:B:39:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point a(android.content.ContentResolver r6, android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.c.b.a(android.content.ContentResolver, android.net.Uri):android.graphics.Point");
    }

    public static boolean a(Context context, ContentResolver contentResolver, Uri uri) {
        ExifInterface exifInterface;
        MethodCollector.i(2920);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    exifInterface = new ExifInterface(openInputStream);
                } else {
                    MethodCollector.o(2920);
                    return false;
                }
            } else {
                String a2 = a.a(context, uri);
                if (a2 != null) {
                    exifInterface = new ExifInterface(a2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("filename should not be null");
                    MethodCollector.o(2920);
                    throw nullPointerException;
                }
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", -1);
            if (attributeInt == 6 || attributeInt == 8) {
                MethodCollector.o(2920);
                return true;
            }
            MethodCollector.o(2920);
            return false;
        } catch (IOException unused) {
            MethodCollector.o(2920);
            return false;
        } catch (NullPointerException unused2) {
            MethodCollector.o(2920);
            return false;
        }
    }
}
