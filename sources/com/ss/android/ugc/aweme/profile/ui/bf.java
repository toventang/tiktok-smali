package com.ss.android.ugc.aweme.profile.ui;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class bf extends d {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f116930a;

    /* renamed from: e  reason: collision with root package name */
    public be f116931e;

    static {
        Covode.recordClassIndex(75515);
    }

    public View a(int i2) {
        if (this.f116930a == null) {
            this.f116930a = new SparseArray();
        }
        View view = (View) this.f116930a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f116930a.put(i2, findViewById);
        return findViewById;
    }

    public void cc_() {
        SparseArray sparseArray = this.f116930a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        cc_();
    }

    public final void a(be beVar) {
        l.d(beVar, "");
        this.f116931e = beVar;
    }

    @Override // androidx.fragment.app.d
    public void show(i iVar, String str) {
        l.d(iVar, "");
        try {
            super.show(iVar, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
