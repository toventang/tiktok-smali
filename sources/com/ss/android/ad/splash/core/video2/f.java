package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.video2.j;
import com.ss.android.ad.splash.f.g;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

public class f {

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f58888d;

    /* renamed from: e  reason: collision with root package name */
    private static long f58889e = 500;

    /* renamed from: f  reason: collision with root package name */
    private static long f58890f = 3000;

    /* renamed from: a  reason: collision with root package name */
    public Timer f58891a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58892b;

    /* renamed from: c  reason: collision with root package name */
    public int f58893c;

    /* renamed from: g  reason: collision with root package name */
    private j f58894g;

    static {
        Covode.recordClassIndex(36447);
    }

    public final void c() {
        this.f58892b = false;
        Timer timer = this.f58891a;
        if (timer != null) {
            timer.cancel();
            this.f58891a = null;
        }
    }

    public final void b() {
        j jVar = this.f58894g;
        if (jVar != null) {
            jVar.d();
            this.f58894g = null;
        }
        Timer timer = this.f58891a;
        if (timer != null) {
            timer.cancel();
            this.f58891a = null;
        }
    }

    public static f a() {
        MethodCollector.i(3738);
        if (f58888d == null) {
            synchronized (f.class) {
                try {
                    if (f58888d == null) {
                        f58888d = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3738);
                    throw th;
                }
            }
        }
        f fVar = f58888d;
        MethodCollector.o(3738);
        return fVar;
    }

    public static void a(b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.f58447j);
            jSONObject.put("ad_fetch_time", bVar.f58439b);
            h.a(bVar.f58441d, "splash_ad", "mute", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(b bVar, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f2));
            jSONObject2.putOpt("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", bVar.f58447j);
            jSONObject.put("ad_fetch_time", bVar.f58439b);
            h.a(bVar.f58441d, "splash_ad", "unmute", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(b bVar, Context context) {
        if (bVar.O != 0) {
            if (this.f58894g == null) {
                this.f58894g = new j(context);
            }
            int b2 = this.f58894g.b();
            int a2 = this.f58894g.a();
            this.f58893c = a2;
            float f2 = (((float) a2) * 1.0f) / ((float) b2);
            if (f2 == 0.0f) {
                a(bVar);
            } else {
                a(bVar, f2);
            }
            this.f58892b = false;
            this.f58894g.f58903a = new j.b(f2, b2, bVar) {
                /* class com.ss.android.ad.splash.core.video2.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                float f58895a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ float f58896b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f58897c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ b f58898d;

                static {
                    Covode.recordClassIndex(36448);
                }

                @Override // com.ss.android.ad.splash.core.video2.j.b
                public final void a(int i2) {
                    if (!f.this.f58892b) {
                        float f2 = this.f58895a;
                        if (f2 == 0.0f && i2 > 0) {
                            float f3 = (((float) i2) * 1.0f) / ((float) this.f58897c);
                            this.f58895a = f3;
                            f.a(this.f58898d, f3);
                        } else if (f2 > 0.0f && i2 == 0) {
                            this.f58895a = (float) i2;
                            f.a(this.f58898d);
                        }
                    }
                }

                {
                    this.f58896b = r2;
                    this.f58897c = r3;
                    this.f58898d = r4;
                    this.f58895a = r2;
                }
            };
            g.b("Init volume:" + this.f58893c);
            this.f58894g.c();
        }
    }

    public final void a(final g gVar, int i2, long j2) {
        if (gVar != null) {
            j jVar = this.f58894g;
            if (jVar == null || j2 <= f58890f) {
                gVar.a(true);
            } else if (i2 == 0) {
                gVar.a(true);
            } else if (i2 == 1) {
                gVar.a(false);
                gVar.a(0.0f, 0.0f);
            } else if (i2 == 2) {
                gVar.a(false);
                this.f58891a = new Timer();
                this.f58892b = true;
                final float a2 = (((float) this.f58894g.a()) * 1.0f) / ((float) f58890f);
                if (a2 > 0.0f) {
                    this.f58891a.schedule(new TimerTask() {
                        /* class com.ss.android.ad.splash.core.video2.f.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(36449);
                        }

                        public final void run() {
                            try {
                                float f2 = a2 * ((float) gVar.f());
                                if (f2 >= ((float) f.this.f58893c)) {
                                    gVar.a((float) f.this.f58893c, (float) f.this.f58893c);
                                    f.this.f58891a.cancel();
                                    return;
                                }
                                gVar.a(f2, f2);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }, 0, f58889e);
                }
            } else if (i2 != 3) {
                if (i2 == 4) {
                    int a3 = jVar.a();
                    gVar.a(true);
                    float f2 = ((float) a3) * 1.0f;
                    gVar.a(f2, f2);
                }
                gVar.a(true);
            } else {
                int a4 = jVar.a();
                gVar.a(false);
                float f3 = ((float) a4) * 1.0f;
                gVar.a(f3, f3);
            }
        }
    }
}
