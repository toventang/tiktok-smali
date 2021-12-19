package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollDetailApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f;
import f.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final PollDetailApi f130394a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f130395b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public d f130396c = new d(0, false);

    /* renamed from: d  reason: collision with root package name */
    public final c<User> f130397d;

    /* renamed from: e  reason: collision with root package name */
    public f f130398e;

    /* renamed from: f  reason: collision with root package name */
    public int f130399f;

    static {
        Covode.recordClassIndex(85519);
    }

    public static final class a implements z<PollDetailResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f130400a;

        static {
            Covode.recordClassIndex(85520);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(e eVar) {
            this.f130400a = eVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f130400a.f130397d.c(new Exception(th));
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f130400a.f130395b.a(bVar);
            this.f130400a.f130397d.aO_();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(PollDetailResponse pollDetailResponse) {
            List<User> list;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e a2;
            ArrayList arrayList;
            ArrayList arrayList2;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e a3;
            PollDetailResponse pollDetailResponse2 = pollDetailResponse;
            l.d(pollDetailResponse2, "");
            this.f130400a.a(new d(pollDetailResponse2.getOffset(), pollDetailResponse2.getHasMore()));
            e eVar = this.f130400a;
            List<User> users = pollDetailResponse2.getUsers();
            int i2 = eVar.f130399f;
            ArrayList arrayList3 = null;
            f fVar = eVar.f130398e;
            if (i2 == 0) {
                if (!(fVar == null || (a3 = fVar.a()) == null)) {
                    list = a3.f130349a;
                }
                list = null;
            } else {
                if (!(fVar == null || (a2 = fVar.a()) == null)) {
                    list = a2.f130351c;
                }
                list = null;
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) list) && !com.bytedance.common.utility.collection.b.a((Collection) users)) {
                if (users != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (T t : users) {
                        T t2 = t;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (TextUtils.equals(t2.getUid(), next.getUid())) {
                                    if (next != null) {
                                        arrayList4.add(t);
                                    }
                                }
                            }
                        }
                    }
                    arrayList2 = arrayList4;
                    arrayList3 = new ArrayList(users);
                } else {
                    arrayList2 = h.a.z.INSTANCE;
                }
                if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList2) && arrayList3 != null) {
                    arrayList3.removeAll(arrayList2);
                }
                users = arrayList3;
            }
            this.f130400a.f130397d.b(users, pollDetailResponse2.getHasMore());
            e eVar2 = this.f130400a;
            if (users != null) {
                arrayList = new ArrayList(users);
            }
            eVar2.a(arrayList, this.f130400a.f130396c, true);
        }
    }

    public static final class b implements z<PollDetailResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f130401a;

        static {
            Covode.recordClassIndex(85521);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f130401a = eVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f130401a.f130397d.b(new Exception(th));
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f130401a.f130395b.a(bVar);
            this.f130401a.f130397d.b();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(PollDetailResponse pollDetailResponse) {
            ArrayList arrayList;
            PollDetailResponse pollDetailResponse2 = pollDetailResponse;
            l.d(pollDetailResponse2, "");
            this.f130401a.a(new d(pollDetailResponse2.getOffset(), pollDetailResponse2.getHasMore()));
            if (com.bytedance.common.utility.collection.b.a((Collection) pollDetailResponse2.getUsers())) {
                this.f130401a.f130397d.f();
                return;
            }
            this.f130401a.f130397d.a(pollDetailResponse2.getUsers(), pollDetailResponse2.getHasMore());
            e eVar = this.f130401a;
            if (pollDetailResponse2.getUsers() == null) {
                arrayList = new ArrayList();
            } else {
                List<User> users = pollDetailResponse2.getUsers();
                if (users == null) {
                    l.b();
                }
                arrayList = new ArrayList(users);
            }
            eVar.a(arrayList, this.f130401a.f130396c, false);
        }
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f130396c = dVar;
    }

    public final void a(long j2, long j3) {
        this.f130394a.getPollDetail(j2, j3, 0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this));
    }

    public e(c<User> cVar, f fVar, int i2) {
        l.d(cVar, "");
        this.f130397d = cVar;
        this.f130398e = fVar;
        this.f130399f = i2;
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(PollDetailApi.class);
        l.b(create, "");
        this.f130394a = (PollDetailApi) create;
    }

    public final void a(List<User> list, d dVar, boolean z) {
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e eVar;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e eVar2;
        if (z) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                f fVar = this.f130398e;
                if (fVar == null || (eVar2 = fVar.a()) == null) {
                    eVar2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e();
                }
                if (this.f130399f == 0) {
                    if (eVar2.f130349a == null) {
                        eVar2.f130349a = new ArrayList();
                    }
                    List<User> list2 = eVar2.f130349a;
                    if (list2 != null) {
                        list2.addAll(list);
                    }
                    eVar2.a(dVar);
                } else {
                    if (eVar2.f130351c == null) {
                        eVar2.f130351c = new ArrayList();
                    }
                    List<User> list3 = eVar2.f130351c;
                    if (list3 != null) {
                        list3.addAll(list);
                    }
                    eVar2.b(dVar);
                }
                f fVar2 = this.f130398e;
                if (fVar2 != null) {
                    fVar2.a(eVar2);
                }
            }
        } else if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            f fVar3 = this.f130398e;
            if (fVar3 == null || (eVar = fVar3.a()) == null) {
                eVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e();
            }
            if (this.f130399f == 0) {
                eVar.f130349a = list;
                eVar.a(dVar);
            } else {
                eVar.f130351c = list;
                eVar.b(dVar);
            }
            f fVar4 = this.f130398e;
            if (fVar4 != null) {
                fVar4.a(eVar);
            }
        }
    }
}
