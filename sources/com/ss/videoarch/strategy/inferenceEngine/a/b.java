package com.ss.videoarch.strategy.inferenceEngine.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static String f154487e = "(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)";

    /* renamed from: a  reason: collision with root package name */
    public final String f154488a;

    /* renamed from: b  reason: collision with root package name */
    public int f154489b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f154490c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f154491d = null;

    /* renamed from: f  reason: collision with root package name */
    private final Random f154492f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f154493g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private List<String> f154494h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private ReentrantLock f154495i = new ReentrantLock();

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f154496j = new ArrayList(10);

    /* renamed from: k  reason: collision with root package name */
    private final List<String> f154497k = new ArrayList();

    static {
        Covode.recordClassIndex(102943);
    }

    /* access modifiers changed from: package-private */
    public final List<String> b() {
        this.f154495i.lock();
        ArrayList arrayList = new ArrayList();
        List<String> list = this.f154493g;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.f154493g);
        }
        List<String> list2 = this.f154494h;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(this.f154494h);
        }
        List<String> list3 = this.f154490c;
        if (list3 != null && !list3.isEmpty()) {
            arrayList.addAll(this.f154490c);
        }
        this.f154495i.unlock();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final JSONArray a() {
        this.f154495i.lock();
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f154493g;
        if (!(list == null || this.f154494h == null)) {
            if (!list.isEmpty()) {
                for (int i2 = 0; i2 < this.f154493g.size(); i2++) {
                    jSONArray.put(this.f154493g.get(i2));
                }
            }
            if (!this.f154494h.isEmpty()) {
                for (int i3 = 0; i3 < this.f154494h.size(); i3++) {
                    jSONArray.put(this.f154494h.get(i3));
                }
            }
        }
        this.f154495i.unlock();
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject c() {
        this.f154495i.lock();
        JSONObject jSONObject = new JSONObject();
        List<String> list = this.f154490c;
        if (!(list == null || list.size() == 0)) {
            for (String str : this.f154490c) {
                try {
                    jSONObject.put(str, "local_dns");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        List<String> list2 = this.f154494h;
        if (!(list2 == null || list2.size() == 0)) {
            for (String str2 : this.f154494h) {
                try {
                    jSONObject.put(str2, "remote_local_dns");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
        List<String> list3 = this.f154493g;
        if (!(list3 == null || list3.size() == 0)) {
            for (String str3 : this.f154493g) {
                try {
                    jSONObject.put(str3, "http_dns");
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }
        this.f154495i.unlock();
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(List<String> list) {
        this.f154495i.lock();
        this.f154493g = list;
        this.f154495i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(List<String> list) {
        this.f154495i.lock();
        this.f154494h = list;
        this.f154495i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean c(List<String> list) {
        this.f154495i.lock();
        this.f154490c = list;
        this.f154495i.unlock();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String a(boolean z) {
        this.f154495i.lock();
        List<String> list = this.f154493g;
        if (list == null || list.isEmpty()) {
            List<String> list2 = this.f154494h;
            if (list2 == null || list2.isEmpty()) {
                List<String> list3 = this.f154490c;
                if (list3 == null || list3.isEmpty()) {
                    this.f154495i.unlock();
                    return null;
                }
                for (String str : this.f154490c) {
                    if (!TextUtils.isEmpty(str)) {
                        if (Pattern.compile(f154487e).matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches()) {
                            if (z) {
                                this.f154495i.unlock();
                                return str;
                            }
                        }
                    }
                    if (!z) {
                        this.f154495i.unlock();
                        return str;
                    }
                }
                String str2 = this.f154490c.get(0);
                this.f154495i.unlock();
                return str2;
            }
            String str3 = this.f154494h.get(0);
            this.f154495i.unlock();
            return str3;
        }
        String str4 = this.f154493g.get(0);
        this.f154495i.unlock();
        return str4;
    }

    b(String str, int i2) {
        this.f154488a = str;
        this.f154492f = new Random(System.currentTimeMillis());
        this.f154489b = i2;
    }
}
