package com.ss.android.ugc.aweme.bullet.business.a;

import android.content.Context;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.h;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f69260a;

    /* renamed from: b  reason: collision with root package name */
    public int f69261b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f69262c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69263d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69264e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f69265f;

    /* renamed from: g  reason: collision with root package name */
    public String f69266g;

    /* renamed from: h  reason: collision with root package name */
    public String f69267h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f69268i;

    static {
        Covode.recordClassIndex(42700);
    }

    private static l.a a(Context context) {
        if (j.f107224c != l.a.UNKNOWN && j.b() && !j.c()) {
            return j.f107224c;
        }
        l.a d2 = l.d(context);
        j.f107224c = d2;
        return d2;
    }

    public final void a(String str, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        long j3;
        if (this.f69260a != 0 && j2 > 0) {
            String str3 = "load";
            if (this.f69263d || !this.f69264e || this.f69265f) {
                str2 = str3;
            } else {
                if (b.a() != null) {
                    b.a().c();
                }
                str2 = "load_finish";
            }
            try {
                l.a a2 = a(h.f39857a);
                if (a2 != l.a.NONE) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("ac", l.a(a2));
                    if (this.f69265f) {
                        str3 = "load_fail";
                    } else {
                        long j4 = this.f69262c;
                        if (j4 > 0) {
                            str3 = str2;
                        }
                        if (j4 > 0) {
                            j3 = this.f69260a;
                        } else {
                            j4 = System.currentTimeMillis();
                            j3 = this.f69260a;
                        }
                        long j5 = j4 - j3;
                        if (a2 == l.a.WIFI) {
                            if (j5 < 1) {
                                return;
                            }
                        } else if (j5 < 1) {
                            return;
                        }
                        if (j5 > 0) {
                            jSONObject.put("duration", Math.min(j5, 90000L));
                        } else {
                            return;
                        }
                    }
                    if (str == null) {
                        str = this.f69266g;
                        if (str == null) {
                            return;
                        }
                    }
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("tag", "draw_ad");
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject2.put("next_url", str);
                    int i2 = this.f69261b;
                    if (i2 != -1) {
                        jSONObject2.put("preload_status", i2);
                    }
                    jSONObject2.put("container_type", "bullet");
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    if (!this.f69268i) {
                        this.f69268i = true;
                        r.onEvent(MobClick.obtain().setLabelName(str3).setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setJsonObject(jSONObject));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
