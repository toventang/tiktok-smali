package com.ss.android.ugc.aweme.newfollow.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import java.util.LinkedList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private List<i> f112588a = new LinkedList();

    static {
        Covode.recordClassIndex(72351);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static d f112589a = new d();

        static {
            Covode.recordClassIndex(72352);
        }
    }

    public final i a() {
        if (this.f112588a.size() >= 8) {
            this.f112588a.size();
            List<i> list = this.f112588a;
            i iVar = list.get(list.size() - 1);
            iVar.H();
            iVar.C();
            List<i> list2 = this.f112588a;
            list2.remove(list2.size() - 1);
        }
        v vVar = new v();
        this.f112588a.add(vVar);
        this.f112588a.size();
        return vVar;
    }
}
