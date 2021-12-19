package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.d;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseProvider<T> extends BaseViewModel<T> implements b {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f40227b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public d f40228c;

    static {
        Covode.recordClassIndex(24795);
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    @Override // com.bytedance.lobby.internal.b
    public final d e() {
        return this.f40228c;
    }

    @Override // com.bytedance.lobby.internal.BaseViewModel
    public final /* bridge */ /* synthetic */ LiveData g() {
        return super.g();
    }

    @Override // com.bytedance.lobby.internal.b
    public final void f() {
        if (this.f40227b.compareAndSet(false, true)) {
            d();
        }
    }

    @Override // com.bytedance.lobby.internal.b
    public boolean t_() {
        String str = this.f40228c.f40176b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return e.f40247a;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    return e.f40251e;
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    return e.f40253g;
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    return e.f40250d;
                }
                break;
            case 28903346:
                if (!str.equals("instagram")) {
                    return false;
                }
                return true;
            case 323062851:
                if (str.equals("google_onetap")) {
                    return e.f40248b;
                }
                break;
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return e.f40252f;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    return e.f40249c;
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lobby.internal.BaseViewModel
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b(obj);
    }

    public BaseProvider(Application application, d dVar) {
        super(application);
        this.f40228c = dVar;
    }
}
