package com.ss.android.ugc.aweme.sharer.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.sharer.ui.b.b;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.List;

public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    private final h f124678a = h.i.a((h.f.a.a) new a(this));

    /* renamed from: m  reason: collision with root package name */
    public final Context f124679m;
    public e n;

    static {
        Covode.recordClassIndex(81919);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.views.i e() {
        return (com.ss.android.ugc.aweme.views.i) this.f124678a.getValue();
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(81920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0.f124679m);
        }
    }

    public final void f() {
        try {
            e().dismiss();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public void dismiss() {
        super.dismiss();
        f fVar = this.n.f124660l;
        if (fVar != null) {
            fVar.a(this.n.f124657i, this.f124679m);
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.sharer.ui.bar.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f124683a;

        static {
            Covode.recordClassIndex(81923);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(i iVar) {
            this.f124683a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.c
        public final void a(h hVar) {
            l.d(hVar, "");
            if (!this.f124683a.n.f124657i.a(hVar, this.f124683a.f124679m)) {
                hVar.a(this.f124683a.f124679m, this.f124683a.n.f124657i);
            }
            f fVar = this.f124683a.n.f124660l;
            if (fVar != null) {
                fVar.a(hVar, this.f124683a.n.f124657i, this.f124683a.f124679m);
            }
            if (hVar.f()) {
                this.f124683a.dismiss();
            } else if (hVar.e()) {
                this.f124683a.dismiss();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f124684a;

        static {
            Covode.recordClassIndex(81924);
        }

        d(i iVar) {
            this.f124684a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f124684a.n.f124660l;
            if (fVar != null) {
                fVar.b(this.f124684a.n.f124657i, this.f124684a.f124679m);
            }
            this.f124684a.dismiss();
        }
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(81925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            return Boolean.valueOf(!bVar2.b(this.this$0.f124679m));
        }
    }

    static final class b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f124680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f124681b;

        static {
            Covode.recordClassIndex(81921);
        }

        b(h.f.a.a aVar, i iVar) {
            this.f124680a = aVar;
            this.f124681b = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (((Boolean) this.f124680a.invoke()).booleanValue()) {
                ((ShareActionBar) this.f124681b.findViewById(R.id.e1f)).postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.sharer.ui.i.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f124682a;

                    static {
                        Covode.recordClassIndex(81922);
                    }

                    {
                        this.f124682a = r1;
                    }

                    public final void run() {
                        ShareActionBar shareActionBar = (ShareActionBar) this.f124682a.f124681b.findViewById(R.id.e1f);
                        if (!shareActionBar.f124615a.isEmpty()) {
                            shareActionBar.f124616b.d(shareActionBar.f124615a.size() - 1);
                        }
                    }
                }, 300);
            }
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.sharer.ui.bar.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f124685a;

        static {
            Covode.recordClassIndex(81926);
        }

        static final class a extends m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(81927);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = fVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                f fVar = this.this$0.f124685a.n.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, booleanValue, this.this$0.f124685a.n.f124657i, this.this$0.f124685a.f124679m);
                }
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f124685a.f();
                }
                if (!this.$channel.c()) {
                    this.this$0.f124685a.dismiss();
                }
                return z.f158842a;
            }
        }

        static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.h, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(81928);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(f fVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = fVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.sharer.h hVar) {
                com.ss.android.ugc.aweme.sharer.h hVar2 = hVar;
                l.d(hVar2, "");
                boolean a2 = this.$channel.a(hVar2, this.this$0.f124685a.f124679m);
                f fVar = this.this$0.f124685a.n.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, a2, this.this$0.f124685a.n.f124657i, this.this$0.f124685a.f124679m);
                }
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f124685a.f();
                }
                if (!this.$channel.c()) {
                    this.this$0.f124685a.dismiss();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.e
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            if (!bVar.c()) {
                this.f124685a.dismiss();
            }
            if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                try {
                    this.f124685a.e().show();
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            if (!this.f124685a.n.f124657i.a(bVar, this.f124685a.f124679m, new a(this, bVar))) {
                this.f124685a.n.f124657i.a(bVar, new b(this, bVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, Context context, SharePackage sharePackage) {
            super(context, sharePackage);
            this.f124685a = iVar;
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        boolean z;
        List<com.ss.android.ugc.aweme.sharer.b> list;
        List<com.ss.android.ugc.aweme.sharer.b> list2;
        MethodCollector.i(10250);
        super.onCreate(bundle);
        setContentView(R.layout.ael);
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.e1o);
        l.b(measureLinearLayout, "");
        b.a.a(this, measureLinearLayout);
        if (this.n.f124659k != null) {
            ((FrameLayout) findViewById(R.id.e1s)).addView(this.n.f124659k);
        }
        if (this.n.f124652d) {
            n.a((List) this.n.f124649a, (h.f.a.b) new e(this));
        }
        int i2 = 0;
        if (this.n.f124651c || (list2 = this.n.f124649a) == null || list2.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.e1l);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
        } else {
            ((ShareChannelBar) findViewById(R.id.e1p)).a(this.n.f124649a);
            ((ShareChannelBar) findViewById(R.id.e1p)).a(new f(this, this.f124679m, this.n.f124657i));
        }
        List<h> list3 = this.n.f124650b;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.n.r) {
            ShareActionBar shareActionBar = (ShareActionBar) findViewById(R.id.e1f);
            l.b(shareActionBar, "");
            shareActionBar.setVisibility(8);
            View findViewById = findViewById(R.id.e14);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
        } else {
            if ((this.n.f124651c || (list = this.n.f124649a) == null || list.isEmpty()) && !this.n.o) {
                TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.e0f);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            }
            ((ShareActionBar) findViewById(R.id.e1f)).a(this.n.f124650b);
            ((ShareActionBar) findViewById(R.id.e1f)).a(new c(this));
            h.f.a.a<Boolean> aVar = this.n.n;
            if (aVar != null) {
                setOnShowListener(new b(aVar, this));
            }
        }
        if (this.n.o) {
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.e0f);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.e1r);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.e0f);
            l.b(tuxTextView4, "");
            tuxTextView4.setText(this.f124679m.getResources().getText(R.string.d5u));
            ((TuxTextView) findViewById(R.id.e0f)).setTextColor(androidx.core.content.b.c(this.f124679m, this.n.f124654f));
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.e0f);
            l.b(tuxTextView5, "");
            tuxTextView5.setAlpha(this.n.f124655g);
            TuxTextView tuxTextView6 = (TuxTextView) findViewById(R.id.e1r);
            l.b(tuxTextView6, "");
            tuxTextView6.setText(this.f124679m.getResources().getText(this.n.f124653e));
            ((TuxTextView) findViewById(R.id.e1r)).setTextColor(androidx.core.content.b.c(this.f124679m, this.n.f124654f));
            TuxTextView tuxTextView7 = (TuxTextView) findViewById(R.id.e1r);
            l.b(tuxTextView7, "");
            tuxTextView7.setAlpha(this.n.f124655g);
            TuxTextView tuxTextView8 = (TuxTextView) findViewById(R.id.e1i);
            l.b(tuxTextView8, "");
            tuxTextView8.setText(this.f124679m.getResources().getText(this.n.f124656h));
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.e1j);
        l.b(frameLayout, "");
        if (!this.n.q) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        ((TuxTextView) findViewById(R.id.e1i)).setOnClickListener(new d(this));
        MethodCollector.o(10250);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, int i2, e eVar) {
        super(context, i2);
        l.d(context, "");
        l.d(eVar, "");
        this.f124679m = context;
        this.n = eVar;
    }
}
