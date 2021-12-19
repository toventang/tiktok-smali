package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f132161a = new x();

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f132162b = new ConcurrentLinkedQueue<>();

    static {
        Covode.recordClassIndex(86558);
    }

    public final ArrayList<String> a() {
        this.f132162b.offer(System.currentTimeMillis() + ":report");
        ArrayList<String> arrayList = new ArrayList<>(this.f132162b);
        this.f132162b.clear();
        return arrayList;
    }

    public final void a(String str) {
        if (this.f132162b.size() >= 30) {
            this.f132162b.poll();
        }
        this.f132162b.offer(System.currentTimeMillis() + ":" + str);
    }
}
