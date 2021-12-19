package com.ss.android.ugc.aweme.setting.page.base;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.setting.page.base.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public abstract class RightTextCell<T extends c> extends PowerCell<T> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Activity f122434a;

    static {
        Covode.recordClassIndex(80293);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
    }

    public void a() {
        c cVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (cVar = (c) this.f34234d) != null && cVar.f122445b != -1) {
            commonItemView.a(commonItemView.getContext().getText(cVar.f122445b), 0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f122434a = (Activity) context;
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayg, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.bytedance.ies.powerlist.b.a aVar) {
        c cVar;
        c cVar2;
        l.d(aVar, "");
        a();
        View view = this.itemView;
        CommonItemView commonItemView = null;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView2 = (CommonItemView) view;
        if (!(commonItemView2 == null || (cVar2 = (c) this.f34234d) == null || cVar2.f122446c == -1)) {
            commonItemView2.setDesc(commonItemView2.getContext().getText(cVar2.f122446c));
        }
        View view2 = this.itemView;
        if (view2 instanceof CommonItemView) {
            commonItemView = view2;
        }
        CommonItemView commonItemView3 = commonItemView;
        if (!(commonItemView3 == null || (cVar = (c) this.f34234d) == null)) {
            if (cVar.f122444a != -1) {
                commonItemView3.setLeftText(commonItemView3.getContext().getText(cVar.f122444a));
            }
            if (cVar.f122447d != -1) {
                commonItemView3.setLeftIcon(cVar.f122447d);
            }
        }
        this.itemView.setOnClickListener(this);
    }
}
