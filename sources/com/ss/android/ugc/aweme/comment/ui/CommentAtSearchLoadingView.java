package com.ss.android.ugc.aweme.comment.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class CommentAtSearchLoadingView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72477a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f72478b;

    /* renamed from: c  reason: collision with root package name */
    private final h f72479c;

    static {
        Covode.recordClassIndex(44670);
    }

    public CommentAtSearchLoadingView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final ObjectAnimator getLoadingAnimator() {
        return (ObjectAnimator) this.f72479c.getValue();
    }

    public final View getView() {
        return (View) this.f72478b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44671);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CommentAtSearchLoadingView this$0;

        static {
            Covode.recordClassIndex(44673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommentAtSearchLoadingView commentAtSearchLoadingView, Context context) {
            super(0);
            this.this$0 = commentAtSearchLoadingView;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(880);
            View inflate = View.inflate(this.$context, R.layout.jx, this.this$0);
            MethodCollector.o(880);
            return inflate;
        }
    }

    static final class b extends m implements h.f.a.a<ObjectAnimator> {
        final /* synthetic */ CommentAtSearchLoadingView this$0;

        static {
            Covode.recordClassIndex(44672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommentAtSearchLoadingView commentAtSearchLoadingView) {
            super(0);
            this.this$0 = commentAtSearchLoadingView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ObjectAnimator invoke() {
            View view = this.this$0.getView();
            l.b(view, "");
            return ObjectAnimator.ofFloat(view.findViewById(R.id.byv), "rotation", 360.0f);
        }
    }

    private final void a() {
        getLoadingAnimator().setDuration(1000L);
        getLoadingAnimator().setRepeatCount(-1);
        getLoadingAnimator().setInterpolator(new LinearInterpolator());
        getLoadingAnimator().start();
    }

    public final void a(boolean z) {
        if (z == getLoadingAnimator().isRunning()) {
            return;
        }
        if (z) {
            a();
        } else {
            getLoadingAnimator().cancel();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(733);
        this.f72478b = i.a((h.f.a.a) new c(this, context));
        this.f72479c = i.a((h.f.a.a) new b(this));
        MethodCollector.o(733);
    }
}
