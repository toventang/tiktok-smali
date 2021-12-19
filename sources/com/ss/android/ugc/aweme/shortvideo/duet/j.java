package com.ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.df.o;
import com.ss.android.ugc.aweme.df.p;
import com.ss.android.ugc.aweme.port.in.az;
import com.ss.android.ugc.aweme.port.in.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static p f126549a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f126550b = new j();

    private j() {
    }

    public static void a() {
        f126549a.c("duet_layout_up_down_drag_gesture_hint");
    }

    public static void b() {
        f126549a.c("duet_layout_three_screen_drag_gesture_hint");
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f126551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.tooltip.a f126552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126553c;

        static {
            Covode.recordClassIndex(83006);
        }

        a(Activity activity, com.bytedance.tux.tooltip.a aVar, int i2) {
            this.f126551a = activity;
            this.f126552b = aVar;
            this.f126553c = i2;
        }

        public final void run() {
            if (!this.f126551a.isFinishing()) {
                this.f126552b.a();
                j.f126549a.a("duet_layout_tool_bar_bubble_hint", this.f126553c + 1);
            }
        }
    }

    static {
        Covode.recordClassIndex(83005);
        Application application = c.f115622a;
        az azVar = c.f115634m;
        l.b(azVar, "");
        f126549a = o.a(application, azVar.a());
    }

    public static void a(View view, Activity activity) {
        l.d(view, "");
        l.d(activity, "");
        int a2 = f126549a.a("duet_layout_tool_bar_bubble_hint");
        if (a2 < 3 && view.getParent() != null && !activity.isFinishing()) {
            view.postDelayed(new a(activity, ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(activity).b(view)).e(R.string.bex).a(5000L).a(h.START).d(), a2), 500);
        }
    }
}
