package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final C3610a f137465a = new C3610a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f137466b;

    /* renamed from: c  reason: collision with root package name */
    private final h f137467c;

    static {
        Covode.recordClassIndex(89919);
    }

    private final ImageView getIvTool() {
        return (ImageView) this.f137467c.getValue();
    }

    public final TextView getTvTool() {
        return (TextView) this.f137466b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a$a  reason: collision with other inner class name */
    public static final class C3610a {
        static {
            Covode.recordClassIndex(89920);
        }

        private C3610a() {
        }

        public /* synthetic */ C3610a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.by0);
        }
    }

    static final class d extends m implements h.f.a.a<TextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.findViewById(R.id.f9a);
        }
    }

    public final Animator getTextFadeOutAnimation() {
        if (getTvTool().getVisibility() != 0) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getTvTool(), "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new b(this));
        return ofFloat;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f137468a;

        static {
            Covode.recordClassIndex(89921);
        }

        b(a aVar) {
            this.f137468a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f137468a.getTvTool().setVisibility(8);
        }
    }

    public final void setContentDescription(int i2) {
        getTvTool().setContentDescription(getContext().getString(i2));
    }

    public final void setIcon(int i2) {
        getIvTool().setImageDrawable(getResources().getDrawable(i2));
    }

    public final void setText(int i2) {
        getTvTool().setText(getContext().getString(i2));
    }

    public final void setTextEnable(boolean z) {
        int i2;
        TextView tvTool = getTvTool();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tvTool.setVisibility(i2);
    }

    public final void setIcon(Drawable drawable) {
        l.d(drawable, "");
        getIvTool().setImageDrawable(drawable);
    }

    public final void setText(String str) {
        l.d(str, "");
        getTvTool().setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3051);
        this.f137466b = i.a((h.f.a.a) new d(this));
        this.f137467c = i.a((h.f.a.a) new c(this));
        com.a.a(LayoutInflater.from(context), R.layout.b24, this, true);
        MethodCollector.o(3051);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
