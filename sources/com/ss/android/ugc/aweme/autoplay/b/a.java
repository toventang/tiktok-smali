package com.ss.android.ugc.aweme.autoplay.b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.live.b;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public String f67240a = "";

    /* renamed from: b  reason: collision with root package name */
    public r f67241b;

    /* renamed from: c  reason: collision with root package name */
    public h f67242c;

    /* renamed from: d  reason: collision with root package name */
    public List<b> f67243d = new ArrayList();

    static {
        Covode.recordClassIndex(41411);
    }

    public abstract void a(List<? extends Aweme> list, com.ss.android.ugc.aweme.discover.mixfeed.g gVar, Long l2, boolean z);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(RecyclerView recyclerView) {
        super(recyclerView);
        l.d(recyclerView, "");
    }

    public static /* synthetic */ void a(a aVar, List list, com.ss.android.ugc.aweme.discover.mixfeed.g gVar, Long l2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            gVar = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        aVar.a(list, gVar, l2, z);
    }
}
