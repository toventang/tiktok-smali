package com.ss.android.ugc.aweme.account.agegate.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f62832g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f62833a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f62834b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f62835c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f62836d;

    /* renamed from: e  reason: collision with root package name */
    public final k f62837e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f62838f;

    static {
        Covode.recordClassIndex(38702);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38703);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(38706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f62833a) {
                com.bytedance.tux.sheet.sheet.a aVar = this.this$0.f62834b;
                if (aVar == null) {
                    l.a("regionSelectSheet");
                }
                aVar.dismiss();
            } else {
                LinearLayout linearLayout = this.this$0.f62835c;
                if (linearLayout == null) {
                    l.a("regionSelectViews");
                }
                new com.bytedance.tux.g.b(linearLayout).a("To continue, please select your registration region").a(3000L).b();
            }
            return z.f158842a;
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f62839a;

        static {
            Covode.recordClassIndex(38704);
        }

        public b(e eVar) {
            this.f62839a = eVar;
        }

        public final void onClick(View view) {
            Activity activity;
            ClickAgent.onClick(view);
            IRegionMockService iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class);
            Context context = this.f62839a.f62838f;
            if (context != null) {
                activity = com.ss.android.ugc.aweme.base.a.e.a(context);
            } else {
                activity = null;
            }
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            iRegionMockService.a((androidx.fragment.app.e) activity, new h.f.a.b<String, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.util.e.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(38705);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(String str) {
                    MethodCollector.i(9450);
                    String str2 = str;
                    l.d(str2, "");
                    TextView textView = this.this$0.f62839a.f62836d;
                    if (textView == null) {
                        l.a("regionSelect");
                    }
                    if (textView != null) {
                        textView.setText("Your account will be registered in ".concat(String.valueOf(str2)));
                    }
                    this.this$0.f62839a.f62833a = true;
                    p pVar = p.f65499b;
                    l.d(str2, "");
                    synchronized (pVar) {
                        try {
                            p.f65498a = str2;
                        } catch (Throwable th) {
                            MethodCollector.o(9450);
                            throw th;
                        }
                    }
                    z zVar = z.f158842a;
                    MethodCollector.o(9450);
                    return zVar;
                }
            });
        }
    }

    public e(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        this.f62837e = kVar;
        this.f62838f = context;
    }
}
