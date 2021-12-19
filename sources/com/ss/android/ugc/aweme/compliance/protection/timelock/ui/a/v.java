package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;
import com.zhiliaoapp.musically.R;

public class v extends k {
    static {
        Covode.recordClassIndex(48406);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j
    public final void a(String str) {
        boolean z = this.f78045c;
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        n nVar = new n();
        nVar.setArguments(bundle);
        ((a) getActivity()).a(nVar);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        tuxTextView.a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.ejr);
        if (this.f78045c) {
            tuxTextView.setText(getString(R.string.gh9));
            textView.setVisibility(4);
            return;
        }
        if (d() == 0) {
            i2 = R.string.gh_;
        } else {
            i2 = R.string.gha;
        }
        textView.setText(getString(i2));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.uc, viewGroup, false);
    }
}
