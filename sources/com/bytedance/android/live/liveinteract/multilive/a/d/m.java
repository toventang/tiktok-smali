package com.bytedance.android.live.liveinteract.multilive.a.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public abstract class m extends a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f11552a;

    static {
        Covode.recordClassIndex(6250);
    }

    public void j() {
        HashMap hashMap = this.f11552a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }
}
