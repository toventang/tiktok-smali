package com.ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.experiment.az;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class NotificationTab extends TabFragmentNode {

    /* renamed from: b  reason: collision with root package name */
    public final Context f113927b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f113928c;

    /* renamed from: d  reason: collision with root package name */
    private final h f113929d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(73256);
    }

    private final ar b() {
        return (ar) this.f113929d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return "NOTIFICATION";
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        return "notification_page";
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    static final class a extends m implements h.f.a.a<ar> {
        final /* synthetic */ NotificationTab this$0;

        static {
            Covode.recordClassIndex(73257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NotificationTab notificationTab) {
            super(0);
            this.this$0 = notificationTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            return h.a(this.this$0.f113927b);
        }
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return HomePageUIFrameServiceImpl.e().b("NOTIFICATION");
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Intent intent;
        Context context = this.f113927b;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return a(intent);
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void h() {
        if (this.f113928c == null) {
            this.f113928c = new a(this.f113927b);
        }
        View.OnClickListener onClickListener = this.f113928c;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public NotificationTab(Context context) {
        l.d(context, "");
        this.f113927b = context;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        if (!az.a()) {
            return bzVar.a(b());
        }
        View d2 = HomePageUIFrameServiceImpl.e().d();
        if (d2 == null) {
            return bzVar.a(b());
        }
        return d2;
    }
}
