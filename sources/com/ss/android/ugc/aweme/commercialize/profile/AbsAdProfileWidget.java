package com.ss.android.ugc.aweme.commercialize.profile;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public abstract class AbsAdProfileWidget extends Widget implements u<b>, au {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f75063a;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f75064h;

    /* renamed from: i  reason: collision with root package name */
    public String f75065i;

    static {
        Covode.recordClassIndex(46289);
    }

    public void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("AD_PROFILE_PARAMS", (u<b>) this);
        }
        DataCenter dataCenter2 = this.f67010e;
        if (dataCenter2 != null) {
            dataCenter2.a("AD_PROFILE_VISIBILITY_CHANGED", (u<b>) this);
        }
    }

    public final <T extends View> T a(int i2) {
        View view = this.f67009d;
        if (view != null) {
            return (T) view.findViewById(i2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void a(View view) {
        i iVar;
        super.a(view);
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null && (iVar = (i) dataCenter.a("AD_PROFILE_PARAMS")) != null) {
            a(iVar);
        }
    }

    public void a(i iVar) {
        l.d(iVar, "");
        this.f75063a = iVar.f75183a;
        this.f75064h = iVar.f75184b;
        this.f75065i = iVar.f75185c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        String str;
        i iVar;
        Boolean bool;
        b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1433406312) {
                if (hashCode == -322064775 && str.equals("AD_PROFILE_VISIBILITY_CHANGED") && (bool = (Boolean) bVar2.a()) != null) {
                    a(bool.booleanValue());
                }
            } else if (str.equals("AD_PROFILE_PARAMS") && (iVar = (i) bVar2.a()) != null) {
                a(iVar);
            }
        }
    }
}
