package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class MobLaunchEventTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private boolean f108017a;

    /* renamed from: b  reason: collision with root package name */
    private long f108018b;

    static {
        Covode.recordClassIndex(69260);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String str;
        a.a("MobLaunchEventTask");
        String str2 = "first_launch_time";
        if (this.f108017a) {
            str = str2;
        } else {
            str = "launch_time";
        }
        n.a("aweme_app_performance", str, (float) this.f108018b);
        MobClick obtain = MobClick.obtain();
        if (!this.f108017a) {
            str2 = "launch_time";
        }
        r.onEvent(obtain.setEventName(str2).setLabelName("perf_monitor").setExtValueLong(this.f108018b));
    }

    public MobLaunchEventTask(boolean z, long j2) {
        this.f108017a = z;
        this.f108018b = j2;
    }
}
