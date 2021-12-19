package com.ss.android.ugc.aweme.comment.widgets;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.p;

public abstract class BaseCommentWidget extends Widget implements u<b>, au {

    /* renamed from: a  reason: collision with root package name */
    protected Aweme f73047a;

    /* renamed from: h  reason: collision with root package name */
    protected h f73048h;

    static {
        Covode.recordClassIndex(44990);
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    public final Aweme e() {
        Aweme aweme = this.f73047a;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        if (this.f73047a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        if (this.f73048h != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f67010e.a(this);
    }

    /* access modifiers changed from: protected */
    public final String h() {
        if (!g()) {
            return "";
        }
        h hVar = this.f73048h;
        if (hVar == null) {
            l.a("params");
        }
        String eventType = hVar.getEventType();
        l.b(eventType, "");
        return eventType;
    }

    /* access modifiers changed from: protected */
    public final String i() {
        if (!g()) {
            return "";
        }
        h hVar = this.f73048h;
        if (hVar == null) {
            l.a("params");
        }
        String enterFrom = hVar.getEnterFrom();
        l.b(enterFrom, "");
        return enterFrom;
    }

    /* access modifiers changed from: protected */
    public final Integer j() {
        if (!g()) {
            return null;
        }
        h hVar = this.f73048h;
        if (hVar == null) {
            l.a("params");
        }
        return Integer.valueOf(hVar.getPageType());
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        k();
        this.f67010e.a("comment_visible", this, true).a("comment_aweme_and_params", this, true);
    }

    protected static final class a<T extends View> {

        /* renamed from: a  reason: collision with root package name */
        public T f73049a;

        /* renamed from: b  reason: collision with root package name */
        public final int f73050b;

        static {
            Covode.recordClassIndex(44991);
        }

        public a(int i2) {
            this.f73050b = i2;
        }

        public final T a(BaseCommentWidget baseCommentWidget, h.k.i<?> iVar) {
            l.d(baseCommentWidget, "");
            l.d(iVar, "");
            if (this.f73049a == null) {
                T t = (T) baseCommentWidget.f67009d.findViewById(this.f73050b);
                if (t == null) {
                    l.b();
                }
                this.f73049a = t;
            }
            T t2 = this.f73049a;
            if (t2 == null) {
                l.a("_value");
            }
            return t2;
        }
    }

    protected static <T extends View> a<T> a(int i2) {
        return new a<>(i2);
    }

    protected static void a(View... viewArr) {
        l.d(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    protected static void b(View... viewArr) {
        l.d(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onChanged(b bVar) {
        Boolean bool;
        p pVar;
        Aweme aweme;
        h hVar;
        if (bVar != null) {
            String str = bVar.f67014a;
            int hashCode = str.hashCode();
            if (hashCode != 278836882) {
                if (hashCode == 2016314694 && str.equals("comment_aweme_and_params") && (pVar = (p) bVar.a()) != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                    this.f73047a = aweme;
                    p pVar2 = (p) bVar.a();
                    if (pVar2 != null && (hVar = (h) pVar2.getSecond()) != null) {
                        this.f73048h = hVar;
                    }
                }
            } else if (str.equals("comment_visible") && (bool = (Boolean) bVar.a()) != null) {
                bool.booleanValue();
            }
        }
    }
}
