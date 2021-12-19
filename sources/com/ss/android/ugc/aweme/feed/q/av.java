package com.ss.android.ugc.aweme.feed.q;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.a;
import com.ss.android.ugc.aweme.feed.u.t;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.feed.x.w;
import h.f.b.l;
import java.util.Date;
import java.util.List;

public final class av extends w implements t {
    public static String s = "FeedDeduplicate";

    /* renamed from: a  reason: collision with root package name */
    public Date f93774a;

    /* renamed from: b  reason: collision with root package name */
    public long f93775b;

    /* renamed from: c  reason: collision with root package name */
    public long f93776c;
    public int r;
    public a t;

    static {
        Covode.recordClassIndex(59663);
    }

    public av(String str) {
        super(str, 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.q.v, com.ss.android.ugc.aweme.feed.q.w, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.b.a.a.b
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        Date date = new Date();
        this.f93774a = date;
        this.f93775b = date.getTime();
        this.r = -1;
        if (b.a().a(true, "enable_feed_replace_unseen_video", 0) == 1) {
            this.N.a(new ViewPager.h() {
                /* class com.ss.android.ugc.aweme.feed.q.av.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(59664);
                }

                @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
                public final void onPageSelected(int i2) {
                    av.this.aE();
                    av.this.W.getCount();
                    av.this.aD().getAid();
                    av.this.f93776c = new Date().getTime();
                    if (i2 > av.this.r) {
                        long j2 = av.this.f93776c;
                        long j3 = av.this.f93775b;
                        List<Aweme> d2 = av.this.W.d();
                        l.d(d2, "");
                        if (j2 - j3 > 7200000 && !w.a(i2, d2)) {
                            av.this.t.f();
                        }
                    }
                    av.this.r = i2;
                    av avVar = av.this;
                    avVar.f93775b = avVar.f93776c;
                    super.onPageSelected(i2);
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.ss.android.ugc.aweme.common.e.d, com.ss.android.ugc.aweme.feed.q.a
    public final void a(List<Aweme> list, int i2) {
        if (this.W.getCount() == 0) {
            this.W.a(list);
        } else {
            this.W.a(list, i2);
        }
        if (i2 >= 0 && i2 < this.W.getCount()) {
            this.N.setCurrentItem(i2);
            Aweme c2 = this.W.c(i2);
            if (com.ss.android.ugc.aweme.story.d.a.c(c2)) {
                bf().a(c2, i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.t
    public final void d(List<Aweme> list, boolean z) {
        if (bD()) {
            this.aF.setRefreshing(false);
            this.W.f91652b = z;
            if (!z) {
                this.M.c();
            } else {
                this.M.d();
            }
            Aweme c2 = this.W.c(this.N.getCurrentItem());
            int count = this.W.getCount();
            list.size();
            int a2 = m.a(list, c2) + 1;
            w.a(list);
            for (int i2 = 0; i2 < count - a2 && a2 < list.size(); i2++) {
                list.get(a2).getAid();
                list.get(a2).getRequestId();
                list.remove(a2);
            }
            this.W.a(list);
            w.a(list);
            list.size();
        }
    }
}
