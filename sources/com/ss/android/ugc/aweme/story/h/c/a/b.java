package com.ss.android.ugc.aweme.story.h.c.a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.j;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final View f137791a;

    /* renamed from: b  reason: collision with root package name */
    public int f137792b;

    /* renamed from: c  reason: collision with root package name */
    public a f137793c;

    /* renamed from: d  reason: collision with root package name */
    public final j f137794d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f137795e = new ViewTreeObserver$OnGlobalLayoutListenerC3622b(this);

    public interface a {
        static {
            Covode.recordClassIndex(90146);
        }

        void a(int i2);

        void b(int i2);

        void c(int i2);
    }

    static {
        Covode.recordClassIndex(90145);
    }

    public final void a() {
        View view = this.f137791a;
        if (!(view == null || this.f137795e == null)) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f137795e);
        }
        this.f137793c = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.h.c.a.b$b  reason: collision with other inner class name */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC3622b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137796a;

        static {
            Covode.recordClassIndex(90147);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC3622b(b bVar) {
            this.f137796a = bVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            View view = this.f137796a.f137791a;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
            }
            int height = rect.height();
            if (!(this.f137796a.f137794d == null || this.f137796a.f137792b == height)) {
                this.f137796a.f137794d.a("softKeyBoard old Height:" + this.f137796a.f137792b + ", new Height:" + height);
            }
            if (this.f137796a.f137792b == 0) {
                this.f137796a.f137792b = height;
            } else if (this.f137796a.f137792b != height) {
                a aVar = this.f137796a.f137793c;
                if (aVar != null) {
                    if (this.f137796a.f137792b - height > 200) {
                        aVar.a(this.f137796a.f137792b - height);
                    } else if (this.f137796a.f137792b > height) {
                        aVar.c(this.f137796a.f137792b - height);
                    } else if (height - this.f137796a.f137792b > 200) {
                        aVar.b(height - this.f137796a.f137792b);
                    }
                }
                this.f137796a.f137792b = height;
            }
        }
    }

    public final void a(a aVar) {
        this.f137793c = aVar;
        View view = this.f137791a;
        if (view != null && this.f137795e != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f137795e);
        }
    }

    public b(Activity activity, j jVar) {
        l.d(activity, "");
        this.f137794d = jVar;
        Window window = activity.getWindow();
        l.b(window, "");
        this.f137791a = window.getDecorView();
    }
}
