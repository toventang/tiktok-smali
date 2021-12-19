package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import f.a.t;
import h.f.b.l;

public final class g implements com.bytedance.assem.arch.a.a<f> {

    /* renamed from: a  reason: collision with root package name */
    public QnaApiV2 f119323a = QnaApiV2.a.b();

    /* renamed from: b  reason: collision with root package name */
    public final f f119324b = new a(this);

    static {
        Covode.recordClassIndex(77493);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ f a() {
        return this.f119324b;
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f119325a;

        static {
            Covode.recordClassIndex(77494);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f119325a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.qna.d.f
        public final t<com.ss.android.ugc.aweme.question.model.a> a(Long l2, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            return this.f119325a.f119323a.createQuestion(l2, str, str2);
        }
    }
}
