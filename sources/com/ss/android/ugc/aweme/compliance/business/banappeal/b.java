package com.ss.android.ugc.aweme.compliance.business.banappeal;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.ss.android.ugc.aweme.base.d.e;
import com.ss.android.ugc.aweme.compliance.api.c.c;
import com.ss.android.ugc.aweme.compliance.api.c.d;
import com.ss.android.ugc.aweme.main.k;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class b implements c, i, j {

    /* renamed from: a  reason: collision with root package name */
    d f76752a;

    /* renamed from: b  reason: collision with root package name */
    boolean f76753b;

    /* renamed from: c  reason: collision with root package name */
    AtomicBoolean f76754c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private a f76755d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f76756e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f76757f = true;

    static {
        Covode.recordClassIndex(47448);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final void c() {
        this.f76753b = false;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(356, new g(b.class, "onUserBannedEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final void d() {
        EventBus.a().b(this);
    }

    private static void e() {
        com.ss.android.ugc.aweme.account.b.b().logout("user_banned", "user_banned");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final void a() {
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.cw.g.a().execute(e.f76801a);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final void b() {
        this.f76753b = true;
        d dVar = this.f76752a;
        if (dVar != null && dVar.a() && !((k) this.f76755d).isADShowing()) {
            this.f76752a.d();
        }
        d dVar2 = this.f76752a;
        if (dVar2 != null && dVar2.c() && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            e();
        }
    }

    public b(Activity activity) {
        this.f76755d = (a) activity;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final void a(boolean z) {
        this.f76756e = false;
        if (z) {
            com.ss.android.ugc.aweme.compliance.api.a.h().b();
            if (this.f76757f) {
                this.f76757f = false;
                this.f76756e = true;
            }
        }
        if (!this.f76756e) {
            com.ss.android.ugc.aweme.compliance.api.a.g().a(this.f76755d, c.f76779a);
        }
    }

    @r(a = ThreadMode.MAIN)
    public void onUserBannedEvent(e eVar) {
        d dVar = this.f76752a;
        if ((dVar == null || !dVar.e()) && this.f76753b && !((k) this.f76755d).isADShowing() && this.f76754c.compareAndSet(false, true)) {
            try {
                com.ss.android.ugc.aweme.compliance.api.a.c().a(com.ss.android.ugc.aweme.account.b.g().getCurUserId(), new d(this, this.f76755d));
            } catch (Exception unused) {
                this.f76754c.set(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.c
    public final boolean a(int i2, int i3, Intent intent) {
        if (i3 == 10) {
            if (intent.getIntExtra("result", -1) == 0) {
                new com.bytedance.tux.g.b(this.f76755d).e(R.string.et_).b();
            }
            return true;
        } else if (i2 != 17) {
            return false;
        } else {
            e();
            return true;
        }
    }
}
