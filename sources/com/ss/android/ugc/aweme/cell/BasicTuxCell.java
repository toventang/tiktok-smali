package com.ss.android.ugc.aweme.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.be.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class BasicTuxCell extends BaseCell<b> {

    /* renamed from: a  reason: collision with root package name */
    private CommonItemView f69818a;

    static {
        Covode.recordClassIndex(43050);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.itemView.setOnClickListener(new a(this));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BasicTuxCell f69819a;

        static {
            Covode.recordClassIndex(43051);
        }

        a(BasicTuxCell basicTuxCell) {
            this.f69819a = basicTuxCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            b bVar = (b) this.f69819a.f34234d;
            if (bVar != null && (onClickListener = bVar.f68546f) != null) {
                onClickListener.onClick(this.f69819a.itemView);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        float f2;
        l.d(bVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) bVar);
        CommonItemView commonItemView = this.f69818a;
        if (commonItemView != null) {
            commonItemView.setLeftText(bVar.f68543c);
            commonItemView.setDesc(bVar.f68544d);
            View view = this.itemView;
            l.b(view, "");
            if (bVar.f68545e) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            view.setAlpha(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.lm, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        this.f69818a = (CommonItemView) a2;
        l.b(a2, "");
        return a2;
    }
}
