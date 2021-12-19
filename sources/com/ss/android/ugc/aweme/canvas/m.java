package com.ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.tools.utils.o;
import h.f.b.l;
import java.util.HashMap;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public e f69710a;

    /* renamed from: b  reason: collision with root package name */
    final l f69711b = new l();

    /* renamed from: c  reason: collision with root package name */
    String f69712c = "unset";

    /* renamed from: d  reason: collision with root package name */
    float f69713d = 0.15f;

    /* renamed from: e  reason: collision with root package name */
    float f69714e = 20.0f;

    /* renamed from: f  reason: collision with root package name */
    public RectF f69715f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, a> f69716g = new HashMap<>();

    static {
        Covode.recordClassIndex(42988);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f69710a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public float f69717a;

        /* renamed from: b  reason: collision with root package name */
        public float f69718b = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public final PointF[] f69719c;

        /* renamed from: d  reason: collision with root package name */
        public final RectF f69720d;

        static {
            Covode.recordClassIndex(42989);
        }

        public a() {
            PointF[] pointFArr = new PointF[4];
            int i2 = 0;
            do {
                pointFArr[i2] = new PointF();
                i2++;
            } while (i2 < 4);
            this.f69719c = pointFArr;
            this.f69720d = new RectF();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f69721a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f69722b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f69723c;

        static {
            Covode.recordClassIndex(42990);
        }

        b(m mVar, View view, e eVar) {
            this.f69721a = mVar;
            this.f69722b = view;
            this.f69723c = eVar;
        }

        public final void run() {
            this.f69721a.f69715f = new RectF(0.0f, 0.0f, (float) this.f69722b.getWidth(), (float) this.f69722b.getHeight());
            this.f69721a.f69710a = this.f69723c;
            this.f69723c.setEnableFakeFeedView(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final a b() {
        if (this.f69716g.get(this.f69712c) == null) {
            HashMap<String, a> hashMap = this.f69716g;
            String str = this.f69712c;
            a aVar = new a();
            RectF rectF = aVar.f69720d;
            RectF rectF2 = this.f69715f;
            if (rectF2 == null) {
                l.a("initializeRect");
            }
            rectF.set(rectF2);
            hashMap.put(str, aVar);
        }
        a aVar2 = this.f69716g.get(this.f69712c);
        if (aVar2 != null) {
            return aVar2;
        }
        throw new IllegalStateException("cannot find canvas state");
    }

    /* access modifiers changed from: package-private */
    public final PointF[] c() {
        a b2 = b();
        PointF[] pointFArr = b2.f69719c;
        RectF rectF = b2.f69720d;
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
        for (PointF pointF : pointFArr) {
            o.a(pointF, rectF.centerX(), rectF.centerY(), (float) Math.toRadians((double) b2.f69717a));
        }
        return pointFArr;
    }
}
