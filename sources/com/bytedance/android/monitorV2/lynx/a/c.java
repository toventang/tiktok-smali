package com.bytedance.android.monitorV2.lynx.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final e f24047a = e.f24056a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f24048b = new c();

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.c$c  reason: collision with other inner class name */
    public interface AbstractC0516c {
        static {
            Covode.recordClassIndex(14176);
        }

        void a(View view, String str, float f2);

        void a(View view, String str, long j2, long j3);
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(14173);
    }

    public static final class a extends c.AbstractC1130c {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractC0516c f24049a;

        static {
            Covode.recordClassIndex(14174);
        }

        public a(AbstractC0516c cVar) {
            this.f24049a = cVar;
        }

        @Override // com.bytedance.ugc.a.c.AbstractC1130c
        public final void a(View view, String str, int i2, int i3, int i4) {
            l.c(view, "");
            l.c(str, "");
            float f2 = (((float) i3) * 1.0f) / ((float) i2);
            try {
                AbstractC0516c cVar = this.f24049a;
                if (cVar != null) {
                    cVar.a(view, str, f2);
                }
                com.bytedance.android.monitorV2.i.b.b("LynxViewBlankChecker_result", "total:" + i2 + ", validate:" + i3 + ", invalidate:" + i4);
            } catch (Exception unused) {
            }
        }
    }

    public static final class b extends c.d {

        /* renamed from: a  reason: collision with root package name */
        public long f24050a;

        /* renamed from: b  reason: collision with root package name */
        public long f24051b;

        /* renamed from: c  reason: collision with root package name */
        private final View f24052c;

        /* renamed from: d  reason: collision with root package name */
        private final AbstractC0516c f24053d;

        static {
            Covode.recordClassIndex(14175);
        }

        public b(View view, AbstractC0516c cVar) {
            l.c(view, "");
            this.f24052c = view;
            this.f24053d = cVar;
        }

        @Override // com.bytedance.ugc.a.c.d
        public final void b(String str, long j2) {
            l.c(str, "");
            super.b(str, j2);
            this.f24051b = j2;
        }

        @Override // com.bytedance.ugc.a.c.d
        public final void a(String str, long j2) {
            l.c(str, "");
            super.a(str, j2);
            this.f24050a = j2;
            try {
                AbstractC0516c cVar = this.f24053d;
                if (cVar != null) {
                    cVar.a(this.f24052c, str, this.f24051b, j2);
                }
            } catch (Exception unused) {
            }
        }
    }
}
