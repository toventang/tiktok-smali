package com.ss.android.ugc.aweme.crossplatform.d.a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.d.a.b;
import com.ss.android.ugc.aweme.crossplatform.d.b;
import com.ss.android.ugc.aweme.crossplatform.d.c;
import com.ss.android.ugc.aweme.crossplatform.d.e;
import com.ss.android.ugc.aweme.crossplatform.d.f;
import com.ss.android.ugc.aweme.crossplatform.d.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.d.a f78741a;

    /* renamed from: b  reason: collision with root package name */
    public b f78742b;

    /* renamed from: c  reason: collision with root package name */
    public e f78743c;

    /* renamed from: d  reason: collision with root package name */
    public f f78744d;

    /* renamed from: e  reason: collision with root package name */
    public g f78745e;

    /* renamed from: f  reason: collision with root package name */
    public c f78746f;

    static {
        Covode.recordClassIndex(48874);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.a$a  reason: collision with other inner class name */
    public static final class C1829a {
        static {
            Covode.recordClassIndex(48875);
        }

        private static Bundle b(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        public static a a(Intent intent) {
            Bundle b2 = b(intent);
            if (b2 == null) {
                b2 = new Bundle();
            }
            if (TextUtils.isEmpty(b2.getString("url"))) {
                if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
                    b2.putString("url", intent.getData().toString());
                }
                if (TextUtils.isEmpty(b2.getString("url")) && !TextUtils.isEmpty(b2.getString("rn_schema"))) {
                    b2.putString("url", b2.getString("rn_schema"));
                }
            }
            try {
                if (!TextUtils.isEmpty(b2.getString("url"))) {
                    Uri parse = Uri.parse(b2.getString("url"));
                    b2.putString("hybrid_report_source", parse.getQueryParameter("hybrid_report_source"));
                    String queryParameter = parse.getQueryParameter("has_adinfojson");
                    b2.putString("has_ad_info_json", queryParameter);
                    if (TextUtils.equals(queryParameter, "1")) {
                        b2.putString("ad_info_json", Uri.parse(b2.getString("url")).getQueryParameter("adinfojson"));
                    }
                }
                String string = b2.getString("hide_nav_bar", "-1");
                if (!TextUtils.equals(string, "-1")) {
                    a(b2, "hide_nav_bar", string);
                }
                String string2 = b2.getString("hide_status_bar", "-1");
                if (!TextUtils.equals(string2, "-1")) {
                    a(b2, "hide_status_bar", string2);
                }
                String string3 = b2.getString("hide_more", "-1");
                if (!TextUtils.equals(string3, "-1")) {
                    a(b2, "hide_more", string3);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return b.C1830b.a(b2);
        }

        private static void a(Bundle bundle, String str, String str2) {
            if (TextUtils.equals("1", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("true", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("0", str2)) {
                bundle.putBoolean(str, false);
            } else if (TextUtils.equals("false", str2)) {
                bundle.putBoolean(str, false);
            }
        }
    }
}
