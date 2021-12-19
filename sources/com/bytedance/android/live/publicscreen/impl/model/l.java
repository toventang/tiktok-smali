package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.c.g;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class l extends k<com.bytedance.android.livesdk.model.message.e.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f12486e = new b((byte) 0);

    static {
        Covode.recordClassIndex(6858);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        return R.drawable.c_4;
    }

    public static final class a implements e.b {
        static {
            Covode.recordClassIndex(6859);
        }

        a() {
        }

        @Override // com.bytedance.android.livesdkapi.host.e.b
        public final void a(Bitmap bitmap) {
            com.bytedance.android.live.core.c.a.a(3, "RedEnvelopeMessageModel", "load icon success");
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(6860);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(com.bytedance.android.livesdk.model.message.e.b bVar) {
        super(bVar);
        com.bytedance.android.livesdk.model.message.c.b bVar2;
        List<d> list;
        e eVar;
        ImageModel imageModel;
        h.f.b.l.d(bVar, "");
        bVar.f19617g = ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).enableRedEnvelope();
        com.bytedance.android.livesdkapi.h.b bVar3 = bVar.O;
        if (!(bVar3 == null || (bVar2 = bVar3.f23218j) == null || (list = bVar2.f19424d) == null)) {
            for (T t : list) {
                h.f.b.l.b(t, "");
                if (t.f19433a == com.bytedance.android.livesdkapi.h.d.IMAGE.getPieceType() && (eVar = (e) com.bytedance.android.live.t.a.a(e.class)) != null) {
                    g gVar = t.f19440h;
                    if (gVar != null) {
                        imageModel = gVar.f19446a;
                    } else {
                        imageModel = null;
                    }
                    eVar.a(imageModel, new a());
                }
            }
        }
    }
}
