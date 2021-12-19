package com.facebook.a.b;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.f;
import com.facebook.a.g;
import com.facebook.internal.ae;
import com.facebook.m;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46596a = a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28417);
    }

    /* renamed from: com.facebook.a.b.a$a  reason: collision with other inner class name */
    public static class View$OnClickListenerC1158a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f46599a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.a.b.a.a f46600b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<View> f46601c;

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<View> f46602d;

        /* renamed from: e  reason: collision with root package name */
        private View.OnClickListener f46603e;

        static {
            Covode.recordClassIndex(28419);
        }

        public final void onClick(View view) {
            if (!com.facebook.internal.a.b.a.a(this)) {
                try {
                    View.OnClickListener onClickListener = this.f46603e;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (this.f46602d.get() != null && this.f46601c.get() != null) {
                        a.b(this.f46600b, this.f46602d.get(), this.f46601c.get());
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a.b.a.a(th, this);
                }
            }
        }

        private View$OnClickListenerC1158a(com.facebook.a.b.a.a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f46603e = f.g(view2);
                this.f46600b = aVar;
                this.f46601c = new WeakReference<>(view2);
                this.f46602d = new WeakReference<>(view);
                this.f46599a = true;
            }
        }

        /* synthetic */ View$OnClickListenerC1158a(com.facebook.a.b.a.a aVar, View view, View view2, byte b2) {
            this(aVar, view, view2);
        }
    }

    public static View$OnClickListenerC1158a a(com.facebook.a.b.a.a aVar, View view, View view2) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            return new View$OnClickListenerC1158a(aVar, view, view2, (byte) 0);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    public static class b implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f46615a;

        /* renamed from: b  reason: collision with root package name */
        private com.facebook.a.b.a.a f46616b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<AdapterView> f46617c;

        /* renamed from: d  reason: collision with root package name */
        private WeakReference<View> f46618d;

        /* renamed from: e  reason: collision with root package name */
        private AdapterView.OnItemClickListener f46619e;

        static {
            Covode.recordClassIndex(28420);
        }

        private b(com.facebook.a.b.a.a aVar, View view, AdapterView adapterView) {
            if (aVar != null && view != null && adapterView != null) {
                this.f46619e = adapterView.getOnItemClickListener();
                this.f46616b = aVar;
                this.f46617c = new WeakReference<>(adapterView);
                this.f46618d = new WeakReference<>(view);
                this.f46615a = true;
            }
        }

        /* synthetic */ b(com.facebook.a.b.a.a aVar, View view, AdapterView adapterView, byte b2) {
            this(aVar, view, adapterView);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            AdapterView.OnItemClickListener onItemClickListener = this.f46619e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            if (this.f46618d.get() != null && this.f46617c.get() != null) {
                a.b(this.f46616b, this.f46618d.get(), this.f46617c.get());
            }
        }
    }

    public static b a(com.facebook.a.b.a.a aVar, View view, AdapterView adapterView) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            return new b(aVar, view, adapterView, (byte) 0);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    static /* synthetic */ void b(com.facebook.a.b.a.a aVar, View view, View view2) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (!com.facebook.internal.a.b.a.a(a.class)) {
                    try {
                        final String str = aVar.f46604a;
                        final Bundle a2 = c.a(aVar, view, view2);
                        if (!com.facebook.internal.a.b.a.a(a.class)) {
                            try {
                                String string = a2.getString("_valueToSum");
                                if (string != null) {
                                    a2.putDouble("_valueToSum", com.facebook.a.e.b.a(string));
                                }
                                a2.putString("_is_fb_codeless", "1");
                            } catch (Throwable th) {
                                com.facebook.internal.a.b.a.a(th, a.class);
                            }
                        }
                        m.c().execute(new Runnable() {
                            /* class com.facebook.a.b.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(28418);
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
                    } catch (Throwable th2) {
                        com.facebook.internal.a.b.a.a(th2, a.class);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.a.b.a.a(th3, a.class);
            }
        }
    }
}
