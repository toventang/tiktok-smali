package com.ss.android.ugc.aweme.logger;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WarmBootLogger$1 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f108998a;

    static {
        Covode.recordClassIndex(69795);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
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
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    WarmBootLogger$1(long j2) {
        this.f108998a = j2;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        long j2 = this.f108998a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feed_total", j2);
            a.a("warm_boot_feed_show_time", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
