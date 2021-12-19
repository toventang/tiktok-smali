package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class ShoutoutsProductReviewError extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private final h f133450g;

    static {
        Covode.recordClassIndex(87273);
    }

    public ShoutoutsProductReviewError(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final LinearLayout getLlRetry() {
        return (LinearLayout) this.f133450g.getValue();
    }

    static final class a extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ ShoutoutsProductReviewError this$0;

        static {
            Covode.recordClassIndex(87274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShoutoutsProductReviewError shoutoutsProductReviewError) {
            super(0);
            this.this$0 = shoutoutsProductReviewError;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.cgb);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f133451a;

        static {
            Covode.recordClassIndex(87275);
        }

        b(h.f.a.a aVar) {
            this.f133451a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f133451a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void setRetryListener(h.f.a.a<z> aVar) {
        getLlRetry().setOnClickListener(new b(aVar));
    }

    private /* synthetic */ ShoutoutsProductReviewError(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsProductReviewError(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f133450g = i.a((h.f.a.a) new a(this));
    }
}
