package com.ss.android.ugc.aweme.kids.homepage.policynotice.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a implements i, j {

    /* renamed from: d  reason: collision with root package name */
    public boolean f106662d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f106663e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106664f;

    static {
        Covode.recordClassIndex(68162);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(89, new g(b.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b$b  reason: collision with other inner class name */
    static final class C2727b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(68164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2727b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    public final void dismiss() {
        cg.b(this);
        super.dismiss();
        if (this.f106662d) {
            v.O().y();
            this.f106662d = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106667a;

        static {
            Covode.recordClassIndex(68168);
        }

        d(b bVar) {
            this.f106667a = bVar;
        }

        public final void run() {
            if (this.f106667a.isShowing()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                    this.f106667a.f106662d = true;
                    return;
                }
                this.f106667a.a();
            }
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.video.i O = v.O();
        l.b(O, "");
        if (O.o()) {
            v.O().B();
            this.f106662d = true;
            return;
        }
        this.f106663e.postDelayed(new d(this), 1000);
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(68163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.a(bVar2);
            return z.f158842a;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f106665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b f106666b;

        static {
            Covode.recordClassIndex(68165);
        }

        c(b bVar, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2) {
            this.f106665a = bVar;
            this.f106666b = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar = this.f106666b;
            Context context = this.f106665a.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(bVar, context, new h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(68166);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
                    com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
                    l.d(bVar2, "");
                    this.this$0.f106665a.a(bVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(68167);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f106665a.dismiss();
                    return z.f158842a;
                }
            });
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this.f106664f, bVar);
        Context context = getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context);
        dismiss();
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a aVar) {
        l.d(aVar, "");
        if (TextUtils.equals(aVar.f106614b.optString("eventName"), "cancel_post_success")) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        setContentView(R.layout.ac8);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
        if (!l.a((Object) this.f106664f.isSubPopUp(), (Object) true)) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        tuxTextView.setText(this.f106664f.getTitle());
        tuxTextView.setTuxFont(23);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.adh);
        Context context = tuxTextView2.getContext();
        l.b(context, "");
        tuxTextView2.setText(com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context, this.f106664f.getBody(), this.f106664f.getPolicyLinkList(), new a(this), new C2727b(this)));
        tuxTextView2.setHighlightColor(androidx.core.content.b.c(tuxTextView2.getContext(), R.color.c9));
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.a0s);
        tuxTextView3.setTuxFont(43);
        a(tuxTextView3, this.f106664f.getActions().get(0));
        if (this.f106664f.getActions().size() > 1) {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.a0t);
            tuxTextView4.setVisibility(0);
            a(tuxTextView4, this.f106664f.getActions().get(1));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.a0t);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
        cg.a(this);
    }

    private final void a(TextView textView, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        if (textView != null) {
            textView.setText(bVar.f106622a);
            textView.setOnClickListener(new c(this, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar) {
        super(context);
        l.d(context, "");
        l.d(aVar, "");
        this.f106664f = aVar;
    }
}
