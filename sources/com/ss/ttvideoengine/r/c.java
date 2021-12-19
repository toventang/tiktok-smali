package com.ss.ttvideoengine.r;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public d f153217a = new d();

    /* renamed from: b  reason: collision with root package name */
    public b f153218b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f153219c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f153220d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f153221e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f153222f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f153223g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f153224h = -1;

    /* renamed from: i  reason: collision with root package name */
    public Map<Integer, List<Integer>> f153225i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public w f153226j = w.Standard;

    /* renamed from: k  reason: collision with root package name */
    public w f153227k = w.Standard;

    /* renamed from: l  reason: collision with root package name */
    private int f153228l = 0;

    static {
        Covode.recordClassIndex(101771);
    }

    public final boolean b() {
        Boolean bool = this.f153217a.f153229a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void a() {
        this.f153217a.a();
        this.f153220d = false;
        this.f153221e = false;
        this.f153222f = 0;
        this.f153223g = -1;
        this.f153224h = -1;
        this.f153228l = new Random().nextInt(100);
        this.f153226j = w.Standard;
        this.f153227k = w.Standard;
    }

    public c() {
        this.f153217a.b();
        this.f153217a.f153229a = false;
        this.f153217a.f153240l = false;
        this.f153217a.b(false);
        this.f153218b = null;
        this.f153219c = 1;
        this.f153220d = false;
        this.f153221e = false;
        this.f153222f = 0;
        this.f153223g = -1;
        this.f153224h = -1;
        this.f153228l = new Random().nextInt(100);
        this.f153226j = w.Standard;
        this.f153227k = w.Standard;
        this.f153225i.put(Integer.valueOf(w.Standard.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(w.High.getIndex()))));
        this.f153225i.put(Integer.valueOf(w.High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(w.H_High.getIndex()))));
        this.f153225i.put(Integer.valueOf(w.H_High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(w.SuperHigh.getIndex()))));
        this.f153225i.put(Integer.valueOf(w.SuperHigh.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(w.ExtremelyHigh.getIndex()))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r2.compareTo(java.lang.Integer.valueOf(r3.intValue() & r2.intValue())) != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r2.compareTo(java.lang.Integer.valueOf(r3.intValue() & r2.intValue())) != 0) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.r.c.c():void");
    }

    public final void a(d dVar) {
        j.a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig cfg=".concat(String.valueOf(dVar)));
        if (dVar != null) {
            this.f153217a.a(dVar);
            String str = dVar.w;
            if (str != null && !str.isEmpty()) {
                String lowerCase = str.toLowerCase();
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(lowerCase).getJSONObject("sr").getJSONObject("benchmark");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int parseInt = Integer.parseInt(next);
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
                        }
                        hashMap.put(Integer.valueOf(parseInt), arrayList);
                    }
                    this.f153225i = hashMap;
                    j.a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig mSRBenchmark=" + this.f153225i);
                } catch (Exception e2) {
                    j.a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig exception=".concat(String.valueOf(e2)));
                    e2.printStackTrace();
                }
            }
            j.a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig after mSRConfig=" + this.f153217a);
            c();
            b bVar = this.f153218b;
            if (bVar != null) {
                bVar.a(this);
            }
        }
    }

    public final void a(int i2, int i3) {
        int i4 = this.f153223g;
        if (i2 != i4) {
            if (i2 != 0 || 2 != i4) {
                j.b("TTVideoEngine.SRStrategy", "[SRLog]onSRStatus status=" + i2 + " reason=" + i3);
                this.f153223g = i2;
                if (2 == i2) {
                    this.f153222f = i3;
                }
                b bVar = this.f153218b;
                if (bVar != null) {
                    bVar.a(this);
                }
            }
        }
    }
}
