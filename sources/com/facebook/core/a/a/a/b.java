package com.facebook.core.a.a.a;

import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f47154a;

    /* renamed from: d  reason: collision with root package name */
    private static Method f47155d;

    /* renamed from: b  reason: collision with root package name */
    public final a f47156b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f47157c = new d();

    /* renamed from: e  reason: collision with root package name */
    private Method f47158e;

    static {
        Covode.recordClassIndex(28695);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f47159a;

        static {
            Covode.recordClassIndex(28696);
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f47159a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        static JSONObject a(View view) {
            try {
                if (f47159a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f47159a = declaredField;
                    declaredField.setAccessible(true);
                }
                SparseArray sparseArray = (SparseArray) f47159a.get(view);
                if (sparseArray == null || sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        view.getContext();
                        try {
                            jSONObject.put(c.a(view.getResources(), sparseArray.keyAt(i2)), sparseArray.valueAt(i2));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    private static boolean a(View view) {
        for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (cls.getName().equals("com.facebook.litho.LithoView")) {
                return true;
            }
        }
        return false;
    }

    private static AccessibilityNodeInfo b(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        try {
            view.onInitializeAccessibilityNodeInfo(obtain);
            return obtain;
        } catch (NullPointerException unused) {
            if (obtain != null) {
                obtain.recycle();
            }
            return null;
        }
    }

    private static void a(PrintWriter printWriter, View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(a(str, 60));
            }
        }
    }

    private static String a(CharSequence charSequence, int i2) {
        if (charSequence == null || charSequence.length() <= 0) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() > i2) {
            return replace.substring(0, i2) + "...";
        }
        return replace;
    }

    public static boolean a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        if (r1.isEmpty() == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0227, code lost:
        r25.print(" text=\"");
        r25.print(a(r1, 600));
        r25.print("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020b, code lost:
        if (r1.isEmpty() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021e, code lost:
        if (r1 != null) goto L_0x0220;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r24, java.io.PrintWriter r25, android.view.View r26, int r27, int r28, boolean r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 1209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.core.a.a.a.b.a(java.lang.String, java.io.PrintWriter, android.view.View, int, int, boolean, boolean):void");
    }
}
