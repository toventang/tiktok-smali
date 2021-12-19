package com.ss.android.ugc.aweme.detail.h;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.detail.ui.MarqueeView2;
import com.ss.android.ugc.aweme.feed.i.b;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public abstract class y extends b {
    protected View F;
    protected boolean G;
    Drawable H;
    Drawable I;

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f79759a;

    static {
        Covode.recordClassIndex(49569);
    }

    /* access modifiers changed from: protected */
    public abstract View a(RelativeLayout relativeLayout);

    @Override // com.ss.android.ugc.aweme.feed.q.a, org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.detail.h.b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(222, new g(y.class, "onCancelVideoCoverMaskEvent", b.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    public abstract void n();

    /* access modifiers changed from: protected */
    public abstract int o();

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void H() {
        super.H();
        ab();
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void p() {
        super.p();
        ab();
    }

    private void ab() {
        if (com.ss.android.ugc.aweme.utils.y.f(aD())) {
            o.a(this.F, 4);
        } else {
            o.a(this.F, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.e, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public void bm_() {
        super.bm_();
        View view = this.F;
        if (view != null) {
            view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
            int i2 = c.n;
            int a2 = c.a();
            if (i2 == 0) {
                i2 = a2;
            }
            layoutParams.height = i2;
            this.F.setLayoutParams(layoutParams);
            if (!c.b.f66221a.q) {
                this.G = true;
                View view2 = this.F;
                View findViewById = view2.findViewById(R.id.b1f);
                View findViewById2 = view2.findViewById(R.id.b1w);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public void m() {
        if (this.bv != null && !this.bv.isFinishing() && az_() != null && this.f79759a == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.bv);
            this.f79759a = relativeLayout;
            ((ViewGroup) az_().getView()).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
            View a2 = a(this.f79759a);
            this.F = a2;
            View findViewById = a2.findViewById(R.id.vc);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                TextView textView = (TextView) viewGroup.findViewById(R.id.djb);
                if (textView != null) {
                    textView.setText(o());
                    viewGroup.post(new aa(this, viewGroup, textView));
                }
                findViewById.setOnClickListener(new z(this));
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.f79759a.addView(this.F, layoutParams);
            View view = new View(this.bv);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) n.b(this.bv, 12.0f));
            layoutParams2.addRule(6, this.F.getId());
            this.f79759a.addView(view, layoutParams2);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b
    @r
    public void onCancelVideoCoverMaskEvent(b bVar) {
        o.a(this.F, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(final MarqueeView2 marqueeView2, final String str) {
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g);
        if (a2 != null) {
            marqueeView2.getPaint().setTypeface(a2);
        }
        marqueeView2.setText(str);
        marqueeView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.ugc.aweme.detail.h.y.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49570);
            }

            public final void onGlobalLayout() {
                marqueeView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = marqueeView2.getMeasuredWidth();
                if (((float) measuredWidth) < marqueeView2.getPaint().measureText(str)) {
                    if (!y.this.G && y.this.F != null) {
                        y yVar = y.this;
                        View view = yVar.F;
                        View findViewById = view.findViewById(R.id.b1f);
                        View findViewById2 = view.findViewById(R.id.b1w);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                        }
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(0);
                        }
                        if (!(!gb.a(yVar.bv) || findViewById2 == null || findViewById == null)) {
                            if (yVar.H == null) {
                                yVar.H = findViewById.getBackground();
                            }
                            if (yVar.I == null) {
                                yVar.I = findViewById2.getBackground();
                            }
                            findViewById.setBackground(yVar.I);
                            findViewById2.setBackground(yVar.H);
                        }
                    }
                    marqueeView2.a();
                }
            }
        });
    }

    static boolean a(TextView textView, int i2, int i3, int i4) {
        textView.setTextSize(1, (float) i4);
        if (((int) textView.getPaint().measureText(textView.getText().toString())) + i3 > i2) {
            return true;
        }
        return false;
    }
}
