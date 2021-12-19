package com.ss.android.ugc.aweme.anchor.liveevent;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.b;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.ss.android.ugc.aweme.liveevent.j;
import com.ss.android.ugc.aweme.liveevent.l;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.m.p;
import j.a.a.f;

public final class LiveEventSelectionActivity extends AnchorBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    private l f66403a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f66404b;

    static {
        Covode.recordClassIndex(40797);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f66404b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f66404b == null) {
            this.f66404b = new SparseArray();
        }
        View view = (View) this.f66404b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f66404b.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void f() {
        n a2 = getSupportFragmentManager().a();
        h.f.b.l.b(a2, "");
        if (this.f66403a == null) {
            this.f66403a = new l();
        }
        l lVar = this.f66403a;
        if (lVar != null) {
            a2.a(R.id.b91, lVar);
            a2.c();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void onStop() {
        a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bl, com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void a(j jVar) {
        Iterable iterable;
        l lVar = this.f66403a;
        if (!(lVar == null || jVar == null)) {
            lVar.f108698e = jVar;
            TuxTextView tuxTextView = (TuxTextView) lVar.a(R.id.yb);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setClickable(true);
            TuxTextView tuxTextView2 = (TuxTextView) lVar.a(R.id.yb);
            h.f.b.l.b(tuxTextView2, "");
            Context context = lVar.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            tuxTextView2.setBackground(new ColorDrawable(b.c(context, R.color.bh)));
            TuxTextView tuxTextView3 = (TuxTextView) lVar.a(R.id.yb);
            Context context2 = lVar.getContext();
            if (context2 == null) {
                h.f.b.l.b();
            }
            tuxTextView3.setTextColor(b.c(context2, R.color.a9));
            f fVar = lVar.f108699f;
            if (fVar == null || (iterable = fVar.f158845b) == null) {
                iterable = z.INSTANCE;
            }
            for (Object obj : iterable) {
                if ((obj instanceof j) && (!h.f.b.l.a(obj, jVar))) {
                    j jVar2 = (j) obj;
                    if (!p.a(jVar2.f108687a, jVar.f108687a, true)) {
                        jVar2.f108690d = false;
                    }
                }
            }
            f fVar2 = lVar.f108699f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
        }
    }
}
