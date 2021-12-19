package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import org.json.JSONObject;

public final class b implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public double f20198a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f20199b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20200c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20201d;

    /* renamed from: e  reason: collision with root package name */
    public long f20202e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20203f;

    /* renamed from: g  reason: collision with root package name */
    private final h.c f20204g;

    static {
        Covode.recordClassIndex(11922);
    }

    @Override // com.bytedance.android.livesdkapi.host.h.c
    public final void a(h.a aVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.h.c
    public final void a(h.b bVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.h.c
    public final void a() {
        this.f20204g.a();
        this.f20201d = true;
    }

    @Override // com.bytedance.android.livesdkapi.host.h.c
    public final void b() {
        this.f20201d = false;
        this.f20204g.b();
    }

    public b(String str, boolean z) {
        l.d(str, "");
        this.f20203f = str;
        h.c a2 = ((h) a.a(h.class)).a("live_fluency_" + str, z);
        this.f20204g = a2;
        a2.a(new h.b(this) {
            /* class com.bytedance.android.livesdk.performance.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f20205a;

            static {
                Covode.recordClassIndex(11923);
            }

            {
                this.f20205a = r1;
            }

            @Override // com.bytedance.android.livesdkapi.host.h.b
            public final void a(double d2) {
                this.f20205a.f20198a = d2;
            }
        });
        a2.a(new h.a(this) {
            /* class com.bytedance.android.livesdk.performance.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f20206a;

            static {
                Covode.recordClassIndex(11924);
            }

            {
                this.f20206a = r1;
            }

            @Override // com.bytedance.android.livesdkapi.host.h.a
            public final void a(JSONObject jSONObject) {
                this.f20206a.f20199b = jSONObject;
                b bVar = this.f20206a;
                JSONObject jSONObject2 = bVar.f20199b;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    l.b(keys, "");
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int optInt = jSONObject2.optInt(next);
                        l.b(next, "");
                        Integer e2 = p.e(next);
                        if (e2 != null) {
                            int intValue = e2.intValue();
                            if (3 <= intValue && 6 >= intValue) {
                                i2 += optInt;
                                i4 += intValue * optInt;
                            } else if (7 <= intValue && 15 >= intValue) {
                                i6 += optInt;
                                i7 += intValue * optInt;
                            } else if (16 <= intValue && 24 >= intValue) {
                                i8 += optInt;
                                i9 += intValue * optInt;
                            } else if (25 <= intValue && 40 >= intValue) {
                                i10 += optInt;
                                i11 += intValue * optInt;
                            } else if (intValue >= 41) {
                                i12 += optInt;
                                i13 += intValue * optInt;
                            }
                            i3 += optInt;
                            i5 += (intValue + 1) * optInt;
                        }
                    }
                    float f2 = (float) i5;
                    b.a.a("livesdk_fluency").a().a("scene", bVar.f20203f).a("fps", Double.valueOf(bVar.f20198a)).a("drop_3", i2).a("drop_3_percent", Float.valueOf(((float) i4) / f2)).a("drop_7", i6).a("drop_7_percent", Float.valueOf(((float) i7) / f2)).a("drop_16", i8).a("drop_16_percent", Float.valueOf(((float) i9) / f2)).a("drop_25", i10).a("drop_25_percent", Float.valueOf(((float) i11) / f2)).a("drop_41", i12).a("drop_41_percent", Float.valueOf(((float) i13) / f2)).a("drop_total", i3).a("gift_id", bVar.f20202e).a("is_anchor", com.bytedance.android.livesdk.utils.p.a(Boolean.valueOf(bVar.f20200c)) ? 1 : 0).a(com.bytedance.android.live.broadcast.e.a.f7847a).b();
                }
            }
        });
    }
}
