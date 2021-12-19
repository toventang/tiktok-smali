package com.ss.android.ugc.aweme.im.sdk.chatlist.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.d;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.k.a f101887a;

    static {
        Covode.recordClassIndex(65187);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.c.a
    public final String a() {
        Boolean bool;
        String displayName;
        String str = "";
        if (this.f101887a.c() != 0) {
            String f2 = this.f101887a.f();
            l.b(f2, str);
            return f2;
        }
        com.ss.android.ugc.aweme.im.service.k.a aVar = this.f101887a;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.data.session.ChatSession");
        IMUser a2 = ((com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a) aVar).a();
        if (a2 != null) {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin != null) {
                bool = Boolean.valueOf(createIMainServicebyMonsterPlugin.shouldChangeToHandle("Message"));
            } else {
                bool = null;
            }
            if (l.a((Object) bool, (Object) true)) {
                displayName = a2.getDisplayId();
            } else {
                displayName = a2.getDisplayName();
            }
            if (displayName != null) {
                str = displayName;
            }
        }
        return str;
    }

    public b(com.ss.android.ugc.aweme.im.service.k.a aVar) {
        l.d(aVar, "");
        this.f101887a = aVar;
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f101888a = new a();

        static {
            Covode.recordClassIndex(65188);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_3pt_exclamation_mark_circle;
            aVar2.f44753e = Integer.valueOf((int) R.attr.av);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.c.a
    public final Drawable a(Context context) {
        l.d(context, "");
        int c2 = this.f101887a.c();
        if (c2 != 0 && c2 != 20) {
            return null;
        }
        com.ss.android.ugc.aweme.im.service.k.a aVar = this.f101887a;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.data.session.IMBaseSession");
        d.a aVar2 = ((d) aVar).f101876f;
        if (aVar2 != null) {
            int i2 = c.f101889a[aVar2.ordinal()];
            if (i2 == 1) {
                return c.a(a.f101888a).a(context);
            }
            if (i2 == 2) {
                return androidx.core.content.b.a(context, (int) R.drawable.at5);
            }
        }
        return null;
    }
}
