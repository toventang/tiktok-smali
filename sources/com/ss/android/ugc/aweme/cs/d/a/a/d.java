package com.ss.android.ugc.aweme.cs.d.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.d.b.a.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import h.f.b.l;

public final class d extends b {
    static {
        Covode.recordClassIndex(49042);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.d.a.a.b
    public final long a() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f79007a.f83182c;
        String str3 = null;
        if (photoMovieContext != null) {
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            str = null;
        }
        long a2 = a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f79007a.f83182c;
        if (photoMovieContext2 != null) {
            str2 = photoMovieContext2.mOutputVideoPath;
        } else {
            str2 = null;
        }
        long a3 = a2 + a(str2);
        PhotoMovieContext photoMovieContext3 = this.f79007a.f83182c;
        if (photoMovieContext3 != null) {
            str3 = photoMovieContext3.mInputAudioPath;
        }
        return a3 + a(str3);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.d.a.a.b
    public final long b() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f79007a.f83182c;
        if (photoMovieContext != null) {
            str = photoMovieContext.mMusicPath;
        } else {
            str = null;
        }
        long a2 = a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f79007a.f83182c;
        if (photoMovieContext2 == null || (str2 = photoMovieContext2.mFilterPath) == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            return a2;
        }
        a aVar = new a(null, null, 3);
        com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
        aVar2.a(aVar);
        aVar2.a(str2);
        return a2 + aVar.f79012a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }
}
