package com.ss.ttvideoengine.l;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j;
import java.util.Objects;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f153060a;

    /* renamed from: b  reason: collision with root package name */
    public String f153061b;

    /* renamed from: c  reason: collision with root package name */
    public long f153062c;

    /* renamed from: d  reason: collision with root package name */
    public j f153063d;

    static {
        Covode.recordClassIndex(101711);
    }

    public int hashCode() {
        return Objects.hash(this.f153060a, this.f153061b, this.f153063d);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f153062c != bVar.f153062c || !this.f153060a.equals(bVar.f153060a)) {
            z = false;
        } else {
            z = true;
        }
        j jVar = this.f153063d;
        if (jVar == null) {
            if (bVar.f153063d != null) {
                return false;
            }
            return z;
        } else if (bVar.f153063d != null) {
            if (!z) {
                return z;
            }
            if (jVar == bVar.f153063d) {
                z2 = true;
            }
            return z2;
        }
        return false;
    }
}
