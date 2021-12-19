package com.ss.android.ugc.aweme.j;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public class c extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public boolean f104785a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f104786b;

    static {
        Covode.recordClassIndex(67195);
    }

    public View a(int i2) {
        if (this.f104786b == null) {
            this.f104786b = new HashMap();
        }
        View view = (View) this.f104786b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104786b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void a() {
        HashMap hashMap = this.f104786b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f104785a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f104785a = false;
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f104785a = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f104785a = true;
    }
}
