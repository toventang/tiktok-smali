package com.ss.android.ugc.aweme.autoplay.d;

import androidx.core.g.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.a.f;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.ss.android.ugc.aweme.utils.gh;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class g extends RecyclerView.a<RecyclerView.ViewHolder> implements a {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends Aweme> f67399a = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f67400i;

    static {
        Covode.recordClassIndex(41505);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.g.a
    public boolean e() {
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public List<Aweme> a() {
        return this.f67399a;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a
    public void b() {
        int childCount;
        if (this.f67400i.getLayoutManager() != null && (childCount = this.f67400i.getChildCount()) > 0) {
            int i2 = 0;
            do {
                RecyclerView recyclerView = this.f67400i;
                RecyclerView.ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
                if (a2 instanceof b.c) {
                    ((b.c) a2).e();
                }
                i2++;
            } while (i2 < childCount);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a
    public void c() {
        int childCount;
        if (this.f67400i.getLayoutManager() != null && (childCount = this.f67400i.getChildCount()) > 0) {
            int i2 = 0;
            do {
                RecyclerView recyclerView = this.f67400i;
                RecyclerView.ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
                if (a2 instanceof b.c) {
                    ((b.c) a2).f();
                }
                i2++;
            } while (i2 < childCount);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a
    public final boolean d() {
        int childCount;
        if (this.f67400i.getLayoutManager() == null || (childCount = this.f67400i.getChildCount()) <= 0) {
            return false;
        }
        int i2 = 0;
        do {
            RecyclerView recyclerView = this.f67400i;
            RecyclerView.ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
            if ((a2 instanceof b.c) && ((b.c) a2).h()) {
                return true;
            }
            i2++;
        } while (i2 < childCount);
        return false;
    }

    public void a(List<? extends Aweme> list) {
        l.d(list, "");
        this.f67399a = list;
        notifyDataSetChanged();
    }

    public g(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f67400i = recyclerView;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.b
    public void a(Aweme aweme) {
        String str;
        if (this.f67400i.getLayoutManager() != null) {
            e<Integer, Integer> a2 = gh.a(this.f67400i);
            if (a2.f2397a != null && a2.f2398b != null) {
                F f2 = a2.f2397a;
                if (f2 == null) {
                    l.b();
                }
                int intValue = f2.intValue();
                S s = a2.f2398b;
                if (s == null) {
                    l.b();
                }
                l.b(s, "");
                int intValue2 = s.intValue();
                if (intValue <= intValue2) {
                    while (true) {
                        if (intValue >= 0 && intValue < a().size()) {
                            Aweme aweme2 = a().get(intValue);
                            String str2 = null;
                            if (aweme2.getAid() != null) {
                                String aid = aweme2.getAid();
                                if (aweme != null) {
                                    str = aweme.getAid();
                                } else {
                                    str = null;
                                }
                                if (!l.a((Object) aid, (Object) str)) {
                                    RecyclerView.ViewHolder f3 = this.f67400i.f(intValue);
                                    if (f3 instanceof b.c) {
                                        ((b.c) f3).e();
                                    }
                                }
                            }
                            String aid2 = aweme2.getAid();
                            if (aweme != null) {
                                str2 = aweme.getAid();
                            }
                            if (l.a((Object) aid2, (Object) str2)) {
                                RecyclerView.ViewHolder f4 = this.f67400i.f(intValue);
                                if (f4 instanceof f) {
                                    LinearGradientDraweeView linearGradientDraweeView = ((f) f4).o;
                                    l.b(linearGradientDraweeView, "");
                                    linearGradientDraweeView.setVisibility(8);
                                }
                            }
                        }
                        if (intValue != intValue2) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
