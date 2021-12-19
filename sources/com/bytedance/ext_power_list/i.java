package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.extensions.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import java.util.List;

public interface i<S, ITEM extends com.bytedance.ies.powerlist.b.a> extends h<S, ITEM> {
    static {
        Covode.recordClassIndex(16881);
    }

    f<l> b();

    List<ITEM> c();

    f<l> d();

    f<l> e();

    public static final class a {
        static {
            Covode.recordClassIndex(16882);
        }

        public static <S, ITEM extends com.bytedance.ies.powerlist.b.a> f<l> a(i<S, ITEM> iVar) {
            return iVar.a().f28667a;
        }

        public static <S, ITEM extends com.bytedance.ies.powerlist.b.a> List<ITEM> b(i<S, ITEM> iVar) {
            return iVar.a().f28670d;
        }

        public static <S, ITEM extends com.bytedance.ies.powerlist.b.a> f<l> c(i<S, ITEM> iVar) {
            return iVar.a().f28669c;
        }

        public static <S, ITEM extends com.bytedance.ies.powerlist.b.a> f<l> d(i<S, ITEM> iVar) {
            return iVar.a().f28668b;
        }
    }
}
