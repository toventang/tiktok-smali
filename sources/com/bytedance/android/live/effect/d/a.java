package com.bytedance.android.live.effect.d;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.live.effect.b.e;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<FilterModel> f9750a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public FilterModel f9751b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f9752c;

    /* renamed from: d  reason: collision with root package name */
    private final AdjustPercentBar f9753d;

    static {
        Covode.recordClassIndex(4966);
    }

    public final void a(FilterModel filterModel) {
        if (filterModel == null) {
            p.a(this.f9753d);
        } else if (filterModel.isNone()) {
            p.a(this.f9753d);
        } else {
            p.b(this.f9753d);
            this.f9753d.setPercent(e.a(filterModel.filterConfig.f9871a, filterModel.filterConfig.f9872b, j.b.f9740a.d(filterModel)));
            this.f9753d.a(100, 0, filterModel.filterConfig.f9873c, true);
        }
    }

    public a(final DataChannel dataChannel, Fragment fragment, AdjustPercentBar adjustPercentBar) {
        l.d(fragment, "");
        l.d(adjustPercentBar, "");
        this.f9752c = fragment;
        this.f9753d = adjustPercentBar;
        if (dataChannel != null) {
            dataChannel.b((m) fragment, com.bytedance.android.live.effect.e.class, (b) new b<List<? extends FilterModel>, z>(this) {
                /* class com.bytedance.android.live.effect.d.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(4967);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(List<? extends FilterModel> list) {
                    List<? extends FilterModel> list2 = list;
                    l.d(list2, "");
                    this.this$0.f9750a.addAll(list2);
                    a aVar = this.this$0;
                    List<FilterModel> list3 = aVar.f9750a;
                    com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
                    l.b(bVar, "");
                    Integer a2 = bVar.a();
                    l.b(a2, "");
                    aVar.f9751b = (FilterModel) n.b((List) list3, a2.intValue());
                    return z.f158842a;
                }
            }).a((m) fragment, com.bytedance.android.live.effect.l.class, (b) new b<FilterModel, z>(this) {
                /* class com.bytedance.android.live.effect.d.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(4968);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(FilterModel filterModel) {
                    FilterModel filterModel2 = filterModel;
                    l.d(filterModel2, "");
                    this.this$0.f9751b = filterModel2;
                    j.b.f9740a.a(dataChannel, this.this$0.f9750a.indexOf(filterModel2), false, true);
                    this.this$0.a(filterModel2);
                    return z.f158842a;
                }
            });
        }
    }
}
