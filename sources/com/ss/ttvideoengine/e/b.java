package com.ss.ttvideoengine.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends a {
    public ArrayList<String> u;
    public String v;

    static {
        Covode.recordClassIndex(101557);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final boolean b(c cVar) {
        return false;
    }

    private b() {
    }

    static b e() {
        b bVar = new b();
        bVar.b();
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final void b() {
        super.b();
        this.u = null;
        this.v = null;
        this.f152475c = "url_task";
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final JSONObject c() {
        HashMap hashMap = new HashMap();
        a(hashMap, "base_json", super.d());
        a(hashMap, "key", this.v);
        a(hashMap, "urls", this.u);
        return new JSONObject(hashMap);
    }

    @Override // com.ss.ttvideoengine.e.a
    public final void a() {
        j.b("TTVideoEngine.DownloadURLTask", "[downloader] did call resume, key = " + this.f152481i.toString());
        if (this.f152484l) {
            j.b("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
        } else if (this.f152478f == 2) {
            j.b("TTVideoEngine.DownloadURLTask", "[downloader] state is running");
        } else {
            super.a();
            if (this.n == null || this.n.a(this)) {
                this.f152482j = new HashMap();
                this.f152482j.put(this.v, this.u);
                a(2);
                d dVar = d.h.f152465a;
                String str = this.v;
                String str2 = this.f152485m;
                ArrayList<String> arrayList = this.u;
                String a2 = dVar.a(str, str2, (String[]) arrayList.toArray(new String[arrayList.size()]), this.t.version);
                if (!d.h.f152465a.l(a2)) {
                    a(new c("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + a2 + " dataload state is " + d.h.f152465a.c()));
                    return;
                }
                j.a("TTVideoEngine.DownloadURLTask", "[downloader] resume a task. key = " + this.v + " downloader url is " + a2);
                if (this.n != null) {
                    this.n.b(this);
                    return;
                }
                return;
            }
            j.a("TTVideoEngine.DownloadURLTask", "[downloader] not should resume task = " + toString());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.ttvideoengine.e.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject.optJSONObject("base_json"));
        this.v = jSONObject.optString("key");
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.u = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.u.add(optString);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(b.class)) {
            return false;
        }
        return ((b) obj).v.equals(this.v);
    }
}
