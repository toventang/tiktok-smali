package com.bytedance.android.monitorV2.lynx.a;

import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.lynx.a.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Map<LynxView, a> f24054a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final d f24055b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(14177);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ a $this_apply;

        static {
            Covode.recordClassIndex(14178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a aVar) {
            super(0);
            this.$this_apply = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            b.b("LynxViewChecker_LynxBlankData_Template", this.$this_apply.a());
            if (this.$this_apply.f24028g != null) {
                StringBuilder sb = new StringBuilder();
                List<a.C0515a> list = this.$this_apply.f24028g;
                l.a((Object) list, "");
                Iterator<T> it = list.iterator();
                loop0:
                while (true) {
                    i2 = 0;
                    while (it.hasNext()) {
                        sb.append(new StringBuilder().append((Object) it.next()).append(' ').toString());
                        i2++;
                        if (i2 >= 6) {
                            b.b("LynxViewChecker_LynxBlankData_Element", sb.toString());
                            p.a(sb);
                        }
                    }
                    break loop0;
                }
                if (i2 != 0) {
                    b.b("LynxViewChecker_LynxBlankData_Element", sb.toString());
                }
            }
            return z.f158842a;
        }
    }

    public static void a(LynxView lynxView, a.C0515a aVar) {
        l.c(lynxView, "");
        l.c(aVar, "");
        a aVar2 = f24054a.get(lynxView);
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }
}
