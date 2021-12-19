package com.bytedance.android.livesdk.container.k;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.android.live.b.i;
import com.bytedance.android.livesdk.container.c;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends FrameLayout implements c, com.bytedance.android.livesdk.container.h.a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.container.c.a f16834a;

    /* renamed from: b  reason: collision with root package name */
    private HybridConfig f16835b;

    /* renamed from: c  reason: collision with root package name */
    private String f16836c;

    /* renamed from: d  reason: collision with root package name */
    private LiveLoadingView f16837d;

    /* renamed from: e  reason: collision with root package name */
    private i.c f16838e;

    /* renamed from: com.bytedance.android.livesdk.container.k.b$b  reason: collision with other inner class name */
    public final /* synthetic */ class View$OnClickListenerC0342b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f16840a;

        static {
            Covode.recordClassIndex(9346);
        }

        public View$OnClickListenerC0342b(h.f.a.b bVar) {
            this.f16840a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f16840a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(9344);
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final FrameLayout getFrameLayout() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final void c() {
        com.bytedance.android.livesdk.container.c.a aVar = this.f16834a;
        if (aVar == null) {
            l.a("component");
        }
        aVar.e();
    }

    public final com.bytedance.android.livesdk.container.c.a getComponent() {
        com.bytedance.android.livesdk.container.c.a aVar = this.f16834a;
        if (aVar == null) {
            l.a("component");
        }
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void d() {
        i.c cVar = this.f16838e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f16835b;
            if (hybridConfig == null) {
                l.a("config");
            }
            cVar.b(hybridConfig.getEngineType().getType());
        }
        LiveLoadingView liveLoadingView = this.f16837d;
        if (liveLoadingView == null) {
            l.a("loadingView");
        }
        liveLoadingView.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final void a() {
        com.bytedance.android.livesdk.container.c.a cVar;
        Context context = getContext();
        l.b(context, "");
        setBackgroundColor(context.getResources().getColor(R.color.f159928l));
        LiveLoadingView liveLoadingView = new LiveLoadingView(getContext());
        liveLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context2 = liveLoadingView.getContext();
        l.b(context2, "");
        liveLoadingView.setBackgroundColor(context2.getResources().getColor(R.color.f159928l));
        liveLoadingView.setVisibility(0);
        this.f16837d = liveLoadingView;
        HybridConfig hybridConfig = this.f16835b;
        if (hybridConfig == null) {
            l.a("config");
        }
        if (hybridConfig.getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
            e a2 = p.a(getContext());
            if (a2 == null) {
                l.b();
            }
            HybridConfig hybridConfig2 = this.f16835b;
            if (hybridConfig2 == null) {
                l.a("config");
            }
            String str = this.f16836c;
            if (str == null) {
                l.a("containerId");
            }
            cVar = new com.bytedance.android.livesdk.container.c.b(a2, hybridConfig2, str, this);
        } else {
            e a3 = p.a(getContext());
            if (a3 == null) {
                l.b();
            }
            HybridConfig hybridConfig3 = this.f16835b;
            if (hybridConfig3 == null) {
                l.a("config");
            }
            String str2 = this.f16836c;
            if (str2 == null) {
                l.a("containerId");
            }
            cVar = new com.bytedance.android.livesdk.container.c.c(a3, hybridConfig3, str2, this);
        }
        this.f16834a = cVar;
        cVar.a();
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void e() {
        i.c cVar = this.f16838e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f16835b;
            if (hybridConfig == null) {
                l.a("config");
            }
            cVar.c(hybridConfig.getEngineType().getType());
        }
        LiveLoadingView liveLoadingView = this.f16837d;
        if (liveLoadingView == null) {
            l.a("loadingView");
        }
        liveLoadingView.setVisibility(8);
        HybridConfig hybridConfig2 = this.f16835b;
        if (hybridConfig2 == null) {
            l.a("config");
        }
        if (hybridConfig2.getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
            HybridConfig hybridConfig3 = this.f16835b;
            if (hybridConfig3 == null) {
                l.a("config");
            }
            if (hybridConfig3.getFallbackUrl().length() > 0) {
                HybridConfig hybridConfig4 = this.f16835b;
                if (hybridConfig4 == null) {
                    l.a("config");
                }
                hybridConfig4.setEngineType(com.bytedance.android.livesdk.container.d.a.WEB_VIEW);
                com.bytedance.android.livesdk.container.c.a aVar = this.f16834a;
                if (aVar == null) {
                    l.a("component");
                }
                View f2 = aVar.f();
                if (f2 != null) {
                    removeView(f2);
                }
                com.bytedance.android.livesdk.container.c.a aVar2 = this.f16834a;
                if (aVar2 == null) {
                    l.a("component");
                }
                aVar2.e();
                e a2 = p.a(getContext());
                if (a2 == null) {
                    l.b();
                }
                HybridConfig hybridConfig5 = this.f16835b;
                if (hybridConfig5 == null) {
                    l.a("config");
                }
                String str = this.f16836c;
                if (str == null) {
                    l.a("containerId");
                }
                com.bytedance.android.livesdk.container.c.c cVar2 = new com.bytedance.android.livesdk.container.c.c(a2, hybridConfig5, str, this);
                this.f16834a = cVar2;
                cVar2.a();
                WebView webView = cVar2.f16767f;
                if (webView != null) {
                    addView(webView, 0);
                    HybridConfig hybridConfig6 = this.f16835b;
                    if (hybridConfig6 == null) {
                        l.a("config");
                    }
                    cVar2.a(hybridConfig6.getFallbackUrl());
                }
                i.c cVar3 = this.f16838e;
                if (cVar3 != null) {
                    cVar3.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.android.livesdk.container.k.b, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bytedance.android.livesdk.container.k.b$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.livesdk.container.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.container.k.b.b():void");
    }

    static final class a extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16839a = new a();

        static {
            Covode.recordClassIndex(9345);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            return z.f158842a;
        }
    }

    public final void setComponent(com.bytedance.android.livesdk.container.c.a aVar) {
        l.d(aVar, "");
        this.f16834a = aVar;
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final void setConfig(HybridConfig hybridConfig) {
        l.d(hybridConfig, "");
        this.f16835b = hybridConfig;
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final void setContainerId(String str) {
        l.d(str, "");
        this.f16836c = str;
    }

    @Override // com.bytedance.android.livesdk.container.c
    public final void setHybridLoadListener(i.c cVar) {
        l.d(cVar, "");
        this.f16838e = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(9290);
        MethodCollector.o(9290);
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void a(String str) {
        i.c cVar = this.f16838e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f16835b;
            if (hybridConfig == null) {
                l.a("config");
            }
            cVar.a(hybridConfig.getEngineType().getType());
        }
    }
}
