package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.detail.i.c;
import com.ss.android.ugc.aweme.discover.model.IAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import f.a.t;
import f.a.x;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a<T extends IAwemeList<T>> extends c<Aweme, T> {
    static {
        Covode.recordClassIndex(50723);
    }

    public abstract t<T> b();

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public boolean isHasMore() {
        IAwemeList iAwemeList = (IAwemeList) this.mData;
        if (iAwemeList == null || iAwemeList.getIHasMore() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public List<Aweme> getItems() {
        List<Aweme> iAwemeList;
        IAwemeList iAwemeList2 = (IAwemeList) this.mData;
        if (iAwemeList2 == null || (iAwemeList = iAwemeList2.getIAwemeList()) == null) {
            return new ArrayList();
        }
        return iAwemeList;
    }

    private final void a() {
        ab.a((x) b()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new C1909a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a$a  reason: collision with other inner class name */
    public static final class C1909a implements ae<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81630a;

        static {
            Covode.recordClassIndex(50724);
        }

        @Override // f.a.ae
        public final void onSubscribe(b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1909a(a aVar) {
            this.f81630a = aVar;
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f81630a.mIsLoading = false;
            if (this.f81630a.mNotifyListeners != null) {
                for (o oVar : this.f81630a.mNotifyListeners) {
                    oVar.a_((Exception) th);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.discover.mixfeed.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(Object obj) {
            IAwemeList iAwemeList = (IAwemeList) obj;
            l.d(iAwemeList, "");
            this.f81630a.mIsLoading = false;
            this.f81630a.handleData(iAwemeList);
            if (this.f81630a.mNotifyListeners != null) {
                for (o oVar : this.f81630a.mNotifyListeners) {
                    oVar.c();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void refreshList(Object... objArr) {
        l.d(objArr, "");
        a();
    }

    /* renamed from: a */
    public void handleData(T t) {
        List<Aweme> list;
        List<Aweme> list2;
        IAwemeList iAwemeList;
        String str;
        String str2;
        ad c2;
        ad c3;
        if (t != null) {
            list = t.getIAwemeList();
        } else {
            list = null;
        }
        IAwemeList iAwemeList2 = (IAwemeList) this.mData;
        if (iAwemeList2 == null || (list2 = iAwemeList2.getIAwemeList()) == null) {
            list2 = new ArrayList<>();
        }
        if (list == null || list.isEmpty()) {
            if (this.mListQueryType == 1) {
                this.mData = t;
                IAwemeList iAwemeList3 = (IAwemeList) this.mData;
                if (iAwemeList3 != null) {
                    iAwemeList3.setIHasMore(0);
                }
            }
            if (!(this.mListQueryType == 2 || (iAwemeList = (IAwemeList) this.mData) == null)) {
                iAwemeList.setIHasMore(0);
                return;
            }
            return;
        }
        if (this.mListQueryType != 1) {
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                if (list2.indexOf(it.next()) >= 0) {
                    it.remove();
                }
            }
        }
        int i2 = this.mListQueryType;
        if (i2 != 1) {
            if (i2 == 4) {
                List<Aweme> iAwemeList4 = ((IAwemeList) this.mData).getIAwemeList();
                if (iAwemeList4 != null) {
                    iAwemeList4.addAll(list);
                }
                ((IAwemeList) this.mData).updateData(t);
            }
        } else if (this.mData != null) {
            List<Aweme> iAwemeList5 = ((IAwemeList) this.mData).getIAwemeList();
            if (iAwemeList5 != null) {
                iAwemeList5.clear();
                iAwemeList5.addAll(list);
            }
            ((IAwemeList) this.mData).updateData(t);
        } else {
            this.mData = t;
        }
        q a2 = am.a();
        if (a2 == null || (c3 = a2.c()) == null || (str = c3.f121172a) == null) {
            str = "";
        }
        c.a.a("ref_base_aweme_list_model_handle_data", str);
        for (Aweme aweme : list) {
            q a3 = am.a();
            if (a3 == null || (c2 = a3.c()) == null || (str2 = c2.f121172a) == null) {
                str2 = "";
            }
            aweme.setRequestId(str2);
        }
    }
}
