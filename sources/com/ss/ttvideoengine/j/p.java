package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class p implements e {

    /* renamed from: a  reason: collision with root package name */
    public q f152965a;

    /* renamed from: b  reason: collision with root package name */
    public List<l> f152966b;

    /* renamed from: c  reason: collision with root package name */
    public h f152967c;

    /* renamed from: d  reason: collision with root package name */
    public q f152968d;

    /* renamed from: e  reason: collision with root package name */
    public int f152969e = 1;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f152970f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f152971g;

    /* renamed from: h  reason: collision with root package name */
    public String f152972h;

    /* renamed from: i  reason: collision with root package name */
    private int f152973i = 1;

    /* renamed from: j  reason: collision with root package name */
    private HashMap<String, w> f152974j;

    static {
        Covode.recordClassIndex(101678);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final int a(String str) {
        return -1;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f152970f = new JSONObject(jSONObject.toString());
            } catch (Throwable unused) {
                j.e("VideoModel", "generate mJsonInfo error");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                this.f152973i = 1;
                q qVar = new q();
                qVar.f152978c = this.f152973i;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
                qVar.D = this.f152971g;
                qVar.B = this.f152972h;
                qVar.a(optJSONObject2);
                this.f152965a = qVar;
                this.f152968d = qVar;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f152966b = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        l lVar = new l();
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        lVar.f152940e = jSONObject2.optLong("id");
                        lVar.f152936a = jSONObject2.optString("log_extra");
                        lVar.f152937b = jSONObject2.optInt("skip_time");
                        lVar.f152938c = jSONObject2.optInt("patch_position");
                        lVar.f152939d = jSONObject2.optInt("duration");
                        lVar.f152941f = jSONObject2.optString("external_url");
                        try {
                            JSONArray jSONArray = jSONObject2.getJSONArray("play_track_url_list");
                            if (jSONArray != null) {
                                lVar.f152942g = l.a(jSONArray, new String[1]);
                            }
                        } catch (JSONException unused2) {
                        }
                        try {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("playover_track_url_list");
                            if (jSONArray2 != null) {
                                lVar.f152943h = l.a(jSONArray2, new String[1]);
                            }
                        } catch (JSONException unused3) {
                        }
                        try {
                            JSONArray jSONArray3 = jSONObject2.getJSONArray("action_track_url_list");
                            if (jSONArray3 != null) {
                                lVar.f152944i = l.a(jSONArray3, new String[1]);
                            }
                        } catch (JSONException unused4) {
                        }
                        this.f152966b.add(lVar);
                    } catch (Exception unused5) {
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("live_info");
            if (optJSONObject3 != null) {
                this.f152969e = 0;
                this.f152967c = new h();
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("data");
                h hVar = this.f152967c;
                if (optJSONObject4 != null) {
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("live_info");
                    try {
                        if (optJSONObject5.has("live_0")) {
                            hVar.f152922h = new g();
                            hVar.f152922h.a(optJSONObject5.getJSONObject("live_0"));
                        }
                        if (optJSONObject5.has("live_1")) {
                            hVar.f152923i = new g();
                            hVar.f152923i.a(optJSONObject5.getJSONObject("live_1"));
                        }
                        hVar.f152917c = optJSONObject5.optInt("backup_status");
                        hVar.f152918d = optJSONObject5.optInt("live_status");
                        hVar.f152919e = optJSONObject5.optInt("status");
                        hVar.f152920f = optJSONObject5.optLong("start_time");
                        hVar.f152921g = optJSONObject5.optLong("end_time");
                    } catch (JSONException unused6) {
                    }
                    hVar.f152915a = optJSONObject4.optString("user_id");
                    hVar.f152916b = optJSONObject4.optString("live_id");
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (jSONObject.optInt("Version") == 4) {
                    this.f152973i = 4;
                } else {
                    this.f152973i = 2;
                }
                q qVar2 = new q();
                this.f152968d = qVar2;
                qVar2.f152978c = this.f152973i;
                this.f152968d.a(jSONObject);
            }
            a(this.f152974j);
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean a(e.a aVar) {
        if (this.f152968d == null) {
            return false;
        }
        int i2 = AnonymousClass1.f152975a[aVar.ordinal()];
        if (i2 == 1) {
            return this.f152968d.c(208).booleanValue();
        }
        if (i2 == 2) {
            return this.f152968d.c(206).booleanValue();
        }
        if (i2 != 3) {
            return false;
        }
        return this.f152968d.c(205).booleanValue();
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean a() {
        return (this.f152968d == null && this.f152967c == null) ? false : true;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final List<k> c() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.z;
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final e.b d() {
        e.b bVar = e.b.None;
        int i2 = this.f152969e;
        if (i2 == 0) {
            return e.b.LIVE;
        }
        if (i2 != 1) {
            return bVar;
        }
        return e.b.VOD;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String[] f() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.c();
        }
        return new String[0];
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String g() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.b(211);
        }
        return "mp4";
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String h() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.b(215);
        }
        return "";
    }

    @Override // com.ss.ttvideoengine.j.e
    public final w[] i() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.f152979d;
        }
        return new w[0];
    }

    @Override // com.ss.ttvideoengine.j.e
    public final JSONObject j() {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.H;
        }
        return null;
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
    public final List<o> b() {
        q qVar = this.f152968d;
        if (qVar == null) {
            return Collections.emptyList();
        }
        return qVar.a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.j.p$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f152975a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 101679(0x18d2f, float:1.42483E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.j.e$a[] r0 = com.ss.ttvideoengine.j.e.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.ttvideoengine.j.p.AnonymousClass1.f152975a = r2
                com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.HLS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.ttvideoengine.j.p.AnonymousClass1.f152975a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.MP4     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.ttvideoengine.j.p.AnonymousClass1.f152975a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.DASH     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.ttvideoengine.j.p.AnonymousClass1.f152975a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.NONE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.j.p.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String e() {
        List<o> a2;
        q qVar = this.f152968d;
        if (qVar == null || (a2 = qVar.a()) == null || a2.size() == 0) {
            return null;
        }
        for (o oVar : a2) {
            String b2 = oVar.b(5);
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean l() {
        if (!TextUtils.isEmpty(b(8)) && a(e.a.HLS) && c(222)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    @Override // com.ss.ttvideoengine.j.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r4 = this;
            r0 = 8
            java.lang.String r0 = r4.b(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r0 == 0) goto L_0x000e
            return r3
        L_0x000e:
            com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.DASH
            boolean r0 = r4.a(r0)
            r2 = 1
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r4.h()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "segment_base"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x002a:
            com.ss.ttvideoengine.j.e$a r0 = com.ss.ttvideoengine.j.e.a.MP4
            boolean r0 = r4.a(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 222(0xde, float:3.11E-43)
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r4.e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.j.p.k():boolean");
    }

    @Override // com.ss.ttvideoengine.j.e
    public final JSONObject n() {
        String b2 = b(211);
        String b3 = b(2);
        int a2 = a(3);
        List<o> b4 = b();
        if (b4 == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (o oVar : b4) {
                arrayList.add(oVar.f());
            }
            hashMap.put("format", b2);
            hashMap.put("vid", b3);
            hashMap.put("category", Integer.valueOf(a(232)));
            hashMap.put("frt_sub_vid", b(233));
            hashMap.put("duration", Integer.valueOf(a2));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(q qVar) {
        this.f152968d = qVar;
        a(this.f152974j);
    }

    @Override // com.ss.ttvideoengine.j.e
    public final int a(int i2) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.a(i2);
        }
        return -1;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String b(int i2) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.b(i2);
        }
        return "";
    }

    @Override // com.ss.ttvideoengine.j.e
    public final boolean c(int i2) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.c(i2).booleanValue();
        }
        return false;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final long d(int i2) {
        q qVar = this.f152968d;
        if (qVar == null) {
            return 0;
        }
        if (i2 == 216) {
            return qVar.I;
        }
        if (i2 != 220) {
            return 0;
        }
        return qVar.O;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final float e(int i2) {
        q qVar = this.f152968d;
        if (qVar == null) {
            return 0.0f;
        }
        if (i2 == 224) {
            return qVar.K;
        }
        if (i2 != 225) {
            return 0.0f;
        }
        return qVar.L;
    }

    public final o a(Map<Integer, String> map) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.a(map);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String a(w wVar) {
        HashMap<String, w> hashMap;
        q qVar = this.f152968d;
        if (qVar == null) {
            return wVar.toString(q.f152976a);
        }
        int a2 = qVar.a(7);
        if (a2 == q.f152977b) {
            hashMap = qVar.F;
        } else {
            hashMap = qVar.E;
        }
        String str = null;
        Iterator<Map.Entry<String, w>> it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, w> next = it.next();
            if (next.getValue().getIndex() == wVar.getIndex()) {
                str = next.getKey();
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return wVar.toString(a2);
        }
        return str;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final void a(HashMap<String, w> hashMap) {
        this.f152974j = hashMap;
        q qVar = this.f152968d;
        if (qVar != null) {
            qVar.a(hashMap);
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, Map<Integer, String> map) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.a(wVar, map);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final String[] b(w wVar, Map<Integer, String> map) {
        g gVar;
        q qVar = this.f152968d;
        if (qVar == null) {
            h hVar = this.f152967c;
            if (hVar != null) {
                if (hVar.f152922h != null) {
                    gVar = hVar.f152922h;
                } else if (hVar.f152923i != null) {
                    gVar = hVar.f152923i;
                }
                if (gVar != null) {
                    return gVar.f152914c;
                }
            }
            return new String[0];
        } else if (qVar.u != null && qVar.u.length > 0) {
            return qVar.u;
        } else {
            o a2 = qVar.a(wVar, map);
            if (a2 == null) {
                return new String[0];
            }
            return a2.b();
        }
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, int i2, Map<Integer, String> map) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return qVar.a(wVar, i2, map);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, Map<Integer, String> map, boolean z) {
        q qVar = this.f152968d;
        if (qVar != null) {
            return a(wVar, qVar.a(7), map, z);
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.j.e
    public final o a(w wVar, int i2, Map<Integer, String> map, boolean z) {
        String str;
        o a2 = a(wVar, i2, map);
        if (!z) {
            return a2;
        }
        String[] strArr = aj.cj;
        int i3 = 0;
        if (strArr.length > 0 && map != null && map.containsKey(32)) {
            int length = strArr.length - 1;
            if (a2 == null && (str = map.get(32)) != null) {
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
                    a2 = a(wVar, i2, map);
                    if (a2 != null) {
                        return a2;
                    }
                    i5 = ((i5 + strArr.length) - 1) % strArr.length;
                } while (i5 != length);
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
