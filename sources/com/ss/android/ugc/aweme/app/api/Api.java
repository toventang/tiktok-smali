package com.ss.android.ugc.aweme.app.api;

import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.google.c.h.a.q;
import com.google.gson.g;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import com.ss.android.ugc.aweme.utils.dw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Api {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66566a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f66567b = "api-va.tiktokv.com";

    /* renamed from: c  reason: collision with root package name */
    public static final String f66568c = ("https://" + "api-va.tiktokv.com");

    /* renamed from: d  reason: collision with root package name */
    public static final String f66569d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f66570e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f66571f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f66572g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f66573h;

    /* renamed from: i  reason: collision with root package name */
    private static NetApi f66574i;

    public interface NetApi {
        static {
            Covode.recordClassIndex(40922);
        }

        @h
        q<String> doGet(@ag String str, @l List<com.bytedance.retrofit2.client.b> list, @com.bytedance.retrofit2.b.d Object obj);
    }

    public interface c<T> {
        static {
            Covode.recordClassIndex(40925);
        }

        T a(Object obj);
    }

    public static class d implements c<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f66578a = new d();

        private d() {
        }

        static {
            Covode.recordClassIndex(40926);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.app.api.Api.c
        public final /* synthetic */ String a(Object obj) {
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
    }

    public static boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
            return true;
        }
        if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
            return true;
        }
        if (!jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    public static void a(String str, String str2) {
        JSONObject optJSONObject;
        if (!m.a(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (a(jSONObject)) {
                return;
            }
            if (!jSONObject.has("message") || !TextUtils.equals(jSONObject.optString("message"), "error") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
        }
        throw new com.ss.android.ugc.aweme.base.api.a.a.b();
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (m.a(str)) {
            throw new com.ss.android.ugc.aweme.base.api.a.a.b();
        } else if (a(jSONObject)) {
        } else {
            if (!jSONObject.has("message") || !TextUtils.equals(jSONObject.optString("message"), "error") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
        }
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean a2 = a();
        j.f107229h = a2;
        return a2;
    }

    public static class b<T> implements c<T> {

        /* renamed from: b  reason: collision with root package name */
        static final com.google.gson.f f66576b;

        /* renamed from: a  reason: collision with root package name */
        Class<T> f66577a;

        static {
            Covode.recordClassIndex(40924);
            g a2 = dw.a();
            a2.a(new MusicTypeAdapterFactory());
            a2.a(new UserTypeAdapterFactory());
            f66576b = a2.b();
        }

        public b(Class<T> cls) {
            this.f66577a = cls;
        }

        @Override // com.ss.android.ugc.aweme.app.api.Api.c
        public final T a(Object obj) {
            if (!BaseResponse.class.isAssignableFrom(this.f66577a)) {
                this.f66577a.getName();
            }
            try {
                T t = (T) f66576b.a(obj.toString(), (Class) this.f66577a);
                if (!(t instanceof BaseResponse)) {
                    return t;
                }
                try {
                    return (T) t.checkValid();
                } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new com.ss.android.ugc.aweme.base.api.a.a(-1, th);
                }
            } catch (Throwable th2) {
                throw new com.ss.android.ugc.aweme.base.api.a.a.c(th2);
            }
        }
    }

    static {
        Covode.recordClassIndex(40921);
        String str = com.bytedance.ies.ugc.appcontext.d.f34604k.f34586a;
        f66566a = str;
        String str2 = "https://" + str;
        f66569d = str2;
        f66570e = str2 + "/aweme/v1/upload/image/";
        f66571f = str2 + "/aweme/v1/upload/image/";
        f66572g = str2 + "/aweme/v1/weibo/bind/";
        f66573h = str2 + "/aweme/v1/friend/register/notice/";
    }

    /* access modifiers changed from: package-private */
    public static class a<T> implements c<List<T>> {

        /* renamed from: a  reason: collision with root package name */
        public Class<T> f66575a;

        static {
            Covode.recordClassIndex(40923);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<T> a(Object obj) {
            if (obj instanceof JSONArray) {
                try {
                    return dw.b(obj.toString(), this.f66575a);
                } catch (Throwable th) {
                    throw new com.ss.android.ugc.aweme.base.api.a.a.c(th);
                }
            } else {
                throw new com.ss.android.ugc.aweme.base.api.a.a.d();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(String str, c<T> cVar, String str2, e eVar) {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (b() || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (f66574i == null) {
                f66574i = (NetApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (eVar != null) {
                com.ss.android.http.a.a[] aVarArr = (com.ss.android.http.a.a[]) eVar.f59534a.toArray(new com.ss.android.http.a.a[eVar.f59534a.size()]);
                for (com.ss.android.http.a.a aVar : aVarArr) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
                }
            }
            try {
                return (T) a(f66574i.doGet(str, arrayList, null).get(), cVar, str2, str);
            } catch (ExecutionException e2) {
                throw e2.getCause();
            }
        } else {
            throw new IOException();
        }
    }

    public static <T> T a(String str, c<T> cVar, String str2, String str3) {
        JSONObject optJSONObject;
        if (cVar == null) {
            throw new IllegalArgumentException("Parser can't be null");
        } else if (!m.a(str)) {
            T t = (T) new JSONObject(str);
            if (a(t)) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        return cVar.a(t.opt(str2));
                    }
                    if ((cVar instanceof b) && ((b) cVar).f66577a == null) {
                        return t;
                    }
                    if (!(cVar instanceof a) || ((a) cVar).f66575a != null) {
                        return cVar.a(str);
                    }
                    return t;
                } catch (Exception unused) {
                    return null;
                }
            } else if (!t.has("message") || !TextUtils.equals(t.optString("message"), "error") || (optJSONObject = t.optJSONObject("data")) == null) {
                com.ss.android.ugc.aweme.base.api.a.b.a url = new com.ss.android.ugc.aweme.base.api.a.b.a(t.optInt("status_code")).setErrorMsg(t.optString("message", "")).setErrorMsg(t.optString("status_msg", "")).setPrompt(t.optString("prompts", "")).setResponse(str).setUrl(str3);
                url.setBlockCode(t.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw url;
            } else {
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw new com.ss.android.ugc.aweme.base.api.a.b.a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str3);
            }
        } else {
            throw new com.ss.android.ugc.aweme.base.api.a.a.b();
        }
    }

    public static <T> T a(String str, Class<T> cls, String str2, e eVar) {
        return String.class.equals(cls) ? (T) a(str, d.f66578a, str2, eVar) : (T) a(str, new b(cls), str2, eVar);
    }

    private static <T> T a(String str, int i2, String str2, c<T> cVar, String str3) {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (b()) {
            return (T) a(NetworkUtils.postFile(i2, str, "file", str2), cVar, str3, str);
        }
        throw new IOException();
    }

    public static <T> T a(String str, int i2, String str2, Class<T> cls, String str3) {
        return String.class.equals(cls) ? (T) a(str, i2, str2, d.f66578a, str3) : (T) a(str, i2, str2, new b(cls), str3);
    }

    private static <T> T a(String str, int i2, String str2, c<T> cVar, String str3, List<com.ss.android.http.a.b.d> list) {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (b()) {
            return (T) a(NetworkUtils.postFile(i2, str, "file", str2, list), cVar, str3, str);
        }
        throw new IOException();
    }

    public static <T> T a(String str, int i2, String str2, Class<T> cls, String str3, List<com.ss.android.http.a.b.d> list) {
        return String.class.equals(cls) ? (T) a(str, i2, str2, d.f66578a, str3) : (T) a(str, i2, str2, new b(cls), str3, list);
    }
}
