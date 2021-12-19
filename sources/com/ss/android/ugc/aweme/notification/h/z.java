package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class z extends p {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f113745a;

    static {
        Covode.recordClassIndex(73120);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f113745a.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.f9f);
        l.b(findViewById, "");
        this.f113745a = (TextView) findViewById;
    }

    public final void a(i iVar) {
        l.d(iVar, "");
        int i2 = iVar.timeLineType;
        if (i2 == 0) {
            this.f113745a.setText(R.string.dle);
        } else if (i2 == 1) {
            this.f113745a.setText(R.string.dlh);
        } else if (i2 == 2) {
            this.f113745a.setText(R.string.dli);
        } else if (i2 == 3) {
            this.f113745a.setText(R.string.dlg);
        } else if (i2 == 4) {
            this.f113745a.setText(R.string.dlf);
        } else if (i2 == 5) {
            this.f113745a.setText(R.string.dld);
        }
    }
}
