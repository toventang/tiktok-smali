package com.facebook.a.b;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.f;
import com.facebook.a.e.b;
import com.facebook.a.g;
import com.facebook.internal.ae;
import com.facebook.m;
import java.lang.ref.WeakReference;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46664a = d.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28439);
    }

    public static class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f46665a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.a.b.a.a f46666b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<View> f46667c;

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<View> f46668d;

        /* renamed from: e  reason: collision with root package name */
        private View.OnTouchListener f46669e;

        static {
            Covode.recordClassIndex(28440);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            com.facebook.a.b.a.a aVar;
            if (motionEvent.getAction() == 1 && (aVar = this.f46666b) != null) {
                final String str = aVar.f46604a;
                final Bundle a2 = c.a(this.f46666b, this.f46668d.get(), this.f46667c.get());
                if (a2.containsKey("_valueToSum")) {
                    a2.putDouble("_valueToSum", b.a(a2.getString("_valueToSum")));
                }
                a2.putString("_is_fb_codeless", "1");
                m.c().execute(new Runnable() {
                    /* class com.facebook.a.b.d.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28441);
                    }

                    public final void run() {
                        if (!com.facebook.internal.a.b.a.a(this)) {
                            try {
                                ae.a();
                                g.a(m.f48921g).f46796a.b();
                            } catch (Throwable th) {
                                com.facebook.internal.a.b.a.a(th, this);
                            }
                        }
                    }
                });
            }
            View.OnTouchListener onTouchListener = this.f46669e;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        public a(com.facebook.a.b.a.a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f46669e = f.h(view2);
                this.f46666b = aVar;
                this.f46667c = new WeakReference<>(view2);
                this.f46668d = new WeakReference<>(view);
                this.f46665a = true;
            }
        }
    }

    public static a a(com.facebook.a.b.a.a aVar, View view, View view2) {
        if (com.facebook.internal.a.b.a.a(d.class)) {
            return null;
        }
        try {
            return new a(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, d.class);
            return null;
        }
    }
}
