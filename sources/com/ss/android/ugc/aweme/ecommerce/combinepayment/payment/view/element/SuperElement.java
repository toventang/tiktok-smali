package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class SuperElement extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public e f85490a;

    /* renamed from: b  reason: collision with root package name */
    public n f85491b;

    /* renamed from: c  reason: collision with root package name */
    public e f85492c;

    static {
        Covode.recordClassIndex(53485);
    }

    public SuperElement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final e getElement() {
        return this.f85492c;
    }

    public final e getElementDTO() {
        return this.f85490a;
    }

    public final n getPaymentInfo() {
        return this.f85491b;
    }

    public final void setElement(e eVar) {
        this.f85492c = eVar;
    }

    public final void setElementDTO(e eVar) {
        this.f85490a = eVar;
    }

    public final void setPaymentInfo(n nVar) {
        this.f85491b = nVar;
    }

    public static final class a extends m implements b<List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, String> {
        final /* synthetic */ e $elementDTO$inlined;
        final /* synthetic */ o $paymentMethod$inlined;
        final /* synthetic */ List $values$inlined;
        final /* synthetic */ SuperElement this$0;

        static {
            Covode.recordClassIndex(53486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SuperElement superElement, e eVar, o oVar, List list) {
            super(1);
            this.this$0 = superElement;
            this.$elementDTO$inlined = eVar;
            this.$paymentMethod$inlined = oVar;
            this.$values$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list) {
            boolean z;
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> arrayList;
            p pVar;
            T t;
            p pVar2;
            List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> paymentElements;
            List<? extends com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> list2 = list;
            l.d(list2, "");
            String a2 = c.a(this.$elementDTO$inlined, this.$paymentMethod$inlined, list2);
            SuperElement superElement = this.this$0;
            if (a2 == null) {
                z = true;
            } else {
                z = false;
            }
            n nVar = superElement.f85491b;
            if (nVar == null || (pVar2 = nVar.f85328a) == null || (paymentElements = pVar2.getPaymentElements()) == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = h.a.n.g((Collection) paymentElements);
            }
            for (T t2 : list2) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (l.a((Object) t.getElement(), (Object) t2.getElement())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t3.setParamValue(t2.getParamValue());
                } else {
                    Boolean.valueOf(arrayList.add(t2));
                }
            }
            n nVar2 = superElement.f85491b;
            if (!(nVar2 == null || (pVar = nVar2.f85328a) == null)) {
                pVar.setPaymentElements(arrayList);
            }
            n nVar3 = superElement.f85491b;
            if (nVar3 != null) {
                nVar3.f85331d = Boolean.valueOf(z);
            }
            return a2;
        }
    }

    private /* synthetic */ SuperElement(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SuperElement(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4882);
        MethodCollector.o(4882);
    }
}
