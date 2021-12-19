package com.bytedance.ies.bullet.service.popup;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.h;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.v;
import h.f.b.l;
import h.f.b.m;

public final class i implements v {

    /* renamed from: a  reason: collision with root package name */
    private final a f33004a;

    static {
        Covode.recordClassIndex(19697);
    }

    @Override // com.bytedance.ies.bullet.service.base.v
    public final FrameLayout.LayoutParams a() {
        return this.f33004a.f33007c;
    }

    @Override // com.bytedance.ies.bullet.service.base.v
    public final FrameLayout.LayoutParams b() {
        return this.f33004a.f33008d;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.b<? super Context, ? extends k> f33005a = b.f33010a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super Context, ? extends h> f33006b = C0720a.f33009a;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout.LayoutParams f33007c;

        /* renamed from: d  reason: collision with root package name */
        public FrameLayout.LayoutParams f33008d;

        static {
            Covode.recordClassIndex(19698);
        }

        /* renamed from: com.bytedance.ies.bullet.service.popup.i$a$a  reason: collision with other inner class name */
        static final class C0720a extends m implements h.f.a.b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0720a f33009a = new C0720a();

            static {
                Covode.recordClassIndex(19699);
            }

            C0720a() {
                super(1);
            }

            @Override // h.f.a.b
            public final /* synthetic */ Object invoke(Object obj) {
                l.c(obj, "");
                return null;
            }
        }

        static final class b extends m implements h.f.a.b {

            /* renamed from: a  reason: collision with root package name */
            public static final b f33010a = new b();

            static {
                Covode.recordClassIndex(19700);
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

    private i(a aVar) {
        this.f33004a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.v
    public final k a(Context context) {
        l.c(context, "");
        return (k) this.f33004a.f33005a.invoke(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.v
    public final h b(Context context) {
        l.c(context, "");
        return (h) this.f33004a.f33006b.invoke(context);
    }

    public /* synthetic */ i(a aVar, byte b2) {
        this(aVar);
    }
}
