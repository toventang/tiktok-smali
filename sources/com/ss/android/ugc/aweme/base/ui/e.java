package com.ss.android.ugc.aweme.base.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import java.util.HashMap;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f68364a;

    static {
        Covode.recordClassIndex(42092);
    }

    public View a(int i2) {
        if (this.f68364a == null) {
            this.f68364a = new HashMap();
        }
        View view = (View) this.f68364a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f68364a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void e() {
        HashMap hashMap = this.f68364a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }
}
