package com.ss.android.ugc.aweme.setting.ui.cell;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.core.widget.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class CommonItemViewCell extends BaseCell<com.ss.android.ugc.aweme.setting.ui.b.a> {

    /* renamed from: a  reason: collision with root package name */
    private CommonItemView f122892a;

    static {
        Covode.recordClassIndex(80676);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        this.itemView.setOnClickListener(new a(this));
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommonItemViewCell f122893a;

        static {
            Covode.recordClassIndex(80677);
        }

        a(CommonItemViewCell commonItemViewCell) {
            this.f122893a = commonItemViewCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.setting.ui.b.a aVar = (com.ss.android.ugc.aweme.setting.ui.b.a) this.f122893a.f34234d;
            if (aVar != null && (onClickListener = aVar.f122835e) != null) {
                onClickListener.onClick(this.f122893a.itemView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayi, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        this.f122892a = (CommonItemView) a2;
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
        l.d(aVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) aVar);
        CommonItemView commonItemView = this.f122892a;
        if (commonItemView != null) {
            commonItemView.setLeftText(aVar.f122834d);
            commonItemView.setLeftIcon(aVar.f122833c);
            commonItemView.setRightIconRes(aVar.f122839i);
            commonItemView.setRightText(aVar.f122840j);
            if (aVar.f122841k != null) {
                commonItemView.setBackground(aVar.f122841k);
            }
            if (aVar.u) {
                commonItemView.setBackgroundColor(aVar.f122842l);
            }
            if (aVar.f122838h) {
                commonItemView.b();
            } else {
                commonItemView.c();
            }
            if (aVar.f122843m) {
                e.a(commonItemView.getIvwLeft(), ColorStateList.valueOf(b.c(commonItemView.getContext(), aVar.n)));
            }
            if (aVar.o) {
                SimpleDraweeView ivwLeft = commonItemView.getIvwLeft();
                l.b(ivwLeft, "");
                ivwLeft.setVisibility(aVar.p);
            }
            if (aVar.q != null) {
                commonItemView.getIvwLeft().setImageDrawable(aVar.q);
            }
            if (aVar.r) {
                commonItemView.a(aVar.s, aVar.t);
            }
            if (aVar.f122836f != null) {
                commonItemView.setTag(aVar.f122836f);
            }
        }
    }
}
