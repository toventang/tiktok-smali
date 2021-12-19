package com.facebook.a.b.a;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;

public class d {
    static {
        Covode.recordClassIndex(28427);
    }

    private static boolean a(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    private static boolean c(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    private static boolean d(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    private static boolean e(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    public static boolean a(View view) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (a(textView) || f(textView) || c(textView) || d(textView) || e(textView)) {
                return true;
            }
            if (b(textView)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    private static boolean b(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String e2 = f.e(textView);
            if (e2 != null) {
                if (e2.length() != 0) {
                    return Patterns.EMAIL_ADDRESS.matcher(e2).matches();
                }
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }

    private static boolean f(TextView textView) {
        if (a.a(d.class)) {
            return false;
        }
        try {
            String replaceAll = f.e(textView).replaceAll("\\s", "");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    char charAt = replaceAll.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        return false;
                    }
                    int i4 = charAt - '0';
                    if (z && (i4 = i4 * 2) > 9) {
                        i4 = (i4 % 10) + 1;
                    }
                    i2 += i4;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a.a(th, d.class);
            return false;
        }
    }
}
