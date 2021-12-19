package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.uikit.a.d;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.notice.api.b;
import com.ss.android.ugc.aweme.notice.api.e.q;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class AwemeAppData extends e implements d.a, d.c {

    /* renamed from: f  reason: collision with root package name */
    public boolean f66477f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f66478g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66479h;

    static {
        Covode.recordClassIndex(40857);
    }

    class RedPointTask implements w {
        static {
            Covode.recordClassIndex(40859);
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

        private RedPointTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            boolean z;
            boolean z2;
            boolean z3;
            b.a(true, 4);
            if (com.ss.android.ugc.aweme.app.launch.a.b.a() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.a(4, "ws", "connectWsFromRedPointTask return cause experiment");
            } else if (com.ss.android.ugc.aweme.app.launch.a.a.f66822a) {
                com.ss.android.ugc.aweme.app.launch.a.a.f66822a = false;
                a.a(4, "ws", "connectWsFromRedPointTask return cause isFirstConnectWsFromRedPointTask");
            } else {
                if (com.ss.android.ugc.aweme.app.launch.a.b.a() == 2 || com.ss.android.ugc.aweme.app.launch.a.b.a() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_background", f.f34637l);
                jSONObject.put("experiment_group", com.ss.android.ugc.aweme.app.launch.a.b.a());
                if (com.ss.android.ugc.aweme.app.launch.a.b.a() == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    com.ss.android.ugc.aweme.app.launch.a.a.a(z2, "onresume_connect_force");
                    com.bytedance.apm.b.a("aweme_long_connection_on_resume", 1, jSONObject);
                    return;
                }
                q qVar = q.f112739f;
                l.b(qVar, "");
                if (!qVar.f112741e) {
                    com.ss.android.ugc.aweme.app.launch.a.a.a(z2, "onresume_connect_when_need");
                    com.bytedance.apm.b.a("aweme_long_connection_on_resume", 1, jSONObject);
                    return;
                }
                com.bytedance.apm.b.a("aweme_long_connection_on_resume", 0, jSONObject);
            }
        }

        /* synthetic */ RedPointTask(AwemeAppData awemeAppData, byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.d.a
    public final void b(Activity activity) {
        com.ss.android.newmedia.redbadge.b.a(activity).b();
        com.bytedance.ies.ugc.statisticlogger.e.b(activity);
    }

    @Override // com.bytedance.ies.uikit.a.d.a
    public final void a(Activity activity) {
        boolean z = activity instanceof MainActivity;
        boolean z2 = false;
        if (z) {
            if (com.ss.android.ugc.aweme.lego.d.b()) {
                g.b().execute(new Runnable() {
                    /* class com.ss.android.ugc.aweme.app.AwemeAppData.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(40858);
                    }

                    public final void run() {
                        new f.c().b((w) new RedPointTask(AwemeAppData.this, (byte) 0)).a();
                    }
                });
            } else {
                new f.c().b((w) new RedPointTask(this, (byte) 0)).a();
            }
        }
        com.bytedance.ies.ugc.statisticlogger.e.a(activity);
        this.f66477f = false;
        this.f66478g = false;
        this.f66479h = z;
        if (activity == null) {
            throw new NullPointerException("getIntent");
        }
        Intent intent = activity.getIntent();
        try {
            this.f66477f = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || !(data == null || data.getQueryParameter("gd_label") == null || !data.getQueryParameter("gd_label").startsWith("click_wap"))) {
                z2 = true;
            }
            this.f66478g = z2;
        } catch (Exception e2) {
            e2.getMessage();
        }
        if (!com.ss.android.ugc.aweme.lego.d.d() && !com.ss.android.ugc.aweme.request_combine.a.a.a()) {
            new f.b().b((r) new com.ss.android.ugc.aweme.requesttask.idle.e()).a();
        }
    }
}
