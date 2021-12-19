package com.ss.android.ugc.aweme.tools.beauty.a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.b.a.d;
import com.ss.android.ugc.aweme.tools.beauty.views.b;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.i;
import h.z;
import java.util.Objects;

public class h extends RecyclerView.ViewHolder {

    /* renamed from: l  reason: collision with root package name */
    public static final a f138807l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final Context f138808a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f138809b;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.tools.beauty.views.b f138810e = ((com.ss.android.ugc.aweme.tools.beauty.views.b) this.itemView.findViewById(R.id.bt1));

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f138811f = ((ImageView) this.itemView.findViewById(R.id.bue));

    /* renamed from: g  reason: collision with root package name */
    final View f138812g = this.itemView.findViewById(R.id.bt2);

    /* renamed from: h  reason: collision with root package name */
    int f138813h;

    /* renamed from: i  reason: collision with root package name */
    public m<? super ComposerBeauty, ? super Integer, z> f138814i;

    /* renamed from: j  reason: collision with root package name */
    public final View f138815j;

    /* renamed from: k  reason: collision with root package name */
    public final d f138816k;

    static {
        Covode.recordClassIndex(90790);
    }

    /* access modifiers changed from: package-private */
    public final ObjectAnimator a() {
        return (ObjectAnimator) this.f138809b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90791);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h$a$a  reason: collision with other inner class name */
        static final class C3662a extends h.f.b.m implements h.f.a.b<b.a, z> {
            final /* synthetic */ d $config;
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(90792);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3662a(d dVar, View view) {
                super(1);
                this.$config = dVar;
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(b.a aVar) {
                b.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f150394d = this.$config.f138847e;
                Context context = this.$itemView.getContext();
                l.b(context, "");
                aVar2.f150395e = (int) r.a(context, this.$config.f138846d);
                Context context2 = this.$itemView.getContext();
                l.b(context2, "");
                aVar2.f150398h = (int) r.a(context2, this.$config.f138845c);
                Context context3 = this.$itemView.getContext();
                l.b(context3, "");
                aVar2.f150397g = (int) r.a(context3, this.$config.f138844b);
                aVar2.f150399i = this.$config.f138849g;
                aVar2.o = this.$config.f138848f;
                aVar2.f150400j = this.$config.f138852j;
                aVar2.s = this.$config.f138850h;
                aVar2.f150403m = this.$config.f138855m;
                aVar2.r = this.$config.p;
                aVar2.q = this.$config.o;
                aVar2.f139257a = this.$config.f138851i;
                aVar2.f139258b = this.$config.n;
                return z.f158842a;
            }
        }

        public static com.ss.android.ugc.aweme.tools.beauty.views.b a(View view, d dVar) {
            l.d(view, "");
            l.d(dVar, "");
            Context context = view.getContext();
            l.b(context, "");
            return b.C3677b.a(context, new C3662a(dVar, view));
        }

        public static Drawable a(Context context, boolean z, float f2) {
            l.d(context, "");
            int color = context.getResources().getColor(R.color.d9);
            if (z) {
                return b.a.a().a(1).b(color).a(color, 0).a();
            }
            return b.a.a().a(0).b(color).a(r.a(context, f2)).a(color, 0).a();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ObjectAnimator> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(90794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.f138811f, "rotation", 0.0f, 360.0f);
            l.b(ofFloat, "");
            ofFloat.setDuration(800L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        ObjectAnimator a2 = a();
        if (a2.isRunning()) {
            a2.cancel();
        }
        ImageView imageView = this.f138811f;
        l.b(imageView, "");
        imageView.setRotation(0.0f);
        this.f138811f.setImageResource(2131230946);
    }

    public void a(boolean z) {
        float f2;
        View view = this.f138815j;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.34f;
        }
        view.setAlpha(f2);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UrlModel f138817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposerBeauty f138818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f138819c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f138820d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f138821e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f138822f;

        static {
            Covode.recordClassIndex(90793);
        }

        b(UrlModel urlModel, ComposerBeauty composerBeauty, h hVar, c cVar, boolean z, boolean z2) {
            this.f138817a = urlModel;
            this.f138818b = composerBeauty;
            this.f138819c = hVar;
            this.f138820d = cVar;
            this.f138821e = z;
            this.f138822f = z2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f138818b.getEnable()) {
                com.ss.android.ugc.aweme.tools.beauty.e.b.c cVar = com.ss.android.ugc.aweme.tools.beauty.e.a.f138913c;
                if (cVar != null) {
                    Context context = this.f138819c.f138815j.getContext();
                    l.b(context, "");
                    String string = this.f138819c.f138815j.getContext().getString(R.string.fvu);
                    l.b(string, "");
                    cVar.a(context, string);
                    return;
                }
                return;
            }
            m<? super ComposerBeauty, ? super Integer, z> mVar = this.f138819c.f138814i;
            if (mVar != null) {
                mVar.invoke(this.f138818b, Integer.valueOf(this.f138819c.getLayoutPosition()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, d dVar) {
        super(view);
        l.d(view, "");
        l.d(dVar, "");
        this.f138815j = view;
        this.f138816k = dVar;
        Context context = view.getContext();
        l.b(context, "");
        this.f138808a = context;
        this.f138813h = 1;
        this.f138809b = i.a((h.f.a.a) new c(this));
    }

    public final void a(boolean z, boolean z2) {
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = (int) com.ss.android.ugc.aweme.dependence.beauty.a.a.b(this.f138808a);
        if (z) {
            marginLayoutParams.leftMargin = (int) com.ss.android.ugc.aweme.dependence.beauty.a.a.c(this.f138808a);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd((int) com.ss.android.ugc.aweme.dependence.beauty.a.a.b(this.f138808a));
        if (z) {
            marginLayoutParams.setMarginStart((int) com.ss.android.ugc.aweme.dependence.beauty.a.a.c(this.f138808a));
        } else {
            marginLayoutParams.setMarginStart(0);
        }
        if (z2) {
            marginLayoutParams.rightMargin = (int) com.ss.android.ugc.aweme.dependence.beauty.a.a.c(this.f138808a);
            int i3 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginEnd((int) com.ss.android.ugc.aweme.dependence.beauty.a.a.c(this.f138808a));
        }
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setLayoutParams(marginLayoutParams);
    }
}
