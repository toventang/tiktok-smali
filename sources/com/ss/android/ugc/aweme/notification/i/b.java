package com.ss.android.ugc.aweme.notification.i;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.aweme.notice.repo.list.bean.f;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends i.a implements com.ss.android.ugc.aweme.notification.adapter.i, org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113747a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f113748b = com.ss.android.ugc.aweme.notification.b.a.a(new d(this));

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.notification.view.c f113749d;

    /* renamed from: e  reason: collision with root package name */
    private final List<f> f113750e = com.ss.android.ugc.aweme.notification.utils.d.a();

    static {
        Covode.recordClassIndex(73123);
    }

    public final NotificationVM b() {
        return (NotificationVM) this.f113748b.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(142, new g(b.class, "onNotificationIndicatorEvent", m.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73124);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void c() {
        cg.a(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void f() {
        cg.b(this);
    }

    static final class d extends h.f.b.m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(73127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.j());
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void d() {
        if (j().ab_()) {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void e() {
        if (j().ab_()) {
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f113752a;

        static {
            Covode.recordClassIndex(73126);
        }

        c(b bVar) {
            this.f113752a = bVar;
        }

        public final void onDismiss() {
            i j2 = this.f113752a.j();
            Objects.requireNonNull(j2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.NotificationFragment");
            ((com.ss.android.ugc.aweme.notification.c) j2).m();
            this.f113752a.g();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f113752a.c(R.id.bx0), "rotation", 180.0f, 0.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a() {
        Intent intent;
        e activity = j().getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("is_from_push", false) && b().a() != a.b.a()) {
            com.ss.android.ugc.aweme.notification.view.c cVar = this.f113749d;
            if (cVar != null) {
                cVar.a();
            }
            a(this.f113750e.get(0));
        }
    }

    public final void g() {
        View c2 = c(R.id.c25);
        if (com.ss.android.ugc.aweme.inbox.a.a.d()) {
            c2.setVisibility(8);
            return;
        }
        if (b().a() != a.b.a()) {
            int a2 = com.ss.android.ugc.aweme.notice.api.b.a(a.b.a());
            int a3 = com.ss.android.ugc.aweme.notice.api.b.a(b().a());
            if (a2 > 0 && a2 > a3) {
                c2.setVisibility(0);
                return;
            }
        }
        c2.setVisibility(8);
    }

    public final void h() {
        if (j().ab_()) {
            com.ss.android.ugc.aweme.notification.view.c cVar = this.f113749d;
            if (cVar == null) {
                Context context = j().getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                cVar = new com.ss.android.ugc.aweme.notification.view.c(context, this);
                if (MSAdaptionService.c().c((Context) j().getActivity())) {
                    cVar.setWidth(com.ss.android.ugc.aweme.base.utils.i.c(j().getActivity()));
                }
                cVar.a(this.f113750e);
                cVar.setOnDismissListener(new c(this));
                this.f113749d = cVar;
            }
            cVar.showAsDropDown(c(R.id.dp_));
            c(R.id.fem).setVisibility(0);
            c(R.id.c25).setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c(R.id.bx0), "rotation", 0.0f, 180.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC2912b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f113751a;

        static {
            Covode.recordClassIndex(73125);
        }

        View$OnClickListenerC2912b(b bVar) {
            this.f113751a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113751a.h();
            com.ss.android.ugc.aweme.notification.utils.e.b(this.f113751a.b().b());
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(m mVar) {
        com.ss.android.ugc.aweme.notification.view.c cVar;
        l.d(mVar, "");
        if (j().ab_() && (cVar = this.f113749d) != null) {
            cVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.adapter.i
    public final void a(f fVar) {
        int i2;
        l.d(fVar, "");
        b().a(fVar);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.f08);
        Context context = j().getContext();
        if (context == null) {
            l.b();
        }
        if (fVar.f112856a == a.b.a()) {
            i2 = R.string.djs;
        } else {
            i2 = fVar.f112857b;
        }
        tuxTextView.setText(context.getString(i2));
        com.ss.android.ugc.aweme.notification.view.c cVar = this.f113749d;
        if (cVar != null) {
            cVar.dismiss();
        }
        com.ss.android.ugc.aweme.notification.utils.e.a(b().b());
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
            View c2 = c(R.id.c93);
            com.ss.android.ugc.aweme.notification.g.a.a(c2);
            c2.setOnClickListener(new View$OnClickListenerC2912b(this));
            c(R.id.bx0).setVisibility(0);
        }
    }
}
