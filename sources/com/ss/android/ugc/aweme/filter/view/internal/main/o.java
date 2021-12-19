package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class o extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final ImageView f95977a;

    /* renamed from: b  reason: collision with root package name */
    public final a f95978b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f95979c;

    /* renamed from: d  reason: collision with root package name */
    public FilterBean f95980d;

    /* renamed from: e  reason: collision with root package name */
    public g f95981e = g.FILTER_STATE_UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public final m<FilterBean, g, z> f95982f;

    static {
        Covode.recordClassIndex(60790);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ObjectAnimator objectAnimator = this.f95979c;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f95977a;
        l.b(imageView, "");
        imageView.setRotation(0.0f);
        this.f95977a.setImageResource(2131230946);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.filter.FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(View view, m<? super FilterBean, ? super g, z> mVar) {
        super(view);
        l.d(view, "");
        l.d(mVar, "");
        this.f95982f = mVar;
        this.f95977a = (ImageView) view.findViewById(R.id.bwk);
        this.f95978b = (a) view.findViewById(R.id.bsb);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.filter.view.internal.main.o.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f95983a;

            static {
                Covode.recordClassIndex(60791);
            }

            {
                this.f95983a = r1;
            }

            public final void onClick(View view) {
                FilterBean filterBean;
                ClickAgent.onClick(view);
                if (this.f95983a.getAdapterPosition() != -1 && (filterBean = this.f95983a.f95980d) != null) {
                    this.f95983a.f95978b.a(false);
                    this.f95983a.f95982f.invoke(filterBean, this.f95983a.f95981e);
                }
            }
        });
    }
}
