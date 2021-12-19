package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import java.util.concurrent.LinkedBlockingDeque;

public class X2CAdWebPage extends X2CBaseInflate {

    /* renamed from: a  reason: collision with root package name */
    public Context f76025a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f76026b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76027c;

    /* renamed from: d  reason: collision with root package name */
    public LinkedBlockingDeque<View> f76028d = new LinkedBlockingDeque<>();

    static {
        Covode.recordClassIndex(46895);
    }

    @Override // com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate, com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    public final int c() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    public final int[] d() {
        return new int[0];
    }

    @Override // com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate, com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return "X2CAdWebPage";
    }

    private static Context b(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final void a(Activity activity) {
        this.f76025a = b(activity);
        this.f76026b = activity;
        this.f76028d.clear();
    }

    @Override // com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate
    public final View a(Context context, int i2) {
        MethodCollector.i(2999);
        if (n()) {
            View poll = this.f76028d.poll();
            if (poll != null) {
                MethodCollector.o(2999);
                return poll;
            }
            View a2 = com.a.b.a.a(context, i2, new FrameLayout(context), false);
            MethodCollector.o(2999);
            return a2;
        } else if (m()) {
            View a3 = com.a.a(LayoutInflater.from(context), i2, new FrameLayout(context), false);
            MethodCollector.o(2999);
            return a3;
        } else {
            View a4 = com.a.b.a.a(context, i2, new FrameLayout(context), false);
            MethodCollector.o(2999);
            return a4;
        }
    }
}
