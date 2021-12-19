package com.ss.android.ugc.aweme.upvote.publish.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.c.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public boolean f142279g;

    static {
        Covode.recordClassIndex(93040);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.btq);
        if (this.f142279g) {
            lottieAnimationView.a();
            return;
        }
        l.b(lottieAnimationView, "");
        lottieAnimationView.setProgress(1.0f);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142281b;

        static {
            Covode.recordClassIndex(93041);
        }

        public a(String str, h.f.a.a aVar) {
            this.f142280a = str;
            this.f142281b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f142281b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142283b;

        static {
            Covode.recordClassIndex(93042);
        }

        public b(String str, h.f.a.a aVar) {
            this.f142282a = str;
            this.f142283b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f142283b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f142284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142285b;

        static {
            Covode.recordClassIndex(93043);
        }

        public c(String str, h.f.a.a aVar) {
            this.f142284a = str;
            this.f142285b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a aVar = this.f142285b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f142286a;

        static {
            Covode.recordClassIndex(93045);
        }

        public e(h.f.a.a aVar) {
            this.f142286a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f142286a.invoke();
        }
    }

    public final void setAnimFile(String str) {
        l.d(str, "");
        ((LottieAnimationView) findViewById(R.id.btq)).setAnimation(str);
    }

    public final void setAvatar(com.ss.android.ugc.aweme.base.l lVar) {
        v a2 = r.a(lVar);
        a2.E = (SmartAvatarImageView) findViewById(R.id.bu0);
        a2.c();
    }

    public final void setDesc(String str) {
        l.d(str, "");
        View findViewById = findViewById(R.id.eyc);
        l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public final void setTitle(String str) {
        l.d(str, "");
        View findViewById = findViewById(R.id.f9l);
        l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$d  reason: collision with other inner class name */
    static final class C3800d extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ LinearLayout $this_apply;

        static {
            Covode.recordClassIndex(93044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3800d(LinearLayout linearLayout) {
            super(1);
            this.$this_apply = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = Integer.valueOf(androidx.core.content.b.c(this.$this_apply.getContext(), R.color.f159922f));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.bid, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cf7);
        com.bytedance.tux.c.e a2 = f.a(new C3800d(linearLayout));
        Context context2 = linearLayout.getContext();
        l.b(context2, "");
        linearLayout.setBackground(a2.a(context2));
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
