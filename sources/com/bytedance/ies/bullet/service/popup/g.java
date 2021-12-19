package com.bytedance.ies.bullet.service.popup;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.k;
import h.f.b.l;
import java.util.Timer;
import java.util.TimerTask;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public View f32995a;

    /* renamed from: b  reason: collision with root package name */
    public Timer f32996b;

    /* renamed from: c  reason: collision with root package name */
    public TimerTask f32997c;

    /* renamed from: d  reason: collision with root package name */
    long f32998d = 500;

    /* renamed from: e  reason: collision with root package name */
    public Activity f32999e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f33000f;

    static {
        Covode.recordClassIndex(19693);
    }

    public static final class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f33001a;

        static {
            Covode.recordClassIndex(19694);
        }

        public final void run() {
            this.f33001a.f32999e.runOnUiThread(new RunnableC0719a(this));
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.g$a$a  reason: collision with other inner class name */
        static final class RunnableC0719a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f33002a;

            static {
                Covode.recordClassIndex(19695);
            }

            RunnableC0719a(a aVar) {
                this.f33002a = aVar;
            }

            public final void run() {
                k kVar = null;
                this.f33002a.f33001a.f32996b = null;
                this.f33002a.f33001a.f32997c = null;
                View view = this.f33002a.f33001a.f32995a;
                if (view instanceof k) {
                    kVar = view;
                }
                k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.a();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f33001a = gVar;
        }
    }

    public final void a() {
        TimerTask timerTask = this.f32997c;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f32996b;
        if (timer != null) {
            timer.cancel();
        }
    }

    public g(Activity activity, ViewGroup viewGroup) {
        l.c(activity, "");
        l.c(viewGroup, "");
        this.f32999e = activity;
        this.f33000f = viewGroup;
    }
}
