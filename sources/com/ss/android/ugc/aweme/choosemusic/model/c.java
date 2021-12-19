package com.ss.android.ugc.aweme.choosemusic.model;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.a.d;
import com.ss.android.ugc.aweme.music.model.Music;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f70651a;

    /* renamed from: b  reason: collision with root package name */
    private final String f70652b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f70653c;

    /* renamed from: d  reason: collision with root package name */
    private final Music f70654d;

    static {
        Covode.recordClassIndex(43563);
    }

    c(b bVar, String str, boolean z, Music music) {
        this.f70651a = bVar;
        this.f70652b = str;
        this.f70653c = z;
        this.f70654d = music;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f70651a;
        String str = this.f70652b;
        boolean z = this.f70653c;
        Music music = this.f70654d;
        d dVar = (d) obj;
        dVar.getClass();
        bVar.a(i.b(new j(dVar), i.f4825b), str, z, music);
    }
}
