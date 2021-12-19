package com.ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.i.a;
import com.ss.android.ugc.aweme.detail.i.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;

public class e implements aa {

    /* renamed from: a  reason: collision with root package name */
    protected a f79802a = new a(1);

    /* renamed from: b  reason: collision with root package name */
    private String f79803b;

    /* renamed from: c  reason: collision with root package name */
    private b f79804c = new b();

    static {
        Covode.recordClassIndex(49639);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public int getPageType(int i2) {
        return i2 + 3000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public Object getViewModel() {
        return this.f79802a;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isLoading() {
        return this.f79804c.j();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void unInit() {
        this.f79804c.cd_();
        this.f79804c.h();
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isDataEmpty() {
        if (this.f79802a.mData == null || com.bytedance.common.utility.collection.b.a((Collection) this.f79802a.mData.f79632a)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void bindView(ad adVar) {
        this.f79804c.a_(adVar);
        this.f79804c.a(this.f79802a);
    }

    public e(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "[" + str + "]";
        }
        this.f79803b = str2;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean deleteItem(String str) {
        Aweme b2 = AwemeService.b().b(str);
        if (b2 == null) {
            b2 = AwemeService.b().a(str);
        }
        if (b2 == null) {
            return false;
        }
        b bVar = this.f79804c;
        if (bVar.f76396h == null || bVar.f76396h.mData == null || bVar.f76396h.mData.f79632a == null || !bVar.f76396h.mData.f79632a.remove(b2)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        this.f79804c.a(this.f79803b, bVar.getPushParams(), bVar.getEventType());
    }
}
