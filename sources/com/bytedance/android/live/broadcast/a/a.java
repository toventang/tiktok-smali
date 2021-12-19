package com.bytedance.android.live.broadcast.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public abstract class a extends v {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f7458a;

    static {
        Covode.recordClassIndex(3644);
    }

    @Override // com.bytedance.android.livesdk.v
    public void a() {
        HashMap hashMap = this.f7458a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public View a_(int i2) {
        if (this.f7458a == null) {
            this.f7458a = new HashMap();
        }
        View view = (View) this.f7458a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f7458a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }
}
