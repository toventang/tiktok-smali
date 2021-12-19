package com.ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.be.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SwitchCell extends BaseCell<h> {

    /* renamed from: a  reason: collision with root package name */
    public CommonItemView f69828a;

    static {
        Covode.recordClassIndex(43063);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwitchCell f69831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f69832b;

        static {
            Covode.recordClassIndex(43066);
        }

        c(SwitchCell switchCell, h hVar) {
            this.f69831a = switchCell;
            this.f69832b = hVar;
        }

        public final void run() {
            CommonItemView commonItemView = this.f69831a.f69828a;
            if (commonItemView != null) {
                commonItemView.setChecked(this.f69832b.f68599c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwitchCell f69829a;

        static {
            Covode.recordClassIndex(43064);
        }

        a(SwitchCell switchCell) {
            this.f69829a = switchCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            h hVar = (h) this.f69829a.f34234d;
            if (hVar != null && (onClickListener = hVar.f68601e) != null) {
                onClickListener.onClick(this.f69829a.itemView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwitchCell f69830a;

        static {
            Covode.recordClassIndex(43065);
        }

        b(SwitchCell switchCell) {
            this.f69830a = switchCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            h hVar = (h) this.f69830a.f34234d;
            if (hVar != null && (onClickListener = hVar.f68604h) != null) {
                onClickListener.onClick(this.f69830a.itemView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.lp, viewGroup, false);
        this.f69828a = (CommonItemView) a2.findViewById(R.id.acb);
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(h hVar) {
        float f2;
        l.d(hVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) hVar);
        CommonItemView commonItemView = this.f69828a;
        if (commonItemView != null) {
            commonItemView.setLeftText(hVar.f68600d);
            commonItemView.setRightText(hVar.f68607k);
            commonItemView.setDesc(hVar.f68605i);
            if (hVar.f68606j) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            commonItemView.setAlpha(f2);
            commonItemView.setEnabled(hVar.f68606j);
        }
        if (hVar.f68606j) {
            this.itemView.setOnClickListener(new a(this));
        } else {
            this.itemView.setOnClickListener(new b(this));
        }
        View view = this.itemView;
        l.b(view, "");
        if (view.getWindowToken() == null) {
            this.itemView.post(new c(this, hVar));
        } else {
            CommonItemView commonItemView2 = this.f69828a;
            if (commonItemView2 != null) {
                commonItemView2.setChecked(hVar.f68599c);
            }
        }
        CommonItemView commonItemView3 = this.f69828a;
        if (commonItemView3 != null) {
            commonItemView3.setOnCheckedChangeListener(hVar.f68602f);
        }
    }
}
