package com.bytedance.android.livesdk.feed.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final /* synthetic */ class m implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final TabFeedViewModel f17724a;

    static {
        Covode.recordClassIndex(9837);
    }

    public m(TabFeedViewModel tabFeedViewModel) {
        this.f17724a = tabFeedViewModel;
    }

    @Override // com.bytedance.android.livesdk.feed.h.a
    public final void a() {
        int i2;
        TabFeedViewModel tabFeedViewModel = this.f17724a;
        if (!TextUtils.isEmpty(tabFeedViewModel.C)) {
            String str = null;
            try {
                str = Uri.parse(tabFeedViewModel.C).getQueryParameter("style");
            } catch (Exception unused) {
            }
            if ("5".equals(str)) {
                List e2 = tabFeedViewModel.f17697a.e();
                if (!b.a((Collection) e2)) {
                    int i3 = 0;
                    boolean z = true;
                    while (i3 < e2.size()) {
                        if (((FeedItem) e2.get(i3)).type == 6) {
                            if (i3 % 2 == 1) {
                                if (z) {
                                    if (i3 < e2.size() - 1) {
                                        i2 = i3 + 1;
                                        Collections.swap(e2, i3, i2);
                                    } else {
                                        Collections.swap(e2, i3, i3 - 1);
                                    }
                                }
                                z = !z;
                            } else {
                                if (!z) {
                                    if (i3 < e2.size() - 1) {
                                        i2 = i3 + 1;
                                        Collections.swap(e2, i3, i2);
                                    } else {
                                        Collections.swap(e2, i3, i3 - 1);
                                    }
                                }
                                z = !z;
                            }
                            i3 = i2;
                            z = !z;
                        }
                        i3++;
                    }
                }
            }
        }
    }
}
