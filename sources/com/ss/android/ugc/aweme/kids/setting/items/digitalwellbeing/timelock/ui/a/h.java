package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.kids.setting.base.session.b;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class h extends d {

    /* renamed from: k  reason: collision with root package name */
    private a f106980k;

    /* renamed from: l  reason: collision with root package name */
    private int f106981l;

    static {
        Covode.recordClassIndex(68428);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d
    public final void a() {
        super.a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.f106980k;
        if (aVar != null) {
            aVar.f106924a = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d
    public final void b() {
        super.b();
        Boolean.valueOf(false);
        a(this.f106949a);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
        com.ss.android.ugc.aweme.kids.setting.base.session.a b2 = b.a().b("TimeLockEnterFragmentV2");
        if (b2 != null) {
            b2.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final void b(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.f106921b = str;
        if (!TextUtils.isEmpty(str) && this.f106980k != null && getActivity() != null && this.f106963j != null) {
            d();
            int i2 = this.f106981l;
            if (i2 == 2) {
                this.f106980k.a(str);
            } else if (i2 == 1) {
                this.f106980k.b(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(false, str, false, getActivity()));
            } else if (i2 == 0) {
                this.f106980k.b(com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(true, str, false, getActivity()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        tuxTextView.a(28.0f);
        TextView textView = (TextView) view.findViewById(R.id.ejr);
        this.f106963j = (TuxStatusView) view.findViewById(R.id.e_o);
        int i2 = getArguments().getInt("type_close", 0);
        this.f106981l = i2;
        if (i2 == 1) {
            o.a(false, textView);
            tuxTextView.setText(getString(R.string.b7o));
        } else if (i2 == 2) {
            tuxTextView.setText(getString(R.string.ggy));
            textView.setText(getString(R.string.ggv));
        } else if (i2 == 0) {
            tuxTextView.setText(getString(R.string.cnh));
            textView.setText(getString(R.string.cng));
        }
        a aVar = new a();
        this.f106980k = aVar;
        aVar.a(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.acf, viewGroup, false);
    }
}
