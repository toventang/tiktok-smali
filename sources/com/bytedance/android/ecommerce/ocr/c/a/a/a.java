package com.bytedance.android.ecommerce.ocr.c.a.a;

import android.graphics.Rect;
import android.hardware.Camera;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7251a = Pattern.compile(";");

    static {
        Covode.recordClassIndex(3480);
    }

    public static List<Camera.Area> a() {
        return Collections.singletonList(new Camera.Area(new Rect(-400, -400, 400, 400), 1));
    }

    public static void a(Camera.Parameters parameters) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (!(supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty())) {
            for (int[] iArr : supportedPreviewFpsRange) {
                int i2 = iArr[0];
                int i3 = iArr[1];
                if (i2 >= 10000 && i3 <= 20000) {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (!Arrays.equals(iArr2, iArr)) {
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static String a(Collection<String> collection, String... strArr) {
        if (collection == null) {
            return null;
        }
        for (String str : strArr) {
            if (collection.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public static void a(Camera.Parameters parameters, boolean z) {
        String a2;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            a2 = a(supportedFlashModes, "torch", "on");
        } else {
            a2 = a(supportedFlashModes, "off");
        }
        if (a2 != null && !a2.equals(parameters.getFlashMode())) {
            parameters.setFlashMode(a2);
        }
    }
}
