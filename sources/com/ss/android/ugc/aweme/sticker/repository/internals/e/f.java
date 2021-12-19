package com.ss.android.ugc.aweme.sticker.repository.internals.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public abstract class f {
    static {
        Covode.recordClassIndex(88670);
    }

    public abstract void a(List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list);

    private f() {
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.sticker.repository.d.a.a f135649a;

        static {
            Covode.recordClassIndex(88671);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f135649a, ((a) obj).f135649a);
            }
            return true;
        }

        public final int hashCode() {
            com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar = this.f135649a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Add(filter=" + this.f135649a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar) {
            super((byte) 0);
            l.d(aVar, "");
            this.f135649a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.internals.e.f
        public final void a(List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list) {
            l.d(list, "");
            if (!list.contains(this.f135649a)) {
                list.add(this.f135649a);
            }
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.sticker.repository.d.a.a f135650a;

        static {
            Covode.recordClassIndex(88672);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f135650a, ((b) obj).f135650a);
            }
            return true;
        }

        public final int hashCode() {
            com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar = this.f135650a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Remove(filter=" + this.f135650a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.ss.android.ugc.aweme.sticker.repository.d.a.a aVar) {
            super((byte) 0);
            l.d(aVar, "");
            this.f135650a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.internals.e.f
        public final void a(List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list) {
            l.d(list, "");
            list.remove(this.f135650a);
        }
    }

    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final h.f.a.b<com.ss.android.ugc.aweme.sticker.repository.d.a.a, Boolean> f135651a;

        static {
            Covode.recordClassIndex(88673);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && l.a(this.f135651a, ((c) obj).f135651a);
            }
            return true;
        }

        public final int hashCode() {
            h.f.a.b<com.ss.android.ugc.aweme.sticker.repository.d.a.a, Boolean> bVar = this.f135651a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "RemoveWithPredicate(predicate=" + this.f135651a + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.repository.d.a.a, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.f.a.b<? super com.ss.android.ugc.aweme.sticker.repository.d.a.a, Boolean> bVar) {
            super((byte) 0);
            l.d(bVar, "");
            this.f135651a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.internals.e.f
        public final void a(List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> list) {
            l.d(list, "");
            Iterator<com.ss.android.ugc.aweme.sticker.repository.d.a.a> it = list.iterator();
            while (it.hasNext()) {
                if (this.f135651a.invoke(it.next()).booleanValue()) {
                    it.remove();
                }
            }
        }
    }
}
