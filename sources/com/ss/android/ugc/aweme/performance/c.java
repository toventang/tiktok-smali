package com.ss.android.ugc.aweme.performance;

import android.os.SystemClock;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.f;
import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f114787a;

    /* renamed from: b  reason: collision with root package name */
    private final a f114788b;

    /* renamed from: c  reason: collision with root package name */
    private long f114789c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f114790d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f114791e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f114792f = new d(this);

    static {
        Covode.recordClassIndex(73849);
    }

    public final void a() {
        if (!this.f114790d) {
            this.f114790d = true;
            this.f114789c = SystemClock.uptimeMillis();
            this.f114787a.a();
        }
    }

    public final void b() {
        if (this.f114790d) {
            this.f114790d = false;
            if (this.f114791e) {
                m.a().removeCallbacks(this.f114792f);
            }
            this.f114791e = false;
            this.f114788b.f114793a = SystemClock.uptimeMillis() - this.f114789c;
            this.f114787a.b();
            this.f114789c = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements b.c, b.d {

        /* renamed from: a  reason: collision with root package name */
        public long f114793a;

        /* renamed from: b  reason: collision with root package name */
        LagDataCallback f114794b = null;

        /* renamed from: c  reason: collision with root package name */
        private final String f114795c;

        /* renamed from: d  reason: collision with root package name */
        private double f114796d;

        static {
            Covode.recordClassIndex(73850);
        }

        @Override // com.bytedance.apm.trace.b.b.d
        public final void a(double d2) {
            this.f114796d = d2;
        }

        public a(String str) {
            this.f114795c = str;
        }

        public final synchronized void a(LagDataCallback lagDataCallback) {
            MethodCollector.i(8628);
            this.f114794b = lagDataCallback;
            MethodCollector.o(8628);
        }

        @Override // com.bytedance.apm.trace.b.b.c
        public final void a(JSONObject jSONObject) {
            b.a.f25210a.a(new e(this, this.f114795c, this.f114793a, this.f114796d, jSONObject));
            this.f114793a = -1;
            this.f114796d = -1.0d;
        }

        static void a(HashMap<String, String> hashMap, JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
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
                hashMap.put("total_frame", String.valueOf(i2));
                hashMap.put("block_duration", String.valueOf(i3));
                hashMap.put("drop_max", String.valueOf(i4));
                hashMap.put("weighted_drop_count", String.valueOf((float) ((i5 * 0) + (i6 * 1) + (i7 * 1) + (i8 * 1))));
                hashMap.put("level_1", String.valueOf(i5));
                hashMap.put("level_2", String.valueOf(i6));
                hashMap.put("level_3", String.valueOf(i7));
                hashMap.put("level_4", String.valueOf(i8));
            }
        }
    }

    public final void a(LagDataCallback lagDataCallback) {
        this.f114788b.a(lagDataCallback);
    }

    public c(String str) {
        a aVar = new a(str);
        this.f114788b = aVar;
        com.bytedance.apm.trace.b.b bVar = new com.bytedance.apm.trace.b.b(str, true);
        this.f114787a = bVar;
        bVar.a((b.d) aVar);
        bVar.a((b.c) aVar);
    }

    public final void a(long j2) {
        if (!this.f114790d) {
            this.f114791e = true;
            a();
            m.a().postDelayed(this.f114792f, j2);
        }
    }
}
