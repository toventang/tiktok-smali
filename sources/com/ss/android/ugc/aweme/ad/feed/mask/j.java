package com.ss.android.ugc.aweme.ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.view.AdTagGroup;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class j extends d {
    static {
        Covode.recordClassIndex(40590);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void c() {
        String[] appCategory;
        AwemeRawAd awemeRawAd = this.f65977b.getAwemeRawAd();
        if (!(awemeRawAd == null || (appCategory = awemeRawAd.getAppCategory()) == null)) {
            View findViewById = a(this.f65980e, R.layout.afk).findViewById(R.id.gq);
            l.b(findViewById, "");
            AdTagGroup adTagGroup = (AdTagGroup) findViewById;
            if (appCategory.length == 0) {
                adTagGroup.setVisibility(8);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : appCategory) {
                    if (str.length() <= 6) {
                        arrayList.add(str);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                l.b(array, "");
                adTagGroup.setTagList((String[]) array);
            }
            adTagGroup.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.gq) {
            this.f65978c.a(15);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(LinearLayout linearLayout, c cVar) {
        super(linearLayout, cVar);
        l.d(linearLayout, "");
        l.d(cVar, "");
    }
}
