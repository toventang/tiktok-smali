package com.ss.android.ugc.aweme.qna.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.d.h;
import com.ss.android.ugc.aweme.qna.fragment.d;
import com.ss.android.ugc.aweme.qna.fragment.e;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.g.b;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.i;
import h.f.b.l;
import java.util.List;

public final class QnaQuestionsTabViewModel extends QnaViewModel implements d {

    /* renamed from: a  reason: collision with root package name */
    public final h f119634a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<b<List<f>>> f119635b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<b<w>> f119636c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<b<w>> f119637d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<b<Long>> f119638e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<b<i>> f119639f;

    /* renamed from: g  reason: collision with root package name */
    public final t<b<b>> f119640g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<b<e>> f119641h;

    /* renamed from: l  reason: collision with root package name */
    private final t<b<b>> f119642l;

    /* renamed from: m  reason: collision with root package name */
    private final t<b<e>> f119643m;

    static {
        Covode.recordClassIndex(77730);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f119634a.n.a();
    }

    public QnaQuestionsTabViewModel() {
        h hVar = new h();
        this.f119634a = hVar;
        this.f119635b = hVar.f119327b;
        this.f119636c = hVar.f119328c;
        this.f119637d = hVar.f119329d;
        this.f119638e = hVar.f119332g;
        this.f119639f = hVar.f119330e;
        t<b<b>> tVar = new t<>();
        this.f119642l = tVar;
        this.f119640g = tVar;
        t<b<e>> tVar2 = new t<>();
        this.f119643m = tVar2;
        this.f119641h = tVar2;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.d
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f119643m.setValue(new b<>(eVar));
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f119642l.setValue(new b<>(bVar));
    }

    public final void a(String str, String str2, String str3, boolean z, boolean z2) {
        l.d(str, "");
        l.d(str2, "");
        this.f119634a.a(str, str2, str3, z, z2);
    }
}
