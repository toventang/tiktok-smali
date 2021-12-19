package com.ss.android.ugc.aweme.feed.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.main.j;

public abstract class z extends a {
    protected long s = -1;
    public String t;
    protected int u;
    public Fragment v;
    protected String w;
    public String y;

    static {
        Covode.recordClassIndex(60301);
    }

    public abstract boolean a(boolean z);

    public abstract void s();

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        y();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        b();
    }

    /* access modifiers changed from: protected */
    public final void z() {
        j jVar;
        if (getUserVisibleHint() && (getActivity() instanceof j) && (jVar = (j) getActivity()) != null) {
            jVar.setTabBackground(false);
        }
    }

    private void b() {
        if (getUserVisibleHint() && (getActivity() instanceof j) && this.s == -1 && ((j) getActivity()).isMainTabVisible()) {
            this.s = System.currentTimeMillis();
        }
    }

    public final void y() {
        if (getUserVisibleHint() && this.s != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.s;
            if (currentTimeMillis > 0) {
                if ("nearby".equals(this.t)) {
                    this.t = "homepage_fresh";
                }
                com.ss.android.b.a.a.a.a(new aa(this, currentTimeMillis));
            }
            this.s = -1;
        }
    }

    public void c(boolean z) {
        b();
    }

    public void d(boolean z) {
        y();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.u = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.t = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            this.w = arguments.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }
}
