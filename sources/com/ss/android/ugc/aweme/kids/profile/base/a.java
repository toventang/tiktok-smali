package com.ss.android.ugc.aweme.kids.profile.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.c;
import java.util.HashMap;

public class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f106763a;

    /* renamed from: d  reason: collision with root package name */
    public c f106764d;

    static {
        Covode.recordClassIndex(68246);
    }

    public View a(int i2) {
        if (this.f106763a == null) {
            this.f106763a = new HashMap();
        }
        View view = (View) this.f106763a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f106763a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void b() {
        HashMap hashMap = this.f106763a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }
}
