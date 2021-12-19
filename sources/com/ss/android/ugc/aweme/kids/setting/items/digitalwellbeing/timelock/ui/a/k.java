package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.b;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

public class k extends a {

    /* renamed from: a  reason: collision with root package name */
    TextView f106988a;

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f106989b;

    static {
        Covode.recordClassIndex(68433);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(4327);
        super.onViewCreated(view, bundle);
        this.f106988a = (TextView) view.findViewById(R.id.title);
        this.f106989b = (ViewGroup) view.findViewById(R.id.ad7);
        view.findViewById(R.id.qb).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68434);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                k.this.getActivity().onBackPressed();
            }
        });
        final t<e.a> tVar = ((TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class)).f107004a;
        this.f106988a.setText(getString(R.string.ggh));
        Iterator<e.a> it = e.a.f106972a.iterator();
        while (it.hasNext()) {
            final e.a next = it.next();
            b bVar = new b(getContext());
            boolean z = false;
            bVar.setStartText(getString(R.string.gh2, Integer.valueOf(next.f106973b)));
            bVar.setOnSettingItemClickListener(new b.a() {
                /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.k.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(68435);
                }

                @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.b.a
                public final boolean a() {
                    tVar.setValue(next);
                    return false;
                }
            });
            if (tVar.getValue().f106973b == next.f106973b) {
                z = true;
            }
            bVar.setChecked(z);
            bVar.setRippleColor(androidx.core.content.b.c(getContext(), R.color.f159926j));
            bVar.setRippleDelayClick(true);
            bVar.setRippleOverlay(true);
            bVar.setRippleHover(true);
            ViewGroup viewGroup = this.f106989b;
            viewGroup.addView(bVar, viewGroup.getChildCount());
        }
        MethodCollector.o(4327);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ack, viewGroup, false);
    }
}
