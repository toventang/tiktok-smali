package com.ss.android.ugc.aweme.commerce.b;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.commercialize.ad.b;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends Dialog implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f73394a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73395b;

    /* renamed from: c  reason: collision with root package name */
    private final String f73396c;

    /* renamed from: d  reason: collision with root package name */
    private final float f73397d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f73398e = true;

    /* renamed from: f  reason: collision with root package name */
    private final int f73399f;

    static {
        Covode.recordClassIndex(45185);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(394, new g(a.class, "closeHalfDialog", CloseHalfDialogBridge.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final void dismiss() {
        super.dismiss();
        EventBus.a().b(this);
        ((CrossPlatformWebView) findViewById(R.id.dpj)).d(this.f73394a);
    }

    @r(a = ThreadMode.MAIN)
    public final void closeHalfDialog(CloseHalfDialogBridge.a aVar) {
        boolean z;
        l.d(aVar, "");
        com.google.gson.l a2 = q.a(aVar.f91028a.toString());
        l.b(a2, "");
        com.google.gson.l c2 = a2.j().c("reactId");
        if (c2 == null || (c2 instanceof n)) {
            z = false;
        } else {
            String c3 = c2.c();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewById(R.id.dpj);
            l.b(crossPlatformWebView, "");
            z = l.a((Object) c3, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(2095);
        super.onCreate(bundle);
        WindowManager.LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.xc, (ViewGroup) null);
        l.b(inflate, "");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(com.ss.android.ugc.aweme.base.utils.i.b(getContext()), this.f73395b));
        int i2 = this.f73399f;
        float f2 = this.f73397d;
        inflate.setBackground(new b(i2, f2, f2));
        setContentView(inflate);
        setCanceledOnTouchOutside(this.f73398e);
        ((CrossPlatformWebView) findViewById(R.id.dpj)).a(17, 0);
        findViewById(R.id.dpj);
        l.d(this.f73396c, "");
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (layoutParams = window2.getAttributes()) == null)) {
            layoutParams.width = -1;
            layoutParams.height = this.f73395b;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        EventBus.a(EventBus.a(), this);
        MethodCollector.o(2095);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, int i2, String str, float f2, int i3) {
        super(activity, R.style.zo);
        l.d(activity, "");
        l.d(str, "");
        this.f73394a = activity;
        this.f73395b = i2;
        this.f73396c = str;
        this.f73397d = f2;
        this.f73399f = i3;
    }
}
