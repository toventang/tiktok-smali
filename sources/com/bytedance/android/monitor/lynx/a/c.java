package com.bytedance.android.monitor.lynx.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final e f23568a = e.f23577a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f23569b = new c();

    /* renamed from: com.bytedance.android.monitor.lynx.a.c$c  reason: collision with other inner class name */
    public interface AbstractC0510c {
        static {
            Covode.recordClassIndex(13994);
        }

        void a(View view, String str, float f2);

        void a(View view, String str, long j2, long j3);
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(13991);
    }

    public static final class a extends c.AbstractC1130c {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractC0510c f23570a;

        static {
            Covode.recordClassIndex(13992);
        }

        public a(AbstractC0510c cVar) {
            this.f23570a = cVar;
        }

        @Override // com.bytedance.ugc.a.c.AbstractC1130c
        public final void a(View view, String str, int i2, int i3, int i4) {
            l.c(view, "");
            l.c(str, "");
            float f2 = (((float) i3) * 1.0f) / ((float) i2);
            try {
                AbstractC0510c cVar = this.f23570a;
                if (cVar != null) {
                    cVar.a(view, str, f2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class b extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public long f23571a;

        /* renamed from: b  reason: collision with root package name */
        public long f23572b;

        /* renamed from: c  reason: collision with root package name */
        private final View f23573c;

        /* renamed from: d  reason: collision with root package name */
        private final AbstractC0510c f23574d;

        static {
            Covode.recordClassIndex(13993);
        }

        public b(View view, AbstractC0510c cVar) {
            l.c(view, "");
            this.f23573c = view;
            this.f23574d = cVar;
        }

        @Override // com.bytedance.ugc.a.c.d
        public final void b(String str, long j2) {
            l.c(str, "");
            super.b(str, j2);
            this.f23572b = j2;
        }

        @Override // com.bytedance.ugc.a.c.d
        public final void a(String str, long j2) {
            l.c(str, "");
            super.a(str, j2);
            this.f23571a = j2;
            try {
                AbstractC0510c cVar = this.f23574d;
                if (cVar != null) {
                    cVar.a(this.f23573c, str, this.f23572b, j2);
                }
            } catch (Exception unused) {
            }
        }
    }
}
