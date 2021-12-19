package com.ss.android.ugc.aweme.at;

import com.bytedance.apm.q.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f67073a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(41326);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f67074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f67075b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f67076c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f67077d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ JSONObject f67078e;

        static {
            Covode.recordClassIndex(41327);
        }

        a(s sVar, String str, long j2, double d2, JSONObject jSONObject) {
            this.f67074a = sVar;
            this.f67075b = str;
            this.f67076c = j2;
            this.f67077d = d2;
            this.f67078e = jSONObject;
        }

        public final void run() {
            j.a(this.f67074a, this.f67075b, this.f67076c, this.f67077d, this.f67078e);
            r.a("ui_sample_report", this.f67074a.a());
        }
    }

    private static void a(JSONObject jSONObject, s sVar) {
        Iterator<String> keys;
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            float f2 = f.f25248a;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                l.b(next, "");
                int parseInt = Integer.parseInt(next);
                int optInt = jSONObject.optInt(next);
                if (optInt > 0) {
                    if (i4 < parseInt) {
                        i4 = parseInt;
                    }
                    if (parseInt >= 3) {
                        i3 += (int) (((float) (optInt * parseInt)) * f2);
                    }
                    if (parseInt != 0) {
                        if (parseInt < 3) {
                            i5 += optInt;
                        } else if (parseInt < 7) {
                            i6 += optInt;
                        } else if (parseInt < 14) {
                            i7 += optInt;
                        } else {
                            i8 += optInt;
                        }
                    }
                    i2 += optInt;
                }
            }
            sVar.a("all_frame", String.valueOf(i2));
            sVar.a("block_duration", String.valueOf(i3));
            sVar.a("drop_max", String.valueOf(i4));
            sVar.a("drop_x_count", String.valueOf((float) ((i5 * 0) + (i6 * 1) + (i7 * 1) + (i8 * 1))));
            sVar.a("level_1", String.valueOf(i5));
            sVar.a("level_2", String.valueOf(i6));
            sVar.a("level_3", String.valueOf(i7));
            sVar.a("level_4", String.valueOf(i8));
        }
    }

    public static void a(s sVar, String str, long j2, double d2, JSONObject jSONObject) {
        String valueOf;
        sVar.a("ui_scene", str);
        sVar.a("duration", String.valueOf(j2));
        if (d2 > 60.0d) {
            valueOf = "60";
        } else {
            double d3 = (double) ((int) (d2 * 100.0d));
            Double.isNaN(d3);
            valueOf = String.valueOf(d3 / 100.0d);
        }
        sVar.a("ui_fps", valueOf);
        a(jSONObject, sVar);
    }
}
