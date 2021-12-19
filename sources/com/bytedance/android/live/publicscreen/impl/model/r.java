package com.bytedance.android.live.publicscreen.impl.model;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.gift.model.y;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.c.g;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class r extends k<y> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f12491e = new b((byte) 0);

    static {
        Covode.recordClassIndex(6866);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    public static final class a implements e.b {
        static {
            Covode.recordClassIndex(6867);
        }

        a() {
        }

        @Override // com.bytedance.android.livesdkapi.host.e.b
        public final void a(Bitmap bitmap) {
            com.bytedance.android.live.core.c.a.a(3, "WishListMessageModel", "load icon success");
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(6868);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(y yVar) {
        super(yVar);
        com.bytedance.android.livesdk.model.message.c.b bVar;
        List<d> list;
        e eVar;
        ImageModel imageModel;
        l.d(yVar, "");
        com.bytedance.android.livesdkapi.h.b bVar2 = yVar.O;
        if (!(bVar2 == null || (bVar = bVar2.f23218j) == null || (list = bVar.f19424d) == null)) {
            for (T t : list) {
                l.b(t, "");
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
