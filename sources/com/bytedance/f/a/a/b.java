package com.bytedance.f.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.n;
import h.f.b.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final c f28713a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f28714b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f28715c;

    /* renamed from: d  reason: collision with root package name */
    private final InvocationHandler f28716d;

    /* renamed from: e  reason: collision with root package name */
    private final h.a f28717e;

    /* renamed from: f  reason: collision with root package name */
    private final h f28718f;

    static {
        Covode.recordClassIndex(16896);
    }

    @Override // com.bytedance.f.a.a.j
    public final FrameLayout a() {
        return this.f28718f;
    }

    public final void b() {
        View c2;
        Iterator<T> it = this.f28713a.f28721b.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            i iVar = it.next().f28728b;
            if (!(iVar == null || (c2 = iVar.c()) == null)) {
                v.c(c2, f2);
                f2 = 1.0f + f2;
            }
        }
    }

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f28719a;

        static {
            Covode.recordClassIndex(16897);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f28719a = bVar;
        }

        @Override // com.bytedance.f.a.a.e
        public final void a(f fVar) {
            int indexOf;
            l.d(fVar, "");
            c cVar = this.f28719a.f28713a;
            l.d(fVar, "");
            int indexOf2 = cVar.f28720a.indexOf(fVar);
            if (indexOf2 >= 0) {
                Iterator<T> it = cVar.f28720a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f28727a == fVar.f28727a) {
                        if (next != null && (indexOf = cVar.f28720a.indexOf(next)) >= 0 && indexOf2 != indexOf) {
                            Collections.swap(cVar.f28720a, indexOf2, indexOf);
                        }
                    }
                }
            }
            this.f28719a.b();
        }
    }

    @Override // com.bytedance.f.a.a.j
    public final void b(f fVar) {
        l.d(fVar, "");
        c cVar = this.f28713a;
        l.d(fVar, "");
        cVar.f28720a.remove(fVar);
        i iVar = fVar.f28728b;
        if (iVar != null) {
            this.f28718f.removeView(iVar.c());
        }
    }

    @Override // com.bytedance.f.a.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        c cVar = this.f28713a;
        l.d(fVar, "");
        cVar.f28720a.add(0, fVar);
        n.a((List) cVar.f28720a, (Comparator) cVar.f28722c);
        i iVar = fVar.f28728b;
        if (iVar != null) {
            if (iVar.c().getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                iVar.c().setLayoutParams(layoutParams);
            }
            this.f28718f.addView(iVar.c());
            b();
        }
    }

    public b(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        MethodCollector.i(4475);
        this.f28714b = context;
        this.f28715c = viewGroup;
        c cVar = new c();
        this.f28713a = cVar;
        d dVar = new d(cVar, new a(this));
        this.f28716d = dVar;
        Object newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{h.a.class}, dVar);
        if (newProxyInstance != null) {
            h.a aVar = (h.a) newProxyInstance;
            this.f28717e = aVar;
            h hVar = new h(context);
            hVar.setOnGestureListener(aVar);
            hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (viewGroup != null) {
                viewGroup.addView(hVar);
            }
            this.f28718f = hVar;
            MethodCollector.o(4475);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.createx.editor.gesture.GestureLayout.OnGestureListener");
        MethodCollector.o(4475);
        throw nullPointerException;
    }
}
