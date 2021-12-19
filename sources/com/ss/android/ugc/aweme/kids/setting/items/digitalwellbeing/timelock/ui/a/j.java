package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.kids.setting.base.session.b;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.widget.TimeLockDesc;
import com.zhiliaoapp.musically.R;

public class j extends b {

    /* renamed from: d  reason: collision with root package name */
    private TimeLockDesc f106982d;

    /* renamed from: e  reason: collision with root package name */
    private TimeLockDesc f106983e;

    /* renamed from: j  reason: collision with root package name */
    private TimeLockDesc f106984j;

    /* renamed from: k  reason: collision with root package name */
    private int f106985k;

    static {
        Covode.recordClassIndex(68430);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.b
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106982d = (TimeLockDesc) view.findViewById(R.id.el7);
        this.f106983e = (TimeLockDesc) view.findViewById(R.id.el8);
        this.f106984j = (TimeLockDesc) view.findViewById(R.id.el6);
        int b2 = a.b();
        this.f106985k = b2;
        this.f106982d.setText(getString(R.string.ggj, Integer.valueOf(b2)));
        this.f106983e.setText(getString(R.string.bs4));
        this.f106944b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68431);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                j jVar = j.this;
                Fragment a2 = i.a(1);
                b.a().a("TimeLockEnterFragmentV2").a(a2).a(jVar, new com.ss.android.ugc.aweme.base.ui.session.b() {
                    /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(68432);
                    }

                    @Override // com.ss.android.ugc.aweme.base.ui.session.b
                    public final void a() {
                        String str;
                        Resources resources;
                        e activity = j.this.getActivity();
                        TeenageModeSetting teenageModeSetting = a.f106920a;
                        if (teenageModeSetting != null) {
                            teenageModeSetting.setTimeLockSelfInMin(0);
                        }
                        com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(d.a());
                        if (activity == null || (resources = activity.getResources()) == null) {
                            str = null;
                        } else {
                            str = resources.getString(R.string.ggw);
                        }
                        aVar.a(str).a();
                        if (activity != null) {
                            com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b.a(activity);
                            ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a) activity).a(i.a());
                        }
                        a.a(a.f106920a);
                    }
                });
                jVar.a(a2);
            }
        });
    }
}
