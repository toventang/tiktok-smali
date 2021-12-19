package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.gj;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OverDrawMonitorTask implements w {

    public static final class RenderNodeCollectThread extends HandlerThread implements au {

        /* renamed from: d  reason: collision with root package name */
        public static final a f107849d = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        final a f107850a = new a();

        /* renamed from: b  reason: collision with root package name */
        String f107851b = "Nameless";

        /* renamed from: c  reason: collision with root package name */
        public final Context f107852c;

        /* renamed from: e  reason: collision with root package name */
        private Handler f107853e;

        static {
            Covode.recordClassIndex(69079);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_STOP) {
                onAppBackground();
            } else if (aVar == i.a.ON_START) {
                onAppForeground();
            }
        }

        public static final class a {
            static {
                Covode.recordClassIndex(69080);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @v(a = i.a.ON_STOP)
        public final void onAppBackground() {
            Handler handler = this.f107853e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }

        @v(a = i.a.ON_START)
        public final void onAppForeground() {
            Handler handler = this.f107853e;
            if (handler != null) {
                handler.sendEmptyMessage(0);
            }
        }

        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RenderNodeCollectThread f107859a;

            static {
                Covode.recordClassIndex(69082);
            }

            c(RenderNodeCollectThread renderNodeCollectThread) {
                this.f107859a = renderNodeCollectThread;
            }

            public final void run() {
                androidx.lifecycle.w wVar = androidx.lifecycle.w.f3548i;
                l.b(wVar, "");
                wVar.getLifecycle().a(this.f107859a);
            }
        }

        public final boolean quit() {
            androidx.lifecycle.w wVar = androidx.lifecycle.w.f3548i;
            l.b(wVar, "");
            wVar.getLifecycle().b(this);
            Handler handler = this.f107853e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f107853e = null;
            return super.quit();
        }

        public final boolean quitSafely() {
            androidx.lifecycle.w wVar = androidx.lifecycle.w.f3548i;
            l.b(wVar, "");
            wVar.getLifecycle().b(this);
            Handler handler = this.f107853e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f107853e = null;
            return super.quitSafely();
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            new Handler(Looper.getMainLooper()).post(new c(this));
            d dVar = new d(this, getLooper());
            dVar.sendEmptyMessage(0);
            this.f107853e = dVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RenderNodeCollectThread(Context context) {
            super("RenderNodeCollect");
            l.d(context, "");
            this.f107852c = context;
        }

        public static final class d extends Handler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RenderNodeCollectThread f107860a;

            static {
                Covode.recordClassIndex(69083);
            }

            public final void dispatchMessage(Message message) {
                View findViewById;
                int i2;
                int i3;
                int intValue;
                int intValue2;
                int intValue3;
                Fragment rootFragment;
                l.d(message, "");
                RenderNodeCollectThread renderNodeCollectThread = this.f107860a;
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = renderNodeCollectThread.f107850a;
                e eVar = null;
                if (aVar.f107861a != null) {
                    ArrayList<View> arrayList = aVar.f107861a;
                    if (arrayList == null) {
                        l.a("views");
                    }
                    View view = (View) n.j((List) arrayList);
                    if (!(view == null || (findViewById = view.findViewById(16908290)) == null)) {
                        Activity j2 = f.j();
                        if (j2 instanceof e) {
                            eVar = j2;
                        }
                        e eVar2 = eVar;
                        if (eVar2 != null) {
                            String simpleName = eVar2.getClass().getSimpleName();
                            l.b(simpleName, "");
                            renderNodeCollectThread.f107851b = simpleName;
                            if ((eVar2 instanceof com.bytedance.ies.powerpage.a) && (rootFragment = ((com.bytedance.ies.powerpage.a) eVar2).getRootFragment()) != null) {
                                String simpleName2 = rootFragment.getClass().getSimpleName();
                                l.b(simpleName2, "");
                                renderNodeCollectThread.f107851b = simpleName2;
                            }
                        }
                        Rect rect = new Rect();
                        findViewById.getGlobalVisibleRect(rect);
                        int width = rect.width() * rect.height();
                        ArrayList<b> arrayList2 = new ArrayList();
                        renderNodeCollectThread.a(width, findViewById, 0, 0, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            ArrayList arrayList3 = arrayList2;
                            if (arrayList3.isEmpty()) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                for (b bVar : arrayList2) {
                                    if ((l.a((Object) bVar.f107855b, (Object) "view_group_background") || l.a((Object) bVar.f107855b, (Object) "view_background")) && (i2 = i2 + 1) < 0) {
                                        n.b();
                                    }
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                                for (b bVar2 : arrayList2) {
                                    if (l.a((Object) bVar2.f107855b, (Object) "view_group_background") && (i3 = i3 + 1) < 0) {
                                        n.b();
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList2, 10));
                            for (b bVar3 : arrayList2) {
                                arrayList4.add(Integer.valueOf(bVar3.f107856c.width() * bVar3.f107856c.height()));
                            }
                            ArrayList arrayList5 = arrayList4;
                            if (arrayList5.isEmpty()) {
                                intValue = 0;
                            } else {
                                Iterator it = arrayList5.iterator();
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    while (it.hasNext()) {
                                        next = Integer.valueOf(((Number) next).intValue() + ((Number) it.next()).intValue());
                                    }
                                    intValue = ((Number) next).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (l.a((Object) ((b) obj).f107855b, (Object) "view_group_background")) {
                                    arrayList6.add(obj);
                                }
                            }
                            ArrayList<b> arrayList7 = arrayList6;
                            ArrayList arrayList8 = new ArrayList(n.a((Iterable) arrayList7, 10));
                            for (b bVar4 : arrayList7) {
                                arrayList8.add(Integer.valueOf(bVar4.f107856c.width() * bVar4.f107856c.height()));
                            }
                            ArrayList arrayList9 = arrayList8;
                            if (arrayList9.isEmpty()) {
                                intValue2 = 0;
                            } else {
                                Iterator it2 = arrayList9.iterator();
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    while (it2.hasNext()) {
                                        next2 = Integer.valueOf(((Number) next2).intValue() + ((Number) it2.next()).intValue());
                                    }
                                    intValue2 = ((Number) next2).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj2 : arrayList2) {
                                b bVar5 = (b) obj2;
                                if (l.a((Object) bVar5.f107855b, (Object) "view_group_background") || l.a((Object) bVar5.f107855b, (Object) "view_background")) {
                                    arrayList10.add(obj2);
                                }
                            }
                            ArrayList<b> arrayList11 = arrayList10;
                            ArrayList arrayList12 = new ArrayList(n.a((Iterable) arrayList11, 10));
                            for (b bVar6 : arrayList11) {
                                arrayList12.add(Integer.valueOf(bVar6.f107856c.width() * bVar6.f107856c.height()));
                            }
                            ArrayList arrayList13 = arrayList12;
                            if (arrayList13.isEmpty()) {
                                intValue3 = 0;
                            } else {
                                Iterator it3 = arrayList13.iterator();
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    while (it3.hasNext()) {
                                        next3 = Integer.valueOf(((Number) next3).intValue() + ((Number) it3.next()).intValue());
                                    }
                                    intValue3 = ((Number) next3).intValue();
                                } else {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                            }
                            p[] pVarArr = new p[8];
                            pVarArr[0] = h.v.a(Integer.valueOf(arrayList2.size()), "render_node_count");
                            pVarArr[1] = h.v.a(Integer.valueOf(i2), "render_node_bg_count");
                            pVarArr[2] = h.v.a(Integer.valueOf(i3), "render_node_group_bg_count");
                            float f2 = (float) width;
                            pVarArr[3] = h.v.a(Float.valueOf(((float) intValue) / f2), "render_times");
                            pVarArr[4] = h.v.a(Float.valueOf(((float) intValue3) / f2), "bg_render_times");
                            pVarArr[5] = h.v.a(Float.valueOf(((float) intValue2) / f2), "group_bg_render_times");
                            pVarArr[6] = h.v.a(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "cost");
                            String str = gj.f143017a;
                            if (str == null) {
                                str = renderNodeCollectThread.f107851b;
                            }
                            pVarArr[7] = h.v.a(str, "event_page");
                            r.a("page_render_node_info", pVarArr);
                        }
                    }
                }
                sendEmptyMessageDelayed(0, 5000);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(RenderNodeCollectThread renderNodeCollectThread, Looper looper) {
                super(looper);
                this.f107860a = renderNodeCollectThread;
            }
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final int f107854a;

            /* renamed from: b  reason: collision with root package name */
            public final String f107855b;

            /* renamed from: c  reason: collision with root package name */
            public final Rect f107856c;

            /* renamed from: d  reason: collision with root package name */
            public final int f107857d;

            /* renamed from: e  reason: collision with root package name */
            public final int f107858e;

            static {
                Covode.recordClassIndex(69081);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f107854a == bVar.f107854a && l.a(this.f107855b, bVar.f107855b) && l.a(this.f107856c, bVar.f107856c) && this.f107857d == bVar.f107857d && this.f107858e == bVar.f107858e;
            }

            public final int hashCode() {
                int i2 = this.f107854a * 31;
                String str = this.f107855b;
                int i3 = 0;
                int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
                Rect rect = this.f107856c;
                if (rect != null) {
                    i3 = rect.hashCode();
                }
                return ((((hashCode + i3) * 31) + this.f107857d) * 31) + this.f107858e;
            }

            public final String toString() {
                return "RenderNodeInfo(areaPresent=" + this.f107854a + ", renderNodeType=" + this.f107855b + ", rect=" + this.f107856c + ", layerCount=" + this.f107857d + ", reDrawCount=" + this.f107858e + ")";
            }

            public b(int i2, String str, Rect rect, int i3, int i4) {
                l.d(str, "");
                l.d(rect, "");
                this.f107854a = i2;
                this.f107855b = str;
                this.f107856c = rect;
                this.f107857d = i3;
                this.f107858e = i4;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, View view, int i3, int i4, List<b> list) {
            String str;
            int i5 = i4;
            if (view != null && !(view instanceof SurfaceView) && !(view instanceof TextureView)) {
                Rect rect = new Rect();
                if (view.getVisibility() == 0 && view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    if (view.getBackground() != null) {
                        int width = (int) (((((float) rect.width()) * 100.0f) * ((float) rect.height())) / ((float) i2));
                        if (view instanceof ViewGroup) {
                            str = "view_group_background";
                        } else {
                            str = "view_background";
                        }
                        list.add(new b(width, str, rect, i3, i5));
                        i5++;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            a(i2, viewGroup.getChildAt(i6), i3 + 1, i5, list);
                        }
                    } else if (!l.a(ab.a(view.getClass()), ab.a(View.class))) {
                        list.add(new b((int) (((((float) rect.width()) * 100.0f) * ((float) rect.height())) / ((float) i2)), "view", rect, i3, i5));
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(69078);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final com.ss.android.ugc.aweme.lego.ab k() {
        return com.ss.android.ugc.aweme.lego.ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f107861a;

        static {
            Covode.recordClassIndex(69084);
        }

        public a() {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                l.b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj != null) {
                    this.f107861a = (ArrayList) obj;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (context != null) {
            new RenderNodeCollectThread(context).start();
        }
    }
}
