package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a;
import com.zhiliaoapp.musically.R;

public final class g extends d {

    /* renamed from: k  reason: collision with root package name */
    ViewGroup f106977k;

    /* renamed from: l  reason: collision with root package name */
    ViewGroup f106978l;

    /* renamed from: m  reason: collision with root package name */
    TuxTextView f106979m;
    private String n;

    static {
        Covode.recordClassIndex(68427);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final int c() {
        return R.string.ggu;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d
    public final void b() {
        super.b();
        a.a(getActivity(), this.f106961d);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final void b(String str) {
        if (!this.n.equals(str)) {
            new b(this).e(R.string.ggt).b();
            return;
        }
        a(this.f106949a);
        boolean z = this.f106961d;
        if (this.f106962e != null && getActivity() != null) {
            d();
            this.f106962e.b(a.a(true, str, z, getActivity()));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.d, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n = getArguments().getString("password");
        this.f106977k = (ViewGroup) view.findViewById(R.id.dqe);
        this.f106978l = (ViewGroup) view.findViewById(R.id.emo);
        this.f106977k.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        this.f106978l.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        this.f106979m = tuxTextView;
        tuxTextView.a(28.0f);
        this.f106979m.setText(R.string.aso);
        this.f106963j = (TuxStatusView) view.findViewById(R.id.e_o);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ach, viewGroup, false);
    }
}
