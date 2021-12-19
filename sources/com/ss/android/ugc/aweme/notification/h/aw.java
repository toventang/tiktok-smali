package com.ss.android.ugc.aweme.notification.h;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.friends.invite.c;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.inbox.q;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class aw extends p {

    /* renamed from: a  reason: collision with root package name */
    public r f113600a = r.TOP;

    /* renamed from: b  reason: collision with root package name */
    private final c f113601b;

    /* renamed from: c  reason: collision with root package name */
    private final h f113602c;

    static {
        Covode.recordClassIndex(73025);
    }

    private final NotificationCombineVM h() {
        return (NotificationCombineVM) this.f113602c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void d() {
        super.d();
    }

    static final class a extends m implements h.f.a.a<NotificationCombineVM> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(73028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.a.a(this.$fragment);
        }
    }

    public final void c() {
        i();
        this.f113601b.a();
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        if (!h().f114065f) {
            h().f114065f = true;
            e.b(this.f113601b.b(), this.f113600a);
        }
    }

    private final void i() {
        r t = h().t();
        if (this.f113600a != t) {
            this.f113600a = t;
            RemoteImageView remoteImageView = (RemoteImageView) a(R.id.cx6);
            l.b(remoteImageView, "");
            ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
            if (t == r.TOP) {
                View view = this.itemView;
                l.b(view, "");
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                i.a(view, (Integer) null, valueOf, (Integer) null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 10.0f, system2.getDisplayMetrics()))), false, 16);
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system4.getDisplayMetrics()));
            } else {
                View view2 = this.itemView;
                l.b(view2, "");
                Resources system5 = Resources.getSystem();
                l.a((Object) system5, "");
                Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system5.getDisplayMetrics())));
                Resources system6 = Resources.getSystem();
                l.a((Object) system6, "");
                i.a(view2, (Integer) null, valueOf2, (Integer) null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()))), false, 16);
                Resources system7 = Resources.getSystem();
                l.a((Object) system7, "");
                layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system7.getDisplayMetrics()));
                Resources system8 = Resources.getSystem();
                l.a((Object) system8, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 40.0f, system8.getDisplayMetrics()));
            }
            remoteImageView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aw(View view, Fragment fragment, DmtStatusView dmtStatusView) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        l.d(dmtStatusView, "");
        c a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.a(fragment);
        View a3 = a(R.id.cx6);
        l.b(a3, "");
        View a4 = a(R.id.cxm);
        l.b(a4, "");
        View a5 = a(R.id.cwx);
        l.b(a5, "");
        View a6 = a(R.id.cww);
        l.b(a6, "");
        a2.a(dmtStatusView, (RemoteImageView) a3, (TextView) a4, (TextView) a5, (TuxButton) a6);
        this.f113601b = a2;
        this.f113602c = h.i.a((h.f.a.a) new a(fragment));
        a2.a(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.notification.h.aw.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ aw f113603a;

            static {
                Covode.recordClassIndex(73026);
            }

            {
                this.f113603a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                q.THIRD_PLATFORM.markAction();
                if (this.f113603a.f113600a == r.BOTTOM) {
                    f.b(AnonymousClass1.f113604a);
                }
            }
        });
        a2.a("notification_page");
    }
}
