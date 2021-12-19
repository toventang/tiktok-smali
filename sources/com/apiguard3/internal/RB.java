package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RB<T> implements Serializable {
    private static int getBody = 0;
    private static int getUrl = 1;
    private static final long serialVersionUID = 5376938948150806962L;
    private final LinkedList<T> list = new LinkedList<>();
    private int maxSize;
    private final Lock readLock;
    private final ReentrantReadWriteLock readWriteLock;
    private final Lock writeLock;

    static {
        Covode.recordClassIndex(2528);
    }

    public final boolean AGRequest() {
        try {
            this.readLock.lock();
            boolean z = false;
            if (this.list.size() < this.maxSize) {
                int i2 = getBody + 121;
                getUrl = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = getBody + 85;
                getUrl = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            return z;
        } finally {
            this.readLock.unlock();
        }
    }

    public final int getMethod() {
        LinkedList<T> linkedList;
        int i2 = getBody + 83;
        getUrl = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                this.readLock.lock();
                linkedList = this.list;
            } catch (Throwable th) {
                this.readLock.unlock();
                throw th;
            }
        } else {
            this.readLock.lock();
            linkedList = this.list;
        }
        int size = linkedList.size();
        this.readLock.unlock();
        int i3 = getUrl + 67;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    /* JADX INFO: finally extract failed */
    public final List<T> getUrl() {
        try {
            this.readLock.lock();
            ArrayList arrayList = new ArrayList(this.list);
            this.readLock.unlock();
            int i2 = getUrl + 99;
            getBody = i2 % 128;
            int i3 = i2 % 2;
            return arrayList;
        } catch (Throwable th) {
            this.readLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void getBody() {
        int i2 = getBody + 107;
        getUrl = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                this.writeLock.lock();
                this.list.clear();
                this.writeLock.unlock();
                int i3 = getBody + 57;
                getUrl = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new NullPointerException("hashCode");
                }
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
        } else {
            this.writeLock.lock();
            this.list.clear();
            this.writeLock.unlock();
            throw new NullPointerException("hashCode");
        }
    }

    public final boolean getHeaders() {
        boolean z;
        int i2 = getUrl + 75;
        getBody = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                this.readLock.lock();
                if (getMethod() == 0) {
                }
                z = false;
                int i3 = getUrl + 91;
                getBody = i3 % 128;
                int i4 = i3 % 2;
                this.readLock.unlock();
                return z;
            } catch (Throwable th) {
                this.readLock.unlock();
                throw th;
            }
        } else {
            this.readLock.lock();
            if (getMethod() != 0) {
                z = false;
                int i32 = getUrl + 91;
                getBody = i32 % 128;
                int i42 = i32 % 2;
                this.readLock.unlock();
                return z;
            }
        }
        z = true;
        int i5 = getUrl + 65;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        this.readLock.unlock();
        return z;
    }

    public RB(int i2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.readWriteLock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.maxSize = i2;
    }

    public final void AGRequest(int i2) {
        int i3;
        Iterator<T> it;
        int i4;
        int i5 = getBody + 33;
        getUrl = i5 % 128;
        int i6 = i5 % 2;
        try {
            this.writeLock.lock();
            int i7 = this.maxSize;
            if (i2 != i7) {
                int i8 = getUrl;
                int i9 = i8 + 9;
                getBody = i9 % 128;
                int i10 = i9 % 2;
                if (i2 > 0) {
                    if (i2 < i7) {
                        int i11 = i8 + 55;
                        getBody = i11 % 128;
                        if (i11 % 2 != 0) {
                            i3 = i7 * i2;
                            it = this.list.iterator();
                            i4 = 1;
                        } else {
                            i3 = i7 - i2;
                            it = this.list.iterator();
                            i4 = 0;
                        }
                        while (it.hasNext() && i4 < i3) {
                            int i12 = getBody + 113;
                            getUrl = i12 % 128;
                            int i13 = i12 % 2;
                            it.next();
                            it.remove();
                            i4++;
                        }
                    }
                    this.maxSize = i2;
                    this.writeLock.unlock();
                    int i14 = getUrl + 33;
                    getBody = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
        } finally {
            this.writeLock.unlock();
        }
    }

    public final boolean getHeaders(T t) {
        char c2;
        boolean z;
        int i2 = getBody + 39;
        getUrl = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = 'M';
        } else {
            c2 = ' ';
        }
        if (c2 != ' ') {
            try {
                this.writeLock.lock();
                z = this.list.add(t);
                if (this.list.size() <= this.maxSize) {
                    this.writeLock.unlock();
                    return z;
                }
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
        } else {
            this.writeLock.lock();
            z = this.list.add(t);
            if (this.list.size() <= this.maxSize) {
                this.writeLock.unlock();
                return z;
            }
        }
        this.list.remove(0);
        int i3 = getUrl + 55;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        this.writeLock.unlock();
        return z;
    }
}
