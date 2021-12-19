package com.bytedance.j.a.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.lynx.tasm.ui.image.i;
import com.ss.android.ugc.aweme.lancet.m;
import h.f.b.z;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f39000a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(23873);
    }

    public static final class b implements com.lynx.tasm.behavior.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f39002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f39003b;

        static {
            Covode.recordClassIndex(23875);
        }

        public b(b bVar, z.a aVar) {
            this.f39002a = bVar;
            this.f39003b = aVar;
        }

        @Override // com.lynx.tasm.behavior.b
        public final /* synthetic */ List a() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f39002a.f38973a.f38978e);
            if (this.f39003b.element) {
                arrayList.addAll(i.a().a());
            }
            return arrayList;
        }
    }

    public static final class a implements com.lynx.tasm.f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39001a = new a();

        static {
            Covode.recordClassIndex(23874);
        }

        a() {
        }

        @Override // com.lynx.tasm.f
        public final void a(String str) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.a(str);
                m.a(uptimeMillis, str);
            } catch (Throwable unused) {
            }
        }
    }
}
