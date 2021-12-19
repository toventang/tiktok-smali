package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public int f152840a;

    /* renamed from: b  reason: collision with root package name */
    public int f152841b;

    /* renamed from: c  reason: collision with root package name */
    public int f152842c;

    /* renamed from: d  reason: collision with root package name */
    public long f152843d;

    /* renamed from: e  reason: collision with root package name */
    public long f152844e;

    /* renamed from: f  reason: collision with root package name */
    public long f152845f;

    /* renamed from: g  reason: collision with root package name */
    public long f152846g;

    /* renamed from: h  reason: collision with root package name */
    public String f152847h;

    /* renamed from: i  reason: collision with root package name */
    public String f152848i;

    /* renamed from: j  reason: collision with root package name */
    public String f152849j;

    /* renamed from: k  reason: collision with root package name */
    public String f152850k;

    /* renamed from: l  reason: collision with root package name */
    public String f152851l;

    /* renamed from: m  reason: collision with root package name */
    public w f152852m;
    public String n;
    public String o;
    public String p;
    public String q;
    public List<String> r;

    static {
        Covode.recordClassIndex(101653);
    }

    @Override // com.ss.ttvideoengine.j.o
    public final JSONObject d() {
        return null;
    }

    @Override // com.ss.ttvideoengine.j.o, com.ss.ttvideoengine.j.d
    public final i e() {
        return null;
    }

    @Override // com.ss.ttvideoengine.j.o, com.ss.ttvideoengine.j.d
    public final int a() {
        return this.f152840a;
    }

    @Override // com.ss.ttvideoengine.j.o, com.ss.ttvideoengine.j.d
    public final w c() {
        return this.f152852m;
    }

    private a() {
        super(null);
        this.f152840a = -1;
        this.f152846g = -1;
    }

    @Override // com.ss.ttvideoengine.j.o
    public final String[] b() {
        List<String> list = this.r;
        if (list != null) {
            return (String[]) list.toArray(new String[0]);
        }
        return new String[0];
    }

    /* renamed from: com.ss.ttvideoengine.j.a$a  reason: collision with other inner class name */
    public static class C4069a {

        /* renamed from: a  reason: collision with root package name */
        public int f152853a;

        /* renamed from: b  reason: collision with root package name */
        public int f152854b;

        /* renamed from: c  reason: collision with root package name */
        public int f152855c;

        /* renamed from: d  reason: collision with root package name */
        public long f152856d;

        /* renamed from: e  reason: collision with root package name */
        public long f152857e;

        /* renamed from: f  reason: collision with root package name */
        public long f152858f = -1;

        /* renamed from: g  reason: collision with root package name */
        public String f152859g;

        /* renamed from: h  reason: collision with root package name */
        public String f152860h;

        /* renamed from: i  reason: collision with root package name */
        public String f152861i;

        /* renamed from: j  reason: collision with root package name */
        public String f152862j;

        /* renamed from: k  reason: collision with root package name */
        public w f152863k;

        /* renamed from: l  reason: collision with root package name */
        public String f152864l;

        /* renamed from: m  reason: collision with root package name */
        public String f152865m;
        public String n;
        public String o;
        public List<String> p;
        private long q;
        private String r;

        static {
            Covode.recordClassIndex(101654);
        }

        public final a a() {
            a aVar = new a((byte) 0);
            aVar.f152840a = this.f152853a;
            aVar.f152841b = this.f152854b;
            aVar.f152842c = this.f152855c;
            aVar.f152843d = this.f152856d;
            aVar.f152844e = this.q;
            aVar.f152845f = this.f152857e;
            aVar.f152846g = this.f152858f;
            aVar.f152847h = this.f152859g;
            aVar.f152848i = this.f152860h;
            aVar.f152849j = this.f152861i;
            aVar.f152850k = this.f152862j;
            aVar.f152851l = this.r;
            aVar.f152852m = this.f152863k;
            aVar.n = this.f152864l;
            aVar.q = this.f152865m;
            aVar.o = this.n;
            aVar.p = this.o;
            aVar.r = this.p;
            return aVar;
        }
    }

    @Override // com.ss.ttvideoengine.j.o
    public final Map<String, Object> f() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", b(28));
        if (this.f152840a == q.f152976a) {
            str = "video";
        } else {
            str = DataType.AUDIO;
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(c(12)));
        hashMap.put("bitrate", Integer.valueOf(a(3)));
        hashMap.put("quality", b(18));
        hashMap.put("definition", b(7));
        hashMap.put("width", Integer.valueOf(a(1)));
        hashMap.put("height", Integer.valueOf(a(2)));
        hashMap.put("codec", b(8));
        hashMap.put("urls", b());
        hashMap.put("file_hash", b(15));
        return hashMap;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    @Override // com.ss.ttvideoengine.j.o, com.ss.ttvideoengine.j.d
    public final int a(int i2) {
        long j2;
        if (i2 == 1) {
            return this.f152841b;
        }
        if (i2 == 2) {
            return this.f152842c;
        }
        if (i2 == 3) {
            j2 = this.f152843d;
        } else if (i2 != 27) {
            return 0;
        } else {
            j2 = this.f152844e;
        }
        return (int) j2;
    }

    @Override // com.ss.ttvideoengine.j.o
    public final long c(int i2) {
        if (i2 == 12) {
            return this.f152845f;
        }
        if (i2 != 30) {
            return 0;
        }
        return this.f152846g;
    }

    @Override // com.ss.ttvideoengine.j.o, com.ss.ttvideoengine.j.d
    public final String b(int i2) {
        if (i2 == 5) {
            return this.p;
        }
        if (i2 == 6) {
            return this.f152850k;
        }
        if (i2 == 7) {
            return this.o;
        }
        if (i2 == 8) {
            return this.f152849j;
        }
        if (i2 == 15) {
            return this.f152847h;
        }
        if (i2 == 18) {
            return this.n;
        }
        if (i2 == 28) {
            return this.f152848i;
        }
        if (i2 == 31) {
            return this.f152851l;
        }
        if (i2 != 32) {
            return null;
        }
        return this.q;
    }

    @Override // com.ss.ttvideoengine.j.o
    public final int a(JSONObject jSONObject) {
        int i2;
        try {
            this.f152848i = jSONObject.optString("file_id");
            if (jSONObject.optString("media_type").compareTo(DataType.AUDIO) == 0) {
                i2 = q.f152977b;
            } else {
                i2 = q.f152976a;
            }
            this.f152840a = i2;
            this.f152845f = jSONObject.optLong("file_size");
            this.f152843d = (long) jSONObject.optInt("bitrate");
            this.n = jSONObject.optString("quality");
            this.K = jSONObject.optString("definition");
            this.f152841b = jSONObject.optInt("width");
            this.f152842c = jSONObject.optInt("height");
            this.f152849j = jSONObject.optString("codec");
            JSONArray jSONArray = jSONObject.getJSONArray("urls");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string = jSONArray.getString(i3);
                if (!TextUtils.isEmpty(string)) {
                    if (this.r == null) {
                        this.r = new ArrayList();
                    }
                    this.r.add(string);
                }
            }
            this.f152847h = jSONObject.optString("file_hash");
            return 0;
        } catch (Exception e2) {
            j.a("TTVideoEngine.BareVideoInfo", "[GearStrategy]fromMediaInfoJsonObject exception=".concat(String.valueOf(e2)));
            return -1;
        }
    }
}
