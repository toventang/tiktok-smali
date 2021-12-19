package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.model.message.aw;
import com.bytedance.android.livesdk.model.message.v;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class ad implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.a f22691a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public Room f22692b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22693c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22694d;

    /* renamed from: e  reason: collision with root package name */
    public a f22695e;

    /* renamed from: f  reason: collision with root package name */
    public DataChannel f22696f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22697g;

    public interface a {
        static {
            Covode.recordClassIndex(13388);
        }

        void a(aw awVar);

        void a(v vVar);

        void a(y yVar);

        void a(y yVar, boolean z);
    }

    static {
        Covode.recordClassIndex(13387);
    }

    public final void onEvent(com.bytedance.android.livesdkapi.f.a aVar) {
        if (aVar.f23199b == 3) {
            this.f22697g = true;
        } else if (aVar.f23199b == 4) {
            this.f22697g = false;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        a aVar = this.f22695e;
        if (aVar != null) {
            if (iMessage instanceof y) {
                y yVar = (y) iMessage;
                if (!(yVar.u == null || yVar.u.mDynamicImg == null)) {
                    k.a(yVar.u.mDynamicImg);
                }
                a aVar2 = this.f22695e;
                if (this.f22693c || !this.f22697g) {
                    z = false;
                } else {
                    z = true;
                }
                aVar2.a(yVar, z);
            } else if (iMessage instanceof aw) {
                aVar.a((aw) iMessage);
            } else if (iMessage instanceof v) {
                aVar.a((v) iMessage);
            }
        }
    }
}
