package com.ss.android.legoimpl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.component.b;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class ProcessExceptionTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final b f59619a;

    static {
        Covode.recordClassIndex(36809);
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

    public ProcessExceptionTask(b bVar) {
        l.d(bVar, "");
        this.f59619a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("process_monitor_content", this.f59619a.f107470a);
        jSONObject2.put("process_init_content", this.f59619a.f107471b);
        com.bytedance.apm.b.a("process_init_event", jSONObject2, jSONObject, (JSONObject) null);
    }
}
