package com.ss.android.ugc.aweme.crossplatform.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.web.h;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

public abstract class a {
    static {
        Covode.recordClassIndex(48750);
    }

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "unknown" : "webview_back" : "react-native" : "webview";
    }

    public static boolean a(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar, Activity activity) {
        if (!hh.a() || aVar == null || activity == null || !aVar.f78744d.u || (!aVar.f78744d.s && com.ss.android.ugc.aweme.app.b.a.a(activity))) {
            return false;
        }
        return true;
    }

    public static void a(Activity activity) {
        final View findViewById = activity.findViewById(R.id.ahc);
        findViewById.setPadding(0, 0, 0, 0);
        if (activity instanceof m) {
            KeyboardUtils.a((m) activity, findViewById, new KeyboardUtils.a() {
                /* class com.ss.android.ugc.aweme.crossplatform.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48751);
                }

                @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
                public final void b() {
                    findViewById.setPadding(0, 0, 0, 0);
                }

                @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
                public final void c() {
                    findViewById.setPadding(0, 0, 0, 0);
                }
            });
        }
    }

    public static String a(String str, int i2) {
        if (str == null || !d.a(str)) {
            return str;
        }
        try {
            if (!h.a((List<String>) Collections.singletonList("host"), false).contains(Uri.parse(str).getHost())) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append("status_bar_height=".concat(String.valueOf(i2)));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean a(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        return charSequence2.startsWith("http") || charSequence2.startsWith("https") || charSequence2.startsWith("about:");
    }

    public static boolean a(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter(str) == null) {
            return bundle != null ? bundle.getBoolean(str, z) : z;
        }
        return TextUtils.equals(uri.getQueryParameter(str), "1");
    }

    public static boolean a(String str) {
        return !com.bytedance.common.utility.m.a(str) && "1".equals(str);
    }

    public static boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("webview_progress_bar", b.a().a(true, "webview_progress_bar", false));
    }

    public static int b(Activity activity) {
        if (hh.a()) {
            return ImmersionBar.getStatusBarHeight(activity);
        }
        return 0;
    }

    public static Uri b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static Intent a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            return null;
        }
        try {
            sb.append("aweme://ame/webview/?url=").append(URLEncoder.encode(str, "ISO-8859-1"));
        } catch (Exception unused) {
        }
        return b.a(context, Uri.parse(sb.toString()));
    }

    public static Intent a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (com.bytedance.common.utility.m.a(queryParameter)) {
                return null;
            }
            boolean a2 = b.a(uri.getQueryParameter("no_hw"));
            boolean a3 = b.a(uri.getQueryParameter("hide_more"));
            boolean a4 = b.a(uri.getQueryParameter("hide_bar"));
            boolean a5 = b.a(uri.getQueryParameter("hide_status_bar"));
            boolean a6 = b.a(uri.getQueryParameter("hide_nav_bar"));
            try {
                boolean a7 = b.a(uri.getQueryParameter("hide_more"));
                if (a4 || a6) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (a5) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = uri.getQueryParameter("ad_id");
                if (!com.bytedance.common.utility.m.a(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                intent.setData(Uri.parse(decode));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (a2) {
                    intent.putExtra("bundle_no_hw_acceleration", true);
                }
                if (a3) {
                    intent.putExtra("hide_more", true);
                }
                if (!a7) {
                    intent.putExtra("hide_more", a7);
                }
                String queryParameter3 = uri.getQueryParameter("title");
                if (com.bytedance.common.utility.m.a(queryParameter3)) {
                    queryParameter3 = Uri.parse(decode).getQueryParameter("title");
                }
                String queryParameter4 = uri.getQueryParameter("title_extra");
                if (!com.bytedance.common.utility.m.a(queryParameter4)) {
                    queryParameter3 = queryParameter4;
                }
                if (!com.bytedance.common.utility.m.a(queryParameter3)) {
                    intent.putExtra("title", queryParameter3);
                } else {
                    intent.putExtra("title", " ");
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter5 = uri.getQueryParameter("gd_label");
                if (!com.bytedance.common.utility.m.a(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("gd_ext_json");
                if (!com.bytedance.common.utility.m.a(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("webview_track_key");
                if (!com.bytedance.common.utility.m.a(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("wap_headers");
                if (!com.bytedance.common.utility.m.a(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    public static int a(Uri uri, Bundle bundle, int i2) {
        String str;
        if (bundle != null) {
            i2 = bundle.getInt("bundle_webview_background", i2);
        }
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter("bundle_webview_background") == null) {
            str = null;
        } else {
            str = uri.getQueryParameter("bundle_webview_background");
        }
        try {
            if (TextUtils.isEmpty(str) || str.contains("#")) {
                return i2;
            }
            return Color.parseColor("#".concat(String.valueOf(str)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return i2;
        }
    }

    public static boolean b(Uri uri, Bundle bundle, String str) {
        if (uri == null || !uri.isHierarchical() || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            if (bundle != null) {
                return bundle.getBoolean(str, false);
            }
            return false;
        } else if (uri.getQueryParameter(str).equals("1") || uri.getQueryParameter(str).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public static int c(Uri uri, Bundle bundle, String str) {
        String queryParameter;
        if (uri == null || !uri.isHierarchical() || (queryParameter = uri.getQueryParameter(str)) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            if (bundle != null) {
                return bundle.getInt(str);
            }
            return -1;
        }
    }

    public static int d(Uri uri, Bundle bundle, String str) {
        String str2 = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    str2 = uri.getQueryParameter(str);
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        if (!(!TextUtils.isEmpty(str2) || bundle == null || bundle.getString(str) == null)) {
            str2 = bundle.getString(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.contains("#")) {
            str2 = "#".concat(String.valueOf(str2));
        }
        if (!TextUtils.isEmpty(str2)) {
            return Color.parseColor(str2);
        }
        return -2;
    }

    private static Object a(Uri uri, String str, Class cls) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            if (cls == String.class) {
                return queryParameter;
            }
            if (cls == Integer.class) {
                return Integer.valueOf(Integer.parseInt(queryParameter));
            }
            if (cls == Long.class) {
                return Long.valueOf(Long.parseLong(queryParameter));
            }
            if (cls == Boolean.class) {
                return Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            }
            if (cls == Float.class) {
                return Float.valueOf(Float.parseFloat(queryParameter));
            }
            if (cls == Double.class) {
                return Double.valueOf(Double.parseDouble(queryParameter));
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String a(Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri.getQueryParameter(str);
        }
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
            return null;
        }
        return bundle.getString(str);
    }

    public static <T> T a(Uri uri, String str, Class<T> cls, T t) {
        T t2;
        if (uri == null || (t2 = (T) a(uri, str, cls)) == null) {
            return t;
        }
        return t2;
    }

    private static <T> T a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls) {
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(str) && uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    T t = (T) a(uri, str, cls);
                    if (cls.isInstance(t)) {
                        return t;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        if (bundle == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        return (T) a(bundle, str2);
    }

    public static <T> T a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls, T t) {
        T t2 = (T) a(uri, str, bundle, str2, cls);
        if (t2 != null) {
            return t2;
        }
        return t;
    }
}
