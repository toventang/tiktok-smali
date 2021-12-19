package com.bytedance.android.livesdk.chatroom.ui.b;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.c.ac;
import com.bytedance.android.livesdk.chatroom.model.o;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class a extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final C0330a f15922b = new C0330a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    d f15923a;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.b<? super av, z> f15924c = new d(this);

    /* renamed from: d  reason: collision with root package name */
    private HashMap f15925d;

    static {
        Covode.recordClassIndex(8806);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f15925d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f15925d == null) {
            this.f15925d = new HashMap();
        }
        View view = (View) this.f15925d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f15925d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a$a  reason: collision with other inner class name */
    public static final class C0330a {
        static {
            Covode.recordClassIndex(8807);
        }

        private C0330a() {
        }

        public /* synthetic */ C0330a(byte b2) {
            this();
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7t);
        bVar.f22380g = 80;
        bVar.f22383j = 50;
        return bVar;
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15927a;

        static {
            Covode.recordClassIndex(8809);
        }

        c(a aVar) {
            this.f15927a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f15927a.a_(R.id.ebj)).a("ERROR");
            com.bytedance.android.live.core.c.a.a(6, "LiveStickerPropsDialog", "failed to fetch stickers!");
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15926a;

        static {
            Covode.recordClassIndex(8808);
        }

        b(a aVar) {
            this.f15926a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = this.f15926a;
            Object obj2 = ((com.bytedance.android.live.network.response.d) obj).data;
            l.b(obj2, "");
            o oVar = (o) obj2;
            ((StateLayout) aVar.a_(R.id.ebj)).a("CONTENT");
            d dVar = aVar.f15923a;
            if (dVar == null) {
                l.a("mAdapter");
            }
            List<? extends av> list = oVar.f15798b;
            if (list != null) {
                dVar.f15931a.addAll(list);
            }
            dVar.notifyDataSetChanged();
        }
    }

    static final class d extends m implements h.f.a.b<av, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(8810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(av avVar) {
            av avVar2;
            av avVar3 = avVar;
            l.d(avVar3, "");
            com.bytedance.android.livesdk.an.a.a().a(new ac(avVar3));
            DataChannel dataChannel = this.this$0.p;
            DataChannel dataChannel2 = this.this$0.p;
            if (dataChannel2 != null) {
                avVar2 = (av) dataChannel2.b(com.bytedance.android.live.c.d.class);
            } else {
                avVar2 = null;
            }
            c.a(dataChannel, avVar2);
            c.f15928a = SystemClock.elapsedRealtime();
            DataChannel dataChannel3 = this.this$0.p;
            if (dataChannel3 != null) {
                dataChannel3.a(com.bytedance.android.live.c.d.class, avVar3);
            }
            int i2 = avVar3.f19005g;
            if (i2 == 1) {
                b.a.a("livesdk_live_character_prop_select").a(this.this$0.p).a("prop_id", avVar3.f19006h).a("words", avVar3.f19002d).b();
            } else if (i2 == 2) {
                b.a.a("livesdk_live_picture_prop_select").a(this.this$0.p).a("prop_id", avVar3.f19006h).b();
            }
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f15923a = new d(this.f15924c);
        RecyclerView recyclerView = (RecyclerView) a_(R.id.dd5);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        d dVar = this.f15923a;
        if (dVar == null) {
            l.a("mAdapter");
        }
        recyclerView.setAdapter(dVar);
        recyclerView.a(new b());
        ((StateLayout) a_(R.id.ebj)).a("LOADING");
        getContext();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = d();
        }
        if (!j.f107226e) {
            ((StateLayout) a_(R.id.ebj)).a("OFFLINE");
        } else {
            ((DecorationApi) e.a().a(DecorationApi.class)).fetchStickerList().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new b(this), new c(this));
        }
    }
}
