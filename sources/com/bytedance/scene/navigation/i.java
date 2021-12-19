package com.bytedance.scene.navigation;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    List<Record> f43014a = new ArrayList();

    static {
        Covode.recordClassIndex(26366);
    }

    public final List<Record> c() {
        return new ArrayList(this.f43014a);
    }

    i() {
    }

    public final boolean b() {
        if (this.f43014a.size() > 1) {
            return true;
        }
        return false;
    }

    public final Record a() {
        if (this.f43014a.size() <= 0) {
            return null;
        }
        List<Record> list = this.f43014a;
        return list.get(list.size() - 1);
    }

    public final void a(Record record) {
        this.f43014a.remove(record);
    }
}
