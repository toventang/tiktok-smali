package com.bytedance.ies.bullet.service.c;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.h;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.p;
import h.f.b.l;
import h.f.b.m;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final C0701a f32655a;

    static {
        Covode.recordClassIndex(19418);
    }

    @Override // com.bytedance.ies.bullet.service.base.p
    public final Class<Activity> a() {
        return this.f32655a.f32656a;
    }

    @Override // com.bytedance.ies.bullet.service.base.p
    public final FrameLayout.LayoutParams b() {
        return this.f32655a.f32659d;
    }

    @Override // com.bytedance.ies.bullet.service.base.p
    public final FrameLayout.LayoutParams c() {
        return this.f32655a.f32660e;
    }

    /* renamed from: com.bytedance.ies.bullet.service.c.a$a  reason: collision with other inner class name */
    public static final class C0701a {

        /* renamed from: a  reason: collision with root package name */
        public Class<Activity> f32656a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super Context, ? extends k> f32657b = b.f32662a;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.b<? super Context, ? extends h> f32658c = C0702a.f32661a;

        /* renamed from: d  reason: collision with root package name */
        public FrameLayout.LayoutParams f32659d;

        /* renamed from: e  reason: collision with root package name */
        public FrameLayout.LayoutParams f32660e;

        static {
            Covode.recordClassIndex(19419);
        }

        /* renamed from: com.bytedance.ies.bullet.service.c.a$a$a  reason: collision with other inner class name */
        static final class C0702a extends m implements h.f.a.b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0702a f32661a = new C0702a();

            static {
                Covode.recordClassIndex(19420);
            }

            C0702a() {
                super(1);
            }

            @Override // h.f.a.b
            public final /* synthetic */ Object invoke(Object obj) {
                l.c(obj, "");
                return null;
            }
        }

        /* renamed from: com.bytedance.ies.bullet.service.c.a$a$b */
        static final class b extends m implements h.f.a.b {

            /* renamed from: a  reason: collision with root package name */
            public static final b f32662a = new b();

            static {
                Covode.recordClassIndex(19421);
            }

            b() {
                super(1);
            }

            @Override // h.f.a.b
            public final /* synthetic */ Object invoke(Object obj) {
                l.c(obj, "");
                return null;
            }
        }
    }

    private a(C0701a aVar) {
        this.f32655a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.p
    public final k a(Context context) {
        l.c(context, "");
        return (k) this.f32655a.f32657b.invoke(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.p
    public final h b(Context context) {
        l.c(context, "");
        return (h) this.f32655a.f32658c.invoke(context);
    }

    public /* synthetic */ a(C0701a aVar, byte b2) {
        this(aVar);
    }
}
