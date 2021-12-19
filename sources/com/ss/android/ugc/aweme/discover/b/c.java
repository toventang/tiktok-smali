package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.ss.android.ugc.aweme.video.v;
import java.util.LinkedList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f80837a;

    /* renamed from: b  reason: collision with root package name */
    public List<i> f80838b;

    /* renamed from: c  reason: collision with root package name */
    public i f80839c;

    static {
        Covode.recordClassIndex(50258);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f80840a = new c();

        static {
            Covode.recordClassIndex(50259);
        }
    }

    public c() {
        int i2;
        if (j.b()) {
            i2 = 4;
        } else if (j.c()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.f80837a = i2;
        this.f80838b = new LinkedList();
        this.f80839c = new v(ISimPlayerService$$CC.get$$STATIC$$().a());
    }

    public final void a(i iVar) {
        if (iVar != null) {
            iVar.H();
            try {
                iVar.C();
                this.f80838b.remove(iVar);
                this.f80838b.size();
            } catch (Exception unused) {
            }
        }
    }
}
