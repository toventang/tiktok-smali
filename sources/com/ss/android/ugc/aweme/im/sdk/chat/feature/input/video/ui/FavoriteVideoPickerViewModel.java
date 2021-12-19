package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.aa;
import f.a.d.f;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FavoriteVideoPickerViewModel extends ac {

    /* renamed from: h  reason: collision with root package name */
    public static final a f100795h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f100796a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f100797b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<Aweme>> f100798c;

    /* renamed from: d  reason: collision with root package name */
    final t<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a> f100799d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Aweme> f100800e;

    /* renamed from: f  reason: collision with root package name */
    final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.c<Aweme>> f100801f;

    /* renamed from: g  reason: collision with root package name */
    final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.c<Aweme>> f100802g;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f100803i;

    /* renamed from: j  reason: collision with root package name */
    private final FavoriteAwemeService f100804j;

    /* renamed from: k  reason: collision with root package name */
    private final aa f100805k;

    /* renamed from: l  reason: collision with root package name */
    private final aa f100806l;

    /* renamed from: m  reason: collision with root package name */
    private final User f100807m;

    static {
        Covode.recordClassIndex(64490);
    }

    public FavoriteVideoPickerViewModel() {
        this((byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64491);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f100803i.a();
    }

    private final void b() {
        int i2;
        String str;
        FavoriteAwemeService favoriteAwemeService = this.f100804j;
        List<Aweme> value = this.f100798c.getValue();
        if (value != null) {
            i2 = value.size();
        } else {
            i2 = 30;
        }
        User user = this.f100807m;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.f100807m;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.f100803i.a(favoriteAwemeService.getFavoriteAweme(i2, str, str2, 0).b(this.f100806l).a(this.f100805k).b(new d(this)));
    }

    public final void a() {
        String str;
        FavoriteAwemeService favoriteAwemeService = this.f100804j;
        User user = this.f100807m;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.f100807m;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.f100803i.a(favoriteAwemeService.getFavoriteAweme(30, str, str2, (long) (this.f100796a * 30)).b(this.f100806l).a(this.f100805k).a(new b(this)).b(new c(this)));
    }

    public final void a(Aweme aweme) {
        this.f100800e.setValue(aweme);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FavoriteVideoPickerViewModel f100808a;

        static {
            Covode.recordClassIndex(64492);
        }

        b(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f100808a = favoriteVideoPickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f100808a.f100797b.setValue(true);
        }
    }

    public final void b(Aweme aweme) {
        if (aweme != null) {
            this.f100799d.setValue(new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.a.a(aweme, b.c.a.f100827b));
        } else {
            b();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ FavoriteVideoPickerViewModel(byte r6) {
        /*
            r5 = this;
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.a()
            java.lang.String r0 = com.ss.android.c.b.f59141e
            com.bytedance.ies.ugc.aweme.network.f r1 = r1.a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService> r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService.class
            java.lang.Object r4 = r1.a(r0)
            java.lang.String r3 = ""
            h.f.b.l.b(r4, r3)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService) r4
            f.a.aa r0 = f.a.a.b.a.f157156a
            f.a.aa r2 = f.a.a.a.a.a(r0)
            h.f.b.l.b(r2, r3)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r1 = f.a.h.a.b(r0)
            h.f.b.l.b(r1, r3)
            com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d()
            r5.<init>(r4, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel.<init>(byte):void");
    }

    static final class c<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FavoriteVideoPickerViewModel f100809a;

        static {
            Covode.recordClassIndex(64493);
        }

        c(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f100809a = favoriteVideoPickerViewModel;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            FeedItemList feedItemList = (FeedItemList) obj;
            this.f100809a.f100797b.setValue(false);
            if (feedItemList != null) {
                this.f100809a.f100796a++;
                if (feedItemList.hasMore == 0) {
                    this.f100809a.f100796a = -1;
                }
                ArrayList arrayList = new ArrayList();
                List<Aweme> value = this.f100809a.f100798c.getValue();
                if (value == null) {
                    l.b();
                }
                arrayList.addAll(value);
                List<Aweme> items = feedItemList.getItems();
                if (items != null) {
                    arrayList.addAll(items);
                }
                this.f100809a.f100798c.setValue(arrayList);
                if (this.f100809a.f100796a == 1) {
                    this.f100809a.f100800e.setValue(null);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FavoriteVideoPickerViewModel f100810a;

        static {
            Covode.recordClassIndex(64494);
        }

        d(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
            this.f100810a = favoriteVideoPickerViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            String str;
            FeedItemList feedItemList = (FeedItemList) obj;
            if (feedItemList != null) {
                ArrayList arrayList = new ArrayList();
                List<Aweme> items = feedItemList.getItems();
                if (items != null) {
                    arrayList.addAll(items);
                }
                this.f100810a.f100798c.setValue(arrayList);
                Iterator it = arrayList.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String aid = ((Aweme) next).getAid();
                    Aweme value = this.f100810a.f100800e.getValue();
                    if (value != null) {
                        str = value.getAid();
                    }
                    if (l.a((Object) aid, (Object) str)) {
                        str = next;
                        break;
                    }
                }
                this.f100810a.f100800e.setValue(str);
            }
        }
    }

    private FavoriteVideoPickerViewModel(FavoriteAwemeService favoriteAwemeService, aa aaVar, aa aaVar2, User user) {
        l.d(favoriteAwemeService, "");
        l.d(aaVar, "");
        l.d(aaVar2, "");
        this.f100804j = favoriteAwemeService;
        this.f100805k = aaVar;
        this.f100806l = aaVar2;
        this.f100807m = user;
        this.f100797b = new t<>();
        t<List<Aweme>> tVar = new t<>();
        tVar.setValue(z.INSTANCE);
        this.f100798c = tVar;
        this.f100799d = new t<>();
        this.f100800e = new t<>();
        this.f100801f = new t<>();
        this.f100802g = new t<>();
        this.f100803i = new f.a.b.a();
    }
}
