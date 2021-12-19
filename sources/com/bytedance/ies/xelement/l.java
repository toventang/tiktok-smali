package com.bytedance.ies.xelement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.e;
import com.bytedance.ies.xelement.b.i;
import com.bytedance.ies.xelement.defaultimpl.a.a;
import com.lynx.tasm.behavior.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f37164a;

    /* renamed from: b  reason: collision with root package name */
    public static e.b f37165b;

    /* renamed from: c  reason: collision with root package name */
    public static i.a f37166c = new a.C0895a();

    /* renamed from: d  reason: collision with root package name */
    public static final l f37167d = new l();

    /* renamed from: e  reason: collision with root package name */
    private static final a f37168e;

    public static final class a implements e.b {
        static {
            Covode.recordClassIndex(22353);
        }

        a() {
        }

        @Override // com.bytedance.ies.xelement.b.e.b
        public final e a(Context context, j jVar, int i2) {
            h.f.b.l.c(context, "");
            h.f.b.l.c(jVar, "");
            return new com.bytedance.ies.xelement.defaultimpl.player.impl.a(context, jVar, i2);
        }
    }

    private l() {
    }

    static {
        Covode.recordClassIndex(22352);
        a aVar = new a();
        f37168e = aVar;
        f37165b = aVar;
    }
}
