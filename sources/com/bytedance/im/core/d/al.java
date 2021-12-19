package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public List<Long> f37806a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<Long> f37807b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f37808c = "";

    /* renamed from: d  reason: collision with root package name */
    public long f37809d;

    /* renamed from: e  reason: collision with root package name */
    public long f37810e;

    /* renamed from: f  reason: collision with root package name */
    public int f37811f;

    /* renamed from: g  reason: collision with root package name */
    public int f37812g;

    static {
        Covode.recordClassIndex(22710);
    }

    public final String toString() {
        return "MessageReadStatusModel{readUidList=" + this.f37806a + ", allUidList=" + this.f37807b + ", conId='" + this.f37808c + '\'' + '}';
    }

    public al(List<Long> list, List<Long> list2, String str, long j2, long j3) {
        this.f37806a = list;
        this.f37807b = list2;
        this.f37808c = str;
        this.f37809d = j2;
        this.f37810e = j3;
        this.f37811f = list.size();
        this.f37812g = list2.size();
    }
}
