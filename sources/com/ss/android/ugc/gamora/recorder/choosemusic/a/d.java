package com.ss.android.ugc.gamora.recorder.choosemusic.a;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.ar;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.a.a;
import h.f.a.m;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ar f147523a;

    /* renamed from: b  reason: collision with root package name */
    public MusicModel f147524b;

    /* renamed from: c  reason: collision with root package name */
    public final e f147525c;

    /* renamed from: d  reason: collision with root package name */
    public final m<MusicModel, Long, z> f147526d;

    /* renamed from: e  reason: collision with root package name */
    public final q<String, MusicModel, String, z> f147527e;

    /* renamed from: f  reason: collision with root package name */
    public final m<MusicModel, Exception, z> f147528f;

    /* renamed from: g  reason: collision with root package name */
    public final a<z> f147529g;

    static {
        Covode.recordClassIndex(97214);
    }

    public final void a() {
        this.f147523a.a();
    }

    public final void a(MusicModel musicModel, boolean z, String str) {
        l.d(str, "");
        this.f147523a.a(musicModel, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.Long, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.q<? super java.lang.String, ? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.Exception, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, m<? super MusicModel, ? super Long, z> mVar, q<? super String, ? super MusicModel, ? super String, z> qVar, m<? super MusicModel, ? super Exception, z> mVar2, a<z> aVar) {
        l.d(eVar, "");
        this.f147525c = eVar;
        this.f147526d = mVar;
        this.f147527e = qVar;
        this.f147528f = mVar2;
        this.f147529g = aVar;
        ar t = g.a().t();
        this.f147523a = t;
        t.a(new com.ss.android.ugc.aweme.music.j.a(this) {
            /* class com.ss.android.ugc.gamora.recorder.choosemusic.a.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f147530a;

            static {
                Covode.recordClassIndex(97215);
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final MusicModel a() {
                return this.f147530a.f147524b;
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final Activity b() {
                return this.f147530a.f147525c;
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final void c() {
                a<z> aVar = this.f147530a.f147529g;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f147530a = r1;
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final void a(MusicModel musicModel, long j2) {
                m<MusicModel, Long, z> mVar = this.f147530a.f147526d;
                if (mVar != null) {
                    mVar.invoke(musicModel, Long.valueOf(j2));
                }
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final void a(MusicModel musicModel, Exception exc) {
                m<MusicModel, Exception, z> mVar = this.f147530a.f147528f;
                if (mVar != null) {
                    mVar.invoke(musicModel, exc);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.j.a
            public final void a(String str, MusicModel musicModel, String str2) {
                q<String, MusicModel, String, z> qVar = this.f147530a.f147527e;
                if (qVar != null) {
                    qVar.invoke(str, musicModel, str2);
                }
            }
        });
    }
}
