package com.ss.android.ugc.aweme.commercialize.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.k.c;
import androidx.k.o;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import java.util.Iterator;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final int f75562a = R.id.gn;

    /* renamed from: b  reason: collision with root package name */
    public static final af f75563b = new af();

    private af() {
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f75564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f75565b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f75566c;

        static {
            Covode.recordClassIndex(46613);
        }

        public b(View view, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f75564a = view;
            this.f75565b = viewGroup;
            this.f75566c = viewGroup2;
        }

        public final void run() {
            af.a(this.f75565b, this.f75566c, this.f75564a);
        }
    }

    static {
        Covode.recordClassIndex(46611);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<Integer, View> {
        final /* synthetic */ ViewGroup $this_children;

        static {
            Covode.recordClassIndex(46612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewGroup viewGroup) {
            super(1);
            this.$this_children = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(Integer num) {
            return this.$this_children.getChildAt(num.intValue());
        }
    }

    public static h<View> b(ViewGroup viewGroup) {
        return k.e(n.t(h.j.h.a(0, viewGroup.getChildCount())), new a(viewGroup));
    }

    public static final void a(ViewGroup viewGroup) {
        int i2;
        if (viewGroup != null) {
            Iterator a2 = k.e(b(viewGroup)).a();
            while (true) {
                i2 = 8;
                if (!a2.hasNext()) {
                    break;
                }
                View view = (View) a2.next();
                Object tag = view.getTag(f75562a);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l2 = (Long) tag;
                if (l2 == null || l2.longValue() <= 0) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
            }
            Iterator<View> a3 = b(viewGroup).a();
            while (true) {
                if (a3.hasNext()) {
                    if (a3.next().getVisibility() == 0) {
                        i2 = 0;
                        break;
                    }
                } else {
                    break;
                }
            }
            viewGroup.setVisibility(i2);
        }
    }

    public static final void a(View view, AwemeTextLabelModel awemeTextLabelModel) {
        long j2;
        if (view != null) {
            if (awemeTextLabelModel != null) {
                j2 = h.g.a.b((double) (awemeTextLabelModel.getShowSeconds() * 1000.0f));
            } else {
                j2 = 0;
            }
            view.setTag(f75562a, Long.valueOf(j2));
        }
    }

    public static void a(ViewGroup viewGroup, View view, View view2) {
        long j2;
        l.d(view, "");
        l.d(view2, "");
        if (view2.getVisibility() != 0) {
            Object tag = view2.getTag(f75562a);
            if (!(tag instanceof Long)) {
                tag = null;
            }
            Long l2 = (Long) tag;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            view2.setVisibility(0);
            if (j2 <= 0 || view.getVisibility() != 0) {
                view2.setAlpha(1.0f);
                androidx.k.m[] mVarArr = {new c()};
                if (viewGroup != null) {
                    try {
                        o.a(viewGroup, mVarArr[0]);
                    } catch (NullPointerException unused) {
                    }
                }
                view.setVisibility(0);
                return;
            }
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(200).start();
        }
    }
}
