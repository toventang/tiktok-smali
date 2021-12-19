package com.ss.android.ugc.aweme.choosemusic.model;

import android.content.Context;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.a.c;
import com.ss.android.ugc.aweme.choosemusic.model.a.e;
import com.ss.android.ugc.aweme.choosemusic.model.a.f;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public ChooseMusicApi.API f70640a = ChooseMusicApi.f70375a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f70641b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70642c;

    /* renamed from: d  reason: collision with root package name */
    Context f70643d;

    /* renamed from: e  reason: collision with root package name */
    IAVMobService f70644e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f70645f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f70646g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f70647h;

    static {
        Covode.recordClassIndex(43561);
    }

    public final void a(boolean z, String str, Music music, boolean z2, int i2) {
        Integer num = (Integer) this.f70641b.b("radio_cursor", (Object) 0);
        if (num.intValue() != 0 || !bl.a() || a()) {
            a(ChooseMusicApi.a(num, str, z2, i2), str, z, music);
        } else {
            c.a.a().a(new e(num.intValue(), str, z2, i2), f.a.f70602a).a(new c(this, str, z, music), new d(this));
        }
    }

    public final void a(String str, String str2, Music music, final int i2) {
        ChallengeServiceImpl.a().a("data_challenge", str, str2, music, new IChallengeService.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.model.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f70648a = false;

            static {
                Covode.recordClassIndex(43562);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>, java.util.List */
            @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService.a
            public final boolean a(String str, Challenge challenge) {
                List arrayList = new ArrayList();
                List<MusicModel> b2 = com.ss.android.ugc.aweme.choosemusic.utils.c.b(challenge.getConnectMusics());
                if (!CommerceMediaServiceImpl.f().e() || b2.isEmpty()) {
                    arrayList = b2;
                } else {
                    for (MusicModel musicModel : b2) {
                        if (musicModel.isCommerceMusic()) {
                            arrayList.add(musicModel);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    b.this.f70641b.a(str, challenge);
                }
                return ((Boolean) b.this.f70641b.b("is_busi_sticker", (Object) false)).booleanValue();
            }

            @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService.a
            public final void a(String str, Music music, boolean z) {
                b.this.a(this.f70648a, str, music, z, i2);
            }
        });
    }

    private static boolean a() {
        if (CommerceMediaServiceImpl.f().d()) {
            return true;
        }
        if (CommerceMediaServiceImpl.f().a() || !CommerceMediaServiceImpl.f().c()) {
            return false;
        }
        return true;
    }

    public final void b(int i2) {
        if (!this.f70646g) {
            this.f70646g = true;
            ChooseMusicApi.a(0, 20, i2).a(new e(this, o.a()), i.f4826c, null);
        }
    }

    public final void c(int i2) {
        if (!this.f70647h) {
            this.f70647h = true;
            this.f70640a.getHotMusicList(0, 20, false, i2).a(new g(this), i.f4826c, null);
        }
    }

    static List<Music> a(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        if (!CommerceMediaServiceImpl.f().e() || list == null || list.isEmpty()) {
            return list;
        }
        for (Music music : list) {
            if (music.isCommercialMusic()) {
                arrayList.add(music);
            }
        }
        return arrayList;
    }

    public final void a(int i2) {
        ChooseMusicApi.a(0, i2).a(new n(this), i.f4826c, null);
    }

    private static i<ah> a(i<ah> iVar, Music music) {
        if (music == null) {
            return iVar;
        }
        return iVar.a(new l(music), i.f4824a, null);
    }

    public b(Context context, DataCenter dataCenter) {
        this.f70641b = dataCenter;
        this.f70643d = context;
        this.f70644e = AVExternalServiceImpl.a().getAVMobService();
    }

    static final /* synthetic */ ah a(Music music, i iVar) {
        try {
            Music music2 = MusicApi.a(music.getMid(), 0).music;
            if (music2 != null) {
                music.setCollectStatus(music2.getCollectStatus());
            }
        } catch (Exception unused) {
        }
        return (ah) iVar.d();
    }

    public final void b(String str, int i2, int i3) {
        ChooseMusicApi.b(str, 0, 30, i2, i3).a(new r(this, i2), i.f4826c, null);
    }

    public final void a(String str, int i2, int i3) {
        if (!this.f70645f) {
            this.f70645f = true;
            ChooseMusicApi.a(str, 0, 30, i2, i3).a(new p(this), i.f4826c, null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(i<ah> iVar, String str, boolean z, Music music) {
        k kVar = new k(this, z, str, music);
        if (music == null && Looper.myLooper() == Looper.getMainLooper()) {
            iVar.a(kVar);
        } else {
            a(iVar, music).a(kVar, i.f4826c, null);
        }
    }

    public final void a(MusicModel musicModel, String str, int i2, int i3, int i4) {
        this.f70640a.collectMusic(str, i2).a(new i(this, musicModel, i2, i3, i4, str), i.f4826c, null);
    }
}
