package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.h;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.i;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class a<MESSAGE extends com.bytedance.android.livesdk.ac.b.a> extends k<MESSAGE> {

    /* renamed from: e  reason: collision with root package name */
    public final Handler f12415e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public final List<com.bytedance.android.live.publicscreen.impl.model.chat.badge.b> f12416f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f12417g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f12418h;

    /* renamed from: i  reason: collision with root package name */
    private final List<i> f12419i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private long f12420j;

    static {
        Covode.recordClassIndex(6821);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public boolean B() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h
    public final boolean n() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h
    public final long p() {
        return this.f12420j;
    }

    private final CharSequence s() {
        return g.a(b());
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.d
    public void e() {
        super.e();
        Iterator<T> it = this.f12419i.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        this.f12417g = false;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f12423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.publicscreen.a.g f12424c;

        static {
            Covode.recordClassIndex(6823);
        }

        b(a aVar, z.c cVar, com.bytedance.android.live.publicscreen.a.g gVar) {
            this.f12422a = aVar;
            this.f12423b = cVar;
            this.f12424c = gVar;
        }

        public final void run() {
            if (!this.f12422a.f12417g) {
                b.a.a("livesdk_privilege_badge_show").a(this.f12424c.f12208l).a("request_id", e.k()).a("show_entrance", "comment_area").b();
                this.f12422a.f12417g = true;
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final ImageModel J() {
        ImageModel avatarThumb;
        List<String> urls;
        User b2;
        User b3 = b();
        if (b3 == null || (avatarThumb = b3.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty() || (b2 = b()) == null) {
            return null;
        }
        return b2.getAvatarThumb();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h
    public void r() {
        super.r();
        this.f12416f.clear();
        Iterator<T> it = this.f12419i.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        this.f12419i.clear();
    }

    public final CharSequence v() {
        String valueOf;
        String str;
        String str2;
        if (TextUtils.isEmpty(this.f12418h)) {
            CharSequence s = s();
            this.f12418h = s;
            if (TextUtils.isEmpty(s)) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                HashMap hashMap = new HashMap();
                if (this.f12190d.O == null) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(this.f12190d.O.f23212d);
                }
                hashMap.put("message_id", valueOf);
                if (b() == null) {
                    hashMap.put("reason", "User is null.");
                } else if (room == null) {
                    hashMap.put("reason", "Room is null.");
                } else {
                    long ownerUserId = room.getOwnerUserId();
                    User b2 = b();
                    String str3 = null;
                    if (b2 != null && ownerUserId == b2.getId()) {
                        User b3 = b();
                        if (b3 != null) {
                            str2 = b3.getDisplayId();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            hashMap.put("reason", "User is anchor, but displayId is empty.");
                        }
                    }
                    if (room.getNameMode() == 1) {
                        User b4 = b();
                        if (b4 != null) {
                            str = b4.getNickName();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            hashMap.put("reason", "User is audience and display nickname, but nickname is empty.");
                        }
                    }
                    User b5 = b();
                    if (b5 != null) {
                        str3 = b5.getDisplayId();
                    }
                    if (TextUtils.isEmpty(str3)) {
                        hashMap.put("reason", "User is audience, but displayId is empty.");
                    }
                }
                com.bytedance.android.livesdk.ab.i.b().b("ttlive_text_message_not_display_name", hashMap);
            }
        }
        return this.f12418h;
    }

    private void b(i iVar) {
        l.d(iVar, "");
        this.f12419i.add(iVar);
        iVar.e();
    }

    /* access modifiers changed from: protected */
    public final void a(i iVar) {
        l.d(iVar, "");
        a((com.bytedance.android.live.publicscreen.impl.model.chat.badge.b) iVar);
        this.f12419i.remove(iVar);
    }

    static final /* synthetic */ class c extends j implements h.f.a.b<i, h.z> {
        static {
            Covode.recordClassIndex(6824);
        }

        c(a aVar) {
            super(1, aVar, a.class, "updateBadge", "updateBadge(Lcom/bytedance/android/live/publicscreen/impl/model/chat/badge/PendingBadgeHolder;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            ((a) this.receiver).a(iVar2);
            return h.z.f158842a;
        }
    }

    static final /* synthetic */ class d extends j implements h.f.a.b<i, h.z> {
        static {
            Covode.recordClassIndex(6825);
        }

        d(a aVar) {
            super(1, aVar, a.class, "updateBadge", "updateBadge(Lcom/bytedance/android/live/publicscreen/impl/model/chat/badge/PendingBadgeHolder;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            ((a) this.receiver).a(iVar2);
            return h.z.f158842a;
        }
    }

    private void a(com.bytedance.android.live.publicscreen.impl.model.chat.badge.b bVar) {
        l.d(bVar, "");
        List<com.bytedance.android.live.publicscreen.impl.model.chat.badge.b> list = this.f12416f;
        list.add(bVar);
        n.a((List) list, (Comparator) C0260a.f12421a);
        com.bytedance.android.live.publicscreen.a.g A = A();
        if (A != null) {
            A.a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(MESSAGE message) {
        super(message);
        l.d(message, "");
        ImageModel J = J();
        if (J != null) {
            com.bytedance.android.live.core.f.k.a(J);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.g
    public void b(com.bytedance.android.live.publicscreen.a.g gVar) {
        boolean z;
        boolean z2;
        User user;
        FollowInfo followInfo;
        List<ImageModel> badgeImageList;
        List<ImageModel> g2;
        User b2;
        FollowInfo followInfo2;
        List<ImageModel> badgeImageList2;
        List<ImageModel> g3;
        l.d(gVar, "");
        super.b(gVar);
        this.f12418h = null;
        int d2 = gVar.n.d();
        if (gVar.n.e() && gVar.n.c() && d2 > 0 && !i()) {
            this.f12420j = SystemClock.uptimeMillis() + ((long) d2);
        }
        User b3 = b();
        boolean z3 = true;
        if (b3 == null || (badgeImageList2 = b3.getBadgeImageList()) == null || (g3 = n.g((Iterable) badgeImageList2)) == null) {
            z = false;
            z2 = false;
        } else {
            z = false;
            z2 = false;
            for (ImageModel imageModel : g3) {
                int imageType = imageModel.getImageType();
                if (imageType == 3) {
                    z2 = true;
                } else if (imageType == 26) {
                    z = true;
                }
            }
        }
        if (!gVar.f12205i ? !i() || (user = gVar.f12207k) == null || (followInfo = user.getFollowInfo()) == null || followInfo.getFollowStatus() != 2 : (b2 = b()) == null || (followInfo2 = b2.getFollowInfo()) == null || followInfo2.getFollowStatus() != 2) {
            z3 = false;
        }
        if (z) {
            a(new com.bytedance.android.live.publicscreen.impl.model.chat.badge.d(gVar));
        }
        if (z2) {
            a(new com.bytedance.android.live.publicscreen.impl.model.chat.badge.g(gVar));
        }
        if (z3) {
            a(new com.bytedance.android.live.publicscreen.impl.model.chat.badge.e(gVar));
        }
        z.c cVar = new z.c();
        cVar.element = 7;
        User b4 = b();
        if (!(b4 == null || (badgeImageList = b4.getBadgeImageList()) == null || (g2 = n.g((Iterable) badgeImageList)) == null)) {
            for (ImageModel imageModel2 : g2) {
                if (imageModel2.getImageType() == 30) {
                    int i2 = cVar.element;
                    cVar.element = i2 - 1;
                    b(new com.bytedance.android.live.publicscreen.impl.model.chat.badge.j(i2, gVar, this.f12415e, imageModel2, new c(this), new b(this, cVar, gVar)));
                } else if (!(imageModel2.getImageType() == 26 || imageModel2.getImageType() == 3)) {
                    int i3 = cVar.element;
                    cVar.element = i3 - 1;
                    b(new h(i3, gVar, this.f12415e, imageModel2, new d(this)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.a$a  reason: collision with other inner class name */
    public static final class C0260a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final C0260a f12421a = new C0260a();

        static {
            Covode.recordClassIndex(6822);
        }

        C0260a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            com.bytedance.android.live.publicscreen.impl.model.chat.badge.b bVar = (com.bytedance.android.live.publicscreen.impl.model.chat.badge.b) obj;
            com.bytedance.android.live.publicscreen.impl.model.chat.badge.b bVar2 = (com.bytedance.android.live.publicscreen.impl.model.chat.badge.b) obj2;
            if (bVar.a() > bVar2.a()) {
                return -1;
            }
            if (bVar.a() < bVar2.a()) {
                return 1;
            }
            return 0;
        }
    }
}
