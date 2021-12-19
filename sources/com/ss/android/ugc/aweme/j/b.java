package com.ss.android.ugc.aweme.j;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private HashMap f104784b;

    static {
        Covode.recordClassIndex(67194);
    }

    @Override // com.ss.android.ugc.aweme.j.c
    public View a(int i2) {
        if (this.f104784b == null) {
            this.f104784b = new HashMap();
        }
        View view = (View) this.f104784b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f104784b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.j.c
    public void a() {
        HashMap hashMap = this.f104784b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }
}
