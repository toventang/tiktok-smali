package com.ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.j.b;
import java.util.HashMap;

public abstract class x extends b {

    /* renamed from: b  reason: collision with root package name */
    private HashMap f139954b;

    static {
        Covode.recordClassIndex(91461);
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c
    public View a(int i2) {
        if (this.f139954b == null) {
            this.f139954b = new HashMap();
        }
        View view = (View) this.f139954b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f139954b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c
    public void a() {
        HashMap hashMap = this.f139954b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void b();

    @Override // com.ss.android.ugc.aweme.j.b, com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }
}
