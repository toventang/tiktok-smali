package com.ss.android.ugc.aweme.find.viewmodel;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.in;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class FindFriendsViewModel extends JediViewModel<FindFriendsState> {

    /* renamed from: a  reason: collision with root package name */
    public final c f96126a = new c();

    /* renamed from: b  reason: collision with root package name */
    public NewRecommendList f96127b = new NewRecommendList();

    /* renamed from: c  reason: collision with root package name */
    public String f96128c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f96129d = "";

    static {
        Covode.recordClassIndex(60897);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ FindFriendsState d() {
        return new FindFriendsState(null, null, false, 0, null, null, false, null, 255, null);
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        List<Integer> b2 = b();
        if (!com.ss.android.ugc.aweme.inbox.b.b.d() || (!l.a((Object) this.f96128c, (Object) "notification_page"))) {
            arrayList.add(0);
        }
        arrayList.add(1);
        arrayList.add(2);
        c(new e(arrayList, b2));
    }

    private final List<Integer> b() {
        List<Integer> c2 = n.c(0);
        if (!c.a.f141661a.c()) {
            c2.add(1);
        }
        c.b bVar = c.b.f141662a;
        User c3 = in.c();
        l.b(c3, "");
        String a2 = bVar.a(c3.getUid());
        if (!c.b.f141662a.b()) {
            c2.add(2);
        } else {
            this.f96129d = a2;
        }
        return c2;
    }

    public final void a(int i2) {
        b_(new d(this, i2));
    }

    public final void b(int i2) {
        c(new g(i2));
    }

    public final void c(int i2) {
        c(new f(i2));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
        final /* synthetic */ boolean $boolean;

        static {
            Covode.recordClassIndex(60898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$boolean = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, null, null, this.$boolean, null, 191, null);
        }
    }

    static final class e extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
        final /* synthetic */ List $headerChannels;
        final /* synthetic */ List $tailChannels;

        static {
            Covode.recordClassIndex(60906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(List list, List list2) {
            super(1);
            this.$headerChannels = list;
            this.$tailChannels = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, this.$headerChannels, this.$tailChannels, false, null, 207, null);
        }
    }

    static final class f extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
        final /* synthetic */ int $type;

        static {
            Covode.recordClassIndex(60907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.$type = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, null, null, false, new f(this.$type), 127, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
        final /* synthetic */ int $resType;

        static {
            Covode.recordClassIndex(60908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(1);
            this.$resType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, new e(this.$resType), null, false, 0, null, null, false, null, 254, null);
        }
    }

    public final void a(boolean z) {
        c(new a(z));
    }

    public static final class b extends m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ int $position;
        final /* synthetic */ FindFriendsViewModel this$0;

        static {
            Covode.recordClassIndex(60899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(FindFriendsViewModel findFriendsViewModel, int i2) {
            super(1);
            this.this$0 = findFriendsViewModel;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            final List g2 = n.g((Collection) findFriendsState2.getList());
            int size = g2.size();
            int i2 = this.$position;
            if (size > i2) {
                g2.remove(i2);
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                loop0:
                while (true) {
                    boolean z = false;
                    for (Object obj : g2) {
                        int i8 = i3 + 1;
                        if (i3 < 0) {
                            n.a();
                        }
                        a aVar = (a) obj;
                        if (aVar.f96132b == 0) {
                            i4 = i3;
                            i3 = i8;
                        } else if (aVar.f96132b == 1) {
                            i5 = i3;
                            i3 = i8;
                            z = true;
                        } else {
                            if (z) {
                                i7++;
                            } else {
                                i6++;
                            }
                            i3 = i8;
                        }
                    }
                    break loop0;
                }
                if (i6 == 0 && i4 >= 0) {
                    g2.remove(i4);
                }
                if (i7 == 0 && i5 >= 0) {
                    g2.remove(i5);
                }
                this.this$0.c(new h.f.a.b<FindFriendsState, FindFriendsState>() {
                    /* class com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60900);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        l.d(findFriendsState2, "");
                        return FindFriendsState.copy$default(findFriendsState2, new e(100), g2, false, 0, null, null, false, null, 252, null);
                    }
                });
            }
            return z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ z.e $section;
        final /* synthetic */ String $uid;

        static {
            Covode.recordClassIndex(60901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, z.e eVar) {
            super(1);
            this.$uid = str;
            this.$section = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
            boolean z;
            String str;
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            Iterator<T> it = findFriendsState2.getList().iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    T next = it.next();
                    if (next.f96132b == 0) {
                        z = true;
                    } else if (next.f96132b != 1) {
                        User user = next.f96131a;
                        if (user != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        TextUtils.equals(str, this.$uid);
                    }
                }
            }
            if (z) {
                this.$section.element = "new_suggest";
            }
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<FindFriendsState, h.z> {
        final /* synthetic */ int $requestType;
        final /* synthetic */ FindFriendsViewModel this$0;

        static {
            Covode.recordClassIndex(60902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FindFriendsViewModel findFriendsViewModel, int i2) {
            super(1);
            this.this$0 = findFriendsViewModel;
            this.$requestType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FindFriendsState findFriendsState) {
            int cursor;
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            if (this.$requestType == 0) {
                cursor = 0;
            } else {
                cursor = findFriendsState2.getCursor();
            }
            c cVar = this.this$0.f96126a;
            com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
            l.b(eVar, "");
            String a2 = eVar.a();
            l.b(a2, "");
            d dVar = new d(cursor, a2);
            l.d(dVar, "");
            t b2 = cVar.f96140b.c(dVar).b(f.a.h.a.b(f.a.k.a.f158006c));
            l.b(b2, "");
            b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((f.a.z) new f.a.z<FindFriendsState>(this) {
                /* class com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f96130a;

                static {
                    Covode.recordClassIndex(60903);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onSubscribe(f.a.b.b bVar) {
                    l.d(bVar, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f96130a = r1;
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                    l.d(th, "");
                    this.f96130a.this$0.c(new a(this));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    l.d(findFriendsState2, "");
                    this.f96130a.this$0.c(new b(findFriendsState2));
                }

                /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$d$1$a */
                static final class a extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(60904);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2) {
                        super(1);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        l.d(findFriendsState2, "");
                        if (this.this$0.f96130a.$requestType == 0) {
                            return FindFriendsState.copy$default(findFriendsState2, new e(3), null, false, 0, null, null, false, null, 254, null);
                        }
                        return FindFriendsState.copy$default(findFriendsState2, new e(4), null, false, 0, null, null, false, null, 254, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$d$1$b */
                static final class b extends m implements h.f.a.b<FindFriendsState, FindFriendsState> {
                    final /* synthetic */ FindFriendsState $t;

                    static {
                        Covode.recordClassIndex(60905);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(FindFriendsState findFriendsState) {
                        super(1);
                        this.$t = findFriendsState;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        l.d(findFriendsState2, "");
                        return FindFriendsState.copy$default(findFriendsState2, this.$t.getResType(), this.$t.getList(), this.$t.getHasMore(), this.$t.getCursor(), null, null, false, null, 240, null);
                    }
                }
            });
            return h.z.f158842a;
        }
    }
}
