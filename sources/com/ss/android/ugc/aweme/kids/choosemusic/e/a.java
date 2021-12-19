package com.ss.android.ugc.aweme.kids.choosemusic.e;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ChooseMusicApi.API f105589a = ChooseMusicApi.f105495a;

    /* renamed from: b  reason: collision with root package name */
    DataCenter f105590b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f105591c;

    /* renamed from: d  reason: collision with root package name */
    Context f105592d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f105593e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f105594f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f105595g;

    static {
        Covode.recordClassIndex(67643);
    }

    public final void a() {
        ChooseMusicApi.b(0).a(new f(this), i.f4826c, null);
    }

    public final void b() {
        if (!this.f105594f) {
            this.f105594f = true;
            ChooseMusicApi.a(0).a(new k(this, o.a()), i.f4826c, null);
        }
    }

    public final void c() {
        if (!this.f105595g) {
            this.f105595g = true;
            this.f105589a.getHotMusicList(0, 20, false).a(new m(this), i.f4826c, null);
        }
    }

    public a(Context context, DataCenter dataCenter) {
        this.f105590b = dataCenter;
        this.f105592d = context;
    }

    public final void b(String str, int i2) {
        ChooseMusicApi.b(str, 0, 30, i2).a(new j(this, i2), i.f4826c, null);
    }

    public final void a(String str, int i2) {
        if (!this.f105593e) {
            this.f105593e = true;
            ChooseMusicApi.a(str, 0, 30, i2).a(new h(this), i.f4826c, null);
        }
    }

    public final void a(boolean z, String str, final Music music) {
        ChooseMusicApi.a((Integer) this.f105590b.b("radio_cursor", (Object) 0), str).a(new g<r, r>() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.e.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67644);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public r then(i<r> iVar) {
                Music music = music;
                if (music != null) {
                    try {
                        Music music2 = ChooseMusicApi.a(music.getMid()).f105322a;
                        if (music2 != null) {
                            music.setCollectStatus(music2.getCollectStatus());
                        }
                    } catch (Exception unused) {
                    }
                }
                return iVar.d();
            }
        }, i.f4824a, null).a(new b(this, z, str, music), i.f4826c, null);
    }

    public final void a(MusicModel musicModel, String str, int i2, int i3, int i4) {
        this.f105589a.collectMusic(str, i2).a(new e(this, musicModel, i2, i3, i4), i.f4826c, null);
    }
}
