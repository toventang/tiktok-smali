package com.ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public float f74967a;

    /* renamed from: b  reason: collision with root package name */
    public float f74968b;

    /* renamed from: c  reason: collision with root package name */
    public float f74969c;

    /* renamed from: d  reason: collision with root package name */
    public float f74970d;

    /* renamed from: e  reason: collision with root package name */
    public int f74971e;

    /* renamed from: f  reason: collision with root package name */
    public float f74972f;

    /* renamed from: g  reason: collision with root package name */
    public float f74973g;

    static {
        Covode.recordClassIndex(46227);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public float f74974a;

        /* renamed from: b  reason: collision with root package name */
        public float f74975b;

        /* renamed from: c  reason: collision with root package name */
        public int f74976c;

        /* renamed from: d  reason: collision with root package name */
        private float f74977d;

        /* renamed from: e  reason: collision with root package name */
        private float f74978e;

        /* renamed from: f  reason: collision with root package name */
        private float f74979f;

        /* renamed from: g  reason: collision with root package name */
        private float f74980g;

        static {
            Covode.recordClassIndex(46228);
        }

        public final b a() {
            b bVar = new b();
            bVar.f74967a = this.f74974a;
            bVar.f74968b = this.f74977d;
            bVar.f74969c = this.f74978e;
            bVar.f74972f = this.f74979f;
            bVar.f74973g = this.f74980g;
            bVar.f74970d = this.f74975b;
            bVar.f74971e = this.f74976c;
            return bVar;
        }

        public final a a(PointF pointF) {
            l.d(pointF, "");
            this.f74977d = pointF.x;
            this.f74978e = pointF.y;
            return this;
        }

        public final a b(PointF pointF) {
            l.d(pointF, "");
            this.f74979f = pointF.x;
            this.f74980g = pointF.y;
            return this;
        }
    }
}
