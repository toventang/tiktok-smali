package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.Map;

public abstract class d implements IFrameSlot {

    /* renamed from: e  reason: collision with root package name */
    public static final a f87834e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public PopupCardVO f87835a;

    /* renamed from: b  reason: collision with root package name */
    public View f87836b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<z> f87837c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super String, z> f87838d;

    static {
        Covode.recordClassIndex(55237);
    }

    public void a(Context context, boolean z, String str, Map<String, String> map) {
        l.d(context, "");
        l.d(str, "");
    }

    public abstract void a(com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar);

    public abstract void a(h.f.a.a<z> aVar);

    public abstract void a(b<? super String, z> bVar);

    public void a(String str) {
        l.d(str, "");
    }

    public abstract View b(Context context);

    public void b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
    }

    public abstract void c();

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55238);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View a(Context context) {
        l.d(context, "");
        View b2 = b(context);
        this.f87836b = b2;
        h.f.a.a<z> aVar = this.f87837c;
        if (aVar != null) {
            aVar.invoke();
        }
        return b2;
    }

    public final void a(PopupCardVO popupCardVO) {
        this.f87835a = popupCardVO;
        c();
    }
}
