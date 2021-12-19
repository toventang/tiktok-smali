package com.ss.android.ugc.aweme.multi;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.anchor.c;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import h.f.b.l;
import java.util.List;

public abstract class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final C2832a f110874c = new C2832a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f110875a = "";

    /* renamed from: b  reason: collision with root package name */
    public boolean f110876b;

    /* renamed from: d  reason: collision with root package name */
    private b f110877d;

    /* renamed from: e  reason: collision with root package name */
    private int f110878e = 100;

    static {
        Covode.recordClassIndex(71137);
    }

    public boolean e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.a$a  reason: collision with other inner class name */
    public static final class C2832a {
        static {
            Covode.recordClassIndex(71138);
        }

        private C2832a() {
        }

        public /* synthetic */ C2832a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public e b() {
        return new f(this.f110875a);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final b a() {
        b bVar = this.f110877d;
        if (bVar == null) {
            l.a("internalContext");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final int c() {
        if (e()) {
            return -1;
        }
        return this.f110878e;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public int d() {
        if (f()) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(b bVar) {
        l.d(bVar, "");
        this.f110877d = bVar;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    public final void a(AnchorCommonStruct anchorCommonStruct) {
        Integer num;
        String str = "";
        l.d(anchorCommonStruct, str);
        List<AnchorCommonStruct> anchors = a().b().getAnchors();
        if (anchors != null) {
            num = Integer.valueOf(anchors.indexOf(anchorCommonStruct));
        } else {
            num = null;
        }
        String logExtra = anchorCommonStruct.getLogExtra();
        if (logExtra != null) {
            str = logExtra;
        }
        this.f110875a = str;
        if (num == null || num.intValue() == -1) {
            this.f110878e = 100;
        } else {
            this.f110878e = num.intValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(Activity activity, Dialog dialog) {
        l.d(activity, "");
        l.d(dialog, "");
        l.d(activity, "");
        l.d(dialog, "");
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(ViewGroup viewGroup, Dialog dialog, d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        b(viewGroup, dialog, dVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public void a(d dVar, c cVar, com.ss.android.ugc.aweme.anchor.multi.a.a aVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        l.d(aVar, "");
        l.d(dVar, "");
        l.d(cVar, "");
        l.d(aVar, "");
    }
}
