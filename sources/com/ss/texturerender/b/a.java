package com.ss.texturerender.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    LinkedList<C4064a> f151817a = new LinkedList<>();

    static {
        Covode.recordClassIndex(101244);
    }

    public final String toString() {
        String str = "";
        for (int i2 = 0; i2 < this.f151817a.size(); i2++) {
            str = str + "pts[" + i2 + "]:" + this.f151817a.get(i2).pts + ";";
        }
        return str;
    }

    public final void a(C4064a aVar) {
        this.f151817a.offer(aVar);
    }

    public final C4064a a(long j2) {
        C4064a aVar = null;
        while (!this.f151817a.isEmpty()) {
            C4064a element = this.f151817a.element();
            if (j2 <= element.updateClockTime) {
                if (aVar == null) {
                    return this.f151817a.poll();
                }
                if (j2 > aVar.updateClockTime) {
                    if (j2 - aVar.updateClockTime < element.updateClockTime - j2) {
                        return aVar;
                    }
                    return this.f151817a.poll();
                }
            }
            aVar = this.f151817a.poll();
            if (this.f151817a.isEmpty()) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: com.ss.texturerender.b.a$a  reason: collision with other inner class name */
    public static class C4064a implements Serializable {
        public long pts;
        public long updateClockTime;

        static {
            Covode.recordClassIndex(101245);
        }

        public C4064a(long j2, long j3) {
            this.pts = j2;
            this.updateClockTime = j3;
        }
    }
}
