package android.ss.com.vboost.c;

import android.content.Context;
import android.os.Build;
import android.ss.com.vboost.c.k;
import android.ss.com.vboost.e;
import android.ss.com.vboost.e.d;
import android.ss.com.vboost.f;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static Context f468a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f469b = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private h f470c;

    /* renamed from: d  reason: collision with root package name */
    private h f471d;

    /* renamed from: e  reason: collision with root package name */
    private h f472e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f475a = new c((byte) 0);

        static {
            Covode.recordClassIndex(34);
        }
    }

    static {
        Covode.recordClassIndex(32);
    }

    public static c a() {
        if (f468a != null) {
            return a.f475a;
        }
        if (!android.ss.com.vboost.e.a.a()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registerApplication", -2);
            android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject);
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private c() {
        d.a aVar;
        if (this.f470c == null) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("samsung")) {
                aVar = d.a.UNKNOWN;
            } else {
                aVar = d.a.SS;
            }
            if (android.ss.com.vboost.e.a.a()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vendor", aVar.name());
                    android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            int i2 = AnonymousClass1.f473a[aVar.ordinal()];
            if (i2 == 1) {
                this.f470c = new l(f468a);
            } else if (i2 == 2) {
                this.f470c = new b();
            } else if (i2 == 3) {
                this.f470c = new e();
            }
        }
        f fVar = new f(f468a);
        this.f471d = fVar;
        h hVar = this.f470c;
        if (hVar != null) {
            this.f472e = hVar;
        } else {
            this.f472e = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.c.c$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f473a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f474b;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bc */
        static {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.c.c.AnonymousClass1.<clinit>():void");
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final boolean a(android.ss.com.vboost.d.d dVar) {
        h hVar = this.f470c;
        if ((hVar == null || !hVar.a(dVar.f524a)) && !this.f471d.a(dVar.f524a)) {
            return false;
        }
        return true;
    }

    public final Object b(android.ss.com.vboost.d.d dVar) {
        i d2 = d(dVar);
        if (d2 == null || d2.f491b == null) {
            return null;
        }
        return d2.f491b.a(d2);
    }

    public final Object c(android.ss.com.vboost.d.d dVar) {
        i d2;
        if (dVar.f532i) {
            d2 = dVar.s;
        } else {
            d2 = d(dVar);
        }
        if (d2 == null || d2.f491b == null) {
            return null;
        }
        if (d2.f493d != null) {
            d2.f493d.f499b = f.END;
        }
        return d2.f491b.b(d2);
    }

    private i d(android.ss.com.vboost.d.d dVar) {
        long j2;
        long j3;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        h hVar6;
        h hVar7;
        h hVar8;
        i iVar = new i(dVar.f524a);
        dVar.s = iVar;
        switch (AnonymousClass1.f474b[iVar.f490a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                h hVar9 = this.f470c;
                if (hVar9 == null || !hVar9.a(iVar.f490a) || !this.f471d.a(iVar.f490a)) {
                    h hVar10 = this.f470c;
                    if (hVar10 != null && hVar10.a(dVar.f524a)) {
                        h hVar11 = this.f470c;
                        this.f472e = hVar11;
                        iVar.f491b = hVar11;
                        d dVar2 = (d) k.a.f503a.a(g.VENDOR, iVar.f490a).get(dVar.f525b);
                        if (dVar2 == null) {
                            return null;
                        }
                        if (dVar.f526c > ((long) dVar2.f479c)) {
                            j3 = (long) dVar2.f479c;
                        } else {
                            j3 = dVar.f526c;
                        }
                        iVar.f495f = j3;
                        iVar.f492c = dVar2.f477a;
                    } else if (!this.f471d.a(dVar.f524a)) {
                        return null;
                    } else {
                        iVar.f491b = this.f471d;
                        this.f472e = this.f471d;
                        d dVar3 = (d) k.a.f503a.a(g.PLATFORM, iVar.f490a).get(dVar.f525b);
                        if (dVar3 == null) {
                            return null;
                        }
                        if (dVar.f526c > ((long) dVar3.f479c)) {
                            j2 = (long) dVar3.f479c;
                        } else {
                            j2 = dVar.f526c;
                        }
                        iVar.f495f = j2;
                        iVar.f492c = dVar3.f477a;
                    }
                } else {
                    d dVar4 = (d) k.a.f503a.a(g.VENDOR, iVar.f490a).get(dVar.f525b);
                    if (dVar4 == null) {
                        return null;
                    }
                    if (dVar.f526c > ((long) dVar4.f479c)) {
                        e eVar = dVar.f525b;
                        if (((int) dVar.f526c) - dVar4.f479c <= dVar4.f481e || eVar.ordinal() <= dVar4.f482f) {
                            iVar.f492c = dVar4.f477a;
                            iVar.f495f = (long) dVar4.f479c;
                            if (dVar4.f478b == g.PLATFORM) {
                                hVar3 = this.f471d;
                            } else {
                                hVar3 = this.f470c;
                            }
                            iVar.f491b = hVar3;
                            if (dVar4.f478b == g.PLATFORM) {
                                hVar4 = this.f471d;
                            } else {
                                hVar4 = this.f470c;
                            }
                            this.f472e = hVar4;
                        } else {
                            d dVar5 = (d) k.a.f503a.a(g.VENDOR, iVar.f490a).get(dVar4.f480d);
                            if (dVar5 == null) {
                                return null;
                            }
                            iVar.f495f = dVar.f526c;
                            iVar.f492c = dVar5.f477a;
                            if (dVar5.f478b == g.PLATFORM) {
                                hVar5 = this.f471d;
                            } else {
                                hVar5 = this.f470c;
                            }
                            iVar.f491b = hVar5;
                            if (dVar5.f478b == g.PLATFORM) {
                                hVar6 = this.f471d;
                            } else {
                                hVar6 = this.f470c;
                            }
                            this.f472e = hVar6;
                        }
                    } else {
                        iVar.f495f = dVar.f526c;
                        iVar.f492c = dVar4.f477a;
                        if (dVar4.f478b == g.PLATFORM) {
                            hVar = this.f471d;
                        } else {
                            hVar = this.f470c;
                        }
                        iVar.f491b = hVar;
                        if (dVar4.f478b == g.PLATFORM) {
                            hVar2 = this.f471d;
                        } else {
                            hVar2 = this.f470c;
                        }
                        this.f472e = hVar2;
                    }
                }
                return iVar;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                iVar.f497h = dVar.f527d;
                iVar.f496g = dVar.f529f;
                h hVar12 = this.f470c;
                if (hVar12 == null || !hVar12.a(dVar.f524a)) {
                    h hVar13 = this.f471d;
                    this.f472e = hVar13;
                    iVar.f491b = hVar13;
                } else {
                    h hVar14 = this.f470c;
                    this.f472e = hVar14;
                    iVar.f491b = hVar14;
                }
                return iVar;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                d dVar6 = (d) k.a.f503a.a(g.PLATFORM, iVar.f490a).get(dVar.f525b);
                if (dVar6 == null) {
                    return null;
                }
                iVar.f497h = dVar.f527d;
                iVar.f492c = dVar6.f477a;
                if (dVar6.f478b == g.PLATFORM) {
                    hVar7 = this.f471d;
                } else {
                    hVar7 = this.f470c;
                }
                iVar.f491b = hVar7;
                if (dVar6.f478b == g.PLATFORM) {
                    hVar8 = this.f471d;
                } else {
                    hVar8 = this.f470c;
                }
                this.f472e = hVar8;
                return iVar;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                if (this.f471d.a(iVar.f490a)) {
                    h hVar15 = this.f471d;
                    this.f472e = hVar15;
                    iVar.f491b = hVar15;
                } else if (this.f470c.a(iVar.f490a)) {
                    h hVar16 = this.f470c;
                    this.f472e = hVar16;
                    iVar.f491b = hVar16;
                }
                iVar.f493d = new j(dVar.f530g);
                if (dVar.f532i) {
                    iVar.f493d.f499b = f.END;
                } else {
                    iVar.f493d.f499b = f.BEGIN;
                }
                return iVar;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                if (this.f471d.a(iVar.f490a)) {
                    h hVar17 = this.f471d;
                    this.f472e = hVar17;
                    iVar.f491b = hVar17;
                } else if (this.f470c.a(iVar.f490a)) {
                    h hVar18 = this.f470c;
                    this.f472e = hVar18;
                    iVar.f491b = hVar18;
                }
                return iVar;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                if (this.f471d.a(iVar.f490a)) {
                    iVar.f494e = dVar.f531h;
                    h hVar19 = this.f471d;
                    this.f472e = hVar19;
                    iVar.f491b = hVar19;
                } else if (this.f470c.a(iVar.f490a)) {
                    h hVar20 = this.f470c;
                    this.f472e = hVar20;
                    iVar.f491b = hVar20;
                }
                return iVar;
            default:
                return null;
        }
    }
}
