package com.ss.android.ugc.aweme.upvote.detail.panel;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.c.c;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class m extends a {

    /* renamed from: j  reason: collision with root package name */
    public TuxStatusView f142203j;

    static {
        Covode.recordClassIndex(92964);
    }

    public static final /* synthetic */ TuxStatusView a(m mVar) {
        TuxStatusView tuxStatusView = mVar.f142203j;
        if (tuxStatusView == null) {
            l.a("statusView");
        }
        return tuxStatusView;
    }

    static final class a extends h.f.b.m implements h.f.a.m<p, q, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(92965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(2);
            this.this$0 = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m$a$a  reason: collision with other inner class name */
        static final class C3797a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3797a f142204a = new C3797a();

            static {
                Covode.recordClassIndex(92966);
            }

            C3797a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f44749a = R.raw.icon_large_wifi_slash;
                aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<TuxButton, z> {
            final /* synthetic */ p $this_selectSubscribe;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(92967);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, p pVar) {
                super(1);
                this.this$0 = aVar;
                this.$this_selectSubscribe = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(TuxButton tuxButton) {
                String str;
                TuxButton tuxButton2 = tuxButton;
                l.d(tuxButton2, "");
                Context ar_ = this.$this_selectSubscribe.ar_();
                if (ar_ != null) {
                    str = ar_.getString(R.string.cjx);
                } else {
                    str = null;
                }
                tuxButton2.setText(str);
                tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
                tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.upvote.detail.panel.m.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f142205a;

                    static {
                        Covode.recordClassIndex(92968);
                    }

                    {
                        this.f142205a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f142205a.this$0.this$0.w().a(UpvoteDetailPanelViewModel.h.f142161a);
                    }
                });
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, q qVar) {
            p pVar2 = pVar;
            q qVar2 = qVar;
            l.d(pVar2, "");
            l.d(qVar2, "");
            int i2 = n.f142206a[qVar2.ordinal()];
            if (i2 == 1) {
                m.a(this.this$0).a();
            } else if (i2 == 2) {
                m.a(this.this$0).setVisibility(8);
            } else if (i2 == 3) {
                TuxStatusView.c cVar = new TuxStatusView.c();
                String b2 = h.b(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f95), Integer.valueOf((int) R.string.fde))).intValue());
                l.b(b2, "");
                m.a(this.this$0).setStatus(cVar.a((CharSequence) b2));
                m.a(this.this$0).setVisibility(0);
            } else if (i2 == 4) {
                TuxStatusView.c cVar2 = new TuxStatusView.c();
                String b3 = h.b(R.string.azt);
                l.b(b3, "");
                TuxStatusView.c a2 = cVar2.a(b3);
                String b4 = h.b(R.string.ad7);
                l.b(b4, "");
                TuxStatusView.c a3 = a2.a((CharSequence) b4).a(c.a(C3797a.f142204a));
                a3.f45362j = new b(this, pVar2);
                m.a(this.this$0).setStatus(a3);
                m.a(this.this$0).setVisibility(0);
                Fragment a4 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                if (a4 != null) {
                    new com.bytedance.tux.g.b(a4).a(a4.getString(R.string.ad7)).b();
                }
            }
            return z.f158842a;
        }
    }

    public final void a(double d2) {
        TuxStatusView tuxStatusView = this.f142203j;
        if (tuxStatusView == null) {
            l.a("statusView");
        }
        TuxStatusView tuxStatusView2 = this.f142203j;
        if (tuxStatusView2 == null) {
            l.a("statusView");
        }
        ViewGroup.LayoutParams layoutParams = tuxStatusView2.getLayoutParams();
        layoutParams.height = (int) d2;
        tuxStatusView.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        int i2;
        l.d(view, "");
        View findViewById = view.findViewById(R.id.fcl);
        l.b(findViewById, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById;
        this.f142203j = tuxStatusView;
        if (tuxStatusView == null) {
            l.a("statusView");
        }
        Context context = tuxStatusView.getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = 0;
        }
        f.a.a(this, w(), o.f142207a, (k) null, new a(this), 6);
        f.a.a(this, w(), p.f142208a, (k) null, new b(this, i2), 6);
    }

    static final class b extends h.f.b.m implements h.f.a.m<p, Float, z> {
        final /* synthetic */ int $screenHeight;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(92969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, int i2) {
            super(2);
            this.this$0 = mVar;
            this.$screenHeight = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Float f2) {
            float floatValue = f2.floatValue();
            l.d(pVar, "");
            if (floatValue == 0.0f) {
                m mVar = this.this$0;
                double d2 = (double) this.$screenHeight;
                Double.isNaN(d2);
                mVar.a(d2 * 0.5d);
            } else if (floatValue == 1.0f) {
                m mVar2 = this.this$0;
                double d3 = (double) this.$screenHeight;
                Double.isNaN(d3);
                mVar2.a(d3 * 0.73d);
            } else if (floatValue > 0.0f) {
                m mVar3 = this.this$0;
                double d4 = (double) this.$screenHeight;
                double d5 = (double) floatValue;
                Double.isNaN(d5);
                Double.isNaN(d4);
                mVar3.a(d4 * ((d5 * 0.22999999999999998d) + 0.5d));
            }
            return z.f158842a;
        }
    }
}
