package com.ss.android.agilelogger.c;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;

public final class c {
    static {
        Covode.recordClassIndex(36553);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle[{");
        a(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    private static String a(Uri uri) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(uri, new Object[0]);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return uri.toString();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return uri.toString();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return uri.toString();
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static void a(Bundle bundle, StringBuilder sb) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str).append('=');
            Object a2 = a(bundle, str);
            if (a2 instanceof int[]) {
                sb.append(Arrays.toString((int[]) a2));
            } else if (a2 instanceof byte[]) {
                byte[] bArr = (byte[]) a2;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (a2 instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) a2));
            } else if (a2 instanceof short[]) {
                sb.append(Arrays.toString((short[]) a2));
            } else if (a2 instanceof long[]) {
                sb.append(Arrays.toString((long[]) a2));
            } else if (a2 instanceof float[]) {
                sb.append(Arrays.toString((float[]) a2));
            } else if (a2 instanceof double[]) {
                sb.append(Arrays.toString((double[]) a2));
            } else if (a2 instanceof String[]) {
                sb.append(Arrays.toString((String[]) a2));
            } else if (a2 instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) a2));
            } else if (a2 instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) a2));
            } else if (a2 instanceof Bundle) {
                sb.append(a((Bundle) a2));
            } else {
                sb.append(a2);
            }
            z = false;
        }
    }

    public static void a(Intent intent, StringBuilder sb) {
        boolean z;
        String action = intent.getAction();
        boolean z2 = true;
        boolean z3 = false;
        if (action != null) {
            sb.append("act=").append(action);
            z = false;
        } else {
            z = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                if (!z2) {
                    sb.append(',');
                }
                sb.append(str);
                z2 = false;
            }
            sb.append("]");
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            int i2 = Build.VERSION.SDK_INT;
            sb.append(a(data));
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=").append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x").append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=").append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=").append(component.flattenToShortString());
            z = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=").append(sourceBounds.toShortString());
            z = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (intent.getClipData() != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("(has clip)");
        } else {
            z3 = z;
        }
        Bundle a2 = a(intent);
        if (a2 != null) {
            if (!z3) {
                sb.append(' ');
            }
            sb.append("extras={");
            a(a2, sb);
            sb.append('}');
        }
        int i4 = Build.VERSION.SDK_INT;
        Intent selector = intent.getSelector();
        if (selector != null) {
            sb.append(" sel=");
            a(selector, sb);
            sb.append("}");
        }
    }
}
