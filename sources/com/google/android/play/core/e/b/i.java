package com.google.android.play.core.e.b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f53298a;

    /* renamed from: b  reason: collision with root package name */
    private final List f53299b;

    /* renamed from: c  reason: collision with root package name */
    private final List f53300c;

    /* renamed from: d  reason: collision with root package name */
    private final List f53301d;

    /* renamed from: e  reason: collision with root package name */
    private final long f53302e;

    static {
        Covode.recordClassIndex(32926);
    }

    i(a aVar, List list, List list2, List list3, long j2) {
        this.f53298a = aVar;
        this.f53299b = list;
        this.f53300c = list2;
        this.f53301d = list3;
        this.f53302e = j2;
    }

    public final void run() {
        a aVar = this.f53298a;
        List<Intent> list = this.f53299b;
        List<String> list2 = this.f53300c;
        List<String> list3 = this.f53301d;
        long j2 = this.f53302e;
        if (aVar.f53272h.get()) {
            aVar.c(-6);
        } else {
            aVar.a(list, list2, list3, j2, false);
        }
    }
}
