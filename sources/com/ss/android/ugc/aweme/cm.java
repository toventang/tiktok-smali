package com.ss.android.ugc.aweme;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.es;
import com.ss.android.ugc.aweme.journey.s;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.newuser.NewUserImpl;
import f.a.b.b;

public class cm extends a {

    /* renamed from: a  reason: collision with root package name */
    protected int f71187a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f71188b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f71189c;

    /* renamed from: d  reason: collision with root package name */
    b f71190d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f71191e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71192f;

    static {
        Covode.recordClassIndex(43815);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        if (this.f71187a > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        a.b.f109011a.b("cold_boot_new_user_launch_focus_to_finish", false);
        Log.getStackTraceString(new RuntimeException("NewUserLaunchActivity finish:"));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        super.onPause();
        if (!d() || isFinishing()) {
            com.ss.android.ugc.aweme.logger.a aVar = a.b.f109011a;
            long uptimeMillis = SystemClock.uptimeMillis();
            aVar.f109000a.put("feed_total", Long.valueOf(uptimeMillis));
            aVar.f109001b.put("feed_total", Long.valueOf(uptimeMillis));
        }
    }

    private void a(boolean z) {
        if (TextUtils.isEmpty(com.bytedance.ies.ugc.statisticlogger.a.a())) {
            this.f71190d = com.bytedance.ies.ugc.statisticlogger.a.d().a(cn.f71197a).b(1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new co(this, z), cp.f78239a);
        } else {
            new f.b().b(cq.f78276a.d()).a();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        a.b.f109011a.b("cold_boot_new_user_journey_resume_to_focus_changed", false);
        super.onWindowFocusChanged(z);
        a.b.f109011a.f109002c = false;
        a.b.f109011a.f109006g = false;
        a.b.f109011a.f109004e = true;
        if (z && !a.b.f109011a.b("app_start_to_main_focus")) {
            a.b.f109011a.b("app_start_to_main_focus", true);
            a.b.f109011a.a("cold_boot_new_user_launch_focus_to_finish", false);
        }
        if (!this.f71192f && z && es.a()) {
            NewUserImpl.b().a();
            this.f71192f = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Boolean bool) {
        if (this.f71187a == 2) {
            Intent intent = getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(this, cq.f78276a.f());
            intent.setFlags(335544320);
            intent.putExtra("from_new_user_journey", true);
            intent.putExtra("reorder_new_journey_front", false);
            Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
            a(this, intent);
            s.f104910a = true;
        } else if (bool.booleanValue()) {
            Intent intent2 = getIntent();
            if (intent2 == null) {
                intent2 = new Intent();
            }
            intent2.setClass(this, cq.f78276a.f());
            intent2.setFlags(335544320);
            a(this, intent2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cm.onCreate(android.os.Bundle):void");
    }

    private static void a(cm cmVar, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, cmVar);
        cmVar.startActivity(intent);
    }
}
