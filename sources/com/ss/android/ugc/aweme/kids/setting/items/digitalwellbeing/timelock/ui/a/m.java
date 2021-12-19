package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.kids.setting.base.session.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b;
import com.zhiliaoapp.musically.R;

public class m extends f {

    /* renamed from: d  reason: collision with root package name */
    TextView f106994d;

    /* renamed from: e  reason: collision with root package name */
    TuxTextView f106995e;

    /* renamed from: j  reason: collision with root package name */
    private String f106996j;

    static {
        Covode.recordClassIndex(68437);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.f, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public final void b() {
        super.b();
        d();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.f
    public final void d() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        a(this.f106949a);
        a<Boolean> a2 = b.a();
        if (a2 != null) {
            Boolean.valueOf(true);
            a2.a();
        } else if (!TextUtils.equals(this.f106996j, "logout") && !TextUtils.equals(this.f106996j, "add_account") && !TextUtils.equals(this.f106996j, "switch_account")) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(getResources().getString(R.string.ghf)).a();
            ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a) com.ss.android.ugc.aweme.base.b.a.d.a(d.a(), com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a.class)).a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public final void b(String str) {
        c(str);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.f, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.c
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        a<Boolean> a2 = b.a();
        if (a2 != null) {
            TimeLockRuler.isContentFilterOn();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.f106996j = str;
        this.f106994d = (TextView) view.findViewById(R.id.fak);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fb7);
        this.f106995e = tuxTextView;
        tuxTextView.a(26.0f);
        if (a2 != null) {
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
            TextView textView = this.f106994d;
            if (!isContentFilterOn) {
                i2 = R.string.ghi;
            } else if (TextUtils.equals(this.f106996j, "add_account")) {
                i2 = R.string.p3;
            } else if (TextUtils.equals(this.f106996j, "switch_account")) {
                i2 = R.string.gb5;
            } else if (!com.ss.android.ugc.aweme.kids.setting.a.a.b()) {
                i2 = R.string.fnh;
            } else {
                i2 = R.string.ghh;
            }
            textView.setText(getString(i2));
            TuxTextView tuxTextView2 = this.f106995e;
            if (isContentFilterOn) {
                i3 = R.string.ghl;
            } else {
                i3 = R.string.ghm;
            }
            tuxTextView2.setText(getString(i3));
            ImageView imageView = (ImageView) view.findViewById(R.id.elb);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(68438);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (m.this.f106949a != null) {
                        m mVar = m.this;
                        mVar.a(mVar.f106949a);
                    }
                    if (m.this.getActivity() != null) {
                        m.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        this.f106994d.setText(getString(R.string.ghj, String.valueOf(TimeLockRuler.getLockTimeInMin())));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ace, viewGroup, false);
    }
}
