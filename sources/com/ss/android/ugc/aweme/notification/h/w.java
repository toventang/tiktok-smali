package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.e;
import com.ss.android.ugc.aweme.story.avatar.o;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class w extends p {
    public static final com.ss.android.ugc.aweme.story.avatar.c s = g.f137757a.d();
    public static final h t = i.a((h.f.a.a) b.f113734a);
    public static final a u = new a((byte) 0);

    /* renamed from: a */
    private final h f113733a = i.a((h.f.a.a) new d(this));
    public final StoryBrandView q;
    public c r;

    public static final class c extends Enum<c> {
        public static final c FOLLOW_REQUEST;
        public static final c INBOX;

        /* renamed from: a */
        private static final /* synthetic */ c[] f113735a;

        static {
            Covode.recordClassIndex(73110);
            b bVar = new b("INBOX");
            INBOX = bVar;
            a aVar = new a("FOLLOW_REQUEST");
            FOLLOW_REQUEST = aVar;
            f113735a = new c[]{bVar, aVar};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f113735a.clone();
        }

        public abstract String getEnterFrom();

        static final class a extends c {
            private final String enterFrom = "follow_request";

            static {
                Covode.recordClassIndex(73111);
            }

            @Override // com.ss.android.ugc.aweme.notification.h.w.c
            public final String getEnterFrom() {
                return this.enterFrom;
            }

            a(String str) {
                super(str, 1, null);
            }
        }

        static final class b extends c {
            private final String enterFrom = "notification_page";

            static {
                Covode.recordClassIndex(73112);
            }

            @Override // com.ss.android.ugc.aweme.notification.h.w.c
            public final String getEnterFrom() {
                return this.enterFrom;
            }

            b(String str) {
                super(str, 0, null);
            }
        }

        private c(String str, int i2) {
            super(str, i2);
        }

        public /* synthetic */ c(String str, int i2, h.f.b.g gVar) {
            this(str, i2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract User c();

    public static final class a {
        static {
            Covode.recordClassIndex(73108);
        }

        public static Map<c, Set<String>> a() {
            return (Map) w.t.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(c cVar) {
            l.d(cVar, "");
            com.ss.android.ugc.aweme.story.avatar.c cVar2 = w.s;
            if (cVar2 != null && cVar2.a()) {
                a().put(cVar, new LinkedHashSet());
            }
        }
    }

    static final class b extends m implements h.f.a.a<Map<c, Set<String>>> {

        /* renamed from: a */
        public static final b f113734a = new b();

        static {
            Covode.recordClassIndex(73109);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Map<c, Set<String>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(73107);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.avatar.d> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(73113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.avatar.d invoke() {
            com.ss.android.ugc.aweme.story.avatar.c d2;
            Context context = this.this$0.f113647i;
            if (!(context instanceof androidx.appcompat.app.d)) {
                context = null;
            }
            final androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) context;
            if (dVar == null || (d2 = g.f137757a.d()) == null) {
                return null;
            }
            return d2.a(new e(this) {
                /* class com.ss.android.ugc.aweme.notification.h.w.d.AnonymousClass1 */

                /* renamed from: a */
                final /* synthetic */ d f113736a;

                static {
                    Covode.recordClassIndex(73114);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final boolean d() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                    return dVar;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final o c() {
                    return o.INBOX;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final StoryBrandView a() {
                    return this.f113736a.this$0.q;
                }

                {
                    this.f113736a = r1;
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.h
                public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                    l.d(aVar, "");
                    e.a.a(aVar);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.e
                public final void a(SmartRoute smartRoute, Aweme aweme) {
                    String str;
                    l.d(smartRoute, "");
                    l.d(aweme, "");
                    c cVar = this.f113736a.this$0.r;
                    if (cVar != null) {
                        str = cVar.getEnterFrom();
                    } else {
                        str = null;
                    }
                    smartRoute.withParam("enter_from", str);
                }

                @Override // com.ss.android.ugc.aweme.story.avatar.g
                public final boolean a(String str, HashMap<String, String> hashMap) {
                    String str2;
                    l.d(str, "");
                    l.d(hashMap, "");
                    c cVar = this.f113736a.this$0.r;
                    if (cVar == null) {
                        return false;
                    }
                    if (l.a((Object) str, (Object) "story_show")) {
                        w wVar = this.f113736a.this$0;
                        BaseNotice baseNotice = wVar.f113648j;
                        if (baseNotice == null || (str2 = baseNotice.nid) == null) {
                            str2 = String.valueOf(wVar.getAdapterPosition());
                        }
                        Set<String> set = a.a().get(cVar);
                        if (set == null || set.contains(str2)) {
                            return false;
                        }
                        set.add(str2);
                    }
                    hashMap.put("enter_from", cVar.getEnterFrom());
                    return true;
                }
            });
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.r = cVar;
    }

    public final void a(boolean z) {
        User user;
        if (z) {
            user = c();
        } else {
            user = null;
        }
        com.ss.android.ugc.aweme.story.avatar.d dVar = (com.ss.android.ugc.aweme.story.avatar.d) this.f113733a.getValue();
        if (dVar != null) {
            dVar.a(user, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cx9);
        l.b(findViewById, "");
        this.q = (StoryBrandView) findViewById;
    }
}
