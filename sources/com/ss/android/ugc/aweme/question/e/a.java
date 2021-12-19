package com.ss.android.ugc.aweme.question.e;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.question.api.QuestionApi;
import com.ss.android.ugc.aweme.question.api.b;
import com.ss.android.ugc.aweme.question.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Aweme, b> {

    /* renamed from: a  reason: collision with root package name */
    public String f119952a = "question_video";

    /* renamed from: b  reason: collision with root package name */
    public final C3094a f119953b = new C3094a();

    /* renamed from: c  reason: collision with root package name */
    private List<Aweme> f119954c;

    /* renamed from: com.ss.android.ugc.aweme.question.e.a$a  reason: collision with other inner class name */
    public static class C3094a {

        /* renamed from: a  reason: collision with root package name */
        public int f119960a;

        /* renamed from: b  reason: collision with root package name */
        public int f119961b;

        /* renamed from: c  reason: collision with root package name */
        public long f119962c;

        /* renamed from: d  reason: collision with root package name */
        public c f119963d;

        /* renamed from: e  reason: collision with root package name */
        boolean f119964e;

        static {
            Covode.recordClassIndex(77927);
        }
    }

    static {
        Covode.recordClassIndex(77925);
    }

    public final List<Aweme> a() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).getVideos();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f119954c)) {
            arrayList.addAll(this.f119954c);
        }
        List<Aweme> a2 = a();
        if (!com.bytedance.common.utility.collection.b.a((Collection) a2)) {
            arrayList.addAll(a2);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((b) this.mData).isHasMore()) && com.bytedance.common.utility.collection.b.a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return m.a(getItems(), aweme, this.mNotifyListeners);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new b();
        }
        ((b) this.mData).setHasMore((Integer) 1);
        ((b) this.mData).setVideos(list);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        int i2;
        try {
            long parseLong = Long.parseLong((String) objArr[1]);
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((b) this.mData).getCursor().intValue();
            }
            a(parseLong, i2, null, false);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        try {
            if (objArr.length >= 6) {
                a(Long.parseLong((String) objArr[1]), 0, (String) objArr[4], ((Boolean) objArr[5]).booleanValue());
            } else {
                a(Long.parseLong((String) objArr[1]), 0, (String) objArr[4], false);
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        b bVar = (b) obj;
        if (!this.f119953b.f119964e && bVar != null) {
            com.ss.android.ugc.aweme.question.a.a.a(this.f119953b, bVar);
        }
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            List<Aweme> videos = bVar.getVideos();
            if (videos != null) {
                int size = videos.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme a2 = AwemeService.b().a(videos.get(i2));
                    a2.setIsTop(videos.get(i2).getIsTop());
                    videos.set(i2, a2);
                }
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = bVar;
            } else if (i3 == 4) {
                if (videos != null) {
                    if (com.bytedance.common.utility.collection.b.a((Collection) ((b) this.mData).getVideos())) {
                        ((b) this.mData).setVideos(videos);
                    } else {
                        List<Aweme> videos2 = ((b) this.mData).getVideos();
                        h.f.a.m mVar = c.f119967a;
                        l.d(videos2, "");
                        l.d(videos, "");
                        l.d(mVar, "");
                        if (!com.bytedance.common.utility.collection.b.a((Collection) videos)) {
                            for (Aweme aweme : videos) {
                                if (aweme != null) {
                                    Iterator<T> it = videos2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        T next = it.next();
                                        if (((Boolean) mVar.invoke(next, aweme)).booleanValue()) {
                                            if (next != null) {
                                            }
                                        }
                                    }
                                    videos2.add(aweme);
                                }
                            }
                        }
                    }
                }
                ((b) this.mData).setCursor(bVar.getCursor());
                ((b) this.mData).setHasMore(Integer.valueOf(bVar.getHasMore().intValue() & ((b) this.mData).getHasMore().intValue()));
            }
        } else if (this.mData != null) {
            ((b) this.mData).setHasMore((Integer) 0);
        }
    }

    private void a(long j2, int i2, String str, boolean z) {
        boolean z2;
        b a2;
        if (z || (a2 = com.ss.android.ugc.aweme.question.a.a.a(j2, i2, 20, this.f119953b.f119963d)) == null) {
            z2 = true;
        } else {
            Message message = new Message();
            message.obj = a2;
            new Handler().post(new b(this, message));
            z2 = false;
        }
        this.f119953b.f119960a = 20;
        this.f119953b.f119961b = i2;
        this.f119953b.f119962c = j2;
        this.f119953b.f119964e = true;
        if (z2) {
            n.a().a(this.mHandler, new Callable(j2, i2, 20, str) {
                /* class com.ss.android.ugc.aweme.question.e.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ long f119955a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f119956b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f119957c = 20;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f119958d;

                static {
                    Covode.recordClassIndex(77926);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    a.this.f119953b.f119964e = false;
                    return QuestionApi.a(this.f119955a, this.f119956b, this.f119957c, this.f119958d);
                }

                {
                    this.f119955a = r3;
                    this.f119956b = r5;
                    this.f119958d = r7;
                }
            }, 0);
        }
    }
}
