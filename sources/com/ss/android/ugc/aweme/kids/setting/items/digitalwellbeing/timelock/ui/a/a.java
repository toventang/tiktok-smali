package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.kids.setting.base.session.b;
import com.zhiliaoapp.musically.R;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a {

    /* renamed from: a  reason: collision with root package name */
    protected Button f106935a;

    /* renamed from: b  reason: collision with root package name */
    protected View f106936b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f106937c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a f106938d;

    /* renamed from: e  reason: collision with root package name */
    private TuxStatusView f106939e;

    static {
        Covode.recordClassIndex(68405);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public final void a() {
        d();
    }

    private void d() {
        TuxStatusView tuxStatusView = this.f106939e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.a.a
    public final void b() {
        d();
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(getActivity(), false);
    }

    /* access modifiers changed from: protected */
    public void c() {
        Fragment a2;
        if (!com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.c()) {
            a2 = i.a(false);
        } else {
            a2 = i.a(0);
            b.a().a("TimeLockEnterFragmentV2").a(a2).a(this, new com.ss.android.ugc.aweme.base.ui.session.b() {
                /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(68408);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.session.b
                public final void a() {
                    com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a(a.this.getActivity(), false);
                }
            });
        }
        ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a) getActivity()).a(a2);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106935a = (Button) view.findViewById(R.id.z0);
        this.f106937c = (TextView) view.findViewById(R.id.el2);
        View findViewById = view.findViewById(R.id.qb);
        this.f106936b = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68406);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                a.this.getActivity().onBackPressed();
            }
        });
        this.f106935a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(68407);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                a.this.c();
            }
        });
        this.f106939e = (TuxStatusView) view.findViewById(R.id.e_o);
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a aVar = new com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a();
        this.f106938d = aVar;
        aVar.a(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.aci, viewGroup, false);
    }
}
