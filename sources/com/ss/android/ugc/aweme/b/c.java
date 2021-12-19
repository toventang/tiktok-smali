package com.ss.android.ugc.aweme.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.q.a.b.d;
import com.ss.android.ugc.aweme.q.a.b.e;
import h.f.b.l;
import j.a.a.f;
import j.a.a.h;
import java.util.ArrayList;

public abstract class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67859b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final bl f67860a;

    static {
        Covode.recordClassIndex(41767);
    }

    public abstract void a(f fVar, bl blVar, String str);

    public static final class a {
        static {
            Covode.recordClassIndex(41768);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final f a() {
        f fVar = new f();
        l.d(fVar, "");
        fVar.a(com.ss.android.ugc.aweme.api.model.a.class);
        new h(fVar, com.ss.android.ugc.aweme.api.model.a.class).a(new com.ss.android.ugc.aweme.q.a.b.b(this.f67860a), new com.ss.android.ugc.aweme.q.a.b.c(this.f67860a), new e(this.f67860a), new d(this.f67860a), new com.ss.android.ugc.aweme.q.a.b.a(this.f67860a)).a(b.f67861a);
        a(fVar, this.f67860a, "enter_page");
        return fVar;
    }

    public c(bl blVar) {
        this.f67860a = blVar;
    }

    static final class b<T> implements j.a.a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67861a = new b();

        static {
            Covode.recordClassIndex(41769);
        }

        b() {
        }

        @Override // j.a.a.e
        public final /* synthetic */ int a(Object obj) {
            ArrayList<AnchorCell> arrayList;
            ArrayList<AnchorCell> arrayList2;
            com.ss.android.ugc.aweme.api.model.a aVar = (com.ss.android.ugc.aweme.api.model.a) obj;
            l.d(aVar, "");
            Integer num = aVar.f66463a;
            if (num != null && num.intValue() == 1) {
                ArrayList<AnchorCell> arrayList3 = aVar.f66467e;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    return 1;
                }
                return 2;
            }
            Integer num2 = aVar.f66463a;
            if (num2 != null && num2.intValue() == 2 && (arrayList = aVar.f66467e) != null && !arrayList.isEmpty()) {
                return 3;
            }
            Integer num3 = aVar.f66463a;
            if (num3 != null && num3.intValue() == 3 && (arrayList2 = aVar.f66467e) != null && !arrayList2.isEmpty()) {
                return 4;
            }
            return 0;
        }
    }
}
