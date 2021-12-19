package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i extends LinearLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    private final int f85604a;

    /* renamed from: b  reason: collision with root package name */
    private final int f85605b;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.b<? super List<m>, z> f85606c;

    /* renamed from: d  reason: collision with root package name */
    private o f85607d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e f85608e;

    static {
        Covode.recordClassIndex(53542);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e getElementDTO() {
        return this.f85608e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, h.z> */
    public final h.f.a.b<List<m>, z> getOnValueChange() {
        return this.f85606c;
    }

    public final o getPaymentMethod() {
        return this.f85607d;
    }

    public static final class a implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85609a;

        static {
            Covode.recordClassIndex(53543);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85610a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f85611b;

                static {
                    Covode.recordClassIndex(53544);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85610a < this.f85611b.f85609a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85611b.f85609a;
                    int i2 = this.f85610a;
                    this.f85610a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85611b = r1;
                }
            };
        }

        public a(ViewGroup viewGroup) {
            this.f85609a = viewGroup;
        }
    }

    public static final class b implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85612a;

        static {
            Covode.recordClassIndex(53545);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85613a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f85614b;

                static {
                    Covode.recordClassIndex(53546);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85613a < this.f85614b.f85612a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85614b.f85612a;
                    int i2 = this.f85613a;
                    this.f85613a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85614b = r1;
                }
            };
        }

        public b(ViewGroup viewGroup) {
            this.f85612a = viewGroup;
        }
    }

    public static final class c implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85615a;

        static {
            Covode.recordClassIndex(53547);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85616a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f85617b;

                static {
                    Covode.recordClassIndex(53548);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85616a < this.f85617b.f85615a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85617b.f85615a;
                    int i2 = this.f85616a;
                    this.f85616a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85617b = r1;
                }
            };
        }

        public c(ViewGroup viewGroup) {
            this.f85615a = viewGroup;
        }
    }

    public static final class d implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85618a;

        static {
            Covode.recordClassIndex(53549);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85619a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f85620b;

                static {
                    Covode.recordClassIndex(53550);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85619a < this.f85620b.f85618a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85620b.f85618a;
                    int i2 = this.f85619a;
                    this.f85619a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85620b = r1;
                }
            };
        }

        public d(ViewGroup viewGroup) {
            this.f85618a = viewGroup;
        }
    }

    public static final class e implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f85621a;

        static {
            Covode.recordClassIndex(53551);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f85622a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ e f85623b;

                static {
                    Covode.recordClassIndex(53552);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f85622a < this.f85623b.f85621a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f85623b.f85621a;
                    int i2 = this.f85622a;
                    this.f85622a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f85623b = r1;
                }
            };
        }

        public e(ViewGroup viewGroup) {
            this.f85621a = viewGroup;
        }
    }

    public final void a() {
        b<View> bVar = new b(this);
        ArrayList<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c> arrayList = new ArrayList();
        for (View view : bVar) {
            if ((view instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c) && view != null) {
                arrayList.add(view);
            }
        }
        for (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c cVar : arrayList) {
            if (cVar.a()) {
                cVar.setChecked(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final List<m> getValue() {
        Boolean bool;
        Object obj;
        String str;
        String str2;
        String str3;
        c cVar = new c(this);
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            if ((view instanceof com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c) obj).a()) {
                break;
            }
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c cVar2 = (com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c) obj;
        if (cVar2 == null) {
            return h.a.z.INSTANCE;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO = getElementDTO();
        if (elementDTO != null) {
            str = elementDTO.f85288a;
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO2 = getElementDTO();
        if (elementDTO2 != null) {
            str2 = elementDTO2.f85293f;
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.g option = cVar2.getOption();
        if (option != null) {
            str3 = option.f85306b;
        } else {
            str3 = null;
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e elementDTO3 = getElementDTO();
        if (elementDTO3 != null) {
            bool = elementDTO3.f85298k;
        }
        return n.a(new m(str, str2, str3, bool, null, 16, null));
    }

    public final void setElementDTO(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e eVar) {
        this.f85608e = eVar;
    }

    public final void setPaymentMethod(o oVar) {
        this.f85607d = oVar;
    }

    static final class g extends h.f.b.m implements h.f.a.b<List<? extends m>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f85626a = new g();

        static {
            Covode.recordClassIndex(53554);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends m> list) {
            l.d(list, "");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    public final void setOnValueChange(h.f.a.b<? super List<m>, z> bVar) {
        l.d(bVar, "");
        this.f85606c = bVar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c f85624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f85625b;

        static {
            Covode.recordClassIndex(53553);
        }

        f(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c cVar, i iVar) {
            this.f85624a = cVar;
            this.f85625b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f85624a.a()) {
                this.f85625b.a();
                this.f85624a.setChecked(true);
                this.f85625b.getOnValueChange().invoke(this.f85625b.getValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(8537);
        this.f85604a = (int) com.bytedance.common.utility.n.b(context, 60.0f);
        this.f85605b = (int) com.bytedance.common.utility.n.b(context, 6.0f);
        this.f85606c = g.f85626a;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        MethodCollector.o(8537);
    }

    public /* synthetic */ i(Context context, byte b2) {
        this(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0179, code lost:
        if (r1 == null) goto L_0x017b;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e r9, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r10, java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m> r11, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.i.a(com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o, java.util.List, java.lang.Object):void");
    }
}
