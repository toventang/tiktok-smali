package com.ss.android.ugc.aweme.journey.step.d;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.cq;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.g.b;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Random;

public final class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f104976a;

    static {
        Covode.recordClassIndex(67303);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f104976a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        l.d(view, "");
        if (this.f104976a == null) {
            this.f104976a = new SparseArray();
        }
        View view2 = (View) this.f104976a.get(R.id.ci4);
        String str = null;
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.ci4);
                this.f104976a.put(R.id.ci4, view2);
            }
        }
        TuxStatusView tuxStatusView = (TuxStatusView) view2;
        if (tuxStatusView != null) {
            tuxStatusView.a();
        }
        Intent i2 = ((ComponentDependencies) ae.a(requireActivity(), (ad.b) null).a(ComponentDependencies.class)).i();
        if (i2 != null && i2.getData() != null) {
            IDeepLinkService g2 = DeepLinkServiceImpl.g();
            Uri data = i2.getData();
            if (data != null) {
                str = data.getScheme();
            }
            if (g2.c(str)) {
                intent = new Intent(getActivity(), cq.f78276a.b());
            } else {
                intent = new Intent(getActivity(), cq.f78276a.a());
            }
            intent.setFlags(536870912);
            intent.setAction("android.intent.action.VIEW");
            g gVar = new g(String.valueOf(i2.getData()));
            gVar.a("random", new Random(1000).toString());
            intent.setData(Uri.parse(gVar.a()));
            intent.putExtras(i2);
            intent.putExtra("new_user_journey", true);
            intent.putExtra("inner_from", "new_user_journey");
            if (i2.getBooleanExtra("from_task", false)) {
                e activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                c.a(new b());
                return;
            }
            e activity2 = getActivity();
            if (activity2 != null) {
                activity2.startActivityForResult(intent, 1);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.abg, viewGroup, false);
    }
}
