package com.bytedance.android.livesdk.survey.ui.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.k.o;
import androidx.lifecycle.i;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.h;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class SurveyCardWidget extends LiveRecyclableWidget implements a, au {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<DataChannel> f21576a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f21577b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21578c;

    /* renamed from: d  reason: collision with root package name */
    public float f21579d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f21580e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f21581f;

    /* renamed from: g  reason: collision with root package name */
    private LiveTextView f21582g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayoutCompat f21583h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f21584i;

    /* renamed from: j  reason: collision with root package name */
    private LiveTextView f21585j;

    /* renamed from: k  reason: collision with root package name */
    private final m<String, Long, z> f21586k = new a(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f21587l = true;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.android.livesdk.survey.a.a f21588m;

    static {
        Covode.recordClassIndex(12733);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhq;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<DataChannel> {
        final /* synthetic */ SurveyCardWidget this$0;

        static {
            Covode.recordClassIndex(12735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SurveyCardWidget surveyCardWidget) {
            super(0);
            this.this$0 = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DataChannel invoke() {
            DataChannel dataChannel = this.this$0.dataChannel;
            if (dataChannel != null) {
                return dataChannel.c(com.bytedance.android.livesdk.survey.d.class);
            }
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a() {
        this.f21587l = false;
        show();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void b() {
        this.f21587l = true;
        hide();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void c() {
        View view = this.contentView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        o.a((ViewGroup) view);
        ViewGroup viewGroup = this.f21581f;
        if (viewGroup == null) {
            l.a("mQuestionContainer");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.f21584i;
        if (viewGroup2 == null) {
            l.a("mFeedbackContainer");
        }
        viewGroup2.setVisibility(4);
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void d() {
        View view = this.contentView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        o.a((ViewGroup) view);
        ViewGroup viewGroup = this.f21581f;
        if (viewGroup == null) {
            l.a("mQuestionContainer");
        }
        viewGroup.setVisibility(4);
        ViewGroup viewGroup2 = this.f21584i;
        if (viewGroup2 == null) {
            l.a("mFeedbackContainer");
        }
        viewGroup2.setVisibility(0);
    }

    public final void e() {
        ViewGroup.LayoutParams layoutParams;
        if (getView() != null && this.isViewValid && this.context != null) {
            View view = getView();
            Object obj = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    obj = dataChannel.b(cp.class);
                }
                if (!l.a(obj, (Object) false)) {
                    layoutParams2.bottomMargin = y.a(this.f21579d);
                    View view2 = getView();
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyCardWidget f21589a;

        static {
            Covode.recordClassIndex(12738);
        }

        e(SurveyCardWidget surveyCardWidget) {
            this.f21589a = surveyCardWidget;
        }

        public final void onClick(View view) {
            this.f21589a.f21576a.invoke();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<k, z> {
        final /* synthetic */ SurveyCardWidget this$0;

        static {
            Covode.recordClassIndex(12736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SurveyCardWidget surveyCardWidget) {
            super(1);
            this.this$0 = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            float f2;
            k kVar2 = kVar;
            l.d(kVar2, "");
            if (this.this$0.f21577b != kVar2.f9998a) {
                this.this$0.f21577b = kVar2.f9998a;
                SurveyCardWidget surveyCardWidget = this.this$0;
                float f3 = surveyCardWidget.f21579d;
                if (kVar2.f9998a) {
                    f2 = 48.0f;
                } else {
                    f2 = -48.0f;
                }
                surveyCardWidget.f21579d = f3 + f2;
                this.this$0.e();
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ SurveyCardWidget this$0;

        static {
            Covode.recordClassIndex(12737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SurveyCardWidget surveyCardWidget) {
            super(1);
            this.this$0 = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            float f2;
            boolean booleanValue = bool.booleanValue();
            if (this.this$0.f21578c != booleanValue) {
                this.this$0.f21578c = booleanValue;
                SurveyCardWidget surveyCardWidget = this.this$0;
                float f3 = surveyCardWidget.f21579d;
                if (booleanValue) {
                    f2 = 80.0f;
                } else {
                    f2 = -80.0f;
                }
                surveyCardWidget.f21579d = f3 + f2;
                this.this$0.e();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a(com.bytedance.android.livesdk.survey.a.a aVar) {
        l.d(aVar, "");
        this.f21588m = aVar;
        com.bytedance.android.livesdk.survey.a.c cVar = aVar.f21492b.get(0);
        LiveTextView liveTextView = this.f21582g;
        if (liveTextView == null) {
            l.a("mTitle");
        }
        liveTextView.setText(cVar.f21498b);
        LinearLayoutCompat linearLayoutCompat = this.f21583h;
        if (linearLayoutCompat == null) {
            l.a("mChooseContainer");
        }
        com.bytedance.android.livesdk.survey.a.c cVar2 = aVar.f21492b.get(0);
        l.b(cVar2, "");
        b.a(linearLayoutCompat, cVar2, R.layout.be9, 24, 8.0f, this.f21586k);
        LiveTextView liveTextView2 = this.f21585j;
        if (liveTextView2 == null) {
            l.a("mFeedbackTip");
        }
        liveTextView2.setText(aVar.f21493c);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.efh);
        l.b(findViewById, "");
        this.f21580e = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.efm);
        l.b(findViewById2, "");
        this.f21581f = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.efo);
        l.b(findViewById3, "");
        this.f21582g = (LiveTextView) findViewById3;
        View findViewById4 = findViewById(R.id.efg);
        l.b(findViewById4, "");
        this.f21583h = (LinearLayoutCompat) findViewById4;
        View findViewById5 = findViewById(R.id.efj);
        l.b(findViewById5, "");
        this.f21584i = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(R.id.efl);
        l.b(findViewById6, "");
        this.f21585j = (LiveTextView) findViewById6;
        this.f21579d = 52.0f;
        e();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(h.class, (h.f.a.b) new c(this)).b(p.class, (h.f.a.b) new d(this));
        }
        ImageView imageView = this.f21580e;
        if (imageView == null) {
            l.a("mCloseButton");
        }
        imageView.setOnClickListener(new e(this));
        if (this.f21587l) {
            hide();
        } else {
            show();
        }
        com.bytedance.android.livesdk.survey.a.a aVar = this.f21588m;
        if (aVar != null) {
            a(aVar);
        }
    }

    static final class a extends h.f.b.m implements m<String, Long, z> {
        final /* synthetic */ SurveyCardWidget this$0;

        static {
            Covode.recordClassIndex(12734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SurveyCardWidget surveyCardWidget) {
            super(2);
            this.this$0 = surveyCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Long l2) {
            String str2 = str;
            long longValue = l2.longValue();
            l.d(str2, "");
            DataChannel dataChannel = this.this$0.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.livesdk.survey.c.class, new com.bytedance.android.livesdk.survey.b(str2, longValue));
            }
            return z.f158842a;
        }
    }
}
