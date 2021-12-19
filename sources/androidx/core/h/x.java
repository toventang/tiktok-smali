package androidx.core.h;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.a.d;
import h.f.b.l;
import h.l.h;
import java.util.Iterator;

public final class x {
    static {
        Covode.recordClassIndex(884);
    }

    public static final class a implements h<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2579a;

        static {
            Covode.recordClassIndex(885);
        }

        @Override // h.l.h
        public final Iterator<View> a() {
            ViewGroup viewGroup = this.f2579a;
            l.c(viewGroup, "");
            return new b(viewGroup);
        }

        a(ViewGroup viewGroup) {
            this.f2579a = viewGroup;
        }
    }

    public static final class b implements d, Iterator<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2580a;

        /* renamed from: b  reason: collision with root package name */
        private int f2581b;

        static {
            Covode.recordClassIndex(886);
        }

        public final boolean hasNext() {
            if (this.f2581b < this.f2580a.getChildCount()) {
                return true;
            }
            return false;
        }

        public final void remove() {
            ViewGroup viewGroup = this.f2580a;
            int i2 = this.f2581b - 1;
            this.f2581b = i2;
            viewGroup.removeViewAt(i2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ View next() {
            ViewGroup viewGroup = this.f2580a;
            int i2 = this.f2581b;
            this.f2581b = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        b(ViewGroup viewGroup) {
            this.f2580a = viewGroup;
        }
    }

    public static final h<View> a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        return new a(viewGroup);
    }
}
