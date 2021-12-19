package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.google.gson.f;
import com.ss.android.ugc.aweme.translation.a.c;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f f119357a = new f();

    static {
        Covode.recordClassIndex(77504);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ m $failResult;
        final /* synthetic */ String $originalString;
        final /* synthetic */ i $qnaTranslationCallback;
        final /* synthetic */ String $questionId;
        final /* synthetic */ String $targetLanguage;
        final /* synthetic */ List $translationInfos;
        int label;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(77505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, String str, List list, i iVar, m mVar, String str2, String str3, d dVar) {
            super(2, dVar);
            this.this$0 = jVar;
            this.$targetLanguage = str;
            this.$translationInfos = list;
            this.$qnaTranslationCallback = iVar;
            this.$failResult = mVar;
            this.$questionId = str2;
            this.$originalString = str3;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, this.$targetLanguage, this.$translationInfos, this.$qnaTranslationCallback, this.$failResult, this.$questionId, this.$originalString, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                q<com.ss.android.ugc.aweme.translation.a.a> a2 = TranslationApi.a(this.$targetLanguage, this.this$0.f119357a.b(this.$translationInfos), 2);
                l.b(a2, "");
                com.google.c.h.a.l.a(a2, new com.google.c.h.a.k<com.ss.android.ugc.aweme.translation.a.a>(this) {
                    /* class com.ss.android.ugc.aweme.qna.d.j.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f119358a;

                    static {
                        Covode.recordClassIndex(77506);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f119358a = r1;
                    }

                    @Override // com.google.c.h.a.k
                    public final void onFailure(Throwable th) {
                        l.d(th, "");
                        this.f119358a.$qnaTranslationCallback.a(this.f119358a.$failResult);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.c.h.a.k
                    public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.translation.a.a aVar) {
                        List<c> list;
                        com.ss.android.ugc.aweme.translation.a.a aVar2 = aVar;
                        if (aVar2 == null || (list = aVar2.f141008a) == null || list.isEmpty()) {
                            this.f119358a.$qnaTranslationCallback.a(this.f119358a.$failResult);
                            return;
                        }
                        i iVar = this.f119358a.$qnaTranslationCallback;
                        String str = this.f119358a.$questionId;
                        String str2 = this.f119358a.$originalString;
                        c cVar = list.get(0);
                        l.b(cVar, "");
                        String str3 = cVar.f141015a;
                        l.b(str3, "");
                        iVar.a(new m(true, str, str2, str3));
                    }
                }, com.ss.android.ugc.aweme.base.m.f68150a);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static m a(String str, String str2) {
        return new m(false, str, str2, null);
    }

    public final void a(l lVar, i iVar) {
        l.d(lVar, "");
        l.d(iVar, "");
        if (!lVar.f119361b.f119273a.isEmpty()) {
            String str = lVar.f119361b.f119274b;
            List<k> list = lVar.f119361b.f119273a;
            String str2 = lVar.f119360a;
            String str3 = lVar.f119361b.f119273a.get(0).f119359a;
            m a2 = a(str2, str3);
            try {
                bz unused = i.a(an.a(bf.f159041b), null, null, new a(this, str, list, iVar, a2, str2, str3, null), 3);
            } catch (Exception unused2) {
                iVar.a(a2);
            }
        }
    }
}
