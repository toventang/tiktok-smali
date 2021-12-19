package com.ss.texturerender.a;

import com.bytedance.covode.number.Covode;
import com.ss.texturerender.l;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f151792a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f151793b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, Integer> f151794c = new HashMap<>();

    static {
        Covode.recordClassIndex(101229);
    }

    public String toString() {
        return "Config:[opengSR:" + this.f151792a + " opengSharpen:" + this.f151793b + " config:" + this.f151794c.toString() + "]";
    }

    public final boolean a() {
        for (Map.Entry<Integer, Integer> entry : this.f151794c.entrySet()) {
            if (!(entry.getKey().intValue() == 1 || entry.getKey().intValue() == 5)) {
                return true;
            }
        }
        return false;
    }

    public final d a(boolean z) {
        this.f151792a = z;
        this.f151794c.put(5, Integer.valueOf(z ? 1 : 0));
        return this;
    }

    public final boolean a(int i2) {
        Integer num = this.f151794c.get(Integer.valueOf(i2));
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean a(d dVar) {
        boolean z = dVar.f151792a;
        if (z && !this.f151792a) {
            return false;
        }
        if (dVar.f151793b) {
            if (!this.f151793b) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            if (this.f151792a || this.f151793b) {
                return false;
            }
            return true;
        }
    }

    public final d a(int i2, int i3) {
        boolean z;
        l.a("EffectConfig", "setEffectOpen effect:" + i2 + ",isOpen:" + i3);
        boolean z2 = false;
        if (i2 == 1) {
            if (i3 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f151793b = z;
        } else if (i2 == 5) {
            if (i3 == 1) {
                z2 = true;
            }
            this.f151792a = z2;
        }
        this.f151794c.put(Integer.valueOf(i2), Integer.valueOf(i3));
        return this;
    }
}
