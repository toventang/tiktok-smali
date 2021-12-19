package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class o extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private LottieAnimationView f16665g;

    static {
        Covode.recordClassIndex(9243);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean c() {
        b();
        return false;
    }

    private void d() {
        this.f16665g.a(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.chatroom.widget.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9244);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                o.this.b();
            }
        });
        this.f16665g.a();
    }

    public final void b() {
        this.f16665g.d();
        animate().alpha(0.0f).setDuration(200).setListener(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.chatroom.widget.o.AnonymousClass2 */

            static {
                Covode.recordClassIndex(9245);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (o.this.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o.this.getParent()).post(new q(this));
                }
            }
        }).start();
    }

    private o(Context context) {
        this(context, (byte) 0);
    }

    public static void a(ViewGroup viewGroup) {
        MethodCollector.i(2809);
        if (viewGroup == null || viewGroup.getContext() == null) {
            MethodCollector.o(2809);
            return;
        }
        o oVar = new o(viewGroup.getContext());
        viewGroup.addView(oVar, -1, -1);
        oVar.d();
        oVar.setAlpha(0.0f);
        oVar.animate().alpha(1.0f).setDuration(300).start();
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", d.a().e());
        b.a.a("draw_guide_show").a((Map<String, String>) hashMap).a().b();
        MethodCollector.o(2809);
    }

    private o(Context context, byte b2) {
        this(context, (char) 0);
    }

    private o(Context context, char c2) {
        super(context, null, 0);
        inflate(getContext(), R.layout.bbq, this);
        this.f16665g = (LottieAnimationView) findViewById(R.id.e60);
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new p(this));
    }
}
