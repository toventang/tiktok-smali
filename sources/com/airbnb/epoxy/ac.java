package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ac extends ArrayList<s<?>> {
    boolean notificationsPaused;
    public c observer;

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(2102);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(2099);
    }

    /* access modifiers changed from: package-private */
    public class b extends a implements ListIterator<s<?>> {
        static {
            Covode.recordClassIndex(2101);
        }

        public final int nextIndex() {
            return this.f4996a;
        }

        public final boolean hasPrevious() {
            if (this.f4996a != 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f4996a - 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.ListIterator
        public final /* synthetic */ s<?> previous() {
            a();
            int i2 = this.f4996a - 1;
            if (i2 >= 0) {
                this.f4996a = i2;
                this.f4997b = i2;
                return ac.this.get(i2);
            }
            throw new NoSuchElementException();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public final /* synthetic */ void set(s<?> sVar) {
            s<?> sVar2 = sVar;
            if (this.f4997b >= 0) {
                a();
                try {
                    ac.this.set(this.f4997b, sVar2);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public final /* synthetic */ void add(s<?> sVar) {
            s<?> sVar2 = sVar;
            a();
            try {
                int i2 = this.f4996a;
                ac.this.add(i2, sVar2);
                this.f4996a = i2 + 1;
                this.f4997b = -1;
                this.f4998c = ac.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        b(int i2) {
            super(ac.this, (byte) 0);
            this.f4996a = i2;
        }
    }

    ac() {
    }

    static class d extends AbstractList<s<?>> {

        /* renamed from: a  reason: collision with root package name */
        private final ac f5001a;

        /* renamed from: b  reason: collision with root package name */
        private int f5002b;

        /* renamed from: c  reason: collision with root package name */
        private int f5003c;

        static {
            Covode.recordClassIndex(2103);
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
        public final Iterator<s<?>> iterator() {
            return listIterator(0);
        }

        /* access modifiers changed from: package-private */
        public static final class a implements ListIterator<s<?>> {

            /* renamed from: a  reason: collision with root package name */
            private final d f5004a;

            /* renamed from: b  reason: collision with root package name */
            private final ListIterator<s<?>> f5005b;

            /* renamed from: c  reason: collision with root package name */
            private int f5006c;

            /* renamed from: d  reason: collision with root package name */
            private int f5007d;

            static {
                Covode.recordClassIndex(2104);
            }

            public final boolean hasNext() {
                if (this.f5005b.nextIndex() < this.f5007d) {
                    return true;
                }
                return false;
            }

            public final boolean hasPrevious() {
                if (this.f5005b.previousIndex() >= this.f5006c) {
                    return true;
                }
                return false;
            }

            public final int nextIndex() {
                return this.f5005b.nextIndex() - this.f5006c;
            }

            public final int previousIndex() {
                int previousIndex = this.f5005b.previousIndex();
                int i2 = this.f5006c;
                if (previousIndex >= i2) {
                    return previousIndex - i2;
                }
                return -1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.Iterator, java.util.ListIterator
            public final /* synthetic */ s<?> next() {
                if (this.f5005b.nextIndex() < this.f5007d) {
                    return this.f5005b.next();
                }
                throw new NoSuchElementException();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.ListIterator
            public final /* synthetic */ s<?> previous() {
                if (this.f5005b.previousIndex() >= this.f5006c) {
                    return this.f5005b.previous();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                this.f5005b.remove();
                this.f5004a.a(false);
                this.f5007d--;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // java.util.ListIterator
            public final /* bridge */ /* synthetic */ void set(s<?> sVar) {
                this.f5005b.set(sVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // java.util.ListIterator
            public final /* synthetic */ void add(s<?> sVar) {
                this.f5005b.add(sVar);
                this.f5004a.a(true);
                this.f5007d++;
            }

            a(ListIterator<s<?>> listIterator, d dVar, int i2, int i3) {
                this.f5005b = listIterator;
                this.f5004a = dVar;
                this.f5006c = i2;
                this.f5007d = i2 + i3;
            }
        }

        public final int size() {
            if (this.modCount == this.f5001a.modCount) {
                return this.f5003c;
            }
            throw new ConcurrentModificationException();
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            if (z) {
                this.f5003c++;
            } else {
                this.f5003c--;
            }
            this.modCount = this.f5001a.modCount;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ s<?> get(int i2) {
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 >= 0 && i2 < this.f5003c) {
                return this.f5001a.get(i2 + this.f5002b);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        @Override // java.util.List, java.util.AbstractList
        public final ListIterator<s<?>> listIterator(int i2) {
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 >= 0 && i2 <= this.f5003c) {
                return new a(this.f5001a.listIterator(i2 + this.f5002b), this, this.f5002b, this.f5003c);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ s<?> remove(int i2) {
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 < 0 || i2 >= this.f5003c) {
                throw new IndexOutOfBoundsException();
            } else {
                s<?> a2 = this.f5001a.remove(i2 + this.f5002b);
                this.f5003c--;
                this.modCount = this.f5001a.modCount;
                return a2;
            }
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends s<?>> collection) {
            if (this.modCount == this.f5001a.modCount) {
                boolean addAll = this.f5001a.addAll(this.f5002b + this.f5003c, collection);
                if (addAll) {
                    this.f5003c += collection.size();
                    this.modCount = this.f5001a.modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ void add(int i2, s<?> sVar) {
            s<?> sVar2 = sVar;
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 < 0 || i2 > this.f5003c) {
                throw new IndexOutOfBoundsException();
            } else {
                this.f5001a.add(i2 + this.f5002b, sVar2);
                this.f5003c++;
                this.modCount = this.f5001a.modCount;
            }
        }

        @Override // java.util.List, java.util.AbstractList
        public final boolean addAll(int i2, Collection<? extends s<?>> collection) {
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 < 0 || i2 > this.f5003c) {
                throw new IndexOutOfBoundsException();
            } else {
                boolean addAll = this.f5001a.addAll(i2 + this.f5002b, collection);
                if (addAll) {
                    this.f5003c += collection.size();
                    this.modCount = this.f5001a.modCount;
                }
                return addAll;
            }
        }

        /* access modifiers changed from: protected */
        public final void removeRange(int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            if (this.modCount == this.f5001a.modCount) {
                ac acVar = this.f5001a;
                int i4 = this.f5002b;
                acVar.removeRange(i2 + i4, i4 + i3);
                this.f5003c -= i3 - i2;
                this.modCount = this.f5001a.modCount;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List, java.util.AbstractList
        public final /* synthetic */ s<?> set(int i2, s<?> sVar) {
            s<?> sVar2 = sVar;
            if (this.modCount != this.f5001a.modCount) {
                throw new ConcurrentModificationException();
            } else if (i2 >= 0 && i2 < this.f5003c) {
                return this.f5001a.set(i2 + this.f5002b, sVar2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        d(ac acVar, int i2, int i3) {
            this.f5001a = acVar;
            this.modCount = acVar.modCount;
            this.f5002b = i2;
            this.f5003c = i3 - i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable, java.util.ArrayList
    public Iterator<s<?>> iterator() {
        return new a(this, (byte) 0);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<s<?>> listIterator() {
        return new b(0);
    }

    /* access modifiers changed from: package-private */
    public class a implements Iterator<s<?>> {

        /* renamed from: a  reason: collision with root package name */
        int f4996a;

        /* renamed from: b  reason: collision with root package name */
        int f4997b;

        /* renamed from: c  reason: collision with root package name */
        int f4998c;

        static {
            Covode.recordClassIndex(2100);
        }

        public boolean hasNext() {
            if (this.f4996a != ac.this.size()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (ac.this.modCount != this.f4998c) {
                throw new ConcurrentModificationException();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ s<?> next() {
            a();
            int i2 = this.f4996a;
            this.f4996a = i2 + 1;
            this.f4997b = i2;
            return ac.this.get(i2);
        }

        public void remove() {
            if (this.f4997b >= 0) {
                a();
                try {
                    ac.this.remove(this.f4997b);
                    this.f4996a = this.f4997b;
                    this.f4997b = -1;
                    this.f4998c = ac.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        private a() {
            this.f4997b = -1;
            this.f4998c = ac.this.modCount;
        }

        /* synthetic */ a(ac acVar, byte b2) {
            this();
        }
    }

    private void a() {
        c cVar;
        if (!this.notificationsPaused && (cVar = this.observer) != null) {
            cVar.a();
        }
    }

    private void b() {
        c cVar;
        if (!this.notificationsPaused && (cVar = this.observer) != null) {
            cVar.b();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            size();
            b();
            super.clear();
        }
    }

    ac(int i2) {
        super(i2);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public ListIterator<s<?>> listIterator(int i2) {
        return new b(i2);
    }

    /* renamed from: a */
    public final s<?> remove(int i2) {
        b();
        return (s) super.remove(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends s<?>> collection) {
        size();
        collection.size();
        a();
        return super.addAll(collection);
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b();
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean removeAll(Collection<?> collection) {
        Iterator<s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean retainAll(Collection<?> collection) {
        Iterator<s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean add(s<?> sVar) {
        size();
        a();
        return super.add(sVar);
    }

    /* renamed from: b */
    public final void add(int i2, s<?> sVar) {
        a();
        super.add(i2, sVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i2, Collection<? extends s<?>> collection) {
        collection.size();
        a();
        return super.addAll(i2, collection);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i2, int i3) {
        if (i2 != i3) {
            b();
            super.removeRange(i2, i3);
        }
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public List<s<?>> subList(int i2, int i3) {
        if (i2 < 0 || i3 > size()) {
            throw new IndexOutOfBoundsException();
        } else if (i2 <= i3) {
            return new d(this, i2, i3);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final s<?> set(int i2, s<?> sVar) {
        s<?> sVar2 = (s) super.set(i2, sVar);
        if (sVar2.f5077a != sVar.f5077a) {
            b();
            a();
        }
        return sVar2;
    }
}
