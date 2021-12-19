package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.d;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.f;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.g;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.i;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public interface e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f85574f = a.f85575a;

    static {
        Covode.recordClassIndex(53527);
    }

    void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, List<m> list, Object obj);

    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO();

    List<m> getValue();

    void setOnValueChange(b<? super List<m>, z> bVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f85575a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53528);
        }

        public static com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar) {
            l.d(eVar, "");
            l.d(oVar, "");
            Integer num = eVar.f85290c;
            int ordinal = f.Normal.ordinal();
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = f.Email.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = f.CardNumber.ordinal();
                    if (num != null && num.intValue() == ordinal3) {
                        return new c(eVar, oVar);
                    }
                    int ordinal4 = f.Date.ordinal();
                    if (num != null && num.intValue() == ordinal4) {
                        return new d(eVar, oVar);
                    }
                    int ordinal5 = f.CPF.ordinal();
                    if (num != null && num.intValue() == ordinal5) {
                        return new f(eVar, oVar);
                    }
                    int ordinal6 = f.Phone.ordinal();
                    if (num != null && num.intValue() == ordinal6) {
                        return new i(eVar, oVar, (byte) 0);
                    }
                    int ordinal7 = f.Address.ordinal();
                    if (num != null && num.intValue() == ordinal7) {
                        return new com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.a(eVar, oVar);
                    }
                    int ordinal8 = f.Option.ordinal();
                    if (num != null && num.intValue() == ordinal8) {
                        return new g(eVar, oVar, (byte) 0);
                    }
                    return null;
                }
            }
            return new f(eVar, oVar);
        }

        public static e a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar, o oVar, Context context) {
            l.d(eVar, "");
            l.d(context, "");
            Integer num = eVar.f85290c;
            int ordinal = f.Normal.ordinal();
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = f.CPF.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = f.Email.ordinal();
                    if (num == null || num.intValue() != ordinal3) {
                        int ordinal4 = f.CardNumber.ordinal();
                        List<o> list = null;
                        if (num != null && num.intValue() == ordinal4) {
                            c cVar = new c(context, (byte) 0);
                            if (oVar != null) {
                                list = oVar.f85341h;
                            }
                            cVar.setPaymentList(list);
                            return cVar;
                        }
                        int ordinal5 = f.Date.ordinal();
                        if (num != null && num.intValue() == ordinal5) {
                            return new d(context, (byte) 0);
                        }
                        int ordinal6 = f.Region.ordinal();
                        if (num != null && num.intValue() == ordinal6) {
                            return new k(context, (byte) 0);
                        }
                        int ordinal7 = f.Phone.ordinal();
                        if (num != null && num.intValue() == ordinal7) {
                            return new j(context, (byte) 0);
                        }
                        int ordinal8 = f.Address.ordinal();
                        if (num != null && num.intValue() == ordinal8) {
                            return new a(context, (byte) 0);
                        }
                        int ordinal9 = f.Option.ordinal();
                        if (num != null && num.intValue() == ordinal9) {
                            return new i(context, (byte) 0);
                        }
                        return null;
                    }
                }
            }
            return new h(context, (byte) 0);
        }
    }
}
