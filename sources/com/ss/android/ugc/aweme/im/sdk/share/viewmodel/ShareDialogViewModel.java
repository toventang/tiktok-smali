package com.ss.android.ugc.aweme.im.sdk.share.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ShareDialogViewModel extends ac {

    /* renamed from: j  reason: collision with root package name */
    public static final a f103758j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<String> f103759a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<List<IMContact>> f103760b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<List<IMContact>> f103761c;

    /* renamed from: d  reason: collision with root package name */
    public final t<List<IMContact>> f103762d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Boolean> f103763e;

    /* renamed from: f  reason: collision with root package name */
    public final t<Boolean> f103764f;

    /* renamed from: g  reason: collision with root package name */
    public final t<Boolean> f103765g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f103766h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.share.data.a.b f103767i;

    /* renamed from: k  reason: collision with root package name */
    private final h f103768k;

    /* renamed from: l  reason: collision with root package name */
    private final t<Integer> f103769l;

    /* renamed from: m  reason: collision with root package name */
    private final List<IMContact> f103770m;
    private final SharePackage n;
    private final com.ss.android.ugc.aweme.im.service.share.a.b o;

    static {
        Covode.recordClassIndex(66466);
    }

    public final Set<String> a() {
        return (Set) this.f103768k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66467);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103771a = new b();

        static {
            Covode.recordClassIndex(66468);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    public final void d() {
        this.f103767i.d();
    }

    public final String c() {
        String value = this.f103759a.getValue();
        if (value == null) {
            return "";
        }
        return value;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f103767i.f();
    }

    public final boolean b() {
        Integer value = this.f103769l.getValue();
        if (value != null && value.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void a(int i2) {
        this.f103769l.setValue(Integer.valueOf(i2));
    }

    static final class c<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareDialogViewModel f103772a;

        static {
            Covode.recordClassIndex(66469);
        }

        c(ShareDialogViewModel shareDialogViewModel) {
            this.f103772a = shareDialogViewModel;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            boolean z;
            int i2;
            List list = (List) obj;
            l.b(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                IMContact iMContact = (IMContact) next;
                if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getFollowStatus() == 2) {
                    arrayList.add(next);
                }
            }
            List o = n.o(arrayList);
            Iterator it2 = o.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                IMContact iMContact2 = (IMContact) next2;
                if ((iMContact2 instanceof IMUser) && IMUser.isSelf(((IMUser) iMContact2).getUid())) {
                    if (next2 != null) {
                        i2 = o.size() - 1;
                    }
                }
            }
            i2 = o.size();
            if (i2 <= 3 && !com.ss.android.ugc.aweme.friends.service.a.f97047a.p()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static List<IMContact> a(List<IMContact> list) {
        l.d(list, "");
        if (com.ss.android.ugc.aweme.im.service.c.c.a()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<IMContact> it = list.iterator();
            while (it.hasNext()) {
                IMContact next = it.next();
                if (next instanceof IMConversation) {
                    it.remove();
                    arrayList.add(next);
                } else if (!(!(next instanceof IMUser) || next.getType() == 0 || next.getType() == 3)) {
                    it.remove();
                    arrayList2.add(next);
                }
            }
            list.addAll(0, arrayList);
            list.addAll(0, arrayList2);
        }
        return list;
    }

    public final void b(List<? extends IMContact> list) {
        l.d(list, "");
        this.f103762d.setValue(list);
        ArrayList<IMContact> arrayList = new ArrayList();
        for (T t : list) {
            if (!this.f103770m.contains(t)) {
                arrayList.add(t);
            }
        }
        for (IMContact iMContact : arrayList) {
            a(iMContact);
        }
        this.f103770m.clear();
        this.f103770m.addAll(list);
    }

    private final void a(IMContact iMContact) {
        IMContact iMContact2;
        String str;
        int i2;
        SharePackage sharePackage = this.n;
        if (!b()) {
            List<IMContact> value = this.f103761c.getValue();
            if (value != null) {
                i2 = value.indexOf(iMContact);
            } else {
                i2 = 0;
            }
            sharePackage.f124595i.putInt("rank_num", i2);
        }
        Bundle bundle = sharePackage.f124595i;
        StringBuilder sb = new StringBuilder();
        boolean z = iMContact instanceof IMUser;
        Integer num = null;
        if (!z) {
            iMContact2 = null;
        } else {
            iMContact2 = iMContact;
        }
        IMUser iMUser = (IMUser) iMContact2;
        if (iMUser != null) {
            num = Integer.valueOf(iMUser.getFollowStatus());
        }
        bundle.putString("relation_tag", sb.append(String.valueOf(num)).toString());
        sharePackage.f124595i.remove("rank_num");
        com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.o;
        if (bVar != null) {
            bVar.a("chat_mergeIM", sharePackage);
        }
        com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, sharePackage, iMContact, false, "chat_list", 0, null, null, 112);
        if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(this.n)) {
            if (z) {
                str = "user";
            } else {
                str = "group";
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.c(str);
        }
    }

    public /* synthetic */ ShareDialogViewModel(SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.data.a.b bVar) {
        this(sharePackage, bVar, null);
    }

    public ShareDialogViewModel(SharePackage sharePackage, com.ss.android.ugc.aweme.im.sdk.share.data.a.b bVar, com.ss.android.ugc.aweme.im.service.share.a.b bVar2) {
        l.d(sharePackage, "");
        l.d(bVar, "");
        this.n = sharePackage;
        this.f103767i = bVar;
        this.o = bVar2;
        this.f103768k = i.a((h.f.a.a) b.f103771a);
        this.f103759a = bVar.a();
        this.f103760b = bVar.b();
        LiveData<List<IMContact>> c2 = bVar.c();
        this.f103761c = c2;
        this.f103762d = new t<>();
        this.f103763e = new t<>();
        this.f103764f = new t<>();
        this.f103765g = new t<>();
        LiveData<Boolean> a2 = aa.a(c2, new c(this));
        l.b(a2, "");
        this.f103766h = a2;
        this.f103769l = new t<>();
        this.f103770m = new ArrayList();
    }
}
