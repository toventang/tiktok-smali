package com.ss.android.ugc.aweme.common.h;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f76436a = new c();

    public interface b {
        static {
            Covode.recordClassIndex(47194);
        }

        Object a(int i2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(47196);
        }

        void a(int i2, int i3);
    }

    static final class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public static final e f76443a = new e();

        private e() {
        }

        static {
            Covode.recordClassIndex(47197);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            c.a(recyclerView);
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(47192);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f76437a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedList<C1743c> f76438b;

        static {
            Covode.recordClassIndex(47193);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f76437a, aVar.f76437a) && l.a(this.f76438b, aVar.f76438b);
        }

        public final int hashCode() {
            b bVar = this.f76437a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            LinkedList<C1743c> linkedList = this.f76438b;
            if (linkedList != null) {
                i2 = linkedList.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "Data(identifier=" + this.f76437a + ", history=" + this.f76438b + ")";
        }

        public /* synthetic */ a(b bVar) {
            this(bVar, new LinkedList());
        }

        private a(b bVar, LinkedList<C1743c> linkedList) {
            l.d(linkedList, "");
            this.f76437a = bVar;
            this.f76438b = linkedList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.recyclerview.widget.RecyclerView r13) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.h.c.a(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.h.c$c  reason: collision with other inner class name */
    public static final class C1743c {

        /* renamed from: a  reason: collision with root package name */
        public int f76439a;

        /* renamed from: b  reason: collision with root package name */
        public Object f76440b;

        /* renamed from: c  reason: collision with root package name */
        public int f76441c;

        /* renamed from: d  reason: collision with root package name */
        public int f76442d;

        static {
            Covode.recordClassIndex(47195);
        }

        public C1743c() {
            this(0, null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1743c)) {
                return false;
            }
            C1743c cVar = (C1743c) obj;
            return this.f76439a == cVar.f76439a && l.a(this.f76440b, cVar.f76440b) && this.f76441c == cVar.f76441c && this.f76442d == cVar.f76442d;
        }

        public final int hashCode() {
            int i2 = this.f76439a * 31;
            Object obj = this.f76440b;
            return ((((i2 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f76441c) * 31) + this.f76442d;
        }

        public final String toString() {
            return "Item(pos=" + this.f76439a + ", id=" + this.f76440b + ", status=" + this.f76441c + ", newStatus=" + this.f76442d + ")";
        }

        private C1743c(int i2, Object obj) {
            this.f76439a = i2;
            this.f76440b = obj;
            this.f76441c = 0;
            this.f76442d = 0;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1743c(int i2, Object obj, int i3) {
            this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? null : obj);
        }
    }

    public static final void a(RecyclerView recyclerView, b bVar) {
        if (recyclerView != null && !(recyclerView.getTag(R.id.djt) instanceof a)) {
            recyclerView.a(e.f76443a);
            recyclerView.setTag(R.id.djt, new a(bVar));
        }
    }
}
