package com.ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.widget.FlowLayout;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class ReviewFilterGroup extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayout f87093a;

    /* renamed from: b  reason: collision with root package name */
    private c f87094b;

    /* renamed from: c  reason: collision with root package name */
    private m<? super Integer, ? super ReviewFilterStruct, z> f87095c;

    static {
        Covode.recordClassIndex(54639);
    }

    public ReviewFilterGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final FlowLayout getFlow() {
        return this.f87093a;
    }

    public final c getLastClickView() {
        return this.f87094b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<? super java.lang.Integer, ? super com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct, h.z>, h.f.a.m<java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct, h.z> */
    public final m<Integer, ReviewFilterStruct, z> getListener() {
        return this.f87095c;
    }

    public final void setLastClickView(c cVar) {
        this.f87094b = cVar;
    }

    public final void setListener(m<? super Integer, ? super ReviewFilterStruct, z> mVar) {
        this.f87095c = mVar;
    }

    public final void setOnSelectedChangeListener(m<? super Integer, ? super ReviewFilterStruct, z> mVar) {
        this.f87095c = mVar;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f87096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewFilterGroup f87097b;

        static {
            Covode.recordClassIndex(54640);
        }

        public a(int i2, ReviewFilterGroup reviewFilterGroup) {
            this.f87096a = i2;
            this.f87097b = reviewFilterGroup;
        }

        public final void onClick(View view) {
            c lastClickView;
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterItemView");
            if ((!l.a(this.f87097b.getLastClickView(), view)) && (lastClickView = this.f87097b.getLastClickView()) != null) {
                lastClickView.a();
            }
            c cVar = (c) view;
            this.f87097b.setLastClickView(cVar);
            if (cVar.f87115c) {
                cVar.a();
            } else {
                cVar.f87115c = true;
                cVar.setBackgroundResource(R.drawable.zi);
                cVar.f87113a.setTextColor(b.c(cVar.getContext(), R.color.bh));
                cVar.f87114b.setTextColor(b.c(cVar.getContext(), R.color.bh));
            }
            if (cVar.f87115c) {
                m<Integer, ReviewFilterStruct, z> listener = this.f87097b.getListener();
                if (listener != null) {
                    Integer valueOf = Integer.valueOf(this.f87096a);
                    Object tag = cVar.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct");
                    listener.invoke(valueOf, tag);
                    return;
                }
                return;
            }
            m<Integer, ReviewFilterStruct, z> listener2 = this.f87097b.getListener();
            if (listener2 != null) {
                listener2.invoke(-1, null);
            }
        }
    }

    private /* synthetic */ ReviewFilterGroup(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReviewFilterGroup(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3917);
        FlowLayout flowLayout = new FlowLayout(context, (AttributeSet) null, 6);
        flowLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        flowLayout.setGravity(-1);
        this.f87093a = flowLayout;
        addView(flowLayout);
        MethodCollector.o(3917);
    }
}
