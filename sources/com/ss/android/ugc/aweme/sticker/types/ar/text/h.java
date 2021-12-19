package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.types.ar.text.n;
import com.ss.android.ugc.tools.utils.j;
import com.zhiliaoapp.musically.R;
import h.z;

public final class h extends r {
    static {
        Covode.recordClassIndex(88788);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r
    public final void a() {
        if (!TextUtils.isEmpty(this.f135889j) && this.f135882c != null && this.f135883d != null) {
            this.f135882c.a(this.f135889j, this.f135883d.f135877b, this.f135883d.f135878c, this.f135883d.f135879d);
            this.f135882c.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r
    public final r a(n nVar) {
        nVar.setEffectTextChangeListener(new n.a() {
            /* class com.ss.android.ugc.aweme.sticker.types.ar.text.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(88789);
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n.a
            public final void a(String str) {
                if (h.this.f135886g) {
                    h.this.a(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n.a
            public final void b(String str) {
                h.this.f135889j = str;
                h.this.f135882c.a();
                h.this.f135882c.a(str, h.this.f135883d.f135877b, h.this.f135883d.f135878c, h.this.f135883d.f135879d);
            }
        });
        return super.a(nVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r
    public final int a(int i2, String str) {
        this.f135882c.a(new i(this, i2, str));
        return this.f135888i;
    }

    public h(e eVar, e eVar2, j jVar) {
        super(eVar, eVar2, jVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(int i2, String str, Integer num) {
        this.f135885f.runOnUiThread(new j(this, num, i2, str));
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Integer num, int i2, String str) {
        this.f135888i = num.intValue();
        if (this.f135888i > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.f135888i += str.length();
            }
            if (this.f135880a != null) {
                this.f135880a.setMaxTextCount(this.f135888i);
                return;
            }
            return;
        }
        com.ss.android.ugc.tools.view.widget.j.b(this.f135885f, this.f135885f.getResources().getString(R.string.f9t)).a();
    }
}
