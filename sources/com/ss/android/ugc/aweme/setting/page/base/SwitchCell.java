package com.ss.android.ugc.aweme.setting.page.base;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.setting.page.base.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public abstract class SwitchCell<T extends d> extends PowerCell<T> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Activity f122435a;

    static {
        Covode.recordClassIndex(80294);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonItemView f122437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SwitchCell f122438c;

        static {
            Covode.recordClassIndex(80295);
        }

        a(d dVar, CommonItemView commonItemView, SwitchCell switchCell) {
            this.f122436a = dVar;
            this.f122437b = commonItemView;
            this.f122438c = switchCell;
        }

        public final void run() {
            this.f122437b.setChecked(this.f122436a.f122450c);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        d dVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (dVar = (d) this.f34234d) != null && commonItemView.d() != dVar.f122450c) {
            View view2 = this.itemView;
            l.b(view2, "");
            if (((CommonItemView) view2).getWindowToken() == null) {
                commonItemView.post(new a(dVar, commonItemView, this));
            } else {
                commonItemView.setChecked(dVar.f122450c);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.f122435a = (Activity) context;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayh, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(com.bytedance.ies.powerlist.b.a aVar) {
        d dVar;
        d dVar2;
        l.d(aVar, "");
        a();
        View view = this.itemView;
        CommonItemView commonItemView = null;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView2 = (CommonItemView) view;
        if (!(commonItemView2 == null || (dVar2 = (d) this.f34234d) == null || dVar2.f122449b == -1)) {
            commonItemView2.setDesc(commonItemView2.getContext().getText(dVar2.f122449b));
        }
        View view2 = this.itemView;
        if (view2 instanceof CommonItemView) {
            commonItemView = view2;
        }
        CommonItemView commonItemView3 = commonItemView;
        if (!(commonItemView3 == null || (dVar = (d) this.f34234d) == null || dVar.f122448a == -1)) {
            commonItemView3.setLeftText(commonItemView3.getContext().getText(dVar.f122448a));
        }
        this.itemView.setOnClickListener(this);
    }
}
