package com.ss.android.ugc.aweme.tools.draft.viewmodel;

import android.app.ProgressDialog;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.setting.bx;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.d.n;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import org.json.JSONException;
import org.json.JSONObject;

public final class DraftViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final String f139934a = "DraftViewModel";

    /* renamed from: b  reason: collision with root package name */
    public final Set<com.ss.android.ugc.aweme.tools.draft.d.c> f139935b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.tools.draft.d.a> f139936c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f139937d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<p<com.ss.android.ugc.aweme.draft.model.c, Boolean>> f139938e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.draft.model.c> f139939f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public final t<c> f139940g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f139941h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final am f139942i = an.a(com.ss.android.ugc.aweme.af.a.f66269a);

    /* renamed from: j  reason: collision with root package name */
    private boolean f139943j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f139944k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f139945l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f139946m;

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, (List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(0, 0, (String) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.b(0, 0, (List<String>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(DraftViewModel draftViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = draftViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, null, this);
        }
    }

    static {
        Covode.recordClassIndex(91444);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r4 = this;
            java.util.List<com.ss.android.ugc.aweme.tools.draft.d.a> r0 = r4.f139936c
            java.util.Iterator r3 = r0.iterator()
        L_0x0006:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.tools.draft.d.a r2 = (com.ss.android.ugc.aweme.tools.draft.d.a) r2
            int r1 = r2.a()
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x0022
            int r1 = r2.a()
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 != r0) goto L_0x0006
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.a():boolean");
    }

    public final void a(com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
        int indexOf = this.f139936c.indexOf(cVar);
        if (indexOf != 0 && cVar.f139485h.length() != 0) {
            int i2 = indexOf - 1;
            if (this.f139936c.get(i2).a() == 103) {
                com.ss.android.ugc.aweme.tools.draft.d.a aVar = this.f139936c.get(i2);
                if (indexOf != this.f139936c.size() - 1) {
                    int i3 = indexOf + 1;
                    if (this.f139936c.get(i3).a() == 101) {
                        if (this.f139936c.get(i3).a() == 101) {
                            com.ss.android.ugc.aweme.tools.draft.d.a aVar2 = this.f139936c.get(i3);
                            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftCommonDetails");
                            com.ss.android.ugc.aweme.tools.draft.d.c cVar2 = (com.ss.android.ugc.aweme.tools.draft.d.c) aVar2;
                            if (cVar2.f139484g.length() == 0 || (!h.f.b.l.a((Object) cVar2.f139484g, (Object) cVar.f139484g))) {
                                this.f139936c.remove(aVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f139936c.remove(aVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r9, h.c.d<? super h.z> r10) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.a(java.lang.String, h.c.d):java.lang.Object");
    }

    public static final class c extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f139947a = new c();

        static {
            Covode.recordClassIndex(91447);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.port.in.c.f115629h.a();
            return z.f158842a;
        }
    }

    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ ProgressDialog $mCustomLoadingDialog;

        static {
            Covode.recordClassIndex(91446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ProgressDialog progressDialog) {
            super(0);
            this.$mCustomLoadingDialog = progressDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ProgressDialog progressDialog = this.$mCustomLoadingDialog;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            return z.f158842a;
        }
    }

    public final void b() {
        this.f139943j = false;
        this.f139944k = false;
        this.f139945l = false;
        this.f139946m = false;
        this.f139936c.clear();
        this.f139941h.a();
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        q.a(this.f139934a + " -> onCleared: ");
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c $draft;
        final /* synthetic */ String $source;
        int label;

        static {
            Covode.recordClassIndex(91449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.draft.model.c cVar, String str, h.c.d dVar) {
            super(2, dVar);
            this.$draft = cVar;
            this.$source = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new e(this.$draft, this.$source, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                ai.a().b(this.$draft, this.$source);
                com.ss.android.ugc.aweme.draft.model.d.g(this.$draft);
                com.ss.android.ugc.aweme.shortvideo.sticker.e.b(this.$draft.f());
                bz.b(this.$draft);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ String $creationId;
        int label;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(DraftViewModel draftViewModel, String str, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = draftViewModel;
            this.$creationId = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new f(this.this$0, this.$creationId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                DraftViewModel draftViewModel = this.this$0;
                String str = this.$creationId;
                this.label = 1;
                if (draftViewModel.a(str, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(null);
            return z.f158842a;
        }
    }

    public final void a(ArrayList<com.ss.android.ugc.aweme.tools.draft.d.c> arrayList) {
        Iterator<com.ss.android.ugc.aweme.tools.draft.d.c> it = arrayList.iterator();
        while (it.hasNext()) {
            com.ss.android.ugc.aweme.tools.draft.d.c next = it.next();
            if (next instanceof com.ss.android.ugc.aweme.tools.draft.d.d) {
                a(next);
                b(next);
            }
            this.f139936c.remove(next);
        }
        if (a()) {
            this.f139936c.clear();
        }
        fb.a(this.f139937d, true);
    }

    public static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ ArrayList $list;
        Object L$0;
        int label;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(DraftViewModel draftViewModel, ArrayList arrayList, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = draftViewModel;
            this.$list = arrayList;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new g(this.this$0, this.$list, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                it = this.$list.iterator();
            } else if (i2 == 1) {
                it = (Iterator) this.L$0;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                DraftViewModel draftViewModel = this.this$0;
                String str = ((com.ss.android.ugc.aweme.tools.draft.d.c) it.next()).f139480c;
                this.L$0 = it;
                this.label = 1;
                if (draftViewModel.a(str, this) == aVar) {
                    return aVar;
                }
            }
            com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(null);
            return z.f158842a;
        }
    }

    private final boolean a(com.ss.android.ugc.aweme.tools.draft.d.h hVar) {
        n nVar = new n((byte) 0);
        if (!this.f139943j && b.a(hVar.f139503b.f139500f)) {
            nVar.f139514c = R.string.fpp;
            this.f139943j = true;
        } else if (!this.f139944k && b.b(hVar.f139503b.f139500f)) {
            nVar.f139514c = R.string.fpq;
            this.f139944k = true;
        } else if (!this.f139945l && b.c(hVar.f139503b.f139500f)) {
            nVar.f139514c = R.string.fpo;
            this.f139945l = true;
        } else if (this.f139946m || !b.d(hVar.f139503b.f139500f)) {
            return false;
        } else {
            nVar.f139514c = R.string.fpn;
            this.f139946m = true;
        }
        this.f139936c.add(nVar);
        return true;
    }

    private final void a(List<com.ss.android.ugc.aweme.tools.draft.d.h> list) {
        if (!list.isEmpty()) {
            if (this.f139936c.size() == 0) {
                this.f139936c.add(new com.ss.android.ugc.aweme.tools.draft.d.j((byte) 0));
            }
            if (this.f139936c.size() > 1) {
                List<com.ss.android.ugc.aweme.tools.draft.d.a> list2 = this.f139936c;
                list2.remove(list2.size() - 1);
            }
            for (com.ss.android.ugc.aweme.tools.draft.d.h hVar : list) {
                boolean a2 = a(hVar);
                boolean b2 = b(hVar);
                if (!a2 && !b2 && hVar.f139503b.f139498d.length() > 0) {
                    List<com.ss.android.ugc.aweme.tools.draft.d.a> list3 = this.f139936c;
                    com.ss.android.ugc.aweme.tools.draft.d.a aVar = list3.get(list3.size() - 1);
                    if (aVar instanceof com.ss.android.ugc.aweme.tools.draft.d.d) {
                        com.ss.android.ugc.aweme.tools.draft.d.d dVar = (com.ss.android.ugc.aweme.tools.draft.d.d) aVar;
                        if (dVar.f139484g.length() > 0) {
                            dVar.f139489l = false;
                            List<com.ss.android.ugc.aweme.tools.draft.d.a> list4 = this.f139936c;
                            list4.set(list4.size() - 1, aVar);
                        }
                    }
                }
                com.ss.android.ugc.aweme.tools.draft.d.d dVar2 = new com.ss.android.ugc.aweme.tools.draft.d.d(101, hVar.f139502a, hVar.f139503b.f139497c, hVar.f139504c.f139493c, hVar.f139503b.f139498d, hVar.f139503b.f139499e, hVar.f139503b.f139495a, hVar.f139503b.f139496b, false, 1792);
                if (dVar2.f139486i == 101 && this.f139936c.size() > 0) {
                    List<com.ss.android.ugc.aweme.tools.draft.d.a> list5 = this.f139936c;
                    if (list5.get(list5.size() - 1).a() == 101) {
                        dVar2.f139490m = true;
                    }
                }
                this.f139936c.add(dVar2);
            }
            this.f139936c.add(new com.ss.android.ugc.aweme.tools.draft.d.k((byte) 0));
            fb.a(this.f139937d, true);
        }
    }

    private final void b(List<com.ss.android.ugc.aweme.tools.draft.d.h> list) {
        if (!list.isEmpty()) {
            if (this.f139936c.size() == 0) {
                this.f139936c.add(new com.ss.android.ugc.aweme.tools.draft.d.j((byte) 0));
                this.f139936c.add(new com.ss.android.ugc.aweme.tools.draft.d.k((byte) 0));
                this.f139936c.add(new com.ss.android.ugc.aweme.tools.draft.d.b((byte) 0));
            }
            for (com.ss.android.ugc.aweme.tools.draft.d.h hVar : list) {
                List<com.ss.android.ugc.aweme.tools.draft.d.a> list2 = this.f139936c;
                list2.add(list2.size() - 2, new com.ss.android.ugc.aweme.tools.draft.d.m(106, hVar.f139502a, hVar.f139503b.f139497c, hVar.f139504c.f139493c, hVar.f139503b.f139498d, com.ss.android.ugc.aweme.tools.draft.d.g.a(hVar), 64));
            }
            q.a(this.f139934a + " -> dealDraftViewInfosForNewUI: draftList.size = " + this.f139936c.size());
            fb.a(this.f139937d, true);
        }
    }

    private final boolean b(com.ss.android.ugc.aweme.tools.draft.d.h hVar) {
        if (hVar.f139503b.f139499e.length() > 0) {
            List<com.ss.android.ugc.aweme.tools.draft.d.a> list = this.f139936c;
            com.ss.android.ugc.aweme.tools.draft.d.a aVar = list.get(list.size() - 1);
            int a2 = aVar.a();
            if (a2 == 101) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftDetails");
                if (!h.f.b.l.a((Object) ((com.ss.android.ugc.aweme.tools.draft.d.c) aVar).f139485h, (Object) hVar.f139503b.f139499e)) {
                    com.ss.android.ugc.aweme.tools.draft.d.l lVar = new com.ss.android.ugc.aweme.tools.draft.d.l();
                    lVar.a(hVar.f139503b.f139498d);
                    lVar.b(hVar.f139502a);
                    this.f139936c.add(lVar);
                    return true;
                }
            } else if (a2 == 102) {
                com.ss.android.ugc.aweme.tools.draft.d.l lVar2 = new com.ss.android.ugc.aweme.tools.draft.d.l();
                lVar2.a(hVar.f139503b.f139498d);
                lVar2.b(hVar.f139502a);
                this.f139936c.add(lVar2);
                return true;
            } else if (a2 == 105) {
                com.ss.android.ugc.aweme.tools.draft.d.l lVar3 = new com.ss.android.ugc.aweme.tools.draft.d.l();
                lVar3.a(hVar.f139503b.f139498d);
                lVar3.b(hVar.f139502a);
                this.f139936c.add(lVar3);
                return true;
            }
        }
        return false;
    }

    public final void b(com.ss.android.ugc.aweme.tools.draft.d.c cVar) {
        int i2;
        int indexOf = this.f139936c.indexOf(cVar);
        if (indexOf != 0) {
            com.ss.android.ugc.aweme.tools.draft.d.a aVar = this.f139936c.get(indexOf - 1);
            if (aVar.a() != 102) {
                return;
            }
            if (indexOf == this.f139936c.size() - 1 || ((i2 = indexOf + 1) < this.f139936c.size() && this.f139936c.get(i2).a() == 102)) {
                this.f139936c.remove(aVar);
            }
        }
    }

    public static final class a extends m implements h.f.a.m<Boolean, String, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c $data;
        final /* synthetic */ DraftViewModel this$0;

        static {
            Covode.recordClassIndex(91445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DraftViewModel draftViewModel, androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
            super(2);
            this.this$0 = draftViewModel;
            this.$activity = eVar;
            this.$data = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, String str) {
            Boolean bool2 = bool;
            String str2 = str;
            if (bool2 == null) {
                h.f.b.l.b();
            }
            if (bool2.booleanValue()) {
                com.ss.android.ugc.aweme.df.c cVar = c.C1870c.f80046a;
                h.f.b.l.b(cVar, "");
                if (cVar.a()) {
                    q.d("app is running background");
                } else {
                    com.ss.android.ugc.aweme.shortvideo.c clone = this.$data.f83185f.clone();
                    h.f.b.l.b(clone, "");
                    com.ss.android.ugc.aweme.shortvideo.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.c();
                    h.f.b.l.d(cVar2, "");
                    com.ss.android.ugc.aweme.utils.d.a("shoot", new com.ss.android.ugc.tools.f.b().a("shoot_way", "draft_again").a("music_id", cVar2.getMusicId()).a("is_ui_shoot", true).f149193a);
                    clone.setMusicPriority(99);
                    cr.a().a(clone);
                    String str3 = this.$data.f83187h;
                    h.f.b.l.b(str3, "");
                    int i2 = this.$data.n;
                    com.ss.android.ugc.aweme.df.e.a("toVideoRecord() called with: path = [" + str3 + "], context = [], musicModel = [" + clone + "], start = [" + i2 + ']');
                    try {
                        new JSONObject().put("route", "1");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    ah.f109483a = "draft_page";
                    c cVar3 = new c();
                    String musicId = clone.getMusicId();
                    h.f.b.l.b(musicId, "");
                    h.f.b.l.d(musicId, "");
                    cVar3.f139949a = musicId;
                    h.f.b.l.d(str3, "");
                    cVar3.f139950b = str3;
                    cVar3.f139951c = i2;
                    if (bx.a()) {
                        String str4 = this.$data.O;
                        h.f.b.l.b(str4, "");
                        h.f.b.l.d(str4, "");
                        cVar3.f139952d = str4;
                    }
                    fb.a(this.this$0.f139940g, cVar3);
                }
            } else if (TextUtils.isEmpty(str2)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.$activity).a(R.string.dcb).a();
            } else if (str2 != null) {
                new com.bytedance.tux.g.b(this.$activity).a(str2).b();
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2 A[Catch:{ all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[Catch:{ all -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.tools.draft.d.c r10, com.ss.android.ugc.aweme.tools.draft.c.b r11, h.c.d<? super h.z> r12) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.a(com.ss.android.ugc.aweme.tools.draft.d.c, com.ss.android.ugc.aweme.tools.draft.c.b, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r6, int r7, java.lang.String r8, h.c.d<? super h.z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.j
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j r4 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.j) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.L$0
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            h.r.a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f139937d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.utils.fb.a(r1, r0)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0036:
            h.r.a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.ss.android.ugc.aweme.tools.draft.b.b.f139437d
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r3 = r0.b(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$j
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.b(r3)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.b(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, int r7, java.lang.String r8, h.c.d<? super h.z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.h
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h r4 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.h) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.L$0
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            h.r.a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f139937d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.utils.fb.a(r1, r0)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0036:
            h.r.a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.ss.android.ugc.aweme.tools.draft.b.b.f139437d
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r3 = r0.a(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$h
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.a(r3)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.a(int, int, java.lang.String, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r6, int r7, java.util.List<java.lang.String> r8, h.c.d<? super h.z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.i
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i r4 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.i) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.L$0
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            h.r.a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f139937d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.utils.fb.a(r1, r0)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0036:
            h.r.a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.ss.android.ugc.aweme.tools.draft.b.b.f139437d
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r3 = r0.a(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$i
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.a(r3)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.a(int, int, java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r6, int r7, java.util.List<java.lang.String> r8, h.c.d<? super h.z> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.k
            if (r0 == 0) goto L_0x0048
            r4 = r9
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k r4 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.k) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0048
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x0054
            java.lang.Object r0 = r4.L$0
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r0 = (com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel) r0
            h.r.a(r3)
        L_0x0025:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x004e
            androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f139937d
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.utils.fb.a(r1, r0)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0036:
            h.r.a(r3)
            com.ss.android.ugc.aweme.tools.draft.b.b r0 = com.ss.android.ugc.aweme.tools.draft.b.b.f139437d
            r4.L$0 = r5
            r4.label = r1
            java.lang.Object r3 = r0.b(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0046
            return r2
        L_0x0046:
            r0 = r5
            goto L_0x0025
        L_0x0048:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k r4 = new com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$k
            r4.<init>(r5, r9)
            goto L_0x0013
        L_0x004e:
            r0.b(r3)
            h.z r0 = h.z.f158842a
            return r0
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.b(int, int, java.util.List, h.c.d):java.lang.Object");
    }
}
