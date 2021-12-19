package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ap implements Serializable {
    @c(a = "end")
    public long end = -1;
    @c(a = "start")
    public long start = -1;

    static {
        Covode.recordClassIndex(22715);
    }

    public ap() {
    }

    public ap copy() {
        return new ap(this.start, this.end);
    }

    public void reverse() {
        long j2 = this.start;
        this.start = this.end;
        this.end = j2;
    }

    public boolean isValid() {
        long j2 = this.start;
        if (j2 <= 0 || j2 > this.end) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "[" + this.start + "," + this.end + "]";
    }

    public void merge(ap apVar) {
        if (apVar.isValid()) {
            long j2 = apVar.start;
            long j3 = this.start;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
            this.start = Math.min(j2, j3);
            long j4 = apVar.end;
            long j5 = this.end;
            if (j5 <= 0) {
                j5 = Long.MIN_VALUE;
            }
            this.end = Math.max(j4, j5);
        }
    }

    public ap(long j2, long j3) {
        this.start = j2;
        this.end = j3;
    }
}
