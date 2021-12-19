package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.notification.bean.i;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f113642a;

    /* renamed from: b  reason: collision with root package name */
    private final u<i> f113643b;

    static {
        Covode.recordClassIndex(73064);
    }

    public final TuxStatusView c() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void d() {
        super.d();
        BaseNotificationVM baseNotificationVM = this.f113487h;
        Objects.requireNonNull(baseNotificationVM, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        ((NotificationVM) baseNotificationVM).j().c().removeObserver(this.f113643b);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotificationVM baseNotificationVM = this.f113487h;
        Objects.requireNonNull(baseNotificationVM, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        NotificationVM notificationVM = (NotificationVM) baseNotificationVM;
        notificationVM.j().c().observe(this.f113642a, this.f113643b);
        c().setVisibility(0);
        c().a();
        if (!notificationVM.j().d()) {
            notificationVM.j().j();
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f113644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f113645b;

        static {
            Covode.recordClassIndex(73065);
        }

        a(j jVar, View view) {
            this.f113644a = jVar;
            this.f113645b = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == i.ERROR) {
                TuxStatusView c2 = this.f113644a.c();
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string = this.f113645b.getContext().getString(R.string.f16);
                l.b(string, "");
                c2.setStatus(cVar.a((CharSequence) string));
                View findViewById = this.f113644a.c().findViewById(R.id.eug);
                l.b(findViewById, "");
                findViewById.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        this.f113642a = fragment;
        this.f113643b = new a(this, view);
    }
}
