package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> implements Iterator<T> {
    private T next;
    private State state = State.NOT_READY;

    static {
        Covode.recordClassIndex(95234);
    }

    /* access modifiers changed from: protected */
    public abstract T computeNext();

    protected AbstractIterator() {
    }

    /* access modifiers changed from: protected */
    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    public final T peek() {
        if (hasNext()) {
            return this.next;
        }
        throw new NoSuchElementException();
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.common.AbstractIterator$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 95235(0x17403, float:1.33453E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State[] r0 = com.ss.android.ugc.effectmanager.common.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.effectmanager.common.AbstractIterator.AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State = r2
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State r0 = com.ss.android.ugc.effectmanager.common.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.effectmanager.common.AbstractIterator.AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State r0 = com.ss.android.ugc.effectmanager.common.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.AbstractIterator.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(95236);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.state != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i2 = AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State[this.state.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return tryToComputeNext();
        }
        return true;
    }
}
