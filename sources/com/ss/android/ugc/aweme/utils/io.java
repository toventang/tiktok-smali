package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.a.a.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;

public final class io {

    /* renamed from: a  reason: collision with root package name */
    public static final io f143106a = new io();

    private io() {
    }

    static {
        Covode.recordClassIndex(93676);
    }

    public static final boolean a(UserVerify userVerify) {
        String str;
        String str2 = null;
        if (userVerify != null) {
            str = userVerify.getCustomVerify();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        if (userVerify != null) {
            str2 = userVerify.getEnterpriseVerifyReason();
        }
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    private static int b(Context context, Float f2) {
        if (!(context == null || f2 == null)) {
            switch (n.c(context, f2.floatValue())) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    break;
                case 16:
                default:
                    return R.drawable.abo;
                case 17:
                    return R.drawable.abn;
            }
        }
        return R.drawable.abm;
    }

    private static int c(Context context, Float f2) {
        float f3;
        if (context != null && f2 != null) {
            int c2 = n.c(context, f2.floatValue());
            if (c2 != 17 && c2 != 20) {
                switch (c2) {
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    case ABRConfig.ABR_SELECT_SCENE:
                    case 15:
                        f3 = n.b(context, 3.0f);
                        break;
                    default:
                        f3 = n.b(context, 4.0f);
                        break;
                }
            } else {
                f3 = n.b(context, 4.0f);
            }
        } else {
            f3 = n.b(context, 4.0f);
        }
        return (int) f3;
    }

    private static Drawable a(Context context, Float f2) {
        if (context == null || f2 == null) {
            return null;
        }
        int c2 = n.c(context, f2.floatValue());
        if (c2 == 17) {
            return a.b(context, R.drawable.abn);
        }
        if (c2 == 20) {
            return a.b(context, R.drawable.abo);
        }
        switch (c2) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
                return a.b(context, R.drawable.abm);
            default:
                return a.b(context, R.drawable.abo);
        }
    }

    private static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static final void a(Context context, UserVerify userVerify, TextView textView) {
        if (context != null && textView != null && a(userVerify)) {
            b(context, textView, false);
        }
    }

    public static void a(Context context, TextView textView, boolean z) {
        Drawable a2 = a(context, Float.valueOf(textView.getTextSize()));
        if (!z || a2 == null) {
            int i2 = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
        textView.setCompoundDrawablePadding(c(context, Float.valueOf(textView.getTextSize())));
    }

    private static void b(Context context, TextView textView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textView.getText());
        if (z) {
            try {
                spannableStringBuilder.delete((spannableStringBuilder.length() - 2) - 3, spannableStringBuilder.length() - 3);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) " T");
        spannableStringBuilder.setSpan(new com.bytedance.ies.dmt.ui.common.a(context, b(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
    }

    public static final void a(Context context, String str, String str2, TextView textView) {
        if (context != null && textView != null) {
            a(context, textView, a(str, str2));
        }
    }

    public static final void a(Context context, String str, String str2, TextView textView, boolean z) {
        if (context != null && textView != null && a(str, str2)) {
            b(context, textView, z);
        }
    }
}
