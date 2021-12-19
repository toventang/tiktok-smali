package com.ss.android.ugc.aweme.autoplay.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.autoplay.b.d;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends a {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f67280g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f67281h = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final Context f67282e;

    /* renamed from: f  reason: collision with root package name */
    public final g f67283f;

    /* renamed from: j  reason: collision with root package name */
    private final h f67284j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.flowfeed.a.a f67285k;

    static {
        Covode.recordClassIndex(41443);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41444);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ RecyclerView $mRecyclerView;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(41445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, RecyclerView recyclerView) {
            super(0);
            this.this$0 = eVar;
            this.$mRecyclerView = recyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a<com.bytedance.android.live.base.a.a>(this) {
                /* class com.ss.android.ugc.aweme.autoplay.b.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f67286a;

                static {
                    Covode.recordClassIndex(41446);
                }

                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final Class<com.bytedance.android.live.base.a.a> a() {
                    return com.bytedance.android.live.base.a.a.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f67286a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final /* synthetic */ void a(com.bytedance.android.live.base.a.a aVar) {
                    com.bytedance.android.live.base.a.a aVar2 = aVar;
                    l.d(aVar2, "");
                    if (this.f67286a.this$0.a().size() > 1 && e.f67280g) {
                        e.f67280g = false;
                        long j2 = aVar2.f7362a;
                        Iterator<T> it = this.f67286a.this$0.a().iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = 0;
                                break;
                            }
                            T next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                n.a();
                            }
                            User author = next.getAuthor();
                            if (author != null && author.roomId == j2) {
                                break;
                            }
                            i2 = i3;
                        }
                        RecyclerView.i layoutManager = this.f67286a.$mRecyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            linearLayoutManager.a(i2, 0);
                            linearLayoutManager.a(true);
                        }
                    }
                }
            };
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (a().size() == 1) {
            return 1;
        }
        return a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (getItemViewType(i2) == 1 && (viewHolder instanceof d)) {
            ((d) viewHolder).a(((a) this).f67240a, a().get(i2), this.f67242c, null, null);
        }
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2353);
        l.d(viewGroup, "");
        d a3 = d.a.a(viewGroup, eVar.f67285k, eVar.f67283f, eVar);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(2353);
        return a3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, com.ss.android.ugc.aweme.flowfeed.a.a aVar, g gVar, RecyclerView recyclerView) {
        super(recyclerView);
        l.d(context, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(recyclerView, "");
        this.f67282e = context;
        this.f67285k = aVar;
        this.f67283f = gVar;
        h a2 = i.a((h.f.a.a) new b(this, recyclerView));
        this.f67284j = a2;
        gVar.f96190g = new com.ss.android.ugc.aweme.autoplay.player.a(recyclerView, gVar);
        ae.f81066a.a((b.a) a2.getValue());
    }

    @Override // com.ss.android.ugc.aweme.autoplay.b.a
    public final void a(List<? extends Aweme> list, com.ss.android.ugc.aweme.discover.mixfeed.g gVar, Long l2, boolean z) {
        long j2;
        String str;
        l.d(list, "");
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            User author = t.getAuthor();
            long j3 = 0;
            if (author != null) {
                j2 = author.roomId;
            } else {
                j2 = 0;
            }
            arrayList.add(Long.valueOf(j2));
            User author2 = t.getAuthor();
            if (author2 != null) {
                j3 = author2.roomId;
            }
            User author3 = t.getAuthor();
            if (author3 == null || (str = author3.getUid()) == null) {
                str = "";
            }
            arrayList2.add(new RoomInfo(j3, str));
        }
        this.f67242c = new h(gVar, this.f67241b, list, arrayList, arrayList2, l2);
    }
}
