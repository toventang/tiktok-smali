package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {
    static {
        Covode.recordClassIndex(91870);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class a implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f140687b;

        static {
            Covode.recordClassIndex(91871);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(String str) {
            l.d(str, "");
            long a2 = this.f140686a.f140641b.a("download music", "success");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140686a.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140738g = (int) a2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140686a.f140642c.f140680i;
            if (bVar != null) {
                bVar.a((MusicModel) this.f140687b, str, false);
            }
        }

        a(d dVar, Object obj) {
            this.f140686a = dVar;
            this.f140687b = obj;
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(Integer num, String str) {
            int i2;
            long a2 = this.f140686a.f140641b.a("download music", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140686a.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140738g = (int) a2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2 = this.f140686a.f140642c.f140677f;
            if (dVar2 != null) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                dVar2.f140740i = i2;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar3 = this.f140686a.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140743l = str;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar4 = this.f140686a.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140742k = 7;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140686a.f140642c.f140680i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        this.f140641b.f140703a = System.currentTimeMillis();
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 4;
        }
        if (obj instanceof MusicModel) {
            c b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b((MusicModel) obj);
            if (b2 == null) {
                long a2 = this.f140641b.a("download music", "failed.");
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar2 = this.f140642c.f140677f;
                if (dVar2 != null) {
                    dVar2.f140738g = (int) a2;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar3 = this.f140642c.f140677f;
                if (dVar3 != null) {
                    dVar3.f140743l = "avmusic model null";
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar4 = this.f140642c.f140677f;
                if (dVar4 != null) {
                    dVar4.f140742k = 7;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140642c.f140680i;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar5 = this.f140642c.f140677f;
            if (dVar5 != null) {
                String musicId = b2.getMusicId();
                l.b(musicId, "");
                l.d(musicId, "");
                dVar5.f140739h = musicId;
            }
            WeakReference<Activity> weakReference = this.f140642c.f140678g;
            Activity activity = null;
            if (weakReference == null || weakReference.get() == null) {
                long a3 = this.f140641b.a("download music", "failed.");
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar6 = this.f140642c.f140677f;
                if (dVar6 != null) {
                    dVar6.f140738g = (int) a3;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar7 = this.f140642c.f140677f;
                if (dVar7 != null) {
                    dVar7.f140743l = "activity is null";
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar8 = this.f140642c.f140677f;
                if (dVar8 != null) {
                    dVar8.f140742k = 7;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar2 = this.f140642c.f140680i;
                if (bVar2 != null) {
                    bVar2.a();
                    return;
                }
                return;
            }
            aa aaVar = com.ss.android.ugc.aweme.port.in.c.f115629h;
            WeakReference<Activity> weakReference2 = this.f140642c.f140678g;
            if (weakReference2 == null || (activity = weakReference2.get()) == null) {
                l.b();
            }
            l.b(activity, "");
            aaVar.a(activity, b2, 6, new a(this, obj));
            return;
        }
        long a4 = this.f140641b.a("download music", "failed.");
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar9 = this.f140642c.f140677f;
        if (dVar9 != null) {
            dVar9.f140738g = (int) a4;
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar10 = this.f140642c.f140677f;
        if (dVar10 != null) {
            dVar10.f140743l = "avmusic model type error";
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.d dVar11 = this.f140642c.f140677f;
        if (dVar11 != null) {
            dVar11.f140742k = 7;
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar3 = this.f140642c.f140680i;
        if (bVar3 != null) {
            bVar3.a();
        }
    }
}
