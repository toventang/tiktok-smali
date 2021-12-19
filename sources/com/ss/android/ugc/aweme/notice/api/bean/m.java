package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import java.util.HashMap;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f112697a;

    /* renamed from: b  reason: collision with root package name */
    public int f112698b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, Integer> f112699c;

    static {
        Covode.recordClassIndex(72428);
    }

    public m() {
    }

    public m(int i2) {
        this.f112697a = i2;
    }

    public m(HashMap<Integer, Integer> hashMap) {
        this.f112699c = hashMap;
    }

    public final int a(int i2) {
        try {
            return this.f112699c.get(Integer.valueOf(i2)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean b(int i2) {
        HashMap<Integer, Integer> hashMap = this.f112699c;
        if ((hashMap == null || hashMap.size() <= 0 || !this.f112699c.containsKey(Integer.valueOf(i2))) && this.f112697a != i2) {
            return false;
        }
        return true;
    }

    public m(int i2, int i3) {
        this.f112697a = i2;
        this.f112698b = i3;
    }
}
