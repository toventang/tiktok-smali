package com.bytedance.ugc.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.a.b;
import com.bytedance.ugc.a.a.d;
import com.bytedance.ugc.a.a.e;
import com.bytedance.ugc.a.a.f;
import com.bytedance.ugc.a.a.g;
import com.bytedance.ugc.a.b;
import com.bytedance.ugc.a.c;
import com.bytedance.ugc.glue.UGCTools;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Handler f45809a;

    /* renamed from: b  reason: collision with root package name */
    static c.d f45810b;

    /* renamed from: c  reason: collision with root package name */
    static c.AbstractC1130c f45811c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f45812d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final List<c.a> f45813e = n.c(f.f45832a, d.f45830a, b.f45828a, com.bytedance.ugc.a.a.c.f45829a, g.f45833a, e.f45831a, com.bytedance.ugc.a.a.a.f45821a);

    /* renamed from: f  reason: collision with root package name */
    private static final CopyOnWriteArrayList<c.a> f45814f = new CopyOnWriteArrayList<>();

    private a() {
    }

    static {
        Covode.recordClassIndex(27909);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f45822a;

        /* renamed from: b  reason: collision with root package name */
        private final String f45823b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a f45824c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f45825d = null;

        /* renamed from: e  reason: collision with root package name */
        private final c.AbstractC1130c f45826e;

        /* renamed from: f  reason: collision with root package name */
        private final c.d f45827f;

        static {
            Covode.recordClassIndex(27911);
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            c.AbstractC1130c cVar = this.f45826e;
            if (cVar == null) {
                cVar = a.f45811c;
            }
            if (cVar != null) {
                c.d dVar = this.f45827f;
                if (dVar == null) {
                    dVar = a.f45810b;
                }
                b bVar = new b(this.f45822a.getWidth(), this.f45822a.getHeight());
                View view = this.f45822a;
                a.a(bVar, view, 0, 0, 0, 0, view.getWidth(), this.f45822a.getHeight(), this.f45824c);
                Handler handler = a.f45809a;
                if (handler == null) {
                    handler = UGCTools.mainHandler;
                    l.a((Object) handler, "");
                }
                handler.post(new RunnableC1127a(bVar, this.f45822a, this.f45823b, this.f45825d, cVar, dVar));
                if (dVar != null) {
                    dVar.b(this.f45823b, System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }

        public b(View view, String str, c.a aVar, JSONObject jSONObject, c.AbstractC1130c cVar, c.d dVar) {
            l.c(view, "");
            l.c(str, "");
            this.f45822a = view;
            this.f45823b = str;
            this.f45824c = aVar;
            this.f45826e = cVar;
            this.f45827f = dVar;
        }
    }

    /* renamed from: com.bytedance.ugc.a.a$a  reason: collision with other inner class name */
    public static final class RunnableC1127a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f45815a;

        /* renamed from: b  reason: collision with root package name */
        private final View f45816b;

        /* renamed from: c  reason: collision with root package name */
        private final String f45817c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f45818d;

        /* renamed from: e  reason: collision with root package name */
        private final c.AbstractC1130c f45819e;

        /* renamed from: f  reason: collision with root package name */
        private final c.d f45820f;

        static {
            Covode.recordClassIndex(27910);
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            b bVar = this.f45815a;
            View view = this.f45816b;
            String str = this.f45817c;
            c.AbstractC1130c cVar = this.f45819e;
            l.c(view, "");
            l.c(str, "");
            l.c(cVar, "");
            int i2 = ((bVar.f45837d - 1) / bVar.f45834a) + 1;
            int i3 = ((bVar.f45836c - 1) / bVar.f45834a) + 1;
            int i4 = i2 * i3;
            int[] iArr = new int[i4];
            for (Integer[] numArr : bVar.f45835b) {
                int max = Math.max(0, numArr[0].intValue() / bVar.f45834a);
                int max2 = Math.max(0, numArr[1].intValue() / bVar.f45834a);
                int min = Math.min(i3 - 1, numArr[2].intValue() / bVar.f45834a);
                int min2 = Math.min(i2 - 1, numArr[3].intValue() / bVar.f45834a);
                if (max2 <= min2) {
                    while (true) {
                        if (max <= min) {
                            int i5 = max;
                            while (true) {
                                iArr[(max2 * i3) + i5] = numArr[4].intValue();
                                if (i5 == min) {
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (max2 == min2) {
                            break;
                        }
                        max2++;
                    }
                }
            }
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                if (iArr[i7] == 1) {
                    i6++;
                }
            }
            cVar.a(view, str, i4, i6, i4 - i6);
            c.d dVar = this.f45820f;
            if (dVar != null) {
                dVar.a(this.f45817c, System.currentTimeMillis() - currentTimeMillis);
            }
            if (c.f45842a) {
                b bVar2 = this.f45815a;
                View view2 = this.f45816b;
                l.c(view2, "");
                if (!(view2 instanceof ViewGroup)) {
                    view2 = null;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup != null) {
                    UGCTools.mainHandler.post(new b.RunnableC1128b(bVar2, viewGroup));
                }
            }
        }

        public RunnableC1127a(b bVar, View view, String str, JSONObject jSONObject, c.AbstractC1130c cVar, c.d dVar) {
            l.c(bVar, "");
            l.c(view, "");
            l.c(str, "");
            l.c(cVar, "");
            this.f45815a = bVar;
            this.f45816b = view;
            this.f45817c = str;
            this.f45818d = jSONObject;
            this.f45819e = cVar;
            this.f45820f = dVar;
        }
    }

    public static void a(b bVar, View view, int i2, int i3, int i4, int i5, int i6, int i7, c.a aVar) {
        l.c(bVar, "");
        l.c(view, "");
        if (aVar != null && aVar.a(bVar, view, i2, i3, i4, i5, i6, i7, aVar)) {
            return;
        }
        if (view instanceof c.b) {
            bVar.a(i4, i5, i6, i7, ((c.b) view).a());
            return;
        }
        Iterator<c.a> it = f45814f.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar, view, i2, i3, i4, i5, i6, i7, aVar)) {
                return;
            }
        }
        for (c.a aVar2 : f45813e) {
            if (aVar2.a(bVar, view, i2, i3, i4, i5, i6, i7, aVar)) {
                return;
            }
        }
        if (f45810b != null) {
            l.c(view, "");
        }
    }
}
