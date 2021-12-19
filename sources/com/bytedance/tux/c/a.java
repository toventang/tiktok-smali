package com.bytedance.tux.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.a.c;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f44749a;

    /* renamed from: b  reason: collision with root package name */
    public int f44750b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f44751c = -1;

    /* renamed from: d  reason: collision with root package name */
    public Integer f44752d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f44753e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f44754f;

    static {
        Covode.recordClassIndex(27339);
    }

    public final c b(Context context) {
        l.c(context, "");
        b a2 = a(context);
        a2.setBounds(0, 0, a2.a(), a2.b());
        return new c(a2, 2);
    }

    /* renamed from: com.bytedance.tux.c.a$a  reason: collision with other inner class name */
    public static final class C1092a extends m implements b<a, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1092a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.this$0.f44749a;
            aVar2.f44750b = this.this$0.f44750b;
            aVar2.f44751c = this.this$0.f44751c;
            aVar2.f44752d = this.this$0.f44752d;
            aVar2.f44753e = this.this$0.f44753e;
            aVar2.f44754f = this.this$0.f44754f;
            return z.f158842a;
        }
    }

    public final b a(Context context) {
        l.c(context, "");
        b bVar = new b(context, this.f44749a);
        int i2 = this.f44750b;
        if (i2 >= 0) {
            bVar.a(i2);
        }
        int i3 = this.f44751c;
        if (i3 >= 0) {
            bVar.b(i3);
        }
        Integer num = this.f44752d;
        if (num != null) {
            bVar.c(num.intValue());
        }
        Integer num2 = this.f44753e;
        if (num2 != null) {
            bVar.a(context, num2.intValue());
        }
        bVar.b(this.f44754f);
        return bVar;
    }
}
