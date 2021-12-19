package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.u;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class d extends a implements com.bytedance.im.core.i.c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f102013c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final am f102014a;

    /* renamed from: b  reason: collision with root package name */
    public final ah f102015b;

    /* renamed from: d  reason: collision with root package name */
    private final h f102016d;

    /* renamed from: e  reason: collision with root package name */
    private final TuxStatusView.c f102017e;

    /* renamed from: f  reason: collision with root package name */
    private final TuxStatusView f102018f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.a<z> f102019g;

    /* renamed from: h  reason: collision with root package name */
    private final ah f102020h;

    static {
        Covode.recordClassIndex(65278);
    }

    private final List<com.bytedance.im.core.d.h> m() {
        return (List) this.f102016d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65280);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<List<com.bytedance.im.core.d.h>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102022a = new b();

        static {
            Covode.recordClassIndex(65281);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.bytedance.im.core.d.h> invoke() {
            return new ArrayList();
        }
    }

    public final void l() {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("chat_cnt", e().size());
        List e2 = e();
        l.b(e2, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : e2) {
            com.ss.android.ugc.aweme.im.service.k.a aVar = (com.ss.android.ugc.aweme.im.service.k.a) obj;
            l.b(aVar, "");
            if (aVar.q > 0) {
                arrayList.add(obj);
            }
        }
        r.a("message_box_status", a2.a("unread_chat_cnt", arrayList.size()).f66730a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d$d  reason: collision with other inner class name */
    public static final class C2548d implements h.f.a.b<List<g>, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f102023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f102024b;

        static {
            Covode.recordClassIndex(65284);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<g> list) {
            a(list);
            return z.f158842a;
        }

        public final void a(List<g> list) {
            l.d(list, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", "onLoadMore invoke: " + this.f102023a.e().size() + ", " + list.size());
            this.f102023a.d(this.f102024b);
            if (!this.f102024b) {
                this.f102023a.ah_();
                this.f102023a.l();
            } else {
                this.f102023a.ai_();
            }
            this.f102023a.e().addAll(list);
            d dVar = this.f102023a;
            dVar.b(dVar.e());
        }

        C2548d(d dVar, boolean z) {
            this.f102023a = dVar;
            this.f102024b = z;
        }
    }

    public static List<g> e(List<? extends com.bytedance.im.core.d.h> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g b2 = b((com.bytedance.im.core.d.h) it.next());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.im.core.i.c
    public final void a(List<com.bytedance.im.core.d.h> list) {
        Integer num;
        StringBuilder append = new StringBuilder("onQuery: ").append(e().size()).append(", ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", append.append(num).toString());
        if (list != null) {
            m().addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $lastIdList;
        final /* synthetic */ List $list;
        final /* synthetic */ C2548d $notifyBlock;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(65282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, List list, List list2, C2548d dVar2, h.c.d dVar3) {
            super(2, dVar3);
            this.this$0 = dVar;
            this.$lastIdList = list;
            this.$list = list2;
            this.$notifyBlock = dVar2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, this.$lastIdList, this.$list, this.$notifyBlock, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ListIterator listIterator;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                List list = this.$lastIdList;
                List list2 = this.$list;
                if (!(list2 == null || (listIterator = list2.listIterator()) == null)) {
                    while (listIterator.hasNext()) {
                        com.bytedance.im.core.d.h hVar = (com.bytedance.im.core.d.h) listIterator.next();
                        if (list.contains(hVar.getConversationId())) {
                            com.ss.android.ugc.aweme.im.service.m.a.e("StrangerListAdapter", "filter: " + hVar.getConversationId());
                            listIterator.remove();
                        }
                    }
                }
                final List<g> e2 = d.e(this.$list);
                ah ahVar = this.this$0.f102015b;
                AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.d.c.AnonymousClass1 */
                    int label;
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(65283);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        private static g b(com.bytedance.im.core.d.h hVar) {
                            g gVar = null;
                            if (hVar == null) {
                                return null;
                            }
                            if (!hVar.isStranger() || !hVar.isSingleChat()) {
                                com.ss.android.ugc.aweme.im.service.m.a.e("StrangerListAdapter", "convert not stranger: " + (hVar.getConversationId() + ", " + hVar.isStranger() + ", " + hVar.isSingleChat()));
                                return null;
                            }
                            com.ss.android.ugc.aweme.im.service.k.a a2 = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(hVar);
                            if (a2 instanceof g) {
                                gVar = a2;
                            }
                            return gVar;
                        }

                        @Override // com.bytedance.im.core.i.c
                        public final void a(u uVar) {
                            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", "onRefreshFailed: " + uVar + ", localSize=" + m().size());
                            if (!m().isEmpty()) {
                                a(m(), false);
                                return;
                            }
                            e().clear();
                            if (this.v) {
                                d(false);
                                notifyDataSetChanged();
                            }
                            this.f102018f.setVisibility(0);
                            this.f102018f.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), this.f102019g));
                        }

                        @Override // com.bytedance.im.core.i.c
                        public final void a(com.bytedance.im.core.d.h hVar) {
                            String str;
                            String conversationId;
                            StringBuilder append = new StringBuilder("onDelete: ").append(e().size()).append(", ");
                            String str2 = null;
                            if (hVar != null) {
                                str = hVar.getConversationId();
                            } else {
                                str = null;
                            }
                            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", append.append(str).toString());
                            if (hVar != null && (conversationId = hVar.getConversationId()) != null && conversationId.length() != 0) {
                                int i2 = -1;
                                List e2 = e();
                                l.b(e2, "");
                                int size = e2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        break;
                                    }
                                    Object obj = e().get(i3);
                                    l.b(obj, "");
                                    String bF_ = ((com.ss.android.ugc.aweme.im.service.k.a) obj).bF_();
                                    if (hVar == null) {
                                        l.b();
                                    }
                                    if (l.a((Object) bF_, (Object) hVar.getConversationId())) {
                                        i2 = i3;
                                        break;
                                    }
                                    i3++;
                                }
                                StringBuilder append2 = new StringBuilder("onDelete: ").append(e().size()).append(", ");
                                if (hVar != null) {
                                    str2 = hVar.getConversationId();
                                }
                                com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", append2.append(str2).append(", ").append(i2).toString());
                                if (i2 >= 0) {
                                    e().remove(i2);
                                    notifyDataSetChanged();
                                }
                                if (e() == null || e().isEmpty()) {
                                    this.f102018f.setVisibility(0);
                                    this.f102018f.setStatus(this.f102017e);
                                }
                            }
                        }

                        @Override // com.bytedance.im.core.i.c
                        public final void b(List<com.bytedance.im.core.d.h> list, boolean z) {
                            List<com.ss.android.ugc.aweme.im.service.k.a> e2 = e();
                            l.b(e2, "");
                            ArrayList arrayList = new ArrayList(n.a((Iterable) e2, 10));
                            for (com.ss.android.ugc.aweme.im.service.k.a aVar : e2) {
                                l.b(aVar, "");
                                arrayList.add(aVar.bF_());
                            }
                            ArrayList arrayList2 = arrayList;
                            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", new StringBuilder("onLoadMore: ").append(e().size()).append(", ").append(list != null ? Integer.valueOf(list.size()) : null).append(", ").append(z).toString());
                            bz unused = i.a(this.f102014a, null, null, new c(this, arrayList2, list, new C2548d(this, z), null), 3);
                        }

                        @Override // com.bytedance.im.core.i.c
                        public final void a(com.bytedance.im.core.d.h hVar, int i2) {
                            g b2 = b(hVar);
                            String str = null;
                            if (b2 == null) {
                                StringBuilder sb = new StringBuilder("onUpdate session null: ");
                                if (hVar != null) {
                                    str = hVar.getConversationId();
                                }
                                com.ss.android.ugc.aweme.im.service.m.a.e("StrangerListAdapter", sb.append(str).toString());
                                return;
                            }
                            int i3 = -1;
                            int i4 = 0;
                            List e2 = e();
                            l.b(e2, "");
                            int size = e2.size();
                            while (true) {
                                if (i4 >= size) {
                                    break;
                                }
                                Object obj = e().get(i4);
                                l.b(obj, "");
                                if (l.a((Object) ((com.ss.android.ugc.aweme.im.service.k.a) obj).bF_(), (Object) b2.bF_())) {
                                    i3 = i4;
                                    break;
                                }
                                i4++;
                            }
                            StringBuilder append = new StringBuilder("onUpdate: ").append(e().size()).append(", ");
                            if (hVar != null) {
                                str = hVar.getConversationId();
                            }
                            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", append.append(str).append(", ").append(i3).append(", ").append(i2).toString());
                            if (i3 >= 0) {
                                e().set(i3, b2);
                                notifyItemChanged(i3);
                            }
                        }

                        @Override // com.bytedance.im.core.i.c
                        public final void a(List<com.bytedance.im.core.d.h> list, boolean z) {
                            Integer num;
                            List<g> e2 = e(list);
                            StringBuilder append = new StringBuilder("onRefresh: ").append(e().size()).append(", ");
                            if (list != null) {
                                num = Integer.valueOf(list.size());
                            } else {
                                num = null;
                            }
                            com.ss.android.ugc.aweme.im.service.m.a.c("StrangerListAdapter", append.append(num).append(", ").append(e2.size()).append(", ").append(z).toString());
                            this.f102018f.setVisibility(8);
                            e().clear();
                            if (e2.isEmpty()) {
                                if (this.v) {
                                    d(false);
                                }
                                this.f102018f.setVisibility(0);
                                this.f102018f.setStatus(this.f102017e);
                            } else {
                                d(com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().needSessionListShowMore());
                                e().addAll(e2);
                            }
                            d(z);
                            if (!z) {
                                ah_();
                                l();
                            } else {
                                d(true);
                                ai_();
                            }
                            notifyDataSetChanged();
                        }

                        public /* synthetic */ d(TuxStatusView tuxStatusView, androidx.appcompat.app.d dVar, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar, h.f.a.a aVar2) {
                            this(tuxStatusView, dVar, aVar, aVar2, bf.f159040a, o.f159148a);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        private d(TuxStatusView tuxStatusView, androidx.appcompat.app.d dVar, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar, h.f.a.a<z> aVar2, ah ahVar, ah ahVar2) {
                            super(dVar, aVar);
                            l.d(tuxStatusView, "");
                            l.d(dVar, "");
                            l.d(aVar, "");
                            l.d(aVar2, "");
                            l.d(ahVar, "");
                            l.d(ahVar2, "");
                            this.f102018f = tuxStatusView;
                            this.f102019g = aVar2;
                            this.f102020h = ahVar;
                            this.f102015b = ahVar2;
                            this.f102016d = h.i.a((h.f.a.a) b.f102022a);
                            this.f102014a = an.a(ahVar);
                            b_(new ArrayList());
                            tuxStatusView.a();
                            d(true);
                            TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(AnonymousClass1.f102021a));
                            String string = dVar.getString(R.string.cic);
                            l.b(string, "");
                            TuxStatusView.c a3 = a2.a(string);
                            String string2 = dVar.getString(R.string.cib);
                            l.b(string2, "");
                            this.f102017e = a3.a((CharSequence) string2);
                        }
                    }
