package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.e;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements h.a, com.ss.android.ugc.aweme.common.e.c<User> {

    /* renamed from: c  reason: collision with root package name */
    public static final C3398a f130315c = new C3398a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f130316a;

    /* renamed from: b  reason: collision with root package name */
    public f f130317b;

    /* renamed from: d  reason: collision with root package name */
    private PollStruct f130318d;

    /* renamed from: e  reason: collision with root package name */
    private int f130319e;

    /* renamed from: j  reason: collision with root package name */
    private View f130320j;

    /* renamed from: k  reason: collision with root package name */
    private RecyclerView f130321k;

    /* renamed from: l  reason: collision with root package name */
    private TuxStatusView f130322l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a f130323m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(85476);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<User> list, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a$a  reason: collision with other inner class name */
    public static final class C3398a {
        static {
            Covode.recordClassIndex(85477);
        }

        private C3398a() {
        }

        public /* synthetic */ C3398a(byte b2) {
            this();
        }

        public static a a(int i2, PollStruct pollStruct) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_state", i2);
            if (pollStruct != null) {
                bundle.putSerializable("key_poll", pollStruct);
            }
            a aVar = new a();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    static final /* synthetic */ class b extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(85478);
        }

        b(a aVar) {
            super(0, aVar, a.class, "tryToRefresh", "tryToRefresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((a) this.receiver).a();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar;
        if (ab_() && (aVar = this.f130323m) != null) {
            aVar.ag_();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e eVar = this.f130316a;
        if (eVar != null) {
            eVar.f130395b.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f130325b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f130326c;

        static {
            Covode.recordClassIndex(85479);
        }

        c(a aVar, d dVar, List list) {
            this.f130324a = aVar;
            this.f130325b = dVar;
            this.f130326c = list;
        }

        public final void run() {
            e eVar = this.f130324a.f130316a;
            if (eVar != null) {
                eVar.a(this.f130325b);
            }
            this.f130324a.a(this.f130326c, this.f130325b.f130348b);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (ab_()) {
            TuxStatusView tuxStatusView = this.f130322l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f130322l;
            if (tuxStatusView2 != null) {
                tuxStatusView2.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (ab_()) {
            TuxStatusView tuxStatusView = this.f130322l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f130322l;
            if (tuxStatusView2 != null) {
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string = getString(R.string.hdd);
                l.b(string, "");
                tuxStatusView2.setStatus(cVar.a((CharSequence) string));
            }
        }
    }

    public final void a() {
        PollStruct.OptionsBean optionsBean;
        PollStruct.OptionsBean optionsBean2;
        e eVar = this.f130316a;
        if (eVar != null) {
            PollStruct pollStruct = this.f130318d;
            if (pollStruct == null) {
                l.b();
            }
            long pollId = pollStruct.getPollId();
            long j2 = 0;
            if (this.f130319e == 0) {
                PollStruct pollStruct2 = this.f130318d;
                if (pollStruct2 == null) {
                    l.b();
                }
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (!(options == null || (optionsBean2 = options.get(0)) == null)) {
                    j2 = optionsBean2.getOptionId();
                }
            } else {
                PollStruct pollStruct3 = this.f130318d;
                if (pollStruct3 == null) {
                    l.b();
                }
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (!(options2 == null || (optionsBean = options2.get(1)) == null)) {
                    j2 = optionsBean.getOptionId();
                }
            }
            eVar.a(pollId, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        PollStruct.OptionsBean optionsBean;
        PollStruct.OptionsBean optionsBean2;
        if (this.f130318d == null) {
            f();
        }
        e eVar = this.f130316a;
        if (eVar != null) {
            PollStruct pollStruct = this.f130318d;
            if (pollStruct == null) {
                l.b();
            }
            long pollId = pollStruct.getPollId();
            long j2 = 0;
            if (this.f130319e == 0) {
                PollStruct pollStruct2 = this.f130318d;
                if (pollStruct2 == null) {
                    l.b();
                }
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (!(options == null || (optionsBean2 = options.get(0)) == null)) {
                    j2 = optionsBean2.getOptionId();
                }
            } else {
                PollStruct pollStruct3 = this.f130318d;
                if (pollStruct3 == null) {
                    l.b();
                }
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (!(options2 == null || (optionsBean = options2.get(1)) == null)) {
                    j2 = optionsBean.getOptionId();
                }
            }
            eVar.f130394a.getPollDetail(pollId, j2, eVar.f130396c.f130347a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new e.a(eVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar;
        if (ab_() && (aVar = this.f130323m) != null) {
            aVar.i();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        if (ab_()) {
            TuxStatusView tuxStatusView = this.f130322l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(0);
            }
            TuxStatusView tuxStatusView2 = this.f130322l;
            if (tuxStatusView2 != null) {
                tuxStatusView2.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c(), new b(this)));
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i2;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("key_state");
        } else {
            i2 = 0;
        }
        this.f130319e = i2;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.f130318d = (PollStruct) serializable;
        this.f130316a = new e(this, this.f130317b, this.f130319e);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<User> list, boolean z) {
        if (ab_()) {
            if (!z) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar = this.f130323m;
                if (aVar != null) {
                    aVar.ah_();
                }
            } else {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar2 = this.f130323m;
                if (aVar2 != null) {
                    aVar2.ai_();
                }
            }
            TuxStatusView tuxStatusView = this.f130322l;
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(8);
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar3 = this.f130323m;
            if (aVar3 != null) {
                aVar3.b_(list);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<User> list, boolean z) {
        List list2;
        if (ab_()) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar = this.f130323m;
            if (aVar != null) {
                aVar.d(false);
            }
            if (!z) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar2 = this.f130323m;
                if (aVar2 != null) {
                    aVar2.ah_();
                }
            } else {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar3 = this.f130323m;
                if (aVar3 != null) {
                    aVar3.ai_();
                }
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar4 = this.f130323m;
            if (aVar4 == null || (list2 = aVar4.e()) == null) {
                list2 = new ArrayList();
            }
            if (list != null && !list.isEmpty()) {
                list2.addAll(list);
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar5 = this.f130323m;
                if (aVar5 != null) {
                    aVar5.b(list2);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar6 = this.f130323m;
            if (aVar6 != null) {
                aVar6.d(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (com.bytedance.common.utility.collection.b.a((java.util.Collection) r3) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (com.bytedance.common.utility.collection.b.a((java.util.Collection) r3) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        b();
        r1 = r4.f130321k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        r1.post(new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a.c(r4, r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxStatusView tuxStatusView;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.bju, viewGroup, false);
        this.f130320j = a2;
        RecyclerView recyclerView = null;
        if (a2 != null) {
            tuxStatusView = (TuxStatusView) a2.findViewById(R.id.e_o);
        } else {
            tuxStatusView = null;
        }
        this.f130322l = tuxStatusView;
        if (a2 != null) {
            recyclerView = (RecyclerView) a2.findViewById(R.id.djv);
        }
        this.f130321k = recyclerView;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a();
        this.f130323m = aVar;
        aVar.a((h.a) this);
        RecyclerView recyclerView2 = this.f130321k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f130323m);
        }
        RecyclerView recyclerView3 = this.f130321k;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        return this.f130320j;
    }
}
