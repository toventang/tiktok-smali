package com.ss.android.ugc.aweme.discover.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.l.d;
import h.f.b.l;

public final class bl extends ay<Object> {
    private SparseArray o;

    static {
        Covode.recordClassIndex(51328);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ay, com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        x();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ay, com.ss.android.ugc.aweme.discover.ui.a
    public final void x() {
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        d.a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
