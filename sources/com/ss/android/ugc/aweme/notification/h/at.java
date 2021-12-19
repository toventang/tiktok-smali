package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.d;
import h.f.b.l;
import java.util.List;

public final class at extends p {

    /* renamed from: a  reason: collision with root package name */
    private final d f113579a;

    static {
        Covode.recordClassIndex(73013);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113580a = new a();

        static {
            Covode.recordClassIndex(73014);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f.b(AnonymousClass1.f113581a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public at(d dVar) {
        super((View) dVar);
        l.d(dVar, "");
        this.f113579a = dVar;
        dVar.setEnterFrom("notification_page");
    }

    public final void a(List<? extends User> list, int i2) {
        this.f113579a.a(list, i2);
        this.f113579a.setOutClickListener(a.f113580a);
    }
}
