package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedList<g> f110623c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final a f110624d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f110625a;

    /* renamed from: b  reason: collision with root package name */
    public OnePlaytimePredictRealConfig f110626b;

    /* renamed from: e  reason: collision with root package name */
    private LinkedHashMap<String, Long> f110627e = new LinkedHashMap<>();

    public static final class a {
        static {
            Covode.recordClassIndex(71021);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71020);
    }

    public g(JSONObject jSONObject, OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        l.d(jSONObject, "");
        l.d(onePlaytimePredictRealConfig, "");
        this.f110625a = jSONObject;
        this.f110626b = onePlaytimePredictRealConfig;
    }

    public final boolean a(Aweme aweme, long j2) {
        String str;
        long j3;
        l.d(aweme, "");
        String aid = aweme.getAid();
        int i2 = 0;
        if (aid == null) {
            return false;
        }
        if (this.f110627e.containsKey(aid)) {
            Long l2 = this.f110627e.get(aid);
            if (l2 != null) {
                l2.longValue();
            }
        } else {
            this.f110627e.put(aid, Long.valueOf(j2));
        }
        int size = this.f110627e.size();
        if (size < this.f110626b.getCount() || size <= 0) {
            return false;
        }
        int type = this.f110626b.getType();
        if (type != 0) {
            long j4 = 0;
            if (type != 1) {
                if (type == 2) {
                    for (Long l3 : this.f110627e.values()) {
                        l.b(l3, "");
                        j4 += l3.longValue();
                    }
                    j4 /= (long) size;
                } else if (type != 3) {
                    if (type == 4) {
                        j3 = 1000000000;
                        for (Long l4 : this.f110627e.values()) {
                            if (l4.longValue() < j3) {
                                l.b(l4, "");
                                j3 = l4.longValue();
                            }
                        }
                    } else if (type == 5) {
                        Collection<Long> values = this.f110627e.values();
                        l.b(values, "");
                        List g2 = n.g((Collection) values);
                        n.c(g2);
                        j3 = ((Number) g2.get(size / 2)).longValue();
                    }
                    i2 = (int) j3;
                } else {
                    for (Long l5 : this.f110627e.values()) {
                        if (l5.longValue() > j4) {
                            l.b(l5, "");
                            j4 = l5.longValue();
                        }
                    }
                }
                i2 = (int) j4;
            } else {
                for (Long l6 : this.f110627e.values()) {
                    l.b(l6, "");
                    j4 += l6.longValue();
                }
                i2 = (int) j4;
            }
            JSONObject jSONObject = this.f110625a;
            if (i2 >= this.f110626b.getDuration()) {
                str = "gt";
            } else {
                str = "lt";
            }
            jSONObject.put("ss_result", str);
            this.f110625a.put("ff_result", Float.valueOf((float) i2));
            return true;
        }
        JSONArray jSONArray = new JSONArray();
        for (Long l7 : this.f110627e.values()) {
            l.b(l7, "");
            jSONArray.put(l7.longValue());
        }
        this.f110625a.put("ss_result", jSONArray.toString());
        return true;
    }
}
