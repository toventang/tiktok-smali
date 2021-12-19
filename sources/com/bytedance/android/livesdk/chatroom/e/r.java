package com.bytedance.android.livesdk.chatroom.e;

import androidx.lifecycle.i;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.util.rxutils.autodispose.a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.m;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.b;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public abstract class r<T extends bq> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    private f f15386a;
    public DataChannel w;
    public IMessageManager x;

    static {
        Covode.recordClassIndex(8504);
    }

    public final <D> m<D> t() {
        return e.a((androidx.lifecycle.m) this.y);
    }

    @Override // com.bytedance.ies.a.b
    public void b() {
        IMessageManager iMessageManager;
        if ((this instanceof OnMessageListener) && (iMessageManager = this.x) != null) {
            iMessageManager.removeMessageListener((OnMessageListener) this);
        }
        this.w = null;
        super.b();
    }

    /* access modifiers changed from: protected */
    public final <D> m<D> u() {
        if (this.f15386a == null) {
            this.f15386a = new f();
        }
        return e.a(a.a((androidx.lifecycle.m) this.y, i.a.ON_DESTROY), this.f15386a);
    }

    /* access modifiers changed from: protected */
    public final <D> m<D> v() {
        if (this.f15386a == null) {
            this.f15386a = new f();
        }
        return e.a(a.a((androidx.lifecycle.m) ((bq) this.y).getContext(), i.a.ON_DESTROY), this.f15386a);
    }

    public void a(T t) {
        super.a((com.bytedance.ies.a.a) t);
        if (t != null) {
            DataChannel provideDataChannel = t.provideDataChannel();
            this.w = provideDataChannel;
            if (provideDataChannel != null) {
                this.x = (IMessageManager) provideDataChannel.b(cg.class);
            }
        }
    }

    public final void a(Throwable th) {
        com.bytedance.android.live.core.c.a.a(6, getClass().getName(), th.getStackTrace());
    }
}
