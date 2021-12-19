package com.ss.android.ugc.gamora.recorder.choosemusic.recommend;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.p;
import h.z;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f147620f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.h f147621a = h.i.a((h.f.a.a) new f(this));

    /* renamed from: b  reason: collision with root package name */
    final h.h f147622b = h.i.a((h.f.a.a) new l(this));

    /* renamed from: c  reason: collision with root package name */
    final Handler f147623c = new Handler(Looper.getMainLooper(), new d(this));

    /* renamed from: d  reason: collision with root package name */
    public boolean f147624d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.b<Boolean, z> f147625e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f147626g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f147627h = h.i.a((h.f.a.a) new g(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f147628i = h.i.a((h.f.a.a) new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f147629j = h.i.a((h.f.a.a) new i(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f147630k = h.i.a((h.f.a.a) new h(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f147631l;

    static {
        Covode.recordClassIndex(97287);
    }

    public final View a() {
        return (View) this.f147626g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TextView b() {
        return (TextView) this.f147627h.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TextView c() {
        return (TextView) this.f147628i.getValue();
    }

    public final ImageView d() {
        return (ImageView) this.f147629j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ObjectAnimator e() {
        return (ObjectAnimator) this.f147630k.getValue();
    }

    public final com.bytedance.tux.tooltip.a f() {
        return (com.bytedance.tux.tooltip.a) this.f147631l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97288);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a().findViewById(R.id.cps);
        }
    }

    static final class f extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.a().findViewById(R.id.cqi);
        }
    }

    static final class g extends m implements h.f.a.a<TextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a().findViewById(R.id.crb);
        }
    }

    static final class i extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.a().findViewById(R.id.d5u);
        }
    }

    static final class l extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.a().findViewById(R.id.fcp);
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(97292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(9014);
            View inflate = LayoutInflater.from(this.$context).inflate(R.layout.f2, (ViewGroup) null);
            MethodCollector.o(9014);
            return inflate;
        }
    }

    public final void g() {
        if (f().isShowing()) {
            this.f147624d = false;
            f().dismiss();
        }
    }

    static final class h extends m implements h.f.a.a<ObjectAnimator> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.d(), "rotation", 0.0f, 360.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(4000L);
            ofFloat.setRepeatCount(-1);
            return ofFloat;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$b  reason: collision with other inner class name */
    static final class C3968b extends m implements h.f.a.a<com.bytedance.tux.tooltip.a> {
        final /* synthetic */ p $anchorViewPosition;
        final /* synthetic */ Context $context;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3968b(b bVar, Context context, p pVar) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
            this.$anchorViewPosition = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.tooltip.a invoke() {
            com.bytedance.tux.tooltip.c cVar = new com.bytedance.tux.tooltip.c(this.$context);
            View a2 = this.this$0.a();
            h.f.b.l.b(a2, "");
            return cVar.a(a2).a(true, (View.OnClickListener) null).a(true).b(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b.C3968b.AnonymousClass1 */
                final /* synthetic */ C3968b this$0;

                static {
                    Covode.recordClassIndex(97290);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.f147625e.invoke(true);
                    return z.f158842a;
                }
            }).a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b.C3968b.AnonymousClass2 */
                final /* synthetic */ C3968b this$0;

                static {
                    Covode.recordClassIndex(97291);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.f147625e.invoke(false);
                    return z.f158842a;
                }
            }).a(((Number) this.$anchorViewPosition.getFirst()).intValue(), ((Number) this.$anchorViewPosition.getSecond()).intValue()).a(com.bytedance.tux.tooltip.h.BOTTOM).c(r.b(this.$context, 9.0f)).d();
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147634b;

        static {
            Covode.recordClassIndex(97299);
        }

        j(b bVar, h.f.a.a aVar) {
            this.f147633a = bVar;
            this.f147634b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147633a.f147624d = false;
            this.f147634b.invoke();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147635a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147636b;

        static {
            Covode.recordClassIndex(97300);
        }

        k(b bVar, h.f.a.a aVar) {
            this.f147635a = bVar;
            this.f147636b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147635a.f147624d = false;
            this.f147636b.invoke();
        }
    }

    static final class d implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f147632a;

        static {
            Covode.recordClassIndex(97293);
        }

        d(b bVar) {
            this.f147632a = bVar;
        }

        public final boolean handleMessage(Message message) {
            h.f.b.l.d(message, "");
            if (message.what == 1 && this.f147632a.f147624d) {
                this.f147632a.f().dismiss();
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, p<Integer, Integer> pVar, h.f.a.b<? super Boolean, z> bVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(pVar, "");
        h.f.b.l.d(bVar, "");
        this.f147625e = bVar;
        this.f147626g = h.i.a((h.f.a.a) new c(context));
        this.f147631l = h.i.a((h.f.a.a) new C3968b(this, context, pVar));
        this.f147624d = true;
    }
}
