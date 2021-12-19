package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f100655g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Activity f100656a;

    /* renamed from: b  reason: collision with root package name */
    public final InputViewDelegate f100657b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f100658c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c f100659d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b f100660e;

    /* renamed from: f  reason: collision with root package name */
    public final String f100661f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f100662h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f100663i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f100664j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f100665k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f100666l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f100667m;
    private final h.h n;
    private final h.h o;
    private final Handler p;
    private final View q;

    static {
        Covode.recordClassIndex(64390);
    }

    private final LinearLayout a() {
        return (LinearLayout) this.f100662h.getValue();
    }

    private final int b() {
        return ((Number) this.f100663i.getValue()).intValue();
    }

    private final int c() {
        return ((Number) this.f100664j.getValue()).intValue();
    }

    private final int d() {
        return ((Number) this.f100665k.getValue()).intValue();
    }

    private final int e() {
        return ((Number) this.f100666l.getValue()).intValue();
    }

    private final int f() {
        return ((Number) this.f100667m.getValue()).intValue();
    }

    private final int g() {
        return ((Number) this.n.getValue()).intValue();
    }

    private final int h() {
        return ((Number) this.o.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64391);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.f100658c.findViewById(R.id.av_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$b  reason: collision with other inner class name */
    static final class C2489b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2489b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 5.0f));
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 5.0f));
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 102.6f));
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 80.0f));
        }
    }

    static final class h extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 218.0f));
        }
    }

    static final class i extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 96.0f));
        }
    }

    static final class j extends m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) n.b(this.this$0.f100658c.getContext(), 181.0f));
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100670a;

        static {
            Covode.recordClassIndex(64401);
        }

        k(b bVar) {
            this.f100670a = bVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar = this.f100670a.f100659d;
            if (cVar != null && cVar.isShowing() && this.f100670a.f100656a != null && !this.f100670a.f100656a.isFinishing()) {
                cVar.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.g.a f100669b;

        static {
            Covode.recordClassIndex(64396);
        }

        f(b bVar, com.ss.android.ugc.aweme.emoji.g.a aVar) {
            this.f100668a = bVar;
            this.f100669b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.emoji.b.a aVar = new com.ss.android.ugc.aweme.emoji.b.a();
            aVar.f89105c = com.ss.android.ugc.aweme.emoji.d.a.a.b(this.f100669b);
            aVar.f89106d = this.f100669b;
            this.f100668a.f100657b.a(aVar);
            this.f100668a.f100660e.m();
            String str = this.f100668a.f100661f;
            String.valueOf(this.f100669b.getId());
            a.C2482a aVar2 = a.C2482a.f100621a;
            l.d(str, "");
            l.d(aVar2, "");
            androidx.c.a aVar3 = new androidx.c.a();
            aVar3.put("to_user_id", str);
            aVar2.invoke("auto_emoji_click", aVar3);
        }
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
        int d2;
        int a2;
        int f2;
        MethodCollector.i(5321);
        this.p.removeCallbacksAndMessages(null);
        if (list == null || list.isEmpty()) {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar = this.f100659d;
            if (cVar != null) {
                if (cVar.isShowing()) {
                    cVar.dismiss();
                }
                MethodCollector.o(5321);
                return;
            }
            MethodCollector.o(5321);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a.a(this.f100661f);
        if (list.size() == 1) {
            d2 = b();
            a2 = n.a(this.f100658c.getContext()) - b();
            f2 = f();
        } else if (list.size() == 2) {
            d2 = c();
            a2 = n.a(this.f100658c.getContext()) - c();
            f2 = f();
        } else {
            d2 = d();
            a2 = n.a(this.f100658c.getContext()) - d();
            f2 = f();
        }
        int i2 = a2 - f2;
        a().removeAllViews();
        for (com.ss.android.ugc.aweme.emoji.g.a aVar : list) {
            LinearLayout a3 = a();
            LinearLayout a4 = a();
            l.b(a4, "");
            a3.addView(a(a4.getContext(), aVar));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = h();
        layoutParams.width = d2;
        this.f100658c.setLayoutParams(layoutParams);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar2 = this.f100659d;
        if (cVar2 == null || !cVar2.isShowing()) {
            this.f100659d = new com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c();
        } else {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar3 = this.f100659d;
            if (cVar3 != null) {
                cVar3.dismiss();
            }
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar4 = this.f100659d;
        if (cVar4 != null) {
            cVar4.a(this.f100658c, layoutParams.width, layoutParams.height);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar5 = this.f100659d;
        if (cVar5 != null) {
            cVar5.f101277a = 0;
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar6 = this.f100659d;
        if (cVar6 != null) {
            cVar6.b(this.q, i2, -g());
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.c cVar7 = this.f100659d;
        if (cVar7 != null) {
            cVar7.update(layoutParams.width, layoutParams.height);
        }
        this.p.postDelayed(new k(this), 5000);
        MethodCollector.o(5321);
    }

    private final View a(Context context, com.ss.android.ugc.aweme.emoji.g.a aVar) {
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(e(), e());
        marginLayoutParams.rightMargin = f();
        remoteImageView.setLayoutParams(marginLayoutParams);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://" + com.ss.android.ugc.aweme.emoji.utils.c.b(aVar));
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://" + com.ss.android.ugc.aweme.emoji.utils.c.b(aVar));
        ah.a(remoteImageView, urlModel, null, true);
        remoteImageView.setOnClickListener(new f(this, aVar));
        return remoteImageView;
    }

    public b(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar, View view, String str) {
        Activity activity;
        l.d(bVar, "");
        l.d(view, "");
        l.d(str, "");
        MethodCollector.i(5338);
        this.f100660e = bVar;
        this.q = view;
        this.f100661f = str;
        Context context = view.getContext();
        l.b(context, "");
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        activity = null;
        this.f100656a = activity;
        this.f100657b = new InputViewDelegate(this.f100660e);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a72, (ViewGroup) null);
        if (inflate != null) {
            this.f100658c = (ViewGroup) inflate;
            this.f100662h = h.i.a((h.f.a.a) new e(this));
            this.f100663i = h.i.a((h.f.a.a) new i(this));
            this.f100664j = h.i.a((h.f.a.a) new j(this));
            this.f100665k = h.i.a((h.f.a.a) new h(this));
            this.f100666l = h.i.a((h.f.a.a) new g(this));
            this.f100667m = h.i.a((h.f.a.a) new C2489b(this));
            this.n = h.i.a((h.f.a.a) new c(this));
            this.o = h.i.a((h.f.a.a) new d(this));
            this.p = new Handler(Looper.getMainLooper());
            MethodCollector.o(5338);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(5338);
        throw nullPointerException;
    }
}
