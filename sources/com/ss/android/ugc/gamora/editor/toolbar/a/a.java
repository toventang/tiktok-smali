package com.ss.android.ugc.gamora.editor.toolbar.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class a extends PopupWindow implements com.bytedance.ies.dmt.ui.frameworkui.a {

    /* renamed from: a  reason: collision with root package name */
    public PullUpLayout f147020a;

    /* renamed from: b  reason: collision with root package name */
    public final e f147021b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f147022c;

    /* renamed from: d  reason: collision with root package name */
    public final String f147023d;

    /* renamed from: e  reason: collision with root package name */
    public final ReplaceMusicRequest f147024e;

    /* renamed from: f  reason: collision with root package name */
    private final View f147025f;

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f147026g;

    /* renamed from: h  reason: collision with root package name */
    private View f147027h;

    /* renamed from: i  reason: collision with root package name */
    private View f147028i;

    /* renamed from: j  reason: collision with root package name */
    private SmartImageView f147029j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f147030k;

    static {
        Covode.recordClassIndex(96840);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void b() {
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void a() {
        dismiss();
    }

    public final void dismiss() {
        if (isShowing() && !this.f147021b.isFinishing()) {
            PullUpLayout pullUpLayout = this.f147020a;
            if (pullUpLayout == null) {
                l.b();
            }
            if (pullUpLayout.hasWindowFocus()) {
                PullUpLayout pullUpLayout2 = this.f147020a;
                if (pullUpLayout2 == null) {
                    l.b();
                }
                pullUpLayout2.a(0.0f, true);
            }
        }
        try {
            super.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3944a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f147031a;

        static {
            Covode.recordClassIndex(96841);
        }

        View$OnClickListenerC3944a(a aVar) {
            this.f147031a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147031a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f147032a;

        static {
            Covode.recordClassIndex(96842);
        }

        b(a aVar) {
            this.f147032a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147032a.dismiss();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getApplicationService().a(this.f147032a.f147021b);
            new com.bytedance.tux.g.b(this.f147032a.f147021b).e(R.string.fdd).b();
            ReplaceMusicServiceImpl.a().doRequest(this.f147032a.f147023d, this.f147032a.f147024e, this.f147032a.f147021b);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3620);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3620);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar, boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
        super(eVar);
        View view;
        l.d(eVar, "");
        l.d(str, "");
        MethodCollector.i(3617);
        this.f147021b = eVar;
        this.f147022c = z;
        this.f147023d = str;
        this.f147024e = replaceMusicRequest;
        Object a2 = a(com.ss.android.ugc.aweme.df.b.a(), "layout_inflater");
        if (a2 != null) {
            View inflate = ((LayoutInflater) a2).inflate(R.layout.aiz, (ViewGroup) null);
            l.b(inflate, "");
            this.f147025f = inflate;
            View findViewById = inflate.findViewById(R.id.dp0);
            if (findViewById != null) {
                this.f147026g = (RelativeLayout) findViewById;
                View findViewById2 = inflate.findViewById(R.id.ddo);
                if (findViewById2 != null) {
                    PullUpLayout pullUpLayout = (PullUpLayout) findViewById2;
                    this.f147020a = pullUpLayout;
                    if (pullUpLayout == null) {
                        l.b();
                    }
                    pullUpLayout.a(this.f147026g);
                    PullUpLayout pullUpLayout2 = this.f147020a;
                    if (pullUpLayout2 == null) {
                        l.b();
                    }
                    pullUpLayout2.setPullUpListener(this);
                    RelativeLayout relativeLayout = this.f147026g;
                    if (relativeLayout == null) {
                        l.b();
                    }
                    this.f147027h = relativeLayout.findViewById(R.id.bve);
                    RelativeLayout relativeLayout2 = this.f147026g;
                    if (relativeLayout2 == null) {
                        l.b();
                    }
                    this.f147028i = relativeLayout2.findViewById(R.id.fh1);
                    RelativeLayout relativeLayout3 = this.f147026g;
                    if (relativeLayout3 == null) {
                        l.b();
                    }
                    this.f147029j = (SmartImageView) relativeLayout3.findViewById(R.id.bvt);
                    RelativeLayout relativeLayout4 = this.f147026g;
                    if (relativeLayout4 == null) {
                        l.b();
                    }
                    this.f147030k = (TuxTextView) relativeLayout4.findViewById(R.id.f9k);
                    View view2 = this.f147027h;
                    if (view2 != null) {
                        view2.setOnClickListener(new View$OnClickListenerC3944a(this));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        com.ss.android.ugc.tools.c.a.a(this.f147029j, str, (int) n.b(eVar, 48.0f), (int) n.b(eVar, 62.0f));
                    }
                    if (z) {
                        View view3 = this.f147028i;
                        if (view3 != null) {
                            view3.setVisibility(4);
                        }
                        TuxTextView tuxTextView = this.f147030k;
                        if (tuxTextView != null) {
                            tuxTextView.setText(R.string.fd2);
                        }
                    } else {
                        TuxTextView tuxTextView2 = this.f147030k;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(R.string.fd5);
                        }
                        if (!(replaceMusicRequest == null || (view = this.f147028i) == null)) {
                            view.setOnClickListener(new b(this));
                        }
                    }
                    setBackgroundDrawable(new ColorDrawable(0));
                    setContentView(inflate);
                    setWidth(n.a(com.ss.android.ugc.aweme.df.b.a()));
                    setHeight(-2);
                    setAnimationStyle(R.style.a17);
                    MethodCollector.o(3617);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
                MethodCollector.o(3617);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            MethodCollector.o(3617);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(3617);
        throw nullPointerException3;
    }
}
