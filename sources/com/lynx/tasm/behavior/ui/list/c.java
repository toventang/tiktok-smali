package com.lynx.tasm.behavior.ui.list;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.c.g;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final com.lynx.tasm.c f56190a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f56191b;

    /* renamed from: c  reason: collision with root package name */
    private final a f56192c;

    /* renamed from: d  reason: collision with root package name */
    private final RecyclerView f56193d;

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<b> f56194e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f56195f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f56196g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f56197h;

    /* renamed from: i  reason: collision with root package name */
    private long f56198i;

    static {
        Covode.recordClassIndex(35117);
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a(h hVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void b(h hVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void c(h hVar) {
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(35120);
        }

        public final void run() {
            c.this.a(true);
        }

        private a() {
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f56202a;

        /* renamed from: b  reason: collision with root package name */
        int f56203b;

        /* renamed from: c  reason: collision with root package name */
        String f56204c;

        static {
            Covode.recordClassIndex(35121);
        }

        public final int hashCode() {
            return this.f56202a << (this.f56203b + 16);
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f56202a == this.f56202a && bVar.f56203b == this.f56203b && TextUtils.equals(bVar.f56204c, this.f56204c)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public b(int i2, int i3, String str) {
            this.f56202a = i2;
            this.f56203b = i3;
            this.f56204c = str;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.d
    public final void a() {
        a(false);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.c$c  reason: collision with other inner class name */
    class C1262c extends RecyclerView.n {
        static {
            Covode.recordClassIndex(35122);
        }

        private C1262c() {
        }

        /* synthetic */ C1262c(c cVar, byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                c.this.a(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            c.this.a(false);
        }
    }

    private boolean a(View view) {
        this.f56197h.set(0, 0, view.getWidth(), view.getHeight());
        view.getLocationOnScreen(this.f56196g);
        Rect rect = this.f56197h;
        int[] iArr = this.f56196g;
        rect.offset(iArr[0], iArr[1]);
        return this.f56197h.intersect(this.f56195f);
    }

    public final void a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z || currentTimeMillis - this.f56198i >= 200) {
            this.f56198i = currentTimeMillis;
            this.f56191b.removeCallbacks(this.f56192c);
            long nanoTime = System.nanoTime();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f56193d.getChildCount(); i2++) {
                View childAt = this.f56193d.getChildAt(i2);
                h hVar = (h) this.f56193d.a(childAt);
                UIComponent uIComponent = hVar.f56243a.f56245b;
                if (uIComponent != null && uIComponent.getEvents() != null && (uIComponent.getEvents().containsKey("nodeappear") || uIComponent.getEvents().containsKey("nodedisappear")) && a(childAt)) {
                    b bVar = new b(hVar.f56243a.f56245b.getSign(), hVar.getLayoutPosition(), hVar.f56243a.f56245b.f56439a);
                    hashSet.add(bVar);
                    if (!this.f56194e.contains(bVar)) {
                        arrayList.add(bVar);
                    }
                }
            }
            this.f56194e.removeAll(hashSet);
            Iterator<b> it = this.f56194e.iterator();
            while (it.hasNext()) {
                a("nodedisappear", it.next());
            }
            this.f56194e.clear();
            this.f56194e.addAll(hashSet);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a("nodeappear", (b) it2.next());
            }
            if (UIList.f56161h) {
                LLog.b("UIList", "onListContentChange time " + ((System.nanoTime() - nanoTime) / 1000) + " us");
            }
            if (!z) {
                this.f56191b.postDelayed(this.f56192c, 200);
            }
        }
    }

    public c(com.lynx.tasm.c cVar, RecyclerView recyclerView) {
        Rect rect = new Rect();
        this.f56195f = rect;
        this.f56196g = new int[2];
        this.f56197h = new Rect();
        this.f56198i = 0;
        DisplayMetrics a2 = DisplayMetricsHolder.a(recyclerView.getContext());
        rect.set(0, 0, a2.widthPixels, a2.heightPixels);
        this.f56190a = cVar;
        this.f56191b = new Handler(Looper.getMainLooper());
        this.f56192c = new a(this, (byte) 0);
        this.f56193d = recyclerView;
        recyclerView.a(new C1262c(this, (byte) 0));
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        viewTreeObserver.addOnDrawListener(new ViewTreeObserver.OnDrawListener() {
            /* class com.lynx.tasm.behavior.ui.list.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35118);
            }

            public final void onDraw() {
                c.this.a(false);
            }
        });
        viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.lynx.tasm.behavior.ui.list.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35119);
            }

            public final void onScrollChanged() {
                c.this.a(false);
            }
        });
    }

    private void a(String str, b bVar) {
        if (UIList.f56161h) {
            LLog.b("UIList", "sendNodeEvent " + str + "  " + bVar.f56203b + " " + bVar.f56204c);
        }
        g a2 = g.a(bVar.f56202a, str);
        a2.a("position", Integer.valueOf(bVar.f56203b));
        a2.a("key", bVar.f56204c);
        this.f56190a.a(a2);
    }
}
