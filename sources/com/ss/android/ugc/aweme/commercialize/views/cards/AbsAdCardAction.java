package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.service.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class AbsAdCardAction extends AbsHalfWebPageAction implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    protected int f75990a;

    /* renamed from: i  reason: collision with root package name */
    private int f75991i;

    static {
        Covode.recordClassIndex(46861);
    }

    public void a(d dVar) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(30, new g(AbsAdCardAction.class, "onEvent", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean a() {
        if (this.f75991i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public void onCreate() {
        super.onCreate();
        EventBus.a(EventBus.a(), this);
        if (c.a(b.e(this.f75996c))) {
            this.f75990a = 2131232524;
        }
        if (this.f75996c.isLive()) {
            this.f75990a = 2131232525;
        }
        this.f75997d.a(this.f75990a);
    }

    @r
    public void onEvent(d dVar) {
        if (this.f75997d.d() != null && this.f75997d.d().hashCode() == dVar.f76064d) {
            this.f75991i = dVar.f76061a;
            a();
            j();
            a(dVar);
            if (dVar.f76063c != 1) {
                return;
            }
            if (a()) {
                a.f75270a.a().a(this.f75996c, 0);
            } else {
                a.f75270a.a().a(this.f75996c, 1);
            }
        }
    }

    public AbsAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
    }
}
