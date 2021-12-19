package com.ss.android.ugc.aweme.specact.pendant.views;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f134340a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.c.a.a.a f134341b;

    /* renamed from: c  reason: collision with root package name */
    public View f134342c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f134343d;

    /* renamed from: e  reason: collision with root package name */
    public View f134344e;

    /* renamed from: f  reason: collision with root package name */
    public View f134345f;

    /* renamed from: g  reason: collision with root package name */
    public View f134346g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f134347h;

    /* renamed from: i  reason: collision with root package name */
    public View f134348i;

    /* renamed from: j  reason: collision with root package name */
    public String f134349j;

    /* renamed from: k  reason: collision with root package name */
    public String f134350k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f134351l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.c.c.a f134352m;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private AbstractC3492a t;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$a  reason: collision with other inner class name */
    public interface AbstractC3492a {
        static {
            Covode.recordClassIndex(87848);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(87847);
    }

    private final View getPendantLayout() {
        return (View) this.s.getValue();
    }

    public final ImageView getCloseView() {
        return (ImageView) this.r.getValue();
    }

    public final SmartImageView getSmallSmartImageView() {
        return (SmartImageView) this.q.getValue();
    }

    public final SmartImageView getSmartImageView() {
        return (SmartImageView) this.p.getValue();
    }

    public static final class g implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(87854);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        g() {
        }
    }

    public final boolean getStaticPendantIsFold() {
        return this.f134340a;
    }

    public final AbstractC3492a getSubViewListener() {
        return this.t;
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.d31);
        }
    }

    static final class f extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.d33);
        }
    }

    static final class h extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.e6e);
        }
    }

    static final class i extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.t_);
        }
    }

    public final void a() {
        setCanDrag(true);
        this.f134340a = false;
        getSmartImageView().setVisibility(0);
        getSmallSmartImageView().setVisibility(8);
        a(80.0f, 80.0f);
        getSmartImageView().setImageURI(this.f134349j);
        setCloseViewStatus(true);
    }

    public final void setSubViewListener(AbstractC3492a aVar) {
        this.t = aVar;
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134353a;

        static {
            Covode.recordClassIndex(87849);
        }

        public b(a aVar) {
            this.f134353a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC3492a subViewListener = this.f134353a.getSubViewListener();
            if (subViewListener != null) {
                subViewListener.a();
            }
        }
    }

    public final void setCloseViewStatus(boolean z) {
        int i2;
        ImageView closeView = getCloseView();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        closeView.setVisibility(i2);
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134358b;

        static {
            Covode.recordClassIndex(87852);
        }

        public e(a aVar, String str) {
            this.f134357a = aVar;
            this.f134358b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.specact.pendant.c.c.a aVar = this.f134357a.f134352m;
            if (aVar != null) {
                aVar.a();
            }
            r.a("widget_bubble2_close_click", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, this.f134358b).f66730a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.p = h.i.a((h.f.a.a) new i(this));
        this.q = h.i.a((h.f.a.a) new h(this));
        this.r = h.i.a((h.f.a.a) new c(this));
        this.s = h.i.a((h.f.a.a) new f(this));
        this.f134349j = "";
        this.f134350k = "";
        this.f134351l = true;
        Objects.requireNonNull(com.a.a(LayoutInflater.from(context), R.layout.b1i, this, true), "null cannot be cast to non-null type android.view.View");
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134355b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f134356c;

        static {
            Covode.recordClassIndex(87851);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            float width;
            a aVar = this.f134354a;
            String str = this.f134355b;
            boolean z = this.f134356c;
            l.d(str, "");
            aVar.getSmartImageView().setVisibility(8);
            aVar.getSmallSmartImageView().setVisibility(0);
            aVar.getSmallSmartImageView().setImageURI(str);
            aVar.a(32.0f, 107.0f);
            if (aVar.getParent() != null) {
                ViewParent parent = aVar.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                if (!z) {
                    width = n.b(aVar.getContext(), -8.0f);
                } else {
                    width = ((float) view.getWidth()) - n.b(aVar.getContext(), 32.0f);
                }
                aVar.animate().setListener(new g()).x(width).y(aVar.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            }
        }

        public d(a aVar, String str, boolean z) {
            this.f134354a = aVar;
            this.f134355b = str;
            this.f134356c = z;
        }
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    public final void a(float f2, float f3) {
        int i2;
        int c2 = n.c(getContext(), ((float) n.e(getContext())) + 0.0f);
        if (com.ss.android.ugc.aweme.specact.pendant.h.g.a()) {
            i2 = 80;
        } else {
            i2 = 70;
        }
        int i3 = c2 + i2;
        ViewGroup.LayoutParams layoutParams = getPendantLayout().getLayoutParams();
        layoutParams.height = (int) n.b(getContext(), f3);
        layoutParams.width = (int) n.b(getContext(), f2);
        getPendantLayout().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) n.b(getContext(), (float) i3);
        }
        setLayoutParams(layoutParams2);
    }
}
