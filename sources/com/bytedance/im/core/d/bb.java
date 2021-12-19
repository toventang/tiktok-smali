package com.bytedance.im.core.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.utils.j;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class bb {

    /* renamed from: a  reason: collision with root package name */
    public final int f37877a = 1;

    /* renamed from: b  reason: collision with root package name */
    public long f37878b = 3000;

    /* renamed from: c  reason: collision with root package name */
    public List<ai> f37879c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f37880d;

    /* renamed from: e  reason: collision with root package name */
    public final String f37881e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37882f;

    static {
        Covode.recordClassIndex(22730);
    }

    public final void a() {
        d a2 = d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ && this.f37882f) {
            f.a(n.a(this.f37881e), "message_model");
        }
    }

    public final void a(List<ai> list) {
        l.c(list, "");
        this.f37879c = list;
    }

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bb f37883a;

        static {
            Covode.recordClassIndex(22731);
        }

        public final void handleMessage(Message message) {
            l.c(message, "");
            if (message.what == this.f37883a.f37877a) {
                bb bbVar = this.f37883a;
                long j2 = 0;
                for (ai aiVar : bbVar.f37879c) {
                    if (aiVar.isSelf() && aiVar.getIndex() > j2) {
                        j2 = aiVar.getIndex();
                    }
                }
                String str = bbVar.f37881e;
                l.c(str, "");
                HashMap<Long, ao> hashMap = f.f37949b.get(str);
                boolean z = true;
                if (hashMap != null) {
                    Iterator<ao> it = hashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        ao next = it.next();
                        l.a((Object) next, "");
                        if (next.f37821d < j2) {
                            break;
                        }
                    }
                }
                j.a(" ConvReadInfoHelperSingleConReadInfoHelper cid = " + this.f37883a.f37881e + " shouldQueryMsg = " + z);
                if (z) {
                    this.f37883a.a();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(bb bbVar, Looper looper) {
            super(looper);
            this.f37883a = bbVar;
        }
    }

    public bb(String str, boolean z) {
        l.c(str, "");
        this.f37881e = str;
        this.f37882f = z;
        a();
        this.f37880d = new a(this, Looper.getMainLooper());
    }
}
