package com.ss.android.ugc.aweme.cp;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static int f78270a;

    /* renamed from: b  reason: collision with root package name */
    static final h.h f78271b = i.a((h.f.a.a) a.f78274a);

    /* renamed from: c  reason: collision with root package name */
    static final h.h f78272c = i.a((h.f.a.a) b.f78275a);

    /* renamed from: d  reason: collision with root package name */
    public static final h f78273d = new h();

    private h() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f78274a = new a();

        static {
            Covode.recordClassIndex(48529);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "resize_feed_in_small_screen", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(48528);
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78275a = new b();

        static {
            Covode.recordClassIndex(48530);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Context a2 = d.a();
            if (h.f78270a == 0) {
                Resources resources = a2.getResources();
                l.b(resources, "");
                h.f78270a = (int) (((float) resources.getDisplayMetrics().heightPixels) / a2.getResources().getDisplayMetrics().density);
            }
            if (h.f78270a <= 640) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
