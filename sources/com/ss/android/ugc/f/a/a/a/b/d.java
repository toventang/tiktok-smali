package com.ss.android.ugc.f.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import com.ss.android.ugc.f.a.a.a.a.c;
import com.ss.android.ugc.f.a.a.a.b;
import com.ss.android.ugc.f.a.a.a.b.a;
import com.ss.android.ugc.f.a.a.a.b.b;
import com.ss.android.ugc.f.a.a.a.b.f;
import java.util.List;
import java.util.Map;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public g f145564e;

    static {
        Covode.recordClassIndex(95613);
    }

    public static class a extends a.AbstractC3868a {
        static {
            Covode.recordClassIndex(95614);
        }

        @Override // com.ss.android.ugc.f.a.a.a.b.a.AbstractC3868a
        public final g a() {
            d dVar = new d(this.f145555a, (byte) 0);
            g a2 = new f.a(this.f145555a).a(this.f145556b).b(this.f145557c).a(this.f145558d).a();
            a2.a(this.f145556b);
            a2.b(this.f145557c);
            a2.a(this.f145558d);
            dVar.f145564e = a2;
            return dVar;
        }

        public a(com.ss.android.ugc.f.a.a.a.a.d dVar) {
            super(dVar);
        }
    }

    private d(com.ss.android.ugc.f.a.a.a.a.d dVar) {
        super(dVar);
    }

    /* synthetic */ d(com.ss.android.ugc.f.a.a.a.a.d dVar, byte b2) {
        this(dVar);
    }

    @Override // com.ss.android.ugc.f.a.a.a.b.g
    public final com.ss.android.ugc.f.a.a.a.a.f a(List<? extends c> list, Map<String, Object> map) {
        c cVar;
        int i2;
        com.ss.android.ugc.f.a.a.a.a.f fVar = new com.ss.android.ugc.f.a.a.a.a.f();
        if (list == null || list.isEmpty()) {
            fVar.f145548b = new b(0, "bitrate list is empty...");
            return fVar;
        }
        List<? extends c> c2 = c(list);
        if (c2.isEmpty()) {
            fVar.f145548b = new b(5, "Intersection bitrate list is empty.");
            return fVar;
        }
        int i3 = 1;
        try {
            m mVar = b.a.f145560a.f145559a;
            if (mVar != null) {
                if (mVar.c()) {
                    if (mVar.b()) {
                        List list2 = (List) map.get("cache_size_list");
                        if (list2 != null) {
                            int intValue = ((Integer) map.get("internet_speed")).intValue();
                            if (intValue > 0) {
                                int intValue2 = ((Integer) map.get("internet_speed_0")).intValue();
                                int intValue3 = ((Integer) map.get("internet_speed_1")).intValue();
                                int intValue4 = ((Integer) map.get("internet_speed_2")).intValue();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= c2.size()) {
                                        cVar = (c) c2.get(c2.size() - 1);
                                        break;
                                    }
                                    int bitRate = ((c) c2.get(i4)).getBitRate();
                                    map.put("video_bitrate", Integer.valueOf(bitRate));
                                    if (list2.size() - i3 >= i4) {
                                        i2 = ((Integer) list2.get(i4)).intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    map.put("cache_size", Integer.valueOf(i2));
                                    float f2 = (float) bitRate;
                                    map.put("bitrate_speed", Float.valueOf(f2 / (((float) intValue) + 1.0f)));
                                    map.put("bitrate_speed_0", Float.valueOf(f2 / (((float) intValue2) + 1.0f)));
                                    map.put("bitrate_speed_1", Float.valueOf(f2 / (((float) intValue3) + 1.0f)));
                                    map.put("bitrate_speed_2", Float.valueOf(f2 / (((float) intValue4) + 1.0f)));
                                    List<String> a2 = mVar.f59875b.a(map, mVar.a(), mVar.f59877d.output, mVar.f59877d.feature_list, null);
                                    if (a2.size() > 0 && a2.get(0).equalsIgnoreCase("true")) {
                                        cVar = (c) c2.get(i4);
                                        break;
                                    }
                                    i4++;
                                    i3 = 1;
                                }
                                if (cVar != null) {
                                    fVar.f145547a = cVar;
                                    fVar.f145549c = 1;
                                    return fVar;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            fVar.f145548b = new com.ss.android.ugc.f.a.a.a.b(9, th.getMessage());
        }
        com.ss.android.ugc.f.a.a.a.a.f a3 = this.f145564e.a(c2, new f.b().a(((Integer) map.get("internet_speed")).intValue()).f145566a);
        a3.f145549c = 0;
        return a3;
    }
}
