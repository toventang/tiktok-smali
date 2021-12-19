package com.ss.android.ugc.aweme.inbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import com.bytedance.android.widget.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import h.f.b.l;
import java.util.Collection;

public final class InboxFragmentVM extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final a f103977e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final d<Integer> f103978a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<u> f103979b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<Integer> f103980c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<InboxAdapterWidget.b> f103981d;

    /* renamed from: f  reason: collision with root package name */
    private final d<u> f103982f;

    static {
        Covode.recordClassIndex(66598);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66599);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public InboxFragmentVM() {
        d<u> dVar = new d<>();
        this.f103982f = dVar;
        d<Integer> dVar2 = new d<>();
        this.f103978a = dVar2;
        this.f103979b = dVar;
        this.f103980c = dVar2;
        LiveData<InboxAdapterWidget.b> a2 = aa.a(dVar, b.f103983a);
        l.b(a2, "");
        this.f103981d = a2;
    }

    public final void a(u uVar) {
        l.d(uVar, "");
        this.f103982f.setValue(uVar);
    }

    static final class b<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103983a = new b();

        static {
            Covode.recordClassIndex(66600);
        }

        b() {
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            u uVar = (u) obj;
            if (uVar != null) {
                int i2 = n.f104333a[uVar.ordinal()];
                if (i2 == 1) {
                    return InboxAdapterWidget.b.SUCCESS;
                }
                if (i2 == 2) {
                    return InboxAdapterWidget.b.FAIL;
                }
                if (i2 == 3) {
                    return InboxAdapterWidget.b.EMPTY;
                }
                if (i2 == 4 || i2 == 5) {
                    return InboxAdapterWidget.b.LOADING;
                }
            }
            return InboxAdapterWidget.b.LOADING;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Collection<? extends InboxAdapterWidget> collection, int i2, boolean z) {
        int i3 = 0;
        for (T t : collection) {
            int itemCount = t.g().getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                int a2 = t.a(i4);
                if (a2 == -1) {
                    continue;
                    break;
                }
                int i5 = a2 + i3;
                if (i5 > i2 || (z && i5 >= i2)) {
                    this.f103978a.postValue(Integer.valueOf(i5));
                    return true;
                }
            }
            i3 += itemCount;
        }
        return false;
    }
}
