package com.bytedance.android.livesdk.chatroom.interaction;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.chatroom.ui.aq;
import com.bytedance.android.livesdk.j.ab;
import com.bytedance.android.livesdk.j.ag;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.dy;
import com.bytedance.android.livesdk.j.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15640b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f15641a;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.android.livesdk.ui.a f15642c;

    /* renamed from: d  reason: collision with root package name */
    private final View f15643d;

    /* renamed from: e  reason: collision with root package name */
    private final aq f15644e;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.b<Float, z> f15645f;

    final /* synthetic */ class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f15647a;

        static {
            Covode.recordClassIndex(8643);
        }

        c(h.f.a.b bVar) {
            this.f15647a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.b(this.f15647a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8639);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final int a() {
        an anVar = (an) this.f15641a.b(ad.class);
        if (anVar != null) {
            return anVar.f15100a;
        }
        return 0;
    }

    private final boolean b() {
        an anVar = (an) this.f15641a.b(ad.class);
        if (anVar != null) {
            return anVar.a();
        }
        return false;
    }

    private final int c() {
        Integer num = (Integer) this.f15641a.b(t.class);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0328b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15646a;

        static {
            Covode.recordClassIndex(8642);
        }

        View$OnClickListenerC0328b(b bVar) {
            this.f15646a = bVar;
        }

        public final void onClick(View view) {
            this.f15646a.f15641a.c(ag.class);
            l.b(view, "");
            view.setVisibility(8);
        }
    }

    public final void onEvent(s sVar) {
        int i2;
        aq aqVar;
        View a2;
        String str;
        aq aqVar2;
        View a3;
        if (this.f15642c.isViewValid()) {
            Object b2 = this.f15641a.b(bc.class);
            if (b2 == null) {
                l.b();
            }
            boolean booleanValue = ((Boolean) b2).booleanValue();
            if (sVar.f15147b) {
                View$OnClickListenerC0328b bVar = new View$OnClickListenerC0328b(this);
                View view = this.f15643d;
                view.setVisibility(0);
                view.setOnClickListener(bVar);
                if (!(!booleanValue || (aqVar2 = this.f15644e) == null || (a3 = aqVar2.a()) == null)) {
                    a3.setVisibility(0);
                    a3.setOnClickListener(bVar);
                }
                if (!booleanValue) {
                    if ((b() && a() > 0) || c() != 0) {
                        this.f15641a.c(dy.class, Integer.valueOf(y.a(200.0f)));
                        this.f15641a.b(ab.class, (Object) true);
                    }
                    this.f15645f.invoke(Float.valueOf(-((float) sVar.f15146a)));
                }
                this.f15641a.b(ba.class, (Object) true);
                this.f15641a.c(com.bytedance.android.livesdk.j.y.class, 8);
            } else {
                this.f15643d.setVisibility(8);
                if (!(!booleanValue || (aqVar = this.f15644e) == null || (a2 = aqVar.a()) == null)) {
                    a2.setVisibility(8);
                }
                this.f15645f.invoke(Float.valueOf(0.0f));
                this.f15641a.b(ba.class, (Object) false);
                this.f15641a.c(com.bytedance.android.livesdk.j.y.class, 0);
                if ((b() && a() > 0 && this.f15642c.isViewValid() && (!booleanValue || this.f15644e == null)) || c() != 0) {
                    DataChannel dataChannel = this.f15641a;
                    if (c() != 0) {
                        i2 = c();
                    } else {
                        i2 = -1;
                    }
                    dataChannel.c(dy.class, Integer.valueOf(i2));
                }
            }
            if (sVar.f15147b) {
                str = "input_event";
            } else {
                str = "input_close";
            }
            String str2 = "translateY:" + sVar.f15146a;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "on_adjust_text_message_widget");
            hashMap.put("adjust_reason", str);
            if (str2 != null) {
                hashMap.put("adjust_param", str2);
            }
            i.b().a("ttlive_room", hashMap);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Float, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, View view, aq aqVar, h.f.a.b<? super Float, z> bVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(view, "");
        l.d(bVar, "");
        this.f15642c = aVar;
        this.f15641a = dataChannel;
        this.f15643d = view;
        this.f15644e = aqVar;
        this.f15645f = bVar;
        com.bytedance.android.livesdk.an.a.a().a(aVar, s.class, dataChannel).a(new c(new h.f.a.b<s, z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8640);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(s sVar) {
                s sVar2 = sVar;
                l.d(sVar2, "");
                ((b) this.receiver).onEvent(sVar2);
                return z.f158842a;
            }
        }));
    }
}
