package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a;
import com.zhiliaoapp.musically.R;

public final class n extends k {

    /* renamed from: j  reason: collision with root package name */
    ViewGroup f78061j;

    /* renamed from: k  reason: collision with root package name */
    ViewGroup f78062k;

    /* renamed from: l  reason: collision with root package name */
    TuxTextView f78063l;

    /* renamed from: m  reason: collision with root package name */
    private String f78064m;

    static {
        Covode.recordClassIndex(48396);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j
    public final int c() {
        return R.string.ggu;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.g, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k
    public final void b() {
        super.b();
        a.a(getActivity(), d(), this.f78045c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j
    public final void a(String str) {
        if (!this.f78064m.equals(str)) {
            new b(this).e(R.string.ggt).b();
            return;
        }
        a(this.f78035a);
        if (this.f78046d != null && getActivity() != null) {
            e();
            this.f78046d.b(a.a(d(), true, str, this.f78045c, getActivity()));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.j, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.k, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78064m = getArguments().getString("password");
        this.f78061j = (ViewGroup) view.findViewById(R.id.dqe);
        this.f78062k = (ViewGroup) view.findViewById(R.id.emo);
        this.f78061j.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        this.f78062k.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ejs);
        this.f78063l = tuxTextView;
        tuxTextView.a(28.0f);
        this.f78063l.setText(R.string.aso);
        this.f78047e = (TuxStatusView) view.findViewById(R.id.e_o);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ud, viewGroup, false);
    }
}
