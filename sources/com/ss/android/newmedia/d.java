package com.ss.android.newmedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.io.File;

public final class d {
    static {
        Covode.recordClassIndex(37044);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        long longValue = Long.valueOf(str).longValue();
        StringBuilder sb = new StringBuilder();
        do {
            long j2 = longValue % 23;
            longValue /= 23;
            if (j2 > 9) {
                sb.insert(0, (char) ((int) ((j2 + 97) - 10)));
            } else {
                sb.insert(0, j2);
            }
        } while (longValue != 0);
        return sb.toString();
    }

    public static void a(Activity activity) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            n.a(activity, 2131231585, (int) R.string.dq3);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.PICK");
        try {
            activity.startActivityForResult(intent, 10003);
        } catch (Exception unused) {
            n.a(activity, 2131231585, (int) R.string.dq1);
        }
    }

    public static boolean a(String str) {
        if (m.a(str)) {
            return false;
        }
        if (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static Uri a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    public static void a(Activity activity, Fragment fragment, int i2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            n.a(activity, 2131231585, (int) R.string.dq3);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i2);
            } catch (Exception unused) {
                n.a(activity, 2131231585, (int) R.string.dq1);
            }
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }
}
