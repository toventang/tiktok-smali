package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public List<MVResourceBean> f61184a = new ArrayList();

    static {
        Covode.recordClassIndex(37670);
    }

    public final int a() {
        return this.f61184a.size();
    }

    public final MVResourceBean a(int i2) {
        if (i2 < 0) {
            return null;
        }
        return this.f61184a.get(i2);
    }

    public final boolean a(int i2, MVResourceBean mVResourceBean) {
        if (i2 < 0) {
            return false;
        }
        this.f61184a.set(i2, mVResourceBean);
        return true;
    }
}
