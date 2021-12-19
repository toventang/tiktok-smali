package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.e;
import java.util.Map;

public abstract class a {

    /* renamed from: d  reason: collision with root package name */
    public Aweme f106099d;

    /* renamed from: e  reason: collision with root package name */
    protected DataCenter f106100e;

    /* renamed from: f  reason: collision with root package name */
    protected final Context f106101f;

    /* renamed from: g  reason: collision with root package name */
    protected final View f106102g;

    /* renamed from: h  reason: collision with root package name */
    protected Fragment f106103h;

    /* renamed from: i  reason: collision with root package name */
    public String f106104i;

    static {
        Covode.recordClassIndex(67865);
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(View view);

    /* access modifiers changed from: protected */
    public abstract void a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        if (this.f106099d != null) {
            c a2 = new c().a("widget_name", b()).a("enter_from", this.f106104i).a("group_id", this.f106099d.getAid()).a("author_id", this.f106099d.getAuthorUid()).a("log_pb", this.f106099d.getLogPbString());
            Map<String, String> c2 = c();
            if (c2 != null) {
                for (Map.Entry<String, String> entry : c2.entrySet()) {
                    a2.a(entry.getKey(), entry.getValue());
                }
            }
            e.a(b(), a2.a());
        }
    }

    public final void b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f106100e = dataCenter;
            a(dataCenter);
        }
    }

    public a(View view) {
        this.f106101f = view.getContext();
        this.f106102g = view;
        view.setOnClickListener(new b(this));
        a(view);
    }

    public void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
        if (aVar != null) {
            this.f106099d = aVar.f106096a;
            this.f106103h = aVar.f106097b;
            this.f106104i = aVar.f106098c;
        }
    }
}
