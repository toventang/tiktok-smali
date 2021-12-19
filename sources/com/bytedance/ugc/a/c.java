package com.bytedance.ugc.a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.a;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static boolean f45842a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f45843b = new c();

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C1129a f45844b = new C1129a((byte) 0);

        static {
            Covode.recordClassIndex(27923);
        }

        public abstract boolean a(b bVar, View view, int i2, int i3, int i4, int i5, int i6, int i7, a aVar);

        /* renamed from: com.bytedance.ugc.a.c$a$a  reason: collision with other inner class name */
        public static final class C1129a {
            static {
                Covode.recordClassIndex(27924);
            }

            private C1129a() {
            }

            public /* synthetic */ C1129a(byte b2) {
                this();
            }

            public static int a(Drawable drawable) {
                while (drawable instanceof StateListDrawable) {
                    drawable = ((StateListDrawable) drawable).getCurrent();
                }
                if (drawable == null) {
                    return 0;
                }
                if (drawable instanceof ColorDrawable) {
                    int color = ((ColorDrawable) drawable).getColor();
                    if (Color.alpha(color) < 5) {
                        return 0;
                    }
                    int red = Color.red(color);
                    int green = Color.green(color);
                    int blue = Color.blue(color);
                    if (red <= 240 || green <= 240 || blue <= 240) {
                        return 1;
                    }
                    return 2;
                }
                return 1;
            }

            public static boolean a(View view) {
                l.c(view, "");
                l.c(view, "");
                if (view.getVisibility() != 0 || ((double) view.getAlpha()) < 0.05d || ((double) view.getScaleX()) < 0.01d || ((double) view.getScaleY()) < 0.01d) {
                    return true;
                }
                return false;
            }
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(27925);
        }

        int a();
    }

    /* renamed from: com.bytedance.ugc.a.c$c  reason: collision with other inner class name */
    public static abstract class AbstractC1130c {
        static {
            Covode.recordClassIndex(27926);
        }

        public abstract void a(View view, String str, int i2, int i3, int i4);
    }

    public static abstract class d {
        static {
            Covode.recordClassIndex(27927);
        }

        public void a(String str, long j2) {
            l.c(str, "");
        }

        public void b(String str, long j2) {
            l.c(str, "");
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(27922);
    }

    /* access modifiers changed from: private */
    public static void b(View view, String str, a aVar, AbstractC1130c cVar, d dVar) {
        l.c(view, "");
        l.c(str, "");
        l.c(view, "");
        l.c(str, "");
        new a.b(view, str, aVar, null, cVar, dVar).run();
    }

    public static abstract class e<T extends View> extends a {
        static {
            Covode.recordClassIndex(27928);
        }

        public abstract int a(T t);

        public abstract T b(View view);

        @Override // com.bytedance.ugc.a.c.a
        public final boolean a(b bVar, View view, int i2, int i3, int i4, int i5, int i6, int i7, a aVar) {
            int a2;
            l.c(bVar, "");
            l.c(view, "");
            T b2 = b(view);
            if (b2 == null) {
                return false;
            }
            if (a.C1129a.a(view)) {
                a2 = 0;
            } else {
                a2 = a(b2);
                if (a2 == 0) {
                    l.c(b2, "");
                    a2 = a.C1129a.a(view.getBackground());
                }
            }
            bVar.a(i4, i5, i6, i7, a2);
            return true;
        }
    }
}
