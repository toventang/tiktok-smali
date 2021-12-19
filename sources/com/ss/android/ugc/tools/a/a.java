package com.ss.android.ugc.tools.a;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

/* access modifiers changed from: package-private */
public final class a extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f149067a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f149068b;

    /* renamed from: c  reason: collision with root package name */
    private final h f149069c = i.a((h.f.a.a) C4023a.f149076a);

    /* renamed from: d  reason: collision with root package name */
    private final h f149070d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f149071e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final int f149072f;

    /* renamed from: g  reason: collision with root package name */
    private final int f149073g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewGroup f149074h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f149075i = null;

    static {
        Covode.recordClassIndex(98195);
    }

    private final Rect b() {
        return (Rect) this.f149070d.getValue();
    }

    private final int c() {
        return ((Number) this.f149071e.getValue()).intValue();
    }

    public final Rect a() {
        return (Rect) this.f149069c.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.a.a$a  reason: collision with other inner class name */
    static final class C4023a extends m implements h.f.a.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4023a f149076a = new C4023a();

        static {
            Covode.recordClassIndex(98196);
        }

        C4023a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    static final class c extends m implements h.f.a.a<Rect> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(98198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            return new Rect(this.this$0.a());
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(98197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.this$0.f149067a.getContext());
            l.b(viewConfiguration, "");
            return Integer.valueOf(viewConfiguration.getScaledTouchSlop());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.a.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, int i3, ViewGroup viewGroup, View view) {
        super(new Rect(), view);
        l.d(viewGroup, "");
        l.d(view, "");
        this.f149072f = i2;
        this.f149073g = i3;
        this.f149074h = viewGroup;
        this.f149067a = view;
    }
}
