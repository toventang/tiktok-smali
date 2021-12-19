package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.e.e.v;
import f.a.h.a;
import f.a.t;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f18346a = new m();

    static {
        Covode.recordClassIndex(10328);
    }

    private m() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        if (dVar == null || dVar.data == null) {
            return a.a(v.f157740a);
        }
        ArrayList arrayList = new ArrayList();
        if (!((u) dVar.data).a().isEmpty()) {
            for (ImageModel imageModel : ((u) dVar.data).a()) {
                arrayList.add(com.bytedance.android.livesdk.chatroom.g.g.a(imageModel).d(new k(imageModel)));
            }
        }
        if (!((u) dVar.data).b().isEmpty()) {
            for (ImageModel imageModel2 : ((u) dVar.data).b()) {
                arrayList.add(com.bytedance.android.livesdk.chatroom.g.g.a(imageModel2).d(new l(imageModel2)));
            }
        }
        return t.c(arrayList);
    }
}
