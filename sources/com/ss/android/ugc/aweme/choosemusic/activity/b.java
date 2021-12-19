package com.ss.android.ugc.aweme.choosemusic.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.c.v;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;

final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseMusicActivity f70337a;

    /* renamed from: b  reason: collision with root package name */
    private final i f70338b;

    /* renamed from: c  reason: collision with root package name */
    private final String f70339c;

    /* renamed from: d  reason: collision with root package name */
    private final MusicModel f70340d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f70341e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70342f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f70343g;

    /* renamed from: h  reason: collision with root package name */
    private final String f70344h;

    /* renamed from: i  reason: collision with root package name */
    private final String f70345i;

    static {
        Covode.recordClassIndex(43381);
    }

    b(ChooseMusicActivity chooseMusicActivity, i iVar, String str, MusicModel musicModel, boolean z, boolean z2, Bundle bundle, String str2, String str3) {
        this.f70337a = chooseMusicActivity;
        this.f70338b = iVar;
        this.f70339c = str;
        this.f70340d = musicModel;
        this.f70341e = z;
        this.f70342f = z2;
        this.f70343g = bundle;
        this.f70344h = str2;
        this.f70345i = str3;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        ChooseMusicActivity chooseMusicActivity = this.f70337a;
        i iVar = this.f70338b;
        String str = this.f70339c;
        MusicModel musicModel = this.f70340d;
        boolean z = this.f70341e;
        boolean z2 = this.f70342f;
        Bundle bundle = this.f70343g;
        String str2 = this.f70344h;
        String str3 = this.f70345i;
        chooseMusicActivity.a();
        Fragment a2 = iVar.a(R.id.b94);
        v a3 = v.a(chooseMusicActivity.f70329c, str, musicModel, d.a.BtnConfirm, z, z2, bundle, str2, str3, chooseMusicActivity.f70330d ? 1 : 0);
        if (a2 != null) {
            iVar.a().b(R.id.b94, a3).b();
        } else {
            iVar.a().a(R.id.b94, a3).b();
        }
        return z.f158842a;
    }
}
