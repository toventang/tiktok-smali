package com.ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.be.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LabelCell extends BaseCell<f> {

    /* renamed from: a  reason: collision with root package name */
    private CommonItemView f69824a;

    static {
        Covode.recordClassIndex(43057);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LabelCell f69825a;

        static {
            Covode.recordClassIndex(43058);
        }

        a(LabelCell labelCell) {
            this.f69825a = labelCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            f fVar = (f) this.f69825a.f34234d;
            if (fVar != null && (onClickListener = fVar.f68584j) != null) {
                onClickListener.onClick(this.f69825a.itemView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LabelCell f69826a;

        static {
            Covode.recordClassIndex(43059);
        }

        b(LabelCell labelCell) {
            this.f69826a = labelCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            f fVar = (f) this.f69826a.f34234d;
            if (fVar != null && (onClickListener = fVar.f68585k) != null) {
                onClickListener.onClick(this.f69826a.itemView);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.lo, viewGroup, false);
        this.f69824a = (CommonItemView) a2.findViewById(R.id.acb);
        l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(f fVar) {
        float f2;
        SimpleDraweeView ivwLeft;
        com.bytedance.tux.c.a aVar;
        l.d(fVar, "");
        super.a((com.ss.android.ugc.aweme.be.a) fVar);
        CommonItemView commonItemView = this.f69824a;
        if (commonItemView != null) {
            commonItemView.setLeftText(fVar.f68580f);
            commonItemView.a(fVar.f68577c, 0);
            commonItemView.setDesc(fVar.f68582h);
            if (fVar.f68583i) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            commonItemView.setAlpha(f2);
            commonItemView.setEnabled(fVar.f68583i);
            if (fVar.f68579e != null) {
                commonItemView.setLeftIconImageUrl(fVar.f68579e);
            } else {
                CommonItemView commonItemView2 = this.f69824a;
                if (!(commonItemView2 == null || (ivwLeft = commonItemView2.getIvwLeft()) == null || (aVar = fVar.f68581g) == null)) {
                    Context context = ivwLeft.getContext();
                    l.b(context, "");
                    com.bytedance.tux.c.b a2 = aVar.a(context);
                    ivwLeft.setVisibility(0);
                    ivwLeft.setImageDrawable(a2);
                }
            }
        }
        if (fVar.f68583i) {
            this.itemView.setOnClickListener(new a(this));
        } else {
            this.itemView.setOnClickListener(new b(this));
        }
        if (fVar.f68578d) {
            CommonItemView commonItemView3 = this.f69824a;
            if (commonItemView3 != null) {
                commonItemView3.b();
                return;
            }
            return;
        }
        CommonItemView commonItemView4 = this.f69824a;
        if (commonItemView4 != null) {
            commonItemView4.c();
        }
    }
}
