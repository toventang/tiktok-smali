package com.ss.android.ugc.aweme.ecommerce.address.candinput.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.d;
import com.ss.android.ugc.aweme.ecommerce.address.dto.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private TextView f84294b;

    static {
        Covode.recordClassIndex(52558);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.ewj);
        l.b(findViewById, "");
        this.f84294b = (TextView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a
    public final void a(d dVar, int i2) {
        List<m> list;
        List<m> list2;
        m mVar;
        String str = null;
        if (dVar != null && (list = dVar.f84332b) != null && !list.isEmpty()) {
            TextView textView = this.f84294b;
            if (!(dVar == null || (list2 = dVar.f84332b) == null || (mVar = list2.get(0)) == null)) {
                str = mVar.f84348a;
            }
            textView.setText(str);
        }
    }
}
