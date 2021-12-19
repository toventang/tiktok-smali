package com.ss.android.ugc.aweme.bridge;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.g;
import com.ss.android.ugc.aweme.utils.in;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class GetContactMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f68765c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public k.b f68766b;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<f.a.b.b> f68767d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final String f68768e = "getContacts";

    static {
        Covode.recordClassIndex(42348);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42349);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68768e;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        for (T t : this.f68767d) {
            if (t != null && !t.isDisposed()) {
                t.dispose();
            }
        }
        this.f68767d.clear();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        k.b bVar = this.f68766b;
        if (bVar != null && FriendsServiceImpl.s().d().b()) {
            ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(e(), com.ss.android.ugc.aweme.friends.a.class)).a(false);
            Context e2 = e();
            if (e2 == null) {
                l.b();
            }
            a(e2, bVar);
        }
        this.f68766b = null;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b f68771a;

        static {
            Covode.recordClassIndex(42351);
        }

        c(k.b bVar) {
            this.f68771a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.a(this.f68771a, (Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GetContactMethod f68769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k.b f68770b;

        static {
            Covode.recordClassIndex(42350);
        }

        b(GetContactMethod getContactMethod, k.b bVar) {
            this.f68769a = getContactMethod;
            this.f68770b = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            UploadContactsResult uploadContactsResult = (UploadContactsResult) obj;
            k.b bVar = this.f68770b;
            l.b(uploadContactsResult, "");
            a.a(bVar, GetContactMethod.a(true, (List<? extends User>) uploadContactsResult.users));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetContactMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GetContactMethod f68772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k.b f68773b;

        static {
            Covode.recordClassIndex(42352);
        }

        d(GetContactMethod getContactMethod, k.b bVar) {
            this.f68772a = getContactMethod;
            this.f68773b = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) {
                if (dVar.f141690b.f141691a) {
                    this.f68772a.a(this.f68773b);
                } else if (dVar.f141690b.f141693c == 1) {
                    this.f68772a.f68766b = this.f68773b;
                } else {
                    a.a(this.f68773b, GetContactMethod.a(false, (List<? extends User>) null));
                }
            } else if (dVar.f141689a != g.SYNC_STATUS || !dVar.f141690b.f141691a) {
                a.a(this.f68773b, (Throwable) null);
            } else {
                this.f68772a.a(this.f68773b);
            }
        }
    }

    public final void a(k.b bVar) {
        this.f68767d.add(FriendsServiceImpl.s().b(1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new b(this, bVar), new c(bVar)));
    }

    private final void a(Context context, k.b bVar) {
        Class<? extends com.ss.android.ugc.aweme.ufr.a> c2 = FriendsServiceImpl.s().c();
        User c3 = in.c();
        l.b(c3, "");
        this.f68767d.add(com.ss.android.ugc.aweme.ufr.b.a(context, c2, c3.getUid(), "enter_from", "enter_method", true, false, null).d(new d(this, bVar)));
    }

    public static JSONObject a(boolean z, List<? extends User> list) {
        boolean z2;
        String str;
        JSONObject put = new JSONObject().put("hasPermission", z);
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            put.put("contacts", new JSONArray());
        } else {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                JSONObject put2 = new JSONObject().put("uid", t.getUid()).put("secUid", t.getSecUid()).put("uniqueId", t.getUniqueId()).put("username", t.getUserDisplayName());
                UrlModel avatarThumb = t.getAvatarThumb();
                l.b(avatarThumb, "");
                List<String> urlList = avatarThumb.getUrlList();
                l.b(urlList, "");
                if (n.a((List) urlList) >= 0) {
                    str = urlList.get(0);
                } else {
                    str = "";
                }
                arrayList.add(put2.put("avatarUrl", str).put("relation", t.getFollowStatus()));
            }
            put.put("contacts", JSONObject.wrap(arrayList));
        }
        l.b(put, "");
        return put;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        l.d(jSONObject, "");
        l.d(bVar, "");
        Context e2 = e();
        if (e2 != null) {
            if (FriendsServiceImpl.s().d().c()) {
                a(bVar);
                return;
            }
            for (T t : this.f68767d) {
                if (t != null && !t.isDisposed()) {
                    t.dispose();
                }
            }
            this.f68767d.clear();
            a(e2, bVar);
        }
    }
}
