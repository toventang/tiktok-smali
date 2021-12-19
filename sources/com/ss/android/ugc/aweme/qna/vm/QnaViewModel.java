package com.ss.android.ugc.aweme.qna.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.g.b;
import com.ss.android.ugc.aweme.qna.model.k;
import h.f.b.l;
import java.util.List;

public abstract class QnaViewModel extends ac implements i {

    /* renamed from: a  reason: collision with root package name */
    private final t<b<d>> f119654a;

    /* renamed from: b  reason: collision with root package name */
    private final t<b<a>> f119655b;

    /* renamed from: c  reason: collision with root package name */
    private final t<b<c>> f119656c;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<b<d>> f119657i;

    /* renamed from: j  reason: collision with root package name */
    public final LiveData<b<a>> f119658j;

    /* renamed from: k  reason: collision with root package name */
    public final LiveData<b<c>> f119659k;

    static {
        Covode.recordClassIndex(77734);
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public void a(String str, int i2) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public void a(String str, boolean z, List<String> list) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public void b() {
    }

    public QnaViewModel() {
        t<b<d>> tVar = new t<>();
        this.f119654a = tVar;
        this.f119657i = tVar;
        t<b<a>> tVar2 = new t<>();
        this.f119655b = tVar2;
        this.f119658j = tVar2;
        t<b<c>> tVar3 = new t<>();
        this.f119656c = tVar3;
        this.f119659k = tVar3;
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(d dVar) {
        if (dVar != null) {
            this.f119654a.setValue(new b<>(dVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(k kVar, String str) {
        l.d(kVar, "");
        if (kVar.f119525b != null) {
            this.f119655b.postValue(new b<>(new a(kVar.f119525b, str)));
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f119656c.setValue(new b<>(new c(str, str2)));
    }
}
