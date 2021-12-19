package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import java.util.Iterator;
import java.util.Set;

public final class Sets {
    static {
        Covode.recordClassIndex(95250);
    }

    private Sets() {
    }

    public static <E> SetView<E> difference(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() {
            /* class com.ss.android.ugc.effectmanager.common.Sets.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95251);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public final Iterator<E> iterator() {
                return new AbstractIterator<E>() {
                    /* class com.ss.android.ugc.effectmanager.common.Sets.AnonymousClass1.AnonymousClass1 */
                    final Iterator<E> itr;

                    static {
                        Covode.recordClassIndex(95252);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.ss.android.ugc.effectmanager.common.AbstractIterator
                    public E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return (E) endOfData();
                    }

                    {
                        this.itr = set.iterator();
                    }
                };
            }

            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            public final int size() {
                int i2 = 0;
                for (Object obj : set) {
                    if (!set2.contains(obj)) {
                        i2++;
                    }
                }
                return i2;
            }

            public final boolean contains(Object obj) {
                if (!set.contains(obj) || set2.contains(obj)) {
                    return false;
                }
                return true;
            }
        };
    }

    public static <E> SetView<E> symmetricDifference(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() {
            /* class com.ss.android.ugc.effectmanager.common.Sets.AnonymousClass2 */

            static {
                Covode.recordClassIndex(95253);
            }

            public final boolean isEmpty() {
                return set.equals(set2);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
            public final Iterator<E> iterator() {
                final Iterator it = set.iterator();
                final Iterator it2 = set2.iterator();
                return new AbstractIterator<E>() {
                    /* class com.ss.android.ugc.effectmanager.common.Sets.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(95254);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.AbstractIterator
                    public E computeNext() {
                        while (it.hasNext()) {
                            E e2 = (E) it.next();
                            if (!set2.contains(e2)) {
                                return e2;
                            }
                        }
                        while (it2.hasNext()) {
                            E e3 = (E) it2.next();
                            if (!set.contains(e3)) {
                                return e3;
                            }
                        }
                        return (E) endOfData();
                    }
                };
            }

            public final int size() {
                int i2 = 0;
                for (Object obj : set) {
                    if (!set2.contains(obj)) {
                        i2++;
                    }
                }
                for (Object obj2 : set2) {
                    if (!set.contains(obj2)) {
                        i2++;
                    }
                }
                return i2;
            }

            public final boolean contains(Object obj) {
                return set2.contains(obj) ^ set.contains(obj);
            }
        };
    }
}
