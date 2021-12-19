package com.ss.android.ugc.aweme.favorites.g;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.experiment.cl;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.zhiliaoapp.musically.R;

public final class a extends c<b<BaseResponse>, d> {

    /* renamed from: a  reason: collision with root package name */
    public int f90637a;

    /* renamed from: b  reason: collision with root package name */
    public int f90638b;

    /* renamed from: c  reason: collision with root package name */
    public String f90639c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f90640d;

    static {
        Covode.recordClassIndex(56940);
    }

    public a() {
        a(new b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.favorites.g.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(56941);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
            @Override // com.ss.android.ugc.aweme.common.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean sendRequest(java.lang.Object... r8) {
                /*
                // Method dump skipped, instructions count: 182
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.g.a.AnonymousClass1.sendRequest(java.lang.Object[]):boolean");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        int i2 = this.f90638b;
        int i3 = R.string.tj;
        if (i2 == 6) {
            if (this.f90637a == 2) {
                ((d) this.f76397i).a(g.a().getString(R.string.tj));
            }
        } else if ((i2 == 1 && !TextUtils.equals(this.f90639c, "single_song") && !TextUtils.equals(this.f90639c, "similar_song")) || this.f90638b == 2) {
            if (this.f90638b == 2 && cl.a()) {
                FavoriteServiceImpl.a().a(this.f90640d);
            }
            if (this.f90638b != 2 || this.f90637a != 1 || !cl.a() || TextUtils.equals(this.f90639c, "music_dsp")) {
                if (this.f90637a == 1) {
                    i3 = R.string.tk;
                }
                ((d) this.f76397i).a(g.a().getString(i3));
            } else {
                FavoriteServiceImpl.a().a((e) f.j(), this.f90640d, this.f90639c);
            }
            if (this.f90638b == 2) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.favorites.d.a(this.f90640d, this.f90637a));
            }
        }
        if (this.f76397i != null) {
            if (this.f76396h == null) {
                t = null;
            } else {
                t = this.f76396h.mData;
            }
            ((d) this.f76397i).a((BaseResponse) t);
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f90637a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        int i2 = this.f90638b;
        int i3 = R.string.ahj;
        if (i2 == 5) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
            if (aVar.getErrorCode() == 4) {
                ((d) this.f76397i).a(aVar.getErrorMsg());
            } else {
                if (this.f90637a != 1) {
                    i3 = R.string.a9i;
                }
                ((d) this.f76397i).a(g.a().getString(i3));
            }
        } else {
            if (this.f90637a != 1) {
                i3 = R.string.a9i;
            }
            ((d) this.f76397i).a(g.a().getString(i3));
        }
        if (this.f76397i != null) {
            ((d) this.f76397i).e_(exc);
        }
    }
}
