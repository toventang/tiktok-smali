package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class e extends k<y> {
    static {
        Covode.recordClassIndex(6849);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        return 2131234701;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((y) this.f12190d).f19705g;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean k() {
        if (!C()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        String str = null;
        try {
            String a2 = g.a(((y) this.f12190d).f19705g);
            String str2 = ((y) this.f12190d).O.f23214f;
            if (str2.startsWith(a2 + ":")) {
                str = str2.substring(a2.length() + 1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f12190d.O.f23214f;
        }
        ((com.bytedance.android.live.publicscreen.a.e) a.a(com.bytedance.android.live.publicscreen.a.e.class)).getTextMessageConfig();
        ((com.bytedance.android.live.publicscreen.a.e) a.a(com.bytedance.android.live.publicscreen.a.e.class)).getTextMessageConfig();
        return k.b(((y) this.f12190d).f19705g, "：", str, R.color.a1t, R.color.a0e);
    }

    public e(y yVar) {
        super(yVar);
    }

    public final void a(final k.a aVar) {
        if (!(this.f12190d.O == null || this.f12190d.O.f23218j == null)) {
            b bVar = this.f12190d.O.f23218j;
            String str = bVar.f19422b;
            if (!((bVar.f19421a == null || com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a) == null) && str == null)) {
                for (d dVar : bVar.f19424d) {
                    if (dVar.f19433a == com.bytedance.android.livesdkapi.h.d.GIFT.getPieceType() && dVar.f19437e != null) {
                        u uVar = ((y) this.f12190d).t;
                        if (uVar != null) {
                            ((com.bytedance.android.livesdkapi.host.e) a.a(com.bytedance.android.livesdkapi.host.e.class)).a(uVar.f19759b, new e.b() {
                                /* class com.bytedance.android.live.publicscreen.impl.model.e.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(6850);
                                }

                                @Override // com.bytedance.android.livesdkapi.host.e.b
                                public final void a(Bitmap bitmap) {
                                    MethodCollector.i(6554);
                                    if (bitmap == null) {
                                        MethodCollector.o(6554);
                                        return;
                                    }
                                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    k.a aVar = aVar;
                                    if (aVar != null) {
                                        aVar.a(copy, e.this);
                                    }
                                    MethodCollector.o(6554);
                                }
                            });
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
