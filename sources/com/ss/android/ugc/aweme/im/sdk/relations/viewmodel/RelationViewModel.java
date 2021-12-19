package com.ss.android.ugc.aweme.im.sdk.relations.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.g;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.h;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;
import h.p;
import java.util.List;

public final class RelationViewModel extends ac implements d<IMContact>, com.ss.android.ugc.aweme.im.sdk.relations.data.core.d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f103346d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a<List<IMContact>>> f103347a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a<p<List<IMContact>, String>>> f103348b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final h f103349c;

    static {
        Covode.recordClassIndex(66230);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66231);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final List<Integer> a() {
        h hVar = this.f103349c;
        if (hVar instanceof g) {
            return ((g) hVar).i();
        }
        return null;
    }

    public final List<String> b() {
        h hVar = this.f103349c;
        if (hVar instanceof g) {
            return ((g) hVar).j();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void c(Throwable th) {
        l.d(th, "");
        this.f103347a.setValue(new a.b.C2573a(th));
    }

    public RelationViewModel(h hVar) {
        l.d(hVar, "");
        this.f103349c = hVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(Throwable th) {
        l.d(th, "");
        this.f103347a.setValue(new a.b.C2573a(th));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void b(Throwable th) {
        l.d(th, "");
        this.f103348b.setValue(new a.b.C2573a(th));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void a(List<IMContact> list, String str) {
        l.d(list, "");
        l.d(str, "");
        this.f103348b.setValue(new a.d(new p(list, str)));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void b(List<IMContact> list, boolean z) {
        l.d(list, "");
        this.f103347a.setValue(new a.d(this.f103349c.e()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(List<IMContact> list, boolean z) {
        l.d(list, "");
        this.f103347a.setValue(new a.d(list));
    }
}
