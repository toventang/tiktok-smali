package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class PkBattleUserInfoLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10966c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f10967a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10968b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f10969d;

    static {
        Covode.recordClassIndex(5864);
    }

    public PkBattleUserInfoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f10969d == null) {
            this.f10969d = new HashMap();
        }
        View view = (View) this.f10969d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f10969d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5865);
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
        a();
    }

    public final void a() {
        AnimatorSet animatorSet = this.f10967a;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f10967a;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f10967a;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            this.f10967a = null;
        }
    }

    public static final class b extends m implements h.f.a.b<ConstraintLayout, z> {
        final /* synthetic */ PkBattleUserInfoLayout this$0;

        static {
            Covode.recordClassIndex(5866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.this$0 = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ConstraintLayout constraintLayout) {
            a(constraintLayout);
            return z.f158842a;
        }

        public final void a(ConstraintLayout constraintLayout) {
            float f2;
            int i2;
            l.d(constraintLayout, "");
            if (this.this$0.f10968b) {
                f2 = 152.0f;
                int id = constraintLayout.getId();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.this$0.a(R.id.c68);
                l.b(constraintLayout2, "");
                if (id == constraintLayout2.getId()) {
                    i2 = 2131234108;
                } else {
                    i2 = 2131234106;
                }
            } else {
                f2 = 130.0f;
                int id2 = constraintLayout.getId();
                ConstraintLayout constraintLayout3 = (ConstraintLayout) this.this$0.a(R.id.c68);
                l.b(constraintLayout3, "");
                if (id2 == constraintLayout3.getId()) {
                    i2 = 2131234107;
                } else {
                    i2 = 2131234105;
                }
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = y.a(f2);
            constraintLayout.setLayoutParams(layoutParams);
            constraintLayout.setBackgroundResource(i2);
        }
    }

    public static final class c extends m implements h.f.a.b<LiveTextView, z> {
        final /* synthetic */ PkBattleUserInfoLayout this$0;

        static {
            Covode.recordClassIndex(5867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.this$0 = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(LiveTextView liveTextView) {
            a(liveTextView);
            return z.f158842a;
        }

        public final void a(LiveTextView liveTextView) {
            float f2;
            l.d(liveTextView, "");
            if (this.this$0.f10968b) {
                f2 = 12.0f;
            } else {
                f2 = 4.0f;
            }
            ViewGroup.LayoutParams layoutParams = liveTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            int id = liveTextView.getId();
            LiveTextView liveTextView2 = (LiveTextView) this.this$0.a(R.id.f1q);
            l.b(liveTextView2, "");
            if (id == liveTextView2.getId()) {
                aVar.rightMargin = y.a(f2);
            } else {
                aVar.leftMargin = y.a(f2);
            }
            liveTextView.setLayoutParams(aVar);
        }
    }

    public static final class d extends m implements h.f.a.b<VHeadView, z> {
        final /* synthetic */ PkBattleUserInfoLayout this$0;

        static {
            Covode.recordClassIndex(5868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.this$0 = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(VHeadView vHeadView) {
            a(vHeadView);
            return z.f158842a;
        }

        public final void a(VHeadView vHeadView) {
            float f2;
            l.d(vHeadView, "");
            if (this.this$0.f10968b) {
                f2 = 28.0f;
            } else {
                f2 = 8.0f;
            }
            ViewGroup.LayoutParams layoutParams = vHeadView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            int id = vHeadView.getId();
            VHeadView vHeadView2 = (VHeadView) this.this$0.a(R.id.byi);
            l.b(vHeadView2, "");
            if (id == vHeadView2.getId()) {
                aVar.rightMargin = y.a(f2);
            } else {
                aVar.leftMargin = y.a(f2);
            }
            vHeadView.setLayoutParams(aVar);
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10971b;

        static {
            Covode.recordClassIndex(5869);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f10970a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.a aVar = this.f10971b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public e(h.f.a.a aVar, h.f.a.a aVar2) {
            this.f10970a = aVar;
            this.f10971b = aVar2;
        }
    }

    private /* synthetic */ PkBattleUserInfoLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PkBattleUserInfoLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        boolean z = false;
        MethodCollector.i(6536);
        this.f10968b = EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0 ? true : z;
        com.a.a(LayoutInflater.from(context), R.layout.bbx, this, true);
        MethodCollector.o(6536);
    }
}
