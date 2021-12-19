package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.Map;
import java.util.SortedMap;
import org.json.JSONObject;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f33280a = {new y(ab.a(z.class), "str", "getStr()Ljava/lang/String;"), new y(ab.a(z.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"), new y(ab.a(z.class), "hashCode", "getHashCode()I")};

    /* renamed from: b  reason: collision with root package name */
    public final String f33281b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33282c;

    /* renamed from: d  reason: collision with root package name */
    public final SortedMap<String, String> f33283d;

    /* renamed from: e  reason: collision with root package name */
    public final SortedMap<String, String> f33284e;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f33285f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f33286g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f33287h;

    /* renamed from: i  reason: collision with root package name */
    private final h f33288i;

    /* renamed from: j  reason: collision with root package name */
    private final h f33289j;

    /* renamed from: k  reason: collision with root package name */
    private final h f33290k;

    /* access modifiers changed from: package-private */
    public final JSONObject a() {
        return (JSONObject) this.f33289j.getValue();
    }

    public final int hashCode() {
        return ((Number) this.f33290k.getValue()).intValue();
    }

    public final String toString() {
        return (String) this.f33288i.getValue();
    }

    static {
        Covode.recordClassIndex(19881);
    }

    static final class a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(19882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            int i3;
            int i4;
            int hashCode = ((this.this$0.f33281b.hashCode() * 31) + this.this$0.f33282c.hashCode()) * 31;
            SortedMap<String, String> sortedMap = this.this$0.f33283d;
            int i5 = 0;
            if (sortedMap != null) {
                i2 = sortedMap.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (hashCode + i2) * 31;
            SortedMap<String, String> sortedMap2 = this.this$0.f33284e;
            if (sortedMap2 != null) {
                i3 = sortedMap2.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            JSONObject jSONObject = this.this$0.f33285f;
            if (jSONObject != null) {
                i4 = jSONObject.hashCode();
            } else {
                i4 = 0;
            }
            int hashCode2 = (((i7 + i4) * 31) + Boolean.valueOf(this.this$0.f33286g).hashCode()) * 31;
            Map<String, String> map = this.this$0.f33287h;
            if (map != null) {
                i5 = map.hashCode();
            }
            return Integer.valueOf(hashCode2 + i5);
        }
    }

    static final class b extends m implements h.f.a.a<JSONObject> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(19883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ JSONObject invoke() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject put = new JSONObject().put("url", this.this$0.f33281b).put("method", this.this$0.f33282c);
            SortedMap<String, String> sortedMap = this.this$0.f33283d;
            JSONObject jSONObject3 = null;
            if (sortedMap != null) {
                jSONObject = ak.a(sortedMap);
            } else {
                jSONObject = null;
            }
            JSONObject put2 = put.put("headers", jSONObject);
            SortedMap<String, String> sortedMap2 = this.this$0.f33284e;
            if (sortedMap2 != null) {
                jSONObject2 = ak.a(sortedMap2);
            } else {
                jSONObject2 = null;
            }
            JSONObject put3 = put2.put("params", jSONObject2).put("data", this.this$0.f33285f).put("needCommonParams", this.this$0.f33286g);
            Map<String, String> map = this.this$0.f33287h;
            if (map != null) {
                jSONObject3 = ak.a(map);
            }
            return put3.put("extras", jSONObject3);
        }
    }

    static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(19884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            StringBuilder append = new StringBuilder().append(ak.a(this.this$0.f33281b, this.this$0.f33284e)).append(',');
            Object obj = this.this$0.f33285f;
            Object obj2 = "{}";
            if (obj == null) {
                obj = obj2;
            }
            StringBuilder append2 = append.append(obj).append(',');
            SortedMap<String, String> sortedMap = this.this$0.f33283d;
            if (sortedMap != null) {
                obj2 = sortedMap;
            }
            return append2.append(obj2).append(',').append(this.this$0.f33286g).toString();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r2 = ""
            h.f.b.l.c(r11, r2)
            java.lang.String r0 = "url"
            java.lang.String r3 = r11.optString(r0)
            h.f.b.l.a(r3, r2)
            java.lang.String r1 = "method"
            java.lang.String r0 = "get"
            java.lang.String r4 = r11.optString(r1, r0)
            h.f.b.l.a(r4, r2)
            java.lang.String r0 = "headers"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            r9 = 0
            if (r0 == 0) goto L_0x0052
            java.util.SortedMap r5 = com.bytedance.ies.d.a.ak.a(r0)
        L_0x0026:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 == 0) goto L_0x0050
            java.util.SortedMap r6 = com.bytedance.ies.d.a.ak.a(r0)
        L_0x0032:
            java.lang.String r0 = "data"
            org.json.JSONObject r7 = r11.optJSONObject(r0)
            r1 = 0
            java.lang.String r0 = "needCommonParams"
            boolean r8 = r11.optBoolean(r0, r1)
            java.lang.String r0 = "extras"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 == 0) goto L_0x004b
            java.util.SortedMap r9 = com.bytedance.ies.d.a.ak.a(r0)
        L_0x004b:
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0050:
            r6 = r9
            goto L_0x0032
        L_0x0052:
            r5 = r9
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.d.a.z.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!l.a((Object) this.f33281b, (Object) zVar.f33281b) || !l.a((Object) this.f33282c, (Object) zVar.f33282c) || !l.a(this.f33283d, zVar.f33283d) || !l.a(this.f33284e, zVar.f33284e) || !l.a(this.f33285f, zVar.f33285f) || this.f33286g != zVar.f33286g || !l.a(this.f33287h, zVar.f33287h)) {
            return false;
        }
        return true;
    }

    public z(String str, String str2, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, JSONObject jSONObject, boolean z, Map<String, String> map) {
        l.c(str, "");
        l.c(str2, "");
        this.f33281b = str;
        this.f33282c = str2;
        this.f33283d = sortedMap;
        this.f33284e = sortedMap2;
        this.f33285f = jSONObject;
        this.f33286g = z;
        this.f33287h = map;
        this.f33288i = h.i.a((h.f.a.a) new c(this));
        this.f33289j = h.i.a((h.f.a.a) new b(this));
        this.f33290k = h.i.a((h.f.a.a) new a(this));
    }
}
