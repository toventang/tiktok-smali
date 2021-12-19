package com.ss.android.ugc.awemepushlib.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.List;

public final class CancelNotificationTask implements w {
    static {
        Covode.recordClassIndex(95150);
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
    public final boolean i() {
        if (!((Boolean) b.f107387d.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        f.g().d(new a(context));
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f145525a;

        static {
            Covode.recordClassIndex(95151);
        }

        a(Context context) {
            this.f145525a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!((Boolean) obj).booleanValue() && com.bytedance.ies.abmock.b.a().a(true, "cancel_other_push", 0) == 1) {
                PushService.createIPushApibyMonsterPlugin(false).clearAll(this.f145525a);
            }
        }
    }
}
