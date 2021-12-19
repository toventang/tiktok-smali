package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.ui.session.c;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class o extends k {

    /* renamed from: j  reason: collision with root package name */
    private a f78065j;

    /* renamed from: k  reason: collision with root package name */
    private int f78066k;

    static {
        Covode.recordClassIndex(48397);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k
    public final void a() {
        super.a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.f78065j;
        if (aVar != null) {
            aVar.f78000a = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k
    public final void b() {
        super.b();
        a(this.f78035a);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        com.ss.android.ugc.aweme.base.ui.session.a b2 = c.a().b("TimeLockEnterFragmentV2");
        if (b2 != null) {
            Boolean.valueOf(false);
            b2.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j
    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.f77963c = str;
        if (!TextUtils.isEmpty(str) && this.f78065j != null && getActivity() != null && this.f78047e != null) {
            e();
            int i2 = this.f78066k;
            if (i2 == 2) {
                this.f78065j.a(str);
            } else if (i2 == 1) {
                this.f78065j.b(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(d(), false, str, false, getActivity()));
            } else if (i2 == 0) {
                this.f78065j.b(com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.a(d(), true, str, false, getActivity()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        tuxTextView.a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.ejr);
        this.f78047e = (TuxStatusView) view.findViewById(R.id.e_o);
        int i3 = getArguments().getInt("type_close", 0);
        this.f78066k = i3;
        if (i3 == 1) {
            com.ss.android.ugc.aweme.base.utils.o.a(false, textView);
            if (d() == 0) {
                i2 = R.string.b7o;
            } else {
                i2 = R.string.b7n;
            }
            tuxTextView.setText(getString(i2));
        } else if (i3 == 2) {
            tuxTextView.setText(getString(R.string.ggy));
            textView.setText(getString(R.string.ggv));
        } else if (i3 == 0) {
            tuxTextView.setText(getString(R.string.cnh));
            textView.setText(getString(R.string.cng));
        }
        a aVar = new a();
        this.f78065j = aVar;
        aVar.a(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ub, viewGroup, false);
    }
}
