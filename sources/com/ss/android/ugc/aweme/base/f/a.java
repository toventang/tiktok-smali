package com.ss.android.ugc.aweme.base.f;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import org.greenrobot.eventbus.EventBus;

public abstract class a extends com.ss.android.ugc.b.a.a.a implements c {
    public boolean x;

    static {
        Covode.recordClassIndex(41968);
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public Analysis F() {
        return null;
    }

    public boolean H() {
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a
    public SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        return new SparseArray<>();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus a2 = EventBus.a();
        if (H() && a2.a(this)) {
            a2.b(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "current page：" + getClass().getSimpleName());
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus a2 = EventBus.a();
        if (!a2.a(this) && H()) {
            EventBus.a(a2, this);
        }
    }
}
