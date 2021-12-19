package com.ss.android.ugc.aweme.notification.adapter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class GroupFilterViewHolder extends PowerCell<f> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f113126a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private View f113127b;

    /* renamed from: j  reason: collision with root package name */
    private TuxIconView f113128j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f113129k;

    /* renamed from: l  reason: collision with root package name */
    private TuxIconView f113130l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f113131m;

    static {
        Covode.recordClassIndex(72735);
    }

    private final FilterViewModel a() {
        return (FilterViewModel) this.f113126a.getValue();
    }

    static final class a extends m implements h.f.a.a<FilterViewModel> {
        final /* synthetic */ GroupFilterViewHolder this$0;

        static {
            Covode.recordClassIndex(72736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupFilterViewHolder groupFilterViewHolder) {
            super(0);
            this.this$0 = groupFilterViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FilterViewModel invoke() {
            return PowerCell.a(this.this$0, FilterViewModel.class);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupFilterViewHolder f113132a;

        static {
            Covode.recordClassIndex(72737);
        }

        b(GroupFilterViewHolder groupFilterViewHolder) {
            this.f113132a = groupFilterViewHolder;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            f fVar = (f) this.f113132a.f34234d;
            if (fVar != null) {
                GroupFilterViewHolder groupFilterViewHolder = this.f113132a;
                l.b(num, "");
                groupFilterViewHolder.a(fVar, num.intValue());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.notice.repo.list.bean.f r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.f r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.f) r3
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            com.ss.android.ugc.aweme.notification.adapter.FilterViewModel r0 = r2.a()
            if (r0 == 0) goto L_0x0029
            androidx.lifecycle.t r0 = r0.a()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x001e
        L_0x001b:
            h.f.b.l.b()
        L_0x001e:
            h.f.b.l.b(r0, r1)
            int r0 = r0.intValue()
            r2.a(r3, r0)
            return
        L_0x0029:
            r0 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder.a(com.bytedance.ies.powerlist.b.a):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T extends com.bytedance.ies.powerlist.b.a, java.lang.Object] */
    public final void onClick(View view) {
        FilterViewModel a2;
        ClickAgent.onClick(view);
        f fVar = (f) this.f34234d;
        if (fVar != null) {
            int i2 = fVar.f112856a;
            FilterViewModel a3 = a();
            if (a3 != null) {
                a3.a().postValue(Integer.valueOf(i2));
            }
        }
        T t = this.f34234d;
        if (t != 0 && (a2 = a()) != null) {
            l.d(t, "");
            a2.b().postValue(t);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        FilterViewModel a2;
        t<Integer> a3;
        l.d(viewGroup, "");
        View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.kz, viewGroup, false);
        View findViewById = a4.findViewById(R.id.a6q);
        l.b(findViewById, "");
        this.f113127b = findViewById;
        View findViewById2 = a4.findViewById(R.id.bhz);
        l.b(findViewById2, "");
        this.f113128j = (TuxIconView) findViewById2;
        View findViewById3 = a4.findViewById(R.id.f3r);
        l.b(findViewById3, "");
        this.f113129k = (TextView) findViewById3;
        View findViewById4 = a4.findViewById(R.id.bi0);
        l.b(findViewById4, "");
        this.f113130l = (TuxIconView) findViewById4;
        View findViewById5 = a4.findViewById(R.id.bzg);
        l.b(findViewById5, "");
        this.f113131m = (ImageView) findViewById5;
        if (Build.VERSION.SDK_INT >= 23) {
            View view = this.f113127b;
            if (view == null) {
                l.a("mVRoot");
            }
            View view2 = this.f113127b;
            if (view2 == null) {
                l.a("mVRoot");
            }
            view.setForeground(view2.getResources().getDrawable(R.drawable.ol));
        } else {
            View view3 = this.f113127b;
            if (view3 == null) {
                l.a("mVRoot");
            }
            com.ss.android.ugc.aweme.notification.g.a.a(view3);
        }
        a4.setOnClickListener(this);
        androidx.lifecycle.m i2 = i();
        if (!(i2 == null || (a2 = a()) == null || (a3 = a2.a()) == null)) {
            a3.observe(i2, new b(this));
        }
        l.b(a4, "");
        return a4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r0 > r5) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        if (com.ss.android.ugc.aweme.notice.api.b.c(82) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0125, code lost:
        if (r0 > r5) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (com.ss.android.ugc.aweme.notice.api.b.c(82) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.f r11, int r12) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.GroupFilterViewHolder.a(com.ss.android.ugc.aweme.notice.repo.list.bean.f, int):void");
    }
}
