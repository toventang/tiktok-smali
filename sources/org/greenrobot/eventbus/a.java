package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class a implements Runnable, q {

    /* renamed from: a  reason: collision with root package name */
    private final p f159785a = new p();

    /* renamed from: b  reason: collision with root package name */
    private final EventBus f159786b;

    static {
        Covode.recordClassIndex(106467);
    }

    public void run() {
        o a2 = this.f159785a.a();
        if (a2 != null) {
            this.f159786b.a(a2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }

    a(EventBus eventBus) {
        this.f159786b = eventBus;
    }

    @Override // org.greenrobot.eventbus.q
    public final void a(v vVar, Object obj) {
        this.f159785a.a(o.a(vVar, obj));
        this.f159786b.f159773g.execute(this);
    }
}
