package com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class d extends LinearLayoutCompat {

    /* renamed from: e  reason: collision with root package name */
    public static final b f87492e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final int f87493a;

    /* renamed from: b  reason: collision with root package name */
    final int f87494b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<c> f87495c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f87496d;

    public interface a {
        static {
            Covode.recordClassIndex(54981);
        }

        void a(String[] strArr);
    }

    static {
        Covode.recordClassIndex(54980);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54982);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void setCheckedChangeListener(a aVar) {
        l.d(aVar, "");
        this.f87496d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.d(context, "");
        setOrientation(1);
        this.f87493a = (int) n.b(context, 20.0f);
        this.f87494b = (int) n.b(context, 8.0f);
    }

    public static final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f87497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f87498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f87499c;

        static {
            Covode.recordClassIndex(54983);
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.skuwidget.c.b
        public final void a(int i2, com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar) {
            String str;
            boolean z;
            String[] strArr = (String[]) this.f87498b.element;
            if (aVar == null || (str = aVar.f87405b) == null) {
                str = "";
            }
            strArr[i2] = str;
            int i3 = 0;
            for (T t : this.f87497a.f87495c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.n.a();
                }
                T t2 = t;
                if (i3 != i2) {
                    List list = this.f87499c;
                    l.d(strArr, "");
                    l.d(list, "");
                    Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                    l.b(copyOf, "");
                    String[] strArr2 = (String[]) copyOf;
                    int childCount = t2.getChildCount();
                    for (int i5 = t2.f87476c; i5 < childCount; i5++) {
                        int i6 = i5 - t2.f87476c;
                        List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> list2 = t2.f87474a;
                        if (list2 == null) {
                            l.a("itemViewInfoList");
                        }
                        if (i6 < list2.size()) {
                            List<com.ss.android.ugc.aweme.ecommerce.sku.model.a.a> list3 = t2.f87474a;
                            if (list3 == null) {
                                l.a("itemViewInfoList");
                            }
                            com.ss.android.ugc.aweme.ecommerce.sku.model.a.a aVar2 = list3.get(i6);
                            strArr2[t2.f87477d] = aVar2.f87405b;
                            if (com.ss.android.ugc.aweme.ecommerce.sku.c.a.a(strArr2, list) > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar2.f87404a = z;
                            View childAt = t2.getChildAt(i5);
                            l.b(childAt, "");
                            t2.a(childAt, aVar2);
                        }
                    }
                }
                i3 = i4;
            }
            a aVar3 = this.f87497a.f87496d;
            if (aVar3 != null) {
                aVar3.a(strArr);
            }
        }

        c(d dVar, z.e eVar, List list) {
            this.f87497a = dVar;
            this.f87498b = eVar;
            this.f87499c = list;
        }
    }
}
