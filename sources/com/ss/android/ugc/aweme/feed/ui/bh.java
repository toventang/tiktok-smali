package com.ss.android.ugc.aweme.feed.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    static final IQAInvitationService f94357a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f94358b;

    /* renamed from: c  reason: collision with root package name */
    public static final bh f94359c = new bh();

    private bh() {
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f94362a;

        static {
            Covode.recordClassIndex(59939);
        }

        c(LinearLayout linearLayout) {
            this.f94362a = linearLayout;
        }

        public final void run() {
            this.f94362a.setVisibility(0);
        }
    }

    static {
        Covode.recordClassIndex(59936);
        IQAInvitationService b2 = QAInvitationService.b();
        l.b(b2, "");
        f94357a = b2;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayout f94361a;

        static {
            Covode.recordClassIndex(59938);
        }

        b(LinearLayout linearLayout) {
            this.f94361a = linearLayout;
        }

        public final void run() {
            this.f94361a.setVisibility(0);
            LinearLayout linearLayout = this.f94361a;
            AnimatorSet animatorSet = new AnimatorSet();
            if (linearLayout != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 36.0f);
                l.b(ofFloat, "");
                ofFloat.setDuration(250L);
                ofFloat.addUpdateListener(new a(linearLayout));
                animatorSet.play(ofFloat);
                animatorSet.start();
            }
        }
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f94360a;

        static {
            Covode.recordClassIndex(59937);
        }

        a(View view) {
            this.f94360a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f94360a.getLayoutParams();
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
            this.f94360a.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f94363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f94364b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ QaStruct f94365c;

        static {
            Covode.recordClassIndex(59940);
        }

        d(Fragment fragment, String str, QaStruct qaStruct) {
            this.f94363a = fragment;
            this.f94364b = str;
            this.f94365c = qaStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IQAInvitationService iQAInvitationService = bh.f94357a;
            e requireActivity = this.f94363a.requireActivity();
            String str = "";
            l.b(requireActivity, str);
            String str2 = this.f94364b;
            if (str2 != null) {
                str = str2;
            }
            IQAInvitationService.a.a(iQAInvitationService, requireActivity, "post_qa_video", str, com.ss.android.ugc.aweme.qainvitation.e.e.VIDEO, Long.valueOf(this.f94365c.getQuestionId()), Long.valueOf(this.f94365c.getUserId()), AnonymousClass1.f94366a, 64);
        }
    }

    public static void a(Fragment fragment, Aweme aweme, LinearLayout linearLayout, String str, boolean z) {
        String str2;
        List<InteractStickerStruct> interactStickerStructs;
        QaStruct qaStruct;
        if (fragment != null && fragment.isVisible() && !fragment.isDetached() && fragment.getContext() != null && linearLayout != null) {
            linearLayout.setVisibility(8);
            if (!f94358b) {
                if (!z) {
                    f94358b = false;
                }
                T t = null;
                if (aweme != null) {
                    str2 = aweme.getAuthorUid();
                } else {
                    str2 = null;
                }
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!(!l.a((Object) str2, (Object) g2.getCurUserId())) && aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                    Iterator<T> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        T t2 = next;
                        l.b(t2, "");
                        if (t2.getType() == 17) {
                            t = next;
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null && (qaStruct = t3.getQaStruct()) != null && !(!l.a((Object) String.valueOf(qaStruct.getItemId()), (Object) aweme.getAid()))) {
                        if (z) {
                            new Handler(Looper.getMainLooper()).postDelayed(new b(linearLayout), 4500);
                        } else {
                            new Handler(Looper.getMainLooper()).postDelayed(new c(linearLayout), 500);
                        }
                        linearLayout.setOnClickListener(new d(fragment, str, qaStruct));
                    }
                }
            }
        }
    }
}
