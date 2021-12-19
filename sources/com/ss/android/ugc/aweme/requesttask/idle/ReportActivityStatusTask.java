package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class ReportActivityStatusTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final String f120693a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f120694b;

    static {
        Covode.recordClassIndex(78626);
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
        return ae.SPARSE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        boolean z;
        String str = this.f120693a;
        int i2 = 1;
        if (this.f120694b != null) {
            z = true;
        } else {
            z = false;
        }
        i iVar = new i(str, z);
        try {
            a.b(4, iVar.f120711a, "The activity is recovered by the system or config change:" + iVar.f120712b);
            if (!iVar.f120712b) {
                i2 = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", iVar.f120711a);
            jSONObject.put("activity_status", new StringBuilder().append(iVar.f120712b).toString());
            b.a("activity_monitor", i2, jSONObject);
        } catch (Throwable th) {
            a.a(th);
        }
    }

    public ReportActivityStatusTask(String str, Bundle bundle) {
        l.d(str, "");
        this.f120693a = str;
        this.f120694b = bundle;
    }
}
