package com.ss.android.ugc.aweme.prop.c;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.challenge.g.h;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class c extends a<Aweme, b> {

    /* renamed from: b  reason: collision with root package name */
    public static int f118282b;

    /* renamed from: a  reason: collision with root package name */
    String f118283a;

    /* renamed from: c  reason: collision with root package name */
    public StickerPropApi f118284c = ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(StickerPropApi.class));

    /* renamed from: d  reason: collision with root package name */
    private int f118285d;

    static {
        Covode.recordClassIndex(76813);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).f118276a;
    }

    public c() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((b) this.mData).a()) && b.a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return m.a(getItems(), aweme, this.mNotifyListeners);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a((String) objArr[1], 0, ((Integer) objArr[2]).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new b();
        }
        ((b) this.mData).f118278c = 1;
        ((b) this.mData).f118276a = list;
    }

    public c(String str) {
        this.f118283a = str;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            j2 = ((b) this.mData).f118277b;
        }
        a(str, j2, ((Integer) objArr[2]).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        b bVar = (b) obj;
        if (bVar == null || (b.a((Collection) bVar.f118276a) && !bVar.a())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (bVar.f118276a != null) {
                int size = bVar.f118276a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme a2 = AwemeService.b().a(bVar.f118276a.get(i2));
                    a2.setIsTop(bVar.f118276a.get(i2).getIsTop());
                    RequestIdService.a().a(a2.getAid() + (this.f118285d + 10000), bVar.f118279d, i2);
                    bVar.f118276a.set(i2, a2);
                    if (bVar.f118280e != null) {
                        ac.a.f91473a.a(bVar.f118279d, bVar.f118280e);
                    }
                }
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = bVar;
            } else if (i3 == 4) {
                if (bVar.f118276a != null) {
                    if (b.a((Collection) ((b) this.mData).f118276a)) {
                        ((b) this.mData).f118276a = bVar.f118276a;
                    } else {
                        h.a(((b) this.mData).f118276a, bVar.f118276a, d.f118290a);
                    }
                }
                ((b) this.mData).f118277b = bVar.f118277b;
                ((b) this.mData).f118278c = bVar.f118278c & ((b) this.mData).f118278c;
            }
        } else if (this.mData != null) {
            ((b) this.mData).f118278c = 0;
        }
    }

    private void a(final String str, final long j2, int i2) {
        if (!in.d()) {
            this.f118285d = i2;
            n.a().a(this.mHandler, new Callable() {
                /* class com.ss.android.ugc.aweme.prop.c.c.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f118288c = 20;

                static {
                    Covode.recordClassIndex(76814);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (TextUtils.equals(c.this.f118283a, "from_sticker_master_profile")) {
                        return c.this.f118284c.queryStickerAwemeList(str, j2, this.f118288c, 1, c.f118282b).get();
                    }
                    return c.this.f118284c.queryStickerAwemeList(str, j2, this.f118288c, c.f118282b).get();
                }
            }, 0);
        }
    }
}
