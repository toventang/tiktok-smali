package com.ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.c;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class LivePluginInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    volatile SharedPreferences f84176a;

    /* renamed from: b  reason: collision with root package name */
    volatile c f84177b;

    /* renamed from: c  reason: collision with root package name */
    volatile Context f84178c;

    /* renamed from: d  reason: collision with root package name */
    List<String> f84179d = Arrays.asList("df_live_byte_link", "df_live_twilio_link", "df_live_zego_link", "df_live_quic", "df_live_cmaf");

    static {
        Covode.recordClassIndex(52493);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("extra", jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            this.f84178c = applicationContext;
            e.a(new a(this));
        }
    }
}
