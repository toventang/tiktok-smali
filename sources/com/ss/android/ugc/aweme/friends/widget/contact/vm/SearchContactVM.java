package com.ss.android.ugc.aweme.friends.widget.contact.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.a.z;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;

public final class SearchContactVM extends ContactVM {

    /* renamed from: h  reason: collision with root package name */
    public static final a f97368h = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final t<b> f97369c;

    /* renamed from: d  reason: collision with root package name */
    public final t<p<a, List<com.ss.android.ugc.aweme.friends.widget.contact.a>>> f97370d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<b> f97371e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<p<a, List<com.ss.android.ugc.aweme.friends.widget.contact.a>>> f97372f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends com.ss.android.ugc.aweme.friends.widget.contact.a> f97373g = z.INSTANCE;

    /* renamed from: i  reason: collision with root package name */
    private final String f97374i = "search";

    static {
        Covode.recordClassIndex(61852);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61853);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM
    public final String a() {
        return this.f97374i;
    }

    public final void b() {
        this.f97369c.setValue(b.ON_HIDE);
    }

    public final void c() {
        this.f97369c.setValue(b.ON_SEARCH_END);
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97375a = new c();

        static {
            Covode.recordClassIndex(61856);
        }

        c() {
        }

        public final void run() {
            r.a("click_search_contacts", ag.b(v.a("enter_from", "notification_page")));
        }
    }

    public SearchContactVM() {
        t<b> tVar = new t<>();
        this.f97369c = tVar;
        t<p<a, List<com.ss.android.ugc.aweme.friends.widget.contact.a>>> tVar2 = new t<>();
        this.f97370d = tVar2;
        this.f97371e = tVar;
        this.f97372f = tVar2;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f97376a;

        static {
            Covode.recordClassIndex(61857);
        }

        d(int i2) {
            this.f97376a = i2;
        }

        public final void run() {
            r.a("search_contacts_result_show", ag.b(v.a("enter_from", "notification_page"), v.a("result_cnt", String.valueOf(this.f97376a))));
        }
    }

    public static void a(int i2) {
        r.a().execute(new d(i2));
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM
    public final int a(com.ss.android.ugc.aweme.friends.widget.contact.a aVar) {
        List<com.ss.android.ugc.aweme.friends.widget.contact.a> second;
        l.d(aVar, "");
        p<a, List<com.ss.android.ugc.aweme.friends.widget.contact.a>> value = this.f97370d.getValue();
        if (value == null || (second = value.getSecond()) == null) {
            return -1;
        }
        return second.indexOf(aVar) + 1;
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.friends.widget.contact.a> list) {
        l.d(list, "");
        this.f97373g = new ArrayList(list);
        this.f97369c.setValue(b.ON_SHOW);
    }

    public static final class b extends k implements m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ String $text;
        int label;
        final /* synthetic */ SearchContactVM this$0;

        static {
            Covode.recordClassIndex(61854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchContactVM searchContactVM, String str, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = searchContactVM;
            this.$text = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$text, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                if (this.$text.length() == 0) {
                    this.this$0.f97370d.postValue(v.a(a.NORMAL, z.INSTANCE));
                    return h.z.f158842a;
                }
                ah ahVar = bf.f159040a;
                AnonymousClass1 r1 = new m<am, h.c.d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM.b.AnonymousClass1 */
                    int label;
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(61855);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 
                    }
