package com.bytedance.android.a.a.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f6628j;

    /* renamed from: k  reason: collision with root package name */
    public String f6629k;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, String> f6630l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6631m;
    public long n;

    static {
        Covode.recordClassIndex(3190);
    }

    @Override // com.bytedance.android.a.a.d.a
    public final String a() {
        return this.f6629k;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f6632a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6633b = true;

        /* renamed from: c  reason: collision with root package name */
        public long f6634c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f6635d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f6636e;

        /* renamed from: f  reason: collision with root package name */
        public String f6637f;

        /* renamed from: g  reason: collision with root package name */
        public long f6638g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6639h;

        /* renamed from: i  reason: collision with root package name */
        private List<String> f6640i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f6641j;

        static {
            Covode.recordClassIndex(3191);
        }

        public final b a() {
            b bVar = new b(this.f6632a, this.f6640i, this.f6637f, this.f6633b, this.f6634c, this.f6635d, this.f6636e, this.f6641j);
            bVar.n = this.f6638g;
            bVar.f6631m = this.f6639h;
            return bVar;
        }

        public final a a(List<String> list) {
            this.f6640i = list;
            return this;
        }
    }

    public final boolean b() {
        if (this.n <= 0 || (System.currentTimeMillis() - this.f6627i) / 1000 <= this.n) {
            return false;
        }
        return true;
    }

    public String toString() {
        int size;
        String str;
        StringBuilder append = new StringBuilder("C2STrackEvent{adid:").append(this.f6621c).append(",non_std_adid:").append(this.f6623e).append(",usize:");
        if (this.f6624f == null) {
            size = 0;
        } else {
            size = this.f6624f.size();
        }
        StringBuilder append2 = append.append(size).append(",key:");
        if (TextUtils.isEmpty(this.f6620b)) {
            str = "empty";
        } else {
            str = this.f6620b;
        }
        return append2.append(str).append(",label:").append(this.f6629k).append(",create_time:").append(this.f6627i).append(",retry_when_network_available:").append(this.f6631m).append(",expire_seconds:").append(this.n).append("}").toString();
    }

    public b(long j2, List<String> list, String str, boolean z, long j3, String str2, JSONObject jSONObject, Map<String, String> map) {
        this(UUID.randomUUID().toString(), "c2s", j2, list, str, z, j3, str2, jSONObject, 0, map);
    }

    public b(String str, String str2, long j2, List<String> list, String str3, boolean z, long j3, String str4, JSONObject jSONObject, int i2, Map<String, String> map) {
        super(str, str2, j2, list, z, j3, str4, jSONObject);
        this.f6629k = "";
        this.n = -1;
        this.f6629k = str3;
        this.f6628j = i2;
        this.f6630l = map;
    }
}
