package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.j.a;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public String f152866a;

    /* renamed from: b  reason: collision with root package name */
    public long f152867b;

    /* renamed from: c  reason: collision with root package name */
    public float f152868c;

    /* renamed from: d  reason: collision with root package name */
    public float f152869d;

    /* renamed from: e  reason: collision with root package name */
    public List<o> f152870e;

    /* renamed from: f  reason: collision with root package name */
    public int f152871f;

    /* renamed from: g  reason: collision with root package name */
    public String f152872g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f152873h;

    static {
        Covode.recordClassIndex(101655);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final void a(HashMap<String, w> hashMap) {
    }

    @Override // com.ss.ttvideoengine.j.e
    public final List<k> c() {
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean c(int i2) {
        return false;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final long d(int i2) {
        return 0;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String g() {
        return "mp4";
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String h() {
        return "";
    }

    @Override // com.ss.ttvideoengine.j.e
    public final JSONObject j() {
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean k() {
        return false;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean l() {
        return false;
    }

    private b() {
    }

    @Override // com.ss.ttvideoengine.j.e
    public final List<o> b() {
        return this.f152870e;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean a(e.a aVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(e.a.MP4);
        return hashSet.contains(aVar);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final e.b d() {
        return e.b.BARE;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String m() {
        JSONObject n = n();
        if (n != null) {
            return n.toString();
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String e() {
        for (o oVar : this.f152870e) {
            String b2 = oVar.b(5);
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
        }
        return null;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f152874a;

        /* renamed from: b  reason: collision with root package name */
        public long f152875b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f152876c;

        /* renamed from: d  reason: collision with root package name */
        private float f152877d;

        /* renamed from: e  reason: collision with root package name */
        private float f152878e;

        /* renamed from: f  reason: collision with root package name */
        private int f152879f;

        /* renamed from: g  reason: collision with root package name */
        private String f152880g;

        /* renamed from: h  reason: collision with root package name */
        private List<o> f152881h;

        static {
            Covode.recordClassIndex(101656);
        }

        public final b a() {
            b bVar = new b((byte) 0);
            bVar.f152866a = this.f152874a;
            bVar.f152867b = this.f152875b;
            bVar.f152873h = this.f152876c;
            bVar.f152868c = this.f152877d;
            bVar.f152869d = this.f152878e;
            bVar.f152871f = this.f152879f;
            bVar.f152872g = this.f152880g;
            if (this.f152881h == null) {
                this.f152881h = new ArrayList();
            }
            bVar.f152870e = this.f152881h;
            return bVar;
        }

        public final a a(o oVar) {
            if (this.f152881h == null) {
                this.f152881h = new ArrayList();
            }
            this.f152881h.add(oVar);
            return this;
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String[] f() {
        HashSet hashSet = new HashSet();
        for (o oVar : this.f152870e) {
            String b2 = oVar.b(8);
            if (!TextUtils.isEmpty(b2)) {
                hashSet.add(b2);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final w[] i() {
        HashSet hashSet = new HashSet();
        for (o oVar : this.f152870e) {
            hashSet.add(oVar.c());
        }
        return (w[]) hashSet.toArray(new w[0]);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final JSONObject n() {
        String str;
        if (a(e.a.MP4)) {
            str = "mp4";
        } else if (a(e.a.MP3)) {
            str = "mp3";
        } else {
            str = "";
        }
        String b2 = b(2);
        long j2 = this.f152867b;
        List<o> list = this.f152870e;
        if (list == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (o oVar : list) {
                arrayList.add(oVar.f());
            }
            hashMap.put("format", str);
            hashMap.put("vid", b2);
            hashMap.put("category", Integer.valueOf(a(232)));
            hashMap.put("frt_sub_vid", b(233));
            hashMap.put("duration", Long.valueOf(j2));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean a() {
        List<o> list = this.f152870e;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String a(w wVar) {
        return wVar.toString(q.f152976a);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String b(int i2) {
        if (i2 == 2) {
            return this.f152866a;
        }
        if (i2 != 233) {
            return null;
        }
        return this.f152872g;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final float e(int i2) {
        if (i2 == 224) {
            return this.f152868c;
        }
        if (i2 != 225) {
            return 0.0f;
        }
        return this.f152869d;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final int a(int i2) {
        if (i2 == 3) {
            return (int) this.f152867b;
        }
        if (i2 == 7) {
            return q.f152976a;
        }
        if (i2 != 232) {
            return 0;
        }
        return this.f152871f;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final int a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Exception e2) {
            j.a("TTVideoEngine.BareVideoModel", "[GearStrategy]fromMediaInfoJsonString exception=".concat(String.valueOf(e2)));
            return -1;
        }
    }

    private int a(JSONObject jSONObject) {
        try {
            this.f152866a = jSONObject.optString("vid");
            this.f152871f = jSONObject.optInt("category");
            this.f152867b = jSONObject.optLong("duration");
            JSONArray jSONArray = jSONObject.getJSONArray("infos");
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    a a2 = new a.C4069a().a();
                    a2.a(jSONArray.getJSONObject(i2));
                    if (this.f152870e == null) {
                        this.f152870e = new ArrayList();
                    }
                    this.f152870e.add(a2);
                }
            }
            return 0;
        } catch (Exception e2) {
            j.a("TTVideoEngine.BareVideoModel", "[GearStrategy]fromMediaInfoJsonObject exception=".concat(String.valueOf(e2)));
            return -1;
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, Map<Integer, String> map) {
        return a(wVar, a(7), map);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String[] b(w wVar, Map<Integer, String> map) {
        o a2 = a(wVar, map);
        if (a2 == null) {
            return new String[0];
        }
        return a2.b();
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, int i2, Map<Integer, String> map) {
        Iterator<o> it = this.f152870e.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null && wVar == next.c() && i2 == next.a()) {
                if (map == null || map.isEmpty()) {
                    return next;
                }
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value) || value.equals(next.b(intValue))) {
                    }
                }
                return next;
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, Map<Integer, String> map, boolean z) {
        return a(wVar, a(7), map, z);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, int i2, Map<Integer, String> map, boolean z) {
        o a2 = a(wVar, i2, map);
        if (!z) {
            return a2;
        }
        String[] strArr = aj.cj;
        int i3 = 0;
        if (strArr.length > 0 && map != null && map.containsKey(32)) {
            int length = strArr.length - 1;
            if (a2 == null) {
                while (true) {
                    String str = map.get(32);
                    if (str != null) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= strArr.length) {
                                break;
                            } else if (strArr[i4].equals(str)) {
                                length = i4;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        int i5 = length;
                        do {
                            map.put(32, strArr[i5]);
                            o a3 = a(wVar, i2, map);
                            if (a3 != null) {
                                return a3;
                            }
                            i5 = ((i5 + strArr.length) - 1) % strArr.length;
                        } while (i5 != length);
                        length = i5;
                    }
                }
            }
        }
        w[] allResolutions = w.getAllResolutions();
        if (allResolutions.length <= 0) {
            return a2;
        }
        int length2 = allResolutions.length - 1;
        if (wVar != null) {
            while (true) {
                if (i3 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i3].getIndex() == wVar.getIndex()) {
                    length2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        int i6 = length2;
        if (a2 == null) {
            do {
                a2 = a(allResolutions[i6], i2, (Map<Integer, String>) null);
                if (a2 != null) {
                    break;
                }
                i6 = ((i6 + allResolutions.length) - 1) % allResolutions.length;
            } while (i6 != length2);
        }
        return a2;
    }
}
