package com.ss.android.ugc.aweme.dsp.ui.a;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dsp.ui.a.c;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f84014i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f84015a;

    /* renamed from: b  reason: collision with root package name */
    public final c.g f84016b;

    /* renamed from: c  reason: collision with root package name */
    public b f84017c;

    /* renamed from: d  reason: collision with root package name */
    public a f84018d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f84019e;

    /* renamed from: f  reason: collision with root package name */
    public e f84020f;

    /* renamed from: g  reason: collision with root package name */
    public c.f f84021g;

    /* renamed from: h  reason: collision with root package name */
    public HashMap<String, com.ss.android.ugc.aweme.dsp.ui.a.a.a> f84022h = new HashMap<>();

    static {
        Covode.recordClassIndex(52392);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52393);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f84024a;

        static {
            Covode.recordClassIndex(52395);
        }

        public c(d dVar) {
            this.f84024a = dVar;
        }

        public final void run() {
            c cVar = this.f84024a.f84015a;
            b bVar = this.f84024a.f84017c;
            if (bVar == null) {
                l.b();
            }
            c.f a2 = cVar.a(bVar.a());
            if (a2 != null) {
                a2.a();
            }
        }
    }

    public static final class b implements c.AbstractC2003c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f84023a;

        static {
            Covode.recordClassIndex(52394);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(d dVar) {
            this.f84023a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.ui.a.c.AbstractC2003c
        public final void b(c.f fVar) {
            this.f84023a.f84021g = fVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.ui.a.c.AbstractC2003c
        public final void a(c.f fVar) {
            l.d(fVar, "");
            if (this.f84023a.f84021g == null) {
                this.f84023a.f84021g = fVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.ui.a.d$d  reason: collision with other inner class name */
    public static final class C2004d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f84025a;

        static {
            Covode.recordClassIndex(52396);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2004d(d dVar) {
            this.f84025a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.ui.a.c.b
        public final void a(c.f fVar) {
            Object obj;
            String str;
            Object obj2;
            d dVar = this.f84025a;
            dVar.f84021g = dVar.f84015a.a(this.f84025a.f84015a.getSelectedTabPosition());
            String str2 = null;
            if (fVar != null) {
                obj = fVar.f84003e;
            } else {
                obj = null;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            this.f84025a.a((String) obj);
            boolean isMainPage = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(this.f84025a.f84020f);
            c.f fVar2 = this.f84025a.f84021g;
            if (fVar2 == null || (obj2 = fVar2.f84003e) == null) {
                str = null;
            } else {
                str = obj2.toString();
            }
            Object obj3 = fVar.f84003e;
            if (obj3 != null) {
                str2 = obj3.toString();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.dsp.a.a(isMainPage, str, str2));
        }
    }

    public final void a(String str) {
        l.d(str, "");
        int tabCount = this.f84015a.getTabCount();
        if (tabCount >= 0) {
            int i2 = 0;
            while (true) {
                c.f a2 = this.f84015a.a(i2);
                if (a2 != null && l.a((Object) str, a2.f84003e)) {
                    b bVar = this.f84017c;
                    if (bVar != null) {
                        bVar.a(a2.f83999a, this.f84019e);
                        return;
                    }
                    return;
                } else if (i2 != tabCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public d(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        MethodCollector.i(1277);
        Context context = frameLayout.getContext();
        l.b(context, "");
        c cVar = new c(context, (byte) 0);
        this.f84015a = cVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cVar.setLayoutParams(layoutParams);
        Context context2 = frameLayout.getContext();
        l.b(context2, "");
        cVar.setBackgroundColor(context2.getResources().getColor(R.color.c9));
        frameLayout.addView(cVar, 0);
        Context context3 = cVar.getContext();
        if (context3 != null) {
            this.f84020f = (e) context3;
            cVar.setVisibility(0);
            if (cVar.f83967f == null) {
                cVar.f83967f = new c.g(cVar);
            }
            c.g gVar = cVar.f83967f;
            if (gVar == null) {
                l.b();
            }
            this.f84016b = gVar;
            MethodCollector.o(1277);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(1277);
        throw nullPointerException;
    }
}
