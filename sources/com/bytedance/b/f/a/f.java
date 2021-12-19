package com.bytedance.b.f.a;

import android.text.TextUtils;
import com.bytedance.b.b.a.a.a;
import com.bytedance.b.b.a.a.b;
import com.bytedance.b.b.a.e;
import com.bytedance.covode.number.Covode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    String f26244a = "report_setting";

    /* renamed from: b  reason: collision with root package name */
    String f26245b = "enable_encrypt";

    /* renamed from: c  reason: collision with root package name */
    String f26246c = "hosts";

    /* renamed from: d  reason: collision with root package name */
    String f26247d = "apm6_once_max_size_kb";

    /* renamed from: e  reason: collision with root package name */
    String f26248e = "apm6_uploading_interval";

    /* renamed from: f  reason: collision with root package name */
    String f26249f = "enable_report_internal_exception";

    /* renamed from: g  reason: collision with root package name */
    String f26250g = "log_reserve_days";

    /* renamed from: h  reason: collision with root package name */
    String f26251h = "log_max_size_mb";

    /* renamed from: i  reason: collision with root package name */
    volatile a f26252i;

    static {
        Covode.recordClassIndex(15243);
    }

    @Override // com.bytedance.b.b.a.a.b
    public final a a() {
        return this.f26252i;
    }

    public f() {
        com.bytedance.b.f.a.a.a.a().b();
        com.bytedance.b.f.a.a.a.a().a(new com.bytedance.b.f.a.a.b() {
            /* class com.bytedance.b.f.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15244);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                String str;
                JSONObject optJSONObject3;
                f fVar = f.this;
                if (jSONObject != null) {
                    String str2 = fVar.f26244a;
                    String str3 = null;
                    JSONObject optJSONObject4 = jSONObject.optJSONObject("general");
                    if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("slardar_api_settings")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str2)) == null)) {
                        List<String> a2 = f.a(optJSONObject2.optJSONArray(fVar.f26246c));
                        ArrayList arrayList = new ArrayList();
                        if (!com.bytedance.b.k.f.a(a2)) {
                            str = null;
                            for (String str4 : a2) {
                                arrayList.add("https://" + str4 + "/monitor/collect/batch/");
                                if (str3 == null) {
                                    str3 = "https://" + str4 + "/monitor/collect/c/exception";
                                }
                                if (str == null) {
                                    str = "https://" + str4 + "/monitor/collect/c/trace_collect";
                                }
                            }
                        } else {
                            str = null;
                        }
                        boolean z = true;
                        boolean optBoolean = optJSONObject2.optBoolean(fVar.f26245b, true);
                        long optLong = optJSONObject2.optLong(fVar.f26247d, -1) * 1024;
                        long optLong2 = optJSONObject2.optLong(fVar.f26248e, -1) * 1000;
                        String str5 = fVar.f26249f;
                        JSONObject optJSONObject5 = jSONObject.optJSONObject("general");
                        if (optJSONObject5 == null || optJSONObject5.optInt(str5, 0) != 1) {
                            z = false;
                        }
                        a aVar = new a();
                        if (!com.bytedance.b.k.f.a(arrayList)) {
                            aVar.f25850b = arrayList;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            aVar.f25851c = new ArrayList();
                            aVar.f25851c.add(str3);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            aVar.f25852d = new ArrayList();
                            aVar.f25852d.add(str);
                        }
                        aVar.f25849a = optLong;
                        aVar.f25853e = optBoolean;
                        aVar.f25855g = optLong2;
                        aVar.f25854f = z;
                        JSONObject optJSONObject6 = jSONObject.optJSONObject("general");
                        if (!(optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("cleanup")) == null)) {
                            aVar.f25856h = optJSONObject3.optInt(fVar.f26251h, 80);
                            aVar.f25857i = optJSONObject3.optInt(fVar.f26250g, 5);
                        }
                        fVar.f26252i = aVar;
                        if (com.bytedance.b.e.a.a.r()) {
                            a aVar2 = fVar.f26252i;
                        }
                        com.bytedance.b.e.b.b.f26200a = z;
                        if (!TextUtils.isEmpty(str3)) {
                            com.bytedance.b.e.b.b.f26201b = str3;
                        }
                        e.f25965a.a(fVar.f26252i);
                    }
                }
            }
        });
    }

    static List<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String host = new URL(jSONArray.getString(i2)).getHost();
                        if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                            arrayList.add(host);
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException e2) {
                com.bytedance.b.k.b.b.a("APM-Setting", "parse setting host json exception", e2);
            } catch (MalformedURLException e3) {
                com.bytedance.b.k.b.b.a("APM-Setting", "parse setting host malformedurl exception", e3);
            }
        }
        return Collections.emptyList();
    }
}
