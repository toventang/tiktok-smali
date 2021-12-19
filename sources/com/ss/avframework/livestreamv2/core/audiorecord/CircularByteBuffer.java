package com.ss.avframework.livestreamv2.core.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class CircularByteBuffer {
    private int available;
    private final byte[] buffer;
    private final int capacity;
    private int idxGet;
    private int idxPut;

    static {
        Covode.recordClassIndex(100130);
    }

    public int capacity() {
        return this.capacity;
    }

    public CircularByteBuffer() {
        this(8192);
    }

    public synchronized int available() {
        int i2;
        MethodCollector.i(11159);
        i2 = this.available;
        MethodCollector.o(11159);
        return i2;
    }

    public synchronized void clear() {
        MethodCollector.i(10513);
        this.available = 0;
        this.idxPut = 0;
        this.idxGet = 0;
        MethodCollector.o(10513);
    }

    public synchronized int free() {
        int i2;
        MethodCollector.i(11160);
        i2 = this.capacity - this.available;
        MethodCollector.o(11160);
        return i2;
    }

    public synchronized int peek() {
        MethodCollector.i(10994);
        if (this.available > 0) {
            byte b2 = this.buffer[this.idxGet];
            MethodCollector.o(10994);
            return b2;
        }
        MethodCollector.o(10994);
        return -1;
    }

    public synchronized int get() {
        MethodCollector.i(10666);
        int i2 = this.available;
        if (i2 == 0) {
            MethodCollector.o(10666);
            return -1;
        }
        byte[] bArr = this.buffer;
        int i3 = this.idxGet;
        byte b2 = bArr[i3];
        this.idxGet = (i3 + 1) % this.capacity;
        this.available = i2 - 1;
        MethodCollector.o(10666);
        return b2;
    }

    public int get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    public int put(byte[] bArr) {
        return put(bArr, 0, bArr.length);
    }

    public CircularByteBuffer(int i2) {
        this.capacity = i2;
        this.buffer = new byte[i2];
    }

    public synchronized int skip(int i2) {
        MethodCollector.i(11158);
        int i3 = this.available;
        if (i2 > i3) {
            i2 = i3;
        }
        this.idxGet = (this.idxGet + i2) % this.capacity;
        this.available = i3 - i2;
        MethodCollector.o(11158);
        return i2;
    }

    public synchronized boolean put(byte b2) {
        MethodCollector.i(10820);
        int i2 = this.available;
        int i3 = this.capacity;
        if (i2 == i3) {
            MethodCollector.o(10820);
            return false;
        }
        byte[] bArr = this.buffer;
        int i4 = this.idxPut;
        bArr[i4] = b2;
        this.idxPut = (i4 + 1) % i3;
        this.available = i2 + 1;
        MethodCollector.o(10820);
        return true;
    }

    public synchronized int get(byte[] bArr, int i2, int i3) {
        MethodCollector.i(10819);
        if (this.available == 0) {
            MethodCollector.o(10819);
            return 0;
        }
        int i4 = this.idxGet;
        int i5 = this.idxPut;
        if (i4 >= i5) {
            i5 = this.capacity;
        }
        int min = Math.min(i5 - i4, i3);
        System.arraycopy(this.buffer, this.idxGet, bArr, i2, min);
        int i6 = this.idxGet + min;
        this.idxGet = i6;
        if (i6 == this.capacity) {
            int min2 = Math.min(i3 - min, this.idxPut);
            if (min2 > 0) {
                System.arraycopy(this.buffer, 0, bArr, i2 + min, min2);
                this.idxGet = min2;
                min += min2;
            } else {
                this.idxGet = 0;
            }
        }
        this.available -= min;
        MethodCollector.o(10819);
        return min;
    }

    public synchronized int put(byte[] bArr, int i2, int i3) {
        MethodCollector.i(10993);
        int i4 = this.available;
        int i5 = this.capacity;
        if (i4 == i5) {
            MethodCollector.o(10993);
            return 0;
        }
        int i6 = this.idxPut;
        int i7 = this.idxGet;
        if (i6 < i7) {
            i5 = i7;
        }
        int min = Math.min(i5 - i6, i3);
        System.arraycopy(bArr, i2, this.buffer, this.idxPut, min);
        int i8 = this.idxPut + min;
        this.idxPut = i8;
        if (i8 == this.capacity) {
            int min2 = Math.min(i3 - min, this.idxGet);
            if (min2 > 0) {
                System.arraycopy(bArr, i2 + min, this.buffer, 0, min2);
                this.idxPut = min2;
                min += min2;
            } else {
                this.idxPut = 0;
            }
        }
        this.available += min;
        MethodCollector.o(10993);
        return min;
    }
}
