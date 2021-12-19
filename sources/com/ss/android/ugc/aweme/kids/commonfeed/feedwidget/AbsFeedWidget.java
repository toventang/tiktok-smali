package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a;

public abstract class AbsFeedWidget extends GenericWidget implements u<b> {

    /* renamed from: a  reason: collision with root package name */
    private a f106046a;

    static {
        Covode.recordClassIndex(67840);
    }

    /* access modifiers changed from: protected */
    public abstract a b(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f106046a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("feed_item_params_data", (u<b>) this).a("on_page_selected", (u<b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        a b2 = b(view);
        this.f106046a = b2;
        b2.b(this.f67010e);
        com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar = (com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a) this.f67010e.a("feed_item_params_data");
        if (aVar != null) {
            this.f106046a.a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    public final void a(b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            int hashCode = str.hashCode();
            if (hashCode == 350216171) {
                if (str.equals("on_page_selected")) {
                }
            } else if (hashCode == 1809593368 && str.equals("feed_item_params_data")) {
                com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar = (com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a) bVar.a();
                a aVar2 = this.f106046a;
                if (aVar2 != null) {
                    aVar2.a(aVar);
                }
            }
        }
    }
}
