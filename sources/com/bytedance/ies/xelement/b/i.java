package com.bytedance.ies.xelement.b;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class i extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private e f36703a;

    /* renamed from: b  reason: collision with root package name */
    private b f36704b;

    public interface a {
        static {
            Covode.recordClassIndex(22038);
        }

        i a(Context context);
    }

    public interface b {
        static {
            Covode.recordClassIndex(22039);
        }

        void b();
    }

    static {
        Covode.recordClassIndex(22037);
    }

    public final b getLifecycle() {
        return this.f36704b;
    }

    public final e getPlayer() {
        return this.f36703a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e eVar = this.f36703a;
        if (eVar != null) {
            eVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f36703a;
        if (eVar != null) {
            eVar.b();
        }
        b bVar = this.f36704b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void setLifecycle(b bVar) {
        this.f36704b = bVar;
    }

    public final void setPlayer(e eVar) {
        this.f36703a = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(Context context) {
        super(context, null, 0);
        l.c(context, "");
    }

    public /* synthetic */ i(Context context, byte b2) {
        this(context);
    }
}
