package com.ss.android.ugc.aweme.ecommerce.common.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.b;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import h.f.b.l;

public class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f85732a;

    static {
        Covode.recordClassIndex(53614);
    }

    public View a(int i2) {
        if (this.f85732a == null) {
            this.f85732a = new SparseArray();
        }
        View view = (View) this.f85732a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85732a.put(i2, findViewById);
        return findViewById;
    }

    public void a() {
        SparseArray sparseArray = this.f85732a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public m e() {
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // androidx.fragment.app.d, com.google.android.material.bottomsheet.b, androidx.appcompat.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        d dVar = new d(context, getTheme());
        m e2 = e();
        if (e2 != null) {
            dVar.a(e2);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.d
    public void show(i iVar, String str) {
        l.d(iVar, "");
        if (!iVar.g() && !iVar.h()) {
            super.show(iVar, str);
        }
    }
}
