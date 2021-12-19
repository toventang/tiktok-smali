package com.kakao.util.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.util.exception.KakaoException;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Utility {
    private static final String TAG = Utility.class.getCanonicalName();

    public static int com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    static {
        Covode.recordClassIndex(34488);
    }

    public static String getAppPackageName(Context context) {
        return getPackageInfo(context).packageName;
    }

    public static int getAppVersion(Context context) {
        return getPackageInfo(context).versionCode;
    }

    public static PackageInfo getPackageInfo(Context context) {
        return getPackageInfo(context, 0);
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String asCsv(List<?> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(",");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static String getKeyHash(Context context) {
        PackageInfo packageInfo = getPackageInfo(context, 64);
        if (packageInfo == null) {
            return null;
        }
        Signature[] signatureArr = packageInfo.signatures;
        for (Signature signature : signatureArr) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                return Base64.encodeToString(instance.digest(), 2);
            } catch (NoSuchAlgorithmException e2) {
                com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_LogLancet_w(TAG, "Unable to get MessageDigest. signature=".concat(String.valueOf(signature)), e2);
            }
        }
        return null;
    }

    public static String buildQueryString(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    public static Object com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static boolean isPackageInstalled(Context context, String str) {
        if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
            return true;
        }
        return false;
    }

    public static ResolveInfo resolveIntent(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0);
    }

    public static Uri buildUri(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        return builder.build();
    }

    public static String getMetadata(Context context, String str) {
        try {
            ApplicationInfo com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo = com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 128);
            if (com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo == null || com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.metaData == null) {
                return null;
            }
            return com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.metaData.getString(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context, int i2) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i2);
        } catch (PackageManager.NameNotFoundException e2) {
            com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_LogLancet_w(TAG, "Unable to get PackageInfo", e2);
            return null;
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    public static boolean getBooleanMetadata(Context context, String str, boolean z) {
        try {
            ApplicationInfo com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo = com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 128);
            if (com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo == null || com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.metaData == null) {
                return z;
            }
            return com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.metaData.getBoolean(str, z);
        } catch (PackageManager.NameNotFoundException unused) {
            return z;
        }
    }

    public static Uri buildUri(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str3);
                if (com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    builder.appendQueryParameter(str3, (String) com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
                }
            }
        }
        return builder.build();
    }

    public static ApplicationInfo com_kakao_util_helper_Utility_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return b.f107191a;
    }

    public static void putObjectInBundle(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else {
            throw new KakaoException("attempted to add unsupported type to Bundle");
        }
    }
}
