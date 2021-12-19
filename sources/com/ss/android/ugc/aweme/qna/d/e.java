package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.api.h;
import f.a.t;
import h.f.b.l;

public final class e implements com.bytedance.assem.arch.a.a<d> {

    /* renamed from: a  reason: collision with root package name */
    public QnaApiV2 f119320a = QnaApiV2.a.b();

    /* renamed from: b  reason: collision with root package name */
    public final d f119321b = new a(this);

    static {
        Covode.recordClassIndex(77490);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ d a() {
        return this.f119321b;
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f119322a;

        static {
            Covode.recordClassIndex(77491);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f119322a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.qna.d.d
        public final t<h> a(Long l2, String str) {
            l.d(str, "");
            return this.f119322a.f119320a.getBannerData(l2, str);
        }
    }
}
