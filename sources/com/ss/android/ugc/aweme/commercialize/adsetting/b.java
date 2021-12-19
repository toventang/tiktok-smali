package com.ss.android.ugc.aweme.commercialize.adsetting;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.d;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public abstract class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f73682a;

    static {
        Covode.recordClassIndex(45335);
    }

    public View a(int i2) {
        if (this.f73682a == null) {
            this.f73682a = new HashMap();
        }
        View view = (View) this.f73682a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f73682a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void a() {
        HashMap hashMap = this.f73682a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.fg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return a.a(layoutInflater, R.layout.x0, viewGroup, false);
    }
}
