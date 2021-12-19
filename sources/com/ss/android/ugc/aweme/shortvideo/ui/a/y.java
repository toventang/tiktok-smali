package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.text.TextUtils;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.b.g;
import com.ss.android.ugc.asve.context.a;
import com.ss.android.ugc.asve.e.c;
import com.ss.android.ugc.aweme.property.Cdo;
import com.ss.android.ugc.aweme.property.al;
import com.ss.android.ugc.aweme.property.am;
import com.ss.android.ugc.aweme.property.bc;
import com.ss.android.ugc.aweme.property.bm;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.dq;
import com.ss.android.ugc.aweme.shortvideo.duet.h;
import com.ss.android.ugc.aweme.shortvideo.record.av;
import com.ss.android.ugc.aweme.shortvideo.record.aw;
import com.ss.android.ugc.aweme.shortvideo.record.t;
import com.ss.android.ugc.aweme.tools.beauty.g.k;
import h.f.a.b;
import h.z;
import java.lang.reflect.Type;

final /* synthetic */ class y implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f131370a;

    static {
        Covode.recordClassIndex(86071);
    }

    y(f fVar) {
        this.f131370a = fVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        int option;
        g gVar;
        aw awVar = (aw) obj;
        ((d) this.f131370a.a((Type) d.class, (String) null)).getApplication();
        boolean d2 = new k("").d();
        awVar.f130071a = true;
        awVar.f130072b = d2 ? 1 : 0;
        if (am.a()) {
            option = com.ss.android.ugc.asve.b.f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() | 0;
        } else {
            option = (com.ss.android.ugc.asve.b.f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() ^ -1) & 0;
        }
        awVar.a(new a((byte) option) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.z.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ byte f132386a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f132387b = 0;

            static {
                Covode.recordClassIndex(86687);
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final byte d() {
                return this.f132386a;
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final int e() {
                return com.ss.android.ugc.asve.e.a.a();
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final boolean f() {
                return c.a();
            }

            @Override // com.ss.android.ugc.asve.context.a
            public final boolean g() {
                return Cdo.a();
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final int h() {
                return com.ss.android.ugc.asve.e.b.a();
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final boolean k() {
                if (this.f132387b == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final boolean m() {
                return bc.a();
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final boolean c() {
                if (com.ss.android.ugc.asve.recorder.camera.b.f62210a != com.ss.android.ugc.asve.b.a.AS_CAMERA_2.ordinal()) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.asve.context.a, com.ss.android.ugc.asve.context.c
            public final int[] j() {
                int[] g2 = com.ss.android.ugc.aweme.property.b.g();
                if (g2 == null || !dq.a()) {
                    return new int[]{720, 1280};
                }
                return g2;
            }

            {
                this.f132386a = r2;
            }
        });
        String str = awVar.f130078h.f130058c;
        String str2 = awVar.f130078h.f130057b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            awVar.f130078h.f130061f = h.b();
        }
        awVar.f130079i.f130151b = al.a();
        awVar.f130079i.f130152c = com.ss.android.ugc.aweme.property.b.c() * 4.0f;
        awVar.f130079i.f130153d = com.ss.android.ugc.aweme.property.b.d();
        t tVar = awVar.f130079i;
        int a2 = av.a();
        if (a2 == 1) {
            gVar = g.AS_ENCODE_PROFILE_BASELINE;
        } else if (a2 == 2) {
            gVar = g.AS_ENCODE_PROFILE_MAIN;
        } else if (a2 != 8) {
            gVar = g.AS_ENCODE_PROFILE_UNKNOWN;
        } else {
            gVar = g.AS_ENCODE_PROFILE_HIGH;
        }
        tVar.a(gVar);
        awVar.f130081k = true;
        boolean a3 = bn.a();
        awVar.a(new aa(a3));
        awVar.w = a3;
        awVar.f130083m = true;
        awVar.o = bm.a();
        awVar.n = true;
        return z.f158842a;
    }
}
