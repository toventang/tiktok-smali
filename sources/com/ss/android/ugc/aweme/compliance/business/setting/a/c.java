package com.ss.android.ugc.aweme.compliance.business.setting.a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f77173a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(47720);
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            String[] stringArray = d.a().getResources().getStringArray(R.array.f159884h);
            l.b(stringArray, "");
            List j2 = i.j(stringArray);
            if (!b.a((Collection) j2)) {
                List<String> j3 = com.ss.android.ugc.aweme.compliance.common.b.j();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && (!j2.contains(tag) || j3.contains(tag))) {
                            childAt.setVisibility(8);
                        }
                    }
                }
            }
        }
    }
}
