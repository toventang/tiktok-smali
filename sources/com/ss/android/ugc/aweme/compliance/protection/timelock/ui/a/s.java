package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.b;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

public class s extends a {

    /* renamed from: a  reason: collision with root package name */
    ViewGroup f78073a;

    /* renamed from: b  reason: collision with root package name */
    private ButtonTitleBar f78074b;

    static {
        Covode.recordClassIndex(48402);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(10881);
        super.onViewCreated(view, bundle);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) view.findViewById(R.id.emo);
        this.f78074b = buttonTitleBar;
        buttonTitleBar.setTitle(R.string.ggh);
        this.f78074b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.s.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48403);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                s.this.getActivity().onBackPressed();
            }
        });
        this.f78074b.a(true);
        this.f78073a = (ViewGroup) view.findViewById(R.id.ad7);
        t<l.a> tVar = ((TimeLockOptionViewModel) ae.a(getActivity(), (ad.b) null).a(TimeLockOptionViewModel.class)).f78093a;
        Iterator<l.a> it = l.a.f78056a.iterator();
        while (it.hasNext()) {
            l.a next = it.next();
            TuxTextCell tuxTextCell = new TuxTextCell(getContext());
            tuxTextCell.setTitle(getString(R.string.gh2, Integer.valueOf(next.f78057b)));
            tuxTextCell.setTag(Integer.valueOf(next.f78057b));
            tuxTextCell.setWithSeparator(true);
            tuxTextCell.setOnClickListener(new t(tVar, next));
            ViewGroup viewGroup = this.f78073a;
            viewGroup.addView(tuxTextCell, viewGroup.getChildCount());
        }
        Context context = getContext();
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(n.a(20.0d), n.a(20.0d)));
        imageView.setImageDrawable(b.a(context, 2131231825));
        c.f fVar = new c.f(context, null);
        fVar.a(imageView, true);
        fVar.f45446c.findViewById(R.id.icon_iv).setVisibility(8);
        tVar.observe(this, new u(this, fVar));
        MethodCollector.o(10881);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ui, viewGroup, false);
    }
}
