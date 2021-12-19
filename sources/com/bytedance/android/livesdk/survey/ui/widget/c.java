package com.bytedance.android.livesdk.survey.ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.k.o;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class c extends com.bytedance.android.livesdk.g.b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<DataChannel> f21614a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f21615b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f21616c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21617d;

    /* renamed from: e  reason: collision with root package name */
    private View f21618e;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f21619i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f21620j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f21621k;

    /* renamed from: l  reason: collision with root package name */
    private LiveTextView f21622l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayoutCompat f21623m;
    private ViewGroup n;
    private LiveTextView o;
    private final m<String, Long, z> p = new a(this);
    private final boolean q;

    static {
        Covode.recordClassIndex(12751);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void b() {
        hide();
    }

    static final class b extends h.f.b.m implements h.f.a.a<DataChannel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DataChannel invoke() {
            return this.this$0.f21615b.c(com.bytedance.android.livesdk.survey.d.class);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a() {
        if (!l.a(this.f21615b.b(cn.class), (Object) true)) {
            show();
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void c() {
        ViewGroup viewGroup = this.f21619i;
        if (viewGroup == null) {
            l.a("mContent");
        }
        o.a(viewGroup, null);
        ViewGroup viewGroup2 = this.f21621k;
        if (viewGroup2 == null) {
            l.a("mQuestionContainer");
        }
        viewGroup2.setVisibility(0);
        ViewGroup viewGroup3 = this.n;
        if (viewGroup3 == null) {
            l.a("mFeedbackContainer");
        }
        viewGroup3.setVisibility(4);
        ImageView imageView = this.f21620j;
        if (imageView == null) {
            l.a("mCloseButton");
        }
        imageView.setVisibility(0);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void d() {
        ViewGroup viewGroup = this.f21619i;
        if (viewGroup == null) {
            l.a("mContent");
        }
        o.a(viewGroup, null);
        ViewGroup viewGroup2 = this.f21621k;
        if (viewGroup2 == null) {
            l.a("mQuestionContainer");
        }
        viewGroup2.setVisibility(4);
        ViewGroup viewGroup3 = this.n;
        if (viewGroup3 == null) {
            l.a("mFeedbackContainer");
        }
        viewGroup3.setVisibility(0);
        ImageView imageView = this.f21620j;
        if (imageView == null) {
            l.a("mCloseButton");
        }
        imageView.setVisibility(4);
    }

    private final void e() {
        if (!this.f21617d) {
            this.f21617d = true;
            LayoutInflater from = LayoutInflater.from(getContext());
            this.f21616c = from;
            View view = null;
            if (from == null || (view = com.a.a(from, R.layout.b8e, null, false)) == null) {
                l.b();
            }
            this.f21618e = view;
            if (view == null) {
                l.a("mRootView");
            }
            View findViewById = view.findViewById(R.id.efr);
            l.b(findViewById, "");
            this.f21619i = (ViewGroup) findViewById;
            View view2 = this.f21618e;
            if (view2 == null) {
                l.a("mRootView");
            }
            View findViewById2 = view2.findViewById(R.id.efq);
            l.b(findViewById2, "");
            this.f21620j = (ImageView) findViewById2;
            View view3 = this.f21618e;
            if (view3 == null) {
                l.a("mRootView");
            }
            View findViewById3 = view3.findViewById(R.id.efu);
            l.b(findViewById3, "");
            this.f21621k = (ViewGroup) findViewById3;
            View view4 = this.f21618e;
            if (view4 == null) {
                l.a("mRootView");
            }
            View findViewById4 = view4.findViewById(R.id.efv);
            l.b(findViewById4, "");
            this.f21622l = (LiveTextView) findViewById4;
            View view5 = this.f21618e;
            if (view5 == null) {
                l.a("mRootView");
            }
            View findViewById5 = view5.findViewById(R.id.efp);
            l.b(findViewById5, "");
            this.f21623m = (LinearLayoutCompat) findViewById5;
            View view6 = this.f21618e;
            if (view6 == null) {
                l.a("mRootView");
            }
            View findViewById6 = view6.findViewById(R.id.efs);
            l.b(findViewById6, "");
            this.n = (ViewGroup) findViewById6;
            View view7 = this.f21618e;
            if (view7 == null) {
                l.a("mRootView");
            }
            View findViewById7 = view7.findViewById(R.id.eft);
            l.b(findViewById7, "");
            this.o = (LiveTextView) findViewById7;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC0476c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f21624a;

        static {
            Covode.recordClassIndex(12754);
        }

        View$OnClickListenerC0476c(c cVar) {
            this.f21624a = cVar;
        }

        public final void onClick(View view) {
            this.f21624a.f21614a.invoke();
        }
    }

    static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f21625a;

        static {
            Covode.recordClassIndex(12755);
        }

        d(c cVar) {
            this.f21625a = cVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f21625a.f21614a.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
        View view = this.f21618e;
        if (view == null) {
            l.a("mRootView");
        }
        setContentView(view);
        hide();
        ImageView imageView = this.f21620j;
        if (imageView == null) {
            l.a("mCloseButton");
        }
        imageView.setOnClickListener(new View$OnClickListenerC0476c(this));
        setOnDismissListener(new d(this));
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a(com.bytedance.android.livesdk.survey.a.a aVar) {
        float f2;
        l.d(aVar, "");
        com.bytedance.android.livesdk.survey.a.c cVar = aVar.f21492b.get(0);
        LiveTextView liveTextView = this.f21622l;
        if (liveTextView == null) {
            l.a("mTitle");
        }
        liveTextView.setText(cVar.f21498b);
        LinearLayoutCompat linearLayoutCompat = this.f21623m;
        if (linearLayoutCompat == null) {
            l.a("mChooseContainer");
        }
        com.bytedance.android.livesdk.survey.a.c cVar2 = aVar.f21492b.get(0);
        l.b(cVar2, "");
        com.bytedance.android.livesdk.survey.a.c cVar3 = cVar2;
        if (this.q) {
            f2 = 8.0f;
        } else {
            f2 = 12.0f;
        }
        b.a(linearLayoutCompat, cVar3, R.layout.be_, 0, f2, this.p);
        LiveTextView liveTextView2 = this.o;
        if (liveTextView2 == null) {
            l.a("mFeedbackTip");
        }
        liveTextView2.setText(aVar.f21493c);
    }

    static final class a extends h.f.b.m implements m<String, Long, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Long l2) {
            String str2 = str;
            long longValue = l2.longValue();
            l.d(str2, "");
            this.this$0.f21615b.c(com.bytedance.android.livesdk.survey.c.class, new com.bytedance.android.livesdk.survey.b(str2, longValue));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, DataChannel dataChannel, boolean z) {
        super(context, z);
        l.d(context, "");
        l.d(dataChannel, "");
        this.f21615b = dataChannel;
        this.q = z;
        e();
    }
}
