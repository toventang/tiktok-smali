package com.ss.android.ugc.aweme.favorites.g;

import android.os.Message;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.favorites.g.a;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;

final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass1 f90642a;

    static {
        Covode.recordClassIndex(56942);
    }

    b(a.AnonymousClass1 r1) {
        this.f90642a = r1;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a.AnonymousClass1 r2 = this.f90642a;
        if (iVar.c() || iVar.b()) {
            a.this.a_(iVar.e());
            return null;
        }
        CollectMusicResponse collectMusicResponse = (CollectMusicResponse) iVar.d();
        collectMusicResponse.action = a.this.f90637a;
        Message message = new Message();
        message.obj = collectMusicResponse;
        r2.handleMsg(message);
        return null;
    }
}
