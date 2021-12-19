package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class AbsAdCardActionV2 extends AbsHalfWebPageActionV2 implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    protected int f75992a;

    /* renamed from: i  reason: collision with root package name */
    private int f75993i;

    static {
        Covode.recordClassIndex(46862);
    }

    public void a(d dVar) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(30, new g(AbsAdCardActionV2.class, "onEvent", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean a() {
        if (this.f75993i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public void onCreate() {
        CardStruct cardStruct;
        super.onCreate();
        EventBus.a(EventBus.a(), this);
        if (b.f73781b.a() != null) {
            cardStruct = b.f73781b.a().f(this.f76003c);
        } else {
            cardStruct = null;
        }
        if (c.a(cardStruct)) {
            this.f75992a = 2131232524;
        }
        if (this.f76003c.isLive()) {
            this.f75992a = 2131232525;
        }
        this.f76004d.a(this.f75992a);
    }

    @r
    public void onEvent(d dVar) {
        if (this.f76004d.d() != null && this.f76004d.d().hashCode() == dVar.f76064d) {
            this.f75993i = dVar.f76061a;
            a();
            j();
            a(dVar);
            if (dVar.f76063c != 1) {
                return;
            }
            if (a()) {
                d.f74778a.a(this.f76003c, 0);
            } else {
                d.f74778a.a(this.f76003c, 1);
            }
        }
    }

    public AbsAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
    }
}
