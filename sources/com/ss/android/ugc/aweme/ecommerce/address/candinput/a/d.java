package com.ss.android.ugc.aweme.ecommerce.address.candinput.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.m;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    private TextView f84295b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f84296c;

    static {
        Covode.recordClassIndex(52559);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.ewk);
        l.b(findViewById, "");
        this.f84295b = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ewl);
        l.b(findViewById2, "");
        this.f84296c = (TextView) findViewById2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a
    public final void a(com.ss.android.ugc.aweme.ecommerce.address.dto.d dVar, int i2) {
        int i3;
        String str;
        List<m> list;
        m mVar;
        List<m> list2;
        m mVar2;
        List<m> list3;
        boolean z = false;
        if (dVar == null || (list3 = dVar.f84332b) == null) {
            i3 = 0;
        } else {
            i3 = list3.size();
        }
        if (i3 > 1) {
            TextView textView = this.f84295b;
            String str2 = null;
            if (dVar == null || (list2 = dVar.f84332b) == null || (mVar2 = list2.get(0)) == null) {
                str = null;
            } else {
                str = mVar2.f84348a;
            }
            textView.setText(str);
            TextView textView2 = this.f84296c;
            if (!(dVar == null || (list = dVar.f84332b) == null || (mVar = list.get(1)) == null)) {
                str2 = mVar.f84348a;
            }
            textView2.setText(str2);
        }
        View view = this.itemView;
        l.b(view, "");
        if (getLayoutPosition() != i2 - 1) {
            z = true;
        }
        a.C2089a.a(view, z);
    }
}
