package com.ss.ttvideoengine.e;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f152473a;

    /* renamed from: b  reason: collision with root package name */
    protected long f152474b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected String f152475c = "base_task";

    /* renamed from: d  reason: collision with root package name */
    public long f152476d;

    /* renamed from: e  reason: collision with root package name */
    public long f152477e;

    /* renamed from: f  reason: collision with root package name */
    public int f152478f;

    /* renamed from: g  reason: collision with root package name */
    public c f152479g;

    /* renamed from: h  reason: collision with root package name */
    protected String f152480h;

    /* renamed from: i  reason: collision with root package name */
    protected ArrayList<String> f152481i;

    /* renamed from: j  reason: collision with root package name */
    protected HashMap<String, List<String>> f152482j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f152483k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f152484l;

    /* renamed from: m  reason: collision with root package name */
    public String f152485m;
    public d n;
    protected long o;
    protected long p;
    protected HashMap<String, Long> q;
    protected HashMap<String, Long> r;
    protected Handler s;
    protected EnumC4067a t = EnumC4067a.NONE;

    static {
        Covode.recordClassIndex(101554);
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f152474b = jSONObject.optLong("id");
            this.f152473a = jSONObject.optString("des");
            long optLong = jSONObject.optLong("res_size");
            this.f152476d = optLong;
            this.p = optLong;
            this.f152477e = jSONObject.optLong("content_size");
            this.f152478f = jSONObject.optInt("state");
            this.f152479g = i.a(jSONObject.optJSONObject("error"));
            this.f152480h = jSONObject.optString("file_path");
            JSONArray optJSONArray = jSONObject.optJSONArray("media_keys");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.f152481i = new ArrayList<>();
            } else {
                this.f152481i = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        this.f152481i.add(optString);
                    }
                }
            }
            this.f152483k = jSONObject.optBoolean("finish");
            this.f152484l = jSONObject.optBoolean("cancel");
            this.f152475c = jSONObject.optString("task_type");
            this.f152485m = jSONObject.optString("vid");
            if (jSONObject.optInt("encrypt_version", 0) == 1) {
                this.t = EnumC4067a.MDL_VERSION_1;
            } else {
                this.t = EnumC4067a.NONE;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("bytes_rec_map");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.q.put(next, Long.valueOf(optJSONObject.optLong(next)));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("bytes_expect_map");
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    this.r.put(next2, Long.valueOf(optJSONObject2.optLong(next2)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject c() {
        return new JSONObject(d());
    }

    private void e() {
        if (this.s == null) {
            this.s = new Handler(i.a()) {
                /* class com.ss.ttvideoengine.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101555);
                }

                public final void handleMessage(Message message) {
                    if (message != null && this != null) {
                        super.handleMessage(message);
                        if (message.what == 111) {
                            this.a(0);
                            if (this.n != null) {
                                this.n.c(this);
                            }
                        } else if (message.what == 112) {
                            this.f152479g = (c) message.obj;
                            if (!a.this.b(this.f152479g)) {
                                this.a(5);
                            }
                            if (this.n != null) {
                                d dVar = this.n;
                                a aVar = this;
                                dVar.a(aVar, aVar.f152479g);
                            }
                        } else if (message.what == 113) {
                            this.f152479g = null;
                            this.a(5);
                            if (this.n != null) {
                                this.n.a(this, (c) null);
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.ttvideoengine.e.a$a  reason: collision with other inner class name */
    public enum EnumC4067a {
        NONE(0),
        MDL_VERSION_1(1);
        
        public int version;

        static {
            Covode.recordClassIndex(101556);
        }

        private EnumC4067a(int i2) {
            this.version = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f152474b = -1;
        this.f152475c = "base_task";
        this.f152476d = 0;
        this.f152477e = 0;
        this.f152478f = 0;
        this.f152479g = null;
        this.f152480h = null;
        this.f152481i = new ArrayList<>();
        this.f152482j = null;
        this.f152483k = false;
        this.f152485m = null;
        this.o = 0;
        this.q = new HashMap<>();
        this.r = new HashMap<>();
    }

    public String toString() {
        return super.toString() + "   id = " + this.f152474b + ", state = " + this.f152478f + ",  videoId " + this.f152485m;
    }

    /* access modifiers changed from: package-private */
    public final Map d() {
        HashMap hashMap = new HashMap();
        a(hashMap, "id", this.f152474b);
        a(hashMap, "des", this.f152473a);
        a(hashMap, "res_size", this.f152476d);
        a(hashMap, "content_size", this.f152477e);
        a((Map) hashMap, "state", this.f152478f);
        c cVar = this.f152479g;
        if (cVar != null) {
            a(hashMap, "error", cVar.a());
        }
        a(hashMap, "file_path", this.f152480h);
        a(hashMap, "media_keys", this.f152481i);
        a(hashMap, "use_urls", this.f152482j);
        a(hashMap, "finish", this.f152483k);
        a(hashMap, "cancel", this.f152484l);
        a(hashMap, "task_type", this.f152475c);
        a(hashMap, "vid", this.f152485m);
        a(hashMap, "bytes_rec_map", this.q);
        a(hashMap, "bytes_expect_map", this.r);
        a((Map) hashMap, "encrypt_version", this.t.version);
        return hashMap;
    }

    public void a() {
        e();
        this.f152479g = null;
        this.f152483k = false;
        this.o = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public boolean b(c cVar) {
        if (cVar == null || cVar.f153260a == -9995 || cVar.f153260a == -9948 || cVar.f153260a == -9949 || cVar.f153260a == -9947 || cVar.f153260a == -9946) {
            return false;
        }
        return true;
    }

    public final void a(int i2) {
        String str;
        if (i2 != this.f152478f) {
            this.f152478f = i2;
            StringBuilder append = new StringBuilder("[downloader] state did changed. state = ").append(i2).append(" key = ");
            ArrayList<String> arrayList = this.f152481i;
            if (arrayList != null) {
                str = arrayList.toString();
            } else {
                str = null;
            }
            j.b("TTVideoEngine.DownloadTask", append.append(str).toString());
            d dVar = this.n;
            if (dVar != null && dVar.f152492b != null) {
                j.b("TTVideoEngine.DownloadTask", "[downloader] state did changed. and notify downloader state = ".concat(String.valueOf(i2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        e();
        Handler handler = this.s;
        if (handler != null) {
            handler.sendMessage(Message.obtain(handler, 112, cVar));
        }
    }

    public static void a(Map map, String str, int i2) {
        map.put(str, Integer.valueOf(i2));
    }

    private static void a(Map map, String str, long j2) {
        map.put(str, Long.valueOf(j2));
    }

    public static void a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void a(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }

    public static void a(Map map, String str, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            map.put(str, map2);
        }
    }

    public static void a(Map map, String str, boolean z) {
        map.put(str, Boolean.valueOf(z));
    }
}
