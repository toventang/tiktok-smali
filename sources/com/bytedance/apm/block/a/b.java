package com.bytedance.apm.block.a;

import com.bytedance.apm.q.f;
import com.bytedance.apm.trace.b.a;
import com.bytedance.apm.trace.b.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f24553b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public a f24554c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final long f24555d = 10000;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, C0527b> f24556e = new HashMap<>();

    static {
        Covode.recordClassIndex(14461);
    }

    public b() {
        f.r.f24586e = true;
        com.bytedance.apm.trace.b.b.f25309c = true;
    }

    /* renamed from: com.bytedance.apm.block.a.b$b  reason: collision with other inner class name */
    class C0527b {

        /* renamed from: a  reason: collision with root package name */
        String f24567a;

        /* renamed from: b  reason: collision with root package name */
        long f24568b;

        /* renamed from: c  reason: collision with root package name */
        int f24569c;

        /* renamed from: d  reason: collision with root package name */
        int f24570d;

        /* renamed from: e  reason: collision with root package name */
        int[] f24571e;

        /* renamed from: f  reason: collision with root package name */
        int f24572f;

        static {
            Covode.recordClassIndex(14466);
        }

        public final String toString() {
            return "visibleScene=" + this.f24567a + ", sumFrame=" + this.f24569c + ", sumDroppedFrames=" + this.f24570d + ", sumFrameCost=" + this.f24568b + ", dropLevel=" + Arrays.toString(this.f24571e);
        }

        C0527b(String str) {
            this.f24567a = str;
            int i2 = f.f25249b - 1;
            this.f24572f = i2;
            this.f24571e = new int[(i2 + 0 + 1)];
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24564a;

        /* renamed from: b  reason: collision with root package name */
        public int f24565b;

        /* renamed from: c  reason: collision with root package name */
        public long f24566c;

        static {
            Covode.recordClassIndex(14465);
        }

        public final void a(long j2, boolean z) {
            if (z) {
                this.f24564a++;
            }
            this.f24565b++;
            this.f24566c += j2;
        }
    }

    @Override // com.bytedance.apm.block.a
    public final void a(String str, long j2, long j3) {
        super.a(str, j2, j3);
        long j4 = j3 - j2;
        int i2 = (int) j4;
        if (i2 > 0) {
            C0527b bVar = this.f24556e.get(str);
            if (bVar == null) {
                bVar = new C0527b(str);
                this.f24556e.put(str, bVar);
            }
            float f2 = f.f25248a;
            bVar.f24568b += j4;
            int min = Math.min(Math.max((int) (((float) j4) / f2), 0), bVar.f24572f);
            int[] iArr = bVar.f24571e;
            iArr[min] = iArr[min] + 1;
            bVar.f24570d += min;
            bVar.f24569c++;
            if (bVar.f24568b >= 10000) {
                this.f24556e.remove(str);
                try {
                    float f3 = f.f25248a;
                    JSONObject jSONObject = new JSONObject();
                    for (int i3 = 0; i3 <= bVar.f24572f; i3++) {
                        if (bVar.f24571e[i3] > 0) {
                            jSONObject.put(String.valueOf(i3), bVar.f24571e[i3]);
                        }
                    }
                    int i4 = ((bVar.f24569c * 100) * f.f25249b) / (bVar.f24569c + bVar.f24570d);
                    com.bytedance.apm.trace.b.a aVar = a.b.f25308a;
                    String str2 = bVar.f24567a;
                    double d2 = (double) i4;
                    Double.isNaN(d2);
                    aVar.a(str2, (float) (d2 / 100.0d));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", bVar.f24567a);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("total_scroll_time", bVar.f24568b);
                    jSONObject3.put("drop_time_rate", (double) (1.0f - ((((float) bVar.f24569c) * 1.0f) / ((float) ((int) (((float) bVar.f24568b) / f3))))));
                    jSONObject3.put("refresh_rate", bVar.f24572f + 1);
                    com.bytedance.apm.c.a.a.b().a(new com.bytedance.apm.c.b.f("fps_drop", bVar.f24567a, jSONObject, jSONObject2, jSONObject3, (byte) 0));
                } catch (Throwable unused) {
                }
                bVar.f24569c = 0;
                bVar.f24570d = 0;
                bVar.f24568b = 0;
            }
        }
        for (int i5 = 0; i5 < this.f24553b.size(); i5++) {
            c cVar = this.f24553b.get(i5);
            if (cVar.n == 0) {
                cVar.n = j2;
            }
            if (j4 >= 0) {
                synchronized (cVar) {
                    if (cVar.f25336h.size() > 20000) {
                        cVar.f25336h.poll();
                    }
                    cVar.f25336h.add(Integer.valueOf(i2 * 100));
                }
            }
        }
    }
}
