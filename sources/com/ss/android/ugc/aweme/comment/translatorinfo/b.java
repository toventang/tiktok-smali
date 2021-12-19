package com.ss.android.ugc.aweme.comment.translatorinfo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.ae;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public CommentTranslatorInfoApi.a f72455a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f72456b;

    /* renamed from: c  reason: collision with root package name */
    public final a f72457c;

    static {
        Covode.recordClassIndex(44659);
    }

    public static final class a implements ae<CommentTranslatorInfoApi.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f72458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f72459b;

        static {
            Covode.recordClassIndex(44660);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(CommentTranslatorInfoApi.a aVar) {
            CommentTranslatorInfoApi.a aVar2 = aVar;
            l.d(aVar2, "");
            this.f72458a.f72455a = aVar2;
            this.f72458a.f72457c.r();
        }

        a(b bVar, Aweme aweme) {
            this.f72458a = bVar;
            this.f72459b = aweme;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:25:0x0056 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.translatorinfo.b.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public b(Context context, a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        this.f72456b = context;
        this.f72457c = aVar;
    }
}
