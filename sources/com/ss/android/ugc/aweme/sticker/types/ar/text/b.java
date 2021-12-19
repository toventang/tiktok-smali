package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.types.ar.text.n;
import com.ss.android.ugc.tools.utils.j;
import com.zhiliaoapp.musically.R;
import h.z;

public final class b extends r {
    static {
        Covode.recordClassIndex(88779);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r
    public final r a(n nVar) {
        this.f135880a = nVar;
        nVar.setEffectTextChangeListener(new n.a() {
            /* class com.ss.android.ugc.aweme.sticker.types.ar.text.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(88780);
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n.a
            public final void b(String str) {
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n.a
            public final void a(String str) {
                if (b.this.f135886g) {
                    b.this.a(str);
                }
            }
        });
        return this;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r
    public final int a(int i2, String str) {
        this.f135882c.a(new c(this, i2, str));
        return this.f135888i;
    }

    public b(e eVar, e eVar2, j jVar) {
        super(eVar, eVar2, jVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(int i2, String str, Integer num) {
        this.f135885f.runOnUiThread(new d(this, num, i2, str));
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
