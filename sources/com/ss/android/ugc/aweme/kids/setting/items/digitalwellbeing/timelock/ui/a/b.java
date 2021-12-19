package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.zhiliaoapp.musically.R;

public abstract class b extends a {

    /* renamed from: a  reason: collision with root package name */
    protected Button f106943a;

    /* renamed from: b  reason: collision with root package name */
    protected Button f106944b;

    /* renamed from: c  reason: collision with root package name */
    protected View f106945c;

    static {
        Covode.recordClassIndex(68409);
    }

    public final void a(Fragment fragment) {
        ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a) getActivity()).a(fragment);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106943a = (Button) view.findViewById(R.id.z0);
        View findViewById = view.findViewById(R.id.qb);
        this.f106945c = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68410);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                b.this.getActivity().onBackPressed();
            }
        });
        this.f106944b = (Button) view.findViewById(R.id.yz);
        this.f106943a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(68411);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Fragment a2 = i.a(2);
                com.ss.android.ugc.aweme.kids.setting.base.session.b.a().a("TimeLockEnterFragmentV2").a(a2).a(b.this, new com.ss.android.ugc.aweme.base.ui.session.b<Boolean>() {
                    /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.b.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68412);
                    }

                    @Override // com.ss.android.ugc.aweme.base.ui.session.b
                    public final /* bridge */ /* synthetic */ void a() {
                        b.this.a(i.a(true));
                    }
                });
                b.this.a(a2);
            }
        });
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.acj, viewGroup, false);
    }
}
