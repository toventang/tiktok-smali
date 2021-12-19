package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.effect.api.g;
import com.bytedance.android.live.effect.api.h;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.i;
import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAnchorEnableSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.a.n;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public i f16384a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<l> f16385b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private DataChannel f16386c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f16387d;

    static {
        Covode.recordClassIndex(9060);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    public final void c() {
        l lVar = l.EFFECT;
        DataChannel dataChannel = this.f16386c;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        lVar.setRedDotVisible(dataChannel, d());
    }

    private static boolean d() {
        if (!d.a().c()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cA;
            h.f.b.l.b(bVar, "");
            Boolean a2 = bVar.a();
            h.f.b.l.b(a2, "");
            if (!a2.booleanValue() || StickerAnchorEnableSetting.INSTANCE.getValue() != 1) {
                return false;
            }
        }
        return true;
    }

    static final class b extends m implements h.f.a.b<String, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            h.f.b.l.d(str, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<z, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<z, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            i iVar = this.this$0.f16384a;
            if (iVar != null) {
                iVar.dismiss();
            }
            return z.f158842a;
        }
    }

    public e(Context context) {
        h.f.b.l.d(context, "");
        this.f16387d = context;
    }

    public final void onClick(View view) {
        String str;
        if (!this.f16385b.isEmpty()) {
            Context context = this.f16387d;
            ArrayList<l> arrayList = this.f16385b;
            DataChannel dataChannel = this.f16386c;
            if (dataChannel == null) {
                h.f.b.l.a("dataChannel");
            }
            i iVar = new i(context, arrayList, dataChannel);
            this.f16384a = iVar;
            iVar.showAtLocation(view, 80, 0, 0);
        }
        HashMap hashMap = new HashMap();
        DataChannel dataChannel2 = this.f16386c;
        if (dataChannel2 == null) {
            h.f.b.l.a("dataChannel");
        }
        Object b2 = dataChannel2.b(bx.class);
        if (b2 == null) {
            b2 = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
        }
        if (com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY == b2) {
            str = "third_party";
        } else {
            str = "video_live";
        }
        hashMap.put("live_type", str);
        com.bytedance.android.livesdk.ab.b b3 = b.a.a("live_take_decoration_click").a((Map<String, String>) hashMap).d("live_take_detail").b("live_take");
        DataChannel dataChannel3 = this.f16386c;
        if (dataChannel3 == null) {
            h.f.b.l.a("dataChannel");
        }
        b3.a(dataChannel3).b();
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(dataChannel, "");
        i iVar = this.f16384a;
        if (iVar != null) {
            iVar.dismiss();
        }
        dataChannel.b(this);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        ArrayList d2;
        h.f.b.l.d(view, "");
        h.f.b.l.d(dataChannel, "");
        this.f16386c = dataChannel;
        if (dataChannel == null) {
            h.f.b.l.a("dataChannel");
        }
        dataChannel.a(this, com.bytedance.android.live.broadcast.api.a.class, new a(this)).a(this, g.class, new b(this)).a(this, h.class, new c(this));
        this.f16385b.clear();
        ArrayList<l> arrayList = this.f16385b;
        if (StickerAnchorEnableSetting.INSTANCE.getValue() == 1) {
            d2 = n.d(l.BEAUTY, l.STICKER, l.PROPS);
        } else {
            d2 = n.d(l.BEAUTY, l.STICKER);
        }
        arrayList.addAll(d2);
        c();
    }
}
