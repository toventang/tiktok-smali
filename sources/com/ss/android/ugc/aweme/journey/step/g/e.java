package com.ss.android.ugc.aweme.journey.step.g;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.cq;
import com.ss.android.ugc.aweme.journey.s;
import h.f.b.l;

public abstract class e extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f105030a;

    /* renamed from: j  reason: collision with root package name */
    public long f105031j = System.currentTimeMillis();

    /* renamed from: k  reason: collision with root package name */
    public boolean f105032k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f105033l = new Handler();

    /* renamed from: m  reason: collision with root package name */
    public DmtStatusView f105034m;
    public ViewStub n;

    static {
        Covode.recordClassIndex(67346);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    public View a(int i2) {
        if (this.f105030a == null) {
            this.f105030a = new SparseArray();
        }
        View view = (View) this.f105030a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f105030a.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public abstract ViewStub g();

    public void h() {
        SparseArray sparseArray = this.f105030a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f105035a;

        static {
            Covode.recordClassIndex(67347);
        }

        a(e eVar) {
            this.f105035a = eVar;
        }

        public final void run() {
            Intent intent;
            Intent intent2;
            Bundle arguments = this.f105035a.getArguments();
            if (arguments != null && arguments.getInt("extra_optimize_option", 0) == 2 && !arguments.getBoolean("extra_is_saveinstance", false) && !s.f104910a) {
                s.f104910a = true;
                androidx.fragment.app.e activity = this.f105035a.getActivity();
                if (activity == null || (intent2 = activity.getIntent()) == null) {
                    intent = null;
                } else {
                    androidx.fragment.app.e activity2 = this.f105035a.getActivity();
                    if (activity2 == null) {
                        l.b();
                    }
                    intent = intent2.setClassName(activity2, cq.f78276a.f().getName());
                    if (intent != null) {
                        Intent flags = intent.setFlags(268435456);
                        if (flags != null) {
                            flags.addFlags(67108864);
                        }
                        intent.putExtra("reorder_new_journey_front", true);
                        intent.putExtra("from_new_user_journey", true);
                    }
                }
                androidx.fragment.app.e activity3 = this.f105035a.getActivity();
                if (activity3 != null) {
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, activity3);
                    activity3.startActivity(intent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        DmtStatusView dmtStatusView;
        View view;
        if (this.n == null && getContext() != null) {
            ViewStub g2 = g();
            this.n = g2;
            DmtStatusView dmtStatusView2 = null;
            if (g2 != null) {
                view = g2.inflate();
            } else {
                view = null;
            }
            if (view instanceof DmtStatusView) {
                dmtStatusView2 = view;
            }
            DmtStatusView dmtStatusView3 = dmtStatusView2;
            this.f105034m = dmtStatusView3;
            if (dmtStatusView3 != null) {
                dmtStatusView3.setBuilder(DmtStatusView.a.a(getContext()));
            }
        }
        DmtStatusView dmtStatusView4 = this.f105034m;
        if ((dmtStatusView4 == null || !dmtStatusView4.j()) && (dmtStatusView = this.f105034m) != null) {
            dmtStatusView.f();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f105031j = System.currentTimeMillis();
    }
}
