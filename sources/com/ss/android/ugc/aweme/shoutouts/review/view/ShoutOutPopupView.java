package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class ShoutOutPopupView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f133424a;

    /* renamed from: b  reason: collision with root package name */
    public View f133425b;

    /* renamed from: c  reason: collision with root package name */
    public TuxButton f133426c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super h.f.a.a<z>, z> f133427d;

    /* renamed from: e  reason: collision with root package name */
    public h.f.a.a<z> f133428e;

    static {
        Covode.recordClassIndex(87260);
    }

    public ShoutOutPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.a6s);
        l.b(findViewById, "");
        this.f133424a = findViewById;
        View findViewById2 = findViewById(R.id.a6p);
        l.b(findViewById2, "");
        this.f133425b = findViewById2;
        View findViewById3 = findViewById(R.id.f4r);
        l.b(findViewById3, "");
        this.f133426c = (TuxButton) findViewById3;
    }

    public final void setPostIntroVideoListener(h.f.a.b<? super h.f.a.a<z>, z> bVar) {
        this.f133427d = bVar;
    }

    public final void setGotoSeeNewRequestListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f133428e = aVar;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutPopupView f133429a;

        static {
            Covode.recordClassIndex(87261);
        }

        public a(ShoutOutPopupView shoutOutPopupView) {
            this.f133429a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f133429a.f133428e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final /* synthetic */ TuxButton a(ShoutOutPopupView shoutOutPopupView) {
        TuxButton tuxButton = shoutOutPopupView.f133426c;
        if (tuxButton == null) {
            l.a("clPostView");
        }
        return tuxButton;
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutPopupView f133430a;

        static {
            Covode.recordClassIndex(87262);
        }

        public b(ShoutOutPopupView shoutOutPopupView) {
            this.f133430a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f133430a.f133424a;
            if (view2 == null) {
                l.a("clPostIntroView");
            }
            view2.setVisibility(8);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutPopupView f133431a;

        static {
            Covode.recordClassIndex(87263);
        }

        public c(ShoutOutPopupView shoutOutPopupView) {
            this.f133431a = shoutOutPopupView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ShoutOutPopupView.a(this.f133431a).setLoading(true);
            h.f.a.b<? super h.f.a.a<z>, z> bVar = this.f133431a.f133427d;
            if (bVar != null) {
                bVar.invoke(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(87264);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        ShoutOutPopupView.a(this.this$0.f133431a).post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView.c.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f133432a;

                            static {
                                Covode.recordClassIndex(87265);
                            }

                            {
                                this.f133432a = r1;
                            }

                            public final void run() {
                                ShoutOutPopupView.a(this.f133432a.this$0.f133431a).setLoading(false);
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
        }
    }

    private /* synthetic */ ShoutOutPopupView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutOutPopupView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2103);
        MethodCollector.o(2103);
    }
}
