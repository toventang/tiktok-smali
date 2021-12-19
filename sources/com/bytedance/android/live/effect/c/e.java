package com.bytedance.android.live.effect.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.c.c;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.j.am;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class e extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9715c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<FilterModel> f9716a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f9717b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f9718d;

    static {
        Covode.recordClassIndex(4946);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4947);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f9718d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f9720b;

        static {
            Covode.recordClassIndex(4948);
        }

        b(e eVar, RecyclerView recyclerView) {
            this.f9719a = eVar;
            this.f9720b = recyclerView;
        }

        public final void run() {
            if (j.b.f9740a.c()) {
                int size = this.f9719a.f9716a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f9719a.f9716a.get(i2).isNew()) {
                        this.f9720b.b(i2);
                        j jVar = j.b.f9740a;
                        if (jVar.f9728a != null) {
                            for (FilterModel filterModel : jVar.f9728a) {
                                if (filterModel.getEffect() != null && filterModel.isNew()) {
                                    filterModel.setNew(false);
                                    jVar.a(filterModel.getEffect().getId(), filterModel.getEffect().getTagsUpdatedAt());
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            RecyclerView recyclerView = this.f9720b;
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.O;
            l.b(bVar, "");
            Integer a2 = bVar.a();
            l.b(a2, "");
            recyclerView.b(a2.intValue());
        }
    }

    static final class d extends m implements h.f.a.b<List<? extends FilterModel>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(4950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends FilterModel> list) {
            List<? extends FilterModel> list2 = list;
            l.d(list2, "");
            this.this$0.f9716a.clear();
            this.this$0.f9716a.addAll(list2);
            return z.f158842a;
        }
    }

    static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f9721a;

        static {
            Covode.recordClassIndex(4949);
        }

        c(e eVar) {
            this.f9721a = eVar;
        }

        @Override // com.bytedance.android.live.effect.c.c.a
        public final void a(int i2) {
            if (this.f9721a.f9717b != null) {
                DataChannel dataChannel = this.f9721a.f9717b;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.live.effect.l.class, this.f9721a.f9716a.get(i2));
                }
                if (p.c()) {
                    DataChannelGlobal.f34575d.a(com.bytedance.android.live.broadcast.api.c.class, true);
                    if (i2 == 0) {
                        DataChannelGlobal.f34575d.a(am.class, "");
                    } else {
                        DataChannelGlobal.f34575d.a(am.class, this.f9721a.f9716a.get(i2).getFilterId());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<FilterModel> list;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel a2 = f.a(this);
        this.f9717b = a2;
        List<FilterModel> list2 = this.f9716a;
        if (a2 == null || (list = (List) a2.b(com.bytedance.android.live.effect.e.class)) == null) {
            list = j.b.f9740a.f9728a;
            l.b(list, "");
        }
        list2.addAll(list);
        View findViewById = view.findViewById(R.id.dhm);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
            recyclerView.a(new i());
        }
        recyclerView.setAdapter(new c(getContext(), this.f9716a, new c(this)));
        recyclerView.post(new b(this, recyclerView));
        DataChannel dataChannel = this.f9717b;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.effect.e.class, (h.f.a.b) new d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b92, viewGroup, false);
    }
}
