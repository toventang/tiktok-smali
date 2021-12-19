package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;
import com.zhiliaoapp.musically.R;

public class l extends d {
    static {
        Covode.recordClassIndex(68436);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final void b(String str) {
        boolean z = this.f106961d;
        Bundle bundle = new Bundle();
        bundle.putString("password", str);
        bundle.putBoolean("from_change_pwd", z);
        g gVar = new g();
        gVar.setArguments(bundle);
        ((a) getActivity()).a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        tuxTextView.a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.ejr);
        if (this.f106961d) {
            tuxTextView.setText(getString(R.string.gh9));
            textView.setVisibility(4);
            return;
        }
        textView.setText(getString(R.string.gh_));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.acg, viewGroup, false);
    }
}
