package com.bytedance.scene.group;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    List<GroupRecord> f42814a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final Map<j, GroupRecord> f42815b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, GroupRecord> f42816c = new HashMap();

    static {
        Covode.recordClassIndex(26285);
    }

    a() {
    }

    public final List<j> a() {
        ArrayList arrayList = new ArrayList();
        for (GroupRecord groupRecord : this.f42814a) {
            arrayList.add(groupRecord.f42807b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final GroupRecord a(j jVar) {
        return this.f42815b.get(jVar);
    }

    public final GroupRecord a(String str) {
        return this.f42816c.get(str);
    }
}
