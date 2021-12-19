package com.ss.android.ugc.aweme.qna.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.d.c;
import com.ss.android.ugc.aweme.qna.fragment.d;
import com.ss.android.ugc.aweme.qna.fragment.e;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.g.b;
import com.ss.android.ugc.aweme.qna.model.f;
import h.f.b.l;
import java.util.List;

public final class QnaAnswersTabViewModel extends QnaViewModel implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f119618a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<b<List<f>>> f119619b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<b<w>> f119620c;

    /* renamed from: d  reason: collision with root package name */
    public final t<b<b>> f119621d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<b<e>> f119622e;

    /* renamed from: f  reason: collision with root package name */
    private final t<b<b>> f119623f;

    /* renamed from: g  reason: collision with root package name */
    private final t<b<e>> f119624g;

    static {
        Covode.recordClassIndex(77715);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f119618a.f119310h.a();
    }

    public QnaAnswersTabViewModel() {
        c cVar = new c();
        this.f119618a = cVar;
        this.f119619b = cVar.f119303a;
        this.f119620c = cVar.f119304b;
        t<b<b>> tVar = new t<>();
        this.f119623f = tVar;
        this.f119621d = tVar;
        t<b<e>> tVar2 = new t<>();
        this.f119624g = tVar2;
        this.f119622e = tVar2;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.d
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f119624g.setValue(new b<>(eVar));
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f119623f.setValue(new b<>(bVar));
    }

    public final void a(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        this.f119618a.a(str, str2, str3, z);
    }
}
