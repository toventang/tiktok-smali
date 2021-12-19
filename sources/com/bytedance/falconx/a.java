package com.bytedance.falconx;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.a.a;
import com.bytedance.falconx.b.b;
import com.bytedance.falconx.b.c;
import com.bytedance.falconx.e;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.falconx.statistic.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.f;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private d f28749a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f28750b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Handler f28751c;

    static {
        Covode.recordClassIndex(16911);
    }

    private static long a(InterceptorModel interceptorModel) {
        if (interceptorModel != null) {
            return interceptorModel.getVersion();
        }
        return -1;
    }

    a(d dVar) {
        String lowerCase;
        this.f28749a = dVar;
        this.f28751c = new Handler(this.f28749a.f28784a.getMainLooper());
        for (Uri uri : this.f28749a.f28787d) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                lowerCase = "";
            } else {
                lowerCase = scheme.toLowerCase();
            }
            if ("".equals(lowerCase) || "file".equals(lowerCase)) {
                this.f28750b.add(new b(dVar.f28784a, dVar.f28785b, new File(uri.getPath())));
            } else if ("asset".equals(lowerCase)) {
                String path = uri.getPath();
                this.f28750b.add(new com.bytedance.falconx.b.a(dVar.f28784a, new File(path.startsWith("/") ? path.substring(1) : path)));
            } else {
                com.bytedance.geckox.i.a.b();
            }
        }
    }

    @Override // com.bytedance.falconx.b
    public final WebResourceResponse a(WebView webView, String str) {
        try {
            List<Pattern> list = this.f28749a.f28786c;
            if (list != null && !list.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    InterceptorModel interceptorModel = new InterceptorModel();
                    interceptorModel.url = str;
                    WebResourceResponse a2 = a(webView, str, interceptorModel);
                    if (a2 == null && interceptorModel.offlineRule != null) {
                        a(webView, interceptorModel);
                    }
                    return a2;
                }
            }
            return null;
        } catch (Exception unused) {
            com.bytedance.geckox.i.a.a();
            return null;
        }
    }

    public final void a(final WebView webView, final InterceptorModel interceptorModel) {
        this.f28751c.post(new Runnable() {
            /* class com.bytedance.falconx.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(16914);
            }

            public final void run() {
                d a2 = d.a();
                WebView webView = webView;
                a2.f28809a.execute(new Runnable(interceptorModel, webView) {
                    /* class com.bytedance.falconx.statistic.d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ InterceptorModel f28812a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ WebView f28813b;

                    static {
                        Covode.recordClassIndex(16938);
                    }

                    public final void run() {
                        String str;
                        String str2;
                        String str3;
                        long j2;
                        long j3;
                        try {
                            this.f28812a.ac = j.a(d.this.f28810b.f28784a);
                            e.a(this.f28813b, this.f28812a, true);
                            a.a("falconx intercept data:", this.f28812a);
                            d dVar = d.this;
                            String str4 = dVar.f28810b.f28792i;
                            String str5 = d.this.f28810b.f28789f;
                            String str6 = d.this.f28810b.f28794k;
                            InterceptorModel interceptorModel = this.f28812a;
                            try {
                                if (!TextUtils.isEmpty(dVar.f28810b.f28793j) && interceptorModel != null) {
                                    StatisticData statisticData = new StatisticData();
                                    statisticData.mCommon = new Common();
                                    statisticData.mCommon.appVersion = str4;
                                    statisticData.mCommon.deviceId = str5;
                                    statisticData.mCommon.region = str6;
                                    String uuid = UUID.randomUUID().toString();
                                    interceptorModel.startTime = null;
                                    interceptorModel.logId = uuid;
                                    b bVar = dVar.f28810b.f28790g;
                                    if (bVar != null) {
                                        Common common = statisticData.mCommon;
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("params_for_special", "gecko");
                                        String str7 = "";
                                        if (interceptorModel.pageUrl == null) {
                                            str = str7;
                                        } else {
                                            str = interceptorModel.pageUrl;
                                        }
                                        jSONObject.put("page_url", str);
                                        if (interceptorModel.resRootDir == null) {
                                            str2 = str7;
                                        } else {
                                            str2 = interceptorModel.resRootDir;
                                        }
                                        jSONObject.put("res_root_dir", str2);
                                        if (interceptorModel.url == null) {
                                            str3 = str7;
                                        } else {
                                            str3 = interceptorModel.url;
                                        }
                                        jSONObject.put("resource_url", str3);
                                        if (interceptorModel.offlineRule != null) {
                                            str7 = interceptorModel.offlineRule;
                                        }
                                        jSONObject.put("offline_rule", str7);
                                        jSONObject.put("mime_type", interceptorModel.mimeType);
                                        jSONObject.put("offline_status", interceptorModel.offlineStatus);
                                        long j4 = 0;
                                        if (interceptorModel.offlineDuration == null) {
                                            j2 = 0;
                                        } else {
                                            j2 = interceptorModel.offlineDuration.longValue();
                                        }
                                        jSONObject.put("offline_duration", j2);
                                        if (interceptorModel.onlineDuration == null) {
                                            j3 = 0;
                                        } else {
                                            j3 = interceptorModel.onlineDuration.longValue();
                                        }
                                        jSONObject.put("online_duration", j3);
                                        jSONObject.put("app_version", common.appVersion);
                                        jSONObject.put("sdk_version", common.sdkVersion);
                                        if (interceptorModel.pkgVersion != null) {
                                            j4 = interceptorModel.pkgVersion.longValue();
                                        }
                                        jSONObject.put("pkg_version", j4);
                                        jSONObject.put("access_key", interceptorModel.accessKey);
                                        jSONObject.put("channel", interceptorModel.channel);
                                        jSONObject.put("os", common.os);
                                        jSONObject.put("device_id", common.deviceId);
                                        jSONObject.put("device_model", common.deviceModel);
                                        jSONObject.put("region", common.region);
                                        jSONObject.put("ac", interceptorModel.ac);
                                        jSONObject.put("err_code", interceptorModel.errCode);
                                        jSONObject.put("err_msg", interceptorModel.errMsg);
                                        jSONObject.put("log_id", interceptorModel.logId);
                                        a.a("geckosdk_falcon_update_stats", jSONObject);
                                        if ((bVar instanceof a) && interceptorModel.offlineStatus.intValue() == 1) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("aid", String.valueOf(f.a().b().aid));
                                            jSONObject2.put("gecko_sdk_version", "3.0.0-rc.4-mt");
                                            jSONObject2.put("access_key", interceptorModel.accessKey);
                                            jSONObject2.put("channel", interceptorModel.channel);
                                            jSONObject2.put("package_id", interceptorModel.pkgVersion);
                                            jSONObject2.put("from", "1");
                                            jSONObject2.put("isCombo", interceptorModel.isCombo);
                                            if (!TextUtils.isEmpty(interceptorModel.channel) && !TextUtils.isEmpty(interceptorModel.url)) {
                                                String[] split = interceptorModel.url.split(interceptorModel.channel + "/");
                                                if (split.length == 2) {
                                                    jSONObject2.put("path", split[1]);
                                                }
                                            }
                                            new JSONObject().put("read_duration", interceptorModel.offlineDuration);
                                            Boolean.valueOf(false);
                                            a.a("geckosdk_resource_load_event", jSONObject2);
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                                a.a();
                            }
                        } catch (Exception unused2) {
                            a.a();
                        }
                    }

                    {
                        this.f28812a = r2;
                        this.f28813b = r3;
                    }
                });
            }
        });
    }

    private void a(final WebView webView, final InterceptorModel interceptorModel, WebResourceResponse webResourceResponse) {
        InputStream data = webResourceResponse.getData();
        if (data != null) {
            webResourceResponse.setData(new com.bytedance.falconx.statistic.c(data) {
                /* class com.bytedance.falconx.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(16913);
                }

                @Override // com.bytedance.falconx.statistic.c, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
                public final void close() {
                    super.close();
                    interceptorModel.loadFinish(true);
                    a.this.a(webView, interceptorModel);
                }

                @Override // com.bytedance.falconx.statistic.c
                public final void a(IOException iOException) {
                    super.a(iOException);
                    interceptorModel.setErrorCode("101");
                    interceptorModel.setErrorMsg(iOException.getMessage());
                    interceptorModel.loadFinish(false);
                    a.this.a(webView, interceptorModel);
                }
            });
        }
    }

    private WebResourceResponse a(final WebView webView, String str, final InterceptorModel interceptorModel) {
        String substring;
        MethodCollector.i(5454);
        interceptorModel.accessKey = this.f28749a.f28785b;
        if (webView != null) {
            webView.post(new Runnable() {
                /* class com.bytedance.falconx.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16912);
                }

                public final void run() {
                    try {
                        interceptorModel.pageUrl = webView.getUrl();
                    } catch (Exception unused) {
                        com.bytedance.geckox.i.a.a();
                    }
                }
            });
        }
        for (Pattern pattern : this.f28749a.f28786c) {
            if (pattern != null) {
                WebResourceResponse a2 = a(pattern, str, interceptorModel);
                if (a2 != null) {
                    a(webView, interceptorModel, a2);
                    MethodCollector.o(5454);
                    return a2;
                }
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    interceptorModel.offlineRule = pattern.pattern();
                    int indexOf = str.indexOf("?");
                    int indexOf2 = str.indexOf("#");
                    int min = Math.min(indexOf, indexOf2);
                    if (min == -1) {
                        min = Math.max(indexOf, indexOf2);
                    }
                    if (min != -1) {
                        substring = str.substring(matcher.end(), min);
                    } else {
                        substring = str.substring(matcher.end());
                    }
                    if (substring.endsWith("/")) {
                        substring = substring.substring(0, substring.length() - 1);
                    }
                    if (substring.startsWith("/")) {
                        substring = substring.substring(1);
                    }
                    for (c cVar : this.f28750b) {
                        String a3 = com.bytedance.falconx.c.a.a(substring);
                        try {
                            interceptorModel.resRootDir = cVar.a();
                            Map<String, Long> b2 = cVar.b();
                            String substring2 = substring.substring(0, substring.indexOf("/"));
                            interceptorModel.channel = substring2;
                            interceptorModel.pkgVersion = b2.get(substring2);
                            interceptorModel.mimeType = a3;
                            WebResourceResponse a4 = com.bytedance.falconx.c.b.a(a3, "", cVar.a(substring));
                            if (a4 != null) {
                                String concat = "path:".concat(String.valueOf(substring));
                                long a5 = a(interceptorModel);
                                if (com.bytedance.falconx.a.b.f28775a) {
                                    synchronized (com.bytedance.falconx.a.a.f28762b) {
                                        try {
                                            com.bytedance.falconx.a.a.f28762b.add(new a.C0616a(true, str, concat, a5));
                                        } catch (Throwable th) {
                                            MethodCollector.o(5454);
                                            throw th;
                                        }
                                    }
                                }
                                a(webView, interceptorModel, a4);
                            } else {
                                com.bytedance.falconx.a.a.a(str, "not found local resource", a(interceptorModel));
                            }
                            MethodCollector.o(5454);
                            return a4;
                        } catch (FileNotFoundException unused) {
                            com.bytedance.falconx.a.a.a(str, "not found local resource", a(interceptorModel));
                            com.bytedance.geckox.i.a.a();
                        } catch (Throwable th2) {
                            com.bytedance.falconx.a.a.a(str, "not found local resource".concat(String.valueOf(th2)), a(interceptorModel));
                            com.bytedance.geckox.i.a.a();
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        interceptorModel.setErrorCode("100");
        interceptorModel.setErrorMsg("not found");
        interceptorModel.loadFinish(false);
        MethodCollector.o(5454);
        return null;
    }

    private WebResourceResponse a(Pattern pattern, String str, InterceptorModel interceptorModel) {
        InputStream inputStream;
        MethodCollector.i(5462);
        Matcher matcher = Pattern.compile(pattern.pattern() + "??").matcher(str);
        if (!matcher.find()) {
            MethodCollector.o(5462);
            return null;
        }
        interceptorModel.offlineRule = pattern.pattern();
        int indexOf = str.indexOf("??");
        if (indexOf <= 0) {
            MethodCollector.o(5462);
            return null;
        }
        String substring = str.substring(matcher.end() + 1, indexOf);
        String[] split = str.substring(indexOf + 2).split(",");
        if (split.length <= 1) {
            MethodCollector.o(5462);
            return null;
        }
        split[0] = substring + split[0];
        String a2 = com.bytedance.falconx.c.a.a(split[0]);
        for (int i2 = 1; i2 < split.length; i2++) {
            split[i2] = substring + split[i2];
            if (!TextUtils.equals(com.bytedance.falconx.c.a.a(split[i2]), a2)) {
                MethodCollector.o(5462);
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            Iterator<c> it = this.f28750b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    inputStream = null;
                    break;
                }
                c next = it.next();
                try {
                    interceptorModel.resRootDir = next.a();
                    Map<String, Long> b2 = next.b();
                    interceptorModel.channel = substring;
                    interceptorModel.mimeType = a2;
                    interceptorModel.pkgVersion = b2.get(substring);
                    interceptorModel.isCombo = true;
                    inputStream = next.a(str2);
                    break;
                } catch (Throwable unused) {
                    com.bytedance.geckox.i.a.a();
                }
            }
            if (inputStream == null) {
                MethodCollector.o(5462);
                return null;
            }
            arrayList.add(inputStream);
        }
        WebResourceResponse a3 = com.bytedance.falconx.c.b.a(a2, "", new SequenceInputStream(Collections.enumeration(arrayList)));
        MethodCollector.o(5462);
        return a3;
    }
}
