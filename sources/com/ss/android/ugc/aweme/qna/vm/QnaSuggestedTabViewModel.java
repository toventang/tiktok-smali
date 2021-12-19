package com.ss.android.ugc.aweme.qna.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.d.b;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.model.a;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.i;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import h.f.b.l;
import h.p;
import java.util.List;

public final class QnaSuggestedTabViewModel extends QnaViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final b f119644a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<List<f>>> f119645b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<w>> f119646c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<i>> f119647d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<Integer>> f119648e;

    /* renamed from: f  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<a>> f119649f;

    /* renamed from: g  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<String>> f119650g;

    /* renamed from: h  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<p<QaStruct, Boolean>>> f119651h;

    /* renamed from: l  reason: collision with root package name */
    private final t<com.ss.android.ugc.aweme.qna.g.b<Integer>> f119652l;

    /* renamed from: m  reason: collision with root package name */
    private final t<com.ss.android.ugc.aweme.qna.g.b<p<QaStruct, Boolean>>> f119653m;

    static {
        Covode.recordClassIndex(77733);
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i
    public final void a(b bVar) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i, com.ss.android.ugc.aweme.qna.vm.QnaViewModel
    public final void b() {
        this.f119644a.a();
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f119644a.f119282h.a();
    }

    public final void a() {
        if (com.ss.android.ugc.aweme.qna.e.b.b()) {
            this.f119644a.a();
        } else {
            this.f119644a.b();
        }
    }

    public QnaSuggestedTabViewModel() {
        b bVar = new b();
        this.f119644a = bVar;
        this.f119645b = bVar.f119283i;
        this.f119646c = bVar.f119285k;
        this.f119647d = bVar.f119287m;
        t<com.ss.android.ugc.aweme.qna.g.b<Integer>> tVar = new t<>();
        this.f119652l = tVar;
        this.f119648e = tVar;
        this.f119649f = bVar.f119284j;
        this.f119650g = bVar.f119286l;
        t<com.ss.android.ugc.aweme.qna.g.b<p<QaStruct, Boolean>>> tVar2 = new t<>();
        this.f119653m = tVar2;
        this.f119651h = tVar2;
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i, com.ss.android.ugc.aweme.qna.vm.QnaViewModel
    public final void a(String str) {
        l.d(str, "");
        this.f119644a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.qna.vm.i, com.ss.android.ugc.aweme.qna.vm.QnaViewModel
    public final void a(String str, int i2) {
        int i3;
        l.d(str, "");
        b bVar = this.f119644a;
        l.d(str, "");
        if (i2 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        bVar.a(str, i3);
        bVar.f119282h.a(QnaApiV2.a.a().sflQuestion(Long.parseLong(str), i3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new b.f(bVar, str, i3), new b.g(bVar, str, i2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r13 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r13 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r13 = "";
     */
    @Override // com.ss.android.ugc.aweme.qna.vm.i, com.ss.android.ugc.aweme.qna.vm.QnaViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, boolean r21, java.util.List<java.lang.String> r22) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel.a(java.lang.String, boolean, java.util.List):void");
    }
}
