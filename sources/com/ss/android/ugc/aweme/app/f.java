package com.ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(41068);
    }

    public static boolean b(Uri uri) {
        String str;
        if (uri == null || !"aweme".equals(uri.getHost())) {
            return false;
        }
        try {
            str = uri.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str = "";
        }
        if ("click_push_recommend".equals(str) || "click_push_newvideo".equals(str) || "click_push_videoat".equals(str)) {
            return true;
        }
        return false;
    }

    public static List<String> a(Uri uri) {
        String str;
        String str2 = "";
        ArrayList arrayList = new ArrayList();
        if (uri == null) {
            return arrayList;
        }
        String path = uri.getPath();
        if (b(uri)) {
            if (!m.a(path) && path.startsWith("/detail/")) {
                arrayList.add(uri.getLastPathSegment());
            } else if (!m.a(path) && path.startsWith("/detail_list")) {
                try {
                    str = uri.getQueryParameter("gids");
                } catch (Throwable unused) {
                    str = str2;
                }
                int i2 = 0;
                if (!m.a(str)) {
                    String[] split = str.split(",");
                    int length = split.length;
                    while (i2 < length) {
                        arrayList.add(split[i2]);
                        i2++;
                    }
                } else {
                    try {
                        str2 = uri.getQueryParameter("push_params");
                    } catch (Throwable unused2) {
                    }
                    if (!m.a(str2)) {
                        try {
                            String optString = new JSONObject(str2).optString("gids");
                            if (!m.a(optString)) {
                                String[] split2 = optString.split(",");
                                int length2 = split2.length;
                                while (i2 < length2) {
                                    arrayList.add(split2[i2]);
                                    i2++;
                                }
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
