package com.bytedance.apm.k;

import android.os.Process;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private static IFdCheck f25092c;

    /* renamed from: a  reason: collision with root package name */
    private int f25093a = 800;

    /* renamed from: b  reason: collision with root package name */
    private long f25094b = 600000;

    static {
        Covode.recordClassIndex(14645);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final long c() {
        return this.f25094b;
    }

    public c() {
        this.p = "fd";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final void e() {
        super.e();
        if (System.currentTimeMillis() - com.bytedance.apm.c.i() > 1200000) {
            int i2 = 0;
            try {
                i2 = new File("/proc/" + Process.myPid() + "/fd").listFiles().length;
            } catch (Throwable unused) {
            }
            if (i2 == 0) {
                return;
            }
            if (i2 < this.f25093a) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fd_count", i2);
                    jSONObject.put("is_main_process", com.bytedance.apm.c.b());
                    jSONObject.put("process_name", com.bytedance.apm.c.a());
                    a(new f("fd", jSONObject));
                } catch (Exception unused2) {
                }
            } else {
                if (f25092c == null) {
                    f25092c = (IFdCheck) com.bytedance.news.common.service.manager.c.a(IFdCheck.class);
                }
                IFdCheck iFdCheck = f25092c;
                if (iFdCheck != null) {
                    try {
                        String a2 = h.a(iFdCheck.getFdList(), "\n");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("fd_count", i2);
                        jSONObject2.put("fd_detail", a2);
                        a(new f("fd", jSONObject2));
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.k.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        this.f25093a = jSONObject.optInt("fd_count_threshold", 800);
        this.f25094b = jSONObject.optLong("collect_interval", 10) * 60000;
    }
}
