package com.aweme.storage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<String> f5950a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static String[] f5951b = {"/cache/picture/im_fresco_cache/", "/cache/picture/fresco_cache/", "/files/awcn_strategy/pushservice/", "/files/keva/repo/", "/files/live_kv/", "/files/effect/", "/files/music/", "/files/logs/", "/files/ALOG/", "/cache/cachev2/", "/cache/runnableCache/", "/files/robust/", "/files/tt_file_st/", "/cache/feedCache/", "/files/leakcanary/", "/cache/ttnet_storage/", "/files/MiPushLog/", "/cache/picture/", "/cache/ttnet_storage/", "/cache/cjpayWebData/", "/cache/awemeCache/", "/files/font/", "/files/npth/", "/files/.msdata/", "/files/.dynamic/", "/files/bdp/", "/files/a/", "/cache/WebView/", "/files/webview_bytedance/", "/files/.patchs/", "/files/.envelope/", "/files/.emitter/", "/files/.umeng/", "/files/.bak/", "/files/.pre_download/", "/files/.imprint/", "/shared_prefs/", "/app_sslcache/", "/app_webview/", "/lib-main/", "/splashCache/", "/awemeSplashCache/", "/app_SGLib/", "/app_assets/", "/small_emoji_res/", "/system_emoji_res/", "/files/draft/", "/files/Download/", "/files/rhea/", "/files/speed_ml/", "/databases/", "/files/filters/", "/files/extract_shot/", "/files/effectmodel/", "/files/extract_custom_sticker/", "/covode/", "/app_hws_webview/", "/files/Pictures/CJPayImageLoader/", "/cache/Universal_activity", "/files/audio-effect/", "/files/mvtheme/", "/files/origin_sound/", "/files/ve_frame_cache2/", "/files/hdr_filter/", "/files/hianalytics/"};

    /* renamed from: c  reason: collision with root package name */
    private static String[] f5952c = {"/files/plugins/", "/cache/Universal_activity/", "/files/appbrand/"};

    /* renamed from: d  reason: collision with root package name */
    private static String[] f5953d = {"/files/offlineX/", "/files/offline/", "/files/live_sdk_gecko/"};

    static {
        Covode.recordClassIndex(2800);
    }

    private static HashMap<String, Integer> a(String str) {
        HashMap<String, Integer> b2 = b(str);
        if (b2 != null && !b2.isEmpty()) {
            return b2;
        }
        try {
            return c(str);
        } catch (Throwable unused) {
            return b2;
        }
    }

    private static HashMap<String, Integer> a(HashMap<String, Integer> hashMap) {
        if (hashMap == null) {
            return null;
        }
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for (String str : hashMap.keySet()) {
            String[] strArr = f5951b;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Iterator<String> it = f5950a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.startsWith(it.next())) {
                                break;
                            }
                        } else {
                            String[] strArr2 = f5952c;
                            int length2 = strArr2.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length2) {
                                    String[] strArr3 = f5953d;
                                    int length3 = strArr3.length;
                                    while (true) {
                                        if (i2 >= length3) {
                                            hashMap2.put(str.replaceAll("\\d+", "*"), hashMap.get(str));
                                            break;
                                        }
                                        String str2 = strArr3[i2];
                                        if (str.startsWith(str2) && str.split("/").length == 4) {
                                            hashMap2.put(str, hashMap.get(str));
                                            break;
                                        }
                                        if (str.startsWith(str2) && str.split("/").length == 5) {
                                            hashMap2.put(str, hashMap.get(str));
                                            break;
                                        }
                                        i2++;
                                    }
                                } else {
                                    if (str.startsWith(strArr2[i4]) && str.split("/").length != 4) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                    }
                } else if (str.startsWith(strArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return hashMap2;
    }

    private static HashMap<String, Integer> b(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(11687);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(11687);
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("du -a -d 4 ".concat(String.valueOf(str))).getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split("\t");
                    if (split.length == 2) {
                        String replace = split[1].replace(str, "");
                        if (TextUtils.isEmpty(replace)) {
                            replace = "DiskTotal";
                        }
                        hashMap.put(replace, Integer.valueOf(split[0]));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.getStackTrace();
                        return null;
                    } finally {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.o(11687);
                    }
                }
            }
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            MethodCollector.o(11687);
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            th.getStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a2 A[SYNTHETIC, Splitter:B:48:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.Integer> c(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.b.c(java.lang.String):java.util.HashMap");
    }

    public static void a(Context context, JSONObject jSONObject) {
        File file;
        String packageName = context.getPackageName();
        f5950a.add("/cache/webviewbytedance_" + packageName + ":miniapp0/");
        f5950a.add("/cache/webviewbytedance_" + packageName + "/");
        f5950a.add("/app_webviewbytedance_" + packageName + ":miniapp0/");
        f5950a.add("/app_webview_" + packageName + ":miniapp0/");
        f5950a.add("/cache/webview_" + packageName + ":miniapp0/");
        f5950a.add("/app_webviewbytedance_" + packageName + "/");
        f5950a.add("/app_webviewbytedance_ttwebview_bytedance_" + packageName + "/");
        f5950a.add("/app_hws_webview_" + packageName + ":miniapp0/");
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        HashMap<String, Integer> a2 = a(a(d.f107195c.getParent()));
        if (!TextUtils.isEmpty("")) {
            file = context.getExternalFilesDir("");
        } else {
            if (d.f107196d == null || !d.f107197e) {
                d.f107196d = context.getExternalFilesDir("");
            }
            file = d.f107196d;
        }
        HashMap<String, Integer> a3 = a(a(file.getParent()));
        if (a2 != null) {
            try {
                a2.size();
                for (Map.Entry<String, Integer> entry : a2.entrySet()) {
                    jSONObject.put("internal" + entry.getKey(), entry.getValue());
                    entry.getKey();
                    entry.getValue();
                }
            } catch (JSONException e2) {
                e2.getStackTrace();
                return;
            }
        }
        if (a3 != null) {
            a3.size();
            for (Map.Entry<String, Integer> entry2 : a3.entrySet()) {
                jSONObject.put("external" + entry2.getKey(), entry2.getValue());
                entry2.getKey();
                entry2.getValue();
            }
        }
    }
}
