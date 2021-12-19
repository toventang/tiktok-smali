package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.widget.i;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class NoticeView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f131112a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f131113b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f131114c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f131115d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f131116e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f131117f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f131118g;

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f131119a = new d();

        static {
            Covode.recordClassIndex(85921);
        }

        d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(85917);
    }

    private final AVAutoRTLImageView getCloseImage() {
        return (AVAutoRTLImageView) this.f131116e.getValue();
    }

    private final RemoteImageView getIconImage() {
        return (RemoteImageView) this.f131115d.getValue();
    }

    private final LinearLayout getNoticeRoot() {
        return (LinearLayout) this.f131117f.getValue();
    }

    private final TuxTextView getTitleContext() {
        return (TuxTextView) this.f131114c.getValue();
    }

    private final TuxTextView getTitleText() {
        return (TuxTextView) this.f131113b.getValue();
    }

    public final View a(int i2) {
        if (this.f131118g == null) {
            this.f131118g = new HashMap();
        }
        View view = (View) this.f131118g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f131118g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85918);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AVAutoRTLImageView> {
        final /* synthetic */ NoticeView this$0;

        static {
            Covode.recordClassIndex(85919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NoticeView noticeView) {
            super(0);
            this.this$0 = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVAutoRTLImageView invoke() {
            return this.this$0.a(R.id.a7w);
        }
    }

    static final class c extends m implements h.f.a.a<RemoteImageView> {
        final /* synthetic */ NoticeView this$0;

        static {
            Covode.recordClassIndex(85920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NoticeView noticeView) {
            super(0);
            this.this$0 = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.this$0.a(R.id.biw);
        }
    }

    static final class e extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ NoticeView this$0;

        static {
            Covode.recordClassIndex(85922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NoticeView noticeView) {
            super(0);
            this.this$0 = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.a(R.id.cwo);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ NoticeView this$0;

        static {
            Covode.recordClassIndex(85925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(NoticeView noticeView) {
            super(0);
            this.this$0 = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.exf);
        }
    }

    static final class i extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ NoticeView this$0;

        static {
            Covode.recordClassIndex(85926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(NoticeView noticeView) {
            super(0);
            this.this$0 = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.f9l);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f131120a;

        static {
            Covode.recordClassIndex(85923);
        }

        f(h.f.a.a aVar) {
            this.f131120a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131120a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f131121a;

        static {
            Covode.recordClassIndex(85924);
        }

        g(h.f.a.a aVar) {
            this.f131121a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f131121a.invoke();
        }
    }

    public final void setIconImage(Drawable drawable) {
        l.d(drawable, "");
        getIconImage().setImageDrawable(drawable);
    }

    public final void setTitleContent(CharSequence charSequence) {
        l.d(charSequence, "");
        getTitleContext().setText(charSequence);
    }

    public final void setTitleText(CharSequence charSequence) {
        l.d(charSequence, "");
        getTitleText().setText(charSequence);
    }

    public final void setContentClickListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        getTitleContext().setOnClickListener(new f(aVar));
    }

    public final void setOnCloseClickListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        getCloseImage().setOnClickListener(new g(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
        l.d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10738);
        this.f131113b = h.i.a((h.f.a.a) new i(this));
        this.f131114c = h.i.a((h.f.a.a) new h(this));
        this.f131115d = h.i.a((h.f.a.a) new c(this));
        this.f131116e = h.i.a((h.f.a.a) new b(this));
        this.f131117f = h.i.a((h.f.a.a) new e(this));
        View.inflate(context, R.layout.agu, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o5, R.attr.w1, R.attr.a6d, R.attr.aiz, R.attr.aj7, R.attr.aj9});
        l.b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            getIconImage().setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            getCloseImage().setImageDrawable(drawable2);
        }
        getTitleText().setText(obtainStyledAttributes.getString(4));
        getTitleText().setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        getTitleContext().setText(obtainStyledAttributes.getString(3));
        getTitleContext().setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        int color = obtainStyledAttributes.getColor(2, androidx.core.content.b.c(getContext(), R.color.nd));
        obtainStyledAttributes.recycle();
        i.b.a(this, color, en.a(4.0d, context), androidx.core.content.b.c(getContext(), R.color.bo), en.a(12.0d, context), 0, 2);
        getNoticeRoot().setOnClickListener(d.f131119a);
        MethodCollector.o(10738);
    }
}
